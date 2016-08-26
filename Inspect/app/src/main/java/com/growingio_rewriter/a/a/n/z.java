/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.n.C;
import com.growingio.a.a.n.D;
import com.growingio.a.a.n.Z;
import com.growingio.a.a.n.y;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Map;

final class z
extends Z {
    private static final D a = new D(null);
    private final Map<C, Type> b = ii.c();

    private z() {
    }

    static ei<C, Type> a(Type type) {
        z z2 = new z();
        z2.a(a.a(type));
        return ei.b(z2.b);
    }

    @Override
    void a(Class<?> class_) {
        this.a(class_.getGenericSuperclass());
        this.a(class_.getGenericInterfaces());
    }

    @Override
    void a(ParameterizedType parameterizedType) {
        Type[] arrtype;
        Class class_ = (Class)parameterizedType.getRawType();
        TypeVariable<Class<T>>[] arrtypeVariable = class_.getTypeParameters();
        aU.b(arrtypeVariable.length == (arrtype = parameterizedType.getActualTypeArguments()).length);
        for (int i2 = 0; i2 < arrtypeVariable.length; ++i2) {
            this.a(new C(arrtypeVariable[i2]), arrtype[i2]);
        }
        this.a(new Type[]{class_});
        this.a(parameterizedType.getOwnerType());
    }

    @Override
    void a(TypeVariable<?> typeVariable) {
        this.a(typeVariable.getBounds());
    }

    @Override
    void a(WildcardType wildcardType) {
        this.a(wildcardType.getUpperBounds());
    }

    private void a(C c2, Type type) {
        if (this.b.containsKey(c2)) {
            return;
        }
        Type type2 = type;
        while (type2 != null) {
            if (c2.b(type2)) {
                Type type3 = type;
                while (type3 != null) {
                    type3 = this.b.remove(C.a(type3));
                }
                return;
            }
            type2 = this.b.get(C.a(type2));
        }
        this.b.put(c2, type);
    }
}

