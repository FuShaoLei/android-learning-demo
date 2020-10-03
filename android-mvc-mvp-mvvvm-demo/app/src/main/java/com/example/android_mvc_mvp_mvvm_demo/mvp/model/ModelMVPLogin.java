package com.example.android_mvc_mvp_mvvm_demo.mvp.model;

public class ModelMVPLogin implements IModelMVPLogin{
    @Override
    public boolean login(String username, String password) {
        if ("root".equals(username) && "123".equals(password)){
            return true;
        }
        return false;
    }
}
