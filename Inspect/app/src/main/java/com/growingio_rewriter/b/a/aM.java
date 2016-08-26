/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.aJ;

public class aM {
    String a;
    aJ b;
    aJ[] c;

    aM(String string, int n2, int n3, aJ aJ2, aJ[] arraJ) {
        this.a = string.substring(n2, n3);
        this.b = aJ2;
        this.c = arraJ;
    }

    public aM(String string, aJ aJ2, aJ[] arraJ) {
        this.a = string;
        this.b = aJ2;
        this.c = arraJ == null ? new aJ[0] : arraJ;
    }

    public aM(String string) {
        this(string, null, null);
    }

    public String a() {
        return this.a;
    }

    public aJ b() {
        return this.b;
    }

    public aJ[] c() {
        return this.c;
    }

    public String toString() {
        int n2;
        StringBuffer stringBuffer = new StringBuffer(this.a());
        if (this.b != null) {
            stringBuffer.append(" extends ").append(this.b.toString());
        }
        if ((n2 = this.c.length) > 0) {
            for (int i2 = 0; i2 < n2; ++i2) {
                if (i2 > 0 || this.b != null) {
                    stringBuffer.append(" & ");
                } else {
                    stringBuffer.append(" extends ");
                }
                stringBuffer.append(this.c[i2].toString());
            }
        }
        return stringBuffer.toString();
    }

    static void a(StringBuffer stringBuffer, aM[] arraM) {
        stringBuffer.append('<');
        for (int i2 = 0; i2 < arraM.length; ++i2) {
            if (i2 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(arraM[i2]);
        }
        stringBuffer.append('>');
    }

    void a(StringBuffer stringBuffer) {
        stringBuffer.append(this.a);
        if (this.b == null) {
            stringBuffer.append(":Ljava/lang/Object;");
        } else {
            stringBuffer.append(':');
            this.b.a(stringBuffer);
        }
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            stringBuffer.append(':');
            this.c[i2].a(stringBuffer);
        }
    }
}

