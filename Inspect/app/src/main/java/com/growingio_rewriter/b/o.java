/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.K;
import com.growingio.b.V;
import com.growingio.b.a.T;
import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.b.a;
import com.growingio.b.d;
import com.growingio.b.d.e;
import com.growingio.b.g;
import com.growingio.b.j;
import com.growingio.b.n;
import com.growingio.b.p;
import com.growingio.b.q;
import com.growingio.b.s;
import com.growingio.b.t;
import com.growingio.b.z;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.security.ProtectionDomain;
import java.util.Collection;
import java.util.Map;

public abstract class o {
    protected String b;
    public static String c = null;
    public static final String d = "3.20.0-GA";
    static final String e = "java.lang.Object";
    public static o f;
    public static o g;
    public static o h;
    public static o i;
    public static o j;
    public static o k;
    public static o l;
    public static o m;
    public static o n;
    static o[] o;

    public static void a(String[] arrstring) {
        System.out.println("Javassist version 3.20.0-GA");
        System.out.println("Copyright (C) 1999-2015 Shigeru Chiba. All Rights Reserved.");
    }

    protected o(String string) {
        this.b = string;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(this.getClass().getName());
        stringBuffer.append("@");
        stringBuffer.append(Integer.toHexString(this.hashCode()));
        stringBuffer.append("[");
        this.a(stringBuffer);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    protected void a(StringBuffer stringBuffer) {
        stringBuffer.append(this.s());
    }

    public g a() {
        return null;
    }

    public com.growingio.b.a.p i() {
        this.p();
        return this.j();
    }

    public com.growingio.b.a.p j() {
        return null;
    }

    public a k() {
        return null;
    }

    public URL l() throws ae {
        throw new ae(this.s());
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return true;
    }

    public void o() {
    }

    void p() throws RuntimeException {
        if (this.n()) {
            throw new RuntimeException(this.s() + " class is frozen");
        }
    }

    public void q() {
        throw new RuntimeException("cannot defrost " + this.s());
    }

    public boolean r() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public o e() throws ae {
        return null;
    }

    public boolean a(o o2) throws ae {
        return this == o2 || this.s().equals(o2.s());
    }

    public String s() {
        return this.b;
    }

    public final String t() {
        String string = this.b;
        int n2 = string.lastIndexOf(46);
        if (n2 < 0) {
            return string;
        }
        return string.substring(n2 + 1);
    }

    public final String u() {
        String string = this.b;
        int n2 = string.lastIndexOf(46);
        if (n2 < 0) {
            return null;
        }
        return string.substring(0, n2);
    }

    public void a(String string) {
        this.p();
        if (string != null) {
            this.b = string;
        }
    }

    public String v() {
        return null;
    }

    public void b(String string) {
        this.p();
    }

    public void b(String string, String string2) {
        this.p();
    }

    public void a(d d2) {
        this.p();
    }

    public synchronized Collection w() {
        com.growingio.b.a.p p2 = this.j();
        if (p2 != null) {
            p p3 = new p(this);
            p2.b(p3);
            return p3.values();
        }
        return null;
    }

    public boolean x() {
        return false;
    }

    public boolean y() {
        return false;
    }

    public boolean z() {
        return false;
    }

    public int c() {
        return 0;
    }

    public boolean a(Class class_) {
        return this.c(class_.getName());
    }

    public boolean c(String string) {
        return false;
    }

    public Object b(Class class_) throws ClassNotFoundException {
        return null;
    }

    public Object[] A() throws ClassNotFoundException {
        return new Object[0];
    }

    public Object[] B() {
        return new Object[0];
    }

    public o[] C() throws ae {
        return this.D();
    }

    public o[] D() throws ae {
        return new o[0];
    }

    public void a(int n2) {
        this.p();
    }

    public boolean b(o o2) {
        return false;
    }

    public o f() throws ae {
        return null;
    }

    public void c(o o2) throws b {
        this.p();
    }

    public o[] d() throws ae {
        return new o[0];
    }

    public void a(o[] arro) {
        this.p();
    }

    public void d(o o2) {
        this.p();
    }

    public o E() throws ae {
        return null;
    }

    public final K F() throws ae {
        n n2 = this.G();
        if (n2 == null) {
            return null;
        }
        if (n2 instanceof K) {
            return (K)n2;
        }
        throw new ae(n2.a() + " is enclosing " + this.s());
    }

    public n G() throws ae {
        return null;
    }

    public o a(String string, boolean bl2) {
        throw new RuntimeException(this.s() + " is not a class");
    }

    public t[] H() {
        return new t[0];
    }

    public t d(String string) throws ae {
        return this.c(string, null);
    }

    public t c(String string, String string2) throws ae {
        throw new ae(string);
    }

    t d(String string, String string2) {
        return null;
    }

    public t[] I() {
        return new t[0];
    }

    public t e(String string) throws ae {
        throw new ae(string);
    }

    public t e(String string, String string2) throws ae {
        throw new ae(string);
    }

    public n[] J() {
        return new n[0];
    }

    public s[] h() {
        return new s[0];
    }

    public s f(String string) throws ae {
        throw new ae("no such constructor");
    }

    public s[] K() {
        return new s[0];
    }

    public s b(o[] arro) throws ae {
        String string = T.a(arro);
        return this.f(string);
    }

    public s L() {
        return null;
    }

    public K[] g() {
        return new K[0];
    }

    public K a(String string, String string2) throws ae {
        throw new ae(string);
    }

    public K[] M() {
        return new K[0];
    }

    public K a(String string, o[] arro) throws ae {
        throw new ae(string);
    }

    public K[] g(String string) throws ae {
        throw new ae(string);
    }

    public K h(String string) throws ae {
        throw new ae(string);
    }

    public s N() throws b {
        throw new b("not a class");
    }

    public void a(s s2) throws b {
        this.p();
    }

    public void b(s s2) throws ae {
        this.p();
    }

    public void a(K k2) throws b {
        this.p();
    }

    public void b(K k2) throws ae {
        this.p();
    }

    public void a(t t2) throws b {
        this.a(t2, (z)null);
    }

    public void a(t t2, String string) throws b {
        this.p();
    }

    public void a(t t2, z z2) throws b {
        this.p();
    }

    public void b(t t2) throws ae {
        this.p();
    }

    public byte[] i(String string) {
        return null;
    }

    public void a(String string, byte[] arrby) {
        this.p();
    }

    public void a(j j2) throws b {
        this.p();
    }

    public void a(e e2) throws b {
        this.p();
    }

    public Class O() throws b {
        return this.a().a(this);
    }

    public Class a(ClassLoader classLoader, ProtectionDomain protectionDomain) throws b {
        g g2 = this.a();
        if (classLoader == null) {
            classLoader = g2.f();
        }
        return g2.a(this, classLoader, protectionDomain);
    }

    public final Class a(ClassLoader classLoader) throws b {
        return this.a().a(this, classLoader);
    }

    public void P() {
        g g2 = this.a();
        o o2 = g2.b(this.s());
        if (o2 != this) {
            g2.a(this.s(), o2, false);
        }
    }

    public boolean a(boolean bl2) {
        return true;
    }

    public void Q() {
    }

    void R() {
    }

    public void S() {
    }

    public byte[] T() throws IOException, b {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            this.a(dataOutputStream);
        }
        finally {
            dataOutputStream.close();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public void U() throws ae, IOException, b {
        this.j(".");
    }

    public void j(String string) throws b, IOException {
        DataOutputStream dataOutputStream = this.k(string);
        try {
            this.a(dataOutputStream);
        }
        finally {
            dataOutputStream.close();
        }
    }

    protected DataOutputStream k(String string) {
        String string2;
        String string3 = this.s();
        String string4 = string + File.separatorChar + string3.replace('.', File.separatorChar) + ".class";
        int n2 = string4.lastIndexOf(File.separatorChar);
        if (n2 > 0 && !(string2 = string4.substring(0, n2)).equals(".")) {
            new File(string2).mkdirs();
        }
        return new DataOutputStream(new BufferedOutputStream(new q(string4)));
    }

    public void V() {
        this.l(".");
    }

    public void l(String string) {
        try {
            boolean bl2 = this.a(true);
            this.j(string);
            this.q();
            this.a(bl2);
        }
        catch (Exception var2_3) {
            throw new RuntimeException(var2_3);
        }
    }

    public void a(DataOutputStream dataOutputStream) throws b, IOException {
        throw new b("not a class");
    }

    public String m(String string) {
        throw new RuntimeException("not available in " + this.s());
    }

    void W() {
    }

    static {
        o = new o[9];
        o.o[0] = o.f = new V("boolean", 'Z', "java.lang.Boolean", "booleanValue", "()Z", 172, 4, 1);
        o.o[1] = o.g = new V("char", 'C', "java.lang.Character", "charValue", "()C", 172, 5, 1);
        o.o[2] = o.h = new V("byte", 'B', "java.lang.Byte", "byteValue", "()B", 172, 8, 1);
        o.o[3] = o.i = new V("short", 'S', "java.lang.Short", "shortValue", "()S", 172, 9, 1);
        o.o[4] = o.j = new V("int", 'I', "java.lang.Integer", "intValue", "()I", 172, 10, 1);
        o.o[5] = o.k = new V("long", 'J', "java.lang.Long", "longValue", "()J", 173, 11, 2);
        o.o[6] = o.l = new V("float", 'F', "java.lang.Float", "floatValue", "()F", 174, 6, 1);
        o.o[7] = o.m = new V("double", 'D', "java.lang.Double", "doubleValue", "()D", 175, 7, 2);
        o.o[8] = o.n = new V("void", 'V', "java.lang.Void", null, null, 177, 0, 0);
    }
}

