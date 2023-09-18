package com.example.android0918_1;

import static com.example.android0918_1.R.id.textview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView sunflower, gogh;
    TextView imgname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sunflower = (ImageView) findViewById(R.id.sunflower);
        gogh = (ImageView) findViewById(R.id.gogh);
        imgname = (TextView) findViewById(R.id.textview);
    }
    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        int id = view.getId();
        String str = imgname.getText().toString();

        if (id == R.id.check1) {
            if (checked) {
                sunflower.setImageResource(R.drawable.sunflower);
                imgname.setText(str+" sunflower 선택");
            }
            else sunflower.setImageResource(0);
        } else if (id == R.id.check2) {
            if (checked) {
                gogh.setImageResource(R.drawable.gogh);
                imgname.setText(str+" gogh 선택");
            }
            else gogh.setImageResource(0);
        }
    }
}