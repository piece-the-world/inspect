/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.l;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bF;
import java.io.Serializable;

public final class a
implements Serializable {
    private static final int a = -1;
    private final String b;
    private final int c;
    private final boolean d;
    private static final long e = 0;

    private a(String string, int n2, boolean bl2) {
        this.b = string;
        this.c = n2;
        this.d = bl2;
    }

    public String a() {
        return this.b;
    }

    public boolean b() {
        return this.c >= 0;
    }

    public int c() {
        aU.b(this.b());
        return this.c;
    }

    public int a(int n2) {
        return this.b() ? this.c : n2;
    }

    public static a a(String string, int n2) {
        aU.a(a.c(n2), "Port out of range: %s", n2);
        a a2 = a.b(string);
        aU.a(!a2.b(), "Host has a port: %s", (Object)string);
        return new a(a2.b, n2, a2.d);
    }

    public static a a(String string) {
        a a2 = a.b(string);
        aU.a(!a2.b(), "Host has a port: %s", (Object)string);
        return a2;
    }

    public static a b(String string) {
        String string2;
        aU.a(string);
        String string3 = null;
        boolean bl2 = false;
        if (string.startsWith("[")) {
            String[] arrstring = a.c(string);
            string2 = arrstring[0];
            string3 = arrstring[1];
        } else {
            int n2 = string.indexOf(58);
            if (n2 >= 0 && string.indexOf(58, n2 + 1) == -1) {
                string2 = string.substring(0, n2);
                string3 = string.substring(n2 + 1);
            } else {
                string2 = string;
                bl2 = n2 >= 0;
            }
        }
        int n3 = -1;
        if (!bF.c(string3)) {
            aU.a(!string3.startsWith("+"), "Unparseable port number: %s", (Object)string);
            try {
                n3 = Integer.parseInt(string3);
            }
            catch (NumberFormatException var5_7) {
                throw new IllegalArgumentException("Unparseable port number: " + string);
            }
            aU.a(a.c(n3), "Port number out of range: %s", (Object)string);
        }
        return new a(string2, n3, bl2);
    }

    private static String[] c(String string) {
        int n2 = 0;
        int n3 = 0;
        aU.a(string.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", (Object)string);
        n2 = string.indexOf(58);
        n3 = string.lastIndexOf(93);
        aU.a(n2 > -1 && n3 > n2, "Invalid bracketed host/port: %s", (Object)string);
        String string2 = string.substring(1, n3);
        if (n3 + 1 == string.length()) {
            return new String[]{string2, ""};
        }
        aU.a(string.charAt(n3 + 1) == ':', "Only a colon may follow a close bracket: %s", (Object)string);
        for (int i2 = n3 + 2; i2 < string.length(); ++i2) {
            aU.a(Character.isDigit(string.charAt(i2)), "Port must be numeric: %s", (Object)string);
        }
        return new String[]{string2, string.substring(n3 + 2)};
    }

    public a b(int n2) {
        aU.a(a.c(n2));
        if (this.b() || this.c == n2) {
            return this;
        }
        return new a(this.b, n2, this.d);
    }

    public a d() {
        aU.a(!this.d, "Possible bracketless IPv6 literal: %s", (Object)this.b);
        return this;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof a) {
            a a2 = (a)object;
            return aL.a((Object)this.b, (Object)a2.b) && this.c == a2.c && this.d == a2.d;
        }
        return false;
    }

    public int hashCode() {
        return aL.a(this.b, this.c, this.d);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.b.length() + 8);
        if (this.b.indexOf(58) >= 0) {
            stringBuilder.append('[').append(this.b).append(']');
        } else {
            stringBuilder.append(this.b);
        }
        if (this.b()) {
            stringBuilder.append(':').append(this.c);
        }
        return stringBuilder.toString();
    }

    private static boolean c(int n2) {
        return n2 >= 0 && n2 <= 65535;
    }
}

