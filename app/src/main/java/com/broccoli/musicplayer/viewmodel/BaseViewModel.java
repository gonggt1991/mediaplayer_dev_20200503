package com.broccoli.musicplayer.viewmodel;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.broccoli.musicplayer.repository.BaseRepository;

public abstract class BaseViewModel< T extends BaseRepository> extends AndroidViewModel {

    protected T mRepository;
    protected Context mContext;


    public BaseViewModel(@NonNull Application application) {
        super(application);
        mContext = application;
        mRepository = getRepository();
    }

    protected abstract T getRepository();

}
