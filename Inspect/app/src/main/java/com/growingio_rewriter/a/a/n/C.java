/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class C {
    private final TypeVariable<?> a;

    C(TypeVariable<?> typeVariable) {
        this.a = aU.a(typeVariable);
    }

    public int hashCode() {
        return aL.a(new Object[]{this.a.getGenericDeclaration(), this.a.getName()});
    }

    public boolean equals(Object object) {
        if (object instanceof C) {
            C c2 = (C)object;
            return this.a(c2.a);
        }
        return false;
    }

    public String toString() {
        return this.a.toString();
    }

    static C a(Type type) {
        if (type instanceof TypeVariable) {
            return new C((TypeVariable)type);
        }
        return null;
    }

    boolean b(Type type) {
        if (type instanceof TypeVariable) {
            return this.a((TypeVariable)type);
        }
        return false;
    }

    private boolean a(TypeVariable<?> typeVariable) {
        return this.a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.a.getName().equals(typeVariable.getName());
    }
}

