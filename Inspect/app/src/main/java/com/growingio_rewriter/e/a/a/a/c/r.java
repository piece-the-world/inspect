/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.c;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

public class r
extends InputStream {
    private static final int a = 1024;
    private final Reader b;
    private final CharsetEncoder c;
    private final CharBuffer d;
    private final ByteBuffer e;
    private CoderResult f;
    private boolean g;

    public r(Reader reader, CharsetEncoder charsetEncoder) {
        this(reader, charsetEncoder, 1024);
    }

    public r(Reader reader, CharsetEncoder charsetEncoder, int n2) {
        this.b = reader;
        this.c = charsetEncoder;
        this.d = CharBuffer.allocate(n2);
        this.d.flip();
        this.e = ByteBuffer.allocate(128);
        this.e.flip();
    }

    public r(Reader reader, Charset charset, int n2) {
        this(reader, charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE), n2);
    }

    public r(Reader reader, Charset charset) {
        this(reader, charset, 1024);
    }

    public r(Reader reader, String string, int n2) {
        this(reader, Charset.forName(string), n2);
    }

    public r(Reader reader, String string) {
        this(reader, string, 1024);
    }

    public r(Reader reader) {
        this(reader, Charset.defaultCharset());
    }

    private void a() throws IOException {
        if (!this.g && (this.f == null || this.f.isUnderflow())) {
            this.d.compact();
            int n2 = this.d.position();
            int n3 = this.b.read(this.d.array(), n2, this.d.remaining());
            if (n3 == -1) {
                this.g = true;
            } else {
                this.d.position(n2 + n3);
            }
            this.d.flip();
        }
        this.e.compact();
        this.f = this.c.encode(this.d, this.e, this.g);
        this.e.flip();
    }

    @Override
    public int read(byte[] arrby, int n2, int n3) throws IOException {
        if (arrby == null) {
            throw new NullPointerException("Byte array must not be null");
        }
        if (n3 < 0 || n2 < 0 || n2 + n3 > arrby.length) {
            throw new IndexOutOfBoundsException("Array Size=" + arrby.length + ", offset=" + n2 + ", length=" + n3);
        }
        int n4 = 0;
        if (n3 == 0) {
            return 0;
        }
        while (n3 > 0) {
            if (this.e.hasRemaining()) {
                int n5 = Math.min(this.e.remaining(), n3);
                this.e.get(arrby, n2, n5);
                n2 += n5;
                n3 -= n5;
                n4 += n5;
                continue;
            }
            this.a();
            if (!this.g || this.e.hasRemaining()) continue;
        }
        return n4 == 0 && this.g ? -1 : n4;
    }

    @Override
    public int read(byte[] arrby) throws IOException {
        return this.read(arrby, 0, arrby.length);
    }

    @Override
    public int read() throws IOException {
        do {
            if (this.e.hasRemaining()) {
                return this.e.get() & 255;
            }
            this.a();
        } while (!this.g || this.e.hasRemaining());
        return -1;
    }

    @Override
    public void close() throws IOException {
        this.b.close();
    }
}

