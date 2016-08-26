/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.l;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.l.a;
import com.growingio.a.a.l.d;
import com.growingio.a.a.l.f;
import java.net.InetAddress;
import java.text.ParseException;

public final class b {
    private final String a;

    private b(String string) {
        this.a = string;
    }

    public static b a(String string) {
        a a2 = a.b(string);
        aU.a(!a2.b());
        String string2 = a2.a();
        InetAddress inetAddress = null;
        try {
            inetAddress = d.a(string2);
        }
        catch (IllegalArgumentException var4_4) {
            // empty catch block
        }
        if (inetAddress != null) {
            return new b(d.b(inetAddress));
        }
        f f2 = f.a(string2);
        if (f2.c()) {
            return new b(f2.toString());
        }
        throw new IllegalArgumentException("Domain name does not have a recognized public suffix: " + string2);
    }

    public static b b(String string) throws ParseException {
        try {
            return b.a(string);
        }
        catch (IllegalArgumentException var1_1) {
            ParseException parseException = new ParseException("Invalid host specifier: " + string, 0);
            parseException.initCause(var1_1);
            throw parseException;
        }
    }

    public static boolean c(String string) {
        try {
            b.a(string);
            return true;
        }
        catch (IllegalArgumentException var1_1) {
            return false;
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof b) {
            b b2 = (b)object;
            return this.a.equals(b2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }
}

