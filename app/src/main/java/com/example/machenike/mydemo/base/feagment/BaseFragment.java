package com.example.machenike.mydemo.base.feagment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.machenike.mydemo.base.presenter.BasePresenter;

public abstract class BaseFragment<V,P extends BasePresenter<V>> extends SimpleFragment {
    public P presenter;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        presenter=createPresemter();
        if (presenter!=null){
            presenter.attachView((V)this);
        }
        super.onViewCreated(view, savedInstanceState);
    }

    protected abstract P createPresemter();

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (presenter!=null){
            presenter.detachView();
            presenter=null;
        }
        super.onDestroyView();
    }
}
