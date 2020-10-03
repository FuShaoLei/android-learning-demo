package com.example.android_mvc_mvp_mvvm_demo.mvp.presenter;

import com.example.android_mvc_mvp_mvvm_demo.mvp.model.IModelMVPLogin;
import com.example.android_mvc_mvp_mvvm_demo.mvp.model.ModelMVPLogin;
import com.example.android_mvc_mvp_mvvm_demo.mvp.view.IActivityMVPLogin;

public class PresenterMVPLogin implements IPresenterMVPLogin{
    //present应持有有model层和view层
    private IModelMVPLogin modelMVPLogin;
    private IActivityMVPLogin activityMVPLogin;

    //当view层要用到时，得初始化
    public PresenterMVPLogin(IActivityMVPLogin activityMVPLogin) {
        this.activityMVPLogin = activityMVPLogin;//向上转型
        this.modelMVPLogin = new ModelMVPLogin();//向上转型
    }

    @Override
    public void login(String username, String password) {
        if (modelMVPLogin.login(username, password)==true){
            activityMVPLogin.showSuccessToast();
        }else {
            activityMVPLogin.showFailedToast();
        }
    }
}
