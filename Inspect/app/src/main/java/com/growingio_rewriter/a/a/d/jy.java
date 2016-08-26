/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bG;
import java.io.Serializable;
import java.util.EnumSet;
import java.util.Set;

final class jy<V extends Enum<V>>
implements bG<Set<V>>,
Serializable {
    private final Class<V> a;

    jy(Class<V> class_) {
        this.a = aU.a(class_);
    }

    public Set<V> b() {
        return EnumSet.noneOf(this.a);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

