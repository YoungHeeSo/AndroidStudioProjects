package com.example.androidproject_125;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView roll;
    TextView num;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roll = (ImageView) findViewById(R.id.roll);
        num = (TextView) findViewById(R.id.textv);
        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            Random random = new Random();
            @Override
            public void onClick(View view) {
                int ran = random.nextInt(6);

                String s = ran+1+"";
                if (ran == 0) {
                    MainActivity.this.num.setText(s);
                    roll.setImageResource(R.drawable.one);
                } else if (ran == 1) {
                    MainActivity.this.num.setText(s);
                    roll.setImageResource(R.drawable.two);
                } else if (ran == 2) {
                    MainActivity.this.num.setText(s);
                    roll.setImageResource(R.drawable.three);
                } else if (ran == 3) {
                    MainActivity.this.num.setText(s);
                    roll.setImageResource(R.drawable.four);
                } else if (ran == 4) {
                    MainActivity.this.num.setText(s);
                    roll.setImageResource(R.drawable.five);
                } else if (ran == 5) {
                    MainActivity.this.num.setText(s);
                    roll.setImageResource(R.drawable.six);
                }
            }
        });

    }

//    public void onClick(View view){
//        int rollnum = (int)(Math.random()*50); // 0-5 사이 난수 생성
//
//        String ran = rollnum+1+"";
//        if (rollnum == 0) {
//            num.setText(ran);
//            roll.setImageResource(R.drawable.one);
//        } else if (rollnum == 1) {
//            num.setText(ran);
//            roll.setImageResource(R.drawable.two);
//        } else if (rollnum == 2) {
//            num.setText(ran);
//            roll.setImageResource(R.drawable.three);
//        } else if (rollnum == 3) {
//            num.setText(ran);
//            roll.setImageResource(R.drawable.four);
//        } else if (rollnum == 4) {
//            num.setText(ran);
//            roll.setImageResource(R.drawable.five);
//        } else if (rollnum == 5) {
//            num.setText(ran);
//            roll.setImageResource(R.drawable.six);
//        }
//    }
}