/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.oP;
import com.growingio.a.a.n.aa;
import com.growingio.a.a.n.aj;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Iterator;

final class as
implements Serializable,
WildcardType {
    private final ea<Type> a;
    private final ea<Type> b;
    private static final long c = 0;

    as(Type[] arrtype, Type[] arrtype2) {
        aa.a(arrtype, "lower bound for wildcard");
        aa.a(arrtype2, "upper bound for wildcard");
        this.a = aj.d.a(arrtype);
        this.b = aj.d.a(arrtype2);
    }

    @Override
    public Type[] getLowerBounds() {
        return aa.a(this.a);
    }

    @Override
    public Type[] getUpperBounds() {
        return aa.a(this.b);
    }

    public boolean equals(Object object) {
        if (object instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType)object;
            return this.a.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.b.equals(Arrays.asList(wildcardType.getUpperBounds()));
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("?");
        Iterator iterator = this.a.k_();
        while (iterator.hasNext()) {
            Type type = iterator.next();
            stringBuilder.append(" super ").append(aj.d.c(type));
        }
        for (Type type : aa.a(this.b)) {
            stringBuilder.append(" extends ").append(aj.d.c(type));
        }
        return stringBuilder.toString();
    }
}

