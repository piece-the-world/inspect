/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.aF;
import com.growingio.b.a.aK;
import com.growingio.b.a.aM;

public class aE {
    aM[] a;
    aF b;
    aF[] c;

    public aE(aM[] arraM, aF aF2, aF[] arraF) {
        this.a = arraM == null ? new aM[]{} : arraM;
        this.b = aF2 == null ? aF.c : aF2;
        this.c = arraF == null ? new aF[]{} : arraF;
    }

    public aE(aM[] arraM) {
        this(arraM, null, null);
    }

    public aM[] a() {
        return this.a;
    }

    public aF b() {
        return this.b;
    }

    public aF[] c() {
        return this.c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        aM.a(stringBuffer, this.a);
        stringBuffer.append(" extends ").append(this.b);
        if (this.c.length > 0) {
            stringBuffer.append(" implements ");
            aK.a(stringBuffer, this.c);
        }
        return stringBuffer.toString();
    }

    public String d() {
        int n2;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.a.length > 0) {
            stringBuffer.append('<');
            for (n2 = 0; n2 < this.a.length; ++n2) {
                this.a[n2].a(stringBuffer);
            }
            stringBuffer.append('>');
        }
        this.b.a(stringBuffer);
        for (n2 = 0; n2 < this.c.length; ++n2) {
            this.c[n2].a(stringBuffer);
        }
        return stringBuffer.toString();
    }
}

