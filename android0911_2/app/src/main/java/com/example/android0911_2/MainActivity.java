package com.example.android0911_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView blueview, yelloview, greenview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.framelayout);

        blueview =(TextView) findViewById(R.id.blueView);
        yelloview =(TextView) findViewById(R.id.yellowView);
        greenview =(TextView) findViewById(R.id.greenView);

    }

    public void onClick(View view){
        blueview.setVisibility(View.INVISIBLE);
        yelloview.setVisibility(View.INVISIBLE);
        greenview.setVisibility(View.INVISIBLE);

        int id = view.getId();
        if (id == R.id.btn1) {
            blueview.setVisibility(View.VISIBLE);
        } else if (id == R.id.btn2) {
            yelloview.setVisibility(View.VISIBLE);
        } else if (id == R.id.btn3) {
            greenview.setVisibility(View.VISIBLE);
        }
    }
}