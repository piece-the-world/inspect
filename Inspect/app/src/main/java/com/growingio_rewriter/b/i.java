/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.W;
import com.growingio.b.Y;
import com.growingio.b.Z;
import com.growingio.b.ae;
import com.growingio.b.b;
import com.growingio.b.c;
import com.growingio.b.e;
import com.growingio.b.f;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

final class i {
    protected f a = null;

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[class path: ");
        f f2 = this.a;
        while (f2 != null) {
            stringBuffer.append(f2.b.toString());
            stringBuffer.append(File.pathSeparatorChar);
            f2 = f2.a;
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    public synchronized e a(e e2) {
        this.a = new f(e2, this.a);
        return e2;
    }

    public synchronized e b(e e2) {
        f f2 = new f(e2, null);
        f f3 = this.a;
        if (f3 == null) {
            this.a = f2;
        } else {
            while (f3.a != null) {
                f3 = f3.a;
            }
            f3.a = f2;
        }
        return e2;
    }

    public synchronized void c(e e2) {
        f f2 = this.a;
        if (f2 != null) {
            if (f2.b == e2) {
                this.a = f2.a;
            } else {
                while (f2.a != null) {
                    if (f2.a.b == e2) {
                        f2.a = f2.a.a;
                        continue;
                    }
                    f2 = f2.a;
                }
            }
        }
        e2.a();
    }

    public e a() {
        return this.b(new c());
    }

    public e a(String string) throws ae {
        return this.a(i.e(string));
    }

    public e b(String string) throws ae {
        return this.b(i.e(string));
    }

    private static e e(String string) throws ae {
        String string2 = string.toLowerCase();
        if (string2.endsWith(".jar") || string2.endsWith(".zip")) {
            return new Y(string);
        }
        int n2 = string.length();
        if (n2 > 2 && string.charAt(n2 - 1) == '*' && (string.charAt(n2 - 2) == '/' || string.charAt(n2 - 2) == File.separatorChar)) {
            String string3 = string.substring(0, n2 - 2);
            return new Z(string3);
        }
        return new W(string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(String string, OutputStream outputStream) throws ae, IOException, b {
        InputStream inputStream = this.c(string);
        if (inputStream == null) {
            throw new ae(string);
        }
        try {
            i.a(inputStream, outputStream);
        }
        finally {
            inputStream.close();
        }
    }

    InputStream c(String string) throws ae {
        f f2 = this.a;
        InputStream inputStream = null;
        ae ae2 = null;
        while (f2 != null) {
            block5 : {
                try {
                    inputStream = f2.b.a(string);
                }
                catch (ae var5_5) {
                    if (ae2 != null) break block5;
                    ae2 = var5_5;
                }
            }
            if (inputStream == null) {
                f2 = f2.a;
                continue;
            }
            return inputStream;
        }
        if (ae2 != null) {
            throw ae2;
        }
        return null;
    }

    public URL d(String string) {
        f f2 = this.a;
        URL uRL = null;
        while (f2 != null) {
            uRL = f2.b.b(string);
            if (uRL == null) {
                f2 = f2.a;
                continue;
            }
            return uRL;
        }
        return null;
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        byte[][] arrarrby = new byte[8][];
        int n2 = 4096;
        for (int i2 = 0; i2 < 8; ++i2) {
            arrarrby[i2] = new byte[n2];
            int n3 = 0;
            int n4 = 0;
            do {
                if ((n4 = inputStream.read(arrarrby[i2], n3, n2 - n3)) >= 0) continue;
                byte[] arrby = new byte[n2 - 4096 + n3];
                int n5 = 0;
                for (int i3 = 0; i3 < i2; ++i3) {
                    System.arraycopy(arrarrby[i3], 0, arrby, n5, n5 + 4096);
                    n5 = n5 + n5 + 4096;
                }
                System.arraycopy(arrarrby[i2], 0, arrby, n5, n3);
                return arrby;
            } while ((n3 += n4) < n2);
            n2 *= 2;
        }
        throw new IOException("too much data");
    }

    public static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        int n2 = 4096;
        byte[] arrby = null;
        for (int i2 = 0; i2 < 64; ++i2) {
            if (i2 < 8) {
                arrby = new byte[n2 *= 2];
            }
            int n3 = 0;
            int n4 = 0;
            do {
                if ((n4 = inputStream.read(arrby, n3, n2 - n3)) >= 0) continue;
                outputStream.write(arrby, 0, n3);
                return;
            } while ((n3 += n4) < n2);
            outputStream.write(arrby);
        }
        throw new IOException("too much data");
    }
}

