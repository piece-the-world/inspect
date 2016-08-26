/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.U;
import com.growingio.b.a.T;
import com.growingio.b.a.o;
import com.growingio.b.b;
import com.growingio.b.b.f;
import com.growingio.b.z;

class E
extends z {
    com.growingio.b.o b;
    String[] c;
    boolean d;

    E() {
    }

    @Override
    int a(com.growingio.b.o o2, String string, o o3, com.growingio.b.o[] arro, f f2) throws b {
        o3.n(0);
        o3.c(this.b);
        o3.b(89);
        o3.n(0);
        int n2 = this.c == null ? 4 : this.a(o3) + 4;
        if (this.d) {
            n2 += U.a(o3, arro, 1);
        }
        o3.c(this.b, "<init>", this.a());
        o3.f(o.a, string, T.b(o2));
        return n2;
    }

    private String a() {
        String string = "(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/Object;)V";
        if (this.c == null) {
            if (this.d) {
                return "(Ljava/lang/Object;[Ljava/lang/Object;)V";
            }
            return "(Ljava/lang/Object;)V";
        }
        if (this.d) {
            return "(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/Object;)V";
        }
        return "(Ljava/lang/Object;[Ljava/lang/String;)V";
    }

    @Override
    int a(com.growingio.b.o o2, String string, o o3, f f2) throws b {
        String string2;
        o3.c(this.b);
        o3.b(89);
        int n2 = 2;
        if (this.c == null) {
            string2 = "()V";
        } else {
            string2 = "([Ljava/lang/String;)V";
            n2 += this.a(o3);
        }
        o3.c(this.b, "<init>", string2);
        o3.g(o.a, string, T.b(o2));
        return n2;
    }

    protected final int a(o o2) throws b {
        int n2 = this.c.length;
        o2.p(n2);
        o2.e("java.lang.String");
        for (int i2 = 0; i2 < n2; ++i2) {
            o2.b(89);
            o2.p(i2);
            o2.c(this.c[i2]);
            o2.b(83);
        }
        return 4;
    }
}

