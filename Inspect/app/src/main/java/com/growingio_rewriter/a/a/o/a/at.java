/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.o.a.au;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public final class at<K> {
    private final ConcurrentHashMap<K, AtomicLong> a;
    private transient Map<K, Long> b;

    private at(ConcurrentHashMap<K, AtomicLong> concurrentHashMap) {
        this.a = aU.a(concurrentHashMap);
    }

    public static <K> at<K> a() {
        return new at(new ConcurrentHashMap());
    }

    public static <K> at<K> a(Map<? extends K, ? extends Long> map) {
        at<? extends K> at2 = at.a();
        at2.b(map);
        return at2;
    }

    public long a(K k2) {
        AtomicLong atomicLong = this.a.get(k2);
        return atomicLong == null ? 0 : atomicLong.get();
    }

    public long b(K k2) {
        return this.a(k2, 1);
    }

    public long c(K k2) {
        return this.a(k2, -1);
    }

    public long a(K k2, long l2) {
        long l3;
        block0 : do {
            long l4;
            AtomicLong atomicLong;
            if ((atomicLong = this.a.get(k2)) == null && (atomicLong = this.a.putIfAbsent(k2, new AtomicLong(l2))) == null) {
                return l2;
            }
            do {
                if ((l4 = atomicLong.get()) != 0) continue;
                if (!this.a.replace(k2, atomicLong, new AtomicLong(l2))) continue block0;
                return l2;
            } while (!atomicLong.compareAndSet(l4, l3 = l4 + l2));
            break;
        } while (true);
        return l3;
    }

    public long d(K k2) {
        return this.b(k2, 1);
    }

    public long e(K k2) {
        return this.b(k2, -1);
    }

    public long b(K k2, long l2) {
        long l3;
        block0 : do {
            long l4;
            AtomicLong atomicLong;
            if ((atomicLong = this.a.get(k2)) == null && (atomicLong = this.a.putIfAbsent(k2, new AtomicLong(l2))) == null) {
                return 0;
            }
            do {
                if ((l3 = atomicLong.get()) != 0) continue;
                if (!this.a.replace(k2, atomicLong, new AtomicLong(l2))) continue block0;
                return 0;
            } while (!atomicLong.compareAndSet(l3, l4 = l3 + l2));
            break;
        } while (true);
        return l3;
    }

    public long c(K k2, long l2) {
        long l3;
        block0 : do {
            AtomicLong atomicLong;
            if ((atomicLong = this.a.get(k2)) == null && (atomicLong = this.a.putIfAbsent(k2, new AtomicLong(l2))) == null) {
                return 0;
            }
            do {
                if ((l3 = atomicLong.get()) != 0) continue;
                if (!this.a.replace(k2, atomicLong, new AtomicLong(l2))) continue block0;
                return 0;
            } while (!atomicLong.compareAndSet(l3, l2));
            break;
        } while (true);
        return l3;
    }

    public void b(Map<? extends K, ? extends Long> map) {
        for (Map.Entry<K, Long> entry : map.entrySet()) {
            this.c(entry.getKey(), entry.getValue());
        }
    }

    public long f(K k2) {
        long l2;
        AtomicLong atomicLong = this.a.get(k2);
        if (atomicLong == null) {
            return 0;
        }
        while ((l2 = atomicLong.get()) != 0 && !atomicLong.compareAndSet(l2, 0)) {
        }
        this.a.remove(k2, atomicLong);
        return l2;
    }

    public void b() {
        Iterator<Map.Entry<K, AtomicLong>> iterator = this.a.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, AtomicLong> entry = iterator.next();
            AtomicLong atomicLong = entry.getValue();
            if (atomicLong == null || atomicLong.get() != 0) continue;
            iterator.remove();
        }
    }

    public long c() {
        long l2 = 0;
        for (AtomicLong atomicLong : this.a.values()) {
            l2 += atomicLong.get();
        }
        return l2;
    }

    public Map<K, Long> d() {
        Map<K, Long> map = this.b;
        Map<K, Long> map2 = map == null ? (this.b = this.h()) : map;
        return map2;
    }

    private Map<K, Long> h() {
        return Collections.unmodifiableMap(ii.a(this.a, new au(this)));
    }

    public boolean g(Object object) {
        return this.a.containsKey(object);
    }

    public int e() {
        return this.a.size();
    }

    public boolean f() {
        return this.a.isEmpty();
    }

    public void g() {
        this.a.clear();
    }

    public String toString() {
        return this.a.toString();
    }

    long d(K k2, long l2) {
        long l3;
        block2 : {
            AtomicLong atomicLong;
            do {
                if ((atomicLong = this.a.get(k2)) == null && (atomicLong = this.a.putIfAbsent(k2, new AtomicLong(l2))) == null) {
                    return 0;
                }
                l3 = atomicLong.get();
                if (l3 != 0) break block2;
            } while (!this.a.replace(k2, atomicLong, new AtomicLong(l2)));
            return 0;
        }
        return l3;
    }

    boolean a(K k2, long l2, long l3) {
        if (l2 == 0) {
            return this.d(k2, l3) == 0;
        }
        AtomicLong atomicLong = this.a.get(k2);
        return atomicLong == null ? false : atomicLong.compareAndSet(l2, l3);
    }

    boolean e(K k2, long l2) {
        AtomicLong atomicLong = this.a.get(k2);
        if (atomicLong == null) {
            return false;
        }
        long l3 = atomicLong.get();
        if (l3 != l2) {
            return false;
        }
        if (l3 == 0 || atomicLong.compareAndSet(l3, 0)) {
            this.a.remove(k2, atomicLong);
            return true;
        }
        return false;
    }
}

