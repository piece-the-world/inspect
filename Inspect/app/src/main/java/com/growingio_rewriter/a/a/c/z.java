/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.c.aw;
import com.growingio.a.a.c.l;
import com.growingio.a.a.c.y;

class z
implements y {
    private final aw a;

    public z(aw aw2) {
        this.a = aw2;
    }

    @Override
    public void a(l l2, String string, String string2) {
        aU.a(string2 == null, "key %s does not take values", (Object)string);
        aU.a(l2.f == null, "%s was already set to %s", (Object)string, (Object)l2.f);
        l2.f = this.a;
    }
}

