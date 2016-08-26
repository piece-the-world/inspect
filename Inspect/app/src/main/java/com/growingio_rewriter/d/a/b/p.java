/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.b;

import com.growingio.d.a.a.z;
import java.util.Map;
import java.util.Set;

final class p
extends z {
    final /* synthetic */ Set a;

    p(Map map, Set set) {
        this.a = set;
        super(map);
    }

    @Override
    public String d(String string) {
        String string2 = super.d(string);
        if (string2 != null) {
            this.a.remove(string);
        }
        return string2;
    }
}

