/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.bg;
import com.growingio.a.a.c.bi;
import com.growingio.a.a.c.bk;

class bj
implements Runnable {
    final /* synthetic */ bk a;
    final /* synthetic */ bi b;

    bj(bi bi2, bk bk2) {
        this.b = bi2;
        this.a = bk2;
    }

    @Override
    public void run() {
        this.b.b.a(this.a);
    }
}

