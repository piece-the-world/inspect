/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.f;

import com.growingio.b.ac;
import com.growingio.b.f.a;
import com.growingio.b.f.b;
import com.growingio.b.f.c;
import com.growingio.b.f.d;
import com.growingio.b.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class e
implements d {
    private static final e e = new e();
    private boolean f = true;
    boolean a;
    protected Map b = Collections.synchronizedMap(new WeakHashMap());
    protected g c = g.a();
    protected b d = new c();

    public static d e() {
        return e;
    }

    private e() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        this.c.a(new ac(classLoader));
    }

    @Override
    public boolean b() {
        return this.f;
    }

    @Override
    public void a(boolean bl2) {
        this.f = bl2;
    }

    @Override
    public a a(ClassLoader classLoader, g g2) {
        return this.d.a(classLoader, g2, this);
    }

    @Override
    public g a(ClassLoader classLoader) {
        if (classLoader == null) {
            return this.b(ClassLoader.getSystemClassLoader());
        }
        return this.b(classLoader);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public g b(ClassLoader classLoader) {
        Map map = this.b;
        synchronized (map) {
            if (this.b.containsKey(classLoader)) {
                return (g)this.b.get(classLoader);
            }
            a a2 = this.a(classLoader, this.c);
            this.b.put(classLoader, a2);
            return a2;
        }
    }

    @Override
    public Map c() {
        this.d();
        return this.b;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void d() {
        ArrayList<ClassLoader> arrayList = null;
        Map map = this.b;
        synchronized (map) {
            Iterator iterator = this.b.values().iterator();
            while (iterator.hasNext()) {
                a a2 = (a)iterator.next();
                if (!a2.j()) continue;
                iterator.remove();
                ClassLoader classLoader = a2.f();
                if (classLoader == null) continue;
                if (arrayList == null) {
                    arrayList = new ArrayList<ClassLoader>();
                }
                arrayList.add(classLoader);
            }
            if (arrayList != null) {
                for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                    this.c((ClassLoader)arrayList.get(i2));
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void c(ClassLoader classLoader) {
        Map map = this.b;
        synchronized (map) {
            a a2 = (a)this.b.remove(classLoader);
            if (a2 != null) {
                a2.i();
            }
        }
    }

    public void a(d d2) {
    }

    @Override
    public void a(b b2) {
        this.d = b2;
    }

    @Override
    public b a() {
        return this.d;
    }
}

