/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Z;
import com.growingio.b.a.aP;
import com.growingio.b.a.aZ;
import com.growingio.b.a.ak;
import com.growingio.b.a.am;
import com.growingio.b.a.h;
import com.growingio.b.a.i;
import com.growingio.b.a.y;

class L {
    int a;
    int b;
    int c;
    Z d;
    ak e;
    am f;
    am g;
    aZ h;
    aP i;

    L(int n2, int n3, int n4, Z z2, y y2) {
        this.a = n2;
        this.c = n3;
        this.b = n4;
        this.d = z2;
        this.e = (ak)y2.a("LineNumberTable");
        this.f = (am)y2.a("LocalVariableTable");
        this.g = (am)y2.a("LocalVariableTypeTable");
        this.h = (aZ)y2.a("StackMapTable");
        this.i = (aP)y2.a("StackMap");
    }

    void a(int n2, int n3, boolean bl2) throws i {
        if (n2 < this.a || n2 == this.a && bl2) {
            this.a += n3;
        }
        if (n2 < this.c || n2 == this.c && bl2) {
            this.c += n3;
        }
        if (n2 < this.b || n2 == this.b && bl2) {
            this.b += n3;
        }
        this.d.a(n2, n3, bl2);
        if (this.e != null) {
            this.e.a(n2, n3, bl2);
        }
        if (this.f != null) {
            this.f.a(n2, n3, bl2);
        }
        if (this.g != null) {
            this.g.a(n2, n3, bl2);
        }
        if (this.h != null) {
            this.h.a(n2, n3, bl2);
        }
        if (this.i != null) {
            this.i.a(n2, n3, bl2);
        }
    }

    void a(int n2, int n3) throws i {
        if (this.h != null) {
            this.h.a(n2, n3);
        }
        if (this.i != null) {
            this.i.a(n2, n3);
        }
    }
}

