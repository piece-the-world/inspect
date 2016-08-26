/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.K;
import com.growingio.b.ae;
import com.growingio.b.g;
import com.growingio.b.o;
import com.growingio.b.s;

final class m
extends o {
    protected g a;
    private o[] p = null;

    m(String string, g g2) {
        super(string);
        this.a = g2;
    }

    @Override
    public g a() {
        return this.a;
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public int c() {
        int n2 = 16;
        try {
            n2 |= this.e().c() & 7;
        }
        catch (ae var2_2) {
            // empty catch block
        }
        return n2;
    }

    @Override
    public o[] d() throws ae {
        if (this.p == null) {
            Class<?>[] arrclass = Object[].class.getInterfaces();
            this.p = new o[arrclass.length];
            for (int i2 = 0; i2 < arrclass.length; ++i2) {
                this.p[i2] = this.a.f(arrclass[i2].getName());
            }
        }
        return this.p;
    }

    @Override
    public boolean a(o o2) throws ae {
        if (super.a(o2)) {
            return true;
        }
        String string = o2.s();
        if (string.equals("java.lang.Object")) {
            return true;
        }
        o[] arro = this.d();
        for (int i2 = 0; i2 < arro.length; ++i2) {
            if (!arro[i2].a(o2)) continue;
            return true;
        }
        return o2.b() && this.e().a(o2.e());
    }

    @Override
    public o e() throws ae {
        String string = this.s();
        return this.a.f(string.substring(0, string.length() - 2));
    }

    @Override
    public o f() throws ae {
        return this.a.f("java.lang.Object");
    }

    @Override
    public K[] g() {
        try {
            return this.f().g();
        }
        catch (ae var1_1) {
            return super.g();
        }
    }

    @Override
    public K a(String string, String string2) throws ae {
        return this.f().a(string, string2);
    }

    @Override
    public s[] h() {
        try {
            return this.f().h();
        }
        catch (ae var1_1) {
            return super.h();
        }
    }
}

