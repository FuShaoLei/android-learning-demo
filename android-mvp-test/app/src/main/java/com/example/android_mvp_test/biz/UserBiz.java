package com.example.android_mvp_test.biz;

import com.example.android_mvp_test.bean.User;

public class UserBiz implements IUserBiz{
    @Override
    public void login(final String username, final String password, final OnLoginListener loginListener) {
        new Thread(){
            @Override
            public void run() {
                //模拟子线程耗时操作
                try{
                    Thread.sleep(500);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                //模拟登录成功
                if ("root".equals(username)&&"123".equals(password)){
                    User user=new User(username,password);
                    loginListener.loginSuccess(user);
                }else {
                    loginListener.loginFailed();
                }

            }
        }.start();
    }
}
