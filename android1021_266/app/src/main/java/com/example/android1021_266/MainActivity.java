package com.example.android1021_266;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onClick(View view) {
        Button loginBtn = (Button) findViewById(R.id.loginBtn);

        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.login_dialog);
        dialog.setTitle("로그인 화면");

        Button login = (Button) dialog.findViewById(R.id.login);
        Button close = (Button) dialog.findViewById(R.id.close);

        final EditText username = (EditText) dialog.findViewById(R.id.usrName);
        final EditText password = (EditText) dialog.findViewById(R.id.passwd);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().trim().length()>0){
                    if(password.getText().toString().trim().length()>0){
                        Toast.makeText(MainActivity.this, "로그인 성공", Toast.LENGTH_SHORT).show();
                        loginBtn.setText(username.getText()+" 님");
                        dialog.dismiss();
                    }
                }else {
                    Toast.makeText(MainActivity.this, "다시 입력해주세요", Toast.LENGTH_SHORT).show();
                }
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }
}