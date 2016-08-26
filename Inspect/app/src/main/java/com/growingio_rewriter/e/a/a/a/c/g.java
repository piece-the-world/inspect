/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.c;

import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

public class g
extends InputStream {
    private static final int a = 2048;
    private static final int b = -1;
    private final CharsetEncoder c;
    private final CharBuffer d;
    private final ByteBuffer e;
    private int f;
    private int g;

    public g(CharSequence charSequence, Charset charset, int n2) {
        this.c = charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
        float f2 = this.c.maxBytesPerChar();
        if ((float)n2 < f2) {
            throw new IllegalArgumentException("Buffer size " + n2 + " is less than maxBytesPerChar " + f2);
        }
        this.e = ByteBuffer.allocate(n2);
        this.e.flip();
        this.d = CharBuffer.wrap(charSequence);
        this.f = -1;
        this.g = -1;
    }

    public g(CharSequence charSequence, String string, int n2) {
        this(charSequence, Charset.forName(string), n2);
    }

    public g(CharSequence charSequence, Charset charset) {
        this(charSequence, charset, 2048);
    }

    public g(CharSequence charSequence, String string) {
        this(charSequence, string, 2048);
    }

    private void a() throws CharacterCodingException {
        this.e.compact();
        CoderResult coderResult = this.c.encode(this.d, this.e, true);
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.e.flip();
    }

    @Override
    public int read(byte[] arrby, int n2, int n3) throws IOException {
        if (arrby == null) {
            throw new NullPointerException("Byte array is null");
        }
        if (n3 < 0 || n2 + n3 > arrby.length) {
            throw new IndexOutOfBoundsException("Array Size=" + arrby.length + ", offset=" + n2 + ", length=" + n3);
        }
        if (n3 == 0) {
            return 0;
        }
        if (!this.e.hasRemaining() && !this.d.hasRemaining()) {
            return -1;
        }
        int n4 = 0;
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
            if (this.e.hasRemaining() || this.d.hasRemaining()) continue;
        }
        return n4 == 0 && !this.d.hasRemaining() ? -1 : n4;
    }

    @Override
    public int read() throws IOException {
        do {
            if (this.e.hasRemaining()) {
                return this.e.get() & 255;
            }
            this.a();
        } while (this.e.hasRemaining() || this.d.hasRemaining());
        return -1;
    }

    @Override
    public int read(byte[] arrby) throws IOException {
        return this.read(arrby, 0, arrby.length);
    }

    @Override
    public long skip(long l2) throws IOException {
        long l3 = 0;
        while (l2 > 0 && this.available() > 0) {
            this.read();
            --l2;
            ++l3;
        }
        return l3;
    }

    @Override
    public int available() throws IOException {
        return this.e.remaining() + this.d.remaining();
    }

    @Override
    public void close() throws IOException {
    }

    @Override
    public synchronized void mark(int n2) {
        this.f = this.d.position();
        this.g = this.e.position();
        this.d.mark();
        this.e.mark();
    }

    @Override
    public synchronized void reset() throws IOException {
        if (this.f != -1) {
            if (this.d.position() != 0) {
                this.c.reset();
                this.d.rewind();
                this.e.rewind();
                this.e.limit(0);
                while (this.d.position() < this.f) {
                    this.e.rewind();
                    this.e.limit(0);
                    this.a();
                }
            }
            if (this.d.position() != this.f) {
                throw new IllegalStateException("Unexpected CharBuffer postion: actual=" + this.d.position() + " " + "expected=" + this.f);
            }
            this.e.position(this.g);
            this.f = -1;
            this.g = -1;
        }
    }

    @Override
    public boolean markSupported() {
        return true;
    }
}

