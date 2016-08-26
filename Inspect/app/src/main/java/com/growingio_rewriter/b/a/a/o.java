/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.a;

import com.growingio.b.a.a.p;
import com.growingio.b.a.a.q;
import java.util.NoSuchElementException;

class o {
    private q a;
    private q b;

    o() {
    }

    void a(int n2) {
        q q2 = new q(n2, null);
        if (this.b != null) {
            q.a(this.b, q2);
        }
        this.b = q2;
        if (this.a == null) {
            this.a = q2;
        }
    }

    boolean a() {
        return this.a == null;
    }

    int b() {
        if (this.a == null) {
            throw new NoSuchElementException();
        }
        int n2 = q.a(this.a);
        this.a = q.b(this.a);
        if (this.a == null) {
            this.b = null;
        }
        return n2;
    }
}

