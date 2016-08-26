/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.fh;
import com.growingio.a.a.d.jK;
import com.growingio.a.a.d.js;
import com.growingio.a.a.d.lH;
import com.growingio.a.a.n.b;
import com.growingio.a.a.n.f;
import com.growingio.a.a.n.g;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

final class e
extends g {
    private final lH<ClassLoader, String> a = js.a().e().e();

    e() {
    }

    fg<f> a() {
        fh<f> fh2 = fg.l();
        for (Map.Entry<ClassLoader, String> entry : this.a.u()) {
            fh2.c(f.a(entry.getValue(), entry.getKey()));
        }
        return fh2.b();
    }

    @Override
    protected void a(ClassLoader classLoader, JarFile jarFile) {
        Enumeration<JarEntry> enumeration = jarFile.entries();
        while (enumeration.hasMoreElements()) {
            JarEntry jarEntry = enumeration.nextElement();
            if (jarEntry.isDirectory() || jarEntry.getName().equals("META-INF/MANIFEST.MF")) continue;
            this.a.a(classLoader).add(jarEntry.getName());
        }
    }

    @Override
    protected void a(ClassLoader classLoader, File file) throws IOException {
        this.a(file, classLoader, "");
    }

    private void a(File file, ClassLoader classLoader, String string) throws IOException {
        File[] arrfile = file.listFiles();
        if (arrfile == null) {
            b.e().warning("Cannot read directory " + file);
            return;
        }
        for (File file2 : arrfile) {
            String string2 = file2.getName();
            if (file2.isDirectory()) {
                this.a(file2, classLoader, string + string2 + "/");
                continue;
            }
            String string3 = string + string2;
            if (string3.equals("META-INF/MANIFEST.MF")) continue;
            this.a.a(classLoader).add(string3);
        }
    }
}

