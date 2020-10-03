package com.example.android_mvc_mvp_mvvm_demo.mvp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.android_mvc_mvp_mvvm_demo.R;
import com.example.android_mvc_mvp_mvvm_demo.mvp.presenter.IPresenterMVPLogin;
import com.example.android_mvc_mvp_mvvm_demo.mvp.presenter.PresenterMVPLogin;

public class ActivityMVPLogin extends AppCompatActivity implements IActivityMVPLogin{
    private EditText etUsername,etPassword;
    private Button btnLogin;

    private IPresenterMVPLogin presenterMVPLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_v_p_login);

        initViews();
    }

    private void initViews() {
        //向上转型presenter
        presenterMVPLogin = new PresenterMVPLogin(this);//this指向的是现在这个activity

        etUsername = findViewById(R.id.et_mvp_username);
        etPassword = findViewById(R.id.et_mvp_password);

        btnLogin = findViewById(R.id.btn_mvp_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenterMVPLogin.login(getUsername(),getPassword());
            }
        });
    }

    @Override
    public String getUsername() {
        return etUsername.getText().toString();
    }

    @Override
    public String getPassword() {
        return etPassword.getText().toString();
    }

    @Override
    public void showSuccessToast() {
        Toast.makeText(this, "MVP Login Success !", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFailedToast() {
        Toast.makeText(this, "MVP Login Failed ~", Toast.LENGTH_SHORT).show();
    }
}