/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.growingio.android.sdk.circle;

import android.util.Pair;
import com.growingio.android.sdk.circle.ch;
import com.growingio.android.sdk.collection.ag;

class cj
implements Runnable {
    final /* synthetic */ Pair a;
    final /* synthetic */ ch b;

    cj(ch ch2, Pair pair) {
        this.b = ch2;
        this.a = pair;
    }

    @Override
    public void run() {
        ag.a().a(new String((byte[])this.a.second));
    }
}

