package com.broccoli.musicplayer.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;

import com.broccoli.musicplayer.data.AccountInfoLiveData;
import com.broccoli.musicplayer.repository.LocalRepository;

public class LocalViewModel extends BaseViewModel<LocalRepository> {
    // TODO: Implement the ViewModel

    public LocalViewModel(@NonNull Application application) {
        super(application);
    }

    public void loadData() {
        mRepository.loadData();
    }

    @Override
    protected LocalRepository getRepository() {
        return new LocalRepository<>(mContext, () -> AccountInfoLiveData.getInstance(mContext));
    }
}
