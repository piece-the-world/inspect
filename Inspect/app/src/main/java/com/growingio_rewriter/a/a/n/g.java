/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.fh;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.lI;
import com.growingio.a.a.d.oP;
import com.growingio.a.a.n.b;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

abstract class g {
    private final Set<File> a = lI.a();

    g() {
    }

    public final void a(ClassLoader classLoader) throws IOException {
        oP<Map.Entry<File, ClassLoader>> oP2 = g.b(classLoader).k().k_();
        while (oP2.hasNext()) {
            Map.Entry<File, ClassLoader> entry = oP2.next();
            this.a(entry.getKey(), entry.getValue());
        }
    }

    protected abstract void a(ClassLoader var1, File var2) throws IOException;

    protected abstract void a(ClassLoader var1, JarFile var2) throws IOException;

    final void a(File file, ClassLoader classLoader) throws IOException {
        if (this.a.add(file.getCanonicalFile())) {
            this.b(file, classLoader);
        }
    }

    private void b(File file, ClassLoader classLoader) throws IOException {
        if (!file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            this.a(classLoader, file);
        } else {
            this.c(file, classLoader);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void c(File file, ClassLoader classLoader) throws IOException {
        JarFile jarFile;
        try {
            jarFile = new JarFile(file);
        }
        catch (IOException var4_4) {
            return;
        }
        try {
            oP<File> oP2 = g.a(file, jarFile.getManifest()).k_();
            while (oP2.hasNext()) {
                File file2 = oP2.next();
                this.a(file2, classLoader);
            }
            this.a(classLoader, jarFile);
        }
        finally {
            try {
                jarFile.close();
            }
            catch (IOException var4_6) {}
        }
    }

    static fg<File> a(File file, Manifest manifest) {
        if (manifest == null) {
            return fg.k();
        }
        fh<File> fh2 = fg.l();
        String string = manifest.getMainAttributes().getValue(Attributes.Name.CLASS_PATH.toString());
        if (string != null) {
            for (String string2 : b.d().a(string)) {
                URL uRL;
                try {
                    uRL = g.a(file, string2);
                }
                catch (MalformedURLException var7_7) {
                    b.e().warning("Invalid Class-Path entry: " + string2);
                    continue;
                }
                if (!uRL.getProtocol().equals("file")) continue;
                fh2.c(new File(uRL.getFile()));
            }
        }
        return fh2.b();
    }

    static ei<File, ClassLoader> b(ClassLoader classLoader) {
        LinkedHashMap<File, ClassLoader> linkedHashMap = ii.d();
        ClassLoader classLoader2 = classLoader.getParent();
        if (classLoader2 != null) {
            linkedHashMap.putAll(g.b(classLoader2));
        }
        if (classLoader instanceof URLClassLoader) {
            URLClassLoader uRLClassLoader = (URLClassLoader)classLoader;
            for (URL uRL : uRLClassLoader.getURLs()) {
                File file;
                if (!uRL.getProtocol().equals("file") || linkedHashMap.containsKey(file = new File(uRL.getFile()))) continue;
                linkedHashMap.put(file, classLoader);
            }
        }
        return ei.b(linkedHashMap);
    }

    static URL a(File file, String string) throws MalformedURLException {
        return new URL(file.toURI().toURL(), string);
    }
}

