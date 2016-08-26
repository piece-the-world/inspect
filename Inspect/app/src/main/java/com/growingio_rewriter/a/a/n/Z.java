/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.d.lI;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;

abstract class Z {
    private final Set<Type> a = lI.a();

    Z() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final /* varargs */ void a(Type ... arrtype) {
        for (Type type : arrtype) {
            if (type == null || !this.a.add(type)) continue;
            boolean bl2 = false;
            try {
                if (type instanceof TypeVariable) {
                    this.a((TypeVariable)type);
                } else if (type instanceof WildcardType) {
                    this.a((WildcardType)type);
                } else if (type instanceof ParameterizedType) {
                    this.a((ParameterizedType)type);
                } else if (type instanceof Class) {
                    this.a((Class)type);
                } else if (type instanceof GenericArrayType) {
                    this.a((GenericArrayType)type);
                } else {
                    throw new AssertionError((Object)("Unknown type: " + type));
                }
                bl2 = true;
            }
            finally {
                if (!bl2) {
                    this.a.remove(type);
                }
            }
        }
    }

    void a(Class<?> class_) {
    }

    void a(GenericArrayType genericArrayType) {
    }

    void a(ParameterizedType parameterizedType) {
    }

    void a(TypeVariable<?> typeVariable) {
    }

    void a(WildcardType wildcardType) {
    }
}

