package com.example.android0911_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2;
    ImageView imgview;

    TextView text;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 =(Button) findViewById(R.id.button1);
        btn2=(Button) findViewById(R.id.button2);
        text=(TextView) findViewById(R.id.textview);
        int click=0;

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgview.setImageResource(R.drawable.sunflower);
                text.setText("해바라기");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                imgview.setId("d");
                imgview.setImageResource(R.drawable.gogh);
                text.setText("고흐");
//                if(imgview.getId()==R.drawable.gogh){
//                    imgview.setImageResource(R.drawable.starisligth);
//                }
            }
        });


        imgview=(ImageView) findViewById(R.id.imageview);




    }
}