package com.netease.caipiao.dcsdk.log;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.netease.caipiao.dcsdk.callback.type.ViewInfo;
import com.netease.caipiao.dcsdk.constants.Constants;
import com.netease.caipiao.dcsdk.event.Event;

public class Logger {
    private static boolean debugSwitchOn;
    private static String message;

    static {
        debugSwitchOn = false;
    }

    public static void debug(String tag, String msg, Object... args) {
        if (debugSwitchOn) {
            message = String.format(msg, args);
            message += callMethodAndLine();
            Log.d(tag, message);
        }
    }

    public static void debug(String tag, String prefix, Event object) {
        if (debugSwitchOn && object != null) {
            message = prefix + "," + object.toString();
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

    public static void printViewTree(View view, int hierarchy, boolean firstCall) {
        if (isDebugSwitchOn() && view != null) {
            int i;
            if (firstCall) {
                debug(Tags.VIEW_TREE, "----------------------------------------------------------------------------------------------------------", new Object[0]);
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (i = 0; i < hierarchy; i++) {
                stringBuilder.append("*");
            }
            int index = -1;
            if (view.getTag(Constants.TAG_ID_VIEWINFO) instanceof ViewInfo) {
                index = ((ViewInfo) view.getTag(Constants.TAG_ID_VIEWINFO)).getIndex();
            }
            view.getLocationOnScreen(new int[2]);
            debug(Tags.VIEW_TREE, stringBuilder.toString() + "(%d)" + view.getClass().getSimpleName() + "[%d,%d][%d,%d]", Integer.valueOf(index), Integer.valueOf(location[0]), Integer.valueOf(location[1]), Integer.valueOf(location[0] + view.getWidth()), Integer.valueOf(location[1] + view.getHeight()));
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (i = 0; i < viewGroup.getChildCount(); i++) {
                    printViewTree(viewGroup.getChildAt(i), hierarchy + 3, false);
                }
            }
        }
    }

    private static String callMethodAndLine() {
        StackTraceElement thisMethodStack = new Exception().getStackTrace()[2];
        return (((" at " + thisMethodStack.getClassName() + ",") + thisMethodStack.getMethodName()) + "(" + thisMethodStack.getFileName()) + ":" + thisMethodStack.getLineNumber() + ") ";
    }

    public static void setDebugSwitchOn(boolean debuggable) {
        debugSwitchOn = debuggable;
    }

    public static boolean isDebugSwitchOn() {
        return debugSwitchOn;
    }
}
