package com.example.moblietest_00_ost;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    TextView usrinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calenderview);

        usrinfo = (TextView) findViewById(R.id.userinfo);

        Intent in = getIntent();
        usrinfo.setText(""+in.getStringExtra("usrCd")+"님"+"("+in.getStringExtra("usrNm")+")"+"\n"+"반갑습니다");
    }

}
