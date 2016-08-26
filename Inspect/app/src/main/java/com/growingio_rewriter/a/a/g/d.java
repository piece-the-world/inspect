/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.g.r;
import com.growingio.a.a.g.x;
import java.util.Set;

public abstract class d<N>
implements r<N> {
    @Override
    public int c_(Object object) {
        return this.a(object).size();
    }

    @Override
    public int g(Object object) {
        return this.b(object).size();
    }

    @Override
    public int h(Object object) {
        return this.c(object).size();
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof r)) {
            return false;
        }
        return x.a(this, (r)object);
    }

    @Override
    public int hashCode() {
        return x.b(this);
    }

    public String toString() {
        return x.c(this);
    }
}

