/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f.H;
import com.growingio.d.a.f.a;
import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;

final class i
extends H {
    final /* synthetic */ a a;

    i(a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public final void a(String string, Attributes attributes) {
        int n2 = Integer.parseInt(attributes.getValue("major"));
        int n3 = Integer.parseInt(attributes.getValue("minor"));
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("version", n3 << 16 | n2);
        hashMap.put("access", attributes.getValue("access"));
        hashMap.put("name", attributes.getValue("name"));
        hashMap.put("parent", attributes.getValue("parent"));
        hashMap.put("source", attributes.getValue("source"));
        hashMap.put("signature", attributes.getValue("signature"));
        hashMap.put("interfaces", new ArrayList());
        this.a.a(hashMap);
    }
}

