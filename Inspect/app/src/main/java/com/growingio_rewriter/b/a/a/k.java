/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.a;

import com.growingio.b.a.a.h;
import com.growingio.b.a.a.i;
import com.growingio.b.a.c.a;

public class k {
    private i a;
    private k b;
    private k[] c;

    k(i i2) {
        this.a = i2;
        this.b = null;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Node[pos=").append(this.a().c());
        stringBuffer.append(", parent=");
        stringBuffer.append(this.b == null ? "*" : Integer.toString(this.b.a().c()));
        stringBuffer.append(", children{");
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            stringBuffer.append(this.c[i2].a().c()).append(", ");
        }
        stringBuffer.append("}]");
        return stringBuffer.toString();
    }

    public i a() {
        return this.a;
    }

    public k b() {
        return this.b;
    }

    public int c() {
        return this.c.length;
    }

    public k a(int n2) {
        return this.c[n2];
    }

    int a(k k2, boolean[] arrbl, int n2, int[] arrn, h h2) {
        int n3 = this.a.b;
        if (arrbl[n3]) {
            return n2;
        }
        arrbl[n3] = true;
        this.b = k2;
        a[] arra = h2.a(this);
        if (arra != null) {
            for (int i2 = 0; i2 < arra.length; ++i2) {
                k k3 = h2.a(arra[i2]);
                n2 = k3.a(this, arrbl, n2, arrn, h2);
            }
        }
        arrn[n3] = n2++;
        return n2;
    }

    boolean a(boolean[] arrbl, int[] arrn, h h2) {
        a[] arra;
        int n2 = this.a.b;
        if (arrbl[n2]) {
            return false;
        }
        arrbl[n2] = true;
        boolean bl2 = false;
        a[] arra2 = h2.a(this);
        if (arra2 != null) {
            for (int i2 = 0; i2 < arra2.length; ++i2) {
                k k2 = h2.a(arra2[i2]);
                if (!k2.a(arrbl, arrn, h2)) continue;
                bl2 = true;
            }
        }
        if ((arra = h2.b(this)) != null) {
            for (int i3 = 0; i3 < arra.length; ++i3) {
                k k3;
                if (this.b == null || (k3 = k.a(this.b, h2.a(arra[i3]), arrn)) == this.b) continue;
                this.b = k3;
                bl2 = true;
            }
        }
        return bl2;
    }

    private static k a(k k2, k k3, int[] arrn) {
        while (k2 != k3) {
            if (arrn[k2.a.b] < arrn[k3.a.b]) {
                k2 = k2.b;
            } else {
                k3 = k3.b;
            }
            if (k2 != null && k3 != null) continue;
            return null;
        }
        return k2;
    }

    private static void b(k[] arrk) {
        k k2;
        int n2;
        int n3 = arrk.length;
        int[] arrn = new int[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            arrn[n2] = 0;
        }
        for (n2 = 0; n2 < n3; ++n2) {
            k2 = arrk[n2].b;
            if (k2 == null) continue;
            int[] arrn2 = arrn;
            int n4 = k2.a.b;
            arrn2[n4] = arrn2[n4] + 1;
        }
        for (n2 = 0; n2 < n3; ++n2) {
            arrk[n2].c = new k[arrn[n2]];
        }
        for (n2 = 0; n2 < n3; ++n2) {
            arrn[n2] = 0;
        }
        for (n2 = 0; n2 < n3; ++n2) {
            k2 = arrk[n2];
            k k3 = k2.b;
            if (k3 == null) continue;
            int[] arrn3 = arrn;
            int n5 = k3.a.b;
            int n6 = arrn3[n5];
            arrn3[n5] = n6 + 1;
            k3.c[n6] = k2;
        }
    }

    static /* synthetic */ i a(k k2) {
        return k2.a;
    }

    static /* synthetic */ void a(k[] arrk) {
        k.b(arrk);
    }
}

