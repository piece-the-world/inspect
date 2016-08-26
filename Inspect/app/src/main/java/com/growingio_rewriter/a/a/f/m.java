/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.f;

import com.growingio.a.a.b.aH;
import com.growingio.a.a.b.aJ;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.f.c;
import com.growingio.a.a.f.d;
import com.growingio.a.a.f.n;
import com.growingio.a.a.f.p;
import com.growingio.a.a.f.s;
import com.growingio.a.a.f.t;
import com.growingio.a.a.f.u;
import com.growingio.a.a.o.a.cd;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

public class m {
    private static final Logger a = Logger.getLogger(m.class.getName());
    private final String b;
    private final Executor c;
    private final t d;
    private final u e;
    private final d f;

    public m() {
        this("default");
    }

    public m(String string) {
        this(string, cd.c(), d.a(), n.a);
    }

    public m(t t2) {
        this("default", cd.c(), d.a(), t2);
    }

    m(String string, Executor executor, d d2, t t2) {
        this.e = new u(this);
        this.b = aU.a(string);
        this.c = aU.a(executor);
        this.f = aU.a(d2);
        this.d = aU.a(t2);
    }

    public final String a() {
        return this.b;
    }

    final Executor b() {
        return this.c;
    }

    void a(Throwable throwable, s s2) {
        aU.a(throwable);
        aU.a(s2);
        try {
            this.d.a(throwable, s2);
        }
        catch (Throwable var3_3) {
            a.log(Level.SEVERE, String.format(Locale.ROOT, "Exception %s thrown while handling exception: %s", var3_3, throwable), var3_3);
        }
    }

    public void a(Object object) {
        this.e.a(object);
    }

    public void b(Object object) {
        this.e.b(object);
    }

    public void c(Object object) {
        Iterator<p> iterator = this.e.c(object);
        if (iterator.hasNext()) {
            this.f.a(object, iterator);
        } else if (!(object instanceof c)) {
            this.c(new c(this, object));
        }
    }

    public String toString() {
        return aH.a(this).a(this.b).toString();
    }
}

