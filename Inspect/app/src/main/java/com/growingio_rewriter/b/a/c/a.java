/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.c;

import com.growingio.b.a.c.b;
import com.growingio.b.a.i;

public class a {
    protected int e;
    protected int f;
    protected int g;
    protected a[] h;
    protected boolean i;
    protected b j;

    protected a(int n2) {
        this.e = n2;
        this.f = 0;
        this.g = 0;
    }

    public static a a(a[] arra, int n2) throws i {
        for (int i2 = 0; i2 < arra.length; ++i2) {
            int n3 = arra[i2].e;
            if (n3 > n2 || n2 >= n3 + arra[i2].f) continue;
            return arra[i2];
        }
        throw new i("no basic block at " + n2);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = this.getClass().getName();
        int n2 = string.lastIndexOf(46);
        stringBuffer.append(n2 < 0 ? string : string.substring(n2 + 1));
        stringBuffer.append("[");
        this.a(stringBuffer);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    protected void a(StringBuffer stringBuffer) {
        stringBuffer.append("pos=").append(this.e).append(", len=").append(this.f).append(", in=").append(this.g).append(", exit{");
        if (this.h != null) {
            for (int i2 = 0; i2 < this.h.length; ++i2) {
                stringBuffer.append(this.h[i2].e).append(",");
            }
        }
        stringBuffer.append("}, {");
        b b2 = this.j;
        while (b2 != null) {
            stringBuffer.append("(").append(b2.b.e).append(", ").append(b2.c).append("), ");
            b2 = b2.a;
        }
        stringBuffer.append("}");
    }
}

