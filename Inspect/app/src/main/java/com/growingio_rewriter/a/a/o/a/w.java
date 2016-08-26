/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.j;
import java.util.concurrent.locks.LockSupport;

final class w {
    static final w a = new w(false);
    volatile Thread b;
    volatile w c;

    w(boolean bl2) {
    }

    w() {
        j.e().a(this, Thread.currentThread());
    }

    void a(w w2) {
        j.e().a(this, w2);
    }

    void a() {
        Thread thread = this.b;
        if (thread != null) {
            this.b = null;
            LockSupport.unpark(thread);
        }
    }
}

