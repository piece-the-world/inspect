/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.a;

import com.growingio.b.a.Q;
import com.growingio.b.a.a.i;
import com.growingio.b.a.as;
import com.growingio.b.a.c.a;
import com.growingio.b.a.c.b;

public class j {
    private i a;
    private int b;

    j(b b2) {
        this.a = (i)b2.b;
        this.b = b2.c;
    }

    public i a() {
        return this.a;
    }

    public String b() {
        if (this.b == 0) {
            return "java.lang.Throwable";
        }
        return this.a.c.c().d(this.b);
    }

    static /* synthetic */ i a(j j2) {
        return j2.a;
    }
}

