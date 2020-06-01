package com.broccoli.musicplayer.view.fragment;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.broccoli.musicplayer.observer.FragmentLifeCycleObserver;
import com.broccoli.musicplayer.viewmodel.LocalViewModel;
import com.broccoli.musicplayer.R;


public class LocalFragment extends BaseFragment<LocalViewModel> {

    public static LocalFragment newInstance() {
        return new LocalFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.local_fragment, container, false);
        initLifecycle();
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(LocalViewModel.class);
        // TODO: Use the ViewModel
    }

    private void initLifecycle() {
        getLifecycle().addObserver(
                new FragmentLifeCycleObserver(
                        requireActivity().getApplicationContext()));
    }

    @Override
    protected LocalViewModel getViewModel() {
        return ViewModelProviders.of(
                requireActivity()).get(LocalViewModel.class);
    }
}
