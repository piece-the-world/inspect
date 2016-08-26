/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.f;

import com.growingio.a.a.f.p;
import com.growingio.a.a.f.s;
import java.lang.reflect.InvocationTargetException;

class q
implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ p b;

    q(p p2, Object object) {
        this.b = p2;
        this.a = object;
    }

    @Override
    public void run() {
        try {
            this.b.b(this.a);
        }
        catch (InvocationTargetException var1_1) {
            p.a(this.b).a(var1_1.getCause(), p.a(this.b, this.a));
        }
    }
}

