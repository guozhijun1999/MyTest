package com.example.machenike.mydemo.base.avtivity;

import android.view.View;

import com.example.machenike.mydemo.base.presenter.BasePresenter;

public abstract class BaseActivity<V,P extends BasePresenter<V>> extends SimpleActivity{
    public P presenter;

    @Override
    public void viewCreated() {
        presenter=createdPresenter();
        if (presenter!=null){
            presenter.attachView((V)this);
        }
    }

    protected abstract P createdPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
