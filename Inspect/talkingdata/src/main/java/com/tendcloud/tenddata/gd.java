/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.tendcloud.tenddata;

import android.app.Activity;
import android.content.Context;
import com.tendcloud.tenddata.cn;
import com.tendcloud.tenddata.fu;
import java.lang.reflect.Method;

static final class gd
implements cn {
    final /* synthetic */ Context a;

    gd(Context context) {
        this.a = context;
    }

    @Override
    public void a(Object object, Method method, Object[] arrobject, Object object2) {
    }

    @Override
    public void a(Object object, Method method, Object[] arrobject) {
        String string = method.getName();
        if (this.a instanceof Activity) {
            if (string.equalsIgnoreCase("activityPaused")) {
                fu.a((Activity)this.a);
            } else if (string.equalsIgnoreCase("activityIdle")) {
                fu.b((Activity)this.a);
            }
        }
    }
}

