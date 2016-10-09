/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 */
package com.growingio.android.sdk.collection;

import android.view.ViewTreeObserver;
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.collection.t;

class v
implements ViewTreeObserver.OnScrollChangedListener {
    final /* synthetic */ t a;

    v(t t2) {
        this.a = t2;
    }

    public void onScrollChanged() {
        t.a(this.a);
        k.e().f();
    }
}

