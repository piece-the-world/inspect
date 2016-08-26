/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.a;

import com.growingio.agent.a.k;
import com.growingio.agent.a.m;
import com.growingio.d.a.a;
import com.growingio.d.a.a.g;

class l
extends g {
    private final String b;
    private final String c;
    final /* synthetic */ k a;

    public l(k k2, String string, String string2) {
        this.a = k2;
        this.c = string;
        this.b = string2;
    }

    @Override
    public a a(String string, boolean bl2) {
        if (!k.a(this.a).equals(string)) {
            return null;
        }
        m m2 = new m(this, string);
        k.b(this.a).add(m2);
        return m2;
    }

    static /* synthetic */ String a(l l2) {
        return l2.c;
    }

    static /* synthetic */ String b(l l2) {
        return l2.b;
    }
}

