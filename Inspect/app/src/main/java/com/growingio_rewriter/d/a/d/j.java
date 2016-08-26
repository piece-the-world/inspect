/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.d;

import com.growingio.d.a.d.a;
import com.growingio.d.a.d.i;
import java.util.ListIterator;
import java.util.NoSuchElementException;

final class j
implements ListIterator {
    a a;
    a b;
    a c;
    final /* synthetic */ i d;

    j(i i2, int n2) {
        this.d = i2;
        if (n2 == i2.a()) {
            this.a = null;
            this.b = i2.c();
        } else {
            this.a = i2.a(n2);
            this.b = this.a.t;
        }
    }

    @Override
    public boolean hasNext() {
        return this.a != null;
    }

    @Override
    public Object next() {
        a a2;
        if (this.a == null) {
            throw new NoSuchElementException();
        }
        this.b = a2 = this.a;
        this.a = a2.u;
        this.c = a2;
        return a2;
    }

    @Override
    public void remove() {
        if (this.c != null) {
            if (this.c == this.a) {
                this.a = this.a.u;
            } else {
                this.b = this.b.t;
            }
        } else {
            throw new IllegalStateException();
        }
        this.d.e(this.c);
        this.c = null;
    }

    @Override
    public boolean hasPrevious() {
        return this.b != null;
    }

    public Object previous() {
        a a2;
        this.a = a2 = this.b;
        this.b = a2.t;
        this.c = a2;
        return a2;
    }

    @Override
    public int nextIndex() {
        if (this.a == null) {
            return this.d.a();
        }
        if (this.d.a == null) {
            this.d.a = this.d.e();
        }
        return this.a.v;
    }

    @Override
    public int previousIndex() {
        if (this.b == null) {
            return -1;
        }
        if (this.d.a == null) {
            this.d.a = this.d.e();
        }
        return this.b.v;
    }

    public void add(Object object) {
        if (this.a != null) {
            this.d.c(this.a, (a)object);
        } else if (this.b != null) {
            this.d.b(this.b, (a)object);
        } else {
            this.d.c((a)object);
        }
        this.b = (a)object;
        this.c = null;
    }

    public void set(Object object) {
        if (this.c != null) {
            this.d.a(this.c, (a)object);
            if (this.c == this.b) {
                this.b = (a)object;
            } else {
                this.a = (a)object;
            }
        } else {
            throw new IllegalStateException();
        }
    }
}

