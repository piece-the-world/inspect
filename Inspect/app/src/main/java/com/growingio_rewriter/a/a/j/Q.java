/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.j.R;
import com.growingio.a.a.j.a;
import com.growingio.a.a.j.ao;
import com.growingio.a.a.j.ap;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.Buffer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

public final class Q {
    static CharBuffer a() {
        return CharBuffer.allocate(2048);
    }

    private Q() {
    }

    public static long a(Readable readable, Appendable appendable) throws IOException {
        aU.a(readable);
        aU.a(appendable);
        CharBuffer charBuffer = Q.a();
        long l2 = 0;
        while (readable.read(charBuffer) != -1) {
            charBuffer.flip();
            appendable.append(charBuffer);
            l2 += (long)charBuffer.remaining();
            charBuffer.clear();
        }
        return l2;
    }

    public static String a(Readable readable) throws IOException {
        return Q.d(readable).toString();
    }

    private static StringBuilder d(Readable readable) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        Q.a(readable, stringBuilder);
        return stringBuilder;
    }

    public static List<String> b(Readable readable) throws IOException {
        String string;
        ArrayList<String> arrayList = new ArrayList<String>();
        ap ap2 = new ap(readable);
        while ((string = ap2.a()) != null) {
            arrayList.add(string);
        }
        return arrayList;
    }

    public static <T> T a(Readable readable, ao<T> ao2) throws IOException {
        String string;
        aU.a(readable);
        aU.a(ao2);
        ap ap2 = new ap(readable);
        while ((string = ap2.a()) != null && ao2.a(string)) {
        }
        return ao2.b();
    }

    public static long c(Readable readable) throws IOException {
        long l2;
        long l3 = 0;
        CharBuffer charBuffer = Q.a();
        while ((l2 = (long)readable.read(charBuffer)) != -1) {
            l3 += l2;
            charBuffer.clear();
        }
        return l3;
    }

    public static void a(Reader reader, long l2) throws IOException {
        aU.a(reader);
        while (l2 > 0) {
            long l3 = reader.skip(l2);
            if (l3 == 0) {
                throw new EOFException();
            }
            l2 -= l3;
        }
    }

    public static Writer b() {
        return R.a();
    }

    public static Writer a(Appendable appendable) {
        if (appendable instanceof Writer) {
            return (Writer)appendable;
        }
        return new a(appendable);
    }
}

