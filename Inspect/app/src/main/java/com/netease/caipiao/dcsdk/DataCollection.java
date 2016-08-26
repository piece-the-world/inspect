package com.netease.caipiao.dcsdk;

import android.app.Activity;
import android.view.View;

public interface DataCollection {
    void collectCallbacks(View view);

    void collectGesture(Activity activity);

    void restoreCallbacks(View view);

    void restoreGesture(Activity activity);
}
