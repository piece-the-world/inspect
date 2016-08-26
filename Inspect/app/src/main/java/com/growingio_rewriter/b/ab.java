/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.ae;
import com.growingio.b.aj;
import com.growingio.b.b;
import com.growingio.b.g;
import com.growingio.b.i;
import com.growingio.b.o;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.ProtectionDomain;
import java.util.Hashtable;
import java.util.Vector;

public class ab
extends ClassLoader {
    private Hashtable b;
    private Vector c;
    private g d;
    private aj e;
    private ProtectionDomain f;
    public boolean a = true;

    public ab() {
        this(null);
    }

    public ab(g g2) {
        this.b(g2);
    }

    public ab(ClassLoader classLoader, g g2) {
        super(classLoader);
        this.b(g2);
    }

    private void b(g g2) {
        this.b = new Hashtable();
        this.c = new Vector();
        this.d = g2;
        this.e = null;
        this.f = null;
        this.a("Loader");
    }

    public void a(String string) {
        if (string.endsWith(".")) {
            this.c.addElement(string);
        } else {
            this.b.put(string, this);
        }
    }

    public void a(ProtectionDomain protectionDomain) {
        this.f = protectionDomain;
    }

    public void a(g g2) {
        this.d = g2;
    }

    public void a(g g2, aj aj2) throws ae, b {
        this.d = g2;
        this.e = aj2;
        aj2.a(g2);
    }

    public static void a(String[] arrstring) throws Throwable {
        ab ab2 = new ab();
        ab2.b(arrstring);
    }

    public void b(String[] arrstring) throws Throwable {
        int n2 = arrstring.length - 1;
        if (n2 >= 0) {
            String[] arrstring2 = new String[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                arrstring2[i2] = arrstring[i2 + 1];
            }
            this.a(arrstring[0], arrstring2);
        }
    }

    public void a(String string, String[] arrstring) throws Throwable {
        Class class_ = this.loadClass(string);
        try {
            class_.getDeclaredMethod("main", String[].class).invoke(null, arrstring);
        }
        catch (InvocationTargetException var4_4) {
            throw var4_4.getTargetException();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected Class loadClass(String string, boolean bl2) throws ClassFormatError, ClassNotFoundException {
        String string2 = string = string.intern();
        synchronized (string2) {
            Class class_ = this.findLoadedClass(string);
            if (class_ == null) {
                class_ = this.b(string);
            }
            if (class_ == null) {
                class_ = this.findClass(string);
            }
            if (class_ == null) {
                class_ = this.c(string);
            }
            if (bl2) {
                this.resolveClass(class_);
            }
            return class_;
        }
    }

    protected Class findClass(String string) throws ClassNotFoundException {
        byte[] arrby;
        Object object;
        block11 : {
            try {
                if (this.d != null) {
                    if (this.e != null) {
                        this.e.a(this.d, string);
                    }
                    try {
                        arrby = this.d.f(string).T();
                        break block11;
                    }
                    catch (ae var3_3) {
                        return null;
                    }
                }
                String string2 = "/" + string.replace('.', '/') + ".class";
                object = this.getClass().getResourceAsStream(string2);
                if (object == null) {
                    return null;
                }
                arrby = i.a((InputStream)object);
            }
            catch (Exception var3_5) {
                throw new ClassNotFoundException("caught an exception while obtaining a class file for " + string, var3_5);
            }
        }
        int n2 = string.lastIndexOf(46);
        if (n2 != -1 && this.getPackage((String)(object = string.substring(0, n2))) == null) {
            try {
                this.definePackage((String)object, null, null, null, null, null, null, null);
            }
            catch (IllegalArgumentException var5_8) {
                // empty catch block
            }
        }
        if (this.f == null) {
            return this.defineClass(string, arrby, 0, arrby.length);
        }
        return this.defineClass(string, arrby, 0, arrby.length, this.f);
    }

    protected Class b(String string) throws ClassNotFoundException {
        Class class_ = null;
        if (this.a && (string.startsWith("java.") || string.startsWith("javax.") || string.startsWith("sun.") || string.startsWith("com.sun.") || string.startsWith("org.w3c.") || string.startsWith("org.xml.") || this.d(string))) {
            class_ = this.c(string);
        }
        return class_;
    }

    private boolean d(String string) {
        if (this.b.get(string) != null) {
            return true;
        }
        int n2 = this.c.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!string.startsWith((String)this.c.elementAt(i2))) continue;
            return true;
        }
        return false;
    }

    protected Class c(String string) throws ClassNotFoundException {
        ClassLoader classLoader = this.getParent();
        if (classLoader != null) {
            return classLoader.loadClass(string);
        }
        return this.findSystemClass(string);
    }
}

