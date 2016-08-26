/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.a;
import com.growingio.d.a.f;
import com.growingio.d.a.f.H;
import com.growingio.d.a.j;
import com.growingio.d.a.r;
import org.xml.sax.Attributes;

final class d
extends H {
    final /* synthetic */ com.growingio.d.a.f.a a;

    d(com.growingio.d.a.f.a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public void a(String string, Attributes attributes) {
        String string2 = attributes.getValue("desc");
        boolean bl2 = Boolean.valueOf(attributes.getValue("visible"));
        Object object = this.a.a();
        if (object instanceof f) {
            this.a.a(((f)object).a(string2, bl2));
        } else if (object instanceof j) {
            this.a.a(((j)object).a(string2, bl2));
        } else if (object instanceof r) {
            this.a.a(((r)object).a(string2, bl2));
        }
    }

    @Override
    public void a(String string) {
        a a2 = (a)this.a.b();
        if (a2 != null) {
            a2.b_();
        }
    }
}

