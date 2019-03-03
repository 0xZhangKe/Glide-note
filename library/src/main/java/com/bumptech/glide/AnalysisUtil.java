package com.bumptech.glide;

import android.util.Log;

/**
 * Created by ZhangKe on 2019/1/17.
 */
public class AnalysisUtil {

    private static final String TAG = "AnalysisUtil";

    public static void printStackTrace(){
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuilder traceBuilder = new StringBuilder();
        for(StackTraceElement e : stackTrace){
            traceBuilder.append(e.toString());
            traceBuilder.append("\n");
        }
        Log.d(TAG, traceBuilder.toString());
    }
}
