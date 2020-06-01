package com.broccoli.musicplayer.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;

import com.broccoli.musicplayer.bean.AccountBean;
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

    public LiveData<String> getStrData() {
        AccountInfoLiveData data = (AccountInfoLiveData) mRepository.getLiveData();
        return Transformations.switchMap(
                data, accountBean -> {
                    final MutableLiveData<String> resStrData = new MutableLiveData<>();
                    if (accountBean == null || accountBean.getName() == null) {
                        resStrData.setValue(null);
                    } else {
                        resStrData.setValue(accountBean.getName());
                    }
                    return resStrData;
                }
        );
    }

    @Override
    protected LocalRepository getRepository() {
        return new LocalRepository<>(mContext, () -> AccountInfoLiveData.getInstance(mContext));
    }
}
