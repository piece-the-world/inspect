/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.n.A;
import com.growingio.a.a.n.C;
import com.growingio.a.a.n.aa;
import com.growingio.a.a.n.as;
import com.growingio.a.a.n.y;
import com.growingio.a.a.n.z;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;

public final class x {
    private final A a;

    public x() {
        this.a = new A();
    }

    private x(A a2) {
        this.a = a2;
    }

    static x a(Type type) {
        return new x().a(z.a(type));
    }

    public x a(Type type, Type type2) {
        HashMap<C, Type> hashMap = ii.c();
        x.b(hashMap, aU.a(type), aU.a(type2));
        return this.a(hashMap);
    }

    x a(Map<C, ? extends Type> map) {
        return new x(this.a.a(map));
    }

    private static void b(Map<C, Type> map, Type type, Type type2) {
        if (type.equals(type2)) {
            return;
        }
        new y(map, type2).a(type);
    }

    public Type b(Type type) {
        aU.a(type);
        if (type instanceof TypeVariable) {
            return this.a.a((TypeVariable)type);
        }
        if (type instanceof ParameterizedType) {
            return this.a((ParameterizedType)type);
        }
        if (type instanceof GenericArrayType) {
            return this.a((GenericArrayType)type);
        }
        if (type instanceof WildcardType) {
            return this.a((WildcardType)type);
        }
        return type;
    }

    private Type[] a(Type[] arrtype) {
        Type[] arrtype2 = new Type[arrtype.length];
        for (int i2 = 0; i2 < arrtype.length; ++i2) {
            arrtype2[i2] = this.b(arrtype[i2]);
        }
        return arrtype2;
    }

    private WildcardType a(WildcardType wildcardType) {
        Type[] arrtype = wildcardType.getLowerBounds();
        Type[] arrtype2 = wildcardType.getUpperBounds();
        return new as(this.a(arrtype), this.a(arrtype2));
    }

    private Type a(GenericArrayType genericArrayType) {
        Type type = genericArrayType.getGenericComponentType();
        Type type2 = this.b(type);
        return aa.a(type2);
    }

    private ParameterizedType a(ParameterizedType parameterizedType) {
        Type type = parameterizedType.getOwnerType();
        Type type2 = type == null ? null : this.b(type);
        Type type3 = this.b(parameterizedType.getRawType());
        Type[] arrtype = parameterizedType.getActualTypeArguments();
        Type[] arrtype2 = this.a(arrtype);
        return aa.a(type2, (Class)type3, arrtype2);
    }

    private static <T> T b(Class<T> class_, Object object) {
        try {
            return class_.cast(object);
        }
        catch (ClassCastException var2_2) {
            throw new IllegalArgumentException(object + " is not a " + class_.getSimpleName());
        }
    }

    static /* synthetic */ void a(Map map, Type type, Type type2) {
        x.b(map, type, type2);
    }

    static /* synthetic */ Object a(Class class_, Object object) {
        return x.b(class_, object);
    }

    /* synthetic */ x(A a2, y y2) {
        this(a2);
    }

    static /* synthetic */ Type[] a(x x2, Type[] arrtype) {
        return x2.a(arrtype);
    }
}

