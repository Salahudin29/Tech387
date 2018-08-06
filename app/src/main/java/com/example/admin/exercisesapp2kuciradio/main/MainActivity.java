package com.example.admin.exercisesapp2kuciradio.main;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.admin.exercisesapp2kuciradio.R;

public class MainActivity extends AppCompatActivity {

    private ViewPager mPager;
    private MainAdapter mAdapter;
    private TabLayout mTabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPager = findViewById(R.id.pager);
        mTabLayout = findViewById(R.id.tabLayout);

        setupPager();
    }
//todo objasniti
    public void setupPager() {
        mAdapter = new MainAdapter(getSupportFragmentManager(), mPager.getId());
        mPager.setAdapter(mAdapter);

        mTabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mPager));
        mPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
    }
}
