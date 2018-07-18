package com.example.administrator.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private static final String CLASS_NAME = "MainActivity";
    public static HashMap<Integer, String> mEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEvents = new HashMap<>();
        mEvents.put(0, "ACTION_DOWN");
        mEvents.put(1, "ACTION_UP");
        mEvents.put(2, "ACTION_MOVE");
        mEvents.put(3, "ACTION_CANCEL");
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        printLog(CLASS_NAME, "onUserInteraction", null);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        printLog(CLASS_NAME, "dispatchTouchEvent", null);
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        printLog(CLASS_NAME, "onTouchEvent", event);
        return super.onTouchEvent(event);
    }

    public static void printLog(String className, String methodName, MotionEvent event) {
        String eventName = "";
        if (event != null) {
            eventName = mEvents.get(event.getAction());
        }
        Log.e("feng", className + "-" + methodName + "-" + eventName);
    }

}



