/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.A;
import com.growingio.a.a.h.B;
import com.growingio.a.a.h.C;
import com.growingio.a.a.h.D;
import com.growingio.a.a.h.E;
import com.growingio.a.a.h.G;
import com.growingio.a.a.h.aC;
import com.growingio.a.a.h.x;
import com.growingio.a.a.h.z;
import java.io.OutputStream;
import java.nio.charset.Charset;

public final class y {
    private y() {
    }

    public static x<byte[]> a() {
        return z.a;
    }

    public static x<CharSequence> b() {
        return G.a;
    }

    public static x<CharSequence> a(Charset charset) {
        return new E(charset);
    }

    public static x<Integer> c() {
        return A.a;
    }

    public static <E> x<Iterable<? extends E>> a(x<E> x2) {
        return new C<E>(x2);
    }

    public static x<Long> d() {
        return B.a;
    }

    public static OutputStream a(aC aC2) {
        return new D(aC2);
    }
}

