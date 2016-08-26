/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.b;

import com.growingio.d.a.b.b;
import com.growingio.d.a.b.c;
import com.growingio.d.a.b.f;
import com.growingio.d.a.b.p;
import com.growingio.d.a.b.q;
import com.growingio.d.a.e;
import com.growingio.d.a.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

public class o {
    static final HashMap<String, String> a = new HashMap();

    public static void a(String[] arrstring) throws IOException {
        Properties properties = new Properties();
        int n2 = arrstring.length - 1;
        for (int i2 = 0; i2 < n2 - 1; ++i2) {
            properties.load(new FileInputStream(arrstring[i2]));
        }
        for (Map.Entry object2 : properties.entrySet()) {
            a.put((String)object2.getKey(), (String)object2.getValue());
        }
        HashSet<String> hashSet = new HashSet<String>(a.keySet());
        File file = new File(arrstring[n2 - 1]);
        File file2 = new File(arrstring[n2]);
        o.a(file, file2, new p(a, hashSet));
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            if (string.endsWith("/remove")) continue;
            System.out.println("INFO: unused mapping " + string);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static void a(File file, File file2, com.growingio.d.a.a.q q2) throws IOException {
        if (file.isDirectory()) {
            File[] arrfile = file.listFiles();
            for (int i2 = 0; i2 < arrfile.length; ++i2) {
                o.a(arrfile[i2], file2, q2);
            }
        } else if (file.getName().endsWith(".class")) {
            Object object2;
            f f2 = new f();
            e e2 = new e(new FileInputStream(file));
            g g2 = new g(1);
            b b2 = new b(g2, f2);
            c c2 = new c(b2, q2);
            e2.a(c2, 2);
            TreeSet treeSet = new TreeSet(new q());
            treeSet.addAll(f2.values());
            e2 = new e(g2.b());
            g2 = new g(0);
            for (Object object2 : treeSet) {
                object2.a(g2);
            }
            e2.a(g2, 2);
            if (a.get(e2.b() + "/remove") != null) {
                return;
            }
            object2 = q2.b(e2.b());
            File file3 = new File(file2, (String)object2 + ".class");
            if (!file3.exists() || file3.lastModified() < file.lastModified()) {
                if (!file3.getParentFile().exists() && !file3.getParentFile().mkdirs()) {
                    throw new IOException("Cannot create directory " + file3.getParentFile());
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                try {
                    fileOutputStream.write(g2.b());
                }
                finally {
                    fileOutputStream.close();
                }
            }
        }
    }
}

