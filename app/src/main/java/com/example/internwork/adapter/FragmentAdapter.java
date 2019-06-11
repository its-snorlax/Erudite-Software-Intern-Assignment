package com.example.internwork.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.internwork.frgaments.BrideFragment;
import com.example.internwork.frgaments.BuddyFragment;
import com.example.internwork.frgaments.GroomFragment;
import com.example.internwork.frgaments.MessageFragment;

public class FragmentAdapter extends FragmentPagerAdapter {

    private int tabcount;

    public FragmentAdapter(FragmentManager fm, int tabcount) {
        super(fm);
        this.tabcount = tabcount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new BrideFragment();
            case 1:
                return new GroomFragment();
            case 2:
                return new BuddyFragment();
            case 3:
                return new MessageFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 0;
    }
}
