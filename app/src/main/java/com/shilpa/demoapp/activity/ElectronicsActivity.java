package com.shilpa.demoapp.activity;


import android.database.DataSetObserver;
import android.os.Bundle;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.shilpa.demoapp.R;
import com.shilpa.demoapp.base.activty.DemoAppBaseActivity;

import java.util.ArrayList;
import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ElectronicsActivity extends DemoAppBaseActivity {

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

        final ListView listview = (ListView) findViewById(R.id.listview);
        String[] values = new String[]{"Laptops", "Televisions", "Gaming",
                "Mobiles", "Data Storage", "Computer Accessories", "Smart Devises", "Tablets"};


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


                int itemPosition = position;


                String itemValue = (String) listview.getItemAtPosition(position);


                Toast.makeText(getApplicationContext(),
                        "  ListItem : " + itemValue, Toast.LENGTH_LONG)
                        .show();

            }

        });
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


}