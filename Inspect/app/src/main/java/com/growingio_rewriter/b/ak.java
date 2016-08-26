/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.e;
import com.growingio.b.i;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ak
implements e {
    protected String a;
    protected int b;
    protected String c;
    protected String d;

    public ak(String string, int n2, String string2, String string3) {
        this.a = string;
        this.b = n2;
        this.c = string2;
        this.d = string3;
    }

    public String toString() {
        return this.a + ":" + this.b + this.c;
    }

    @Override
    public InputStream a(String string) {
        try {
            URLConnection uRLConnection = this.c(string);
            if (uRLConnection != null) {
                return uRLConnection.getInputStream();
            }
        }
        catch (IOException var2_3) {
            // empty catch block
        }
        return null;
    }

    private URLConnection c(String string) throws IOException {
        if (this.d == null || string.startsWith(this.d)) {
            String string2 = this.c + string.replace('.', '/') + ".class";
            return ak.a(this.a, this.b, string2);
        }
        return null;
    }

    @Override
    public URL b(String string) {
        try {
            URLConnection uRLConnection = this.c(string);
            InputStream inputStream = uRLConnection.getInputStream();
            if (inputStream != null) {
                inputStream.close();
                return uRLConnection.getURL();
            }
        }
        catch (IOException var2_3) {
            // empty catch block
        }
        return null;
    }

    @Override
    public void a() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] a(String string, int n2, String string2, String string3) throws IOException {
        byte[] arrby;
        URLConnection uRLConnection = ak.a(string, n2, string2 + string3.replace('.', '/') + ".class");
        int n3 = uRLConnection.getContentLength();
        InputStream inputStream = uRLConnection.getInputStream();
        try {
            if (n3 <= 0) {
                arrby = i.a(inputStream);
            } else {
                int n4;
                arrby = new byte[n3];
                int n5 = 0;
                do {
                    if ((n4 = inputStream.read(arrby, n5, n3 - n5)) >= 0) continue;
                    throw new IOException("the stream was closed: " + string3);
                } while ((n5 += n4) < n3);
            }
        }
        finally {
            inputStream.close();
        }
        return arrby;
    }

    private static URLConnection a(String string, int n2, String string2) throws IOException {
        URL uRL;
        try {
            uRL = new URL("http", string, n2, string2);
        }
        catch (MalformedURLException var4_4) {
            throw new IOException("invalid URL?");
        }
        URLConnection uRLConnection = uRL.openConnection();
        uRLConnection.connect();
        return uRLConnection;
    }
}

