/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.aj;
import com.growingio.a.a.h.an;

final class ap
extends an {
    ap(String string2, int n3) {
        super(string, n2, null);
    }

    @Override
    public long a(byte[] arrby, int n2) {
        long l2 = an.c().getLong((Object)arrby, (long)n2 + (long)an.b());
        return Long.reverseBytes(l2);
    }

    @Override
    public void a(byte[] arrby, int n2, long l2) {
        long l3 = Long.reverseBytes(l2);
        an.c().putLong((Object)arrby, (long)n2 + (long)an.b(), l3);
    }
}

