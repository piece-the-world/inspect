/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.Z;
import com.growingio.b.a.a;
import com.growingio.b.a.aA;
import com.growingio.b.a.aP;
import com.growingio.b.a.aZ;
import com.growingio.b.a.ac;
import com.growingio.b.a.as;
import com.growingio.b.a.az;
import com.growingio.b.a.be;
import com.growingio.b.a.c;
import com.growingio.b.a.h;
import com.growingio.b.a.i;
import com.growingio.b.a.p;
import com.growingio.b.a.y;
import com.growingio.b.ad;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

public class q {
    public static void a(p p2) {
        q.a(p2, new PrintWriter(System.out, true));
    }

    public static void a(p p2, PrintWriter printWriter) {
        int n2;
        Object object;
        int n3;
        int n4 = a.j(p2.g() & -33);
        printWriter.println("major: " + p2.a + ", minor: " + p2.b + " modifiers: " + Integer.toHexString(p2.g()));
        printWriter.println(ad.t(n4) + " class " + p2.i() + " extends " + p2.j());
        String[] arrstring = p2.l();
        if (arrstring != null && arrstring.length > 0) {
            printWriter.print("    implements ");
            printWriter.print(arrstring[0]);
            for (n3 = 1; n3 < arrstring.length; ++n3) {
                printWriter.print(", " + arrstring[n3]);
            }
            printWriter.println();
        }
        printWriter.println();
        List list = p2.m();
        int n5 = list.size();
        for (n3 = 0; n3 < n5; ++n3) {
            object = (ac)list.get(n3);
            n2 = object.c();
            printWriter.println(ad.t(a.j(n2)) + " " + object.b() + "\t" + object.d());
            q.a(object.f(), printWriter, 'f');
        }
        printWriter.println();
        list = p2.n();
        n5 = list.size();
        for (n3 = 0; n3 < n5; ++n3) {
            object = (as)list.get(n3);
            n2 = object.f();
            printWriter.println(ad.t(a.j(n2)) + " " + object.a() + "\t" + object.g());
            q.a(object.h(), printWriter, 'm');
            printWriter.println();
        }
        printWriter.println();
        q.a(p2.p(), printWriter, 'c');
    }

    static void a(List list, PrintWriter printWriter, char c2) {
        if (list == null) {
            return;
        }
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            y y2;
            h h2 = (h)list.get(i2);
            if (h2 instanceof y) {
                y2 = (y)h2;
                printWriter.println("attribute: " + h2.c() + ": " + h2.getClass().getName());
                printWriter.println("max stack " + y2.b() + ", max locals " + y2.h() + ", " + y2.l().a() + " catch blocks");
                printWriter.println("<code attribute begin>");
                q.a(y2.m(), printWriter, c2);
                printWriter.println("<code attribute end>");
                continue;
            }
            if (h2 instanceof c) {
                printWriter.println("annnotation: " + h2.toString());
                continue;
            }
            if (h2 instanceof az) {
                printWriter.println("parameter annnotations: " + h2.toString());
                continue;
            }
            if (h2 instanceof aZ) {
                printWriter.println("<stack map table begin>");
                be.a((aZ)h2, printWriter);
                printWriter.println("<stack map table end>");
                continue;
            }
            if (h2 instanceof aP) {
                printWriter.println("<stack map begin>");
                ((aP)h2).a(printWriter);
                printWriter.println("<stack map end>");
                continue;
            }
            if (h2 instanceof aA) {
                y2 = (aA)h2;
                String string = y2.a();
                printWriter.println("signature: " + string);
                try {
                    String string2 = c2 == 'c' ? aA.b(string).toString() : (c2 == 'm' ? aA.c(string).toString() : aA.d(string).toString());
                    printWriter.println("           " + string2);
                }
                catch (i var8_9) {
                    printWriter.println("           syntax error");
                }
                continue;
            }
            printWriter.println("attribute: " + h2.c() + " (" + h2.f().length + " byte): " + h2.getClass().getName());
        }
    }
}

