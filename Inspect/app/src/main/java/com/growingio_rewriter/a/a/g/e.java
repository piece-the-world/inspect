/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.g.L;
import com.growingio.a.a.g.x;
import java.util.Set;

public abstract class e<N, E>
implements L<N, E> {
    @Override
    public int c_(Object object) {
        return this.d(object).size();
    }

    @Override
    public int g(Object object) {
        return this.a_(object).size();
    }

    @Override
    public int h(Object object) {
        return this.b_(object).size();
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof L)) {
            return false;
        }
        return x.a(this, (L)object);
    }

    @Override
    public int hashCode() {
        return x.b(this);
    }

    public String toString() {
        return x.c(this);
    }
}

