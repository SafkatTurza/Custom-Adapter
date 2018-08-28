package com.example.muhammad.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    private ListView mListView;
    private String[] mCountryNames;
    private int[] mFlags =
            {R.drawable.aa, R.drawable.bb, R.drawable.ee, R.drawable.dd, R.drawable.ff ,
             R.drawable.gg, R.drawable.hh, R.drawable.ii, R.drawable.jj, R.drawable.kk,
             R.drawable.ll, R.drawable.mm, R.drawable.nn, R.drawable.oo, R.drawable.pp,
             R.drawable.qq, R.drawable.rr, R.drawable.ss, R.drawable.tt, R.drawable.uu,
             R.drawable.vv, R.drawable.ww
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = findViewById(R.id.listViewId);

        mCountryNames = getResources().getStringArray(R.array.country_names);

        CountryAdapter mCountryAdapter = new CountryAdapter(MainActivity.this,mCountryNames,mFlags);

        mListView.setAdapter(mCountryAdapter);







        


    }
}
