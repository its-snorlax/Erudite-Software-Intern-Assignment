package com.example.internwork.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.internwork.R;
import com.example.internwork.adapter.FragmentAdapter;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);


        tabLayout.addTab(tabLayout.newTab().setText("Bride"));
        tabLayout.addTab(tabLayout.newTab().setText("Groom"));
        tabLayout.addTab(tabLayout.newTab().setText("Buddy"));
        tabLayout.addTab(tabLayout.newTab().setText("Messages"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(fragmentAdapter);
        tabLayout.setOnTabSelectedListener(this);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
