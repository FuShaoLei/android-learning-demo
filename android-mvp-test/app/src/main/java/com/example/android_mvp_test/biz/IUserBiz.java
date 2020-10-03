package com.example.android_mvp_test.biz;

public interface IUserBiz {
    public void login(String username,String password,OnLoginListener loginListener);
}
