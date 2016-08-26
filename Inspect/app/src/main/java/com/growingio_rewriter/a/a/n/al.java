/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.n.aa;
import com.growingio.a.a.n.ab;
import com.growingio.a.a.n.ai;
import com.growingio.a.a.n.aj;
import java.lang.reflect.Type;

final class al
extends aj {
    al(String string2, int n3) {
        super(string, n2, null);
    }

    @Override
    Type a(Type type) {
        if (type instanceof Class) {
            return aa.a((Class)type);
        }
        return new ai(type);
    }

    @Override
    Type b(Type type) {
        return aU.a(type);
    }
}

