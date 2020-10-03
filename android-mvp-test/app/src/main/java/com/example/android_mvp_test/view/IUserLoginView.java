package com.example.android_mvp_test.view;

import com.example.android_mvp_test.bean.User;

public interface IUserLoginView {
    String getUserName();
    String getPassword();
    void clearUserName();
    void clearPassword();

    //登录状态
    void toLoginSuccessActivity(User user);
    void showFailedError();
}
