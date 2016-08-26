/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile.a;

import com.growingio.agent.compile.a.l;
import com.growingio.agent.compile.a.n;
import com.growingio.agent.compile.k;
import com.growingio.d.a.a;
import com.growingio.d.a.a.g;

class m
extends g {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ l c;

    m(l l2, String string, String string2) {
        this.c = l2;
        this.a = string;
        this.b = string2;
    }

    @Override
    public a a(String string, boolean bl2) {
        if (string.equals("Lcom/growingio/android/sdk/instrumentation/Track;")) {
            l.a(this.c).a(this.a, this.b);
            return new n(this.a, l.a(this.c));
        }
        if (!string.equals("Lcom/growingio/android/sdk/instrumentation/DoNotTrack;")) {
            return null;
        }
        l.a(this.c).b(this.a, this.b);
        return null;
    }
}

