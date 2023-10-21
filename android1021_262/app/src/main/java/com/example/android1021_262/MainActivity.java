package com.example.android1021_262;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void open(View v){
        AlertDialog.Builder payment = new AlertDialog.Builder(this);
        payment.setMessage("결제 할까요?");

        payment.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface_yes, int y) {
                Toast.makeText(MainActivity.this, "결제가 완료 되었습니다", Toast.LENGTH_SHORT).show();
            }
        });

        payment.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface_no, int n) {
                Toast.makeText(MainActivity.this, "결제가 취소 되었습니다", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        AlertDialog alertDialog = payment.create();
        alertDialog.show();
    }

}