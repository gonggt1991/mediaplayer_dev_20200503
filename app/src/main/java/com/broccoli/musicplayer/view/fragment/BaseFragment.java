package com.broccoli.musicplayer.view.fragment;

import android.content.Context;

import androidx.fragment.app.Fragment;

import com.broccoli.musicplayer.viewmodel.BaseViewModel;

public abstract class BaseFragment < T extends BaseViewModel> extends Fragment {

    protected T mViewModel;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (mViewModel == null) {
            mViewModel = getViewModel();
        }
    }

    @Override
    public void onDetach() {
        mViewModel = null;
        super.onDetach();
    }

    protected abstract T getViewModel();

}
