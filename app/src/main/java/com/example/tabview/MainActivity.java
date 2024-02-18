package com.example.tabview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tab;
    ViewPager viewPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab=findViewById(R.id.tablayout);
        viewPage=findViewById(R.id.viewpager);

        //view pagger ko use krne k liye aone ko adapter bnana pdta h
        // to hum ya pr adapter use krege   use pagger ko use krne ka motive yahi hota h ki hum slide kr ske isi liye adapter use krege
        //slide krvane vake h to isiiye hum use extend krere fragment pagger class to apne fragment pagger adapter ka refrence chahiye
        //adapter is nothing its just a java class to 1 new java class bna lenge

ViewpaggerMsngerAdapter adapter= new ViewpaggerMsngerAdapter(getSupportFragmentManager());//adapter kiske liye bnaya tha to viewpagger k loye to set bui view pagger prege so create object
//upr se adapter bna dia h ab use set krna h
        viewPage.setAdapter(adapter);
//ab jaise tab pr click krunga to niche change hona chaiye ya slide kru to upr tab change hona chaiye to ise ko snycronise krege
        tab.setupWithViewPager(viewPage);


    }
}