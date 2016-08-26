/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.c.a;

import com.growingio.c.a.b.f;
import com.growingio.c.a.g;
import java.lang.annotation.Annotation;

public class h
implements f<g> {
    @Override
    public com.growingio.c.a.b.g a(g g2, Object object) {
        boolean bl2;
        if (!(object instanceof Number)) {
            return com.growingio.c.a.b.g.d;
        }
        Number number = (Number)object;
        if (number instanceof Long) {
            bl2 = number.longValue() < 0;
        } else if (number instanceof Double) {
            bl2 = number.doubleValue() < 0.0;
        } else if (number instanceof Float) {
            bl2 = number.floatValue() < 0.0f;
        } else {
            boolean bl3 = bl2 = number.intValue() < 0;
        }
        if (bl2) {
            return com.growingio.c.a.b.g.d;
        }
        return com.growingio.c.a.b.g.a;
    }
}

