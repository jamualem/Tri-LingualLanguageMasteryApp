package com.example.myapplication88;


import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.Collections;

class RandomFragmentGenerator {
    private ArrayList<Fragment> fragments,amharic;
    private int currentIndex,index;

    public RandomFragmentGenerator()
    {
        fragments = new ArrayList<>();
        fragments.add(new BlankFragment());
        fragments.add(new BlankFragment2());
        fragments.add(new BlankFragment3());
        fragments.add(new BlankFragment4());
        fragments.add(new BlankFragment5());
        fragments.add(new BlankFragment6());
        fragments.add(new BlankFragment7());
        fragments.add(new BlankFragment8());
        fragments.add(new BlankFragment9());
        fragments.add(new BlankFragment10());
        fragments.add(new BlankFragment11());
        fragments.add(new BlankFragment12());
        fragments.add(new BlankFragment13());
        fragments.add(new BlankFragment14());
        fragments.add(new BlankFragment15());
        Collections.shuffle(fragments);
        currentIndex = 0;
    }



    public Fragment getNextFragment() {
        Fragment nextFragment = fragments.get(currentIndex);
        currentIndex++;
        if (currentIndex == fragments.size()) {
            Collections.shuffle(fragments);
            currentIndex = 0;
        }
        return nextFragment;
    }
}

