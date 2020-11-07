package com.example.android_bottom_nav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTabHost;

import android.os.Bundle;
import android.widget.TabHost;

import java.util.ArrayList;
import java.util.List;

public class MainActivity1 extends FragmentActivity {
    private FragmentTabHost mTabHost;
    private Fragment[] mFragments;
    private String[] mTabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        initData();

        mTabHost = findViewById(R.id.fragment_tab_host);
        mTabHost.setup(this,getSupportFragmentManager(),R.id.frame_layout);

        for (int i = 0;i<4;i++){
            mTabHost.addTab(mTabHost.newTabSpec(mTabs[i]).setIndicator(mTabs[i]),mFragments[i].getClass(),null);
        }

    }

    private void initData() {
        mFragments = new Fragment[4];
        mFragments[0] = new FragmentTab1();
        mFragments[1] = new FragmentTab2();
        mFragments[2] = new FragmentTab3();
        mFragments[3] = new FragmentTab4();

        mTabs = new String[4];
        mTabs[0] = "首页";
        mTabs[1] = "归档";
        mTabs[2] = "关于";
        mTabs[3] = "其他";

    }
}