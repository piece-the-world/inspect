/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ek;
import com.growingio.a.a.d.eq;
import com.growingio.a.a.d.fp;
import com.growingio.a.a.d.fs;
import java.util.Comparator;

class ft
extends eq {
    private final Comparator<Object> a;
    private static final long b = 0;

    ft(fp<?, ?> fp2) {
        super(fp2);
        this.a = fp2.comparator();
    }

    @Override
    Object a() {
        fs<Object, Object> fs2 = new fs<Object, Object>(this.a);
        return this.a(fs2);
    }
}

