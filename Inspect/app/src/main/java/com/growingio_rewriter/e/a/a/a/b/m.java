/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.b;

import com.growingio.e.a.a.a.b.a;
import com.growingio.e.a.a.a.b.n;
import com.growingio.e.a.a.a.b.q;
import java.io.File;
import java.io.Serializable;

public class m
extends a
implements Serializable {
    private static final long c = 8930842316112759062L;
    public static final n a = new m();
    public static final n b = new q(a);

    protected m() {
    }

    @Override
    public boolean accept(File file) {
        return file.isHidden();
    }
}

