/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aC;

class aD
extends aC {
    final /* synthetic */ String a;
    final /* synthetic */ aC b;

    aD(aC aC2, aC aC3, String string) {
        this.b = aC2;
        this.a = string;
        super(aC3, null);
    }

    @Override
    CharSequence a(Object object) {
        return object == null ? this.a : this.b.a(object);
    }

    @Override
    public aC b(String string) {
        throw new UnsupportedOperationException("already specified useForNull");
    }

    @Override
    public aC a() {
        throw new UnsupportedOperationException("already specified useForNull");
    }
}

