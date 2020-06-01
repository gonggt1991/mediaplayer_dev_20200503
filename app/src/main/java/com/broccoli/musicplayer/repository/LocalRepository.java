package com.broccoli.musicplayer.repository;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;

import com.broccoli.musicplayer.util.LogUtil;

/**
 * LocalRepository is responsible for loading data from local storage.
 */
public class LocalRepository< T extends LiveData > extends BaseRepository<T> {
    protected static final String TAG = "LocalRepository";

    public LocalRepository(Context context, @NonNull Callable<T> callable) {
        super(context);
        mContext = context;
        mLiveData = callable.run();
    }

    /**
     * Load data locally. Invoke ResponseSuccess and ResponseError when finished.
     */
    @Override
    public void loadData() {
        // TODO load data in a referred method.
        LogUtil.d(TAG, "loadData");
    }

}
