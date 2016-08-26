/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.f;

import com.growingio.b.f.g;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class f
extends AbstractMap
implements Map {
    private Map a;
    private ReferenceQueue b = new ReferenceQueue();

    public Set entrySet() {
        this.a();
        return this.a.entrySet();
    }

    private void a() {
        g g2;
        while ((g2 = (g)this.b.poll()) != null) {
            if (g2 != (g)this.a.get(g2.a)) continue;
            this.a.remove(g2.a);
        }
    }

    public f(int n2, float f2) {
        this.a = new HashMap(n2, f2);
    }

    public f(int n2) {
        this.a = new HashMap(n2);
    }

    public f() {
        this.a = new HashMap();
    }

    public f(Map map) {
        this(Math.max(2 * map.size(), 11), 0.75f);
        this.putAll(map);
    }

    @Override
    public int size() {
        this.a();
        return this.a.size();
    }

    @Override
    public boolean isEmpty() {
        this.a();
        return this.a.isEmpty();
    }

    @Override
    public boolean containsKey(Object object) {
        this.a();
        return this.a.containsKey(object);
    }

    public Object get(Object object) {
        this.a();
        SoftReference softReference = (SoftReference)this.a.get(object);
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public Object put(Object object, Object object2) {
        this.a();
        g g2 = this.a.put(object, g.a(object, object2, this.b));
        if (g2 != null) {
            g2 = ((SoftReference)g2).get();
        }
        return g2;
    }

    public Object remove(Object object) {
        this.a();
        return this.a.remove(object);
    }

    @Override
    public void clear() {
        this.a();
        this.a.clear();
    }
}

