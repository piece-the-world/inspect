/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.g;

import com.growingio.b.a.a.n;
import com.growingio.b.g;
import com.growingio.b.o;
import java.io.PrintStream;

public class c {
    private c() {
    }

    public static void a(String[] arrstring) throws Exception {
        if (arrstring.length != 1) {
            System.err.println("Usage: java framedump <fully-qualified class name>");
            return;
        }
        g g2 = g.a();
        o o2 = g2.f(arrstring[0]);
        System.out.println("Frame Dump of " + o2.s() + ":");
        n.a(o2, System.out);
    }
}

