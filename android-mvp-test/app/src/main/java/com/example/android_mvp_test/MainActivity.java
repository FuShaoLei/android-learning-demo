package com.example.android_mvp_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.android_mvp_test.bean.User;
import com.example.android_mvp_test.presenter.UserLoginPresenter;
import com.example.android_mvp_test.view.IUserLoginView;

public class MainActivity extends AppCompatActivity implements IUserLoginView {

    private EditText editUsername,editPassword;
    private Button btnLogin,btnClear;

    private UserLoginPresenter userLoginPresenter = new UserLoginPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        editUsername = findViewById(R.id.et_username);
        editPassword = findViewById(R.id.et_password);

        btnLogin = findViewById(R.id.btn_login);
        btnClear = findViewById(R.id.btn_clear);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userLoginPresenter.login();
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userLoginPresenter.clear();
            }
        });
    }

    @Override
    public String getUserName() {
        return editUsername.getText().toString();
    }

    @Override
    public String getPassword() {
        return editPassword.getText().toString();
    }

    @Override
    public void clearUserName() {
        editUsername.setText("");
    }

    @Override
    public void clearPassword() {
        editPassword.setText("");
    }


    @Override
    public void toLoginSuccessActivity(User user) {
        Toast.makeText(this, "login success !", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFailedError() {
        Toast.makeText(this, "login failed ~", Toast.LENGTH_SHORT).show();
    }
}