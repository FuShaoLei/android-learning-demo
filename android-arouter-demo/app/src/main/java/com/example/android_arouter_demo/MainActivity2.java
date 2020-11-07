package com.example.android_arouter_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/test/activity_2")
public class MainActivity2 extends AppCompatActivity {

    @Autowired(name = "test")
    String getTexts;

    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ARouter.getInstance().inject(this);

        button = findViewById(R.id.btn_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/test/activity_1").navigation();
            }
        });
        textView = findViewById(R.id.tv_text);
        if (getTexts == null)Log.e("============wtf","这逼居然是null holy fuck dude");
        if (getTexts != null){
            Log.e("============wtf","这逼的值是："+getTexts);
            textView.setText(getTexts);
        }

    }
}