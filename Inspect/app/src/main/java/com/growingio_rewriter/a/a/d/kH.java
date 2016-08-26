/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aJ;
import com.growingio.a.a.d.hg;
import com.growingio.a.a.d.hu;
import com.growingio.a.a.d.kI;
import com.growingio.a.a.d.kJ;
import com.growingio.a.a.m.z;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class kH<B>
extends hu<Class<? extends B>, B>
implements aJ<B>,
Serializable {
    private static final hg<Class<?>, Object> a = new kI();

    public static <B> kH<B> b() {
        return new kH(new HashMap());
    }

    public static <B> kH<B> a(Map<Class<? extends B>, B> map) {
        return new kH<B>(map);
    }

    private kH(Map<Class<? extends B>, B> map) {
        super(map, a);
    }

    @Override
    public <T extends B> T a(Class<T> class_, T t2) {
        return kH.c(class_, this.put(class_, t2));
    }

    @Override
    public <T extends B> T a(Class<T> class_) {
        return kH.c(class_, this.get(class_));
    }

    private static <B, T extends B> T c(Class<T> class_, B b2) {
        return z.b(class_).cast(b2);
    }

    private Object c() {
        return new kJ(this.a());
    }

    static /* synthetic */ Object b(Class class_, Object object) {
        return kH.c(class_, object);
    }
}

