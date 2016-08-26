/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.ab;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.be;
import com.growingio.a.a.d.hG;
import com.growingio.a.a.d.hT;
import com.growingio.a.a.d.hV;
import com.growingio.a.a.d.id;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReferenceArray;

final class bc<K, V>
extends hV<K, V> {
    bc(hG<K, V> hG2, int n2, int n3) {
        super(hG2, n2, n3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    V a(K k2, int n2, aq<? super K, ? extends V> aq2) throws ExecutionException {
        try {
            be<? super K, ? extends V> be2;
            Object v2;
            hT<Object, Object> hT2;
            do {
                if ((hT2 = this.a(k2, n2)) != null && (v2 = this.a(hT2)) != null) {
                    be2 = (be<? super K, ? extends V>)v2;
                    return (V)be2;
                }
                if (hT2 == null || !hT2.a().b()) {
                    boolean bl2;
                    bl2 = true;
                    be2 = null;
                    this.lock();
                    try {
                        this.k();
                        int n3 = this.b - 1;
                        AtomicReferenceArray atomicReferenceArray = this.e;
                        int n4 = n2 & atomicReferenceArray.length() - 1;
                        for (hT2 = hT3 = (hT<Object, Object>)atomicReferenceArray.get((int)n4); hT2 != null; hT2 = hT2.b()) {
                            Object k3 = hT2.d();
                            if (hT2.c() != n2 || k3 == null || !this.a.l.a(k2, k3)) continue;
                            id id2 = hT2.a();
                            if (id2.b()) {
                                bl2 = false;
                                break;
                            }
                            Object v3 = hT2.a().get();
                            if (v3 != null) {
                                Object v4 = v3;
                                return v4;
                            }
                            this.b = n3;
                            break;
                        }
                        if (bl2) {
                            be2 = new be<K, V>(aq2);
                            if (hT2 == null) {
                                hT<Object, Object> hT3;
                                hT2 = this.a(k2, n2, hT3);
                                hT2.a(be2);
                                atomicReferenceArray.set(n4, hT2);
                            } else {
                                hT2.a(be2);
                            }
                        }
                    }
                    finally {
                        this.unlock();
                    }
                    if (bl2) {
                        V v5 = this.a(k2, n2, hT2, be2);
                        return v5;
                    }
                }
                aU.b(!Thread.holdsLock(hT2), "Recursive computation");
            } while ((v2 = hT2.a().c()) == null);
            be2 = (be<? super K, ? extends V>)v2;
            return (V)be2;
        }
        finally {
            this.j();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    V a(K k2, int n2, hT<K, V> hT2, be<K, V> be2) throws ExecutionException {
        Object v2 = null;
        try {
            hT<K, V> hT3 = hT2;
            synchronized (hT3) {
                v2 = be2.a(k2, n2);
            }
            if (v2 != null) {
                hT3 = this.a(k2, n2, v2, true);
            }
            hT3 = v2;
            return (V)hT3;
        }
        finally {
            if (v2 == null) {
                this.b(k2, n2, be2);
            }
        }
    }
}

