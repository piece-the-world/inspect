/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile.a;

import com.growingio.agent.compile.c;
import com.growingio.agent.compile.k;
import com.growingio.agent.compile.m;
import com.growingio.d.a.a.j;
import com.growingio.d.a.a.o;
import com.growingio.d.a.r;
import com.growingio.d.a.u;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.Iterator;

final class p
extends j {
    private final k a;
    private final String b;
    private boolean c = false;
    private final m z;
    private final String A;
    private boolean B = false;

    public p(r r2, int n2, String string, String string2, k k2, m m2) {
        super(327680, r2, n2, string, string2);
        this.A = string;
        this.b = string2;
        this.a = k2;
        this.z = m2;
    }

    @Override
    public void a(int n2, String string, String string2, String string3, boolean bl2) {
        if (n2 == 186) {
            this.z.b(MessageFormat.format("[{0}] INVOKEDYNAMIC instruction cannot be instrumented", this.a.h().replaceAll("/", ".")));
            super.a(n2, string, string2, string3, bl2);
        } else if (!this.c(n2, string, string2, string3, bl2) && !this.b(n2, string, string2, string3, bl2)) {
            super.a(n2, string, string2, string3, bl2);
        }
    }

    @Override
    public void a(int n2, String string) {
        if (n2 == 187) {
            this.B = true;
            this.c = false;
        }
        super.a(n2, string);
    }

    @Override
    public void a_(int n2) {
        if (n2 == 89) {
            this.c = true;
        }
        super.a_(n2);
    }

    private boolean b(int n2, String string, String string2, String string3, boolean bl2) {
        c c2 = new c(string, string2, string3);
        c c3 = this.a.a(c2);
        if (c3 != null) {
            this.z.a(MessageFormat.format("[{0}] wrapping call to {1} with {2}", this.a.h().replaceAll("/", "."), c2.toString(), c3.toString()));
            super.a(n2, string, string2, string3, bl2);
            super.a(184, c3.b(), c3.c(), c3.d(), false);
            this.a.e();
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean c(int n2, String string, String string2, String string3, boolean bl2) {
        boolean bl3;
        Collection<c> collection = this.a.a(string, string2, string3);
        if (collection.isEmpty()) {
            return false;
        }
        c c2 = new c(string, string2, string3);
        Iterator<c> iterator = collection.iterator();
        if (!iterator.hasNext()) {
            return false;
        }
        c c3 = iterator.next();
        boolean bl4 = bl3 = n2 == 183 && !string.equals(this.a.h()) && this.A.equals(string2) && this.b.equals(string3);
        if (bl3) {
            this.z.a(MessageFormat.format("[{0}] skipping call site replacement for super call in overriden method: {1}:{2}", this.a.h().replaceAll("/", "."), this.A, this.b));
            return false;
        }
        if (n2 == 183 && string2.equals("<init>")) {
            o o2 = new o(string2, string3);
            if (this.a.l() != null && this.a.l().equals(string)) {
                this.z.a(MessageFormat.format("[{0}] skipping call site replacement for class extending {1}", this.a.i(), this.a.j()));
                return false;
            }
            this.z.a(MessageFormat.format("[{0}] tracing constructor call to {1} - {2}", this.a.i(), c2.toString(), string));
            int[] arrn = new int[o2.d().length];
            for (int i2 = arrn.length - 1; i2 >= 0; --i2) {
                arrn[i2] = this.k(o2.d()[i2]);
                this.g(arrn[i2]);
            }
            this.a_(87);
            if (this.B && this.c) {
                this.a_(87);
            }
            for (int n3 : arrn) {
                this.f(n3);
            }
            super.a(184, c3.b(), c3.c(), c3.d(), false);
            if (this.B && !this.c) {
                this.a_(87);
            }
        } else if (n2 == 184) {
            this.z.a(MessageFormat.format("[{0}] replacing static call to {1} with {2}", this.a.h().replaceAll("/", "."), c2.toString(), c3.toString()));
            super.a(184, c3.b(), c3.c(), c3.d(), false);
        } else {
            o o3 = new o(c3.c(), c3.d());
            this.z.a(MessageFormat.format("[{0}] replacing call to {1} with {2} (with instance check)", this.a.h().replaceAll("/", "."), c2.toString(), c3.toString()));
            o o4 = new o(string2, string3);
            int[] arrn = new int[o4.d().length];
            for (int i3 = arrn.length - 1; i3 >= 0; --i3) {
                arrn[i3] = this.k(o4.d()[i3]);
                this.g(arrn[i3]);
            }
            this.i();
            this.j(o3.d()[0]);
            com.growingio.d.a.p p2 = new com.growingio.d.a.p();
            this.a(154, p2);
            for (int n4 : arrn) {
                this.f(n4);
            }
            super.a(n2, string, string2, string3, bl2);
            com.growingio.d.a.p p3 = new com.growingio.d.a.p();
            this.a(167, p3);
            this.a(p2);
            this.i(o3.d()[0]);
            for (int n5 : arrn) {
                this.f(n5);
            }
            super.a(184, c3.b(), c3.c(), c3.d(), false);
            this.a(p3);
        }
        this.a.e();
        return true;
    }
}

