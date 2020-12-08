package com.fushaolei.android_mix_recyclerview_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity1 extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private List<Bean> beanList;
    private NormalAdapter normalAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        mRecyclerView = findViewById(R.id.recycler_view);

        initData();
        normalAdapter = new NormalAdapter(beanList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);

        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(normalAdapter);

    }
    private void initData() {
        beanList = new ArrayList<>();
        //one
        beanList.add(new Bean(1, "落霞与孤鹜齐飞", "秋水共长天一色", R.drawable.ic_launcher_foreground));
        beanList.add(new Bean(1, "相知相见知何年", "此时此刻难为情", R.drawable.ic_launcher_background));
        beanList.add(new Bean(1, "相见时难别亦难", "东风无力百花残", R.drawable.ic_launcher_foreground));
        beanList.add(new Bean(1, "落霞与孤鹜齐飞", "秋水共长天一色", R.drawable.ic_launcher_foreground));
        beanList.add(new Bean(1, "相知相见知何年", "此时此刻难为情", R.drawable.ic_launcher_background));
        beanList.add(new Bean(1, "相见时难别亦难", "东风无力百花残", R.drawable.ic_launcher_foreground));
        //two
//        beanList.add(new Bean(2,"李白",R.drawable.ic_launcher_background));
//        beanList.add(new Bean(2,"苏东坡",R.drawable.ic_launcher_foreground));
//        beanList.add(new Bean(2,"饮冰室",R.drawable.ic_launcher_background));
//        beanList.add(new Bean(2,"李白",R.drawable.ic_launcher_background));
//        beanList.add(new Bean(2,"苏东坡",R.drawable.ic_launcher_foreground));
//        beanList.add(new Bean(2,"饮冰室",R.drawable.ic_launcher_background));
    }
}