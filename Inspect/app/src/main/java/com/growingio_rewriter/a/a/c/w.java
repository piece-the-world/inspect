/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.c.l;
import com.growingio.a.a.c.y;

class w
implements y {
    w() {
    }

    @Override
    public void a(l l2, String string, String string2) {
        aU.a(string2 == null, (Object)"recordStats does not take values");
        aU.a(l2.g == null, (Object)"recordStats already set");
        l2.g = true;
    }
}

