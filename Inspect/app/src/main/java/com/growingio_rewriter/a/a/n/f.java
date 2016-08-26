/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.j.J;
import com.growingio.a.a.j.ax;
import com.growingio.a.a.j.v;
import com.growingio.a.a.n.d;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;

public class f {
    private final String b;
    final ClassLoader a;

    static f a(String string, ClassLoader classLoader) {
        if (string.endsWith(".class")) {
            return new d(string, classLoader);
        }
        return new f(string, classLoader);
    }

    f(String string, ClassLoader classLoader) {
        this.b = aU.a(string);
        this.a = aU.a(classLoader);
    }

    public final URL e() {
        URL uRL = this.a.getResource(this.b);
        if (uRL == null) {
            throw new NoSuchElementException(this.b);
        }
        return uRL;
    }

    public final v f() {
        return ax.a(this.e());
    }

    public final J a(Charset charset) {
        return ax.a(this.e(), charset);
    }

    public final String g() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public boolean equals(Object object) {
        if (object instanceof f) {
            f f2 = (f)object;
            return this.b.equals(f2.b) && this.a == f2.a;
        }
        return false;
    }

    public String toString() {
        return this.b;
    }
}

