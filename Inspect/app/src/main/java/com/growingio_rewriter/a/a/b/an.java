/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aj;
import com.growingio.a.a.b.am;

class an
implements am {
    static boolean a;

    an() {
    }

    @Override
    public Class<?> a() {
        ClassLoader classLoader;
        if (a) {
            return null;
        }
        try {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        catch (SecurityException var2_2) {
            aj.b().info("Not allowed to access system class loader.");
            return null;
        }
        if (classLoader != null) {
            try {
                return classLoader.loadClass("Finalizer");
            }
            catch (ClassNotFoundException var2_3) {
                return null;
            }
        }
        return null;
    }
}

