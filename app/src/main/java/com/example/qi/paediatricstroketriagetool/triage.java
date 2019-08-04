package com.example.qi.paediatricstroketriagetool;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.support.v4.app.FragmentManager;

import org.greenrobot.eventbus.EventBus;

public class triage extends AppCompatActivity implements IOneFragmentClickListener {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    private MyFragmentPagerAdapter1 myFragmentPagerAdapter1;

    private TabLayout.Tab one;
    private TabLayout.Tab two;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();// hide the ActionBar
        setContentView(R.layout.activity_triage);

        initViews();
    }

    private void initViews() {

        //combine Viewpager with Fragments with adapter
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        myFragmentPagerAdapter1 = new MyFragmentPagerAdapter1(getSupportFragmentManager());
        mViewPager.setAdapter(myFragmentPagerAdapter1);

        //Combine Viewpager with Layouts;
        mTabLayout = (TabLayout) findViewById(R.id.tabLayout);
        mTabLayout.setupWithViewPager(mViewPager);

        //indicate position of Tabs
        one = mTabLayout.getTabAt(0);
        two = mTabLayout.getTabAt(1);

        //Tab's image
        one.setIcon(R.mipmap.ic_launcher);
        two.setIcon(R.mipmap.ic_launcher);
    }
    }



