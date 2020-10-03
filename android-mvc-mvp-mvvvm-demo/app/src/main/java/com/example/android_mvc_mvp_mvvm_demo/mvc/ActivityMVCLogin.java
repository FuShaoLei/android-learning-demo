package com.example.android_mvc_mvp_mvvm_demo.mvc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.android_mvc_mvp_mvvm_demo.R;

public class ActivityMVCLogin extends AppCompatActivity {
    private EditText etUsername,etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_v_c_login); //view层

        initViews();
    }

    private void initViews() {
        etUsername = findViewById(R.id.et_mvc_username);
        etPassword = findViewById(R.id.et_mvc_password);

        btnLogin = findViewById(R.id.btn_mvc_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //数据的处理，这里是controller层和model层
                if ("root".equals(etUsername.getText().toString()) && "123".equals(etPassword.getText().toString())){
                    Toast.makeText(ActivityMVCLogin.this, "MVC Login Success !", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(ActivityMVCLogin.this, "MVC Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}