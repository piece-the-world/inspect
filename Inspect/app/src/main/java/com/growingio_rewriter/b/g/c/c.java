/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.g.c;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;

public class c
extends ClassLoader {
    private String a;
    private int b;

    public static void a(String[] arrstring) throws Throwable {
        if (arrstring.length >= 3) {
            c c2 = new c(arrstring[0], Integer.parseInt(arrstring[1]));
            String[] arrstring2 = new String[arrstring.length - 3];
            System.arraycopy(arrstring, 3, arrstring2, 0, arrstring.length - 3);
            c2.a(arrstring[2], arrstring2);
        } else {
            System.err.println("Usage: java Viewer <host> <port> class [args ...]");
        }
    }

    public c(String string, int n2) {
        this.a = string;
        this.b = n2;
    }

    public String a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public void a(String string, String[] arrstring) throws Throwable {
        Class class_ = this.loadClass(string);
        try {
            class_.getDeclaredMethod("main", String[].class).invoke(null, arrstring);
        }
        catch (InvocationTargetException var4_4) {
            throw var4_4.getTargetException();
        }
    }

    protected synchronized Class loadClass(String string, boolean bl2) throws ClassNotFoundException {
        Class class_ = this.findLoadedClass(string);
        if (class_ == null) {
            class_ = this.findClass(string);
        }
        if (class_ == null) {
            throw new ClassNotFoundException(string);
        }
        if (bl2) {
            this.resolveClass(class_);
        }
        return class_;
    }

    protected Class findClass(String string) throws ClassNotFoundException {
        Class class_ = null;
        if (string.startsWith("java.") || string.startsWith("javax.") || string.equals("Viewer")) {
            class_ = this.findSystemClass(string);
        }
        if (class_ == null) {
            try {
                byte[] arrby = this.a(string);
                if (arrby != null) {
                    class_ = this.defineClass(string, arrby, 0, arrby.length);
                }
            }
            catch (Exception var3_4) {
                // empty catch block
            }
        }
        return class_;
    }

    protected byte[] a(String string) throws Exception {
        byte[] arrby;
        URL uRL = new URL("http", this.a, this.b, "/" + string.replace('.', '/') + ".class");
        URLConnection uRLConnection = uRL.openConnection();
        uRLConnection.connect();
        int n2 = uRLConnection.getContentLength();
        InputStream inputStream = uRLConnection.getInputStream();
        if (n2 <= 0) {
            arrby = this.a(inputStream);
        } else {
            int n3;
            arrby = new byte[n2];
            int n4 = 0;
            do {
                if ((n3 = inputStream.read(arrby, n4, n2 - n4)) >= 0) continue;
                inputStream.close();
                throw new IOException("the stream was closed: " + string);
            } while ((n4 += n3) < n2);
        }
        inputStream.close();
        return arrby;
    }

    private byte[] a(InputStream inputStream) throws IOException {
        byte[] arrby;
        byte[] arrby2 = new byte[4096];
        int n2 = 0;
        int n3 = 0;
        do {
            if (arrby2.length - (n2 += n3) > 0) continue;
            arrby = new byte[arrby2.length * 2];
            System.arraycopy(arrby2, 0, arrby, 0, n2);
            arrby2 = arrby;
        } while ((n3 = inputStream.read(arrby2, n2, arrby2.length - n2)) >= 0);
        arrby = new byte[n2];
        System.arraycopy(arrby2, 0, arrby, 0, n2);
        return arrby;
    }
}

