/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.c;

import com.growingio.e.a.a.a.b;
import com.growingio.e.a.a.a.c.t;
import com.growingio.e.a.a.a.c.u;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class s
implements Closeable {
    private final int a;
    private final Charset b;
    private final RandomAccessFile c;
    private final long d;
    private final long e;
    private final byte[][] f;
    private final int g;
    private final int h;
    private u i;
    private boolean j = false;

    public s(File file) throws IOException {
        this(file, 4096, Charset.defaultCharset());
    }

    public s(File file, Charset charset) throws IOException {
        this(file, 4096, charset);
    }

    public s(File file, int n2, Charset charset) throws IOException {
        this.a = n2;
        this.b = charset;
        Charset charset2 = b.a(charset);
        CharsetEncoder charsetEncoder = charset2.newEncoder();
        float f2 = charsetEncoder.maxBytesPerChar();
        if (f2 == 1.0f) {
            this.h = 1;
        } else if (charset2 == b.f) {
            this.h = 1;
        } else if (charset2 == Charset.forName("Shift_JIS") || charset2 == Charset.forName("windows-31j") || charset2 == Charset.forName("x-windows-949") || charset2 == Charset.forName("gbk") || charset2 == Charset.forName("x-windows-950")) {
            this.h = 1;
        } else if (charset2 == b.d || charset2 == b.e) {
            this.h = 2;
        } else {
            if (charset2 == b.c) {
                throw new UnsupportedEncodingException("For UTF-16, you need to specify the byte order (use UTF-16BE or UTF-16LE)");
            }
            throw new UnsupportedEncodingException("Encoding " + charset + " is not supported yet (feel free to " + "submit a patch)");
        }
        this.f = new byte[][]{"\r\n".getBytes(charset), "\n".getBytes(charset), "\r".getBytes(charset)};
        this.g = this.f[0].length;
        this.c = new RandomAccessFile(file, "r");
        this.d = this.c.length();
        int n3 = (int)(this.d % (long)n2);
        if (n3 > 0) {
            this.e = this.d / (long)n2 + 1;
        } else {
            this.e = this.d / (long)n2;
            if (this.d > 0) {
                n3 = n2;
            }
        }
        this.i = new u(this, this.e, n3, null, null);
    }

    public s(File file, int n2, String string) throws IOException {
        this(file, n2, b.a(string));
    }

    public String a() throws IOException {
        String string = u.a(this.i);
        while (string == null) {
            this.i = u.b(this.i);
            if (this.i == null) break;
            string = u.a(this.i);
        }
        if ("".equals(string) && !this.j) {
            this.j = true;
            string = this.a();
        }
        return string;
    }

    @Override
    public void close() throws IOException {
        this.c.close();
    }

    static /* synthetic */ int a(s s2) {
        return s2.a;
    }

    static /* synthetic */ RandomAccessFile b(s s2) {
        return s2.c;
    }

    static /* synthetic */ Charset c(s s2) {
        return s2.b;
    }

    static /* synthetic */ int d(s s2) {
        return s2.g;
    }

    static /* synthetic */ int e(s s2) {
        return s2.h;
    }

    static /* synthetic */ byte[][] f(s s2) {
        return s2.f;
    }
}

