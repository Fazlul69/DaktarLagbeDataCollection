package com.sawrav.daktarlagbedatacollection;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.sawrav.daktarlagbedatacollection.fragments.Clinic;
import com.sawrav.daktarlagbedatacollection.fragments.Hospital;

public class PageAdapter extends FragmentPagerAdapter {

    int tabcount;

    public PageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0: return new Hospital();
            case 1: return new Clinic();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
