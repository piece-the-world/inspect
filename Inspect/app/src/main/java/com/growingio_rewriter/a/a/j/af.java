/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.d.gO;
import com.growingio.a.a.j.ao;
import java.util.List;

final class af
implements ao<List<String>> {
    final List<String> a = gO.a();

    af() {
    }

    @Override
    public boolean a(String string) {
        this.a.add(string);
        return true;
    }

    public List<String> a() {
        return this.a;
    }

    @Override
    public /* synthetic */ Object b() {
        return this.a();
    }
}

