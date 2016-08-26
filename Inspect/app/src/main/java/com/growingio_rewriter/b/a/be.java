/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import com.growingio.b.a.aZ;
import com.growingio.b.a.bj;
import com.growingio.b.a.i;
import java.io.PrintWriter;

class be
extends bj {
    private PrintWriter a;
    private int b;

    public static void a(aZ aZ2, PrintWriter printWriter) {
        try {
            new be(aZ2.f(), printWriter).c();
        }
        catch (i var2_2) {
            printWriter.println(var2_2.getMessage());
        }
    }

    be(byte[] arrby, PrintWriter printWriter) {
        super(arrby);
        this.a = printWriter;
        this.b = -1;
    }

    @Override
    public void a_(int n2, int n3) {
        this.b += n3 + 1;
        this.a.println("" + this.b + " same frame: " + n3);
    }

    @Override
    public void a(int n2, int n3, int n4, int n5) {
        this.b += n3 + 1;
        this.a.println("" + this.b + " same locals: " + n3);
        this.b(n4, n5);
    }

    @Override
    public void b(int n2, int n3, int n4) {
        this.b += n3 + 1;
        this.a.println("" + this.b + " chop frame: " + n3 + ",    " + n4 + " last locals");
    }

    @Override
    public void a(int n2, int n3, int[] arrn, int[] arrn2) {
        this.b += n3 + 1;
        this.a.println("" + this.b + " append frame: " + n3);
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            this.b(arrn[i2], arrn2[i2]);
        }
    }

    @Override
    public void a(int n2, int n3, int[] arrn, int[] arrn2, int[] arrn3, int[] arrn4) {
        int n4;
        this.b += n3 + 1;
        this.a.println("" + this.b + " full frame: " + n3);
        this.a.println("[locals]");
        for (n4 = 0; n4 < arrn.length; ++n4) {
            this.b(arrn[n4], arrn2[n4]);
        }
        this.a.println("[stack]");
        for (n4 = 0; n4 < arrn3.length; ++n4) {
            this.b(arrn3[n4], arrn4[n4]);
        }
    }

    private void b(int n2, int n3) {
        String string = null;
        switch (n2) {
            case 0: {
                string = "top";
                break;
            }
            case 1: {
                string = "integer";
                break;
            }
            case 2: {
                string = "float";
                break;
            }
            case 3: {
                string = "double";
                break;
            }
            case 4: {
                string = "long";
                break;
            }
            case 5: {
                string = "null";
                break;
            }
            case 6: {
                string = "this";
                break;
            }
            case 7: {
                string = "object (cpool_index " + n3 + ")";
                break;
            }
            case 8: {
                string = "uninitialized (offset " + n3 + ")";
            }
        }
        this.a.print("    ");
        this.a.println(string);
    }
}

