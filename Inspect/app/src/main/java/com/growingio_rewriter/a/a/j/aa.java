/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.j.Z;
import com.growingio.a.a.j.v;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

class aa
extends v {
    final /* synthetic */ Z a;

    aa(Z z2) {
        this.a = z2;
    }

    @Override
    public InputStream a() throws IOException {
        return Z.a(this.a);
    }

    protected void finalize() {
        try {
            this.a.c();
        }
        catch (Throwable var1_1) {
            var1_1.printStackTrace(System.err);
        }
    }
}

