package com.example.android_mvc_mvp_mvvm_demo.mvp.view;

/**
 * view层接口
 * view层的作用就是与用户进行一个交互（获取用户输入的信息，响应用户的操作等等）
 */
public interface IActivityMVPLogin {
    //获取用户的输入
    String getUsername();
    String getPassword();

    //响应用户的操作
    void showSuccessToast();
    void showFailedToast();

}
