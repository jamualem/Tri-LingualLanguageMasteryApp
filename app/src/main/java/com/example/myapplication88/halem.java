package com.example.myapplication88;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.Collections;

public class halem {
    private ArrayList<Fragment> oromic;
    private int index;

    public halem(){
        oromic=new ArrayList<>();
        oromic.add(new BlankFragment31());
        oromic.add(new BlankFragment32());
        oromic.add(new BlankFragment33());
        oromic.add(new BlankFragment34());
        oromic.add(new BlankFragment35());
        oromic.add(new BlankFragment36());
        oromic.add(new BlankFragment37());
        oromic.add(new BlankFragment38());
        oromic.add(new BlankFragment39());
        oromic.add(new BlankFragment40());
        oromic.add(new BlankFragment41());
        oromic.add(new BlankFragment42());
        oromic.add(new BlankFragment43());
        oromic.add(new BlankFragment44());
        oromic.add(new BlankFragment45());
        Collections.shuffle(oromic);
        index=0;
    }

    public Fragment getNextoromic(){

        Fragment nextu = oromic.get(index);
        index++;
        if (index == oromic.size()) {
            Collections.shuffle(oromic);
            index = 0;
        }
        return nextu;

    }

}
