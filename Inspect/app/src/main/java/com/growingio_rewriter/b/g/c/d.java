/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.g.c;

import com.growingio.b.ae;
import com.growingio.b.aj;
import com.growingio.b.g;
import com.growingio.b.g.c.a;
import com.growingio.b.g.c.b;
import com.growingio.b.o;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class d {
    private ServerSocket d;
    private g e;
    protected aj a;
    private static final byte[] f = new byte[]{13, 10};
    private static final int g = 1;
    private static final int h = 2;
    private static final int i = 3;
    private static final int j = 4;
    private static final int k = 5;
    public String b = null;
    public String c = null;

    public static void a(String[] arrstring) throws IOException {
        if (arrstring.length == 1) {
            d d2 = new d(arrstring[0]);
            d2.a();
        } else {
            System.err.println("Usage: java Webserver <port number>");
        }
    }

    public d(String string) throws IOException {
        this(Integer.parseInt(string));
    }

    public d(int n2) throws IOException {
        this.d = new ServerSocket(n2);
        this.e = null;
        this.a = null;
    }

    public void a(g g2) {
        this.e = g2;
    }

    public void a(g g2, aj aj2) throws ae, com.growingio.b.b {
        this.e = g2;
        this.a = aj2;
        aj2.a(this.e);
    }

    public void b() throws IOException {
        this.d.close();
    }

    public void a(String string) {
        System.out.println(string);
    }

    public void a(String string, String string2) {
        System.out.print(string);
        System.out.print(" ");
        System.out.println(string2);
    }

    public void a(String string, String string2, String string3) {
        System.out.print(string);
        System.out.print(" ");
        System.out.print(string2);
        System.out.print(" ");
        System.out.println(string3);
    }

    public void b(String string) {
        System.out.print("    ");
        System.out.println(string);
    }

    public void a() {
        System.err.println("ready to service...");
        do {
            try {
                do {
                    b b2 = new b(this, this.d.accept());
                    b2.start();
                } while (true);
            }
            catch (IOException var1_2) {
                this.a(var1_2.toString());
                continue;
            }
            break;
        } while (true);
    }

    final void a(Socket socket) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        String string = this.a(bufferedInputStream);
        this.a(socket.getInetAddress().getHostName(), new Date().toString(), string);
        while (this.b(bufferedInputStream) > 0) {
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        try {
            this.a(bufferedInputStream, bufferedOutputStream, string);
        }
        catch (a var5_5) {
            this.a(bufferedOutputStream, var5_5);
        }
        bufferedOutputStream.flush();
        bufferedInputStream.close();
        bufferedOutputStream.close();
        socket.close();
    }

    private String a(InputStream inputStream) throws IOException {
        int n2;
        StringBuffer stringBuffer = new StringBuffer();
        while ((n2 = inputStream.read()) >= 0 && n2 != 13) {
            stringBuffer.append((char)n2);
        }
        inputStream.read();
        return stringBuffer.toString();
    }

    private int b(InputStream inputStream) throws IOException {
        int n2;
        int n3 = 0;
        while ((n2 = inputStream.read()) >= 0 && n2 != 13) {
            ++n3;
        }
        inputStream.read();
        return n3;
    }

    public void a(InputStream inputStream, OutputStream outputStream, String string) throws IOException, a {
        InputStream inputStream2;
        File file;
        String string2;
        if (!string.startsWith("GET /")) {
            throw new a();
        }
        String string3 = string2 = string.substring(5, string.indexOf(32, 5));
        int n2 = string3.endsWith(".class") ? 2 : (string3.endsWith(".html") || string3.endsWith(".htm") ? 1 : (string3.endsWith(".gif") ? 3 : (string3.endsWith(".jpg") ? 4 : 5)));
        int n3 = string3.length();
        if (n2 == 2 && this.a(outputStream, string3, n3)) {
            return;
        }
        this.a(string3, n3);
        if (this.c != null) {
            string3 = this.c + string3;
        }
        if (File.separatorChar != '/') {
            string3 = string3.replace('/', File.separatorChar);
        }
        if ((file = new File(string3)).canRead()) {
            this.a(outputStream, file.length(), n2);
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] arrby = new byte[4096];
            while ((n3 = fileInputStream.read(arrby)) > 0) {
                outputStream.write(arrby, 0, n3);
            }
            fileInputStream.close();
            return;
        }
        if (n2 == 2 && (inputStream2 = this.getClass().getResourceAsStream("/" + string2)) != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] arrby = new byte[4096];
            while ((n3 = inputStream2.read(arrby)) > 0) {
                byteArrayOutputStream.write(arrby, 0, n3);
            }
            byte[] arrby2 = byteArrayOutputStream.toByteArray();
            this.a(outputStream, arrby2.length, 2);
            outputStream.write(arrby2);
            inputStream2.close();
            return;
        }
        throw new a();
    }

    private void a(String string, int n2) throws a {
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = string.charAt(i2);
            if (Character.isJavaIdentifierPart(c2) || c2 == '.' || c2 == '/') continue;
            throw new a();
        }
        if (string.indexOf("..") >= 0) {
            throw new a();
        }
    }

    private boolean a(OutputStream outputStream, String string, int n2) throws IOException, a {
        byte[] arrby;
        if (this.e == null) {
            return false;
        }
        String string2 = string.substring(0, n2 - 6).replace('/', '.');
        try {
            if (this.a != null) {
                this.a.a(this.e, string2);
            }
            o o2 = this.e.f(string2);
            arrby = o2.T();
            if (this.b != null) {
                o2.j(this.b);
            }
        }
        catch (Exception var6_6) {
            throw new a(var6_6);
        }
        this.a(outputStream, arrby.length, 2);
        outputStream.write(arrby);
        return true;
    }

    private void a(OutputStream outputStream, long l2, int n2) throws IOException {
        outputStream.write("HTTP/1.0 200 OK".getBytes());
        outputStream.write(f);
        outputStream.write("Content-Length: ".getBytes());
        outputStream.write(Long.toString(l2).getBytes());
        outputStream.write(f);
        if (n2 == 2) {
            outputStream.write("Content-Type: application/octet-stream".getBytes());
        } else if (n2 == 1) {
            outputStream.write("Content-Type: text/html".getBytes());
        } else if (n2 == 3) {
            outputStream.write("Content-Type: image/gif".getBytes());
        } else if (n2 == 4) {
            outputStream.write("Content-Type: image/jpg".getBytes());
        } else if (n2 == 5) {
            outputStream.write("Content-Type: text/plain".getBytes());
        }
        outputStream.write(f);
        outputStream.write(f);
    }

    private void a(OutputStream outputStream, a a2) throws IOException {
        this.b("bad request: " + a2.toString());
        outputStream.write("HTTP/1.0 400 Bad Request".getBytes());
        outputStream.write(f);
        outputStream.write(f);
        outputStream.write("<H1>Bad Request</H1>".getBytes());
    }
}

