/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.c.l;
import com.growingio.a.a.c.y;

abstract class t
implements y {
    t() {
    }

    protected abstract void a(l var1, long var2);

    @Override
    public void a(l l2, String string, String string2) {
        aU.a(string2 != null && !string2.isEmpty(), "value of key %s omitted", (Object)string);
        try {
            this.a(l2, Long.parseLong(string2));
        }
        catch (NumberFormatException var4_4) {
            throw new IllegalArgumentException(l.a("key %s value set to %s, must be integer", new Object[]{string, string2}), var4_4);
        }
    }
}

