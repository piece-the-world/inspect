/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.b;

import com.growingio.d.a.b.h;
import com.growingio.d.a.b.k;
import com.growingio.d.a.f;
import com.growingio.d.a.r;
import java.io.PrintStream;
import java.util.Map;
import java.util.Set;

class j
extends f {
    String a;
    String b;

    public j() {
        super(327680);
    }

    @Override
    public void a(int n2, int n3, String string, String string2, String string3, String[] arrstring) {
        this.a = string;
    }

    @Override
    public r a(int n2, String string, String string2, String string3, String[] arrstring) {
        this.b = string + string2;
        return new k(this, 327680);
    }

    void b(String string, String string2) {
        if (string.startsWith("java/")) {
            String string3 = string;
            while (string3 != null) {
                if (h.a.contains(string3 + ' ' + string2)) {
                    return;
                }
                string3 = h.b.get(string3);
            }
            System.out.println("WARNING: " + string + ' ' + string2 + " called in " + this.a + ' ' + this.b + " is not defined in JDK 1.3 API");
        }
    }
}

