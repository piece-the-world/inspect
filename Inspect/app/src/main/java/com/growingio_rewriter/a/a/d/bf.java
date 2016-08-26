/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.S;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.bg;
import com.growingio.a.a.d.bh;
import com.growingio.a.a.d.bi;
import com.growingio.a.a.d.bj;
import com.growingio.a.a.d.bk;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.hE;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.lG;
import com.growingio.a.a.k.f;
import com.growingio.a.a.m.q;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class bf<E>
extends S<E>
implements Serializable {
    private final transient ConcurrentMap<E, AtomicInteger> a;
    private static final long b = 1;

    public static <E> bf<E> g() {
        return new bf(new ConcurrentHashMap());
    }

    public static <E> bf<E> a(Iterable<? extends E> iterable) {
        bf<E> bf2 = bf.g();
        fL.a(bf2, iterable);
        return bf2;
    }

    public static <E> bf<E> a(hE hE2) {
        return new bf(hE2.h());
    }

    bf(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        aU.a(concurrentMap.isEmpty());
        this.a = concurrentMap;
    }

    @Override
    public int a(Object object) {
        AtomicInteger atomicInteger = ii.a(this.a, object);
        return atomicInteger == null ? 0 : atomicInteger.get();
    }

    @Override
    public int size() {
        long l2 = 0;
        for (AtomicInteger atomicInteger : this.a.values()) {
            l2 += (long)atomicInteger.get();
        }
        return q.b(l2);
    }

    @Override
    public Object[] toArray() {
        return this.h().toArray();
    }

    @Override
    public <T> T[] toArray(T[] arrT) {
        return this.h().toArray(arrT);
    }

    private List<E> h() {
        ArrayList arrayList = gO.c(this.size());
        for (km km2 : this.a()) {
            Object e2 = km2.a();
            for (int i2 = km2.b(); i2 > 0; --i2) {
                arrayList.add(e2);
            }
        }
        return arrayList;
    }

    @Override
    public int a(E e2, int n2) {
        AtomicInteger atomicInteger;
        Object object;
        aU.a(e2);
        if (n2 == 0) {
            return this.a(e2);
        }
        aK.b(n2, "occurences");
        do {
            int n3;
            if ((atomicInteger = ii.a(this.a, e2)) == null && (atomicInteger = this.a.putIfAbsent(e2, new AtomicInteger(n2))) == null) {
                return 0;
            }
            while ((n3 = atomicInteger.get()) != 0) {
                try {
                    object = f.e(n3, n2);
                    if (!atomicInteger.compareAndSet(n3, (int)object)) continue;
                    return n3;
                }
                catch (ArithmeticException var5_6) {
                    throw new IllegalArgumentException("Overflow adding " + n2 + " occurrences to a count of " + n3);
                }
            }
        } while (this.a.putIfAbsent(e2, (AtomicInteger)(object = (Object)new AtomicInteger(n2))) != null && !this.a.replace(e2, atomicInteger, (AtomicInteger)object));
        return 0;
    }

    @Override
    public int b(Object object, int n2) {
        int n3;
        if (n2 == 0) {
            return this.a(object);
        }
        aK.b(n2, "occurences");
        AtomicInteger atomicInteger = ii.a(this.a, object);
        if (atomicInteger == null) {
            return 0;
        }
        while ((n3 = atomicInteger.get()) != 0) {
            int n4 = Math.max(0, n3 - n2);
            if (!atomicInteger.compareAndSet(n3, n4)) continue;
            if (n4 == 0) {
                this.a.remove(object, atomicInteger);
            }
            return n3;
        }
        return 0;
    }

    public boolean d(Object object, int n2) {
        int n3;
        int n4;
        if (n2 == 0) {
            return true;
        }
        aK.b(n2, "occurences");
        AtomicInteger atomicInteger = ii.a(this.a, object);
        if (atomicInteger == null) {
            return false;
        }
        do {
            if ((n4 = atomicInteger.get()) >= n2) continue;
            return false;
        } while (!atomicInteger.compareAndSet(n4, n3 = n4 - n2));
        if (n3 == 0) {
            this.a.remove(object, atomicInteger);
        }
        return true;
    }

    @Override
    public int c(E e2, int n2) {
        int n3;
        AtomicInteger atomicInteger;
        aU.a(e2);
        aK.a(n2, "count");
        block0 : do {
            if ((atomicInteger = ii.a(this.a, e2)) == null) {
                if (n2 == 0) {
                    return 0;
                }
                atomicInteger = this.a.putIfAbsent(e2, new AtomicInteger(n2));
                if (atomicInteger == null) {
                    return 0;
                }
            }
            do {
                if ((n3 = atomicInteger.get()) != 0) continue;
                if (n2 == 0) {
                    return 0;
                }
                AtomicInteger atomicInteger2 = new AtomicInteger(n2);
                if (this.a.putIfAbsent(e2, atomicInteger2) != null && !this.a.replace(e2, atomicInteger, atomicInteger2)) continue block0;
                return 0;
            } while (!atomicInteger.compareAndSet(n3, n2));
            break;
        } while (true);
        if (n2 == 0) {
            this.a.remove(e2, atomicInteger);
        }
        return n3;
    }

    @Override
    public boolean a(E e2, int n2, int n3) {
        aU.a(e2);
        aK.a(n2, "oldCount");
        aK.a(n3, "newCount");
        AtomicInteger atomicInteger = ii.a(this.a, e2);
        if (atomicInteger == null) {
            if (n2 != 0) {
                return false;
            }
            if (n3 == 0) {
                return true;
            }
            return this.a.putIfAbsent(e2, new AtomicInteger(n3)) == null;
        }
        int n4 = atomicInteger.get();
        if (n4 == n2) {
            if (n4 == 0) {
                if (n3 == 0) {
                    this.a.remove(e2, atomicInteger);
                    return true;
                }
                AtomicInteger atomicInteger2 = new AtomicInteger(n3);
                return this.a.putIfAbsent(e2, atomicInteger2) == null || this.a.replace(e2, atomicInteger, atomicInteger2);
            }
            if (atomicInteger.compareAndSet(n4, n3)) {
                if (n3 == 0) {
                    this.a.remove(e2, atomicInteger);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    Set<E> e() {
        Set<E> set = this.a.keySet();
        return new bg(this, set);
    }

    @Override
    public Set<km<E>> f() {
        return new bj(this, null);
    }

    @Override
    int c() {
        return this.a.size();
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    Iterator<km<E>> b() {
        bh bh2 = new bh(this);
        return new bi(this, bh2);
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.a);
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        ConcurrentMap concurrentMap = (ConcurrentMap)objectInputStream.readObject();
        bk.a.a(this, concurrentMap);
    }

    static /* synthetic */ ConcurrentMap a(bf bf2) {
        return bf2.a;
    }
}

