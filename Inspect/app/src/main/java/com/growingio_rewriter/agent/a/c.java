/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.a;

import com.growingio.agent.a.d;
import com.growingio.agent.a.f;
import com.growingio.agent.a.h;
import com.growingio.agent.a.i;
import com.growingio.agent.a.j;
import com.growingio.agent.a.n;
import com.growingio.d.a.e;
import com.growingio.d.a.u;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c {
    private c() {
    }

    public static Collection<f> a(Class class_, String string, Set<URL> set) {
        String string2 = "" + 'L' + class_.getName().replace('.', '/') + ';';
        Map<String, URL> map = c.a(string, set);
        ArrayList<f> arrayList = new ArrayList<f>();
        for (Map.Entry<String, URL> entry : map.entrySet()) {
            String string3 = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                n.a(c.class.getResourceAsStream("" + '/' + string3), (OutputStream)byteArrayOutputStream, true);
                e e2 = new e(byteArrayOutputStream.toByteArray());
                Collection<f> collection = h.a(e2, string2);
                arrayList.addAll(collection);
            }
            catch (IOException var10_11) {
                var10_11.printStackTrace();
            }
        }
        return arrayList;
    }

    public static Collection<i> b(Class class_, String string, Set<URL> set) {
        String string2 = u.a(class_).i();
        Map<String, URL> map = c.a(string, set);
        ArrayList<i> arrayList = new ArrayList<i>();
        for (Map.Entry<String, URL> entry : map.entrySet()) {
            String string3 = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                n.a(c.class.getResourceAsStream("" + '/' + string3), (OutputStream)byteArrayOutputStream, true);
                e e2 = new e(byteArrayOutputStream.toByteArray());
                Collection<i> collection = j.a(e2, string2);
                arrayList.addAll(collection);
            }
            catch (IOException var10_11) {
                var10_11.printStackTrace();
            }
        }
        return arrayList;
    }

    private static Map<String, URL> a(String string, Set<URL> set) {
        if (!string.endsWith("/")) {
            string = string + "/";
        }
        Pattern pattern = Pattern.compile("(.*).class");
        Map<String, URL> map = c.a(pattern, set);
        for (String string2 : map.keySet().toArray(new String[0])) {
            if (string2.startsWith(string)) continue;
            map.remove(string2);
        }
        return map;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static Map<String, URL> a(Pattern pattern, Collection<URL> collection) {
        HashMap<String, URL> hashMap = new HashMap<String, URL>();
        Iterator<URL> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object object;
            File file;
            Object object2;
            Object object3;
            URL uRL = iterator.next();
            uRL = c.a(uRL);
            try {
                file = new File(URLDecoder.decode(uRL.getFile(), "UTF-8"));
            }
            catch (UnsupportedEncodingException var6_7) {
                var6_7.printStackTrace();
                System.exit(1);
                return hashMap;
            }
            if (file.isDirectory()) {
                object3 = d.a(file, pattern);
                object2 = object3.iterator();
                while (object2.hasNext()) {
                    object = object2.next();
                    String string = object.getAbsolutePath();
                    string = string.substring(file.getAbsolutePath().length() + 1);
                    hashMap.put(string, uRL);
                }
                continue;
            }
            if (!file.isFile()) continue;
            object3 = null;
            try {
                object3 = new JarFile(file);
                object2 = object3.entries();
                while (object2.hasMoreElements()) {
                    object = (JarEntry)object2.nextElement();
                    if (!pattern.matcher(object.getName()).matches()) continue;
                    hashMap.put(object.getName(), uRL);
                }
                continue;
            }
            catch (IOException var7_10) {
                var7_10.printStackTrace();
                System.exit(1);
                continue;
            }
            finally {
                if (object3 == null) continue;
                try {
                    object3.close();
                    continue;
                }
                catch (IOException var7_11) {}
                continue;
            }
        }
        return hashMap;
    }

    private static URL a(URL uRL) {
        String string = uRL.getProtocol();
        if ("jar".equals(string)) {
            try {
                String string2 = uRL.toString().substring(4);
                int n2 = string2.indexOf("!/");
                if (n2 > 0) {
                    string2 = string2.substring(0, n2);
                }
                uRL = new URL(string2);
            }
            catch (Exception var2_3) {
                var2_3.printStackTrace();
            }
        }
        return uRL;
    }

    static URL[] a() {
        ClassLoader classLoader = Object.class.getClassLoader();
        return classLoader instanceof URLClassLoader ? ((URLClassLoader)classLoader).getURLs() : new URL[]{};
    }
}

