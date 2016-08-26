/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.c;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.StreamCorruptedException;
import java.lang.reflect.Proxy;

public class i
extends ObjectInputStream {
    private final ClassLoader a;

    public i(ClassLoader classLoader, InputStream inputStream) throws IOException, StreamCorruptedException {
        super(inputStream);
        this.a = classLoader;
    }

    @Override
    protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
        try {
            return Class.forName(objectStreamClass.getName(), false, this.a);
        }
        catch (ClassNotFoundException var2_2) {
            return super.resolveClass(objectStreamClass);
        }
    }

    @Override
    protected Class<?> resolveProxyClass(String[] arrstring) throws IOException, ClassNotFoundException {
        Class[] arrclass = new Class[arrstring.length];
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            arrclass[i2] = Class.forName(arrstring[i2], false, this.a);
        }
        try {
            return Proxy.getProxyClass(this.a, arrclass);
        }
        catch (IllegalArgumentException var3_4) {
            return super.resolveProxyClass(arrstring);
        }
    }
}

