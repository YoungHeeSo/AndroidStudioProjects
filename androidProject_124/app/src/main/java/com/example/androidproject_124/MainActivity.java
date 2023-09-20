
package com.example.androidproject_124;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
        int count = Integer.parseInt(str);
        int id = view.getId();

        if(id==R.id.increase){
            count++;
            cText.setText(count+"");
        } else if(id==R.id.reduction){
            if(count<1) return;
            count--;
            cText.setText(count+"");

        }
    }
}