package com.fjnu.administrator.preferencefragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Administrator on 2017/4/13.
 */
public class PreFra2 extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.intent);
    }
}
