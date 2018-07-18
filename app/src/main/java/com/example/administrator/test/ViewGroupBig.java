package com.example.administrator.test;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

import static com.example.administrator.test.MainActivity.printLog;

/**
 * Created by xieguofeng on 2018/5/25
 */
public class ViewGroupBig extends RelativeLayout {
    private static final String CLASS_NAME = "ViewGroupBig";

    public ViewGroupBig(Context context) {
        super(context);
    }

    public ViewGroupBig(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        printLog(CLASS_NAME, "dispatchTouchEvent", event);
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        printLog(CLASS_NAME, "onInterceptTouchEvent", event);
        return super.onInterceptTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        printLog(CLASS_NAME, "onTouchEvent", event);
        return super.onTouchEvent(event);
    }
}










