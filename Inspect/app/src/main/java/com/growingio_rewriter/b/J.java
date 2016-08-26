/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.I;
import com.growingio.b.o;
import com.growingio.b.r;

class J
extends I {
    private I a;
    private I b;
    private I e;

    @Override
    protected void a(StringBuffer stringBuffer) {
    }

    @Override
    public boolean a(String string) {
        return false;
    }

    @Override
    public Object a(Class class_) throws ClassNotFoundException {
        return null;
    }

    @Override
    public Object[] e() throws ClassNotFoundException {
        return null;
    }

    @Override
    public byte[] d(String string) {
        return null;
    }

    @Override
    public Object[] f() {
        return null;
    }

    @Override
    public int d() {
        return 0;
    }

    @Override
    public String q() {
        return null;
    }

    @Override
    public String k() {
        return null;
    }

    @Override
    public void a(String string, byte[] arrby) {
    }

    @Override
    public void a(int n2) {
    }

    @Override
    public String l() {
        return null;
    }

    @Override
    public void b(String string) {
    }

    J(r r2) {
        super(r2);
        this.a = this;
        this.b = this;
        this.e = this;
        this.e.c = this;
    }

    I a() {
        return this;
    }

    I b() {
        return this.a;
    }

    I c() {
        return this.a;
    }

    I g() {
        return this.b;
    }

    I i() {
        return this.b;
    }

    I j() {
        return this.e;
    }

    void a(I i2) {
        i2.c = this.a.c;
        this.a.c = i2;
        if (this.a == this.b) {
            this.b = i2;
            if (this.a == this.e) {
                this.e = i2;
            }
        }
        this.a = i2;
    }

    void b(I i2) {
        i2.c = this.b.c;
        this.b.c = i2;
        if (this.b == this.e) {
            this.e = i2;
        }
        this.b = i2;
    }

    void c(I i2) {
        i2.c = this;
        this.e.c = i2;
        this.e = i2;
    }

    static int a(I i2, I i3) {
        int n2 = 0;
        while (i2 != i3) {
            ++n2;
            i2 = i2.c;
        }
        return n2;
    }

    void d(I i2) {
        I i3;
        I i4 = this;
        while ((i3 = i4.c) != this) {
            if (i3 == i2) {
                i4.c = i3.c;
                if (i3 == this.a) {
                    this.a = i4;
                }
                if (i3 == this.b) {
                    this.b = i4;
                }
                if (i3 != this.e) break;
                this.e = i4;
                break;
            }
            i4 = i4.c;
        }
    }
}

