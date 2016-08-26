/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.e;

import com.growingio.e.a.a.a.o;
import com.growingio.e.a.a.a.u;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class k
extends Writer {
    private final Writer a;

    public k(String string, String string2) throws IOException {
        this(new File(string), string2, false);
    }

    public k(String string, String string2, boolean bl2) throws IOException {
        this(new File(string), string2, bl2);
    }

    public k(String string, Charset charset) throws IOException {
        this(new File(string), charset, false);
    }

    public k(String string, Charset charset, boolean bl2) throws IOException {
        this(new File(string), charset, bl2);
    }

    public k(String string, CharsetEncoder charsetEncoder) throws IOException {
        this(new File(string), charsetEncoder, false);
    }

    public k(String string, CharsetEncoder charsetEncoder, boolean bl2) throws IOException {
        this(new File(string), charsetEncoder, bl2);
    }

    public k(File file, String string) throws IOException {
        this(file, string, false);
    }

    public k(File file, String string, boolean bl2) throws IOException {
        this.a = k.a(file, string, bl2);
    }

    public k(File file, Charset charset) throws IOException {
        this(file, charset, false);
    }

    public k(File file, Charset charset, boolean bl2) throws IOException {
        this.a = k.a(file, charset, bl2);
    }

    public k(File file, CharsetEncoder charsetEncoder) throws IOException {
        this(file, charsetEncoder, false);
    }

    public k(File file, CharsetEncoder charsetEncoder, boolean bl2) throws IOException {
        this.a = k.a(file, charsetEncoder, bl2);
    }

    private static Writer a(File file, Object object, boolean bl2) throws IOException {
        if (file == null) {
            throw new NullPointerException("File is missing");
        }
        if (object == null) {
            throw new NullPointerException("Encoding is missing");
        }
        boolean bl3 = file.exists();
        FileOutputStream fileOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            fileOutputStream = new FileOutputStream(file, bl2);
            outputStreamWriter = object instanceof Charset ? new OutputStreamWriter((OutputStream)fileOutputStream, (Charset)object) : (object instanceof CharsetEncoder ? new OutputStreamWriter((OutputStream)fileOutputStream, (CharsetEncoder)object) : new OutputStreamWriter((OutputStream)fileOutputStream, (String)object));
        }
        catch (IOException var6_6) {
            u.a(outputStreamWriter);
            u.a(fileOutputStream);
            if (!bl3) {
                o.e(file);
            }
            throw var6_6;
        }
        catch (RuntimeException var6_7) {
            u.a(outputStreamWriter);
            u.a(fileOutputStream);
            if (!bl3) {
                o.e(file);
            }
            throw var6_7;
        }
        return outputStreamWriter;
    }

    @Override
    public void write(int n2) throws IOException {
        this.a.write(n2);
    }

    @Override
    public void write(char[] arrc) throws IOException {
        this.a.write(arrc);
    }

    @Override
    public void write(char[] arrc, int n2, int n3) throws IOException {
        this.a.write(arrc, n2, n3);
    }

    @Override
    public void write(String string) throws IOException {
        this.a.write(string);
    }

    @Override
    public void write(String string, int n2, int n3) throws IOException {
        this.a.write(string, n2, n3);
    }

    @Override
    public void flush() throws IOException {
        this.a.flush();
    }

    @Override
    public void close() throws IOException {
        this.a.close();
    }
}

