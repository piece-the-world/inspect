/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.n.C;
import com.growingio.a.a.n.Z;
import com.growingio.a.a.n.aa;
import com.growingio.a.a.n.x;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Map;

final class y
extends Z {
    final /* synthetic */ Map a;
    final /* synthetic */ Type b;

    y(Map map, Type type) {
        this.a = map;
        this.b = type;
    }

    @Override
    void a(TypeVariable<?> typeVariable) {
        this.a.put(new C(typeVariable), this.b);
    }

    @Override
    void a(WildcardType wildcardType) {
        int n2;
        if (!(this.b instanceof WildcardType)) {
            return;
        }
        WildcardType wildcardType2 = (WildcardType)this.b;
        Type[] arrtype = wildcardType.getUpperBounds();
        Type[] arrtype2 = wildcardType2.getUpperBounds();
        Type[] arrtype3 = wildcardType.getLowerBounds();
        Type[] arrtype4 = wildcardType2.getLowerBounds();
        aU.a(arrtype.length == arrtype2.length && arrtype3.length == arrtype4.length, "Incompatible type: %s vs. %s", (Object)wildcardType, (Object)this.b);
        for (n2 = 0; n2 < arrtype.length; ++n2) {
            x.a(this.a, arrtype[n2], arrtype2[n2]);
        }
        for (n2 = 0; n2 < arrtype3.length; ++n2) {
            x.a(this.a, arrtype3[n2], arrtype4[n2]);
        }
    }

    @Override
    void a(ParameterizedType parameterizedType) {
        if (this.b instanceof WildcardType) {
            return;
        }
        ParameterizedType parameterizedType2 = (ParameterizedType)x.a(ParameterizedType.class, this.b);
        aU.a(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", (Object)parameterizedType, (Object)this.b);
        Type[] arrtype = parameterizedType.getActualTypeArguments();
        Type[] arrtype2 = parameterizedType2.getActualTypeArguments();
        aU.a(arrtype.length == arrtype2.length, "%s not compatible with %s", (Object)parameterizedType, (Object)parameterizedType2);
        for (int i2 = 0; i2 < arrtype.length; ++i2) {
            x.a(this.a, arrtype[i2], arrtype2[i2]);
        }
    }

    @Override
    void a(GenericArrayType genericArrayType) {
        if (this.b instanceof WildcardType) {
            return;
        }
        Type type = aa.e(this.b);
        aU.a(type != null, "%s is not an array type.", (Object)this.b);
        x.a(this.a, genericArrayType.getGenericComponentType(), type);
    }

    @Override
    void a(Class<?> class_) {
        if (this.b instanceof WildcardType) {
            return;
        }
        throw new IllegalArgumentException("No type mapping from " + class_ + " to " + this.b);
    }
}

