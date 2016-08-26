/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.g;

import com.growingio.b.a.Q;
import com.growingio.b.a.p;
import com.growingio.b.a.q;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class b {
    private b() {
    }

    public static void a(String[] arrstring) throws Exception {
        if (arrstring.length != 1) {
            System.err.println("Usage: java Dump <class file name>");
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(arrstring[0]));
        p p2 = new p(dataInputStream);
        PrintWriter printWriter = new PrintWriter(System.out, true);
        printWriter.println("*** constant pool ***");
        p2.c().a(printWriter);
        printWriter.println();
        printWriter.println("*** members ***");
        q.a(p2, printWriter);
    }
}

