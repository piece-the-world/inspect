/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.n.F;
import java.lang.reflect.Type;

class K {
    private final Type[] a;
    private final boolean b;

    K(Type[] arrtype, boolean bl2) {
        this.a = arrtype;
        this.b = bl2;
    }

    boolean a(Type type) {
        for (Type type2 : this.a) {
            if (F.a(type2).d(type) != this.b) continue;
            return this.b;
        }
        return !this.b;
    }

    boolean b(Type type) {
        F f2 = F.a(type);
        for (Type type2 : this.a) {
            if (f2.d(type2) != this.b) continue;
            return this.b;
        }
        return !this.b;
    }
}

