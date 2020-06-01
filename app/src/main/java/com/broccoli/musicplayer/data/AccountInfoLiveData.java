package com.broccoli.musicplayer.data;

import android.content.Context;

import androidx.lifecycle.LiveData;

import com.broccoli.musicplayer.bean.AccountBean;

import java.lang.ref.WeakReference;

public class AccountInfoLiveData extends LiveData<AccountBean> {

    private static final String TAG = "LocalInfoLiveData";

    private static AccountInfoLiveData sAccountInfoLiveData;

    private WeakReference<Context> mContextWr;

    private AccountInfoLiveData(Context context) {
        mContextWr = new WeakReference<>(context);
    }

    public static AccountInfoLiveData getInstance(Context context) {
        if (sAccountInfoLiveData == null) {
            synchronized (AccountInfoLiveData.class) {
                if (sAccountInfoLiveData == null) {
                    sAccountInfoLiveData = new AccountInfoLiveData(context);
                }
            }
        }
        return sAccountInfoLiveData;
    }

    // Invoked when number of observers is changed to more than 0.
    @Override
    protected void onActive() {
        super.onActive();
    }

    // Invoked when number of observers is reduced to 0.
    @Override
    protected void onInactive() {
        super.onInactive();
    }
}
