/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.O;
import com.growingio.a.a.c.al;
import com.growingio.a.a.c.at;
import com.growingio.a.a.o.a.bU;
import java.util.logging.Level;
import java.util.logging.Logger;

class au
implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ int b;
    final /* synthetic */ al c;
    final /* synthetic */ bU d;
    final /* synthetic */ at e;

    au(at at2, Object object, int n2, al al2, bU bU2) {
        this.e = at2;
        this.a = object;
        this.b = n2;
        this.c = al2;
        this.d = bU2;
    }

    @Override
    public void run() {
        try {
            this.e.a(this.a, this.b, this.c, this.d);
        }
        catch (Throwable var1_1) {
            O.f.log(Level.WARNING, "Exception thrown during refresh", var1_1);
            this.c.a(var1_1);
        }
    }
}

