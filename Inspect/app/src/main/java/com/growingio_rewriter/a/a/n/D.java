/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aC;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.n.aa;
import com.growingio.a.a.n.y;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.concurrent.atomic.AtomicInteger;

final class D {
    private final AtomicInteger a = new AtomicInteger();

    private D() {
    }

    Type a(Type type) {
        aU.a(type);
        if (type instanceof Class) {
            return type;
        }
        if (type instanceof TypeVariable) {
            return type;
        }
        if (type instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType)type;
            return aa.a(this.a(genericArrayType.getGenericComponentType()));
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType)type;
            return aa.a(this.b(parameterizedType.getOwnerType()), (Class)parameterizedType.getRawType(), this.a(parameterizedType.getActualTypeArguments()));
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType)type;
            Type[] arrtype = wildcardType.getLowerBounds();
            if (arrtype.length == 0) {
                Object[] arrobject = wildcardType.getUpperBounds();
                String string = "capture#" + this.a.incrementAndGet() + "-of ? extends " + aC.a('&').a(arrobject);
                return aa.a(D.class, string, wildcardType.getUpperBounds());
            }
            return type;
        }
        throw new AssertionError((Object)"must have been one of the known types");
    }

    private Type b(Type type) {
        if (type == null) {
            return null;
        }
        return this.a(type);
    }

    private Type[] a(Type[] arrtype) {
        Type[] arrtype2 = new Type[arrtype.length];
        for (int i2 = 0; i2 < arrtype.length; ++i2) {
            arrtype2[i2] = this.a(arrtype[i2]);
        }
        return arrtype2;
    }

    /* synthetic */ D(y y2) {
        this();
    }
}

