/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.b;

import com.growingio.e.a.a.a.b.a;
import java.io.File;
import java.io.Serializable;

public class u
extends a
implements Serializable {
    private static final long a = 7388077430788600069L;
    private final long b;
    private final boolean c;

    public u(long l2) {
        this(l2, true);
    }

    public u(long l2, boolean bl2) {
        if (l2 < 0) {
            throw new IllegalArgumentException("The size must be non-negative");
        }
        this.b = l2;
        this.c = bl2;
    }

    @Override
    public boolean accept(File file) {
        boolean bl2;
        boolean bl3 = bl2 = file.length() < this.b;
        return this.c ? !bl2 : bl2;
    }

    @Override
    public String toString() {
        String string = this.c ? ">=" : "<";
        return super.toString() + "(" + string + this.b + ")";
    }
}

