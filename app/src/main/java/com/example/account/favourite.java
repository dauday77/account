package com.example.account;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class favourite extends AppCompatActivity {
    private com.google.android.material.floatingactionbutton.FloatingActionButton btn_back;

    private EditText ed_mkmoi,ed_snmkmoi;

    private  Button btn_xacnhan,btn_back1;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);
        ed_mkmoi= findViewById(R.id.ed_mkmoi);
        ed_snmkmoi= findViewById(R.id.ed_snmkmoi);
        btn_back = findViewById(R.id.btn_Backedit);
        btn_xacnhan= findViewById(R.id.btn_btn_luumk);

        btn_back1= findViewById(R.id.btn_back1);
        btn_back1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(favourite.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(favourite.this, "nhu c", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(favourite.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
       btn_xacnhan.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String passcheck =ed_snmkmoi.getText().toString();
               String pass= ed_mkmoi.getText().toString();
               if (pass.isEmpty()) {
                   Toast.makeText(favourite.this, "Bạn chưa nhập mật khẩu mới", Toast.LENGTH_SHORT).show();
                   return;
               }
               if (passcheck.isEmpty()&& pass!=passcheck) {
                   Toast.makeText(favourite.this, "Mật khẩu xác nhận chưa nhập hoặc không đúng", Toast.LENGTH_SHORT).show();
                   return;
               }
               Intent intent = new Intent(favourite.this,MainActivity.class);
               intent.putExtra("pass", pass);
               setResult(RESULT_OK, intent);
               finish();
           }
       });
    }


}