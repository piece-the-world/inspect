/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.e;
import java.io.InputStream;
import java.net.URL;

public class c
implements e {
    private Class a;

    public c(Class class_) {
        this.a = class_;
    }

    c() {
        this(Object.class);
    }

    @Override
    public InputStream a(String string) {
        String string2 = "/" + string.replace('.', '/') + ".class";
        return this.a.getResourceAsStream(string2);
    }

    @Override
    public URL b(String string) {
        String string2 = "/" + string.replace('.', '/') + ".class";
        return this.a.getResource(string2);
    }

    @Override
    public void a() {
    }

    public String toString() {
        return this.a.getName() + ".class";
    }
}

