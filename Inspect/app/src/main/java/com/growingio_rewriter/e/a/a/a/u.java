/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a;

import com.growingio.e.a.a.a.b;
import com.growingio.e.a.a.a.e.c;
import com.growingio.e.a.a.a.e.q;
import com.growingio.e.a.a.a.w;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.Selector;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class u {
    public static final int a = -1;
    public static final char b = '/';
    public static final char c = '\\';
    public static final char d = File.separatorChar;
    public static final String e = "\n";
    public static final String f = "\r\n";
    public static final String g;
    private static final int h = 4096;
    private static final int i = 2048;
    private static char[] j;
    private static byte[] k;

    public static void a(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection)uRLConnection).disconnect();
        }
    }

    public static void a(Reader reader) {
        u.a((Closeable)reader);
    }

    public static void a(Writer writer) {
        u.a((Closeable)writer);
    }

    public static void a(InputStream inputStream) {
        u.a((Closeable)inputStream);
    }

    public static void a(OutputStream outputStream) {
        u.a((Closeable)outputStream);
    }

    public static void a(Closeable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        }
        catch (IOException var1_1) {
            // empty catch block
        }
    }

    public static /* varargs */ void a(Closeable ... arrcloseable) {
        if (arrcloseable == null) {
            return;
        }
        for (Closeable closeable : arrcloseable) {
            u.a(closeable);
        }
    }

    public static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            }
            catch (IOException var1_1) {
                // empty catch block
            }
        }
    }

    public static void a(Selector selector) {
        if (selector != null) {
            try {
                selector.close();
            }
            catch (IOException var1_1) {
                // empty catch block
            }
        }
    }

    public static void a(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            }
            catch (IOException var1_1) {
                // empty catch block
            }
        }
    }

    public static InputStream b(InputStream inputStream) throws IOException {
        return c.b(inputStream);
    }

    public static InputStream a(InputStream inputStream, int n2) throws IOException {
        return c.a(inputStream, n2);
    }

    public static BufferedReader b(Reader reader) {
        return reader instanceof BufferedReader ? (BufferedReader)reader : new BufferedReader(reader);
    }

    public static BufferedReader a(Reader reader, int n2) {
        return reader instanceof BufferedReader ? (BufferedReader)reader : new BufferedReader(reader, n2);
    }

    public static BufferedReader c(Reader reader) {
        return reader instanceof BufferedReader ? (BufferedReader)reader : new BufferedReader(reader);
    }

    public static BufferedReader b(Reader reader, int n2) {
        return reader instanceof BufferedReader ? (BufferedReader)reader : new BufferedReader(reader, n2);
    }

    public static BufferedWriter b(Writer writer) {
        return writer instanceof BufferedWriter ? (BufferedWriter)writer : new BufferedWriter(writer);
    }

    public static BufferedWriter a(Writer writer, int n2) {
        return writer instanceof BufferedWriter ? (BufferedWriter)writer : new BufferedWriter(writer, n2);
    }

    public static BufferedOutputStream b(OutputStream outputStream) {
        if (outputStream == null) {
            throw new NullPointerException();
        }
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream)outputStream : new BufferedOutputStream(outputStream);
    }

    public static BufferedOutputStream a(OutputStream outputStream, int n2) {
        if (outputStream == null) {
            throw new NullPointerException();
        }
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream)outputStream : new BufferedOutputStream(outputStream, n2);
    }

    public static BufferedInputStream c(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException();
        }
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream)inputStream : new BufferedInputStream(inputStream);
    }

    public static BufferedInputStream b(InputStream inputStream, int n2) {
        if (inputStream == null) {
            throw new NullPointerException();
        }
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream)inputStream : new BufferedInputStream(inputStream, n2);
    }

    public static byte[] d(InputStream inputStream) throws IOException {
        c c2 = new c();
        u.a(inputStream, (OutputStream)c2);
        return c2.d();
    }

    public static byte[] a(InputStream inputStream, long l2) throws IOException {
        if (l2 > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Size cannot be greater than Integer max value: " + l2);
        }
        return u.c(inputStream, (int)l2);
    }

    public static byte[] c(InputStream inputStream, int n2) throws IOException {
        int n3;
        int n4;
        if (n2 < 0) {
            throw new IllegalArgumentException("Size must be equal or greater than zero: " + n2);
        }
        if (n2 == 0) {
            return new byte[0];
        }
        byte[] arrby = new byte[n2];
        for (n4 = 0; n4 < n2 && (n3 = inputStream.read(arrby, n4, n2 - n4)) != -1; n4 += n3) {
        }
        if (n4 != n2) {
            throw new IOException("Unexpected readed size. current: " + n4 + ", excepted: " + n2);
        }
        return arrby;
    }

    public static byte[] d(Reader reader) throws IOException {
        return u.a(reader, Charset.defaultCharset());
    }

    public static byte[] a(Reader reader, Charset charset) throws IOException {
        c c2 = new c();
        u.a(reader, (OutputStream)c2, charset);
        return c2.d();
    }

    public static byte[] a(Reader reader, String string) throws IOException {
        return u.a(reader, b.a(string));
    }

    public static byte[] a(String string) throws IOException {
        return string.getBytes(Charset.defaultCharset());
    }

    public static byte[] a(URI uRI) throws IOException {
        return u.a(uRI.toURL());
    }

    public static byte[] a(URL uRL) throws IOException {
        URLConnection uRLConnection = uRL.openConnection();
        try {
            byte[] arrby = u.b(uRLConnection);
            return arrby;
        }
        finally {
            u.a(uRLConnection);
        }
    }

    public static byte[] b(URLConnection uRLConnection) throws IOException {
        InputStream inputStream = uRLConnection.getInputStream();
        try {
            byte[] arrby = u.d(inputStream);
            return arrby;
        }
        finally {
            inputStream.close();
        }
    }

    public static char[] e(InputStream inputStream) throws IOException {
        return u.a(inputStream, Charset.defaultCharset());
    }

    public static char[] a(InputStream inputStream, Charset charset) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        u.a(inputStream, (Writer)charArrayWriter, charset);
        return charArrayWriter.toCharArray();
    }

    public static char[] a(InputStream inputStream, String string) throws IOException {
        return u.a(inputStream, b.a(string));
    }

    public static char[] e(Reader reader) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        u.a(reader, (Writer)charArrayWriter);
        return charArrayWriter.toCharArray();
    }

    public static String f(InputStream inputStream) throws IOException {
        return u.b(inputStream, Charset.defaultCharset());
    }

    public static String b(InputStream inputStream, Charset charset) throws IOException {
        q q2 = new q();
        u.a(inputStream, (Writer)q2, charset);
        return q2.toString();
    }

    public static String b(InputStream inputStream, String string) throws IOException {
        return u.b(inputStream, b.a(string));
    }

    public static String f(Reader reader) throws IOException {
        q q2 = new q();
        u.a(reader, (Writer)q2);
        return q2.toString();
    }

    public static String b(URI uRI) throws IOException {
        return u.a(uRI, Charset.defaultCharset());
    }

    public static String a(URI uRI, Charset charset) throws IOException {
        return u.a(uRI.toURL(), b.a(charset));
    }

    public static String a(URI uRI, String string) throws IOException {
        return u.a(uRI, b.a(string));
    }

    public static String b(URL uRL) throws IOException {
        return u.a(uRL, Charset.defaultCharset());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String a(URL uRL, Charset charset) throws IOException {
        InputStream inputStream = uRL.openStream();
        try {
            String string = u.b(inputStream, charset);
            return string;
        }
        finally {
            inputStream.close();
        }
    }

    public static String a(URL uRL, String string) throws IOException {
        return u.a(uRL, b.a(string));
    }

    public static String a(byte[] arrby) throws IOException {
        return new String(arrby, Charset.defaultCharset());
    }

    public static String a(byte[] arrby, String string) throws IOException {
        return new String(arrby, b.a(string));
    }

    public static List<String> g(InputStream inputStream) throws IOException {
        return u.c(inputStream, Charset.defaultCharset());
    }

    public static List<String> c(InputStream inputStream, Charset charset) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, b.a(charset));
        return u.g(inputStreamReader);
    }

    public static List<String> c(InputStream inputStream, String string) throws IOException {
        return u.c(inputStream, b.a(string));
    }

    public static List<String> g(Reader reader) throws IOException {
        BufferedReader bufferedReader = u.b(reader);
        ArrayList<String> arrayList = new ArrayList<String>();
        String string = bufferedReader.readLine();
        while (string != null) {
            arrayList.add(string);
            string = bufferedReader.readLine();
        }
        return arrayList;
    }

    public static w h(Reader reader) {
        return new w(reader);
    }

    public static w d(InputStream inputStream, Charset charset) throws IOException {
        return new w(new InputStreamReader(inputStream, b.a(charset)));
    }

    public static w d(InputStream inputStream, String string) throws IOException {
        return u.d(inputStream, b.a(string));
    }

    public static InputStream a(CharSequence charSequence) {
        return u.a(charSequence, Charset.defaultCharset());
    }

    public static InputStream a(CharSequence charSequence, Charset charset) {
        return u.a(charSequence.toString(), charset);
    }

    public static InputStream a(CharSequence charSequence, String string) throws IOException {
        return u.a(charSequence, b.a(string));
    }

    public static InputStream b(String string) {
        return u.a(string, Charset.defaultCharset());
    }

    public static InputStream a(String string, Charset charset) {
        return new ByteArrayInputStream(string.getBytes(b.a(charset)));
    }

    public static InputStream a(String string, String string2) throws IOException {
        byte[] arrby = string.getBytes(b.a(string2));
        return new ByteArrayInputStream(arrby);
    }

    public static void a(byte[] arrby, OutputStream outputStream) throws IOException {
        if (arrby != null) {
            outputStream.write(arrby);
        }
    }

    public static void b(byte[] arrby, OutputStream outputStream) throws IOException {
        if (arrby != null) {
            int n2 = arrby.length;
            int n3 = 0;
            while (n2 > 0) {
                int n4 = Math.min(n2, 4096);
                outputStream.write(arrby, n3, n4);
                n2 -= n4;
                n3 += n4;
            }
        }
    }

    public static void a(byte[] arrby, Writer writer) throws IOException {
        u.a(arrby, writer, Charset.defaultCharset());
    }

    public static void a(byte[] arrby, Writer writer, Charset charset) throws IOException {
        if (arrby != null) {
            writer.write(new String(arrby, b.a(charset)));
        }
    }

    public static void a(byte[] arrby, Writer writer, String string) throws IOException {
        u.a(arrby, writer, b.a(string));
    }

    public static void a(char[] arrc, Writer writer) throws IOException {
        if (arrc != null) {
            writer.write(arrc);
        }
    }

    public static void b(char[] arrc, Writer writer) throws IOException {
        if (arrc != null) {
            int n2 = arrc.length;
            int n3 = 0;
            while (n2 > 0) {
                int n4 = Math.min(n2, 4096);
                writer.write(arrc, n3, n4);
                n2 -= n4;
                n3 += n4;
            }
        }
    }

    public static void a(char[] arrc, OutputStream outputStream) throws IOException {
        u.a(arrc, outputStream, Charset.defaultCharset());
    }

    public static void a(char[] arrc, OutputStream outputStream, Charset charset) throws IOException {
        if (arrc != null) {
            outputStream.write(new String(arrc).getBytes(b.a(charset)));
        }
    }

    public static void a(char[] arrc, OutputStream outputStream, String string) throws IOException {
        u.a(arrc, outputStream, b.a(string));
    }

    public static void a(CharSequence charSequence, Writer writer) throws IOException {
        if (charSequence != null) {
            u.a(charSequence.toString(), writer);
        }
    }

    public static void a(CharSequence charSequence, OutputStream outputStream) throws IOException {
        u.a(charSequence, outputStream, Charset.defaultCharset());
    }

    public static void a(CharSequence charSequence, OutputStream outputStream, Charset charset) throws IOException {
        if (charSequence != null) {
            u.a(charSequence.toString(), outputStream, charset);
        }
    }

    public static void a(CharSequence charSequence, OutputStream outputStream, String string) throws IOException {
        u.a(charSequence, outputStream, b.a(string));
    }

    public static void a(String string, Writer writer) throws IOException {
        if (string != null) {
            writer.write(string);
        }
    }

    public static void a(String string, OutputStream outputStream) throws IOException {
        u.a(string, outputStream, Charset.defaultCharset());
    }

    public static void a(String string, OutputStream outputStream, Charset charset) throws IOException {
        if (string != null) {
            outputStream.write(string.getBytes(b.a(charset)));
        }
    }

    public static void a(String string, OutputStream outputStream, String string2) throws IOException {
        u.a(string, outputStream, b.a(string2));
    }

    public static void a(StringBuffer stringBuffer, Writer writer) throws IOException {
        if (stringBuffer != null) {
            writer.write(stringBuffer.toString());
        }
    }

    public static void a(StringBuffer stringBuffer, OutputStream outputStream) throws IOException {
        u.a(stringBuffer, outputStream, (String)null);
    }

    public static void a(StringBuffer stringBuffer, OutputStream outputStream, String string) throws IOException {
        if (stringBuffer != null) {
            outputStream.write(stringBuffer.toString().getBytes(b.a(string)));
        }
    }

    public static void a(Collection<?> collection, String string, OutputStream outputStream) throws IOException {
        u.a(collection, string, outputStream, Charset.defaultCharset());
    }

    public static void a(Collection<?> collection, String string, OutputStream outputStream, Charset charset) throws IOException {
        if (collection == null) {
            return;
        }
        if (string == null) {
            string = g;
        }
        Charset charset2 = b.a(charset);
        for (Object obj : collection) {
            if (obj != null) {
                outputStream.write(obj.toString().getBytes(charset2));
            }
            outputStream.write(string.getBytes(charset2));
        }
    }

    public static void a(Collection<?> collection, String string, OutputStream outputStream, String string2) throws IOException {
        u.a(collection, string, outputStream, b.a(string2));
    }

    public static void a(Collection<?> collection, String string, Writer writer) throws IOException {
        if (collection == null) {
            return;
        }
        if (string == null) {
            string = g;
        }
        for (Object obj : collection) {
            if (obj != null) {
                writer.write(obj.toString());
            }
            writer.write(string);
        }
    }

    public static int a(InputStream inputStream, OutputStream outputStream) throws IOException {
        long l2 = u.b(inputStream, outputStream);
        if (l2 > Integer.MAX_VALUE) {
            return -1;
        }
        return (int)l2;
    }

    public static long a(InputStream inputStream, OutputStream outputStream, int n2) throws IOException {
        return u.a(inputStream, outputStream, new byte[n2]);
    }

    public static long b(InputStream inputStream, OutputStream outputStream) throws IOException {
        return u.a(inputStream, outputStream, 4096);
    }

    public static long a(InputStream inputStream, OutputStream outputStream, byte[] arrby) throws IOException {
        int n2;
        long l2 = 0;
        while (-1 != (n2 = inputStream.read(arrby))) {
            outputStream.write(arrby, 0, n2);
            l2 += (long)n2;
        }
        return l2;
    }

    public static long a(InputStream inputStream, OutputStream outputStream, long l2, long l3) throws IOException {
        return u.a(inputStream, outputStream, l2, l3, new byte[4096]);
    }

    public static long a(InputStream inputStream, OutputStream outputStream, long l2, long l3, byte[] arrby) throws IOException {
        int n2;
        int n3;
        if (l2 > 0) {
            u.c(inputStream, l2);
        }
        if (l3 == 0) {
            return 0;
        }
        int n4 = n3 = arrby.length;
        if (l3 > 0 && l3 < (long)n3) {
            n4 = (int)l3;
        }
        long l4 = 0;
        while (n4 > 0 && -1 != (n2 = inputStream.read(arrby, 0, n4))) {
            outputStream.write(arrby, 0, n2);
            l4 += (long)n2;
            if (l3 <= 0) continue;
            n4 = (int)Math.min(l3 - l4, (long)n3);
        }
        return l4;
    }

    public static void a(InputStream inputStream, Writer writer) throws IOException {
        u.a(inputStream, writer, Charset.defaultCharset());
    }

    public static void a(InputStream inputStream, Writer writer, Charset charset) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, b.a(charset));
        u.a((Reader)inputStreamReader, writer);
    }

    public static void a(InputStream inputStream, Writer writer, String string) throws IOException {
        u.a(inputStream, writer, b.a(string));
    }

    public static int a(Reader reader, Writer writer) throws IOException {
        long l2 = u.b(reader, writer);
        if (l2 > Integer.MAX_VALUE) {
            return -1;
        }
        return (int)l2;
    }

    public static long b(Reader reader, Writer writer) throws IOException {
        return u.a(reader, writer, new char[4096]);
    }

    public static long a(Reader reader, Writer writer, char[] arrc) throws IOException {
        int n2;
        long l2 = 0;
        while (-1 != (n2 = reader.read(arrc))) {
            writer.write(arrc, 0, n2);
            l2 += (long)n2;
        }
        return l2;
    }

    public static long a(Reader reader, Writer writer, long l2, long l3) throws IOException {
        return u.a(reader, writer, l2, l3, new char[4096]);
    }

    public static long a(Reader reader, Writer writer, long l2, long l3, char[] arrc) throws IOException {
        int n2;
        if (l2 > 0) {
            u.b(reader, l2);
        }
        if (l3 == 0) {
            return 0;
        }
        int n3 = arrc.length;
        if (l3 > 0 && l3 < (long)arrc.length) {
            n3 = (int)l3;
        }
        long l4 = 0;
        while (n3 > 0 && -1 != (n2 = reader.read(arrc, 0, n3))) {
            writer.write(arrc, 0, n2);
            l4 += (long)n2;
            if (l3 <= 0) continue;
            n3 = (int)Math.min(l3 - l4, (long)arrc.length);
        }
        return l4;
    }

    public static void a(Reader reader, OutputStream outputStream) throws IOException {
        u.a(reader, outputStream, Charset.defaultCharset());
    }

    public static void a(Reader reader, OutputStream outputStream, Charset charset) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, b.a(charset));
        u.a(reader, (Writer)outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void a(Reader reader, OutputStream outputStream, String string) throws IOException {
        u.a(reader, outputStream, b.a(string));
    }

    public static boolean a(InputStream inputStream, InputStream inputStream2) throws IOException {
        int n2;
        if (inputStream == inputStream2) {
            return true;
        }
        if (!(inputStream instanceof BufferedInputStream)) {
            inputStream = new BufferedInputStream(inputStream);
        }
        if (!(inputStream2 instanceof BufferedInputStream)) {
            inputStream2 = new BufferedInputStream(inputStream2);
        }
        int n3 = inputStream.read();
        while (-1 != n3) {
            n2 = inputStream2.read();
            if (n3 != n2) {
                return false;
            }
            n3 = inputStream.read();
        }
        n2 = inputStream2.read();
        return n2 == -1;
    }

    public static boolean a(Reader reader, Reader reader2) throws IOException {
        int n2;
        if (reader == reader2) {
            return true;
        }
        reader = u.b(reader);
        reader2 = u.b(reader2);
        int n3 = reader.read();
        while (-1 != n3) {
            n2 = reader2.read();
            if (n3 != n2) {
                return false;
            }
            n3 = reader.read();
        }
        n2 = reader2.read();
        return n2 == -1;
    }

    public static boolean b(Reader reader, Reader reader2) throws IOException {
        if (reader == reader2) {
            return true;
        }
        BufferedReader bufferedReader = u.b(reader);
        BufferedReader bufferedReader2 = u.b(reader2);
        String string = bufferedReader.readLine();
        String string2 = bufferedReader2.readLine();
        while (string != null && string2 != null && string.equals(string2)) {
            string = bufferedReader.readLine();
            string2 = bufferedReader2.readLine();
        }
        return string == null ? string2 == null : string.equals(string2);
    }

    public static long b(InputStream inputStream, long l2) throws IOException {
        long l3;
        long l4;
        if (l2 < 0) {
            throw new IllegalArgumentException("Skip count must be non-negative, actual: " + l2);
        }
        if (k == null) {
            k = new byte[2048];
        }
        for (l4 = l2; l4 > 0 && (l3 = (long)inputStream.read(k, 0, (int)Math.min(l4, 2048))) >= 0; l4 -= l3) {
        }
        return l2 - l4;
    }

    public static long a(ReadableByteChannel readableByteChannel, long l2) throws IOException {
        long l3;
        int n2;
        if (l2 < 0) {
            throw new IllegalArgumentException("Skip count must be non-negative, actual: " + l2);
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate((int)Math.min(l2, 2048));
        for (l3 = l2; l3 > 0; l3 -= (long)n2) {
            byteBuffer.position(0);
            byteBuffer.limit((int)Math.min(l3, 2048));
            n2 = readableByteChannel.read(byteBuffer);
            if (n2 == -1) break;
        }
        return l2 - l3;
    }

    public static long a(Reader reader, long l2) throws IOException {
        long l3;
        long l4;
        if (l2 < 0) {
            throw new IllegalArgumentException("Skip count must be non-negative, actual: " + l2);
        }
        if (j == null) {
            j = new char[2048];
        }
        for (l4 = l2; l4 > 0 && (l3 = (long)reader.read(j, 0, (int)Math.min(l4, 2048))) >= 0; l4 -= l3) {
        }
        return l2 - l4;
    }

    public static void c(InputStream inputStream, long l2) throws IOException {
        if (l2 < 0) {
            throw new IllegalArgumentException("Bytes to skip must not be negative: " + l2);
        }
        long l3 = u.b(inputStream, l2);
        if (l3 != l2) {
            throw new EOFException("Bytes to skip: " + l2 + " actual: " + l3);
        }
    }

    public static void b(ReadableByteChannel readableByteChannel, long l2) throws IOException {
        if (l2 < 0) {
            throw new IllegalArgumentException("Bytes to skip must not be negative: " + l2);
        }
        long l3 = u.a(readableByteChannel, l2);
        if (l3 != l2) {
            throw new EOFException("Bytes to skip: " + l2 + " actual: " + l3);
        }
    }

    public static void b(Reader reader, long l2) throws IOException {
        long l3 = u.a(reader, l2);
        if (l3 != l2) {
            throw new EOFException("Chars to skip: " + l2 + " actual: " + l3);
        }
    }

    public static int a(Reader reader, char[] arrc, int n2, int n3) throws IOException {
        int n4;
        int n5;
        int n6;
        if (n3 < 0) {
            throw new IllegalArgumentException("Length must not be negative: " + n3);
        }
        for (n5 = n3; n5 > 0 && -1 != (n6 = reader.read(arrc, n2 + (n4 = n3 - n5), n5)); n5 -= n6) {
        }
        return n3 - n5;
    }

    public static int a(Reader reader, char[] arrc) throws IOException {
        return u.a(reader, arrc, 0, arrc.length);
    }

    public static int a(InputStream inputStream, byte[] arrby, int n2, int n3) throws IOException {
        int n4;
        int n5;
        int n6;
        if (n3 < 0) {
            throw new IllegalArgumentException("Length must not be negative: " + n3);
        }
        for (n5 = n3; n5 > 0 && -1 != (n6 = inputStream.read(arrby, n2 + (n4 = n3 - n5), n5)); n5 -= n6) {
        }
        return n3 - n5;
    }

    public static int a(InputStream inputStream, byte[] arrby) throws IOException {
        return u.a(inputStream, arrby, 0, arrby.length);
    }

    public static int a(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        int n2;
        int n3 = byteBuffer.remaining();
        while (byteBuffer.remaining() > 0 && -1 != (n2 = readableByteChannel.read(byteBuffer))) {
        }
        return n3 - byteBuffer.remaining();
    }

    public static void b(Reader reader, char[] arrc, int n2, int n3) throws IOException {
        int n4 = u.a(reader, arrc, n2, n3);
        if (n4 != n3) {
            throw new EOFException("Length to read: " + n3 + " actual: " + n4);
        }
    }

    public static void b(Reader reader, char[] arrc) throws IOException {
        u.b(reader, arrc, 0, arrc.length);
    }

    public static void b(InputStream inputStream, byte[] arrby, int n2, int n3) throws IOException {
        int n4 = u.a(inputStream, arrby, n2, n3);
        if (n4 != n3) {
            throw new EOFException("Length to read: " + n3 + " actual: " + n4);
        }
    }

    public static void b(InputStream inputStream, byte[] arrby) throws IOException {
        u.b(inputStream, arrby, 0, arrby.length);
    }

    public static byte[] d(InputStream inputStream, int n2) throws IOException {
        byte[] arrby = new byte[n2];
        u.b(inputStream, arrby, 0, arrby.length);
        return arrby;
    }

    public static void b(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        int n2 = byteBuffer.remaining();
        int n3 = u.a(readableByteChannel, byteBuffer);
        if (n3 != n2) {
            throw new EOFException("Length to read: " + n2 + " actual: " + n3);
        }
    }

    static {
        q q2 = new q(4);
        PrintWriter printWriter = new PrintWriter(q2);
        printWriter.println();
        g = q2.toString();
        printWriter.close();
    }
}

