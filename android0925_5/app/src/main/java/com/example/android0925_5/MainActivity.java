package com.example.android0925_5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("결제 하시겠습니까?");
        builder.setPositiveButton("yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "결제가 완료되었습니다",
                                Toast.LENGTH_LONG).show();
                    }
                });

        builder.setNegativeButton("no",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "결제가 취소되었습니다",
                                Toast.LENGTH_LONG).show();
                    }
                });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}