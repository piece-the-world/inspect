/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.util.Pair
 */
package com.growingio.android.sdk.circle;

import android.app.Activity;
import android.util.Pair;
import com.growingio.android.sdk.circle.ai;
import com.growingio.android.sdk.circle.k;

class l
implements ai {
    final /* synthetic */ k a;

    l(k k2) {
        this.a = k2;
    }

    @Override
    public void a(Pair pair) {
        if (this.a.d() != null) {
            if ((Integer)pair.first == 200) {
                k.a(this.a);
            } else {
                k.a(this.a, pair);
            }
        }
    }
}

