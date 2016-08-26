/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.f;

import com.growingio.b.ac;
import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.e;
import com.growingio.b.f.d;
import com.growingio.b.f.f;
import com.growingio.b.g;
import com.growingio.b.o;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.security.ProtectionDomain;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;

public class a
extends g {
    protected d g;
    protected WeakReference h;
    protected ac i;
    protected f j = new f();
    boolean k = true;

    protected a(ClassLoader classLoader, g g2, d d2) {
        this(classLoader, g2, d2, false);
    }

    protected a(ClassLoader classLoader, g g2, d d2, boolean bl2) {
        super(g2);
        this.g = d2;
        this.h = new WeakReference<ClassLoader>(classLoader);
        if (classLoader != null) {
            this.i = new ac(classLoader);
            this.a(this.i);
        }
        this.a = true;
        if (!bl2 && classLoader == null) {
            this.k = true;
        }
    }

    @Override
    public ClassLoader f() {
        ClassLoader classLoader = this.h();
        if (classLoader == null && !this.k) {
            throw new IllegalStateException("ClassLoader has been garbage collected");
        }
        return classLoader;
    }

    protected ClassLoader h() {
        return (ClassLoader)this.h.get();
    }

    public void i() {
        this.c(this.i);
        this.i.a();
        this.f.clear();
        this.j.clear();
    }

    public synchronized void t(String string) {
        this.f.remove(string);
        this.j.remove(string);
    }

    public synchronized void b(o o2) {
        if (this.g.b()) {
            o2.Q();
        }
        this.f.remove(o2.s());
        this.j.put(o2.s(), o2);
    }

    public boolean j() {
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected o a(String string) {
        o o2 = this.u(string);
        if (o2 == null) {
            Object object;
            boolean bl2 = false;
            ClassLoader classLoader = this.h();
            if (classLoader != null) {
                int n2 = string.lastIndexOf(36);
                object = null;
                object = n2 < 0 ? string.replaceAll("[\\.]", "/") + ".class" : string.substring(0, n2).replaceAll("[\\.]", "/") + string.substring(n2) + ".class";
                boolean bl3 = bl2 = classLoader.getResource((String)object) != null;
            }
            if (!bl2) {
                Map map;
                object = map = this.g.c();
                synchronized (object) {
                    for (a a2 : map.values()) {
                        if (a2.j()) {
                            this.g.c(a2.f());
                            continue;
                        }
                        o2 = a2.u(string);
                        if (o2 == null) continue;
                        return o2;
                    }
                }
            }
        }
        return o2;
    }

    @Override
    protected void a(String string, o o2, boolean bl2) {
        if (bl2) {
            super.a(string, o2, bl2);
        } else {
            if (this.g.b()) {
                o2.Q();
            }
            this.j.put(string, o2);
        }
    }

    public void c(o o2) {
        super.a(o2.s(), o2, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected o u(String string) {
        o o2 = (o)this.f.get(string);
        if (o2 != null) {
            return o2;
        }
        f f2 = this.j;
        synchronized (f2) {
            return (o)this.j.get(string);
        }
    }

    public synchronized o v(String string) throws ae {
        this.j.remove(string);
        o o2 = (o)this.f.get(string);
        if (o2 == null) {
            o2 = this.b(string, true);
            if (o2 == null) {
                throw new ae(string);
            }
            super.a(string, o2, false);
        }
        return o2;
    }

    @Override
    public Class a(o o2, ClassLoader classLoader, ProtectionDomain protectionDomain) throws b {
        this.c(o2);
        return super.a(o2, this.h(), protectionDomain);
    }

    static {
        g.b = false;
        g.c = false;
    }
}

