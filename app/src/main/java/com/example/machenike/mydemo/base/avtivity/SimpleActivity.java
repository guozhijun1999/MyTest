package com.example.machenike.mydemo.base.avtivity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.machenike.mydemo.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class SimpleActivity extends AppCompatActivity {
    public Activity mActivity;
    private Unbinder bind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(createLayoutId());
        bind= ButterKnife.bind(this);
        mActivity=this;
        viewCreated();
        initData();
    }

    public abstract void initData();
    public abstract void viewCreated();
    public abstract int createLayoutId();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (bind!=null){
            bind.unbind();
        }
    }
}
