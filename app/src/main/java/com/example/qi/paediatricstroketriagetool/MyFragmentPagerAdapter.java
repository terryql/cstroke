package com.example.qi.paediatricstroketriagetool;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private String[] mTitles = new String[]{"Demographics", "Symptoms", "Signs"};

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 1) {
            return new fragment_stroke2();
        } else if (position == 2) {
            return new fragment_stroke3();
        }else if (position == 3){
                return new fragment_stroke3();
        }
        return new fragment_stroke1();
    }

    @Override
    public int getCount() {
        return mTitles.length;
    }

    //ViewPager与TabLayout绑定后，这里获取到PageTitle就是Tab的Text
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
