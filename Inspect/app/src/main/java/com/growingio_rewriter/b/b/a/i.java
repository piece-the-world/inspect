/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.b.a;

import com.growingio.b.b.a.a;
import com.growingio.b.b.a.b;
import com.growingio.b.b.a.v;
import com.growingio.b.b.a.x;
import com.growingio.b.b.e;
import com.growingio.b.b.z;

public class i
extends a
implements z {
    protected int a;
    protected int b;
    protected int c;
    protected String d;

    public i(int n2, int n3) {
        super(null);
        this.a = n2;
        this.b = n3;
        this.c = -1;
        this.d = null;
    }

    public i(a a2, int n2) {
        super(null);
        this.a = 307;
        this.b = n2;
        this.c = -1;
        this.d = i.a(a2, '/');
    }

    public i(int n2, String string, int n3, int n4, v v2) {
        super(null);
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = string;
        this.a(v2);
        i.a((a)this, null);
    }

    public i a(v v2, int n2, b b2) {
        i i2 = new i(this.a, this.b + n2);
        i2.d = this.d;
        i2.a(v2);
        i.a((a)i2, b2);
        return i2;
    }

    public int g() {
        return this.a;
    }

    public int h() {
        return this.b;
    }

    public void b(int n2) {
        this.b += n2;
    }

    public String i() {
        return this.d;
    }

    public void a(String string) {
        this.d = string;
    }

    public v j() {
        return (v)this.a();
    }

    public void a(v v2) {
        this.a(v2);
    }

    public b k() {
        a a2 = this.d();
        if (a2 != null) {
            return a2.c();
        }
        return null;
    }

    public void c(int n2) {
        this.c = n2;
    }

    public int l() {
        return this.c;
    }

    @Override
    public String f() {
        return "decl";
    }

    @Override
    public void a(x x2) throws e {
        x2.b(this);
    }

    public static String a(a a2, char c2) {
        if (a2 == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        i.a(stringBuffer, a2, c2);
        return stringBuffer.toString();
    }

    private static void a(StringBuffer stringBuffer, a a2, char c2) {
        do {
            b b2;
            if ((b2 = a2.c()) instanceof v) {
                stringBuffer.append(((v)b2).d());
            } else if (b2 instanceof a) {
                i.a(stringBuffer, (a)b2, c2);
            }
            a2 = a2.d();
            if (a2 == null) break;
            stringBuffer.append(c2);
        } while (true);
    }
}

