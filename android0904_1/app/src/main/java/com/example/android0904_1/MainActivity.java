package com.example.android0904_1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn2;
    TextView text1;
    EditText edit1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_2);

        edit1=(EditText) findViewById(R.id.editText);
        text1=(TextView) findViewById(R.id.text1);
        btn2=(Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText("버튼2을 누름");
                edit1.setText("버튼2을 누름");

            }
        });
    }

    public void onClick(View view){
        text1.setText("버튼1을 누름");
        Toast.makeText(getApplicationContext(), "버튼1이 눌림", Toast.LENGTH_LONG).show();
    }
}