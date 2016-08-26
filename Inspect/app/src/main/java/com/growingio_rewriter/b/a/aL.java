/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.aJ;

public class aL {
    aJ a;
    char b;

    aL(aJ aJ2, char c2) {
        this.a = aJ2;
        this.b = c2;
    }

    public aL(aJ aJ2) {
        this(aJ2, ' ');
    }

    public aL() {
        this(null, '*');
    }

    public static aL a(aJ aJ2) {
        return new aL(aJ2, '+');
    }

    public static aL b(aJ aJ2) {
        return new aL(aJ2, '-');
    }

    public char a() {
        return this.b;
    }

    public boolean b() {
        return this.b != ' ';
    }

    public aJ c() {
        return this.a;
    }

    public String toString() {
        if (this.b == '*') {
            return "?";
        }
        String string = this.a.toString();
        if (this.b == ' ') {
            return string;
        }
        if (this.b == '+') {
            return "? extends " + string;
        }
        return "? super " + string;
    }

    static void a(StringBuffer stringBuffer, aL[] arraL) {
        stringBuffer.append('<');
        for (int i2 = 0; i2 < arraL.length; ++i2) {
            aL aL2 = arraL[i2];
            if (aL2.b()) {
                stringBuffer.append(aL2.b);
            }
            if (aL2.c() == null) continue;
            aL2.c().a(stringBuffer);
        }
        stringBuffer.append('>');
    }
}

