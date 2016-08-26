/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.bp;
import com.growingio.a.a.d.cx;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.fh;
import com.growingio.a.a.d.oP;
import com.growingio.a.a.n.c;
import com.growingio.a.a.n.d;
import com.growingio.a.a.n.e;
import com.growingio.a.a.n.f;
import java.io.IOException;
import java.util.Collection;
import java.util.logging.Logger;

public final class b {
    private static final Logger a = Logger.getLogger(b.class.getName());
    private static final aV<d> b = new c();
    private static final bp c = bp.a(" ").a();
    private static final String d = ".class";
    private final fg<f> e;

    private b(fg<f> fg2) {
        this.e = fg2;
    }

    public static b a(ClassLoader classLoader) throws IOException {
        e e2 = new e();
        e2.a(classLoader);
        return new b(e2.a());
    }

    public fg<f> a() {
        return this.e;
    }

    public fg<d> b() {
        return cx.a(this.e).a(d.class).i();
    }

    public fg<d> c() {
        return cx.a(this.e).a(d.class).a(b).i();
    }

    public fg<d> a(String string) {
        aU.a(string);
        fh<d> fh2 = fg.l();
        oP<d> oP2 = this.c().k_();
        while (oP2.hasNext()) {
            d d2 = oP2.next();
            if (!d2.a().equals(string)) continue;
            fh2.c(d2);
        }
        return fh2.b();
    }

    public fg<d> b(String string) {
        aU.a(string);
        String string2 = string + '.';
        fh<d> fh2 = fg.l();
        oP<d> oP2 = this.c().k_();
        while (oP2.hasNext()) {
            d d2 = oP2.next();
            if (!d2.c().startsWith(string2)) continue;
            fh2.c(d2);
        }
        return fh2.b();
    }

    static String c(String string) {
        int n2 = string.length() - ".class".length();
        return string.substring(0, n2).replace('/', '.');
    }

    static /* synthetic */ bp d() {
        return c;
    }

    static /* synthetic */ Logger e() {
        return a;
    }
}

