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

final class z
extends H {
    final /* synthetic */ a a;

    z(a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public final void a(String string, Attributes attributes) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("dflt", attributes.getValue("dflt"));
        hashMap.put("labels", new ArrayList());
        hashMap.put("keys", new ArrayList());
        this.a.a(hashMap);
    }

    @Override
    public final void a(String string) {
        HashMap hashMap = (HashMap)this.a.b();
        p p2 = this.a(hashMap.get("dflt"));
        ArrayList arrayList = (ArrayList)hashMap.get("keys");
        ArrayList arrayList2 = (ArrayList)hashMap.get("labels");
        p[] arrp = arrayList2.toArray(new p[arrayList2.size()]);
        int[] arrn = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            arrn[i2] = Integer.parseInt((String)arrayList.get(i2));
        }
        this.a().a(p2, arrn, arrp);
    }
}

