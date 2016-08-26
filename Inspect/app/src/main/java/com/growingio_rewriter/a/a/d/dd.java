/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.cC;
import com.growingio.a.a.d.lI;
import java.util.Collection;
import java.util.Set;

public abstract class dd<E>
extends cC<E>
implements Set<E> {
    protected dd() {
    }

    protected abstract Set<E> a();

    @Override
    public boolean equals(Object object) {
        return object == this || this.a().equals(object);
    }

    @Override
    public int hashCode() {
        return this.a().hashCode();
    }

    @Override
    protected boolean c(Collection<?> collection) {
        return lI.a(this, aU.a(collection));
    }

    protected boolean i(Object object) {
        return lI.a(this, object);
    }

    protected int j() {
        return lI.b(this);
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.a();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

