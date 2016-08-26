/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.n.A;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

class B
extends A {
    final /* synthetic */ TypeVariable a;
    final /* synthetic */ A b;
    final /* synthetic */ A c;

    B(A a2, TypeVariable typeVariable, A a3) {
        this.c = a2;
        this.a = typeVariable;
        this.b = a3;
    }

    @Override
    public Type a(TypeVariable<?> typeVariable, A a2) {
        if (typeVariable.getGenericDeclaration().equals(this.a.getGenericDeclaration())) {
            return typeVariable;
        }
        return this.b.a(typeVariable, a2);
    }
}

