/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.b;

import com.growingio.e.a.a.a.b.a;
import com.growingio.e.a.a.a.b.n;
import java.io.File;
import java.io.Serializable;

public class q
extends a
implements Serializable {
    private static final long a = 6131563330944994230L;
    private final n b;

    public q(n n2) {
        if (n2 == null) {
            throw new IllegalArgumentException("The filter must not be null");
        }
        this.b = n2;
    }

    @Override
    public boolean accept(File file) {
        return !this.b.accept(file);
    }

    @Override
    public boolean accept(File file, String string) {
        return !this.b.accept(file, string);
    }

    @Override
    public String toString() {
        return super.toString() + "(" + this.b.toString() + ")";
    }
}

