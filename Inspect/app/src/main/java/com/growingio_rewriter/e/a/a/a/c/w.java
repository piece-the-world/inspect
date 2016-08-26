/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.c;

import com.growingio.e.a.a.a.c.p;
import com.growingio.e.a.a.a.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.UUID;

public class w
extends p {
    private final Serializable a = UUID.randomUUID();

    public w(InputStream inputStream) {
        super(inputStream);
    }

    public boolean a(Throwable throwable) {
        return x.a(throwable, this.a);
    }

    public void b(Throwable throwable) throws IOException {
        x.b(throwable, this.a);
    }

    @Override
    protected void a(IOException iOException) throws IOException {
        throw new x(iOException, this.a);
    }
}

