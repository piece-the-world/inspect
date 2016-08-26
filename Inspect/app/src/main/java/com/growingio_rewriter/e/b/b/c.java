/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.b.b;

import com.growingio.e.b.h;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class c
implements h {
    private static final long c = 1803952589649545191L;
    private final String d;
    private List<h> e;
    private static String f = "[ ";
    private static String g = " ]";
    private static String h = ", ";

    c(String string) {
        if (string == null) {
            throw new IllegalArgumentException("A marker name cannot be null");
        }
        this.d = string;
    }

    @Override
    public String a() {
        return this.d;
    }

    @Override
    public synchronized void a(h h2) {
        if (h2 == null) {
            throw new IllegalArgumentException("A null value cannot be added to a Marker as reference.");
        }
        if (this.c(h2)) {
            return;
        }
        if (h2.c(this)) {
            return;
        }
        if (this.e == null) {
            this.e = new Vector<h>();
        }
        this.e.add(h2);
    }

    @Override
    public synchronized boolean c() {
        return this.e != null && this.e.size() > 0;
    }

    @Override
    public boolean b() {
        return this.c();
    }

    @Override
    public synchronized Iterator<h> d() {
        if (this.e != null) {
            return this.e.iterator();
        }
        List list = Collections.emptyList();
        return list.iterator();
    }

    @Override
    public synchronized boolean b(h h2) {
        if (this.e == null) {
            return false;
        }
        int n2 = this.e.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            h h3 = this.e.get(i2);
            if (!h2.equals(h3)) continue;
            this.e.remove(i2);
            return true;
        }
        return false;
    }

    @Override
    public boolean c(h h2) {
        if (h2 == null) {
            throw new IllegalArgumentException("Other cannot be null");
        }
        if (this.equals(h2)) {
            return true;
        }
        if (this.c()) {
            for (h h3 : this.e) {
                if (!h3.c(h2)) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean a(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Other cannot be null");
        }
        if (this.d.equals(string)) {
            return true;
        }
        if (this.c()) {
            for (h h2 : this.e) {
                if (!h2.a(string)) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof h)) {
            return false;
        }
        h h2 = (h)object;
        return this.d.equals(h2.a());
    }

    @Override
    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        if (!this.c()) {
            return this.a();
        }
        Iterator<h> iterator = this.d();
        StringBuilder stringBuilder = new StringBuilder(this.a());
        stringBuilder.append(' ').append(f);
        while (iterator.hasNext()) {
            h h2 = iterator.next();
            stringBuilder.append(h2.a());
            if (!iterator.hasNext()) continue;
            stringBuilder.append(h);
        }
        stringBuilder.append(g);
        return stringBuilder.toString();
    }
}

