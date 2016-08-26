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

final class y
extends H {
    final /* synthetic */ a a;

    y(a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public final void a(String string, Attributes attributes) {
        HashMap hashMap = (HashMap)this.a.a();
        ((ArrayList)hashMap.get("labels")).add(this.a((Object)attributes.getValue("name")));
        ((ArrayList)hashMap.get("keys")).add(attributes.getValue("key"));
    }
}

