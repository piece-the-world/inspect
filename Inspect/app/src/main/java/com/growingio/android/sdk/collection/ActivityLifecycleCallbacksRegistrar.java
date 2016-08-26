/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 */
package com.growingio.android.sdk.collection;

import android.app.Application;

public interface ActivityLifecycleCallbacksRegistrar {
    public void registerActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks var1);

    public void unRegisterActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks var1);
}

