/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.n.v;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public abstract class w<T>
extends v<T> {
    final TypeVariable<?> a;

    protected w() {
        Type type = this.a();
        aU.a(type instanceof TypeVariable, "%s should be a type variable.", (Object)type);
        this.a = (TypeVariable)type;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean equals(Object object) {
        if (object instanceof w) {
            w w2 = (w)object;
            return this.a.equals(w2.a);
        }
        return false;
    }

    public String toString() {
        return this.a.toString();
    }
}

