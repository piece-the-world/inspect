/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.e;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

public class u
extends OutputStream {
    private static final int a = 1024;
    private final Writer b;
    private final CharsetDecoder c;
    private final boolean d;
    private final ByteBuffer e = ByteBuffer.allocate(128);
    private final CharBuffer f;

    public u(Writer writer, CharsetDecoder charsetDecoder) {
        this(writer, charsetDecoder, 1024, false);
    }

    public u(Writer writer, CharsetDecoder charsetDecoder, int n2, boolean bl2) {
        u.a(charsetDecoder.charset());
        this.b = writer;
        this.c = charsetDecoder;
        this.d = bl2;
        this.f = CharBuffer.allocate(n2);
    }

    public u(Writer writer, Charset charset, int n2, boolean bl2) {
        this(writer, charset.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).replaceWith("?"), n2, bl2);
    }

    public u(Writer writer, Charset charset) {
        this(writer, charset, 1024, false);
    }

    public u(Writer writer, String string, int n2, boolean bl2) {
        this(writer, Charset.forName(string), n2, bl2);
    }

    public u(Writer writer, String string) {
        this(writer, string, 1024, false);
    }

    public u(Writer writer) {
        this(writer, Charset.defaultCharset(), 1024, false);
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) throws IOException {
        while (n3 > 0) {
            int n4 = Math.min(n3, this.e.remaining());
            this.e.put(arrby, n2, n4);
            this.a(false);
            n3 -= n4;
            n2 += n4;
        }
        if (this.d) {
            this.a();
        }
    }

    @Override
    public void write(byte[] arrby) throws IOException {
        this.write(arrby, 0, arrby.length);
    }

    @Override
    public void write(int n2) throws IOException {
        this.write(new byte[]{(byte)n2}, 0, 1);
    }

    @Override
    public void flush() throws IOException {
        this.a();
        this.b.flush();
    }

    @Override
    public void close() throws IOException {
        this.a(true);
        this.a();
        this.b.close();
    }

    private void a(boolean bl2) throws IOException {
        CoderResult coderResult;
        this.e.flip();
        while ((coderResult = this.c.decode(this.e, this.f, bl2)).isOverflow()) {
            this.a();
        }
        if (!coderResult.isUnderflow()) {
            throw new IOException("Unexpected coder result");
        }
        this.e.compact();
    }

    private void a() throws IOException {
        if (this.f.position() > 0) {
            this.b.write(this.f.array(), 0, this.f.position());
            this.f.rewind();
        }
    }

    private static void a(Charset charset) {
        if (!"UTF-16".equals(charset.name())) {
            return;
        }
        String string = "v\u00e9s";
        byte[] arrby = "v\u00e9s".getBytes(charset);
        CharsetDecoder charsetDecoder = charset.newDecoder();
        ByteBuffer byteBuffer = ByteBuffer.allocate(16);
        CharBuffer charBuffer = CharBuffer.allocate("v\u00e9s".length());
        int n2 = arrby.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            byteBuffer.put(arrby[i2]);
            byteBuffer.flip();
            try {
                charsetDecoder.decode(byteBuffer, charBuffer, i2 == n2 - 1);
            }
            catch (IllegalArgumentException var8_8) {
                throw new UnsupportedOperationException("UTF-16 requested when runninng on an IBM JDK with broken UTF-16 support. Please find a JDK that supports UTF-16 if you intend to use UF-16 with WriterOutputStream");
            }
            byteBuffer.compact();
        }
        charBuffer.rewind();
        if (!"v\u00e9s".equals(charBuffer.toString())) {
            throw new UnsupportedOperationException("UTF-16 requested when runninng on an IBM JDK with broken UTF-16 support. Please find a JDK that supports UTF-16 if you intend to use UF-16 with WriterOutputStream");
        }
    }
}

