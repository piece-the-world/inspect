/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.b.b;

import com.growingio.e.b.b.b;
import com.growingio.e.b.d.c;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class a
implements c {
    private InheritableThreadLocal<Map<String, String>> a;

    public a() {
        this.a = new b(this);
    }

    @Override
    public void a(String string, String string2) {
        if (string == null) {
            throw new IllegalArgumentException("key cannot be null");
        }
        Map<String, String> map = this.a.get();
        if (map == null) {
            map = new HashMap<String, String>();
            this.a.set(map);
        }
        map.put(string, string2);
    }

    @Override
    public String a(String string) {
        Map<String, String> map = this.a.get();
        if (map != null && string != null) {
            return map.get(string);
        }
        return null;
    }

    @Override
    public void b(String string) {
        Map<String, String> map = this.a.get();
        if (map != null) {
            map.remove(string);
        }
    }

    @Override
    public void a() {
        Map<String, String> map = this.a.get();
        if (map != null) {
            map.clear();
            this.a.remove();
        }
    }

    public Set<String> b() {
        Map<String, String> map = this.a.get();
        if (map != null) {
            return map.keySet();
        }
        return null;
    }

    @Override
    public Map<String, String> c() {
        Map<String, String> map = this.a.get();
        if (map != null) {
            return new HashMap<String, String>(map);
        }
        return null;
    }

    @Override
    public void a(Map<String, String> map) {
        this.a.set(new HashMap<String, String>(map));
    }
}

