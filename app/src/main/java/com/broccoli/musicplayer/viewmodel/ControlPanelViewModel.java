package com.broccoli.musicplayer.viewmodel;

import androidx.databinding.ObservableField;

import com.broccoli.musicplayer.util.LogUtil;

public final class ControlPanelViewModel {
    private ObservableField<String> mBtnPlayContent = new ObservableField<>("PLAY");

    public ControlPanelViewModel() {
    }

    public ObservableField<String> getBtnPlayContent() {
        return mBtnPlayContent;
    }

    public void clickPlay() {
        LogUtil.d("clicking");
        if ("PLAY".equals(mBtnPlayContent.get())) {
            mBtnPlayContent.set("STOP");
        } else if ("STOP".equals(mBtnPlayContent.get())) {
            mBtnPlayContent.set("PLAY");
        } else {
            LogUtil.w("Display Error");
            mBtnPlayContent.set("PLAY");
        }
    }
}
