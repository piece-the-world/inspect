/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.aI;
import com.growingio.b.a.aJ;
import com.growingio.b.a.aL;

public class aF
extends aJ {
    String a;
    aL[] b;
    public static aF c = new aF("java.lang.Object", null);

    static aF a(String string, int n2, int n3, aL[] arraL, aF aF2) {
        if (aF2 == null) {
            return new aF(string, n2, n3, arraL);
        }
        return new aI(string, n2, n3, arraL, aF2);
    }

    aF(String string, int n2, int n3, aL[] arraL) {
        this.a = string.substring(n2, n3).replace('/', '.');
        this.b = arraL;
    }

    public aF(String string, aL[] arraL) {
        this.a = string;
        this.b = arraL;
    }

    public aF(String string) {
        this(string, null);
    }

    public String a() {
        return this.a;
    }

    public aL[] b() {
        return this.b;
    }

    public aF c() {
        return null;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        aF aF2 = this.c();
        if (aF2 != null) {
            stringBuffer.append(aF2.toString()).append('.');
        }
        return this.c(stringBuffer);
    }

    private String c(StringBuffer stringBuffer) {
        stringBuffer.append(this.a);
        if (this.b != null) {
            stringBuffer.append('<');
            int n2 = this.b.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (i2 > 0) {
                    stringBuffer.append(", ");
                }
                stringBuffer.append(this.b[i2].toString());
            }
            stringBuffer.append('>');
        }
        return stringBuffer.toString();
    }

    @Override
    public String d() {
        StringBuffer stringBuffer = new StringBuffer();
        aF aF2 = this.c();
        if (aF2 != null) {
            stringBuffer.append(aF2.d()).append('$');
        }
        return this.c(stringBuffer);
    }

    @Override
    void a(StringBuffer stringBuffer) {
        stringBuffer.append('L');
        this.b(stringBuffer);
        stringBuffer.append(';');
    }

    void b(StringBuffer stringBuffer) {
        aF aF2 = this.c();
        if (aF2 != null) {
            aF2.b(stringBuffer);
            stringBuffer.append('$');
        }
        stringBuffer.append(this.a.replace('.', '/'));
        if (this.b != null) {
            aL.a(stringBuffer, this.b);
        }
    }
}

