/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.j.ay;
import com.growingio.a.a.j.v;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

final class az
extends v {
    private final URL a;

    private az(URL uRL) {
        this.a = aU.a(uRL);
    }

    @Override
    public InputStream a() throws IOException {
        return this.a.openStream();
    }

    public String toString() {
        return "Resources.asByteSource(" + this.a + ")";
    }

    /* synthetic */ az(URL uRL, ay ay2) {
        this(uRL);
    }
}

