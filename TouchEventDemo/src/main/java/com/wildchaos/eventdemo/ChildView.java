package com.wildchaos.eventdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by 孙俊伟 on 2015/10/15.
 */
public class ChildView extends View {

    private TextView textView;

    public ChildView(Context context) {
        super(context);
    }

    public ChildView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("sjw", "ChildView -> onTouchEvent");
        textView.setText("ChildView -> onTouchEvent");
        return super.onTouchEvent(event);
    }

    public void setContent(TextView textView) {
        this.textView = textView;
    }

}
