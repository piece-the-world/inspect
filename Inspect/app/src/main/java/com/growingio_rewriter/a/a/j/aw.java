/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.m.G;
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
import java.util.Arrays;

final class aw
extends InputStream {
    private final Reader a;
    private final CharsetEncoder b;
    private final byte[] c = new byte[1];
    private CharBuffer d;
    private ByteBuffer e;
    private boolean f;
    private boolean g;
    private boolean h;

    aw(Reader reader, Charset charset, int n2) {
        this(reader, charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE), n2);
    }

    aw(Reader reader, CharsetEncoder charsetEncoder, int n2) {
        this.a = aU.a(reader);
        this.b = aU.a(charsetEncoder);
        aU.a(n2 > 0, "bufferSize must be positive: %s", n2);
        charsetEncoder.reset();
        this.d = CharBuffer.allocate(n2);
        this.d.flip();
        this.e = ByteBuffer.allocate(n2);
    }

    @Override
    public void close() throws IOException {
        this.a.close();
    }

    @Override
    public int read() throws IOException {
        return this.read(this.c) == 1 ? G.a(this.c[0]) : -1;
    }

    @Override
    public int read(byte[] arrby, int n2, int n3) throws IOException {
        CoderResult coderResult;
        aU.a(n2, n2 + n3, arrby.length);
        if (n3 == 0) {
            return 0;
        }
        int n4 = 0;
        boolean bl2 = this.f;
        block0 : do {
            if (this.g) {
                if ((n4 += this.a(arrby, n2 + n4, n3 - n4)) == n3 || this.h) {
                    return n4 > 0 ? n4 : -1;
                }
                this.g = false;
                this.e.clear();
            }
            do {
                if ((coderResult = this.h ? CoderResult.UNDERFLOW : (bl2 ? this.b.flush(this.e) : this.b.encode(this.d, this.e, this.f))).isOverflow()) {
                    this.a(true);
                    continue block0;
                }
                if (coderResult.isUnderflow()) {
                    if (bl2) {
                        this.h = true;
                        this.a(false);
                        continue block0;
                    }
                    if (this.f) {
                        bl2 = true;
                        continue;
                    }
                    this.a();
                    continue;
                }
                if (coderResult.isError()) break block0;
            } while (true);
            break;
        } while (true);
        coderResult.throwException();
        return 0;
    }

    private static CharBuffer a(CharBuffer charBuffer) {
        char[] arrc = Arrays.copyOf(charBuffer.array(), charBuffer.capacity() * 2);
        CharBuffer charBuffer2 = CharBuffer.wrap(arrc);
        charBuffer2.position(charBuffer.position());
        charBuffer2.limit(charBuffer.limit());
        return charBuffer2;
    }

    private void a() throws IOException {
        if (aw.a((Buffer)this.d) == 0) {
            if (this.d.position() > 0) {
                this.d.compact().flip();
            } else {
                this.d = aw.a(this.d);
            }
        }
        int n2 = this.d.limit();
        int n3 = this.a.read(this.d.array(), n2, aw.a((Buffer)this.d));
        if (n3 == -1) {
            this.f = true;
        } else {
            this.d.limit(n2 + n3);
        }
    }

    private static int a(Buffer buffer) {
        return buffer.capacity() - buffer.limit();
    }

    private void a(boolean bl2) {
        this.e.flip();
        if (bl2 && this.e.remaining() == 0) {
            this.e = ByteBuffer.allocate(this.e.capacity() * 2);
        } else {
            this.g = true;
        }
    }

    private int a(byte[] arrby, int n2, int n3) {
        int n4 = Math.min(n3, this.e.remaining());
        this.e.get(arrby, n2, n4);
        return n4;
    }
}

