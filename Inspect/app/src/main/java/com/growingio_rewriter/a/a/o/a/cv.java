/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.cw;
import com.growingio.a.a.o.a.df;
import com.growingio.a.a.o.a.dg;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public abstract class cv {
    private final cw a;
    private volatile Object b;

    public static cv a(double d2) {
        return cv.a(cw.b(), d2);
    }

    static cv a(cw cw2, double d2) {
        df df2 = new df(cw2, 1.0);
        df2.b(d2);
        return df2;
    }

    public static cv a(double d2, long l2, TimeUnit timeUnit) {
        aU.a(l2 >= 0, "warmupPeriod must not be negative: %s", l2);
        return cv.a(cw.b(), d2, l2, timeUnit, 3.0);
    }

    static cv a(cw cw2, double d2, long l2, TimeUnit timeUnit, double d3) {
        dg dg2 = new dg(cw2, l2, timeUnit, d3);
        dg2.b(d2);
        return dg2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Object e() {
        Object object = this.b;
        if (object == null) {
            cv cv2 = this;
            synchronized (cv2) {
                object = this.b;
                if (object == null) {
                    this.b = object = new Object();
                }
            }
        }
        return object;
    }

    cv(cw cw2) {
        this.a = aU.a(cw2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void b(double d2) {
        aU.a(d2 > 0.0 && !Double.isNaN(d2), (Object)"rate must be positive");
        Object object = this.e();
        synchronized (object) {
            this.a(d2, this.a.a());
        }
    }

    abstract void a(double var1, long var3);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final double a() {
        Object object = this.e();
        synchronized (object) {
            return this.b();
        }
    }

    abstract double b();

    public double c() {
        return this.a(1);
    }

    public double a(int n2) {
        long l2 = this.b(n2);
        this.a.a(l2);
        return 1.0 * (double)l2 / (double)TimeUnit.SECONDS.toMicros(1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    final long b(int n2) {
        cv.d(n2);
        Object object = this.e();
        synchronized (object) {
            return this.a(n2, this.a.a());
        }
    }

    public boolean a(long l2, TimeUnit timeUnit) {
        return this.a(1, l2, timeUnit);
    }

    public boolean c(int n2) {
        return this.a(n2, 0, TimeUnit.MICROSECONDS);
    }

    public boolean d() {
        return this.a(1, 0, TimeUnit.MICROSECONDS);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(int n2, long l2, TimeUnit timeUnit) {
        long l3;
        long l4 = Math.max(timeUnit.toMicros(l2), 0);
        cv.d(n2);
        Object object = this.e();
        synchronized (object) {
            long l5 = this.a.a();
            if (!this.a(l5, l4)) {
                return false;
            }
            l3 = this.a(n2, l5);
        }
        this.a.a(l3);
        return true;
    }

    private boolean a(long l2, long l3) {
        return this.a(l2) - l3 <= l2;
    }

    final long a(int n2, long l2) {
        long l3 = this.b(n2, l2);
        return Math.max(l3 - l2, 0);
    }

    abstract long a(long var1);

    abstract long b(int var1, long var2);

    public String toString() {
        return String.format(Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", this.a());
    }

    private static void d(int n2) {
        aU.a(n2 > 0, "Requested permits (%s) must be positive", n2);
    }
}

