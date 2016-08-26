/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f.H;
import com.growingio.d.a.f.a;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.xml.sax.Attributes;

final class C
extends H {
    final /* synthetic */ a a;

    C(a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public final void a(String string, Attributes attributes) {
        this.a.c = new HashMap<Object, p>();
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("access", attributes.getValue("access"));
        hashMap.put("name", attributes.getValue("name"));
        hashMap.put("desc", attributes.getValue("desc"));
        hashMap.put("signature", attributes.getValue("signature"));
        hashMap.put("exceptions", new ArrayList());
        this.a.a(hashMap);
    }

    @Override
    public final void a(String string) {
        ((r)this.a.b()).b();
        this.a.c = null;
    }
}

