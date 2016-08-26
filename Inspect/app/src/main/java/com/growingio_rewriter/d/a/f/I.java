/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a.f;

import java.util.ArrayList;
import java.util.HashMap;

final class I {
    private final HashMap<String, Object> a = new HashMap();
    private final ArrayList<String> b = new ArrayList();
    private final ArrayList<String> c = new ArrayList();

    I() {
    }

    public void a(String string, Object object) {
        String string2 = string;
        if (string.startsWith("*/")) {
            string2 = string.substring(1);
            this.b.add(string2);
        } else if (string.endsWith("/*")) {
            string2 = string.substring(0, string.length() - 1);
            this.c.add(string2);
        }
        this.a.put(string2, object);
    }

    public Object a(String string) {
        if (this.a.containsKey(string)) {
            return this.a.get(string);
        }
        int n2 = string.lastIndexOf(47);
        for (String string22 : this.b) {
            if (!string.substring(n2).endsWith(string22)) continue;
            return this.a.get(string22);
        }
        for (String string22 : this.c) {
            if (!string.startsWith(string22)) continue;
            return this.a.get(string22);
        }
        return null;
    }
}

