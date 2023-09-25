package com.example.android0925_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

class MyView extends View {
    public MyView(Context context){
        super(context);
        setBackgroundColor(Color.BLUE);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint = new Paint();

        Matrix m = new Matrix();
        m.preScale(-1, 1);

        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.starisligth);
        Bitmap mb = Bitmap.createBitmap(b, 0,0, b.getWidth(), b.getHeight(), m, false);
        Bitmap sb = Bitmap.createScaledBitmap(b, b.getWidth(), b.getHeight(), false);

        canvas.drawBitmap(mb,0,0,null);
        canvas.drawBitmap(sb, 0, 700, null);
    }
}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyView w = new MyView(this);
        setContentView(w);

    }
}