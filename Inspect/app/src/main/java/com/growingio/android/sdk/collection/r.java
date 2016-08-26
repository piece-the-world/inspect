/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package com.growingio.android.sdk.collection;

import android.view.ViewTreeObserver;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.q;

class r
implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ q a;

    r(q q2) {
        this.a = q2;
    }

    public void onGlobalLayout() {
        q.a(this.a);
        j.e().f();
    }
}

