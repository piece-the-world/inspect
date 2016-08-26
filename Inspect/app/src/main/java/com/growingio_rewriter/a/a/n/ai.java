/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.n.aa;
import com.growingio.a.a.n.aj;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class ai
implements Serializable,
GenericArrayType {
    private final Type a;
    private static final long b = 0;

    ai(Type type) {
        this.a = aj.d.b(type);
    }

    @Override
    public Type getGenericComponentType() {
        return this.a;
    }

    public String toString() {
        return aa.d(this.a) + "[]";
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean equals(Object object) {
        if (object instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType)object;
            return aL.a((Object)this.getGenericComponentType(), (Object)genericArrayType.getGenericComponentType());
        }
        return false;
    }
}

