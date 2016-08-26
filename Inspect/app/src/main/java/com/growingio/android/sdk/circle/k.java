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
import com.growingio.android.sdk.circle.bw;
import com.growingio.android.sdk.circle.j;

class k
implements bw {
    final /* synthetic */ j a;

    k(j j2) {
        this.a = j2;
    }

    @Override
    public void a(Pair pair) {
        if (this.a.d() != null) {
            if ((Integer)pair.first == 200) {
                j.a(this.a);
            } else {
                j.a(this.a, pair);
            }
        }
    }
}

