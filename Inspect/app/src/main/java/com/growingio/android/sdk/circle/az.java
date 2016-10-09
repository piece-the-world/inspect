/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.growingio.android.sdk.circle;

import android.util.Pair;
import com.growingio.android.sdk.circle.ax;
import com.growingio.android.sdk.collection.ak;

class az
implements Runnable {
    final /* synthetic */ Pair a;
    final /* synthetic */ ax b;

    az(ax ax2, Pair pair) {
        this.b = ax2;
        this.a = pair;
    }

    @Override
    public void run() {
        ak.a().a(new String((byte[])this.a.second));
    }
}

