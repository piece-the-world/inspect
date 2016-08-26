/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.g.a;

import com.growingio.b.g;
import com.growingio.b.g.a.e;
import com.growingio.b.g.a.j;
import com.growingio.b.o;
import java.io.PrintStream;

public class f {
    public static void a(String[] arrstring) throws Exception {
        if (arrstring.length == 0) {
            f.a(System.err);
            return;
        }
        e[] arre = new e[arrstring.length];
        int n2 = f.a(arrstring, arre);
        if (n2 < 1) {
            System.err.println("bad parameter.");
            return;
        }
        f.a(arre, n2);
    }

    private static void a(e[] arre, int n2) throws Exception {
        int n3;
        j j2 = new j();
        g g2 = g.a();
        j2.a(g2);
        for (n3 = 0; n3 < n2; ++n3) {
            o o2 = g2.f(arre[n3].a);
            if (arre[n3].b != null || arre[n3].c != null) {
                String string = arre[n3].b == null ? "Metaobject" : arre[n3].b;
                String string2 = arre[n3].c == null ? "ClassMetaobject" : arre[n3].c;
                if (!j2.a(o2, g2.f(string), g2.f(string2))) {
                    System.err.println("Warning: " + o2.s() + " is reflective.  It was not changed.");
                }
                System.err.println(o2.s() + ": " + string + ", " + string2);
                continue;
            }
            System.err.println(o2.s() + ": not reflective");
        }
        for (n3 = 0; n3 < n2; ++n3) {
            j2.a(g2, arre[n3].a);
            g2.f(arre[n3].a).U();
        }
    }

    private static int a(String[] arrstring, e[] arre) {
        int n2 = -1;
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            String string = arrstring[i2];
            if (string.equals("-m")) {
                if (n2 < 0 || i2 + 1 > arrstring.length) {
                    return -1;
                }
                arre[n2].b = arrstring[++i2];
                continue;
            }
            if (string.equals("-c")) {
                if (n2 < 0 || i2 + 1 > arrstring.length) {
                    return -1;
                }
                arre[n2].c = arrstring[++i2];
                continue;
            }
            if (string.charAt(0) == '-') {
                return -1;
            }
            e e2 = new e();
            e2.a = string;
            e2.b = null;
            e2.c = null;
            arre[++n2] = e2;
        }
        return n2 + 1;
    }

    private static void a(PrintStream printStream) {
        printStream.println("Usage: java Compiler");
        printStream.println("            (<class> [-m <metaobject>] [-c <class metaobject>])+");
    }
}

