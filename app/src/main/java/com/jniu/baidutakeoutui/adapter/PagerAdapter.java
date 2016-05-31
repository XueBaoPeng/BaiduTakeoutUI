package com.jniu.baidutakeoutui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.jniu.baidutakeoutui.MainActivity;
import com.jniu.baidutakeoutui.R;
import com.jniu.baidutakeoutui.fragment.MainFragment;
import com.jniu.baidutakeoutui.fragment.MeFragment;
import com.jniu.baidutakeoutui.fragment.OrderFragment;

import java.util.Locale;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class PagerAdapter extends FragmentPagerAdapter {

    private MainActivity mainActivity;

    public PagerAdapter(MainActivity mainActivity, FragmentManager fm) {
        super(fm);
        this.mainActivity = mainActivity;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new MainFragment();
            case 1:
                return new OrderFragment();
            case 2:
                return new MeFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return mainActivity.getString(R.string.title_section1).toUpperCase(l);
            case 1:
                return mainActivity.getString(R.string.title_section2).toUpperCase(l);
            case 2:
                return mainActivity.getString(R.string.title_section3).toUpperCase(l);
        }
        return null;
    }
}
