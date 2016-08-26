/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aH;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.j.J;
import com.growingio.a.a.j.ao;
import com.growingio.a.a.j.ay;
import com.growingio.a.a.j.az;
import com.growingio.a.a.j.v;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

public final class ax {
    private ax() {
    }

    public static v a(URL uRL) {
        return new az(uRL, null);
    }

    public static J a(URL uRL, Charset charset) {
        return ax.a(uRL).a(charset);
    }

    public static byte[] b(URL uRL) throws IOException {
        return ax.a(uRL).f();
    }

    public static String b(URL uRL, Charset charset) throws IOException {
        return ax.a(uRL, charset).e();
    }

    public static <T> T a(URL uRL, Charset charset, ao<T> ao2) throws IOException {
        return ax.a(uRL, charset).a(ao2);
    }

    public static List<String> c(URL uRL, Charset charset) throws IOException {
        return (List)ax.a(uRL, charset, new ay());
    }

    public static void a(URL uRL, OutputStream outputStream) throws IOException {
        ax.a(uRL).a(outputStream);
    }

    public static URL a(String string) {
        ClassLoader classLoader = aH.a(Thread.currentThread().getContextClassLoader(), ax.class.getClassLoader());
        URL uRL = classLoader.getResource(string);
        aU.a(uRL != null, "resource %s not found.", (Object)string);
        return uRL;
    }

    public static URL a(Class<?> class_, String string) {
        URL uRL = class_.getResource(string);
        aU.a(uRL != null, "resource %s relative to %s not found.", (Object)string, (Object)class_.getName());
        return uRL;
    }
}

