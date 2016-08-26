/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.b;

import com.growingio.d.a.f;
import com.growingio.d.a.j;
import com.growingio.d.a.r;
import java.io.PrintStream;

class i
extends f {
    String a;

    public i() {
        super(327680);
    }

    @Override
    public void a(int n2, int n3, String string, String string2, String string3, String[] arrstring) {
        this.a = string;
        if (this.a.startsWith("java/")) {
            System.out.println("class " + string + ' ' + string3);
        }
    }

    @Override
    public j a(int n2, String string, String string2, String string3, Object object) {
        if (this.a.startsWith("java/")) {
            System.out.println(this.a + ' ' + string);
        }
        return null;
    }

    @Override
    public r a(int n2, String string, String string2, String string3, String[] arrstring) {
        if (this.a.startsWith("java/")) {
            System.out.println(this.a + ' ' + string + string2);
        }
        return null;
    }
}

