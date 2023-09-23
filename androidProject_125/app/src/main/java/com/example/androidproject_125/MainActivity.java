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
        num = (TextView) findViewById(R.id.textv);
    }

    public void onClick(View view){
        int rollnum = (int)(Math.random()*50);
        String ran = rollnum+"";
        int Id = view.getId();
        switch (rollnum){
            case 1:
                num.setText(ran);
                roll.setImageResource(R.drawable.one);
                break;
            case 2:
                num.setText(ran);
                roll.setImageResource(R.drawable.two);
                break;
            case 3:
                num.setText(ran);
                roll.setImageResource(R.drawable.three);
                break;
            case 4:
                num.setText(ran);
                roll.setImageResource(R.drawable.four);
                break;
            case 5:
                num.setText(ran);
                roll.setImageResource(R.drawable.five);
                break;
            case 6:
                num.setText(ran);
                roll.setImageResource(R.drawable.six);
                break;
        }
    }
}