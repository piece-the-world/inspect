/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.b;

import com.growingio.e.a.a.a.b.a;
import com.growingio.e.a.a.a.o;
import java.io.File;
import java.io.Serializable;
import java.util.Date;

public class b
extends a
implements Serializable {
    private static final long a = -2132740084016138541L;
    private final long b;
    private final boolean c;

    public b(long l2) {
        this(l2, true);
    }

    public b(long l2, boolean bl2) {
        this.c = bl2;
        this.b = l2;
    }

    public b(Date date) {
        this(date, true);
    }

    public b(Date date, boolean bl2) {
        this(date.getTime(), bl2);
    }

    public b(File file) {
        this(file, true);
    }

    public b(File file, boolean bl2) {
        this(file.lastModified(), bl2);
    }

    @Override
    public boolean accept(File file) {
        boolean bl2 = o.a(file, this.b);
        return this.c ? !bl2 : bl2;
    }

    @Override
    public String toString() {
        String string = this.c ? "<=" : ">";
        return super.toString() + "(" + string + this.b + ")";
    }
}

