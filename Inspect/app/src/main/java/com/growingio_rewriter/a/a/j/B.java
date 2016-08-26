/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.j.C;
import com.growingio.a.a.j.D;
import com.growingio.a.a.j.E;
import com.growingio.a.a.j.F;
import com.growingio.a.a.j.G;
import com.growingio.a.a.j.p;
import com.growingio.a.a.j.q;
import com.growingio.a.a.j.r;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;

public final class B {
    private static final int a = 524288;
    private static final OutputStream b = new C();

    static byte[] a() {
        return new byte[8192];
    }

    private B() {
    }

    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        int n2;
        aU.a(inputStream);
        aU.a(outputStream);
        byte[] arrby = B.a();
        long l2 = 0;
        while ((n2 = inputStream.read(arrby)) != -1) {
            outputStream.write(arrby, 0, n2);
            l2 += (long)n2;
        }
        return l2;
    }

    public static long a(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) throws IOException {
        aU.a(readableByteChannel);
        aU.a(writableByteChannel);
        if (readableByteChannel instanceof FileChannel) {
            long l2;
            long l3;
            FileChannel fileChannel = (FileChannel)readableByteChannel;
            long l4 = l3 = fileChannel.position();
            do {
                l2 = fileChannel.transferTo(l4, 524288, writableByteChannel);
                fileChannel.position(l4 += l2);
            } while (l2 > 0 || l4 < fileChannel.size());
            return l4 - l3;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(B.a());
        long l5 = 0;
        while (readableByteChannel.read(byteBuffer) != -1) {
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                l5 += (long)writableByteChannel.write(byteBuffer);
            }
            byteBuffer.clear();
        }
        return l5;
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(32, inputStream.available()));
        B.a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    static byte[] a(InputStream inputStream, int n2) throws IOException {
        int n3;
        int n4;
        byte[] arrby = new byte[n2];
        for (int i2 = n2; i2 > 0; i2 -= n3) {
            n4 = n2 - i2;
            n3 = inputStream.read(arrby, n4, i2);
            if (n3 != -1) continue;
            return Arrays.copyOf(arrby, n4);
        }
        n4 = inputStream.read();
        if (n4 == -1) {
            return arrby;
        }
        F f2 = new F(null);
        f2.write(n4);
        B.a(inputStream, f2);
        byte[] arrby2 = new byte[arrby.length + f2.size()];
        System.arraycopy(arrby, 0, arrby2, 0, arrby.length);
        f2.a(arrby2, arrby.length);
        return arrby2;
    }

    public static long b(InputStream inputStream) throws IOException {
        long l2;
        long l3 = 0;
        byte[] arrby = B.a();
        while ((l2 = (long)inputStream.read(arrby)) != -1) {
            l3 += l2;
        }
        return l3;
    }

    public static p a(byte[] arrby) {
        return B.a(new ByteArrayInputStream(arrby));
    }

    public static p a(byte[] arrby, int n2) {
        aU.b(n2, arrby.length);
        return B.a(new ByteArrayInputStream(arrby, n2, arrby.length - n2));
    }

    public static p a(ByteArrayInputStream byteArrayInputStream) {
        return new D(aU.a(byteArrayInputStream));
    }

    public static q b() {
        return B.a(new ByteArrayOutputStream());
    }

    public static q a(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException(String.format("Invalid size: %s", n2));
        }
        return B.a(new ByteArrayOutputStream(n2));
    }

    public static q a(ByteArrayOutputStream byteArrayOutputStream) {
        return new E(aU.a(byteArrayOutputStream));
    }

    public static OutputStream c() {
        return b;
    }

    public static InputStream a(InputStream inputStream, long l2) {
        return new G(inputStream, l2);
    }

    public static void a(InputStream inputStream, byte[] arrby) throws IOException {
        B.a(inputStream, arrby, 0, arrby.length);
    }

    public static void a(InputStream inputStream, byte[] arrby, int n2, int n3) throws IOException {
        int n4 = B.b(inputStream, arrby, n2, n3);
        if (n4 != n3) {
            throw new EOFException("reached end of stream after reading " + n4 + " bytes; " + n3 + " bytes expected");
        }
    }

    public static void b(InputStream inputStream, long l2) throws IOException {
        long l3 = B.c(inputStream, l2);
        if (l3 < l2) {
            throw new EOFException("reached end of stream after skipping " + l3 + " bytes; " + l2 + " bytes expected");
        }
    }

    static long c(InputStream inputStream, long l2) throws IOException {
        long l3;
        int n2;
        long l4;
        long l5;
        byte[] arrby = B.a();
        for (l5 = 0; l5 < l2 && ((l3 = B.d(inputStream, l4 = l2 - l5)) != 0 || (l3 = (long)inputStream.read(arrby, 0, n2 = (int)Math.min(l4, (long)arrby.length))) != -1); l5 += l3) {
        }
        return l5;
    }

    private static long d(InputStream inputStream, long l2) throws IOException {
        int n2 = inputStream.available();
        return n2 == 0 ? 0 : inputStream.skip(Math.min((long)n2, l2));
    }

    public static <T> T a(InputStream inputStream, r<T> r2) throws IOException {
        int n2;
        aU.a(inputStream);
        aU.a(r2);
        byte[] arrby = B.a();
        while ((n2 = inputStream.read(arrby)) != -1 && r2.a(arrby, 0, n2)) {
        }
        return r2.a();
    }

    public static int b(InputStream inputStream, byte[] arrby, int n2, int n3) throws IOException {
        int n4;
        int n5;
        aU.a(inputStream);
        aU.a(arrby);
        if (n3 < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        for (n5 = 0; n5 < n3 && (n4 = inputStream.read(arrby, n2 + n5, n3 - n5)) != -1; n5 += n4) {
        }
        return n5;
    }
}

