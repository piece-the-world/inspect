/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.e;
import com.growingio.agent.compile.f;
import com.growingio.agent.compile.g;
import com.growingio.agent.compile.k;
import com.growingio.agent.compile.m;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;

public class d {
    private static final String c = "META-INF/MANIFEST.MF";
    public static final String a = "GIO-App-Version";
    private String d;
    private final g e;
    private final k f;
    private final File g;
    private final m h;
    volatile int b;
    private final File i;

    public d(File file) throws FileNotFoundException, IOException, ClassNotFoundException {
        this(file, null);
    }

    public d(File file, File file2) throws FileNotFoundException, IOException, ClassNotFoundException {
        this(new f(null), ClassLoader.getSystemClassLoader(), file, file2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public d(m m2, ClassLoader classLoader, File file, File file2) throws FileNotFoundException, IOException, ClassNotFoundException {
        if (m2 == null) {
            m2 = new f(null);
        }
        this.h = m2;
        this.i = file;
        this.g = file2;
        this.e = new g(m2);
        this.f = new k(this.e, m2);
        Enumeration<URL> enumeration = this.getClass().getClassLoader().getResources("META-INF/MANIFEST.MF");
        while (enumeration.hasMoreElements()) {
            Properties properties = new Properties();
            InputStream inputStream = enumeration.nextElement().openStream();
            try {
                properties.load(inputStream);
                this.d = properties.getProperty("GIO-App-Version");
                if (this.d == null) continue;
                inputStream.close();
            }
            catch (IOException var8_8) {}
            continue;
            finally {
                inputStream.close();
                continue;
            }
        }
        if (this.d == null) {
            throw new FileNotFoundException("Could not find MANIFEST.MF with GIO-App-Version");
        }
    }
}

