package com.example.androidproject_125;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView roll;
    TextView num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roll = (ImageView) findViewById(R.id.roll);
    }

    public void onClick(View view){
        int num = (int)(Math.random()*50);
        int Id = view.getId();
        switch (num){
            case 0:
                roll.setImageResource(R.drawable.one);
                break;
            case 1:
                roll.setImageResource(R.drawable.two);
                break;
            case 2:
                roll.setImageResource(R.drawable.three);
                break;
            case 3:
                roll.setImageResource(R.drawable.four);
                break;
            case 4:
                roll.setImageResource(R.drawable.five);
                break;
            case 5:
                roll.setImageResource(R.drawable.six);
                break;
        }
    }
}