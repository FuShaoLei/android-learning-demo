package com.example.android_mvc_mvp_mvvm_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android_mvc_mvp_mvvm_demo.mvc.ActivityMVCLogin;
import com.example.android_mvc_mvp_mvvm_demo.mvp.view.ActivityMVPLogin;

public class MainActivity extends AppCompatActivity {
    private Button btnToMVC,btnToMVP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        btnToMVC = findViewById(R.id.btn_to_mvc);
        btnToMVC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityMVCLogin.class));
            }
        });
        btnToMVP = findViewById(R.id.btn_to_mvp);
        btnToMVP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityMVPLogin.class));
            }
        });
    }
}