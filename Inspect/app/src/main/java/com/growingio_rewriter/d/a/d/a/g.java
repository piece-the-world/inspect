/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d.a;

import com.growingio.d.a.d.a;
import com.growingio.d.a.d.a.b;
import com.growingio.d.a.d.a.m;
import com.growingio.d.a.u;
import java.util.List;

public abstract class g<V extends m> {
    protected final int a;

    protected g(int n2) {
        this.a = n2;
    }

    public abstract V b(u var1);

    public abstract V b(a var1) throws b;

    public abstract V b(a var1, V var2) throws b;

    public abstract V a(a var1, V var2) throws b;

    public abstract V b(a var1, V var2, V var3) throws b;

    public abstract V a(a var1, V var2, V var3, V var4) throws b;

    public abstract V b(a var1, List<? extends V> var2) throws b;

    public abstract void a(a var1, V var2, V var3) throws b;

    public abstract V a(V var1, V var2);
}

