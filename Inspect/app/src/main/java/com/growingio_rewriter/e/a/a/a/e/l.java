/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.e;

import com.growingio.e.a.a.a.b;
import com.growingio.e.a.a.a.o;
import com.growingio.e.a.a.a.u;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

public class l
extends Writer {
    private static final String a = ".lck";
    private final Writer b;
    private final File c;

    public l(String string) throws IOException {
        this(string, false, null);
    }

    public l(String string, boolean bl2) throws IOException {
        this(string, bl2, null);
    }

    public l(String string, boolean bl2, String string2) throws IOException {
        this(new File(string), bl2, string2);
    }

    public l(File file) throws IOException {
        this(file, false, null);
    }

    public l(File file, boolean bl2) throws IOException {
        this(file, bl2, null);
    }

    public l(File file, boolean bl2, String string) throws IOException {
        this(file, Charset.defaultCharset(), bl2, string);
    }

    public l(File file, Charset charset) throws IOException {
        this(file, charset, false, null);
    }

    public l(File file, String string) throws IOException {
        this(file, string, false, null);
    }

    public l(File file, Charset charset, boolean bl2, String string) throws IOException {
        file = file.getAbsoluteFile();
        if (file.getParentFile() != null) {
            o.m(file.getParentFile());
        }
        if (file.isDirectory()) {
            throw new IOException("File specified is a directory");
        }
        if (string == null) {
            string = System.getProperty("java.io.tmpdir");
        }
        File file2 = new File(string);
        o.m(file2);
        this.a(file2);
        this.c = new File(file2, file.getName() + ".lck");
        this.a();
        this.b = this.a(file, charset, bl2);
    }

    public l(File file, String string, boolean bl2, String string2) throws IOException {
        this(file, b.a(string), bl2, string2);
    }

    private void a(File file) throws IOException {
        if (!file.exists()) {
            throw new IOException("Could not find lockDir: " + file.getAbsolutePath());
        }
        if (!file.canWrite()) {
            throw new IOException("Could not write to lockDir: " + file.getAbsolutePath());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a() throws IOException {
        reference var1_1 = l.class;
        synchronized (l.class) {
            if (!this.c.createNewFile()) {
                throw new IOException("Can't write file, lock " + this.c.getAbsolutePath() + " exists");
            }
            this.c.deleteOnExit();
            // ** MonitorExit[var1_1] (shouldn't be in output)
            return;
        }
    }

    private Writer a(File file, Charset charset, boolean bl2) throws IOException {
        boolean bl3 = file.exists();
        FileOutputStream fileOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            fileOutputStream = new FileOutputStream(file.getAbsolutePath(), bl2);
            outputStreamWriter = new OutputStreamWriter((OutputStream)fileOutputStream, b.a(charset));
        }
        catch (IOException var7_7) {
            u.a(outputStreamWriter);
            u.a(fileOutputStream);
            o.e(this.c);
            if (!bl3) {
                o.e(file);
            }
            throw var7_7;
        }
        catch (RuntimeException var7_8) {
            u.a(outputStreamWriter);
            u.a(fileOutputStream);
            o.e(this.c);
            if (!bl3) {
                o.e(file);
            }
            throw var7_8;
        }
        return outputStreamWriter;
    }

    @Override
    public void close() throws IOException {
        try {
            this.b.close();
        }
        finally {
            this.c.delete();
        }
    }

    @Override
    public void write(int n2) throws IOException {
        this.b.write(n2);
    }

    @Override
    public void write(char[] arrc) throws IOException {
        this.b.write(arrc);
    }

    @Override
    public void write(char[] arrc, int n2, int n3) throws IOException {
        this.b.write(arrc, n2, n3);
    }

    @Override
    public void write(String string) throws IOException {
        this.b.write(string);
    }

    @Override
    public void write(String string, int n2, int n3) throws IOException {
        this.b.write(string, n2, n3);
    }

    @Override
    public void flush() throws IOException {
        this.b.flush();
    }
}

