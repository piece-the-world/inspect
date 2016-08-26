/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.g.a;

import com.growingio.b.ab;
import com.growingio.b.ae;
import com.growingio.b.aj;
import com.growingio.b.b;
import com.growingio.b.g.a.j;

public class g
extends ab {
    protected j b;

    public static void c(String[] arrstring) throws Throwable {
        g g2 = new g();
        g2.b(arrstring);
    }

    public g() throws b, ae {
        this.a("Loader");
        this.b = new j();
        com.growingio.b.g g2 = com.growingio.b.g.a();
        this.a(g2, this.b);
    }

    public boolean a(String string, String string2, String string3) throws b, ae {
        return this.b.a(string, string2, string3);
    }
}

