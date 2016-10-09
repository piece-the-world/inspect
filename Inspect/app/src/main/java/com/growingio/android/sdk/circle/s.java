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
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.utils.i;
import java.util.List;

class s
implements Runnable {
    final /* synthetic */ k a;

    s(k k2) {
        this.a = k2;
    }

    @Override
    public void run() {
        if (this.a.b() && GConfig.q().s()) {
            if (k.k(this.a) != null && k.k(this.a).getVisibility() == 0 && !k.k(this.a).e()) {
                k.k(this.a).setTags(k.j(this.a).d());
                if (this.a.d() != null) {
                    com.growingio.android.sdk.utils.k.a(this.a.d().getWindow().getDecorView(), "", k.l(this.a));
                }
            }
            i.a(this, 1500);
        }
    }
}

