package com.example.myeong.navigation_menubar_ex;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by myeong on 2018. 3. 6..
 */

public class FirstLayout extends Fragment{

    View v;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.first_layout, container, false);

        return v;
    }
}
