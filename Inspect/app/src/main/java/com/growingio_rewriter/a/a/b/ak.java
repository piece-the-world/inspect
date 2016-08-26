/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aj;
import com.growingio.a.a.b.am;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;

class ak
implements am {
    private static final String a = "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.";

    ak() {
    }

    @Override
    public Class<?> a() {
        try {
            URLClassLoader uRLClassLoader = this.a(this.b());
            return uRLClassLoader.loadClass("Finalizer");
        }
        catch (Exception var1_2) {
            aj.b().log(Level.WARNING, "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.", var1_2);
            return null;
        }
    }

    URL b() throws IOException {
        String string = "Finalizer".replace('.', '/') + ".class";
        URL uRL = this.getClass().getClassLoader().getResource(string);
        if (uRL == null) {
            throw new FileNotFoundException(string);
        }
        String string2 = uRL.toString();
        if (!string2.endsWith(string)) {
            throw new IOException("Unsupported path style: " + string2);
        }
        string2 = string2.substring(0, string2.length() - string.length());
        return new URL(uRL, string2);
    }

    URLClassLoader a(URL uRL) {
        return new URLClassLoader(new URL[]{uRL}, null);
    }
}

