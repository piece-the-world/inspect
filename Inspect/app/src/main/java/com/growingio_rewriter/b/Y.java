/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import com.growingio.b.ae;
import com.growingio.b.e;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

final class Y
implements e {
    JarFile a;
    String b;

    Y(String string) throws ae {
        try {
            this.a = new JarFile(string);
            this.b = new File(string).getCanonicalFile().toURI().toURL().toString();
            return;
        }
        catch (IOException var2_2) {
            throw new ae(string);
        }
    }

    @Override
    public InputStream a(String string) throws ae {
        try {
            String string2 = string.replace('.', '/') + ".class";
            JarEntry jarEntry = this.a.getJarEntry(string2);
            if (jarEntry != null) {
                return this.a.getInputStream(jarEntry);
            }
            return null;
        }
        catch (IOException var2_3) {
            throw new ae("broken jar file?: " + this.a.getName());
        }
    }

    @Override
    public URL b(String string) {
        String string2 = string.replace('.', '/') + ".class";
        JarEntry jarEntry = this.a.getJarEntry(string2);
        if (jarEntry != null) {
            try {
                return new URL("jar:" + this.b + "!/" + string2);
            }
            catch (MalformedURLException var4_4) {
                // empty catch block
            }
        }
        return null;
    }

    @Override
    public void a() {
        try {
            this.a.close();
            this.a = null;
        }
        catch (IOException var1_1) {
            // empty catch block
        }
    }

    public String toString() {
        return this.a == null ? "<null>" : this.a.toString();
    }
}

