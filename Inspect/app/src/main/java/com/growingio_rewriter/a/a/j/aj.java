/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.j.af;
import com.growingio.a.a.j.ak;
import com.growingio.a.a.j.al;
import java.io.File;

abstract class aj
extends Enum<aj>
implements aV<File> {
    public static final /* enum */ aj a = new ak("IS_DIRECTORY", 0);
    public static final /* enum */ aj b = new al("IS_FILE", 1);
    private static final /* synthetic */ aj[] c;

    public static aj[] a() {
        return (aj[])c.clone();
    }

    public static aj a(String string) {
        return (aj)Enum.valueOf(aj.class, string);
    }

    private aj() {
        super(string, n2);
    }

    /* synthetic */ aj(String string, int n2, af af2) {
        this();
    }

    static {
        c = new aj[]{a, b};
    }
}

