package com.netease.caipiao.datacollection.log;

import android.util.Log;

public class AppLog {
    private static boolean debugSwitchOn;
    private static String message;

    static {
        debugSwitchOn = true;
    }

    public static void debug(String tag, String msg, Object... args) {
        if (debugSwitchOn) {
            message = String.format(msg, args);
            message += callMethodAndLine();
            Log.d(tag, message);
        }
    }

    public static void debug(String tag, String msg, Throwable throwable, Object... args) {
        if (debugSwitchOn) {
            message = String.format(msg, args);
            message += callMethodAndLine();
            Log.d(tag, message, throwable);
        }
    }

    private static String callMethodAndLine() {
        StackTraceElement thisMethodStack = new Exception().getStackTrace()[2];
        return (((" at " + thisMethodStack.getClassName() + ",") + thisMethodStack.getMethodName()) + "(" + thisMethodStack.getFileName()) + ":" + thisMethodStack.getLineNumber() + ") ";
    }

    public static void setDebugSwitchOn(boolean debuggable) {
        debugSwitchOn = debuggable;
    }
}
