package com.example.android0918_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText eText;

//    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eText=(EditText) findViewById(R.id.editText);
    }

    public void onClick(View view){
        int id=view.getId();
        if(id==R.id.button){
            RadioButton celsiusButton = (RadioButton) findViewById(R.id.celsius);
            RadioButton fahrenheitButton = (RadioButton) findViewById(R.id.fahrenheit);

            if (eText.getText().length() == 0) {
                Toast.makeText(this, "정확한 값을 입력하시오", Toast.LENGTH_LONG).show();
                return;
            }

            float inputValue = Float.parseFloat(eText.getText().toString());
            if(celsiusButton.isChecked()){
                eText.setText(String.valueOf(convertFahrenheitToCelsius(inputValue)));
                Toast.makeText(this, "섭씨로 변환", Toast.LENGTH_LONG).show();
//                celsiusButton.setChecked(false);
//                fahrenheitButton.setChecked(true);
            }else{
                eText.setText(String.valueOf(convertFahrenheitToFahrenheit(inputValue)));
                Toast.makeText(this, "화씨로 변환", Toast.LENGTH_LONG).show();
//                fahrenheitButton.setChecked(false);
//                celsiusButton.setChecked(true);
            }
        }
    }

    private float convertFahrenheitToCelsius(float fahrenheit){
        return (float) ((fahrenheit-32)*5/9.0);
    }


    private float convertFahrenheitToFahrenheit(float celsius){
        return (float) (((celsius * 9) / 5) + 32.0);
    }
}