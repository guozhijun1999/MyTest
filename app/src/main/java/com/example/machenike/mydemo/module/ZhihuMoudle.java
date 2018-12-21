package com.example.machenike.mydemo.module;

import com.example.machenike.mydemo.base.module.HttpFinishCallback;
import com.example.machenike.mydemo.beans.zhihu.DailyListBean;
import com.example.machenike.mydemo.http.BaseObserver;
import com.example.machenike.mydemo.http.ZhihuManager;
import com.example.machenike.mydemo.utils.RxUtils;

public class ZhihuMoudle {
    public interface ZhihuCallback extends HttpFinishCallback{
        void setDailyListBean(DailyListBean data);
    }
    public void getDailyListBean(final ZhihuCallback zhihuCallback){
        zhihuCallback.setShowProgressbar();
        ZhihuManager.getMyServer().getDailyList().compose(RxUtils.<DailyListBean>rxObserableSchedulerHelper()).subscribe(new BaseObserver<DailyListBean>(zhihuCallback) {
            @Override
            public void onNext(DailyListBean value) {
                zhihuCallback.setDailyListBean(value);
            }
        });
    }
}
