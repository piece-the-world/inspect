/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 */
package com.growingio.android.sdk.collection;

import android.view.ViewTreeObserver;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.q;

class s
implements ViewTreeObserver.OnScrollChangedListener {
    final /* synthetic */ q a;

    s(q q2) {
        this.a = q2;
    }

    public void onScrollChanged() {
        q.a(this.a);
        j.e().f();
    }
}

