/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.aj;
import com.growingio.a.a.h.an;

final class ao
extends an {
    ao(String string2, int n3) {
        super(string, n2, null);
    }

    @Override
    public long a(byte[] arrby, int n2) {
        return an.c().getLong((Object)arrby, (long)n2 + (long)an.b());
    }

    @Override
    public void a(byte[] arrby, int n2, long l2) {
        an.c().putLong((Object)arrby, (long)n2 + (long)an.b(), l2);
    }
}

