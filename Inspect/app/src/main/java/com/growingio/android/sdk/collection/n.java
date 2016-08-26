/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 */
package com.growingio.android.sdk.collection;

import android.app.Application;
import com.growingio.android.sdk.collection.ActivityLifecycleCallbacksRegistrar;
import com.growingio.android.sdk.collection.Configuration;
import com.growingio.android.sdk.collection.GrowingIO;

class n
implements ActivityLifecycleCallbacksRegistrar {
    final /* synthetic */ Configuration a;
    final /* synthetic */ GrowingIO b;

    n(GrowingIO growingIO, Configuration configuration) {
        this.b = growingIO;
        this.a = configuration;
    }

    @Override
    public void registerActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.a.a.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    @Override
    public void unRegisterActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.a.a.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}

