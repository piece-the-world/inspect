/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f.H;
import com.growingio.d.a.f.a;
import com.growingio.d.a.r;
import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;

final class m
extends H {
    final /* synthetic */ a a;

    m(a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public void a(String string, Attributes attributes) {
        HashMap hashMap = new HashMap();
        hashMap.put("local", new ArrayList());
        hashMap.put("stack", new ArrayList());
        this.a.a(attributes.getValue("type"));
        this.a.a(attributes.getValue("count") == null ? "0" : attributes.getValue("count"));
        this.a.a(hashMap);
    }

    @Override
    public void a(String string) {
        HashMap hashMap = (HashMap)this.a.b();
        ArrayList arrayList = (ArrayList)hashMap.get("local");
        int n2 = arrayList.size();
        Object[] arrobject = arrayList.toArray();
        ArrayList arrayList2 = (ArrayList)hashMap.get("stack");
        int n3 = arrayList2.size();
        Object[] arrobject2 = arrayList2.toArray();
        String string2 = (String)this.a.b();
        String string3 = (String)this.a.b();
        if ("NEW".equals(string3)) {
            this.a().a(-1, n2, arrobject, n3, arrobject2);
        } else if ("FULL".equals(string3)) {
            this.a().a(0, n2, arrobject, n3, arrobject2);
        } else if ("APPEND".equals(string3)) {
            this.a().a(1, n2, arrobject, 0, null);
        } else if ("CHOP".equals(string3)) {
            this.a().a(2, Integer.parseInt(string2), null, 0, null);
        } else if ("SAME".equals(string3)) {
            this.a().a(3, 0, null, 0, null);
        } else if ("SAME1".equals(string3)) {
            this.a().a(4, 0, null, n3, arrobject2);
        }
    }
}

