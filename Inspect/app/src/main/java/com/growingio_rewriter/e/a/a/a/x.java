/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a;

import com.growingio.e.a.a.a.t;
import java.io.IOException;
import java.io.Serializable;

public class x
extends t {
    private static final long a = -6994123481142850163L;
    private final Serializable b;

    public static boolean a(Throwable throwable, Object object) {
        return object != null && throwable instanceof x && object.equals(((x)throwable).b);
    }

    public static void b(Throwable throwable, Object object) throws IOException {
        if (x.a(throwable, object)) {
            throw ((x)throwable).b();
        }
    }

    public x(IOException iOException, Serializable serializable) {
        super(iOException.getMessage(), iOException);
        this.b = serializable;
    }

    public Serializable a() {
        return this.b;
    }

    public IOException b() {
        return (IOException)super.getCause();
    }

    @Override
    public /* synthetic */ Throwable getCause() {
        return this.b();
    }
}

