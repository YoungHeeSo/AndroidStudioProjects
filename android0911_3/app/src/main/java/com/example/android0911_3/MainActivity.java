package com.example.android0911_3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout1 = (LinearLayout) findViewById(R.id.layout);

//        LinearLayout container = new LinearLayout(this);
//        container.setOrientation(container.VERTICAL);
//
//        Button btn1 = new Button(this);
//        btn1.setText("BUTTON 1");
//        container.addView(btn1);
//
//        Button btn2 = new Button(this);
//        btn2.setText("BUTTON 2");
//        container.addView(btn2);
//
//        setContentView(container);
//
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                btn1.setText("클릭됨");
//            }
//        });
    }
    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

//        switch (view.getId()){
//            case R.id.red_radio:
//                if(checked)
//                    layout1.setBackgroundColor(Color.RED);
//                break;
//            case R.id.blue_radio:
//                if(checked)
//                    layout1.setBackgroundColor(Color.BLUE);
//                break;
//
//        }

        int id = view.getId();
        if (id == R.id.red_radio) {
            if (checked)
                layout1.setBackgroundColor(Color.RED);
        } else if (id == R.id.blue_radio) {
            if (checked)
                layout1.setBackgroundColor(Color.BLUE);
        }


    }
}