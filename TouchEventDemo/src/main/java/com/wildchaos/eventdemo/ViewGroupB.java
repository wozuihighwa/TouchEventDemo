package com.wildchaos.eventdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by 孙俊伟 on 2015/10/15.
 */
public class ViewGroupB extends RelativeLayout {

    private TextView content;

    private String contentStr;

    public ViewGroupB(Context context) {
        super(context);
    }

    public ViewGroupB(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("sjw", "ViewGroupB -> dispatchTouchEvent");
        contentStr = "ViewGroupB -> dispatchTouchEvent\n";
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i("sjw", "ViewGroupB -> onInterceptTouchEvent");
        contentStr += "ViewGroupB -> onInterceptTouchEvent\n";
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("sjw", "ViewGroupB -> onTouchEvent");
        contentStr += "ViewGroupB -> onTouchEvent\n";
        content.setText(contentStr);
        contentStr = null;
        return super.onTouchEvent(event);
    }

    public void setContent(TextView content) {
        this.content = content;
    }
}
