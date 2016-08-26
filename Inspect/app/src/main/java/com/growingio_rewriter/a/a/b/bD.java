/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aT;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bR;
import java.util.concurrent.TimeUnit;

public final class bD {
    private final bR a;
    private boolean b;
    private long c;
    private long d;

    public static bD a() {
        return new bD();
    }

    public static bD a(bR bR2) {
        return new bD(bR2);
    }

    public static bD b() {
        return new bD().d();
    }

    public static bD b(bR bR2) {
        return new bD(bR2).d();
    }

    bD() {
        this.a = bR.b();
    }

    bD(bR bR2) {
        this.a = aU.a(bR2, (Object)"ticker");
    }

    public boolean c() {
        return this.b;
    }

    public bD d() {
        aU.b(!this.b, "This stopwatch is already running.");
        this.b = true;
        this.d = this.a.a();
        return this;
    }

    public bD e() {
        long l2 = this.a.a();
        aU.b(this.b, "This stopwatch is already stopped.");
        this.b = false;
        this.c += l2 - this.d;
        return this;
    }

    public bD f() {
        this.c = 0;
        this.b = false;
        return this;
    }

    private long g() {
        return this.b ? this.a.a() - this.d + this.c : this.c;
    }

    public long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.g(), TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long l2 = this.g();
        TimeUnit timeUnit = bD.a(l2);
        double d2 = (double)l2 / (double)TimeUnit.NANOSECONDS.convert(1, timeUnit);
        return aT.a(d2) + " " + bD.b(timeUnit);
    }

    private static TimeUnit a(long l2) {
        if (TimeUnit.DAYS.convert(l2, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.DAYS;
        }
        if (TimeUnit.HOURS.convert(l2, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.HOURS;
        }
        if (TimeUnit.MINUTES.convert(l2, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.MINUTES;
        }
        if (TimeUnit.SECONDS.convert(l2, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.SECONDS;
        }
        if (TimeUnit.MILLISECONDS.convert(l2, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.MILLISECONDS;
        }
        if (TimeUnit.MICROSECONDS.convert(l2, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.MICROSECONDS;
        }
        return TimeUnit.NANOSECONDS;
    }

    private static String b(TimeUnit timeUnit) {
        switch (timeUnit) {
            case NANOSECONDS: {
                return "ns";
            }
            case MICROSECONDS: {
                return "\u03bcs";
            }
            case MILLISECONDS: {
                return "ms";
            }
            case SECONDS: {
                return "s";
            }
            case MINUTES: {
                return "min";
            }
            case HOURS: {
                return "h";
            }
            case DAYS: {
                return "d";
            }
        }
        throw new AssertionError();
    }
}

