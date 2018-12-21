package com.example.machenike.mydemo.presenter;

import com.example.machenike.mydemo.base.presenter.IBasePresenter;
import com.example.machenike.mydemo.beans.zhihu.DailyListBean;
import com.example.machenike.mydemo.module.ZhihuMoudle;
import com.example.machenike.mydemo.view.ZhihuView;

public class ZhihuPresenter<V extends ZhihuView> extends IBasePresenter<V> implements ZhihuMoudle.ZhihuCallback{

    private ZhihuMoudle mZhihuMoudle=new ZhihuMoudle();

    public void getDailyListBean() {
        if (mView!=null){
            mZhihuMoudle.getDailyListBean(this);
        }
    }

    @Override
    public void setDailyListBean(DailyListBean data) {
        if (mView!=null){
            mView.show(data);
        }
    }

    @Override
    public void setShowProgressbar() {

    }

    @Override
    public void setHideProgressbar() {

    }

    @Override
    public void setError(String error) {
        if (mView!=null){
            mView.showError(error);
        }
    }
}
