package com.example.machenike.mydemo.base.presenter;

public interface BasePresenter<V> {
    void attachView(V v);
    void detachView();
}
