/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.ab;
import com.growingio.a.a.b.bR;
import com.growingio.a.a.c.B;
import com.growingio.a.a.c.F;
import com.growingio.a.a.c.O;
import com.growingio.a.a.c.T;
import com.growingio.a.a.c.W;
import com.growingio.a.a.c.aG;
import com.growingio.a.a.c.aQ;
import com.growingio.a.a.c.al;
import com.growingio.a.a.c.as;
import com.growingio.a.a.c.au;
import com.growingio.a.a.c.aw;
import com.growingio.a.a.c.ba;
import com.growingio.a.a.c.bk;
import com.growingio.a.a.c.bo;
import com.growingio.a.a.c.c;
import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bb;
import com.growingio.a.a.o.a.cd;
import com.growingio.a.a.o.a.dD;
import com.growingio.a.a.o.a.dF;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

class at<K, V>
extends ReentrantLock {
    final O<K, V> a;
    volatile int b;
    long c;
    int d;
    int e;
    volatile AtomicReferenceArray<as<K, V>> f;
    final long g;
    final ReferenceQueue<K> h;
    final ReferenceQueue<V> i;
    final Queue<as<K, V>> j;
    final AtomicInteger k = new AtomicInteger();
    final Queue<as<K, V>> l;
    final Queue<as<K, V>> m;
    final c n;

    at(O<K, V> o2, int n2, long l2, c c2) {
        this.a = o2;
        this.g = l2;
        this.n = aU.a(c2);
        this.a(this.a(n2));
        this.h = o2.n() ? new ReferenceQueue() : null;
        this.i = o2.o() ? new ReferenceQueue() : null;
        this.j = o2.g() ? new ConcurrentLinkedQueue() : O.r();
        this.l = o2.h() ? new aQ() : O.r();
        this.m = o2.g() ? new T() : O.r();
    }

    AtomicReferenceArray<as<K, V>> a(int n2) {
        return new AtomicReferenceArray<as<K, V>>(n2);
    }

    void a(AtomicReferenceArray<as<K, V>> atomicReferenceArray) {
        this.e = atomicReferenceArray.length() * 3 / 4;
        if (!this.a.b() && (long)this.e == this.g) {
            ++this.e;
        }
        this.f = atomicReferenceArray;
    }

    as<K, V> a(K k2, int n2, as<K, V> as2) {
        return this.a.w.a(this, aU.a(k2), n2, as2);
    }

    as<K, V> a(as<K, V> as2, as<K, V> as3) {
        if (as2.d() == null) {
            return null;
        }
        aG<K, V> aG2 = as2.a();
        V v2 = aG2.get();
        if (v2 == null && aG2.d()) {
            return null;
        }
        as<K, V> as4 = this.a.w.a(this, as2, as3);
        as4.a(aG2.a(this.i, v2, as4));
        return as4;
    }

    void a(as<K, V> as2, K k2, V v2, long l2) {
        aG<K, V> aG2 = as2.a();
        int n2 = this.a.p.a(k2, v2);
        aU.b(n2 >= 0, "Weights must be non-negative");
        aG<K, V> aG3 = this.a.n.a(this, as2, v2, n2);
        as2.a(aG3);
        this.a((K)as2, n2, (V)l2);
        aG2.a(v2);
    }

    V a(K k2, int n2, B<? super K, V> b2) throws ExecutionException {
        aU.a(k2);
        aU.a(b2);
        try {
            as as2;
            if (this.b != 0 && (as2 = this.a(k2, n2)) != null) {
                long l2 = this.a.v.a();
                V v2 = this.c(as2, l2);
                if (v2 != null) {
                    this.a(as2, l2);
                    this.n.a(1);
                    V v3 = this.a(as2, k2, n2, v2, l2, b2);
                    return v3;
                }
                aG aG2 = as2.a();
                if (aG2.c()) {
                    Object v4 = this.a(as2, k2, aG2);
                    return v4;
                }
            }
            as2 = this.b(k2, n2, b2);
            return (V)as2;
        }
        catch (ExecutionException var4_5) {
            Throwable throwable = var4_5.getCause();
            if (throwable instanceof Error) {
                throw new bb((Error)throwable);
            }
            if (throwable instanceof RuntimeException) {
                throw new dD(throwable);
            }
            throw var4_5;
        }
        finally {
            this.l();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    V b(K k2, int n2, B<? super K, V> b2) throws ExecutionException {
        as as2;
        aG<K, V> aG2;
        al al2;
        boolean bl2;
        block19 : {
            aG2 = null;
            al2 = null;
            bl2 = true;
            this.lock();
            try {
                long l2 = this.a.v.a();
                this.c(l2);
                int n3 = this.b - 1;
                AtomicReferenceArray<as<K, V>> atomicReferenceArray = this.f;
                int n4 = n2 & atomicReferenceArray.length() - 1;
                for (as2 = as3 = atomicReferenceArray.get((int)n4); as2 != null; as2 = as2.b()) {
                    K k3 = as2.d();
                    if (as2.c() != n2 || k3 == null || !this.a.k.a(k2, k3)) continue;
                    aG2 = as2.a();
                    if (aG2.c()) {
                        bl2 = false;
                        break;
                    }
                    V v2 = aG2.get();
                    if (v2 == null) {
                        this.a(k3, n2, v2, aG2.a(), ba.c);
                    } else if (this.a.c(as2, l2)) {
                        this.a(k3, n2, v2, aG2.a(), ba.d);
                    } else {
                        this.b(as2, l2);
                        this.n.a(1);
                        V v3 = v2;
                        return v3;
                    }
                    this.l.remove(as2);
                    this.m.remove(as2);
                    this.b = n3;
                    break;
                }
                if (!bl2) break block19;
                al2 = new al();
                if (as2 == null) {
                    as as3;
                    as2 = this.a(k2, n2, (V)as3);
                    as2.a(al2);
                    atomicReferenceArray.set(n4, as2);
                    break block19;
                }
                as2.a(al2);
            }
            finally {
                this.unlock();
                this.m();
            }
        }
        if (bl2) {
            try {
                as as4 = as2;
                synchronized (as4) {
                    Object v4 = this.a(k2, n2, (al<K, V>)al2, b2);
                    return v4;
                }
            }
            finally {
                this.n.b(1);
            }
        }
        return this.a(as2, k2, aG2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    V a(as<K, V> as2, K k2, aG<K, V> aG2) throws ExecutionException {
        if (!aG2.c()) {
            throw new AssertionError();
        }
        aU.b(!Thread.holdsLock(as2), "Recursive load of: %s", k2);
        try {
            V v2 = aG2.e();
            if (v2 == null) {
                throw new F("CacheLoader returned null for key " + k2 + ".");
            }
            long l2 = this.a.v.a();
            this.a(as2, l2);
            V v3 = v2;
            return v3;
        }
        finally {
            this.n.b(1);
        }
    }

    V a(K k2, int n2, al<K, V> al2, B<? super K, V> b2) throws ExecutionException {
        bU<V> bU2 = al2.a((K)k2, b2);
        return this.a(k2, n2, (al<K, V>)al2, bU2);
    }

    bU<V> b(K k2, int n2, al<K, V> al2, B<? super K, V> b2) {
        bU<V> bU2 = al2.a((K)k2, b2);
        bU2.a(new au(this, k2, n2, al2, bU2), cd.c());
        return bU2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    V a(K k2, int n2, al<K, V> al2, bU<V> bU2) throws ExecutionException {
        V v2 = null;
        try {
            v2 = dF.a(bU2);
            if (v2 == null) {
                throw new F("CacheLoader returned null for key " + k2 + ".");
            }
            this.n.a(al2.f());
            this.a(k2, n2, al2, v2);
            V v3 = v2;
            return v3;
        }
        finally {
            if (v2 == null) {
                this.n.b(al2.f());
                this.a(k2, n2, al2);
            }
        }
    }

    V a(as<K, V> as2, K k2, int n2, V v2, long l2, B<? super K, V> b2) {
        B<? super K, V> b3;
        if (this.a.f() && l2 - as2.h() > this.a.s && !as2.a().c() && (b3 = this.a(k2, n2, (V)b2, true)) != null) {
            return (V)b3;
        }
        return v2;
    }

    V a(K k2, int n2, B<? super K, V> b2, boolean bl2) {
        boolean bl3 = this.a(k2, n2, (V)bl2);
        if (bl3 == null) {
            return null;
        }
        bU<V> bU2 = this.b(k2, n2, (al<K, V>)bl3 ? 1 : 0, b2);
        if (bU2.isDone()) {
            try {
                return dF.a(bU2);
            }
            catch (Throwable var7_7) {
                // empty catch block
            }
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    al<K, V> a(K k2, int n2, boolean bl2) {
        as<K, V> as2 = null;
        this.lock();
        try {
            Object object;
            as<K, V> as3;
            long l2 = this.a.v.a();
            this.c(l2);
            AtomicReferenceArray<as<K, V>> atomicReferenceArray = this.f;
            int n3 = n2 & atomicReferenceArray.length() - 1;
            for (as2 = as3 = atomicReferenceArray.get((int)n3); as2 != null; as2 = as2.b()) {
                object = as2.d();
                if (as2.c() != n2 || object == null || !this.a.k.a(k2, object)) continue;
                aG<K, V> aG2 = as2.a();
                if (aG2.c() || bl2 && l2 - as2.h() < this.a.s) {
                    al<K, V> al2 = null;
                    return al2;
                }
                ++this.d;
                al<K, V> al3 = new al<K, V>(aG2);
                as2.a(al3);
                al<K, V> al4 = al3;
                return al4;
            }
            ++this.d;
            object = new al();
            as2 = this.a(k2, n2, (V)as3);
            as2.a((aG<K, V>)object);
            atomicReferenceArray.set(n3, as2);
            Object object2 = object;
            return object2;
        }
        finally {
            this.unlock();
            this.m();
        }
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
        if (this.a.n()) {
            this.c();
        }
        if (this.a.o()) {
            this.d();
        }
    }

    void c() {
        Reference<K> reference;
        int n2 = 0;
        while ((reference = this.h.poll()) != null) {
            as as2 = (as)((Object)reference);
            this.a.a(as2);
            if (++n2 != 16) continue;
            break;
        }
    }

    void d() {
        Reference<V> reference;
        int n2 = 0;
        while ((reference = this.i.poll()) != null) {
            aG aG2 = (aG)((Object)reference);
            this.a.a(aG2);
            if (++n2 != 16) continue;
            break;
        }
    }

    void e() {
        if (this.a.n()) {
            this.f();
        }
        if (this.a.o()) {
            this.g();
        }
    }

    void f() {
        while (this.h.poll() != null) {
        }
    }

    void g() {
        while (this.i.poll() != null) {
        }
    }

    void a(as<K, V> as2, long l2) {
        if (this.a.j()) {
            as2.a(l2);
        }
        this.j.add(as2);
    }

    void b(as<K, V> as2, long l2) {
        if (this.a.j()) {
            as2.a(l2);
        }
        this.m.add(as2);
    }

    void a(as<K, V> as2, int n2, long l2) {
        this.h();
        this.c += (long)n2;
        if (this.a.j()) {
            as2.a(l2);
        }
        if (this.a.i()) {
            as2.b(l2);
        }
        this.m.add(as2);
        this.l.add(as2);
    }

    void h() {
        as<K, V> as2;
        while ((as2 = this.j.poll()) != null) {
            if (!this.m.contains(as2)) continue;
            this.m.add(as2);
        }
    }

    void a(long l2) {
        if (this.tryLock()) {
            try {
                this.b(l2);
            }
            finally {
                this.unlock();
            }
        }
    }

    void b(long l2) {
        as<K, V> as2;
        this.h();
        while ((as2 = this.l.peek()) != null && this.a.c(as2, l2)) {
            if (!this.a(as2, as2.c(), ba.d)) {
                throw new AssertionError();
            }
        }
        while ((as2 = this.m.peek()) != null && this.a.c(as2, l2)) {
            if (!this.a(as2, as2.c(), ba.d)) {
                throw new AssertionError();
            }
        }
    }

    void a(K k2, int n2, V v2, int n3, ba ba2) {
        this.c -= (long)n3;
        if (ba2.b()) {
            this.n.a();
        }
        if (this.a.t != O.A) {
            bk<K, V> bk2 = bk.a(k2, v2, ba2);
            this.a.t.offer(bk2);
        }
    }

    void a(as<K, V> as2) {
        if (!this.a.a()) {
            return;
        }
        this.h();
        if ((long)as2.a().a() > this.g && !this.a(as2, as2.c(), ba.e)) {
            throw new AssertionError();
        }
        while (this.c > this.g) {
            as<K, V> as3 = this.i();
            if (!this.a(as3, as3.c(), ba.e)) {
                throw new AssertionError();
            }
        }
    }

    as<K, V> i() {
        for (as<K, V> as2 : this.m) {
            int n2 = as2.a().a();
            if (n2 <= 0) continue;
            return as2;
        }
        throw new AssertionError();
    }

    as<K, V> b(int n2) {
        AtomicReferenceArray<as<K, V>> atomicReferenceArray = this.f;
        return atomicReferenceArray.get(n2 & atomicReferenceArray.length() - 1);
    }

    as<K, V> a(Object object, int n2) {
        for (as<K, V> as2 = this.b((int)n2); as2 != null; as2 = as2.b()) {
            if (as2.c() != n2) continue;
            K k2 = as2.d();
            if (k2 == null) {
                this.a();
                continue;
            }
            if (!this.a.k.a(object, k2)) continue;
            return as2;
        }
        return null;
    }

    as<K, V> a(Object object, int n2, long l2) {
        as<K, V> as2 = this.a(object, n2);
        if (as2 == null) {
            return null;
        }
        if (this.a.c(as2, l2)) {
            this.a(l2);
            return null;
        }
        return as2;
    }

    V c(as<K, V> as2, long l2) {
        if (as2.d() == null) {
            this.a();
            return null;
        }
        V v2 = as2.a().get();
        if (v2 == null) {
            this.a();
            return null;
        }
        if (this.a.c(as2, l2)) {
            this.a(l2);
            return null;
        }
        return v2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    V b(Object object, int n2) {
        try {
            if (this.b != 0) {
                long l2 = this.a.v.a();
                long l3 = this.a((K)object, n2, (V)l2);
                if (l3 == null) {
                    V v2 = null;
                    return v2;
                }
                Object v3 = l3.a().get();
                if (v3 != null) {
                    this.a((as<K, V>)l3, l2);
                    Object v4 = this.a((as<K, V>)l3, l3.d(), n2, v3, l2, this.a.y);
                    return v4;
                }
                this.a();
            }
            V v5 = null;
            return v5;
        }
        finally {
            this.l();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean c(Object object, int n2) {
        try {
            if (this.b != 0) {
                long l2 = this.a.v.a();
                long l3 = this.a((K)object, n2, (V)l2);
                if (l3 == null) {
                    boolean bl2 = false;
                    return bl2;
                }
                boolean bl3 = l3.a().get() != null;
                return bl3;
            }
            boolean bl4 = false;
            return bl4;
        }
        finally {
            this.l();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(Object object) {
        try {
            if (this.b != 0) {
                long l2 = this.a.v.a();
                AtomicReferenceArray<as<K, V>> atomicReferenceArray = this.f;
                int n2 = atomicReferenceArray.length();
                for (int i2 = 0; i2 < n2; ++i2) {
                    for (as<K, V> as2 = atomicReferenceArray.get((int)i2); as2 != null; as2 = as2.b()) {
                        V v2 = this.c(as2, l2);
                        if (v2 == null || !this.a.l.a(object, v2)) continue;
                        boolean bl2 = true;
                        return bl2;
                    }
                }
            }
            boolean bl3 = false;
            return bl3;
        }
        finally {
            this.l();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    V a(K k2, int n2, V v2, boolean bl2) {
        this.lock();
        try {
            K k3;
            as<K, V> as2;
            as<K, V> as3;
            long l2 = this.a.v.a();
            this.c(l2);
            int n3 = this.b + 1;
            if (n3 > this.e) {
                this.j();
                n3 = this.b + 1;
            }
            AtomicReferenceArray<as<K, V>> atomicReferenceArray = this.f;
            int n4 = n2 & atomicReferenceArray.length() - 1;
            for (as3 = as2 = atomicReferenceArray.get((int)n4); as3 != null; as3 = as3.b()) {
                k3 = as3.d();
                if (as3.c() != n2 || k3 == null || !this.a.k.a(k2, k3)) continue;
                aG<K, V> aG2 = as3.a();
                V v3 = aG2.get();
                if (v3 == null) {
                    ++this.d;
                    if (aG2.d()) {
                        this.a(k2, n2, v3, aG2.a(), ba.c);
                        this.a(as3, k2, v2, l2);
                        n3 = this.b;
                    } else {
                        this.a(as3, k2, v2, l2);
                        n3 = this.b + 1;
                    }
                    this.b = n3;
                    this.a(as3);
                    V v4 = null;
                    return v4;
                }
                if (bl2) {
                    this.b(as3, l2);
                    V v5 = v3;
                    return v5;
                }
                ++this.d;
                this.a(k2, n2, v3, aG2.a(), ba.b);
                this.a(as3, k2, v2, l2);
                this.a(as3);
                V v6 = v3;
                return v6;
            }
            ++this.d;
            as3 = this.a(k2, n2, (V)as2);
            this.a(as3, k2, v2, l2);
            atomicReferenceArray.set(n4, as3);
            this.b = n3 = this.b + 1;
            this.a(as3);
            k3 = null;
            return (V)k3;
        }
        finally {
            this.unlock();
            this.m();
        }
    }

    void j() {
        AtomicReferenceArray<as<K, V>> atomicReferenceArray = this.f;
        int n2 = atomicReferenceArray.length();
        if (n2 >= 1073741824) {
            return;
        }
        int n3 = this.b;
        AtomicReferenceArray<as<K, V>> atomicReferenceArray2 = this.a(n2 << 1);
        this.e = atomicReferenceArray2.length() * 3 / 4;
        int n4 = atomicReferenceArray2.length() - 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n5;
            as<K, V> as2;
            as<K, V> as3 = atomicReferenceArray.get(i2);
            if (as3 == null) continue;
            as<K, V> as4 = as3.b();
            int n6 = as3.c() & n4;
            if (as4 == null) {
                atomicReferenceArray2.set(n6, as3);
                continue;
            }
            as<K, V> as5 = as3;
            int n7 = n6;
            for (as2 = as4; as2 != null; as2 = as2.b()) {
                n5 = as2.c() & n4;
                if (n5 == n7) continue;
                n7 = n5;
                as5 = as2;
            }
            atomicReferenceArray2.set(n7, as5);
            for (as2 = as3; as2 != as5; as2 = as2.b()) {
                n5 = as2.c() & n4;
                as<K, V> as6 = atomicReferenceArray2.get(n5);
                as<K, V> as7 = this.a(as2, as6);
                if (as7 != null) {
                    atomicReferenceArray2.set(n5, as7);
                    continue;
                }
                this.b(as2);
                --n3;
            }
        }
        this.f = atomicReferenceArray2;
        this.b = n3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(K k2, int n2, V v2, V v3) {
        this.lock();
        try {
            long l2 = this.a.v.a();
            this.c(l2);
            AtomicReferenceArray<as<K, V>> atomicReferenceArray = this.f;
            int n3 = n2 & atomicReferenceArray.length() - 1;
            for (as<K, V> as2 = as3 = atomicReferenceArray.get((int)n3); as2 != null; as2 = as2.b()) {
                K k3 = as2.d();
                if (as2.c() != n2 || k3 == null || !this.a.k.a(k2, k3)) continue;
                aG<K, V> aG2 = as2.a();
                V v4 = aG2.get();
                if (v4 == null) {
                    int n4;
                    if (aG2.d()) {
                        as<K, V> as3;
                        n4 = this.b - 1;
                        ++this.d;
                        as<K, V> as4 = this.a(as3, as2, k3, n2, v4, aG2, ba.c);
                        n4 = this.b - 1;
                        atomicReferenceArray.set(n3, as4);
                        this.b = n4;
                    }
                    n4 = 0;
                    return (boolean)n4;
                }
                if (this.a.l.a(v2, v4)) {
                    ++this.d;
                    this.a(k2, n2, v4, aG2.a(), ba.b);
                    this.a(as2, k2, v3, l2);
                    this.a(as2);
                    boolean bl2 = true;
                    return bl2;
                }
                this.b(as2, l2);
                boolean bl3 = false;
                return bl3;
            }
            boolean bl4 = false;
            return bl4;
        }
        finally {
            this.unlock();
            this.m();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    V a(K k2, int n2, V v2) {
        this.lock();
        try {
            as<K, V> as2;
            long l2 = this.a.v.a();
            this.c(l2);
            AtomicReferenceArray<as<K, V>> atomicReferenceArray = this.f;
            int n3 = n2 & atomicReferenceArray.length() - 1;
            for (as2 = as3 = atomicReferenceArray.get((int)n3); as2 != null; as2 = as2.b()) {
                K k3 = as2.d();
                if (as2.c() != n2 || k3 == null || !this.a.k.a(k2, k3)) continue;
                aG<K, V> aG2 = as2.a();
                V v3 = aG2.get();
                if (v3 == null) {
                    if (aG2.d()) {
                        as<K, V> as3;
                        int n4 = this.b - 1;
                        ++this.d;
                        as<K, V> as4 = this.a(as3, as2, k3, n2, v3, aG2, ba.c);
                        n4 = this.b - 1;
                        atomicReferenceArray.set(n3, as4);
                        this.b = n4;
                    }
                    V v4 = null;
                    return v4;
                }
                ++this.d;
                this.a(k2, n2, v3, aG2.a(), ba.b);
                this.a(as2, k2, v2, l2);
                this.a(as2);
                V v5 = v3;
                return v5;
            }
            as2 = null;
            return (V)as2;
        }
        finally {
            this.unlock();
            this.m();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    V d(Object object, int n2) {
        this.lock();
        try {
            as<K, V> as2;
            long l2 = this.a.v.a();
            this.c(l2);
            int n3 = this.b - 1;
            AtomicReferenceArray<as<K, V>> atomicReferenceArray = this.f;
            int n4 = n2 & atomicReferenceArray.length() - 1;
            for (as2 = as3 = atomicReferenceArray.get((int)n4); as2 != null; as2 = as2.b()) {
                as<K, V> as3;
                ba ba2;
                K k2 = as2.d();
                if (as2.c() != n2 || k2 == null || !this.a.k.a(object, k2)) continue;
                aG<K, V> aG2 = as2.a();
                V v2 = aG2.get();
                if (v2 != null) {
                    ba2 = ba.a;
                } else if (aG2.d()) {
                    ba2 = ba.c;
                } else {
                    V v3 = null;
                    return v3;
                }
                ++this.d;
                as<K, V> as4 = this.a(as3, as2, k2, n2, v2, aG2, ba2);
                n3 = this.b - 1;
                atomicReferenceArray.set(n4, as4);
                this.b = n3;
                V v4 = v2;
                return v4;
            }
            as2 = null;
            return (V)as2;
        }
        finally {
            this.unlock();
            this.m();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(K k2, int n2, al<K, V> al2, V v2) {
        this.lock();
        try {
            as<K, V> as2;
            as<K, V> as3;
            long l2 = this.a.v.a();
            this.c(l2);
            int n3 = this.b + 1;
            if (n3 > this.e) {
                this.j();
                n3 = this.b + 1;
            }
            AtomicReferenceArray<as<K, V>> atomicReferenceArray = this.f;
            int n4 = n2 & atomicReferenceArray.length() - 1;
            for (as3 = as2 = atomicReferenceArray.get((int)n4); as3 != null; as3 = as3.b()) {
                K k3 = as3.d();
                if (as3.c() != n2 || k3 == null || !this.a.k.a(k2, k3)) continue;
                aG<K, V> aG2 = as3.a();
                V v3 = aG2.get();
                if (al2 == aG2 || v3 == null && aG2 != O.z) {
                    ++this.d;
                    if (al2.d()) {
                        ba ba2 = v3 == null ? ba.c : ba.b;
                        this.a(k2, n2, v3, al2.a(), ba2);
                        --n3;
                    }
                    this.a(as3, k2, v2, l2);
                    this.b = n3;
                    this.a(as3);
                    boolean bl2 = true;
                    return bl2;
                }
                this.a(k2, n2, v2, 0, ba.b);
                boolean bl3 = false;
                return bl3;
            }
            ++this.d;
            as3 = this.a(k2, n2, (V)as2);
            this.a(as3, k2, v2, l2);
            atomicReferenceArray.set(n4, as3);
            this.b = n3;
            this.a(as3);
            boolean bl4 = true;
            return bl4;
        }
        finally {
            this.unlock();
            this.m();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean b(Object object, int n2, Object object2) {
        this.lock();
        try {
            long l2 = this.a.v.a();
            this.c(l2);
            int n3 = this.b - 1;
            AtomicReferenceArray<as<K, V>> atomicReferenceArray = this.f;
            int n4 = n2 & atomicReferenceArray.length() - 1;
            for (as<K, V> as2 = as3 = atomicReferenceArray.get((int)n4); as2 != null; as2 = as2.b()) {
                as<K, V> as3;
                ba ba2;
                K k2 = as2.d();
                if (as2.c() != n2 || k2 == null || !this.a.k.a(object, k2)) continue;
                aG<K, V> aG2 = as2.a();
                V v2 = aG2.get();
                if (this.a.l.a(object2, v2)) {
                    ba2 = ba.a;
                } else if (v2 == null && aG2.d()) {
                    ba2 = ba.c;
                } else {
                    boolean bl2 = false;
                    return bl2;
                }
                ++this.d;
                as<K, V> as4 = this.a(as3, as2, k2, n2, v2, aG2, ba2);
                n3 = this.b - 1;
                atomicReferenceArray.set(n4, as4);
                this.b = n3;
                boolean bl3 = ba2 == ba.a;
                return bl3;
            }
            boolean bl4 = false;
            return bl4;
        }
        finally {
            this.unlock();
            this.m();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void k() {
        if (this.b != 0) {
            this.lock();
            try {
                int n2;
                long l2 = this.a.v.a();
                this.c(l2);
                AtomicReferenceArray<as<K, V>> atomicReferenceArray = this.f;
                for (n2 = 0; n2 < atomicReferenceArray.length(); ++n2) {
                    for (as<K, V> as2 = atomicReferenceArray.get((int)n2); as2 != null; as2 = as2.b()) {
                        if (!as2.a().d()) continue;
                        K k2 = as2.d();
                        V v2 = as2.a().get();
                        ba ba2 = k2 == null || v2 == null ? ba.c : ba.a;
                        this.a(k2, as2.c(), v2, as2.a().a(), ba2);
                    }
                }
                for (n2 = 0; n2 < atomicReferenceArray.length(); ++n2) {
                    atomicReferenceArray.set(n2, null);
                }
                this.e();
                this.l.clear();
                this.m.clear();
                this.k.set(0);
                ++this.d;
                this.b = 0;
            }
            finally {
                this.unlock();
                this.m();
            }
        }
    }

    as<K, V> a(as<K, V> as2, as<K, V> as3, K k2, int n2, V v2, aG<K, V> aG2, ba ba2) {
        this.a(k2, n2, v2, aG2.a(), ba2);
        this.l.remove(as3);
        this.m.remove(as3);
        if (aG2.c()) {
            aG2.a(null);
            return as2;
        }
        return this.b(as2, as3);
    }

    as<K, V> b(as<K, V> as2, as<K, V> as3) {
        int n2 = this.b;
        as<K, V> as4 = as3.b();
        for (as<K, V> as5 = as2; as5 != as3; as5 = as5.b()) {
            as<K, V> as6 = this.a(as5, as4);
            if (as6 != null) {
                as4 = as6;
                continue;
            }
            this.b(as5);
            --n2;
        }
        this.b = n2;
        return as4;
    }

    void b(as<K, V> as2) {
        this.a(as2.d(), as2.c(), as2.a().get(), as2.a().a(), ba.c);
        this.l.remove(as2);
        this.m.remove(as2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(as<K, V> as2, int n2) {
        this.lock();
        try {
            int n3 = this.b - 1;
            AtomicReferenceArray<as<K, V>> atomicReferenceArray = this.f;
            int n4 = n2 & atomicReferenceArray.length() - 1;
            for (as<K, V> as3 = as4 = atomicReferenceArray.get((int)n4); as3 != null; as3 = as3.b()) {
                as<K, V> as4;
                if (as3 != as2) continue;
                ++this.d;
                as<K, V> as5 = this.a(as4, as3, as3.d(), n2, as3.a().get(), as3.a(), ba.c);
                n3 = this.b - 1;
                atomicReferenceArray.set(n4, as5);
                this.b = n3;
                boolean bl2 = true;
                return bl2;
            }
            boolean bl3 = false;
            return bl3;
        }
        finally {
            this.unlock();
            this.m();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(K k2, int n2, aG<K, V> aG2) {
        this.lock();
        try {
            int n3 = this.b - 1;
            AtomicReferenceArray<as<K, V>> atomicReferenceArray = this.f;
            int n4 = n2 & atomicReferenceArray.length() - 1;
            for (as<K, V> as2 = as3 = atomicReferenceArray.get((int)n4); as2 != null; as2 = as2.b()) {
                K k3 = as2.d();
                if (as2.c() != n2 || k3 == null || !this.a.k.a(k2, k3)) continue;
                aG<K, V> aG3 = as2.a();
                if (aG3 == aG2) {
                    as<K, V> as3;
                    ++this.d;
                    as<K, V> as4 = this.a(as3, as2, k3, n2, aG2.get(), aG2, ba.c);
                    n3 = this.b - 1;
                    atomicReferenceArray.set(n4, as4);
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
            if (!this.isHeldByCurrentThread()) {
                this.m();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(K k2, int n2, al<K, V> al2) {
        this.lock();
        try {
            AtomicReferenceArray<as<K, V>> atomicReferenceArray = this.f;
            int n3 = n2 & atomicReferenceArray.length() - 1;
            for (as<K, V> as2 = as3 = atomicReferenceArray.get((int)n3); as2 != null; as2 = as2.b()) {
                K k3 = as2.d();
                if (as2.c() != n2 || k3 == null || !this.a.k.a(k2, k3)) continue;
                aG<K, V> aG2 = as2.a();
                if (aG2 == al2) {
                    if (al2.d()) {
                        as2.a(al2.g());
                    } else {
                        as<K, V> as3;
                        as<K, V> as4 = this.b(as3, as2);
                        atomicReferenceArray.set(n3, as4);
                    }
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
            this.m();
        }
    }

    boolean a(as<K, V> as2, int n2, ba ba2) {
        int n3 = this.b - 1;
        AtomicReferenceArray<as<K, V>> atomicReferenceArray = this.f;
        int n4 = n2 & atomicReferenceArray.length() - 1;
        for (as<K, V> as3 = as4 = atomicReferenceArray.get((int)n4); as3 != null; as3 = as3.b()) {
            as<K, V> as4;
            if (as3 != as2) continue;
            ++this.d;
            as<K, V> as5 = this.a(as4, as3, as3.d(), n2, as3.a().get(), as3.a(), ba2);
            n3 = this.b - 1;
            atomicReferenceArray.set(n4, as5);
            this.b = n3;
            return true;
        }
        return false;
    }

    void l() {
        if ((this.k.incrementAndGet() & 63) == 0) {
            this.n();
        }
    }

    void c(long l2) {
        this.d(l2);
    }

    void m() {
        this.o();
    }

    void n() {
        long l2 = this.a.v.a();
        this.d(l2);
        this.o();
    }

    void d(long l2) {
        if (this.tryLock()) {
            try {
                this.b();
                this.b(l2);
                this.k.set(0);
            }
            finally {
                this.unlock();
            }
        }
    }

    void o() {
        if (!this.isHeldByCurrentThread()) {
            this.a.s();
        }
    }
}

