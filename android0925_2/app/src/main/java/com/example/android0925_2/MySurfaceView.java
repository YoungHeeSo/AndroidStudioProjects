package com.example.android0925_2;

import static kotlin.concurrent.ThreadsKt.thread;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;

import java.util.Random;

class Ball{
    int x, y, xInc=1, yInc=1;
    int diameter;
    static int WIDTH=1080, HEIGHT=1920;

    Random ran = new Random();

    public Ball(int d){
        this.diameter=d;

//        좌표(난수)
        x=ran.nextInt((WIDTH-d)+3);
        y=ran.nextInt((HEIGHT-d)+3);
//        x=(int)(Math.random() * (WIDTH-d)+3);
//        y=(int)(Math.random() * (HEIGHT-d)+3);

        // 속도
        xInc= ran.nextInt(100+1);
        yInc= ran.nextInt(100+1);
//        xInc = (int)(Math.random()*100+1);
//        yInc = (int)(Math.random()*100+1);
    }

    public void paint(Canvas g){
        Paint pain = new Paint();

        if(x<0||x>(WIDTH-diameter))
            xInc = -xInc;
        if(y<0||y>(HEIGHT-diameter))
            yInc = -yInc;

        x += xInc;
        y += yInc;

        pain.setColor(Color.RED);
        g.drawCircle(x, y, diameter, pain);

    }

}

public class MySurfaceView extends SurfaceView implements SurfaceHolder.Callback {

    public Ball basket[] = new Ball[40];
    private MyThread thread;

    public MyThread getThread() {
        return thread;
    }

    public MySurfaceView(Context context) {
        super(context);

        SurfaceHolder holder = getHolder();
        holder.addCallback(this);

        thread = new MyThread(holder);

        // basket의 길이만큼 반복(public Ball basket[] = new Ball[10])
        for(int i=0; i<basket.length; i++) basket[i]=new Ball(30); //new Ball(공 크기)
    }

    @Override
    public void surfaceCreated(@NonNull SurfaceHolder holder) {
        thread.setRunning(true);
        thread.start();
    }

    public void surfaceDestroyed(SurfaceHolder holder){
        boolean retry = true;

        thread.setRunning(false);

        while (retry){
            try {
                thread.join();
                retry = false;
            }catch (InterruptedException e){

            }
        }
    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

    }

    public class MyThread extends Thread{
        private boolean mRun = false;
        private SurfaceHolder mSurfaceHolder;

        public MyThread(SurfaceHolder surfaceHolder){
            mSurfaceHolder = surfaceHolder;
        }

        @Override
        public void run() {
            while (mRun) {
                Canvas c = null;
                try {
                    c = mSurfaceHolder.lockCanvas(null);
                    c.drawColor(Color.BLACK);
                    synchronized (mSurfaceHolder) {
                        for (Ball b : basket) {
                            b.paint(c);
                        }
                    }
                } finally {
                    if (c != null) {
                        mSurfaceHolder.unlockCanvasAndPost(c);
                    }
                }
            }
        }

        public void setRunning(boolean b) {
            mRun = b;
        }
    }

}
