/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.c;

import com.growingio.e.a.a.a.c.k;
import com.growingio.e.a.a.a.c.p;
import java.io.InputStream;

public class j
extends p {
    public j(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public void close() {
        this.in = new k();
    }
}

