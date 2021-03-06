package com.project.perfy.mobilemediaplayer.view;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.project.perfy.mobilemediaplayer.R;
import com.project.perfy.mobilemediaplayer.controller.activity.SearchActivity;


/**
 * Created by Administrator on 2017/3/31.
 */

/**
 * 自定义标题栏，实现全局响应点击事件
 */
public class TitleBar extends LinearLayout implements View.OnClickListener {
    private View tv_search;
    private View rl_game;
    private View iv_record;
    private Context mContext;
    /**
     * 在代码中实例化该类的时候使用这个方法
     * @param context
     */
    public TitleBar(Context context) {
        this(context,null);
    }

    /**
     * 当在布局文件使用该类的时候，Android系统通过这个构造方法实例化该类（通过反射的方式实例化）
     * @param context
     * @param attrs
     */
    public TitleBar(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    /**
     * 当需要设置样式的时候，可以使用该方法
     * @param context
     * @param attrs
     * @param defStyleAttr
     */
    public TitleBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
    }

    /**
     * 当布局文件加载完成时，回调该方法。
     */
    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        tv_search = getChildAt(0);
        rl_game = getChildAt(1);
        iv_record = getChildAt(2);
        // 设置点击事件
        tv_search.setOnClickListener(this);
        rl_game.setOnClickListener(this);
        iv_record.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_search: // 搜索
                //Toast.makeText(mContext, "搜索", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mContext,SearchActivity.class);
                mContext.startActivity(intent);
                break;
            case R.id.rl_game: // 游戏
                Toast.makeText(mContext, "游戏", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_record: // 播放历史
                Toast.makeText(mContext, "播放历史", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
