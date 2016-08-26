/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.j.S;
import com.growingio.a.a.j.W;
import java.io.Closeable;
import java.util.logging.Level;
import java.util.logging.Logger;

final class U
implements W {
    static final U a = new U();

    U() {
    }

    @Override
    public void a(Closeable closeable, Throwable throwable, Throwable throwable2) {
        S.a.log(Level.WARNING, "Suppressing exception thrown when closing " + closeable, throwable2);
    }
}

