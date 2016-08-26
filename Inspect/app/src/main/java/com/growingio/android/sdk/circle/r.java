/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 *  android.view.Window
 */
package com.growingio.android.sdk.circle;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.utils.h;
import com.growingio.android.sdk.utils.m;
import java.util.List;

class r
implements Runnable {
    final /* synthetic */ j a;

    r(j j2) {
        this.a = j2;
    }

    @Override
    public void run() {
        if (this.a.b() && GConfig.o().r()) {
            if (j.k(this.a) != null && j.k(this.a).getVisibility() == 0 && !j.k(this.a).e()) {
                j.k(this.a).setTags(j.j(this.a).d());
                if (this.a.d() != null) {
                    m.a(this.a.d().getWindow().getDecorView(), "", j.l(this.a));
                }
            }
            h.a(this, 1500);
        }
    }
}

