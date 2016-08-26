/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aP;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.j.I;
import com.growingio.a.a.j.K;
import com.growingio.a.a.j.L;
import com.growingio.a.a.j.O;
import com.growingio.a.a.j.P;
import com.growingio.a.a.j.Q;
import com.growingio.a.a.j.T;
import com.growingio.a.a.j.ao;
import com.growingio.a.a.j.v;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class J {
    protected J() {
    }

    public v a(Charset charset) {
        return new K(this, charset);
    }

    public abstract Reader a() throws IOException;

    public BufferedReader b() throws IOException {
        Reader reader = this.a();
        return reader instanceof BufferedReader ? (BufferedReader)reader : new BufferedReader(reader);
    }

    public aP<Long> c() {
        return aP.f();
    }

    public long d() throws IOException {
        aP<Long> aP2 = this.c();
        if (aP2.b()) {
            return aP2.c();
        }
        T t2 = T.a();
        try {
            Reader reader = t2.a(this.a());
            long l2 = this.a(reader);
            return l2;
        }
        catch (Throwable var3_4) {
            throw t2.a(var3_4);
        }
        finally {
            t2.close();
        }
    }

    private long a(Reader reader) throws IOException {
        long l2;
        long l3 = 0;
        while ((l2 = reader.skip(Long.MAX_VALUE)) != 0) {
            l3 += l2;
        }
        return l3;
    }

    public long a(Appendable appendable) throws IOException {
        aU.a(appendable);
        T t2 = T.a();
        try {
            Reader reader = t2.a(this.a());
            long l2 = Q.a((Readable)reader, appendable);
            return l2;
        }
        catch (Throwable var3_4) {
            throw t2.a(var3_4);
        }
        finally {
            t2.close();
        }
    }

    public long a(I i2) throws IOException {
        aU.a(i2);
        T t2 = T.a();
        try {
            Reader reader = t2.a(this.a());
            Writer writer = t2.a(i2.a());
            long l2 = Q.a((Readable)reader, writer);
            return l2;
        }
        catch (Throwable var3_4) {
            throw t2.a(var3_4);
        }
        finally {
            t2.close();
        }
    }

    public String e() throws IOException {
        T t2 = T.a();
        try {
            Reader reader = t2.a(this.a());
            String string = Q.a(reader);
            return string;
        }
        catch (Throwable var2_3) {
            throw t2.a(var2_3);
        }
        finally {
            t2.close();
        }
    }

    public String f() throws IOException {
        T t2 = T.a();
        try {
            BufferedReader bufferedReader = t2.a(this.b());
            String string = bufferedReader.readLine();
            return string;
        }
        catch (Throwable var2_3) {
            throw t2.a(var2_3);
        }
        finally {
            t2.close();
        }
    }

    public ea<String> g() throws IOException {
        T t2 = T.a();
        try {
            String string;
            BufferedReader bufferedReader = t2.a(this.b());
            ArrayList<String> arrayList = gO.a();
            while ((string = bufferedReader.readLine()) != null) {
                arrayList.add(string);
            }
            ea<String> ea2 = ea.a(arrayList);
            return ea2;
        }
        catch (Throwable var2_3) {
            throw t2.a(var2_3);
        }
        finally {
            t2.close();
        }
    }

    public <T> T a(ao<T> ao2) throws IOException {
        aU.a(ao2);
        T t2 = T.a();
        try {
            Reader reader = t2.a(this.a());
            T t3 = Q.a((Readable)reader, ao2);
            return t3;
        }
        catch (Throwable var3_4) {
            throw t2.a(var3_4);
        }
        finally {
            t2.close();
        }
    }

    public boolean h() throws IOException {
        aP<Long> aP2 = this.c();
        if (aP2.b() && aP2.c() == 0) {
            return true;
        }
        T t2 = T.a();
        try {
            Reader reader = t2.a(this.a());
            boolean bl2 = reader.read() == -1;
            return bl2;
        }
        catch (Throwable var3_4) {
            throw t2.a(var3_4);
        }
        finally {
            t2.close();
        }
    }

    public static J a(Iterable<? extends J> iterable) {
        return new O(iterable);
    }

    public static J a(Iterator<? extends J> iterator) {
        return J.a(ea.a(iterator));
    }

    public static /* varargs */ J a(J ... arrj) {
        return J.a(ea.a(arrj));
    }

    public static J a(CharSequence charSequence) {
        return new L(charSequence);
    }

    public static J i() {
        return P.k();
    }
}

