package com.example.muhamed_joe.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Event_Fragment();
        }
        else if (position == 1){
            return new Event_Fragment();
        }
        else if (position == 2){
            return new FunFragment();
        }
        else {
            return new Museum();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
