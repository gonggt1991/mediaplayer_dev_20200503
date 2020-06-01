package com.broccoli.musicplayer.repository;

import android.content.Context;

import androidx.lifecycle.LiveData;

public abstract class BaseRepository<T extends LiveData> {

    protected Context mContext;

    protected T mLiveData;

    public BaseRepository(Context context) {
        mContext = context;
    }

    public T getLiveData() {
        return mLiveData;
    }

    public interface Callable<T> {
        T run();
    }

    public abstract void loadData();

}
