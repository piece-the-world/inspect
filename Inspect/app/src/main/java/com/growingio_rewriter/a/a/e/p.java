/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.e;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.e.g;
import com.growingio.a.a.e.n;

public abstract class p
extends g {
    private static final int a = 32;

    protected p() {
    }

    protected abstract char[] a(int var1);

    protected int a(CharSequence charSequence, int n2, int n3) {
        int n4;
        int n5;
        for (n5 = n2; n5 < n3 && (n4 = p.b(charSequence, n5, n3)) >= 0 && this.a(n4) == null; n5 += Character.isSupplementaryCodePoint((int)n4) != false ? 2 : 1) {
        }
        return n5;
    }

    @Override
    public String a(String string) {
        aU.a(string);
        int n2 = string.length();
        int n3 = this.a(string, 0, n2);
        return n3 == n2 ? string : this.a(string, n3);
    }

    protected final String a(String string, int n2) {
        int n3;
        int n4 = string.length();
        char[] arrc = n.a();
        int n5 = 0;
        int n6 = 0;
        while (n2 < n4) {
            n3 = p.b(string, n2, n4);
            if (n3 < 0) {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char[] arrc2 = this.a(n3);
            int n7 = n2 + (Character.isSupplementaryCodePoint(n3) ? 2 : 1);
            if (arrc2 != null) {
                int n8 = n2 - n6;
                int n9 = n5 + n8 + arrc2.length;
                if (arrc.length < n9) {
                    int n10 = n9 + (n4 - n2) + 32;
                    arrc = p.a(arrc, n5, n10);
                }
                if (n8 > 0) {
                    string.getChars(n6, n2, arrc, n5);
                    n5 += n8;
                }
                if (arrc2.length > 0) {
                    System.arraycopy(arrc2, 0, arrc, n5, arrc2.length);
                    n5 += arrc2.length;
                }
                n6 = n7;
            }
            n2 = this.a(string, n7, n4);
        }
        n3 = n4 - n6;
        if (n3 > 0) {
            int n11 = n5 + n3;
            if (arrc.length < n11) {
                arrc = p.a(arrc, n5, n11);
            }
            string.getChars(n6, n4, arrc, n5);
            n5 = n11;
        }
        return new String(arrc, 0, n5);
    }

    protected static int b(CharSequence charSequence, int n2, int n3) {
        aU.a(charSequence);
        if (n2 < n3) {
            char c2;
            if ((c2 = charSequence.charAt(n2++)) < '\ud800' || c2 > '\udfff') {
                return c2;
            }
            if (c2 <= '\udbff') {
                if (n2 == n3) {
                    return - c2;
                }
                char c3 = charSequence.charAt(n2);
                if (Character.isLowSurrogate(c3)) {
                    return Character.toCodePoint(c2, c3);
                }
                throw new IllegalArgumentException("Expected low surrogate but got char '" + c3 + "' with value " + c3 + " at index " + n2 + " in '" + charSequence + "'");
            }
            throw new IllegalArgumentException("Unexpected low surrogate character '" + c2 + "' with value " + c2 + " at index " + (n2 - 1) + " in '" + charSequence + "'");
        }
        throw new IndexOutOfBoundsException("Index exceeds specified range");
    }

    private static char[] a(char[] arrc, int n2, int n3) {
        char[] arrc2 = new char[n3];
        if (n2 > 0) {
            System.arraycopy(arrc, 0, arrc2, 0, n2);
        }
        return arrc2;
    }
}

