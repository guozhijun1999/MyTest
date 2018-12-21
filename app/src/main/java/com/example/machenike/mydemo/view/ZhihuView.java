package com.example.machenike.mydemo.view;

import com.example.machenike.mydemo.base.view.BaseView;
import com.example.machenike.mydemo.beans.zhihu.DailyListBean;

public interface ZhihuView extends BaseView {
    void show(DailyListBean dailyListBean);
}
