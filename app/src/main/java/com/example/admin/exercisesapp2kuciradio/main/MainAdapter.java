package com.example.admin.exercisesapp2kuciradio.main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.admin.exercisesapp2kuciradio.main.exercises.ExercisesFragment;
import com.example.admin.exercisesapp2kuciradio.main.workout.WorkoutFragment;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends FragmentPagerAdapter {

    private List<Fragment> mFragments = new ArrayList<>();

//todo objasniti
    public MainAdapter(FragmentManager fm, int pagerId) {
        super(fm);
        if (fm.findFragmentByTag("android:switcher:" + pagerId + ":" + 0) != null) {
            mFragments.add(fm.findFragmentByTag("android:switcher:" + pagerId + ":" + 0));
        } else {
            mFragments.add(ExercisesFragment.newInstance());
        }
        if (fm.findFragmentByTag("android:switcher:" + pagerId + ":" + 1) != null) {
            mFragments.add(fm.findFragmentByTag("android:switcher:" + pagerId + ":" + 1));
        } else {
            mFragments.add(WorkoutFragment.newInstance());
        }
        if (fm.findFragmentByTag("android:switcher:" + pagerId + ":" + 2) != null) {
            mFragments.add(fm.findFragmentByTag("android:switcher:" + pagerId + ":" + 2));
        } else {
            mFragments.add(ExercisesFragment.newInstance());
        }
        if (fm.findFragmentByTag("android:switcher:" + pagerId + ":" + 3) != null) {
            mFragments.add(fm.findFragmentByTag("android:switcher:" + pagerId + ":" + 3));
        } else {
            mFragments.add(WorkoutFragment.newInstance());
        }
        if (fm.findFragmentByTag("android:switcher:" + pagerId + ":" + 4) != null) {
            mFragments.add(fm.findFragmentByTag("android:switcher:" + pagerId + ":" + 4));
        } else {
            mFragments.add(WorkoutFragment.newInstance());
        }
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
