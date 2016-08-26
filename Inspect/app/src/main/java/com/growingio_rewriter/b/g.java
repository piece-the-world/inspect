/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.K;
import com.growingio.b.P;
import com.growingio.b.S;
import com.growingio.b.a.T;
import com.growingio.b.a.p;
import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.e;
import com.growingio.b.h;
import com.growingio.b.i;
import com.growingio.b.m;
import com.growingio.b.o;
import com.growingio.b.r;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class g {
    private static Method g;
    private static Method h;
    private static Method i;
    public boolean a = false;
    public static boolean b;
    private int j;
    private static final int k = 100;
    public static boolean c;
    protected i d = new i();
    protected g e;
    protected Hashtable f = new Hashtable(191);
    private Hashtable l = null;
    private static final int m = 191;
    private ArrayList n;
    private static g o;

    public g() {
        this(null);
    }

    public g(boolean bl2) {
        this(null);
        if (bl2) {
            this.e();
        }
    }

    public g(g g2) {
        this.e = g2;
        if (g2 == null) {
            o[] arro = o.o;
            for (int i2 = 0; i2 < arro.length; ++i2) {
                this.f.put(arro[i2].s(), arro[i2]);
            }
        }
        this.l = null;
        this.j = 0;
        this.c();
    }

    public static synchronized g a() {
        if (o == null) {
            o = new g(null);
            o.e();
        }
        return o;
    }

    protected o a(String string) {
        return (o)this.f.get(string);
    }

    protected void a(String string, o o2, boolean bl2) {
        this.f.put(string, o2);
    }

    protected o b(String string) {
        return (o)this.f.remove(string);
    }

    public String toString() {
        return this.d.toString();
    }

    void b() {
        if (this.j++ > 100) {
            this.j = 0;
            Enumeration enumeration = this.f.elements();
            while (enumeration.hasMoreElements()) {
                ((o)enumeration.nextElement()).W();
            }
        }
    }

    public void c(String string) {
        this.n.add(string);
    }

    public void c() {
        this.n = new ArrayList();
        this.n.add("java.lang");
    }

    public Iterator d() {
        return this.n.iterator();
    }

    public void d(String string) {
    }

    void a(String string, String string2, String string3) {
        if (this.l == null) {
            this.l = new Hashtable();
        }
        this.l.put(string, new Object[]{string2, string3});
    }

    public Object[] e(String string) {
        if (this.l == null) {
            this.l = new Hashtable();
        }
        return (Object[])this.l.get(string);
    }

    public o a(String string, String string2) throws ae {
        o o2 = this.a(string, false);
        if (o2 == null) {
            throw new ae(string);
        }
        if (o2 instanceof r) {
            ((r)o2).a(this);
        }
        o2.a(string2);
        return o2;
    }

    synchronized void a(String string, o o2) {
        o o3 = this.a(string);
        if (o3 == o2) {
            this.b(string);
        }
        String string2 = o2.s();
        this.j(string2);
        this.a(string2, o2, false);
    }

    public o f(String string) throws ae {
        o o2 = string == null ? null : this.a(string, true);
        if (o2 == null) {
            throw new ae(string);
        }
        o2.R();
        return o2;
    }

    public o g(String string) {
        o o2 = null;
        if (string == null) {
            o2 = null;
        } else {
            try {
                o2 = this.a(string, true);
            }
            catch (ae var3_3) {
                // empty catch block
            }
        }
        if (o2 != null) {
            o2.R();
        }
        return o2;
    }

    public o h(String string) throws ae {
        if (string.charAt(0) == '[') {
            return T.c(string, this);
        }
        return this.f(string);
    }

    protected synchronized o a(String string, boolean bl2) throws ae {
        o o2 = null;
        if (bl2 && (o2 = this.a(string)) != null) {
            return o2;
        }
        if (!this.a && this.e != null && (o2 = this.e.a(string, bl2)) != null) {
            return o2;
        }
        o2 = this.b(string, bl2);
        if (o2 != null) {
            if (bl2) {
                this.a(o2.s(), o2, false);
            }
            return o2;
        }
        if (this.a && this.e != null) {
            o2 = this.e.a(string, bl2);
        }
        return o2;
    }

    protected o b(String string, boolean bl2) {
        if (string.charAt(0) == '[') {
            string = T.c(string);
        }
        if (string.endsWith("[]")) {
            String string2 = string.substring(0, string.indexOf(91));
            if (!(bl2 && this.a(string2) != null || this.i(string2) != null)) {
                return null;
            }
            return new m(string, this);
        }
        if (this.i(string) == null) {
            return null;
        }
        return new r(string, this);
    }

    public URL i(String string) {
        return this.d.d(string);
    }

    void j(String string) throws RuntimeException {
        o o2 = this.a(string);
        if (o2 == null) {
            if (!this.a && this.e != null) {
                try {
                    o2 = this.e.a(string, true);
                }
                catch (ae var3_3) {
                    // empty catch block
                }
                if (o2 != null) {
                    throw new RuntimeException(string + " is in a parent ClassPool.  Use the parent.");
                }
            }
        } else if (o2.n()) {
            throw new RuntimeException(string + ": frozen class (cannot edit)");
        }
    }

    o k(String string) {
        o o2 = this.a(string);
        if (o2 == null && !this.a && this.e != null) {
            try {
                o2 = this.e.a(string, true);
            }
            catch (ae var3_3) {
                // empty catch block
            }
        }
        return o2;
    }

    InputStream l(String string) throws ae {
        return this.d.c(string);
    }

    void a(String string, OutputStream outputStream) throws ae, IOException, b {
        this.d.a(string, outputStream);
    }

    public o[] a(String[] arrstring) throws ae {
        if (arrstring == null) {
            return new o[0];
        }
        int n2 = arrstring.length;
        o[] arro = new o[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arro[i2] = this.f(arrstring[i2]);
        }
        return arro;
    }

    public K b(String string, String string2) throws ae {
        o o2 = this.f(string);
        return o2.h(string2);
    }

    public o a(InputStream inputStream) throws IOException, RuntimeException {
        return this.a(inputStream, true);
    }

    public o a(InputStream inputStream, boolean bl2) throws IOException, RuntimeException {
        this.b();
        inputStream = new BufferedInputStream(inputStream);
        r r2 = new r(inputStream, this);
        r2.p();
        String string = r2.s();
        if (bl2) {
            this.j(string);
        }
        this.a(string, r2, true);
        return r2;
    }

    public o a(p p2) throws RuntimeException {
        return this.a(p2, true);
    }

    public o a(p p2, boolean bl2) throws RuntimeException {
        this.b();
        r r2 = new r(p2, this);
        r2.p();
        String string = r2.s();
        if (bl2) {
            this.j(string);
        }
        this.a(string, r2, true);
        return r2;
    }

    public o b(InputStream inputStream) throws IOException, RuntimeException {
        this.b();
        inputStream = new BufferedInputStream(inputStream);
        r r2 = new r(inputStream, this);
        r2.p();
        String string = r2.s();
        o o2 = this.k(string);
        if (o2 != null) {
            return o2;
        }
        this.a(string, r2, true);
        return r2;
    }

    public o m(String string) throws RuntimeException {
        return this.b(string, (o)null);
    }

    public synchronized o b(String string, o o2) throws RuntimeException {
        this.j(string);
        P p2 = new P(string, this, false, o2);
        this.a(string, p2, true);
        return p2;
    }

    synchronized o n(String string) {
        this.j(string);
        S s2 = new S(string, this, false, null);
        this.a(string, s2, true);
        return s2;
    }

    public o o(String string) throws RuntimeException {
        return this.c(string, null);
    }

    public synchronized o c(String string, o o2) throws RuntimeException {
        this.j(string);
        P p2 = new P(string, this, true, o2);
        this.a(string, p2, true);
        return p2;
    }

    public o p(String string) throws RuntimeException {
        try {
            o o2 = this.c(string, this.f("java.lang.annotation.Annotation"));
            o2.a(o2.c() | 8192);
            return o2;
        }
        catch (ae var2_3) {
            throw new RuntimeException(var2_3.getMessage(), var2_3);
        }
    }

    public e e() {
        return this.d.a();
    }

    public e a(e e2) {
        return this.d.a(e2);
    }

    public e b(e e2) {
        return this.d.b(e2);
    }

    public e q(String string) throws ae {
        return this.d.a(string);
    }

    public e r(String string) throws ae {
        return this.d.b(string);
    }

    public void c(e e2) {
        this.d.c(e2);
    }

    public void s(String string) throws ae {
        char c2 = File.pathSeparatorChar;
        int n2 = 0;
        do {
            int n3;
            if ((n3 = string.indexOf(c2, n2)) < 0) break;
            this.r(string.substring(n2, n3));
            n2 = n3 + 1;
        } while (true);
        this.r(string.substring(n2));
    }

    public Class a(o o2) throws b {
        return this.a(o2, this.f());
    }

    public ClassLoader f() {
        return g.g();
    }

    static ClassLoader g() {
        return Thread.currentThread().getContextClassLoader();
    }

    public Class a(o o2, ClassLoader classLoader) throws b {
        return this.a(o2, classLoader, null);
    }

    public Class a(o o2, ClassLoader classLoader, ProtectionDomain protectionDomain) throws b {
        try {
            Object[] arrobject;
            Method method;
            byte[] arrby = o2.T();
            if (protectionDomain == null) {
                method = g;
                arrobject = new Object[]{o2.s(), arrby, new Integer(0), new Integer(arrby.length)};
            } else {
                method = h;
                arrobject = new Object[]{o2.s(), arrby, new Integer(0), new Integer(arrby.length), protectionDomain};
            }
            return (Class)g.a(method, classLoader, arrobject);
        }
        catch (RuntimeException var4_5) {
            throw var4_5;
        }
        catch (InvocationTargetException var4_6) {
            throw new b(var4_6.getTargetException());
        }
        catch (Exception var4_7) {
            throw new b(var4_7);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static synchronized Object a(Method method, ClassLoader classLoader, Object[] arrobject) throws Exception {
        method.setAccessible(true);
        try {
            Object object = method.invoke(classLoader, arrobject);
            return object;
        }
        finally {
            method.setAccessible(false);
        }
    }

    public void a(ClassLoader classLoader, String string) throws b {
        Throwable throwable2;
        Throwable throwable2;
        Object[] arrobject = new Object[]{string, null, null, null, null, null, null, null};
        try {
            g.a(i, classLoader, arrobject);
            return;
        }
        catch (InvocationTargetException var5_4) {
            throwable2 = var5_4.getTargetException();
            if (throwable2 == null) {
                throwable2 = var5_4;
            } else if (throwable2 instanceof IllegalArgumentException) {
                return;
            }
        }
        catch (Exception var5_5) {
            throwable2 = var5_5;
        }
        throw new b(throwable2);
    }

    static /* synthetic */ Method a(Method method) {
        g = method;
        return g;
    }

    static /* synthetic */ Method b(Method method) {
        h = method;
        return h;
    }

    static /* synthetic */ Method c(Method method) {
        i = method;
        return i;
    }

    static {
        try {
            AccessController.doPrivileged(new h());
        }
        catch (PrivilegedActionException var0) {
            throw new RuntimeException("cannot initialize ClassPool", var0.getException());
        }
        b = false;
        c = true;
        o = null;
    }
}

