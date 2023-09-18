package com.example.androidprojcet_page124;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView cText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cText = (TextView) findViewById(R.id.textview);
    }

    public void onClick(View view){
        String str = cText.getText().toString();
        int id = view.getId();

        if(id==R.id.increase){
            int count = Integer.parseInt(str)+1;
            cText.setText(count+"");
        } else if(id==R.id.reduction){
            int count = Integer.parseInt(str)-1;
            cText.setText(count+"");
        }


    }
}