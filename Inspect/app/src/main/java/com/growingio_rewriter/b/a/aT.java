/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.aP;
import com.growingio.b.a.aX;
import com.growingio.b.a.l;
import java.io.PrintWriter;

class aT
extends aX {
    private PrintWriter a;

    public aT(aP aP2, PrintWriter printWriter) {
        super(aP2);
        this.a = printWriter;
    }

    public void b() {
        int n2 = l.a(this.e, 0);
        this.a.println("" + n2 + " entries");
        this.a();
    }

    @Override
    public int a(int n2, int n3, int n4) {
        this.a.println("  * offset " + n3);
        return super.a(n2, n3, n4);
    }
}

