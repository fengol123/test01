package com.example.administrator.test;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import static com.example.administrator.test.MainActivity.printLog;

/**
 * Created by xieguofeng on 2018/6/13
 */
public class ViewChild extends View {
    private static final String CLASS_NAME = "ViewChild";

    public ViewChild(Context context) {
        super(context);
    }

    public ViewChild(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        printLog(CLASS_NAME, "dispatchTouchEvent", event);
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        printLog(CLASS_NAME, "onTouchEvent", event);
        return true;
    }
}










