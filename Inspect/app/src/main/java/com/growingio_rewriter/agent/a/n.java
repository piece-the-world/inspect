/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.a;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class n {
    public static final int a = 8192;

    private n() {
    }

    public static int a(InputStream inputStream, OutputStream outputStream) throws IOException {
        return n.a(inputStream, outputStream, 8192, false);
    }

    public static int a(InputStream inputStream, OutputStream outputStream, boolean bl2) throws IOException {
        return n.a(inputStream, outputStream, 8192, bl2);
    }

    public static int a(InputStream inputStream, OutputStream outputStream, int n2) throws IOException {
        return n.a(inputStream, outputStream, n2, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int a(InputStream inputStream, OutputStream outputStream, int n2, boolean bl2) throws IOException {
        try {
            int n3;
            byte[] arrby = new byte[n2];
            int n4 = 0;
            while (-1 != (n3 = inputStream.read(arrby))) {
                outputStream.write(arrby, 0, n3);
                n4 += n3;
            }
            n3 = n4;
            return n3;
        }
        finally {
            if (bl2) {
                inputStream.close();
                outputStream.close();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] arrby;
            n.a(inputStream, byteArrayOutputStream);
            byteArrayOutputStream.flush();
            byte[] arrby2 = arrby = byteArrayOutputStream.toByteArray();
            return arrby2;
        }
        finally {
            byteArrayOutputStream.close();
        }
    }

    public static String a(InputStream inputStream, String string) throws IOException {
        return new String(n.a(inputStream), string);
    }

    public static void a(File file, byte[] arrby) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            n.a((InputStream)new ByteArrayInputStream(arrby), (OutputStream)fileOutputStream, true);
        }
        finally {
            fileOutputStream.close();
        }
    }
}

