/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.a;
import com.growingio.d.a.f.H;
import org.xml.sax.Attributes;

final class g
extends H {
    final /* synthetic */ com.growingio.d.a.f.a a;

    g(com.growingio.d.a.f.a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public void a(String string, Attributes attributes) {
        a a2 = (a)this.a.a();
        if (a2 != null) {
            a2.a(attributes.getValue("name"), attributes.getValue("desc"), attributes.getValue("value"));
        }
    }
}

