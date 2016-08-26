/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.O;
import com.growingio.a.a.c.U;
import com.growingio.a.a.c.V;
import com.growingio.a.a.c.ar;
import com.growingio.a.a.c.as;
import java.util.AbstractQueue;
import java.util.Iterator;

final class T<K, V>
extends AbstractQueue<as<K, V>> {
    final as<K, V> a;

    T() {
        this.a = new U(this);
    }

    public boolean a(as<K, V> as2) {
        O.b(as2.g(), as2.f());
        O.b(this.a.g(), as2);
        O.b(as2, this.a);
        return true;
    }

    public as<K, V> a() {
        as<K, V> as2 = this.a.f();
        return as2 == this.a ? null : as2;
    }

    public as<K, V> b() {
        as<K, V> as2 = this.a.f();
        if (as2 == this.a) {
            return null;
        }
        this.remove(as2);
        return as2;
    }

    @Override
    public boolean remove(Object object) {
        as as2 = (as)object;
        as as3 = as2.g();
        as as4 = as2.f();
        O.b(as3, as4);
        O.b(as2);
        return as4 != ar.a;
    }

    @Override
    public boolean contains(Object object) {
        as as2 = (as)object;
        return as2.f() != ar.a;
    }

    @Override
    public boolean isEmpty() {
        return this.a.f() == this.a;
    }

    @Override
    public int size() {
        int n2 = 0;
        for (as<K, V> as2 = this.a.f(); as2 != this.a; as2 = as2.f()) {
            ++n2;
        }
        return n2;
    }

    @Override
    public void clear() {
        as<K, V> as2 = this.a.f();
        while (as2 != this.a) {
            as<K, V> as3 = as2.f();
            O.b(as2);
            as2 = as3;
        }
        this.a.a(this.a);
        this.a.b(this.a);
    }

    @Override
    public Iterator<as<K, V>> iterator() {
        return new V(this, this.a());
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

