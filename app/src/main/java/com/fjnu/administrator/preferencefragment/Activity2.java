package com.fjnu.administrator.preferencefragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

/**
 * Created by Administrator on 2017/4/13.
 */
public class Activity2 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        PreFra2 prefFragment = new PreFra2();
        transaction.add(R.id.content,prefFragment);
        transaction.commit();
    }
}
