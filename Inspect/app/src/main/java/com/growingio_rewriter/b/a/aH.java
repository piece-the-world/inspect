/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.aD;
import com.growingio.b.a.aJ;
import com.growingio.b.a.aK;
import com.growingio.b.a.aM;

public class aH {
    aM[] a;
    aK[] b;
    aK c;
    aJ[] d;

    public aH(aM[] arraM, aK[] arraK, aK aK2, aJ[] arraJ) {
        this.a = arraM == null ? new aM[]{} : arraM;
        this.b = arraK == null ? new aK[]{} : arraK;
        this.c = aK2 == null ? new aD("void") : aK2;
        this.d = arraJ == null ? new aJ[]{} : arraJ;
    }

    public aM[] a() {
        return this.a;
    }

    public aK[] b() {
        return this.b;
    }

    public aK c() {
        return this.c;
    }

    public aJ[] d() {
        return this.d;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        aM.a(stringBuffer, this.a);
        stringBuffer.append(" (");
        aK.a(stringBuffer, this.b);
        stringBuffer.append(") ");
        stringBuffer.append(this.c);
        if (this.d.length > 0) {
            stringBuffer.append(" throws ");
            aK.a(stringBuffer, this.d);
        }
        return stringBuffer.toString();
    }

    public String e() {
        int n2;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.a.length > 0) {
            stringBuffer.append('<');
            for (n2 = 0; n2 < this.a.length; ++n2) {
                this.a[n2].a(stringBuffer);
            }
            stringBuffer.append('>');
        }
        stringBuffer.append('(');
        for (n2 = 0; n2 < this.b.length; ++n2) {
            this.b[n2].a(stringBuffer);
        }
        stringBuffer.append(')');
        this.c.a(stringBuffer);
        if (this.d.length > 0) {
            for (n2 = 0; n2 < this.d.length; ++n2) {
                stringBuffer.append('^');
                this.d[n2].a(stringBuffer);
            }
        }
        return stringBuffer.toString();
    }
}

