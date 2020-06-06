package com.example.referralfrag;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class page extends FragmentPagerAdapter
{
    private int numberTab;
    page(FragmentManager fm, int numberTab) {
        super(fm);
        this.numberTab = numberTab;
    }



    @Override
    public Fragment getItem(int i) {
        switch(i){
            case 0:
                return new BlankFragment();
            case 1:
                return new BlankFragment2();
        }
        return null;
    }

    @Override
    public int getCount() {
        return numberTab;
    }
}
