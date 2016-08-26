/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.f;

import com.growingio.b.f.a;
import com.growingio.b.f.b;
import com.growingio.b.f.d;
import com.growingio.b.g;

public class c
implements b {
    @Override
    public a a(ClassLoader classLoader, g g2, d d2) {
        return new a(classLoader, g2, d2, false);
    }

    @Override
    public a a(g g2, d d2) {
        return new a(null, g2, d2, true);
    }
}

