/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.j.ad;
import com.growingio.a.a.j.af;
import com.growingio.a.a.j.s;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

final class ah
extends s {
    private final File a;
    private final fg<ad> b;

    private /* varargs */ ah(File file, ad ... arrad) {
        this.a = aU.a(file);
        this.b = fg.a(arrad);
    }

    public FileOutputStream c() throws IOException {
        return new FileOutputStream(this.a, this.b.contains((Object)ad.a));
    }

    public String toString() {
        return "Files.asByteSink(" + this.a + ", " + this.b + ")";
    }

    @Override
    public /* synthetic */ OutputStream a() throws IOException {
        return this.c();
    }

    /* synthetic */ ah(File file, ad[] arrad, af af2) {
        this(file, arrad);
    }
}

