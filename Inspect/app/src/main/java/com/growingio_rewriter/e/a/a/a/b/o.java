/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.b;

import com.growingio.e.a.a.a.b.a;
import com.growingio.e.a.a.a.u;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

public class o
extends a
implements Serializable {
    private static final long a = -547733176983104172L;
    private final byte[] b;
    private final long c;

    public o(byte[] arrby) {
        this(arrby, 0);
    }

    public o(String string) {
        this(string, 0);
    }

    public o(String string, long l2) {
        if (string == null) {
            throw new IllegalArgumentException("The magic number cannot be null");
        }
        if (string.isEmpty()) {
            throw new IllegalArgumentException("The magic number must contain at least one byte");
        }
        if (l2 < 0) {
            throw new IllegalArgumentException("The offset cannot be negative");
        }
        this.b = string.getBytes(Charset.defaultCharset());
        this.c = l2;
    }

    public o(byte[] arrby, long l2) {
        if (arrby == null) {
            throw new IllegalArgumentException("The magic number cannot be null");
        }
        if (arrby.length == 0) {
            throw new IllegalArgumentException("The magic number must contain at least one byte");
        }
        if (l2 < 0) {
            throw new IllegalArgumentException("The offset cannot be negative");
        }
        this.b = new byte[arrby.length];
        System.arraycopy(arrby, 0, this.b, 0, arrby.length);
        this.c = l2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean accept(File file) {
        if (file != null && file.isFile() && file.canRead()) {
            RandomAccessFile randomAccessFile = null;
            try {
                byte[] arrby = new byte[this.b.length];
                randomAccessFile = new RandomAccessFile(file, "r");
                randomAccessFile.seek(this.c);
                int n2 = randomAccessFile.read(arrby);
                if (n2 != this.b.length) {
                    boolean bl2 = false;
                    return bl2;
                }
                boolean bl3 = Arrays.equals(this.b, arrby);
                return bl3;
            }
            catch (IOException var3_4) {}
            finally {
                u.a((Closeable)randomAccessFile);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.append("(");
        stringBuilder.append(new String(this.b, Charset.defaultCharset()));
        stringBuilder.append(",");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

