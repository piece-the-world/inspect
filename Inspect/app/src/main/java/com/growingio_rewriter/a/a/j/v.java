/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aP;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.h.H;
import com.growingio.a.a.h.L;
import com.growingio.a.a.h.M;
import com.growingio.a.a.j.A;
import com.growingio.a.a.j.B;
import com.growingio.a.a.j.J;
import com.growingio.a.a.j.T;
import com.growingio.a.a.j.r;
import com.growingio.a.a.j.s;
import com.growingio.a.a.j.w;
import com.growingio.a.a.j.x;
import com.growingio.a.a.j.y;
import com.growingio.a.a.j.z;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;

public abstract class v {
    protected v() {
    }

    public J a(Charset charset) {
        return new w(this, charset);
    }

    public abstract InputStream a() throws IOException;

    public InputStream b() throws IOException {
        InputStream inputStream = this.a();
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream)inputStream : new BufferedInputStream(inputStream);
    }

    public v a(long l2, long l3) {
        return new A(this, l2, l3);
    }

    public boolean c() throws IOException {
        aP<Long> aP2 = this.d();
        if (aP2.b() && aP2.c() == 0) {
            return true;
        }
        T t2 = T.a();
        try {
            InputStream inputStream = t2.a(this.a());
            boolean bl2 = inputStream.read() == -1;
            return bl2;
        }
        catch (Throwable var3_4) {
            throw t2.a(var3_4);
        }
        finally {
            t2.close();
        }
    }

    public aP<Long> d() {
        return aP.f();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public long e() throws IOException {
        aP<Long> aP2 = this.d();
        if (aP2.b()) {
            return aP2.c();
        }
        T t2 = T.a();
        try {
            InputStream inputStream = t2.a(this.a());
            long l2 = this.a(inputStream);
            return l2;
        }
        catch (IOException var3_4) {}
        finally {
            t2.close();
        }
        t2 = T.a();
        try {
            InputStream inputStream = t2.a(this.a());
            long l3 = B.b(inputStream);
            return l3;
        }
        catch (Throwable var3_6) {
            throw t2.a(var3_6);
        }
        finally {
            t2.close();
        }
    }

    private long a(InputStream inputStream) throws IOException {
        long l2;
        long l3 = 0;
        while ((l2 = B.c(inputStream, Integer.MAX_VALUE)) > 0) {
            l3 += l2;
        }
        return l3;
    }

    public long a(OutputStream outputStream) throws IOException {
        aU.a(outputStream);
        T t2 = T.a();
        try {
            InputStream inputStream = t2.a(this.a());
            long l2 = B.a(inputStream, outputStream);
            return l2;
        }
        catch (Throwable var3_4) {
            throw t2.a(var3_4);
        }
        finally {
            t2.close();
        }
    }

    public long a(s s2) throws IOException {
        aU.a(s2);
        T t2 = T.a();
        try {
            InputStream inputStream = t2.a(this.a());
            OutputStream outputStream = t2.a(s2.a());
            long l2 = B.a(inputStream, outputStream);
            return l2;
        }
        catch (Throwable var3_4) {
            throw t2.a(var3_4);
        }
        finally {
            t2.close();
        }
    }

    public byte[] f() throws IOException {
        T t2 = T.a();
        try {
            InputStream inputStream = t2.a(this.a());
            byte[] arrby = B.a(inputStream);
            return arrby;
        }
        catch (Throwable var2_3) {
            throw t2.a(var2_3);
        }
        finally {
            t2.close();
        }
    }

    public <T> T a(r<T> r2) throws IOException {
        aU.a(r2);
        T t2 = T.a();
        try {
            InputStream inputStream = t2.a(this.a());
            T t3 = B.a(inputStream, r2);
            return t3;
        }
        catch (Throwable var3_4) {
            throw t2.a(var3_4);
        }
        finally {
            t2.close();
        }
    }

    public H a(L l2) throws IOException {
        M m2 = l2.a();
        this.a(com.growingio.a.a.h.y.a(m2));
        return m2.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(v v2) throws IOException {
        aU.a(v2);
        byte[] arrby = B.a();
        byte[] arrby2 = B.a();
        T t2 = T.a();
        try {
            InputStream inputStream = t2.a(this.a());
            InputStream inputStream2 = t2.a(v2.a());
            do {
                int n3;
                int n2;
                if ((n3 = B.b(inputStream, arrby, 0, arrby.length)) != (n2 = B.b(inputStream2, arrby2, 0, arrby2.length)) || !Arrays.equals(arrby, arrby2)) {
                    boolean bl2 = false;
                    return bl2;
                }
                if (n3 != arrby.length) {
                    boolean bl3 = true;
                    return bl3;
                }
                continue;
                break;
            } while (true);
        }
        catch (Throwable throwable) {
            throw t2.a(throwable);
        }
        finally {
            t2.close();
        }
    }

    public static v a(Iterable<? extends v> iterable) {
        return new y(iterable);
    }

    public static v a(Iterator<? extends v> iterator) {
        return v.a(ea.a(iterator));
    }

    public static /* varargs */ v a(v ... arrv) {
        return v.a(ea.a(arrv));
    }

    public static v a(byte[] arrby) {
        return new x(arrby);
    }

    public static v g() {
        return z.d;
    }
}

