package com.example.myapplication88;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.Collections;

public class jamualem {
    private ArrayList<Fragment> amharic;
    private int index;


  public jamualem(){
      amharic=new ArrayList<>();
      amharic.add(new BlankFragment16());
      amharic.add(new BlankFragment17());
      amharic.add(new BlankFragment18());
      amharic.add(new BlankFragment19());
      amharic.add(new BlankFragment20());
      amharic.add(new BlankFragment21());
      amharic.add(new BlankFragment22());
      amharic.add(new BlankFragment23());
      amharic.add(new BlankFragment24());
      amharic.add(new BlankFragment25());
      amharic.add(new BlankFragment26());
      amharic.add(new BlankFragment27());
      amharic.add(new BlankFragment28());
      amharic.add(new BlankFragment29());
      amharic.add(new BlankFragment30());

      Collections.shuffle(amharic);
      index=0;
  }

    public Fragment getNextFrag(){

        Fragment nextu = amharic.get(index);
        index++;
        if (index == amharic.size()) {
            Collections.shuffle(amharic);
            index = 0;
        }
        return nextu;

    }



}
