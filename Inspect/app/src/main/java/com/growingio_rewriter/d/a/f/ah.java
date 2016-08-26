/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.a;
import com.growingio.d.a.f.ad;
import com.growingio.d.a.f.ae;
import com.growingio.d.a.j;
import com.growingio.d.a.v;
import org.xml.sax.Attributes;

public final class ah
extends j {
    ad c;

    public ah(ad ad2, Attributes attributes) {
        super(327680);
        this.c = ad2;
        ad2.a("field", attributes);
    }

    @Override
    public a a(String string, boolean bl2) {
        return new ae(this.c, "annotation", bl2 ? 1 : -1, null, string);
    }

    @Override
    public a a(int n2, v v2, String string, boolean bl2) {
        return new ae(this.c, "typeAnnotation", bl2 ? 1 : -1, null, string, n2, v2);
    }

    @Override
    public void a() {
        this.c.a("field");
    }
}

