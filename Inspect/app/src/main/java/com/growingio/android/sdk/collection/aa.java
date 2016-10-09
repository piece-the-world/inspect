/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.growingio.android.sdk.collection;

import android.util.Pair;
import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.collection.t;

class aa
implements Runnable {
    final /* synthetic */ t a;

    aa(t t2) {
        this.a = t2;
    }

    @Override
    public void run() {
        if (t.b(this.a) != null) {
            this.a.a((g)t.b((t)this.a).second);
            t.a(this.a, null);
        }
        this.a.e();
    }
}

