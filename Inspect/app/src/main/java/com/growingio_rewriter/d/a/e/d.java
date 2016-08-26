/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.e;

import com.growingio.d.a.a;
import com.growingio.d.a.d.A;
import com.growingio.d.a.d.a.g;
import com.growingio.d.a.d.a.h;
import com.growingio.d.a.e.c;
import com.growingio.d.a.e.e;
import com.growingio.d.a.e.f;
import com.growingio.d.a.e.i;
import com.growingio.d.a.e.k;
import com.growingio.d.a.e.o;
import com.growingio.d.a.j;
import com.growingio.d.a.p;
import com.growingio.d.a.r;
import com.growingio.d.a.u;
import com.growingio.d.a.v;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class d
extends com.growingio.d.a.f {
    private int a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private Map<p, Integer> h = new HashMap<p, Integer>();
    private boolean i;

    public static void a(String[] arrstring) throws Exception {
        if (arrstring.length != 1) {
            System.err.println("Verifies the given class.");
            System.err.println("Usage: CheckClassAdapter <fully qualified class name or class file name>");
            return;
        }
        com.growingio.d.a.e e2 = arrstring[0].endsWith(".class") ? new com.growingio.d.a.e(new FileInputStream(arrstring[0])) : new com.growingio.d.a.e(arrstring[0]);
        d.a(e2, false, new PrintWriter(System.err));
    }

    public static void a(com.growingio.d.a.e e2, ClassLoader classLoader, boolean bl2, PrintWriter printWriter) {
        com.growingio.d.a.d.c c2 = new com.growingio.d.a.d.c();
        e2.a(new d(c2, false), 2);
        u u2 = c2.e == null ? null : u.b(c2.e);
        List<com.growingio.d.a.d.v> list = c2.u;
        ArrayList<u> arrayList = new ArrayList<u>();
        Iterator<String> iterator = c2.h.iterator();
        while (iterator.hasNext()) {
            arrayList.add(u.b(iterator.next()));
        }
        for (int i2 = 0; i2 < list.size(); ++i2) {
            com.growingio.d.a.d.v v2 = list.get(i2);
            h h2 = new h(u.b(c2.c), u2, arrayList, (c2.b & 512) != 0);
            com.growingio.d.a.d.a.a<com.growingio.d.a.d.a.d> a2 = new com.growingio.d.a.d.a.a<com.growingio.d.a.d.a.d>(h2);
            if (classLoader != null) {
                h2.a(classLoader);
            }
            try {
                a2.a(c2.c, v2);
                if (!bl2) {
                    continue;
                }
            }
            catch (Exception var12_13) {
                var12_13.printStackTrace(printWriter);
            }
            d.a(v2, a2, printWriter);
        }
        printWriter.flush();
    }

    public static void a(com.growingio.d.a.e e2, boolean bl2, PrintWriter printWriter) {
        d.a(e2, null, bl2, printWriter);
    }

    static void a(com.growingio.d.a.d.v v2, com.growingio.d.a.d.a.a<com.growingio.d.a.d.a.d> a2, PrintWriter printWriter) {
        int n2;
        com.growingio.d.a.d.a.f<com.growingio.d.a.d.a.d>[] arrf = a2.a();
        k k2 = new k();
        o o2 = new o(k2);
        printWriter.println(v2.c + v2.f);
        for (n2 = 0; n2 < v2.bm_.a(); ++n2) {
            v2.bm_.a(n2).a(o2);
            StringBuilder stringBuilder = new StringBuilder();
            com.growingio.d.a.d.a.f<com.growingio.d.a.d.a.d> f2 = arrf[n2];
            if (f2 == null) {
                stringBuilder.append('?');
            } else {
                int n3;
                for (n3 = 0; n3 < f2.a(); ++n3) {
                    stringBuilder.append(d.d(f2.a(n3).toString())).append(' ');
                }
                stringBuilder.append(" : ");
                for (n3 = 0; n3 < f2.c(); ++n3) {
                    stringBuilder.append(d.d(f2.b(n3).toString())).append(' ');
                }
            }
            while (stringBuilder.length() < v2.bo_ + v2.bp_ + 1) {
                stringBuilder.append(' ');
            }
            printWriter.print(Integer.toString(n2 + 100000).substring(1));
            printWriter.print(" " + stringBuilder + " : " + k2.i.get(k2.i.size() - 1));
        }
        for (n2 = 0; n2 < v2.bn_.size(); ++n2) {
            v2.bn_.get(n2).a(o2);
            printWriter.print(" " + k2.i.get(k2.i.size() - 1));
        }
        printWriter.println();
    }

    private static String d(String string) {
        int n2 = string.lastIndexOf(47);
        int n3 = string.length();
        if (string.charAt(n3 - 1) == ';') {
            --n3;
        }
        return n2 == -1 ? string : string.substring(n2 + 1, n3);
    }

    public d(com.growingio.d.a.f f2) {
        this(f2, true);
    }

    public d(com.growingio.d.a.f f2, boolean bl2) {
        this(327680, f2, bl2);
        if (this.getClass() != d.class) {
            throw new IllegalStateException();
        }
    }

    protected d(int n2, com.growingio.d.a.f f2, boolean bl2) {
        super(n2, f2);
        this.i = bl2;
    }

    @Override
    public void a(int n2, int n3, String string, String string2, String string3, String[] arrstring) {
        if (this.b) {
            throw new IllegalStateException("visit must be called only once");
        }
        this.b = true;
        this.b();
        d.a(n3, 423473);
        if (string == null || !string.endsWith("package-info")) {
            f.b(string, "class name");
        }
        if ("java/lang/Object".equals(string)) {
            if (string3 != null) {
                throw new IllegalArgumentException("The super class name of the Object class must be 'null'");
            }
        } else {
            f.b(string3, "super class name");
        }
        if (string2 != null) {
            d.a(string2);
        }
        if ((n3 & 512) != 0 && !"java/lang/Object".equals(string3)) {
            throw new IllegalArgumentException("The super class name of interfaces must be 'java/lang/Object'");
        }
        if (arrstring != null) {
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                f.b(arrstring[i2], "interface name at index " + i2);
            }
        }
        this.a = n2;
        super.a(n2, n3, string, string2, string3, arrstring);
    }

    @Override
    public void a_(String string, String string2) {
        this.b();
        if (this.c) {
            throw new IllegalStateException("visitSource can be called only once.");
        }
        this.c = true;
        super.a_(string, string2);
    }

    @Override
    public void a(String string, String string2, String string3) {
        this.b();
        if (this.d) {
            throw new IllegalStateException("visitOuterClass can be called only once.");
        }
        this.d = true;
        if (string == null) {
            throw new IllegalArgumentException("Illegal outer class owner");
        }
        if (string3 != null) {
            f.a(string3);
        }
        super.a(string, string2, string3);
    }

    @Override
    public void a(String string, String string2, String string3, int n2) {
        this.b();
        f.b(string, "class name");
        if (string2 != null) {
            f.b(string2, "outer class name");
        }
        if (string3 != null) {
            int n3;
            for (n3 = 0; n3 < string3.length() && Character.isDigit(string3.charAt(n3)); ++n3) {
            }
            if (n3 == 0 || n3 < string3.length()) {
                f.a(string3, n3, -1, "inner class name");
            }
        }
        d.a(n2, 30239);
        super.a(string, string2, string3, n2);
    }

    @Override
    public j a(int n2, String string, String string2, String string3, Object object) {
        this.b();
        d.a(n2, 413919);
        f.a(this.a, string, "field name");
        f.b(string2, false);
        if (string3 != null) {
            d.c(string3);
        }
        if (object != null) {
            f.c(object);
        }
        j j2 = super.a(n2, string, string2, string3, object);
        return new e(j2);
    }

    @Override
    public r a(int n2, String string, String string2, String string3, String[] arrstring) {
        this.b();
        d.a(n2, 400895);
        if (!"<init>".equals(string) && !"<clinit>".equals(string)) {
            f.b(this.a, string, "method name");
        }
        f.a(string2);
        if (string3 != null) {
            d.b(string3);
        }
        if (arrstring != null) {
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                f.b(arrstring[i2], "exception name at index " + i2);
            }
        }
        f f2 = this.i ? new f(n2, string, string2, super.a(n2, string, string2, string3, arrstring), this.h) : new f(super.a(n2, string, string2, string3, arrstring), this.h);
        f2.a = this.a;
        return f2;
    }

    @Override
    public a a(String string, boolean bl2) {
        this.b();
        f.b(string, false);
        return new c(super.a(string, bl2));
    }

    @Override
    public a a(int n2, v v2, String string, boolean bl2) {
        this.b();
        int n3 = n2 >>> 24;
        if (n3 != 0 && n3 != 17 && n3 != 16) {
            throw new IllegalArgumentException("Invalid type reference sort 0x" + Integer.toHexString(n3));
        }
        d.a(n2, v2);
        f.b(string, false);
        return new c(super.a(n2, v2, string, bl2));
    }

    @Override
    public void a(com.growingio.d.a.c c2) {
        this.b();
        if (c2 == null) {
            throw new IllegalArgumentException("Invalid attribute (must not be null)");
        }
        super.a(c2);
    }

    @Override
    public void a() {
        this.b();
        this.e = true;
        super.a();
    }

    private void b() {
        if (!this.b) {
            throw new IllegalStateException("Cannot visit member before visit has been called.");
        }
        if (this.e) {
            throw new IllegalStateException("Cannot visit member after visitEnd has been called.");
        }
    }

    static void a(int n2, int n3) {
        int n4;
        int n5;
        if ((n2 & ~ n3) != 0) {
            throw new IllegalArgumentException("Invalid access flags: " + n2);
        }
        int n6 = (n2 & 1) == 0 ? 0 : 1;
        int n7 = (n2 & 2) == 0 ? 0 : 1;
        int n8 = n4 = (n2 & 4) == 0 ? 0 : 1;
        if (n6 + n7 + n4 > 1) {
            throw new IllegalArgumentException("public private and protected are mutually exclusive: " + n2);
        }
        int n9 = (n2 & 16) == 0 ? 0 : 1;
        int n10 = n5 = (n2 & 1024) == 0 ? 0 : 1;
        if (n9 + n5 > 1) {
            throw new IllegalArgumentException("final and abstract are mutually exclusive: " + n2);
        }
    }

    public static void a(String string) {
        int n2 = 0;
        if (d.j(string, 0) == '<') {
            n2 = d.a(string, n2);
        }
        n2 = d.d(string, n2);
        while (d.j(string, n2) == 'L') {
            n2 = d.d(string, n2);
        }
        if (n2 != string.length()) {
            throw new IllegalArgumentException(string + ": error at index " + n2);
        }
    }

    public static void b(String string) {
        int n2 = 0;
        if (d.j(string, 0) == '<') {
            n2 = d.a(string, n2);
        }
        n2 = d.a('(', string, n2);
        while ("ZCBSIFJDL[T".indexOf(d.j(string, n2)) != -1) {
            n2 = d.h(string, n2);
        }
        n2 = d.j(string, n2 = d.a(')', string, n2)) == 'V' ? ++n2 : d.h(string, n2);
        while (d.j(string, n2) == '^') {
            if (d.j(string, ++n2) == 'L') {
                n2 = d.d(string, n2);
                continue;
            }
            n2 = d.g(string, n2);
        }
        if (n2 != string.length()) {
            throw new IllegalArgumentException(string + ": error at index " + n2);
        }
    }

    public static void c(String string) {
        int n2 = d.c(string, 0);
        if (n2 != string.length()) {
            throw new IllegalArgumentException(string + ": error at index " + n2);
        }
    }

    static void a(int n2, v v2) {
        int n3 = 0;
        switch (n2 >>> 24) {
            case 0: 
            case 1: 
            case 22: {
                n3 = -65536;
                break;
            }
            case 19: 
            case 20: 
            case 21: 
            case 64: 
            case 65: 
            case 67: 
            case 68: 
            case 69: 
            case 70: {
                n3 = -16777216;
                break;
            }
            case 16: 
            case 17: 
            case 18: 
            case 23: 
            case 66: {
                n3 = -256;
                break;
            }
            case 71: 
            case 72: 
            case 73: 
            case 74: 
            case 75: {
                n3 = -16776961;
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid type reference sort 0x" + Integer.toHexString(n2 >>> 24));
            }
        }
        if ((n2 & ~ n3) != 0) {
            throw new IllegalArgumentException("Invalid type reference 0x" + Integer.toHexString(n2));
        }
        if (v2 != null) {
            for (int i2 = 0; i2 < v2.a(); ++i2) {
                int n4 = v2.a(i2);
                if (n4 != 0 && n4 != 1 && n4 != 3 && n4 != 2) {
                    throw new IllegalArgumentException("Invalid type path step " + i2 + " in " + v2);
                }
                if (n4 == 3 || v2.b(i2) == 0) continue;
                throw new IllegalArgumentException("Invalid type path step argument for step " + i2 + " in " + v2);
            }
        }
    }

    private static int a(String string, int n2) {
        n2 = d.a('<', string, n2);
        n2 = d.b(string, n2);
        while (d.j(string, n2) != '>') {
            n2 = d.b(string, n2);
        }
        return n2 + 1;
    }

    private static int b(String string, int n2) {
        n2 = d.i(string, n2);
        if ("L[T".indexOf(d.j(string, n2 = d.a(':', string, n2))) != -1) {
            n2 = d.c(string, n2);
        }
        while (d.j(string, n2) == ':') {
            n2 = d.c(string, n2 + 1);
        }
        return n2;
    }

    private static int c(String string, int n2) {
        switch (d.j(string, n2)) {
            case 'L': {
                return d.d(string, n2);
            }
            case '[': {
                return d.h(string, n2 + 1);
            }
        }
        return d.g(string, n2);
    }

    private static int d(String string, int n2) {
        n2 = d.a('L', string, n2);
        n2 = d.i(string, n2);
        while (d.j(string, n2) == '/') {
            n2 = d.i(string, n2 + 1);
        }
        if (d.j(string, n2) == '<') {
            n2 = d.e(string, n2);
        }
        while (d.j(string, n2) == '.') {
            if (d.j(string, n2 = d.i(string, n2 + 1)) != '<') continue;
            n2 = d.e(string, n2);
        }
        return d.a(';', string, n2);
    }

    private static int e(String string, int n2) {
        n2 = d.a('<', string, n2);
        n2 = d.f(string, n2);
        while (d.j(string, n2) != '>') {
            n2 = d.f(string, n2);
        }
        return n2 + 1;
    }

    private static int f(String string, int n2) {
        char c2 = d.j(string, n2);
        if (c2 == '*') {
            return n2 + 1;
        }
        if (c2 == '+' || c2 == '-') {
            ++n2;
        }
        return d.c(string, n2);
    }

    private static int g(String string, int n2) {
        n2 = d.a('T', string, n2);
        n2 = d.i(string, n2);
        return d.a(';', string, n2);
    }

    private static int h(String string, int n2) {
        switch (d.j(string, n2)) {
            case 'B': 
            case 'C': 
            case 'D': 
            case 'F': 
            case 'I': 
            case 'J': 
            case 'S': 
            case 'Z': {
                return n2 + 1;
            }
        }
        return d.c(string, n2);
    }

    private static int i(String string, int n2) {
        if (!Character.isJavaIdentifierStart(d.j(string, n2))) {
            throw new IllegalArgumentException(string + ": identifier expected at index " + n2);
        }
        ++n2;
        while (Character.isJavaIdentifierPart(d.j(string, n2))) {
            ++n2;
        }
        return n2;
    }

    private static int a(char c2, String string, int n2) {
        if (d.j(string, n2) == c2) {
            return n2 + 1;
        }
        throw new IllegalArgumentException(string + ": '" + c2 + "' expected at index " + n2);
    }

    private static char j(String string, int n2) {
        return n2 < string.length() ? string.charAt(n2) : '\u0000';
    }
}

