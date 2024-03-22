package com.example.account;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int PICK_IMAGE_REQUEST_CODE = 20;
    private Button btn_editpass,btn_luu;
    private EditText ed_name, ed_phone;
    private TextView ID_gmail;
    private Intent data;
    private ImageView img_avata;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_phone= findViewById(R.id.ed_phone);
        ed_name= findViewById(R.id.ed_name);
        btn_luu=findViewById(R.id.btn_luuacc);
        img_avata=findViewById(R.id.img_avata);
        btn_luu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=ed_name.getText().toString();
                String phone=ed_phone.getText().toString();
                if(phone.isEmpty()){

                }
            }
        });
        img_avata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pickImage();
            }
        });
        btn_editpass = findViewById(R.id.btn_editpass);
        btn_editpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Editpass.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                // Xử lý kết quả thành công từ màn hình Editpass
                // Ví dụ: Hiển thị thông báo hoặc cập nhật dữ liệu
            } else if (resultCode == RESULT_CANCELED) {
                // Xử lý kết quả khi người dùng không hoàn thành hoạt động
            }
        }
    }
    private void pickImage() {
        //Intent intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        // startActivityForResult(intent, PICK_IMAGE_REQUEST_CODE);
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        startActivityForResult(intent, PICK_IMAGE_REQUEST_CODE);
    }


}