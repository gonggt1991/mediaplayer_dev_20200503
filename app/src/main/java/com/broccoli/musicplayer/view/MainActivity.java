package com.broccoli.musicplayer.view;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.broccoli.musicplayer.R;
import com.broccoli.musicplayer.observer.ActivityLifeCycleObserver;
import com.broccoli.musicplayer.view.fragment.LocalFragment;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragments(savedInstanceState);
        initLifeCycle();
    }

    private void initFragments(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.add(R.id.root, LocalFragment.newInstance(), "MainActivity");
            transaction.commit();
        }
    }

    private void initLifeCycle() {
        getLifecycle().addObserver(new ActivityLifeCycleObserver(getApplicationContext()));
    }
}
