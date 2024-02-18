package com.example.tabview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewpaggerMsngerAdapter extends FragmentPagerAdapter {

    public ViewpaggerMsngerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        //is method is used for kis position me kon sa fragment load krvana h
        //or retrun me fragment hi jayega positon means ki difrent postion pt r dif fragment honge

if(position==0){
    return new Chatfrag();
} else if (position==1) {
    return new StatusFragment();

}else{
    return new CallsFragment();

}
    }

    @Override
    public int getCount() {
        //jite layout unte count ko retunr krna h
        // count jo h ki fragmnet ka ja rha h pr load to viewoagger pr ho rhe h
        return 3;//no. of tabs
    }
//ab tab pr title set krne k liye

    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            //yani ki tab 1
            return "chats"; //charsequece return mtlb  ki yahi h ki character string pass krege

        } else if (position==1) {
            //for second tab
            return "status";
        }
        else {
            return "calls";
        }

    }
}


/*
note
navigattion k andar 3 chije hoti h
tab
bottom naviation
navigation drawer

android kehta h ki (aisa kuch nhi h ki yahi kro bs mtln ki aisa thoda acha practice mani jati h
agr apko 3 se 5 items to tab ko use kro(jaise ki tab me hum slider/ scoller lga denge tojitne mrji lgao)
5 se 7 bottom navigaitn ko use kro
agr 7 se jada h to navigation drawer ko use kro



 */