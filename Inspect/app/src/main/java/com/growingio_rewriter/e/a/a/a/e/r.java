/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.e;

import com.growingio.e.a.a.a.e.o;
import com.growingio.e.a.a.a.x;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.UUID;

public class r
extends o {
    private final Serializable a = UUID.randomUUID();

    public r(OutputStream outputStream) {
        super(outputStream);
    }

    public boolean a(Exception exception) {
        return x.a(exception, this.a);
    }

    public void b(Exception exception) throws IOException {
        x.b(exception, this.a);
    }

    @Override
    protected void a(IOException iOException) throws IOException {
        throw new x(iOException, this.a);
    }
}

