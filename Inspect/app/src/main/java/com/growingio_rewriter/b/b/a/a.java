/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b.a;

import com.growingio.b.b.a.b;
import com.growingio.b.b.a.x;
import com.growingio.b.b.e;

public class a
extends b {
    private b a;
    private a b;

    public a(b b2, a a2) {
        this.a = b2;
        this.b = a2;
    }

    public a(b b2) {
        this.a = b2;
        this.b = null;
    }

    public static a a(b b2, b b3, b b4) {
        return new a(b2, new a(b3, new a(b4)));
    }

    @Override
    public b a() {
        return this.a;
    }

    @Override
    public b b() {
        return this.b;
    }

    @Override
    public void a(b b2) {
        this.a = b2;
    }

    @Override
    public void b(b b2) {
        this.b = (a)b2;
    }

    public b c() {
        return this.a;
    }

    public void c(b b2) {
        this.a = b2;
    }

    public a d() {
        return this.b;
    }

    public void a(a a2) {
        this.b = a2;
    }

    @Override
    public void a(x x2) throws e {
        x2.b(this);
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(<");
        stringBuffer.append(this.f());
        stringBuffer.append('>');
        a a2 = this;
        while (a2 != null) {
            stringBuffer.append(' ');
            b b2 = a2.a;
            stringBuffer.append(b2 == null ? "<null>" : b2.toString());
            a2 = a2.b;
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    public int e() {
        return a.b(this);
    }

    public static int b(a a2) {
        if (a2 == null) {
            return 0;
        }
        int n2 = 0;
        while (a2 != null) {
            a2 = a2.b;
            ++n2;
        }
        return n2;
    }

    public a a(int n2) {
        a a2 = this;
        while (n2-- > 0) {
            a2 = a2.b;
        }
        return a2;
    }

    public boolean a(b b2, b b3) {
        a a2 = this;
        while (a2 != null) {
            if (a2.a == b3) {
                a2.a = b2;
                return true;
            }
            a2 = a2.b;
        }
        return false;
    }

    public static a a(a a2, b b2) {
        return a.a(a2, new a(b2));
    }

    public static a a(a a2, a a3) {
        if (a2 == null) {
            return a3;
        }
        a a4 = a2;
        while (a4.b != null) {
            a4 = a4.b;
        }
        a4.b = a3;
        return a2;
    }
}

