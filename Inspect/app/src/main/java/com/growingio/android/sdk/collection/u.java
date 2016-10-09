/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package com.growingio.android.sdk.collection;

import android.view.ViewTreeObserver;
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.collection.t;

class u
implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ t a;

    u(t t2) {
        this.a = t2;
    }

    public void onGlobalLayout() {
        t.a(this.a);
        k.e().f();
    }
}

