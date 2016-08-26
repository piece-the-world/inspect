/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.e;

import com.growingio.e.a.a.a.c.k;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class c
extends OutputStream {
    private static final byte[] a = new byte[0];
    private final List<byte[]> b = new ArrayList<byte[]>();
    private int c;
    private int d;
    private byte[] e;
    private int f;
    private boolean g = true;

    public c() {
        this(1024);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public c(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Negative initial size: " + n2);
        }
        c c2 = this;
        synchronized (c2) {
            this.a(n2);
        }
    }

    private void a(int n2) {
        if (this.c < this.b.size() - 1) {
            this.d += this.e.length;
            ++this.c;
            this.e = this.b.get(this.c);
        } else {
            int n3;
            if (this.e == null) {
                n3 = n2;
                this.d = 0;
            } else {
                n3 = Math.max(this.e.length << 1, n2 - this.d);
                this.d += this.e.length;
            }
            ++this.c;
            this.e = new byte[n3];
            this.b.add(this.e);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void write(byte[] arrby, int n2, int n3) {
        if (n2 < 0 || n2 > arrby.length || n3 < 0 || n2 + n3 > arrby.length || n2 + n3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (n3 == 0) {
            return;
        }
        c c2 = this;
        synchronized (c2) {
            int n4 = this.f + n3;
            int n5 = n3;
            int n6 = this.f - this.d;
            while (n5 > 0) {
                int n7 = Math.min(n5, this.e.length - n6);
                System.arraycopy(arrby, n2 + n3 - n5, this.e, n6, n7);
                if ((n5 -= n7) <= 0) continue;
                this.a(n4);
                n6 = 0;
            }
            this.f = n4;
        }
    }

    @Override
    public synchronized void write(int n2) {
        int n3 = this.f - this.d;
        if (n3 == this.e.length) {
            this.a(this.f + 1);
            n3 = 0;
        }
        this.e[n3] = (byte)n2;
        ++this.f;
    }

    public synchronized int a(InputStream inputStream) throws IOException {
        int n2 = 0;
        int n3 = this.f - this.d;
        int n4 = inputStream.read(this.e, n3, this.e.length - n3);
        while (n4 != -1) {
            n2 += n4;
            this.f += n4;
            if ((n3 += n4) == this.e.length) {
                this.a(this.e.length);
                n3 = 0;
            }
            n4 = inputStream.read(this.e, n3, this.e.length - n3);
        }
        return n2;
    }

    public synchronized int a() {
        return this.f;
    }

    @Override
    public void close() throws IOException {
    }

    public synchronized void b() {
        this.f = 0;
        this.d = 0;
        this.c = 0;
        if (this.g) {
            this.e = this.b.get(this.c);
        } else {
            this.e = null;
            int n2 = this.b.get(0).length;
            this.b.clear();
            this.a(n2);
            this.g = true;
        }
    }

    public synchronized void a(OutputStream outputStream) throws IOException {
        int n2 = this.f;
        for (byte[] arrby : this.b) {
            int n3 = Math.min(arrby.length, n2);
            outputStream.write(arrby, 0, n3);
            if ((n2 -= n3) != 0) continue;
            break;
        }
    }

    public static InputStream b(InputStream inputStream) throws IOException {
        return c.a(inputStream, 1024);
    }

    public static InputStream a(InputStream inputStream, int n2) throws IOException {
        c c2 = new c(n2);
        c2.a(inputStream);
        return c2.c();
    }

    public synchronized InputStream c() {
        int n2 = this.f;
        if (n2 == 0) {
            return new k();
        }
        ArrayList<ByteArrayInputStream> arrayList = new ArrayList<ByteArrayInputStream>(this.b.size());
        for (byte[] arrby : this.b) {
            int n3 = Math.min(arrby.length, n2);
            arrayList.add(new ByteArrayInputStream(arrby, 0, n3));
            if ((n2 -= n3) != 0) continue;
            break;
        }
        this.g = false;
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    public synchronized byte[] d() {
        int n2 = this.f;
        if (n2 == 0) {
            return a;
        }
        byte[] arrby = new byte[n2];
        int n3 = 0;
        for (byte[] arrby2 : this.b) {
            int n4 = Math.min(arrby2.length, n2);
            System.arraycopy(arrby2, 0, arrby, n3, n4);
            n3 += n4;
            if ((n2 -= n4) != 0) continue;
            break;
        }
        return arrby;
    }

    public String toString() {
        return new String(this.d(), Charset.defaultCharset());
    }

    public String a(String string) throws UnsupportedEncodingException {
        return new String(this.d(), string);
    }

    public String a(Charset charset) {
        return new String(this.d(), charset);
    }
}

