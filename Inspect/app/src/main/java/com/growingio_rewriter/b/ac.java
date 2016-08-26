/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.e;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;

public class ac
implements e {
    private WeakReference a;

    public ac(ClassLoader classLoader) {
        this.a = new WeakReference<ClassLoader>(classLoader);
    }

    public String toString() {
        Object object = null;
        if (this.a != null) {
            object = this.a.get();
        }
        return object == null ? "<null>" : object.toString();
    }

    @Override
    public InputStream a(String string) {
        String string2 = string.replace('.', '/') + ".class";
        ClassLoader classLoader = (ClassLoader)this.a.get();
        if (classLoader == null) {
            return null;
        }
        return classLoader.getResourceAsStream(string2);
    }

    @Override
    public URL b(String string) {
        String string2 = string.replace('.', '/') + ".class";
        ClassLoader classLoader = (ClassLoader)this.a.get();
        if (classLoader == null) {
            return null;
        }
        return classLoader.getResource(string2);
    }

    @Override
    public void a() {
        this.a = null;
    }
}

