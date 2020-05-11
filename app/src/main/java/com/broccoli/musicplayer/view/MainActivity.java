package com.broccoli.musicplayer.view;

import android.app.Activity;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;

import com.broccoli.musicplayer.MainViewBindingClass;
import com.broccoli.musicplayer.R;
import com.broccoli.musicplayer.viewmodel.ControlPanelViewModel;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainViewBindingClass bindingClass =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        bindingClass.setControlPanelVM(new ControlPanelViewModel());
        bindingClass.executePendingBindings();
    }
}