package com.project.perfy.mobilemediaplayer.controller.pager;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.project.perfy.mobilemediaplayer.controller.Base.BasePager;

/**
 * Created by pfxu on 17/03/29.
 */

public class AudioPager extends BasePager {
    private TextView textView;
    public AudioPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        //LogUtil.e("本地音乐被初始化了!");
        textView = new TextView(context);

        textView.setTextSize(25);
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.RED);
        return textView;
    }

    @Override
    public void initData() {
        super.initData();
        //LogUtil.e("本地音乐的数据被初始化了!");
        textView.setText("本地音乐页面");
    }
}
