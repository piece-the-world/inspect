/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.aj;
import com.growingio.a.a.h.am;
import com.growingio.a.a.h.ao;
import com.growingio.a.a.h.ap;
import com.growingio.a.a.h.aq;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

abstract class an
extends Enum<an>
implements am {
    public static final /* enum */ an a = new ao("UNSAFE_LITTLE_ENDIAN", 0);
    public static final /* enum */ an b = new ap("UNSAFE_BIG_ENDIAN", 1);
    private static final Unsafe c;
    private static final int d;
    private static final /* synthetic */ an[] e;

    public static an[] a() {
        return (an[])e.clone();
    }

    public static an a(String string) {
        return (an)Enum.valueOf(an.class, string);
    }

    private an() {
        super(string, n2);
    }

    private static Unsafe d() {
        try {
            return Unsafe.getUnsafe();
        }
        catch (SecurityException var0) {
            try {
                return (Unsafe)AccessController.doPrivileged(new aq());
            }
            catch (PrivilegedActionException var0_1) {
                throw new RuntimeException("Could not initialize intrinsics", var0_1.getCause());
            }
        }
    }

    /* synthetic */ an(String string, int n2, aj aj2) {
        this();
    }

    static /* synthetic */ int b() {
        return d;
    }

    static /* synthetic */ Unsafe c() {
        return c;
    }

    static {
        e = new an[]{a, b};
        c = an.d();
        d = c.arrayBaseOffset(byte[].class);
        if (c.arrayIndexScale(byte[].class) != 1) {
            throw new AssertionError();
        }
    }
}

