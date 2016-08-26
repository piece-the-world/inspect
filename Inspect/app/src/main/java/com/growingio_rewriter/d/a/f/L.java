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
import org.xml.sax.Attributes;

final class L
extends H {
    final /* synthetic */ a a;

    L(a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public final void a(String string, Attributes attributes) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("min", attributes.getValue("min"));
        hashMap.put("max", attributes.getValue("max"));
        hashMap.put("dflt", attributes.getValue("dflt"));
        hashMap.put("labels", new ArrayList());
        this.a.a(hashMap);
    }

    @Override
    public final void a(String string) {
        HashMap hashMap = (HashMap)this.a.b();
        int n2 = Integer.parseInt((String)hashMap.get("min"));
        int n3 = Integer.parseInt((String)hashMap.get("max"));
        p p2 = this.a(hashMap.get("dflt"));
        ArrayList arrayList = (ArrayList)hashMap.get("labels");
        p[] arrp = arrayList.toArray(new p[arrayList.size()]);
        this.a().a(n2, n3, p2, arrp);
    }
}

