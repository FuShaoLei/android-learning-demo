package com.example.android_arouter_demo;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ARouter.openLog();     // 打印日志
        ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        ARouter.init(MainApplication.this); // 尽可能早，推荐在Application中初始化
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        ARouter.getInstance().destroy();
    }
}
