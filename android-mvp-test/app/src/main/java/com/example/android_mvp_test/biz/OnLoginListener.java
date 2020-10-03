package com.example.android_mvp_test.biz;

import com.example.android_mvp_test.bean.User;

public interface OnLoginListener {
    void loginSuccess(User user);
    void loginFailed();
}
