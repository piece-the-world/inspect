/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.collection;

import com.growingio.android.sdk.collection.ab;
import com.growingio.android.sdk.collection.ac;
import com.growingio.android.sdk.collection.t;

class ad
implements Runnable {
    final /* synthetic */ ac a;

    ad(ac ac2) {
        this.a = ac2;
    }

    @Override
    public void run() {
        t.h();
        ab.a(this.a.a);
    }
}

