/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.a;

import com.growingio.b.a.a.j;
import com.growingio.b.a.as;
import com.growingio.b.a.c.a;
import com.growingio.b.a.c.b;
import java.util.ArrayList;

public class i
extends a {
    public Object a = null;
    int b;
    as c;
    i[] d;

    i(int n2, as as2) {
        super(n2);
        this.c = as2;
    }

    @Override
    protected void a(StringBuffer stringBuffer) {
        super.a(stringBuffer);
        stringBuffer.append(", incoming{");
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            stringBuffer.append(this.d[i2].e).append(", ");
        }
        stringBuffer.append("}");
    }

    a[] a() {
        return this.h;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.e;
    }

    public int d() {
        return this.f;
    }

    public int e() {
        return this.g;
    }

    public i a(int n2) {
        return this.d[n2];
    }

    public int f() {
        return this.h == null ? 0 : this.h.length;
    }

    public i b(int n2) {
        return (i)this.h[n2];
    }

    public j[] g() {
        ArrayList<j> arrayList = new ArrayList<j>();
        b b2 = this.j;
        while (b2 != null) {
            arrayList.add(new j(b2));
            b2 = b2.a;
        }
        return arrayList.toArray(new j[arrayList.size()]);
    }
}

