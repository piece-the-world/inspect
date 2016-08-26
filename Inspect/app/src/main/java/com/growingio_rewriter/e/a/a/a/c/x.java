/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.c;

import com.growingio.e.a.a.a.c.y;
import com.growingio.e.a.a.a.c.z;
import com.growingio.e.a.a.a.o;
import com.growingio.e.a.a.a.u;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

public class x
implements Runnable {
    private static final int a = 1000;
    private static final String b = "r";
    private static final int c = 4096;
    private static final Charset d = Charset.defaultCharset();
    private final byte[] e;
    private final File f;
    private final Charset g;
    private final long h;
    private final boolean i;
    private final y j;
    private final boolean k;
    private volatile boolean l = true;

    public x(File file, y y2) {
        this(file, y2, 1000);
    }

    public x(File file, y y2, long l2) {
        this(file, y2, l2, false);
    }

    public x(File file, y y2, long l2, boolean bl2) {
        this(file, y2, l2, bl2, 4096);
    }

    public x(File file, y y2, long l2, boolean bl2, boolean bl3) {
        this(file, y2, l2, bl2, bl3, 4096);
    }

    public x(File file, y y2, long l2, boolean bl2, int n2) {
        this(file, y2, l2, bl2, false, n2);
    }

    public x(File file, y y2, long l2, boolean bl2, boolean bl3, int n2) {
        this(file, d, y2, l2, bl2, bl3, n2);
    }

    public x(File file, Charset charset, y y2, long l2, boolean bl2, boolean bl3, int n2) {
        this.f = file;
        this.h = l2;
        this.i = bl2;
        this.e = new byte[n2];
        this.j = y2;
        y2.a(this);
        this.k = bl3;
        this.g = charset;
    }

    public static x a(File file, y y2, long l2, boolean bl2, int n2) {
        return x.a(file, y2, l2, bl2, false, n2);
    }

    public static x a(File file, y y2, long l2, boolean bl2, boolean bl3, int n2) {
        return x.a(file, d, y2, l2, bl2, bl3, n2);
    }

    public static x a(File file, Charset charset, y y2, long l2, boolean bl2, boolean bl3, int n2) {
        x x2 = new x(file, charset, y2, l2, bl2, bl3, n2);
        Thread thread = new Thread(x2);
        thread.setDaemon(true);
        thread.start();
        return x2;
    }

    public static x a(File file, y y2, long l2, boolean bl2) {
        return x.a(file, y2, l2, bl2, 4096);
    }

    public static x a(File file, y y2, long l2, boolean bl2, boolean bl3) {
        return x.a(file, y2, l2, bl2, bl3, 4096);
    }

    public static x a(File file, y y2, long l2) {
        return x.a(file, y2, l2, false);
    }

    public static x a(File file, y y2) {
        return x.a(file, y2, 1000, false);
    }

    public File a() {
        return this.f;
    }

    protected boolean b() {
        return this.l;
    }

    public long c() {
        return this.h;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        RandomAccessFile randomAccessFile = null;
        try {
            long l2 = 0;
            long l3 = 0;
            while (this.b() && randomAccessFile == null) {
                try {
                    randomAccessFile = new RandomAccessFile(this.f, "r");
                }
                catch (FileNotFoundException var6_6) {
                    this.j.a();
                }
                if (randomAccessFile == null) {
                    Thread.sleep(this.h);
                    continue;
                }
                l3 = this.i ? this.f.length() : 0;
                l2 = this.f.lastModified();
                randomAccessFile.seek(l3);
            }
            while (this.b()) {
                boolean bl2 = o.a(this.f, l2);
                long l4 = this.f.length();
                if (l4 < l3) {
                    this.j.b();
                    try {
                        RandomAccessFile randomAccessFile2 = randomAccessFile;
                        randomAccessFile = new RandomAccessFile(this.f, "r");
                        try {
                            this.a(randomAccessFile2);
                        }
                        catch (IOException var10_11) {
                            this.j.a(var10_11);
                        }
                        l3 = 0;
                        u.a((Closeable)randomAccessFile2);
                    }
                    catch (FileNotFoundException var9_10) {
                        this.j.a();
                    }
                    continue;
                }
                if (l4 > l3) {
                    l3 = this.a(randomAccessFile);
                    l2 = this.f.lastModified();
                } else if (bl2) {
                    l3 = 0;
                    randomAccessFile.seek(l3);
                    l3 = this.a(randomAccessFile);
                    l2 = this.f.lastModified();
                }
                if (this.k) {
                    u.a((Closeable)randomAccessFile);
                }
                Thread.sleep(this.h);
                if (!this.b() || !this.k) continue;
                randomAccessFile = new RandomAccessFile(this.f, "r");
                randomAccessFile.seek(l3);
            }
        }
        catch (InterruptedException var2_3) {
            Thread.currentThread().interrupt();
            this.a(var2_3);
        }
        catch (Exception var2_4) {
            this.a(var2_4);
        }
        finally {
            u.a((Closeable)randomAccessFile);
        }
    }

    private void a(Exception exception) {
        this.j.a(exception);
        this.d();
    }

    public void d() {
        this.l = false;
    }

    private long a(RandomAccessFile randomAccessFile) throws IOException {
        long l2;
        int n2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
        long l3 = l2 = randomAccessFile.getFilePointer();
        boolean bl2 = false;
        while (this.b() && (n2 = randomAccessFile.read(this.e)) != -1) {
            block5 : for (int i2 = 0; i2 < n2; ++i2) {
                byte by2 = this.e[i2];
                switch (by2) {
                    case 10: {
                        bl2 = false;
                        this.j.a(new String(byteArrayOutputStream.toByteArray(), this.g));
                        byteArrayOutputStream.reset();
                        l3 = l2 + (long)i2 + 1;
                        continue block5;
                    }
                    case 13: {
                        if (bl2) {
                            byteArrayOutputStream.write(13);
                        }
                        bl2 = true;
                        continue block5;
                    }
                    default: {
                        if (bl2) {
                            bl2 = false;
                            this.j.a(new String(byteArrayOutputStream.toByteArray(), this.g));
                            byteArrayOutputStream.reset();
                            l3 = l2 + (long)i2 + 1;
                        }
                        byteArrayOutputStream.write(by2);
                    }
                }
            }
            l2 = randomAccessFile.getFilePointer();
        }
        u.a(byteArrayOutputStream);
        randomAccessFile.seek(l3);
        if (this.j instanceof z) {
            ((z)this.j).c();
        }
        return l3;
    }
}

