package com.shilpa.demoapp.activity;


import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.shilpa.demoapp.R;
import com.shilpa.demoapp.base.activty.DemoAppBaseActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import pub.devrel.easypermissions.EasyPermissions;


class VideoActivity  extends DemoAppBaseActivity implements EasyPermissions.PermissionCallbacks {

    @BindView(R.id.toolbar_title)
    TextView toolbarTitle;
    @BindView(R.id.toolbar)
    Toolbar mToolBar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics);
        ButterKnife.bind(this);
        // setSupportActionBar(toolbar);
        mToolBar.setTitle("");
        toolbarTitle.setText(R.string.electronics);
        setSupportActionBar(mToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void onRequestFailure(String message) {

    }

    @Override
    public void onRequestSuccess() {

    }

    @Override
    public void onPermissionsGranted(int requestCode, List<String> perms) {

    }

    @Override
    public void onPermissionsDenied(int requestCode, List<String> perms) {

    }
}