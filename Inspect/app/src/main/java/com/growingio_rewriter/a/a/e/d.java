/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.e;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.e.g;
import com.growingio.a.a.e.n;

public abstract class d
extends g {
    private static final int a = 2;

    protected d() {
    }

    @Override
    public String a(String string) {
        aU.a(string);
        int n2 = string.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.a(string.charAt(i2)) == null) continue;
            return this.a(string, i2);
        }
        return string;
    }

    protected final String a(String string, int n2) {
        int n3;
        int n4 = string.length();
        char[] arrc = n.a();
        int n5 = arrc.length;
        int n6 = 0;
        int n7 = 0;
        while (n2 < n4) {
            char[] arrc2 = this.a(string.charAt(n2));
            if (arrc2 != null) {
                int n8 = n2 - n7;
                n3 = arrc2.length;
                int n9 = n6 + n8 + n3;
                if (n5 < n9) {
                    n5 = n9 + 2 * (n4 - n2);
                    arrc = d.a(arrc, n6, n5);
                }
                if (n8 > 0) {
                    string.getChars(n7, n2, arrc, n6);
                    n6 += n8;
                }
                if (n3 > 0) {
                    System.arraycopy(arrc2, 0, arrc, n6, n3);
                    n6 += n3;
                }
                n7 = n2 + 1;
            }
            ++n2;
        }
        int n10 = n4 - n7;
        if (n10 > 0) {
            n3 = n6 + n10;
            if (n5 < n3) {
                arrc = d.a(arrc, n6, n3);
            }
            string.getChars(n7, n4, arrc, n6);
            n6 = n3;
        }
        return new String(arrc, 0, n6);
    }

    protected abstract char[] a(char var1);

    private static char[] a(char[] arrc, int n2, int n3) {
        char[] arrc2 = new char[n3];
        if (n2 > 0) {
            System.arraycopy(arrc, 0, arrc2, 0, n2);
        }
        return arrc2;
    }
}

