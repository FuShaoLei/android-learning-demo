package com.example.android_mvp_test.presenter;

import android.os.Handler;

import com.example.android_mvp_test.bean.User;
import com.example.android_mvp_test.biz.IUserBiz;
import com.example.android_mvp_test.biz.OnLoginListener;
import com.example.android_mvp_test.biz.UserBiz;
import com.example.android_mvp_test.view.IUserLoginView;

public class UserLoginPresenter {
    private IUserBiz userBiz;//model层
    private IUserLoginView userLoginView;//view层
    //presenter层持有model层和view层
    private Handler mHandler = new Handler();

    public UserLoginPresenter(IUserLoginView userLoginView) {
        this.userLoginView = userLoginView;
        this.userBiz=new UserBiz();//???
    }
    public void login(){
//        userLoginView.showLoading();
        userBiz.login(userLoginView.getUserName(), userLoginView.getPassword(), new OnLoginListener() {
            @Override
            public void loginSuccess(final User user) {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        userLoginView.toLoginSuccessActivity(user);
//                        userLoginView.hideLoading();
                    }
                });
            }

            @Override
            public void loginFailed() {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        userLoginView.showFailedError();
//                        userLoginView.hideLoading();
                    }
                });
            }
        });
    }
    public void clear(){
        userLoginView.clearUserName();
        userLoginView.clearPassword();
    }
}
