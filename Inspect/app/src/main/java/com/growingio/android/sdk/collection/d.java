/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.collection;

import com.growingio.android.sdk.collection.c;

class d
implements Runnable {
    final /* synthetic */ c a;

    d(c c2) {
        this.a = c2;
    }

    @Override
    public void run() {
        if (c.a(this.a) != null) {
            c.a(this.a).clear();
        }
    }
}

