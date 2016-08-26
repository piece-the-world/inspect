/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.b;

import com.growingio.d.a.b.j;
import com.growingio.d.a.e;
import com.growingio.d.a.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class h {
    static final Set<String> a = new HashSet<String>();
    static final Map<String, String> b = new HashMap<String, String>();
    static boolean c = false;

    public static void a(String[] arrstring) throws IOException {
        String string;
        File file = new File(arrstring[0]);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(file));
        LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(gZIPInputStream));
        while ((string = lineNumberReader.readLine()) != null) {
            if (string.startsWith("class")) {
                String string2 = string.substring(6, string.lastIndexOf(32));
                String string3 = string.substring(string.lastIndexOf(32) + 1);
                b.put(string2, string3);
                continue;
            }
            a.add(string);
        }
        int n2 = 1;
        if (arrstring[n2].equals("-nodebug")) {
            c = true;
            ++n2;
        }
        h.a(new File(arrstring[n2]));
    }

    static void a(File file) throws IOException {
        if (c && file.getName().contains("debug")) {
            return;
        }
        if (file.isDirectory()) {
            File[] arrfile = file.listFiles();
            for (int i2 = 0; i2 < arrfile.length; ++i2) {
                h.a(arrfile[i2]);
            }
        } else if (file.getName().endsWith(".jar")) {
            File file2 = new File(file.getParentFile(), file.getName() + ".new");
            ZipFile zipFile = new ZipFile(file);
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file2));
            Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
            byte[] arrby = new byte[10000];
            while (enumeration.hasMoreElements()) {
                int n2;
                Object object;
                ZipEntry zipEntry = enumeration.nextElement();
                if (zipEntry.isDirectory()) {
                    zipOutputStream.putNextEntry(zipEntry);
                    continue;
                }
                zipOutputStream.putNextEntry(zipEntry);
                if (zipEntry.getName().endsWith(".class")) {
                    object = new e(zipFile.getInputStream(zipEntry));
                    object.a(new j(), 0);
                }
                object = zipFile.getInputStream(zipEntry);
                do {
                    if ((n2 = object.read(arrby, 0, arrby.length)) == -1) continue;
                    zipOutputStream.write(arrby, 0, n2);
                } while (n2 != -1);
                zipOutputStream.closeEntry();
            }
            zipOutputStream.close();
            zipFile.close();
            if (!file.delete()) {
                throw new IOException("Cannot delete file " + file);
            }
            if (!file2.renameTo(file)) {
                throw new IOException("Cannot rename file " + file2);
            }
        }
    }
}

