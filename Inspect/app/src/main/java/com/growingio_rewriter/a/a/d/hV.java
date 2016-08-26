/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.ab;
import com.growingio.a.a.d.hG;
import com.growingio.a.a.d.hL;
import com.growingio.a.a.d.hT;
import com.growingio.a.a.d.hX;
import com.growingio.a.a.d.id;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

class hV<K, V>
extends ReentrantLock {
    final hG<K, V> a;
    volatile int b;
    int c;
    int d;
    volatile AtomicReferenceArray<hT<K, V>> e;
    final int f;
    final ReferenceQueue<K> g;
    final ReferenceQueue<V> h;
    final AtomicInteger i = new AtomicInteger();

    hV(hG<K, V> hG2, int n2, int n3) {
        this.a = hG2;
        this.f = n3;
        this.a(this.a(n2));
        this.g = hG2.b() ? new ReferenceQueue() : null;
        this.h = hG2.c() ? new ReferenceQueue() : null;
    }

    AtomicReferenceArray<hT<K, V>> a(int n2) {
        return new AtomicReferenceArray<hT<K, V>>(n2);
    }

    void a(AtomicReferenceArray<hT<K, V>> atomicReferenceArray) {
        this.d = atomicReferenceArray.length() * 3 / 4;
        if (this.d == this.f) {
            ++this.d;
        }
        this.e = atomicReferenceArray;
    }

    hT<K, V> a(K k2, int n2, hT<K, V> hT2) {
        return this.a.p.a(this, k2, n2, hT2);
    }

    hT<K, V> a(hT<K, V> hT2, hT<K, V> hT3) {
        if (hT2.d() == null) {
            return null;
        }
        id<K, V> id2 = hT2.a();
        V v2 = id2.get();
        if (v2 == null && !id2.b()) {
            return null;
        }
        hT<K, V> hT4 = this.a.p.a(this, hT2, hT3);
        hT4.a(id2.a(this.h, v2, hT4));
        return hT4;
    }

    void a(hT<K, V> hT2, V v2) {
        id<K, V> id2 = this.a.o.a(this, hT2, v2);
        hT2.a(id2);
    }

    void a() {
        if (this.tryLock()) {
            try {
                this.b();
            }
            finally {
                this.unlock();
            }
        }
    }

    void b() {
        if (this.a.b()) {
            this.c();
        }
        if (this.a.c()) {
            this.d();
        }
    }

    void c() {
        Reference<K> reference;
        int n2 = 0;
        while ((reference = this.g.poll()) != null) {
            hT hT2 = (hT)((Object)reference);
            this.a.a(hT2);
            if (++n2 != 16) continue;
            break;
        }
    }

    void d() {
        Reference<V> reference;
        int n2 = 0;
        while ((reference = this.h.poll()) != null) {
            id id2 = (id)((Object)reference);
            this.a.a(id2);
            if (++n2 != 16) continue;
            break;
        }
    }

    void e() {
        if (this.a.b()) {
            this.f();
        }
        if (this.a.c()) {
            this.g();
        }
    }

    void f() {
        while (this.g.poll() != null) {
        }
    }

    void g() {
        while (this.h.poll() != null) {
        }
    }

    hT<K, V> b(int n2) {
        AtomicReferenceArray<hT<K, V>> atomicReferenceArray = this.e;
        return atomicReferenceArray.get(n2 & atomicReferenceArray.length() - 1);
    }

    hT<K, V> a(Object object, int n2) {
        if (this.b != 0) {
            for (hT<K, V> hT2 = this.b((int)n2); hT2 != null; hT2 = hT2.b()) {
                if (hT2.c() != n2) continue;
                K k2 = hT2.d();
                if (k2 == null) {
                    this.a();
                    continue;
                }
                if (!this.a.l.a(object, k2)) continue;
                return hT2;
            }
        }
        return null;
    }

    hT<K, V> b(Object object, int n2) {
        hT<K, V> hT2 = this.a(object, n2);
        if (hT2 == null) {
            return null;
        }
        return hT2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    V c(Object object, int n2) {
        try {
            hT<K, V> hT2 = this.b(object, n2);
            if (hT2 == null) {
                V v2 = null;
                return v2;
            }
            V v3 = hT2.a().get();
            if (v3 == null) {
                this.a();
            }
            V v4 = v3;
            return v4;
        }
        finally {
            this.j();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean d(Object object, int n2) {
        try {
            if (this.b != 0) {
                hT<K, V> hT2 = this.b(object, n2);
                if (hT2 == null) {
                    boolean bl2 = false;
                    return bl2;
                }
                boolean bl3 = hT2.a().get() != null;
                return bl3;
            }
            boolean bl4 = false;
            return bl4;
        }
        finally {
            this.j();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(Object object) {
        try {
            if (this.b != 0) {
                AtomicReferenceArray<hT<K, V>> atomicReferenceArray = this.e;
                int n2 = atomicReferenceArray.length();
                for (int i2 = 0; i2 < n2; ++i2) {
                    for (hT<K, V> hT2 = atomicReferenceArray.get((int)i2); hT2 != null; hT2 = hT2.b()) {
                        V v2 = this.a(hT2);
                        if (v2 == null || !this.a.m.a(object, v2)) continue;
                        boolean bl2 = true;
                        return bl2;
                    }
                }
            }
            boolean bl3 = false;
            return bl3;
        }
        finally {
            this.j();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    V a(K k2, int n2, V v2, boolean bl2) {
        this.lock();
        try {
            K k3;
            hT<K, V> hT2;
            hT<K, V> hT3;
            this.k();
            int n3 = this.b + 1;
            if (n3 > this.d) {
                this.h();
                n3 = this.b + 1;
            }
            AtomicReferenceArray<hT<K, V>> atomicReferenceArray = this.e;
            int n4 = n2 & atomicReferenceArray.length() - 1;
            for (hT2 = hT3 = atomicReferenceArray.get((int)n4); hT2 != null; hT2 = hT2.b()) {
                k3 = hT2.d();
                if (hT2.c() != n2 || k3 == null || !this.a.l.a(k2, k3)) continue;
                id<K, V> id2 = hT2.a();
                V v3 = id2.get();
                if (v3 == null) {
                    ++this.c;
                    this.a(hT2, v2);
                    if (!id2.b()) {
                        n3 = this.b;
                    }
                    this.b = n3;
                    V v4 = null;
                    return v4;
                }
                if (bl2) {
                    V v5 = v3;
                    return v5;
                }
                ++this.c;
                this.a(hT2, v2);
                V v6 = v3;
                return v6;
            }
            ++this.c;
            hT2 = this.a(k2, n2, (V)hT3);
            this.a(hT2, v2);
            atomicReferenceArray.set(n4, hT2);
            this.b = n3;
            k3 = null;
            return (V)k3;
        }
        finally {
            this.unlock();
        }
    }

    void h() {
        AtomicReferenceArray<hT<K, V>> atomicReferenceArray = this.e;
        int n2 = atomicReferenceArray.length();
        if (n2 >= 1073741824) {
            return;
        }
        int n3 = this.b;
        AtomicReferenceArray<hT<K, V>> atomicReferenceArray2 = this.a(n2 << 1);
        this.d = atomicReferenceArray2.length() * 3 / 4;
        int n4 = atomicReferenceArray2.length() - 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            hT<K, V> hT2;
            int n5;
            hT<K, V> hT3 = atomicReferenceArray.get(i2);
            if (hT3 == null) continue;
            hT<K, V> hT4 = hT3.b();
            int n6 = hT3.c() & n4;
            if (hT4 == null) {
                atomicReferenceArray2.set(n6, hT3);
                continue;
            }
            hT<K, V> hT5 = hT3;
            int n7 = n6;
            for (hT2 = hT4; hT2 != null; hT2 = hT2.b()) {
                n5 = hT2.c() & n4;
                if (n5 == n7) continue;
                n7 = n5;
                hT5 = hT2;
            }
            atomicReferenceArray2.set(n7, hT5);
            for (hT2 = hT3; hT2 != hT5; hT2 = hT2.b()) {
                n5 = hT2.c() & n4;
                hT<K, V> hT6 = atomicReferenceArray2.get(n5);
                hT<K, V> hT7 = this.a(hT2, hT6);
                if (hT7 != null) {
                    atomicReferenceArray2.set(n5, hT7);
                    continue;
                }
                --n3;
            }
        }
        this.e = atomicReferenceArray2;
        this.b = n3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(K k2, int n2, V v2, V v3) {
        this.lock();
        try {
            this.k();
            AtomicReferenceArray<hT<K, V>> atomicReferenceArray = this.e;
            int n3 = n2 & atomicReferenceArray.length() - 1;
            for (hT<K, V> hT2 = hT3 = atomicReferenceArray.get((int)n3); hT2 != null; hT2 = hT2.b()) {
                K k3 = hT2.d();
                if (hT2.c() != n2 || k3 == null || !this.a.l.a(k2, k3)) continue;
                id<K, V> id2 = hT2.a();
                V v4 = id2.get();
                if (v4 == null) {
                    int n4;
                    if (this.a(id2)) {
                        hT<K, V> hT3;
                        n4 = this.b - 1;
                        ++this.c;
                        hT<K, V> hT4 = this.b(hT3, hT2);
                        n4 = this.b - 1;
                        atomicReferenceArray.set(n3, hT4);
                        this.b = n4;
                    }
                    n4 = 0;
                    return (boolean)n4;
                }
                if (this.a.m.a(v2, v4)) {
                    ++this.c;
                    this.a(hT2, v3);
                    boolean bl2 = true;
                    return bl2;
                }
                boolean bl3 = false;
                return bl3;
            }
            boolean bl4 = false;
            return bl4;
        }
        finally {
            this.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    V a(K k2, int n2, V v2) {
        this.lock();
        try {
            hT<K, V> hT2;
            this.k();
            AtomicReferenceArray<hT<K, V>> atomicReferenceArray = this.e;
            int n3 = n2 & atomicReferenceArray.length() - 1;
            for (hT2 = hT3 = atomicReferenceArray.get((int)n3); hT2 != null; hT2 = hT2.b()) {
                K k3 = hT2.d();
                if (hT2.c() != n2 || k3 == null || !this.a.l.a(k2, k3)) continue;
                id<K, V> id2 = hT2.a();
                V v3 = id2.get();
                if (v3 == null) {
                    if (this.a(id2)) {
                        hT<K, V> hT3;
                        int n4 = this.b - 1;
                        ++this.c;
                        hT<K, V> hT4 = this.b(hT3, hT2);
                        n4 = this.b - 1;
                        atomicReferenceArray.set(n3, hT4);
                        this.b = n4;
                    }
                    V v4 = null;
                    return v4;
                }
                ++this.c;
                this.a(hT2, v2);
                V v5 = v3;
                return v5;
            }
            hT2 = null;
            return (V)hT2;
        }
        finally {
            this.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    V e(Object object, int n2) {
        this.lock();
        try {
            hT<K, V> hT2;
            this.k();
            int n3 = this.b - 1;
            AtomicReferenceArray<hT<K, V>> atomicReferenceArray = this.e;
            int n4 = n2 & atomicReferenceArray.length() - 1;
            for (hT2 = hT3 = atomicReferenceArray.get((int)n4); hT2 != null; hT2 = hT2.b()) {
                hT<K, V> hT3;
                K k2 = hT2.d();
                if (hT2.c() != n2 || k2 == null || !this.a.l.a(object, k2)) continue;
                id<K, V> id2 = hT2.a();
                V v2 = id2.get();
                if (v2 == null && !this.a(id2)) {
                    V v3 = null;
                    return v3;
                }
                ++this.c;
                hT<K, V> hT4 = this.b(hT3, hT2);
                n3 = this.b - 1;
                atomicReferenceArray.set(n4, hT4);
                this.b = n3;
                V v4 = v2;
                return v4;
            }
            hT2 = null;
            return (V)hT2;
        }
        finally {
            this.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean b(Object object, int n2, Object object2) {
        this.lock();
        try {
            this.k();
            int n3 = this.b - 1;
            AtomicReferenceArray<hT<K, V>> atomicReferenceArray = this.e;
            int n4 = n2 & atomicReferenceArray.length() - 1;
            for (hT<K, V> hT2 = hT3 = atomicReferenceArray.get((int)n4); hT2 != null; hT2 = hT2.b()) {
                hT<K, V> hT3;
                K k2 = hT2.d();
                if (hT2.c() != n2 || k2 == null || !this.a.l.a(object, k2)) continue;
                id<K, V> id2 = hT2.a();
                V v2 = id2.get();
                boolean bl2 = false;
                if (this.a.m.a(object2, v2)) {
                    bl2 = true;
                } else if (!this.a(id2)) {
                    boolean bl3 = false;
                    return bl3;
                }
                ++this.c;
                hT<K, V> hT4 = this.b(hT3, hT2);
                n3 = this.b - 1;
                atomicReferenceArray.set(n4, hT4);
                this.b = n3;
                boolean bl4 = bl2;
                return bl4;
            }
            boolean bl5 = false;
            return bl5;
        }
        finally {
            this.unlock();
        }
    }

    void i() {
        if (this.b != 0) {
            this.lock();
            try {
                AtomicReferenceArray<hT<K, V>> atomicReferenceArray = this.e;
                for (int i2 = 0; i2 < atomicReferenceArray.length(); ++i2) {
                    atomicReferenceArray.set(i2, null);
                }
                this.e();
                this.i.set(0);
                ++this.c;
                this.b = 0;
            }
            finally {
                this.unlock();
            }
        }
    }

    hT<K, V> b(hT<K, V> hT2, hT<K, V> hT3) {
        int n2 = this.b;
        hT<K, V> hT4 = hT3.b();
        for (hT<K, V> hT5 = hT2; hT5 != hT3; hT5 = hT5.b()) {
            hT<K, V> hT6 = this.a(hT5, hT4);
            if (hT6 != null) {
                hT4 = hT6;
                continue;
            }
            --n2;
        }
        this.b = n2;
        return hT4;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(hT<K, V> hT2, int n2) {
        this.lock();
        try {
            int n3 = this.b - 1;
            AtomicReferenceArray<hT<K, V>> atomicReferenceArray = this.e;
            int n4 = n2 & atomicReferenceArray.length() - 1;
            for (hT<K, V> hT3 = hT4 = atomicReferenceArray.get((int)n4); hT3 != null; hT3 = hT3.b()) {
                hT<K, V> hT4;
                if (hT3 != hT2) continue;
                ++this.c;
                hT<K, V> hT5 = this.b(hT4, hT3);
                n3 = this.b - 1;
                atomicReferenceArray.set(n4, hT5);
                this.b = n3;
                boolean bl2 = true;
                return bl2;
            }
            boolean bl3 = false;
            return bl3;
        }
        finally {
            this.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(K k2, int n2, id<K, V> id2) {
        this.lock();
        try {
            int n3 = this.b - 1;
            AtomicReferenceArray<hT<K, V>> atomicReferenceArray = this.e;
            int n4 = n2 & atomicReferenceArray.length() - 1;
            for (hT<K, V> hT2 = hT3 = atomicReferenceArray.get((int)n4); hT2 != null; hT2 = hT2.b()) {
                K k3 = hT2.d();
                if (hT2.c() != n2 || k3 == null || !this.a.l.a(k2, k3)) continue;
                id<K, V> id3 = hT2.a();
                if (id3 == id2) {
                    hT<K, V> hT3;
                    ++this.c;
                    hT<K, V> hT4 = this.b(hT3, hT2);
                    n3 = this.b - 1;
                    atomicReferenceArray.set(n4, hT4);
                    this.b = n3;
                    boolean bl2 = true;
                    return bl2;
                }
                boolean bl3 = false;
                return bl3;
            }
            boolean bl4 = false;
            return bl4;
        }
        finally {
            this.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean b(K k2, int n2, id<K, V> id2) {
        this.lock();
        try {
            AtomicReferenceArray<hT<K, V>> atomicReferenceArray = this.e;
            int n3 = n2 & atomicReferenceArray.length() - 1;
            for (hT<K, V> hT2 = hT3 = atomicReferenceArray.get((int)n3); hT2 != null; hT2 = hT2.b()) {
                K k3 = hT2.d();
                if (hT2.c() != n2 || k3 == null || !this.a.l.a(k2, k3)) continue;
                id<K, V> id3 = hT2.a();
                if (id3 == id2) {
                    hT<K, V> hT3;
                    hT<K, V> hT4 = this.b(hT3, hT2);
                    atomicReferenceArray.set(n3, hT4);
                    boolean bl2 = true;
                    return bl2;
                }
                boolean bl3 = false;
                return bl3;
            }
            boolean bl4 = false;
            return bl4;
        }
        finally {
            this.unlock();
        }
    }

    boolean b(hT<K, V> hT2, int n2) {
        int n3 = this.b - 1;
        AtomicReferenceArray<hT<K, V>> atomicReferenceArray = this.e;
        int n4 = n2 & atomicReferenceArray.length() - 1;
        for (hT<K, V> hT3 = hT4 = atomicReferenceArray.get((int)n4); hT3 != null; hT3 = hT3.b()) {
            hT<K, V> hT4;
            if (hT3 != hT2) continue;
            ++this.c;
            hT<K, V> hT5 = this.b(hT4, hT3);
            n3 = this.b - 1;
            atomicReferenceArray.set(n4, hT5);
            this.b = n3;
            return true;
        }
        return false;
    }

    boolean a(id<K, V> id2) {
        if (id2.b()) {
            return false;
        }
        return id2.get() == null;
    }

    V a(hT<K, V> hT2) {
        if (hT2.d() == null) {
            this.a();
            return null;
        }
        V v2 = hT2.a().get();
        if (v2 == null) {
            this.a();
            return null;
        }
        return v2;
    }

    void j() {
        if ((this.i.incrementAndGet() & 63) == 0) {
            this.l();
        }
    }

    void k() {
        this.m();
    }

    void l() {
        this.m();
    }

    void m() {
        if (this.tryLock()) {
            try {
                this.b();
                this.i.set(0);
            }
            finally {
                this.unlock();
            }
        }
    }
}

