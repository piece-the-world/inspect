/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.c;
import com.growingio.agent.compile.d;
import com.growingio.agent.compile.m;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class g {
    public static final String a = "REPLACE_CALL_SITE:";
    public static final String b = "WRAP_METHOD:";
    private final Map<String, Collection<c>> c;
    private final Map<c, c> d;

    public g(m m2) throws ClassNotFoundException {
        Map map = g.a(m2);
        this.d = g.a(map, m2);
        m2.d("method wrappers : " + this.d);
        this.c = g.b(map, m2);
        m2.d("callsite replacements : " + this.c);
    }

    public c a(c c2) {
        return this.d.get(c2);
    }

    public Collection<c> a(String string, String string2, String string3) {
        ArrayList<c> arrayList = new ArrayList<c>();
        String string4 = MessageFormat.format("{0}:{1}", string2, string3);
        Collection<c> collection = this.c.get(string4);
        if (collection != null) {
            arrayList.addAll(collection);
        }
        if ((collection = this.c.get(MessageFormat.format("{0}.{1}:{2}", string, string2, string3))) != null) {
            arrayList.addAll(collection);
        }
        return arrayList;
    }

    private static Map<c, c> a(Map<String, String> map, m m2) throws ClassNotFoundException {
        HashMap<c, c> hashMap = new HashMap<c, c>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!entry.getKey().startsWith("WRAP_METHOD:")) continue;
            hashMap.put(c.a(entry.getKey().substring("WRAP_METHOD:".length())), c.a(entry.getValue()));
        }
        return hashMap;
    }

    private static Map<String, Collection<c>> b(Map<String, String> map, m m2) throws ClassNotFoundException {
        HashMap<String, Set> hashMap = new HashMap<String, Set>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String string;
            c c2;
            String[] arrstring;
            Set set;
            if (!entry.getKey().startsWith("REPLACE_CALL_SITE:")) continue;
            String object = ((String)entry.getKey()).substring("REPLACE_CALL_SITE:".length());
            if (object.contains(".")) {
                arrstring = c.a(object);
                c2 = c.a((String)entry.getValue());
                string = MessageFormat.format("{0}.{1}:{2}", arrstring.b(), arrstring.c(), arrstring.d());
                set = (HashSet<c>)hashMap.get(string);
                if (set == null) {
                    set = new HashSet<c>();
                    hashMap.put(string, set);
                }
                set.add(c2);
                continue;
            }
            arrstring = object.split(":");
            int n2 = object.indexOf("(");
            String string2 = object.substring(0, n2);
            String string3 = object.substring(n2);
            string = MessageFormat.format("{0}:{1}", string2, string3);
            c2 = c.a((String)entry.getValue());
            set = (Set)hashMap.get(string);
            if (set == null) {
                set = new HashSet();
                hashMap.put(string, set);
            }
            set.add(c2);
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            hashMap2.put(entry2.getKey(), entry2.getValue());
        }
        return hashMap2;
    }

    private static Map a(m m2) {
        Properties properties;
        block8 : {
            properties = new Properties();
            URL uRL = d.class.getResource("/config.properties");
            if (uRL == null) {
                m2.c("Unable to find the type map");
                System.exit(1);
            }
            InputStream inputStream = null;
            try {
                inputStream = uRL.openStream();
                properties.load(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    }
                    catch (IOException var4_4) {}
                }
            }
            catch (Throwable var4_5) {
                if (inputStream == null) break block8;
                try {
                    inputStream.close();
                }
                catch (IOException var5_6) {
                    // empty catch block
                }
            }
        }
        return properties;
    }
}

