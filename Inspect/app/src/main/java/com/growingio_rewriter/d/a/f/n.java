/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f.H;
import com.growingio.d.a.f.a;
import com.growingio.d.a.p;
import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;

final class n
extends H {
    final /* synthetic */ a a;

    n(a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public void a(String string, Attributes attributes) {
        ArrayList arrayList = (ArrayList)((HashMap)this.a.a()).get(string);
        String string2 = attributes.getValue("type");
        if ("uninitialized".equals(string2)) {
            arrayList.add(this.a((Object)attributes.getValue("label")));
        } else {
            Integer n2 = a.dn.get(string2);
            if (n2 == null) {
                arrayList.add(string2);
            } else {
                arrayList.add(n2);
            }
        }
    }
}

