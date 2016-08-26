/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.b;

import com.growingio.e.a.a.a.b.a;
import com.growingio.e.a.a.a.b.f;
import com.growingio.e.a.a.a.b.n;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class r
extends a
implements f,
Serializable {
    private static final long a = 5767770777065432721L;
    private final List<n> b;

    public r() {
        this.b = new ArrayList<n>();
    }

    public r(List<n> list) {
        this.b = list == null ? new ArrayList<n>() : new ArrayList<n>(list);
    }

    public r(n n2, n n3) {
        if (n2 == null || n3 == null) {
            throw new IllegalArgumentException("The filters must not be null");
        }
        this.b = new ArrayList<n>(2);
        this.a(n2);
        this.a(n3);
    }

    @Override
    public void a(n n2) {
        this.b.add(n2);
    }

    @Override
    public List<n> a() {
        return Collections.unmodifiableList(this.b);
    }

    @Override
    public boolean b(n n2) {
        return this.b.remove(n2);
    }

    @Override
    public void a(List<n> list) {
        this.b.clear();
        this.b.addAll(list);
    }

    @Override
    public boolean accept(File file) {
        for (n n2 : this.b) {
            if (!n2.accept(file)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean accept(File file, String string) {
        for (n n2 : this.b) {
            if (!n2.accept(file, string)) continue;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("(");
        if (this.b != null) {
            for (int i2 = 0; i2 < this.b.size(); ++i2) {
                n n2;
                if (i2 > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append((n2 = this.b.get(i2)) == null ? "null" : n2.toString());
            }
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

