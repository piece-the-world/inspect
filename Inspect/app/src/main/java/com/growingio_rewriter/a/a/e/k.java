/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.e;

import com.growingio.a.a.e.d;
import com.growingio.a.a.e.p;

final class k
extends p {
    final /* synthetic */ d a;

    k(d d2) {
        this.a = d2;
    }

    @Override
    protected char[] a(int n2) {
        int n3;
        if (n2 < 65536) {
            return this.a.a((char)n2);
        }
        char[] arrc = new char[2];
        Character.toChars(n2, arrc, 0);
        char[] arrc2 = this.a.a(arrc[0]);
        char[] arrc3 = this.a.a(arrc[1]);
        if (arrc2 == null && arrc3 == null) {
            return null;
        }
        int n4 = arrc2 != null ? arrc2.length : 1;
        int n5 = arrc3 != null ? arrc3.length : 1;
        char[] arrc4 = new char[n4 + n5];
        if (arrc2 != null) {
            for (n3 = 0; n3 < arrc2.length; ++n3) {
                arrc4[n3] = arrc2[n3];
            }
        } else {
            arrc4[0] = arrc[0];
        }
        if (arrc3 != null) {
            for (n3 = 0; n3 < arrc3.length; ++n3) {
                arrc4[n4 + n3] = arrc3[n3];
            }
        } else {
            arrc4[n4] = arrc[1];
        }
        return arrc4;
    }
}

