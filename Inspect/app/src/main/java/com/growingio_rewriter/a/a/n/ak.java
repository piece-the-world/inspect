/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.n.ab;
import com.growingio.a.a.n.ai;
import com.growingio.a.a.n.aj;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class ak
extends aj {
    ak(String string2, int n3) {
        super(string, n2, null);
    }

    GenericArrayType d(Type type) {
        return new ai(type);
    }

    @Override
    Type b(Type type) {
        Class class_;
        aU.a(type);
        if (type instanceof Class && (class_ = (Class)type).isArray()) {
            return new ai(class_.getComponentType());
        }
        return type;
    }

    @Override
    /* synthetic */ Type a(Type type) {
        return this.d(type);
    }
}

