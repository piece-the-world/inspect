/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.a;
import com.growingio.d.a.f.H;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import com.growingio.d.a.v;
import org.xml.sax.Attributes;

final class x
extends H {
    final /* synthetic */ com.growingio.d.a.f.a a;

    x(com.growingio.d.a.f.a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public void a(String string, Attributes attributes) {
        String string2 = attributes.getValue("desc");
        boolean bl2 = Boolean.valueOf(attributes.getValue("visible"));
        int n2 = Integer.parseInt(attributes.getValue("typeRef"));
        v v2 = v.a(attributes.getValue("typePath"));
        String[] arrstring = attributes.getValue("start").split(" ");
        p[] arrp = new p[arrstring.length];
        for (int i2 = 0; i2 < arrp.length; ++i2) {
            arrp[i2] = this.a((Object)arrstring[i2]);
        }
        String[] arrstring2 = attributes.getValue("end").split(" ");
        p[] arrp2 = new p[arrstring2.length];
        for (int i3 = 0; i3 < arrp2.length; ++i3) {
            arrp2[i3] = this.a((Object)arrstring2[i3]);
        }
        String[] arrstring3 = attributes.getValue("index").split(" ");
        int[] arrn = new int[arrstring3.length];
        for (int i4 = 0; i4 < arrn.length; ++i4) {
            arrn[i4] = Integer.parseInt(arrstring3[i4]);
        }
        this.a.a(((r)this.a.a()).a(n2, v2, arrp, arrp2, arrn, string2, bl2));
    }

    @Override
    public void a(String string) {
        a a2 = (a)this.a.b();
        if (a2 != null) {
            a2.b_();
        }
    }
}

