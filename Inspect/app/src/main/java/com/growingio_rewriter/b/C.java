/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.E;
import com.growingio.b.U;
import com.growingio.b.a.T;
import com.growingio.b.a.o;
import com.growingio.b.b;
import com.growingio.b.b.f;

class C
extends E {
    String a;

    C() {
    }

    @Override
    int a(com.growingio.b.o o2, String string, o o3, com.growingio.b.o[] arro, f f2) throws b {
        o3.n(0);
        o3.n(0);
        int n2 = this.c == null ? 2 : this.a(o3) + 2;
        if (this.d) {
            n2 += U.a(o3, arro, 1);
        }
        String string2 = T.b(o2);
        String string3 = this.a() + string2;
        o3.d(this.b, this.a, string3);
        o3.f(o.a, string, string2);
        return n2;
    }

    private String a() {
        String string = "(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/Object;)";
        if (this.c == null) {
            if (this.d) {
                return "(Ljava/lang/Object;[Ljava/lang/Object;)";
            }
            return "(Ljava/lang/Object;)";
        }
        if (this.d) {
            return "(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/Object;)";
        }
        return "(Ljava/lang/Object;[Ljava/lang/String;)";
    }

    @Override
    int a(com.growingio.b.o o2, String string, o o3, f f2) throws b {
        String string2;
        int n2 = 1;
        if (this.c == null) {
            string2 = "()";
        } else {
            string2 = "([Ljava/lang/String;)";
            n2 += this.a(o3);
        }
        String string3 = T.b(o2);
        o3.d(this.b, this.a, string2 + string3);
        o3.g(o.a, string, string3);
        return n2;
    }
}

