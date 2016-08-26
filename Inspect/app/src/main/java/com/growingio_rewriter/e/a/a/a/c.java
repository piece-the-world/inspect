/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;

public class c {
    private static final int a = 4096;

    public static void a(byte[] arrby, OutputStream outputStream) throws IOException {
        outputStream.write(arrby);
    }

    public static void a(byte[] arrby, Writer writer) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrby);
        c.a((InputStream)byteArrayInputStream, writer);
    }

    public static void a(byte[] arrby, Writer writer, String string) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrby);
        c.a(byteArrayInputStream, writer, string);
    }

    public static int a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] arrby = new byte[4096];
        int n2 = 0;
        int n3 = 0;
        while (-1 != (n3 = inputStream.read(arrby))) {
            outputStream.write(arrby, 0, n3);
            n2 += n3;
        }
        return n2;
    }

    public static int a(Reader reader, Writer writer) throws IOException {
        char[] arrc = new char[4096];
        int n2 = 0;
        int n3 = 0;
        while (-1 != (n3 = reader.read(arrc))) {
            writer.write(arrc, 0, n3);
            n2 += n3;
        }
        return n2;
    }

    public static void a(InputStream inputStream, Writer writer) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.defaultCharset());
        c.a((Reader)inputStreamReader, writer);
    }

    public static void a(InputStream inputStream, Writer writer, String string) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, string);
        c.a((Reader)inputStreamReader, writer);
    }

    public static void a(Reader reader, OutputStream outputStream) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charset.defaultCharset());
        c.a(reader, (Writer)outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void a(Reader reader, OutputStream outputStream, String string) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, string);
        c.a(reader, (Writer)outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void a(String string, OutputStream outputStream) throws IOException {
        StringReader stringReader = new StringReader(string);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charset.defaultCharset());
        c.a((Reader)stringReader, (Writer)outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void a(String string, OutputStream outputStream, String string2) throws IOException {
        StringReader stringReader = new StringReader(string);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, string2);
        c.a((Reader)stringReader, (Writer)outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void a(String string, Writer writer) throws IOException {
        writer.write(string);
    }
}

