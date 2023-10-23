package com.example.moblietest_00_ost;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CampusActivity extends AppCompatActivity {

    protected class myview extends View {
        int x =100,y=100;

        public myview(Context context){
            super(context);
            setContentView(R.layout.campus_layout);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Paint paint = new Paint();
            paint.setColor(Color.BLUE);
            canvas.drawCircle(x, y, 100, paint);
        }

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x=(int) event.getX();
        int y=(int) event.getY();

        if(event.getAction() == MotionEvent.ACTION_UP){

        }

        return super.onTouchEvent(event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myview mv = new myview(this);
        setContentView(mv);
    }
}
