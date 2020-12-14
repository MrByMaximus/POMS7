package com.example.poms7.view;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import com.example.poms7.R;

public class SharedPreferencesFragment extends PreferenceFragment {

    public SharedPreferencesFragment() {

    }

    public static SharedPreferencesFragment newInstance() {
        SharedPreferencesFragment fragment = new SharedPreferencesFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.sharedpred);
    }

}
