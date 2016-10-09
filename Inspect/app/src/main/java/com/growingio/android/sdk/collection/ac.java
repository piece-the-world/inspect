/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.growingio.android.sdk.collection;

import android.util.Pair;
import com.growingio.android.sdk.a.b;
import com.growingio.android.sdk.collection.ab;
import com.growingio.android.sdk.collection.ad;
import com.growingio.android.sdk.collection.t;

class ac
extends b {
    final /* synthetic */ ab a;

    ac(ab ab2) {
        this.a = ab2;
    }

    protected void a(Pair pair) {
        if ((Integer)pair.first != 200 && (Integer)pair.first != 304 && t.g() < 1) {
            t.g(this.a.a).postDelayed((Runnable)new ad(this), 5000);
        } else {
            t.c(true);
        }
        t.a(this.a.a, null);
    }

    protected /* synthetic */ void onPostExecute(Object object) {
        this.a((Pair)object);
    }
}

