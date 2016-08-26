/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dN;
import com.growingio.a.a.d.dO;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ek;
import com.growingio.a.a.m.z;
import java.util.Map;
import java.util.Set;

public final class dP<B> {
    private final ek<Class<? extends B>, B> a = ei.j();

    public <T extends B> dP<B> a(Class<T> class_, T t2) {
        this.a.b(class_, t2);
        return this;
    }

    public <T extends B> dP<B> a(Map<? extends Class<? extends T>, ? extends T> map) {
        for (Map.Entry<Class<T>, T> entry : map.entrySet()) {
            Class<? extends T> class_ = entry.getKey();
            T t2 = entry.getValue();
            this.a.b(class_, dP.b(class_, t2));
        }
        return this;
    }

    private static <B, T extends B> T b(Class<T> class_, B b2) {
        return z.b(class_).cast(b2);
    }

    public dN<B> a() {
        ei<Class<B>, B> ei2 = this.a.b();
        if (ei2.isEmpty()) {
            return dN.b();
        }
        return new dN(ei2, null);
    }
}

