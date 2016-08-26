/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.b;

import com.growingio.d.a.a;
import com.growingio.d.a.a.q;
import com.growingio.d.a.b.d;
import com.growingio.d.a.b.m;
import com.growingio.d.a.f;
import com.growingio.d.a.j;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import com.growingio.d.a.v;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class c
extends com.growingio.d.a.a.d {
    private String i;
    String c;
    boolean d = false;
    boolean e = false;
    List<String> h = new ArrayList<String>();

    public c(f f2, q q2) {
        super(327680, f2, q2);
    }

    j a(int n2, String string, String string2) {
        return super.a(n2, string, string2, null, (Object)null);
    }

    @Override
    public void a(int n2, int n3, String string, String string2, String string3, String[] arrstring) {
        super.a(46, n3, string, null, string3, arrstring);
        int n4 = string.lastIndexOf(47);
        this.i = n4 > 0 ? string.substring(0, n4) : "";
        this.c = string;
        this.d = (n3 & 512) != 0;
    }

    @Override
    public void a_(String string, String string2) {
    }

    @Override
    public void a(String string, String string2, String string3) {
    }

    @Override
    public a a(String string, boolean bl2) {
        return null;
    }

    @Override
    public a a(int n2, v v2, String string, boolean bl2) {
        return null;
    }

    @Override
    public void a(com.growingio.d.a.c c2) {
    }

    @Override
    public void a(String string, String string2, String string3, int n2) {
    }

    @Override
    public j a(int n2, String string, String string2, String string3, Object object) {
        String string4 = this.a.b(this.b, string, string2);
        if ("-".equals(string4)) {
            return null;
        }
        if ((n2 & 5) == 0) {
            if ((n2 & 16) != 0 && (n2 & 8) != 0 && string2.length() == 1) {
                return null;
            }
            if ("org/objectweb/asm".equals(this.i) && string4.equals(string)) {
                System.out.println("INFO: " + this.c + "." + string4 + " could be renamed");
            }
            super.a(n2, string, string2, null, object);
        } else {
            if (!string4.equals(string)) {
                throw new RuntimeException("The public or protected field " + this.b + '.' + string + " must not be renamed.");
            }
            super.a(n2, string, string2, null, object);
        }
        return null;
    }

    @Override
    public r a(int n2, String string, String string2, String string3, String[] arrstring) {
        String string4 = this.a.a(this.b, string, string2);
        if ("-".equals(string4)) {
            return null;
        }
        if (string.equals("<clinit>") && !this.d) {
            this.e = true;
            r r2 = super.a(n2, string, string2, (String)null, arrstring);
            return new d(this, 327680, r2);
        }
        if ((n2 & 5) == 0) {
            if ("org/objectweb/asm".equals(this.i) && !string.startsWith("<") && string4.equals(string)) {
                System.out.println("INFO: " + this.c + "." + string4 + " could be renamed");
            }
            return super.a(n2, string, string2, (String)null, arrstring);
        }
        if (!string4.equals(string)) {
            throw new RuntimeException("The public or protected method " + this.b + '.' + string + string2 + " must not be renamed.");
        }
        return super.a(n2, string, string2, (String)null, arrstring);
    }

    @Override
    protected r a(r r2) {
        return new m(this, r2, this.a);
    }

    @Override
    public void a() {
        if (this.h.isEmpty()) {
            if (this.e) {
                r r2 = this.g.a(4104, "_clinit_", "()V", null, null);
                r2.a_();
                r2.a_(177);
                r2.d(0, 0);
                r2.b();
            }
        } else {
            r r3 = this.g.a(4104, "class$", "(Ljava/lang/String;)Ljava/lang/Class;", null, null);
            r3.a_();
            p p2 = new p();
            p p3 = new p();
            p p4 = new p();
            r3.a(p2, p3, p4, "java/lang/ClassNotFoundException");
            r3.a(p2);
            r3.b(25, 0);
            r3.a(184, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
            r3.a(p3);
            r3.a_(176);
            r3.a(p4);
            r3.a(182, "java/lang/ClassNotFoundException", "getMessage", "()Ljava/lang/String;", false);
            r3.b(58, 1);
            r3.a(187, "java/lang/NoClassDefFoundError");
            r3.a_(89);
            r3.b(25, 1);
            r3.a(183, "java/lang/NoClassDefFoundError", "<init>", "(Ljava/lang/String;)V", false);
            r3.a_(191);
            r3.d(3, 2);
            r3.b();
            r3 = this.e ? this.g.a(10, "_clinit_", "()V", null, null) : this.g.a(8, "<clinit>", "()V", null, null);
            for (String string : this.h) {
                String string2 = "class$" + string.replace('/', '$');
                r3.a(string.replace('/', '.'));
                r3.a(184, this.c, "class$", "(Ljava/lang/String;)Ljava/lang/Class;", false);
                r3.b(179, this.c, string2, "Ljava/lang/Class;");
            }
            r3.a_(177);
            r3.d(1, 0);
            r3.b();
        }
        super.a();
    }
}

