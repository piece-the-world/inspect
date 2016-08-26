/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.cb;
import java.util.concurrent.locks.Condition;

public abstract class cc {
    final cb b;
    final Condition c;
    int d = 0;
    cc e;

    protected cc(cb cb2) {
        this.b = aU.a(cb2, (Object)"monitor");
        this.c = cb.a(cb2).newCondition();
    }

    public abstract boolean a();
}

