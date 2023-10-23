package com.example.moblietest_00_ost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
//    static final int GET_RESULT=1;

    Button loginbtn, intentbtn, campus;
    EditText usercode, username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbtn = (Button) findViewById(R.id.loginbtn);
        intentbtn = (Button) findViewById(R.id.intentbtn);
        campus = (Button) findViewById(R.id.campudbtn);

        usercode = (EditText) findViewById(R.id.usercode);
        username = (EditText) findViewById(R.id.username);


        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);

                intent.putExtra("usrCd", usercode.getText().toString());
                intent.putExtra("usrNm", username.getText().toString());
                startActivity(intent);
//                startActivityForResult(intent, GET_RESULT);
            }
        });

        intentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:36.4366, 126.802"));
                startActivity(intent);
            }
        });

        campus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CampusActivity.class);
                startActivity(intent);
            }
        });


    }


}