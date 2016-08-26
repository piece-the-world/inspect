/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.bm;
import com.growingio.a.a.c.bn;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Random;
import sun.misc.Unsafe;

abstract class bl
extends Number {
    static final ThreadLocal<int[]> a = new ThreadLocal<T>();
    static final Random b = new Random();
    static final int c = Runtime.getRuntime().availableProcessors();
    volatile transient bn[] d;
    volatile transient long e;
    volatile transient int f;
    private static final Unsafe g;
    private static final long h;
    private static final long i;

    bl() {
    }

    final boolean b(long l2, long l3) {
        return g.compareAndSwapLong(this, h, l2, l3);
    }

    final boolean f() {
        return g.compareAndSwapInt(this, i, 0, 1);
    }

    abstract long a(long var1, long var3);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final void a(long l2, int[] arrn, boolean bl2) {
        int n2;
        int n3;
        if (arrn == null) {
            arrn = new int[1];
            a.set(arrn);
            n2 = b.nextInt();
            arrn[0] = n2 == 0 ? 1 : n2;
            n3 = arrn[0];
        } else {
            n3 = arrn[0];
        }
        n2 = 0;
        do {
            int n4;
            long l3;
            bn[] arrbn;
            if ((arrbn = this.d) != null && (n4 = arrbn.length) > 0) {
                int n5;
                bn[] arrbn2;
                bn bn2 = arrbn[n4 - 1 & n3];
                if (bn2 == null) {
                    if (this.f == 0) {
                        arrbn2 = new bn[](l2);
                        if (this.f == 0 && this.f()) {
                            n5 = 0;
                            try {
                                int n6;
                                int n7;
                                bn[] arrbn3 = this.d;
                                if (arrbn3 != null && (n6 = arrbn3.length) > 0 && arrbn3[n7 = n6 - 1 & n3] == null) {
                                    arrbn3[n7] = arrbn2;
                                    n5 = 1;
                                }
                            }
                            finally {
                                this.f = 0;
                            }
                            if (n5 == 0) continue;
                            return;
                        }
                    }
                    n2 = 0;
                } else if (!bl2) {
                    bl2 = true;
                } else {
                    l3 = bn2.h;
                    if (bn2.a(l3, this.a(l3, l2))) return;
                    if (n4 >= c || this.d != arrbn) {
                        n2 = 0;
                    } else if (n2 == 0) {
                        n2 = 1;
                    } else if (this.f == 0 && this.f()) {
                        try {
                            if (this.d == arrbn) {
                                arrbn2 = new bn[n4 << 1];
                                for (n5 = 0; n5 < n4; ++n5) {
                                    arrbn2[n5] = arrbn[n5];
                                }
                                this.d = arrbn2;
                            }
                        }
                        finally {
                            this.f = 0;
                        }
                        n2 = 0;
                        continue;
                    }
                }
                n3 ^= n3 << 13;
                n3 ^= n3 >>> 17;
                n3 ^= n3 << 5;
                arrn[0] = n3;
                continue;
            }
            if (this.f == 0 && this.d == arrbn && this.f()) {
                boolean bl3;
                bl3 = false;
                try {
                    if (this.d == arrbn) {
                        bn[] arrbn4 = new bn[2];
                        arrbn4[n3 & 1] = new bn(l2);
                        this.d = arrbn4;
                        bl3 = true;
                    }
                }
                finally {
                    this.f = 0;
                }
                if (!bl3) continue;
                return;
            }
            l3 = this.e;
            if (this.b(l3, this.a(l3, l2))) return;
        } while (true);
    }

    final void b(long l2) {
        bn[] arrbn = this.d;
        this.e = l2;
        if (arrbn != null) {
            for (bn bn2 : arrbn) {
                if (bn2 == null) continue;
                bn2.h = l2;
            }
        }
    }

    private static Unsafe a() {
        try {
            return Unsafe.getUnsafe();
        }
        catch (SecurityException var0) {
            try {
                return (Unsafe)AccessController.doPrivileged(new bm());
            }
            catch (PrivilegedActionException var0_1) {
                throw new RuntimeException("Could not initialize intrinsics", var0_1.getCause());
            }
        }
    }

    static /* synthetic */ Unsafe g() {
        return bl.a();
    }

    static {
        try {
            g = bl.a();
            reference var0 = bl.class;
            h = g.objectFieldOffset(var0.getDeclaredField("base"));
            i = g.objectFieldOffset(var0.getDeclaredField("busy"));
        }
        catch (Exception var0_1) {
            throw new Error(var0_1);
        }
    }
}

