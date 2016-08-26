/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d;

import com.growingio.d.a.d.a;
import com.growingio.d.a.d.o;
import com.growingio.d.a.r;
import java.util.Map;

public class m
extends a {
    public String w;
    public String x;
    public com.growingio.d.a.m y;
    public Object[] z;

    public /* varargs */ m(String string, String string2, com.growingio.d.a.m m2, Object ... arrobject) {
        super(186);
        this.w = string;
        this.x = string2;
        this.y = m2;
        this.z = arrobject;
    }

    @Override
    public int b() {
        return 6;
    }

    @Override
    public void a(r r2) {
        r2.a(this.w, this.x, this.y, this.z);
        this.b(r2);
    }

    @Override
    public a a(Map<o, o> map) {
        return new m(this.w, this.x, this.y, this.z).a(this);
    }
}

