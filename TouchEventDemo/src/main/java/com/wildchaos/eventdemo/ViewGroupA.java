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
public class ViewGroupA extends RelativeLayout {

    private TextView contentA;
    private TextView contentB;
    private TextView contentC;

    private String contentStr;

    public ViewGroupA(Context context) {
        super(context);
    }

    public ViewGroupA(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("sjw", "ViewGroupA -> dispatchTouchEvent");
        contentB.setText("");
        contentC.setText("");
        contentStr = "ViewGroupA -> dispatchTouchEvent\n";
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i("sjw", "ViewGroupA -> onInterceptTouchEvent");
        contentStr += "ViewGroupA -> onInterceptTouchEvent\n";
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("sjw", "ViewGroupA -> onTouchEvent");
        contentStr += "ViewGroupA -> onTouchEvent\n";
        contentA.setText(contentStr);
        return super.onTouchEvent(event);
    }

    public void setContent(TextView contentA, TextView contentB, TextView contentC) {
        this.contentA = contentA;
        this.contentB = contentB;
        this.contentC = contentC;
    }

}
