package com.netease.caipiao.dcsdk;

import android.app.Activity;
import android.view.View;
import com.netease.caipiao.dcsdk.callback.agent.CallbackAgent;

public class MyDataCollection implements DataCollection {
    public void collectGesture(Activity activity) {
    }

    public void restoreGesture(Activity activity) {
    }

    public void collectCallbacks(View view) {
        CallbackAgent.replaceCallbacks(view);
    }

    public void restoreCallbacks(View view) {
        CallbackAgent.restoreCallbacks(view);
    }
}
