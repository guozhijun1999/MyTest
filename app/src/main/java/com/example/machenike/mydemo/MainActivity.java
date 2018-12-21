package com.example.machenike.mydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.machenike.mydemo.base.avtivity.BaseActivity;
import com.example.machenike.mydemo.beans.zhihu.DailyListBean;
import com.example.machenike.mydemo.presenter.ZhihuPresenter;
import com.example.machenike.mydemo.view.ZhihuView;

import java.util.logging.Logger;

public class MainActivity extends BaseActivity<ZhihuView,ZhihuPresenter<ZhihuView>> implements ZhihuView {

//人之初性本善人之初性本善人之初性本善人之初性本善人之初性本善人之初性本善人之初性本善人之初性本善人之初性本善人之初性本善
    @Override
    public void initData() {
        presenter.getDailyListBean();
    }

    @Override
    public int createLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void showProgressbar() {

    }

    @Override
    public void hideProgressbar() {

    }

    @Override
    public void showError(String error) {

    }

    @Override
    public void show(DailyListBean dailyListBean) {
        Logger.getLogger(dailyListBean.toString());
        Log.e("123123",dailyListBean.toString()+"aaaaaaaa");
        //我再此行加了注释
    }

    @Override
    protected ZhihuPresenter<ZhihuView> createdPresenter() {
        return new ZhihuPresenter<>();
    }
}
