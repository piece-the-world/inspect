/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Bundle
 */
package com.tendcloud.tenddata;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.dh;
import com.tendcloud.tenddata.eu;
import com.tendcloud.tenddata.ew;
import com.tendcloud.tenddata.fu;

@TargetApi(value=14)
class du
implements Application.ActivityLifecycleCallbacks {
    dh a;

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        fu.b(activity, activity.getLocalClassName(), false);
        if (this.a != null) {
            this.a.b(activity);
            if (this.a.b()) {
                ew.a().d();
            }
        }
    }

    public void onActivityResumed(Activity activity) {
        fu.a(activity, activity.getLocalClassName(), false);
        ew.a().b();
        ew.a().c();
        if (this.a != null) {
            this.a.a(activity);
        }
        eu.a();
        ab.h = true;
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    void a(dh dh2) {
        this.a = dh2;
    }
}

