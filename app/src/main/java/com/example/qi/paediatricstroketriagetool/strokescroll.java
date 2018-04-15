package com.example.qi.paediatricstroketriagetool;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.support.v4.app.FragmentManager;

public class strokescroll extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    private MyFragmentPagerAdapter myFragmentPagerAdapter;

    private TabLayout.Tab one_stroke;
    private TabLayout.Tab two_stroke;
    private TabLayout.Tab three_stroke;

    private android.support.v4.app.FragmentManager manager;
    private android.support.v4.app.FragmentTransaction transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();//隐藏掉整个ActionBar
        setContentView(R.layout.activity_strokescroll);

        initViews();
    }

    private void initViews() {

        //使用适配器将ViewPager与Fragment绑定在一起
        mViewPager= (ViewPager) findViewById(R.id.viewPager);
        myFragmentPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(myFragmentPagerAdapter);

        //将TabLayout与ViewPager绑定在一起
        mTabLayout = (TabLayout) findViewById(R.id.tabLayout);
        mTabLayout.setupWithViewPager(mViewPager);

        //指定Tab的位置
        one_stroke = mTabLayout.getTabAt(0);
        two_stroke = mTabLayout.getTabAt(1);
        three_stroke = mTabLayout.getTabAt(2);

        //设置Tab的图标
        one_stroke.setIcon(R.mipmap.ic_launcher);
        two_stroke.setIcon(R.mipmap.ic_launcher);
        three_stroke.setIcon(R.mipmap.ic_launcher);
    }
}