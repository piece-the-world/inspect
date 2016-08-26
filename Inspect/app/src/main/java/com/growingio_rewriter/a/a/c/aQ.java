/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.O;
import com.growingio.a.a.c.aR;
import com.growingio.a.a.c.aS;
import com.growingio.a.a.c.ar;
import com.growingio.a.a.c.as;
import java.util.AbstractQueue;
import java.util.Iterator;

final class aQ<K, V>
extends AbstractQueue<as<K, V>> {
    final as<K, V> a;

    aQ() {
        this.a = new aR(this);
    }

    public boolean a(as<K, V> as2) {
        O.c(as2.j(), as2.i());
        O.c(this.a.j(), as2);
        O.c(as2, this.a);
        return true;
    }

    public as<K, V> a() {
        as<K, V> as2 = this.a.i();
        return as2 == this.a ? null : as2;
    }

    public as<K, V> b() {
        as<K, V> as2 = this.a.i();
        if (as2 == this.a) {
            return null;
        }
        this.remove(as2);
        return as2;
    }

    @Override
    public boolean remove(Object object) {
        as as2 = (as)object;
        as as3 = as2.j();
        as as4 = as2.i();
        O.c(as3, as4);
        O.c(as2);
        return as4 != ar.a;
    }

    @Override
    public boolean contains(Object object) {
        as as2 = (as)object;
        return as2.i() != ar.a;
    }

    @Override
    public boolean isEmpty() {
        return this.a.i() == this.a;
    }

    @Override
    public int size() {
        int n2 = 0;
        for (as<K, V> as2 = this.a.i(); as2 != this.a; as2 = as2.i()) {
            ++n2;
        }
        return n2;
    }

    @Override
    public void clear() {
        as<K, V> as2 = this.a.i();
        while (as2 != this.a) {
            as<K, V> as3 = as2.i();
            O.c(as2);
            as2 = as3;
        }
        this.a.c(this.a);
        this.a.d(this.a);
    }

    @Override
    public Iterator<as<K, V>> iterator() {
        return new aS(this, this.a());
    }

    @Override
    public /* synthetic */ Object peek() {
        return this.a();
    }

    @Override
    public /* synthetic */ Object poll() {
        return this.b();
    }

    @Override
    public /* synthetic */ boolean offer(Object object) {
        return this.a((as)object);
    }
}

