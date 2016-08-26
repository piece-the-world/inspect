/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import com.growingio.d.a.f;
import com.growingio.d.a.f.H;
import com.growingio.d.a.f.a;
import java.util.ArrayList;
import java.util.HashMap;

final class r
extends H {
    final /* synthetic */ a a;

    r(a a2) {
        this.a = a2;
        super(a2);
    }

    @Override
    public final void a(String string) {
        HashMap hashMap = (HashMap)this.a.b();
        int n2 = (Integer)hashMap.get("version");
        int n3 = this.c((String)hashMap.get("access"));
        String string2 = (String)hashMap.get("name");
        String string3 = (String)hashMap.get("signature");
        String string4 = (String)hashMap.get("parent");
        ArrayList arrayList = (ArrayList)hashMap.get("interfaces");
        String[] arrstring = arrayList.toArray(new String[arrayList.size()]);
        this.a.b.a(n2, n3, string2, string3, string4, arrstring);
        this.a.a(this.a.b);
    }
}

