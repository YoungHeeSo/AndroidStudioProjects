package com.example.android0904_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android0904_2.R;

public class MainActivity extends AppCompatActivity {

    EditText edit;
    Button btn;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit=(EditText) findViewById(R.id.edit);
        btn=(Button) findViewById(R.id.button);
        text=(TextView) findViewById(R.id.text);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(edit.getText().toString());
            }
        });
    }
}