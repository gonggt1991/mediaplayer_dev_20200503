package com.broccoli.musicplayer.observer;

import android.content.Context;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import com.broccoli.musicplayer.util.LogUtil;

public class FragmentLifeCycleObserver implements LifecycleObserver {
    private static final String TAG = "FragmentLifeCycleObserver";
    private Context mContext;
    public FragmentLifeCycleObserver(Context context) {
        mContext = context;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        LogUtil.d(TAG, "onCreate");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        LogUtil.d(TAG, "onResume");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        LogUtil.d(TAG, "onDestroy");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        LogUtil.d(TAG, "onPause");
    }
}
