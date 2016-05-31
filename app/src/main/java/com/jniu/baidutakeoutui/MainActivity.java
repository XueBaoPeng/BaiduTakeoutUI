package com.jniu.baidutakeoutui;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import com.jniu.baidutakeoutui.adapter.PagerAdapter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    PagerAdapter mSectionsPagerAdapter;

    ViewPager mViewPager;

    RadioButton btnTabHome,btnTabOrder,btnTabMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTabHome = (RadioButton) findViewById(R.id.btn_tab_home);
        btnTabOrder = (RadioButton) findViewById(R.id.btn_tab_order);
        btnTabMe = (RadioButton) findViewById(R.id.btn_tab_me);
        btnTabHome.setOnClickListener(this);
        btnTabOrder.setOnClickListener(this);
        btnTabMe.setOnClickListener(this);
        mSectionsPagerAdapter = new PagerAdapter(this, getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);
    }

    public void addListener(){
        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        btnTabHome.setChecked(true);
                        break;
                    case 1:
                        btnTabOrder.setChecked(true);
                        break;
                    case 2:
                        btnTabMe.setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_tab_home:
                mViewPager.setCurrentItem(0);
                break;
            case R.id.btn_tab_order:
                mViewPager.setCurrentItem(1);
                break;
            case R.id.btn_tab_me:
                mViewPager.setCurrentItem(2);
                break;
        }
    }
}
