/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.l;

import com.growingio.a.a.b.aH;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.l.d;
import java.net.Inet4Address;

public final class e {
    private final Inet4Address a;
    private final Inet4Address b;
    private final int c;
    private final int d;

    public e(Inet4Address inet4Address, Inet4Address inet4Address2, int n2, int n3) {
        aU.a(n2 >= 0 && n2 <= 65535, "port '%s' is out of range (0 <= port <= 0xffff)", n2);
        aU.a(n3 >= 0 && n3 <= 65535, "flags '%s' is out of range (0 <= flags <= 0xffff)", n3);
        this.a = aH.a(inet4Address, d.a());
        this.b = aH.a(inet4Address2, d.a());
        this.c = n2;
        this.d = n3;
    }

    public Inet4Address a() {
        return this.a;
    }

    public Inet4Address b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }
}

