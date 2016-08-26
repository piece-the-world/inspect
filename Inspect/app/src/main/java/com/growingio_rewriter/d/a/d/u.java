/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d;

import com.growingio.d.a.d.a;
import com.growingio.d.a.d.o;
import com.growingio.d.a.r;
import java.util.Map;

public class u
extends a {
    public String w;
    public String x;
    public String y;
    public boolean z;

    public u(int n2, String string, String string2, String string3) {
        this(n2, string, string2, string3, n2 == 185);
    }

    public u(int n2, String string, String string2, String string3, boolean bl2) {
        super(n2);
        this.w = string;
        this.x = string2;
        this.y = string3;
        this.z = bl2;
    }

    public void a(int n2) {
        this.q = n2;
    }

    @Override
    public int b() {
        return 5;
    }

    @Override
    public void a(r r2) {
        r2.a(this.q, this.w, this.x, this.y, this.z);
        this.b(r2);
    }

    @Override
    public a a(Map<o, o> map) {
        return new u(this.q, this.w, this.x, this.y, this.z);
    }
}

