/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.n.aa;
import com.growingio.a.a.n.aj;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

final class ap
implements Serializable,
ParameterizedType {
    private final Type a;
    private final ea<Type> b;
    private final Class<?> c;
    private static final long d = 0;

    ap(Type type, Class<?> class_, Type[] arrtype) {
        aU.a(class_);
        aU.a(arrtype.length == class_.getTypeParameters().length);
        aa.a(arrtype, "type parameter");
        this.a = type;
        this.c = class_;
        this.b = aj.d.a(arrtype);
    }

    @Override
    public Type[] getActualTypeArguments() {
        return aa.a(this.b);
    }

    @Override
    public Type getRawType() {
        return this.c;
    }

    @Override
    public Type getOwnerType() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.a != null) {
            stringBuilder.append(aj.d.c(this.a)).append('.');
        }
        return stringBuilder.append(this.c.getName()).append('<').append(aa.b().a(fL.a(this.b, aa.a()))).append('>').toString();
    }

    public int hashCode() {
        return (this.a == null ? 0 : this.a.hashCode()) ^ this.b.hashCode() ^ this.c.hashCode();
    }

    public boolean equals(Object object) {
        if (!(object instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType)object;
        return this.getRawType().equals(parameterizedType.getRawType()) && aL.a((Object)this.getOwnerType(), (Object)parameterizedType.getOwnerType()) && Arrays.equals(this.getActualTypeArguments(), parameterizedType.getActualTypeArguments());
    }
}

