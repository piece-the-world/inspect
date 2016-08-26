/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.a;

import com.growingio.b.a.a.v;

public class m {
    private v[] a;
    private v[] b;
    private int c;
    private boolean d;
    private boolean e;

    public m(int n2, int n3) {
        this.a = new v[n2];
        this.b = new v[n3];
    }

    public v a(int n2) {
        return this.a[n2];
    }

    public void a(int n2, v v2) {
        this.a[n2] = v2;
    }

    public v b(int n2) {
        return this.b[n2];
    }

    public void b(int n2, v v2) {
        this.b[n2] = v2;
    }

    public void a() {
        this.c = 0;
    }

    public int b() {
        return this.c - 1;
    }

    public int c() {
        return this.a.length;
    }

    public v d() {
        if (this.c < 1) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return this.b[this.c - 1];
    }

    public v e() {
        if (this.c < 1) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return this.b[--this.c];
    }

    public void a(v v2) {
        this.b[this.c++] = v2;
    }

    public m f() {
        m m2 = new m(this.a.length, this.b.length);
        System.arraycopy(this.a, 0, m2.a, 0, this.a.length);
        System.arraycopy(this.b, 0, m2.b, 0, this.b.length);
        m2.c = this.c;
        return m2;
    }

    public m g() {
        m m2 = new m(this.a.length, this.b.length);
        System.arraycopy(this.b, 0, m2.b, 0, this.b.length);
        m2.c = this.c;
        return m2;
    }

    public boolean a(m m2) {
        boolean bl2 = false;
        if (this.c != m2.c) {
            throw new RuntimeException("Operand stacks could not be merged, they are different sizes!");
        }
        for (int i2 = 0; i2 < this.c; ++i2) {
            if (this.b[i2] == null) continue;
            v v2 = this.b[i2];
            v v3 = v2.c(m2.b[i2]);
            if (v3 == v.m) {
                throw new RuntimeException("Operand stacks could not be merged due to differing primitive types: pos = " + i2);
            }
            this.b[i2] = v3;
            if (v3.equals(v2) && !v3.b()) continue;
            bl2 = true;
        }
        return bl2;
    }

    public boolean b(m m2) {
        boolean bl2 = false;
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (this.a[i2] != null) {
                v v2;
                v v3 = this.a[i2];
                this.a[i2] = v2 = v3.c(m2.a[i2]);
                if (v2.equals(v3) && !v2.b()) continue;
                bl2 = true;
                continue;
            }
            if (m2.a[i2] == null) continue;
            this.a[i2] = m2.a[i2];
            bl2 = true;
        }
        return bl2 |= this.a(m2);
    }

    public String toString() {
        int n2;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("locals = [");
        for (n2 = 0; n2 < this.a.length; ++n2) {
            stringBuffer.append(this.a[n2] == null ? "empty" : this.a[n2].toString());
            if (n2 >= this.a.length - 1) continue;
            stringBuffer.append(", ");
        }
        stringBuffer.append("] stack = [");
        for (n2 = 0; n2 < this.c; ++n2) {
            stringBuffer.append(this.b[n2]);
            if (n2 >= this.c - 1) continue;
            stringBuffer.append(", ");
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    boolean h() {
        return this.d;
    }

    void a(boolean bl2) {
        this.d = bl2;
    }

    boolean i() {
        return this.e;
    }

    void b(boolean bl2) {
        this.e = bl2;
    }
}

