/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.j.B;
import com.growingio.a.a.j.I;
import com.growingio.a.a.j.T;
import com.growingio.a.a.j.t;
import com.growingio.a.a.j.u;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public abstract class s {
    protected s() {
    }

    public I a(Charset charset) {
        return new u(this, charset, null);
    }

    public abstract OutputStream a() throws IOException;

    public OutputStream b() throws IOException {
        OutputStream outputStream = this.a();
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream)outputStream : new BufferedOutputStream(outputStream);
    }

    public void a(byte[] arrby) throws IOException {
        aU.a(arrby);
        T t2 = T.a();
        try {
            OutputStream outputStream = t2.a(this.a());
            outputStream.write(arrby);
            outputStream.flush();
        }
        catch (Throwable var3_4) {
            throw t2.a(var3_4);
        }
        finally {
            t2.close();
        }
    }

    public long a(InputStream inputStream) throws IOException {
        aU.a(inputStream);
        T t2 = T.a();
        try {
            OutputStream outputStream = t2.a(this.a());
            long l2 = B.a(inputStream, outputStream);
            outputStream.flush();
            long l3 = l2;
            return l3;
        }
        catch (Throwable var3_4) {
            throw t2.a(var3_4);
        }
        finally {
            t2.close();
        }
    }
}

