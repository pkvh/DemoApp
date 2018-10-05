package com.shilpa.demoapp.activity;


import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.shilpa.demoapp.R;
import com.shilpa.demoapp.base.activty.DemoAppBaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RegisterActivity extends DemoAppBaseActivity {
    @BindView(R.id.toolbar_title)
    TextView toolbarTitle;
    @BindView(R.id.toolbar)
    Toolbar mToolBar;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        ButterKnife.bind(this);

        mToolBar.setTitle("");
        toolbarTitle.setText(R.string.register);
        setSupportActionBar(mToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }
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
}
