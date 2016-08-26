/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.b;
import com.growingio.agent.compile.c;
import com.growingio.agent.compile.g;
import com.growingio.agent.compile.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class k {
    private final WeakHashMap<String, Class<?>> a = new WeakHashMap();
    private boolean b;
    private boolean c;
    private String d;
    private final g e;
    private final m f;
    private HashMap<String, String> g;
    private String h;
    private final ArrayList<String> i = new ArrayList();
    private final HashMap<String, ArrayList<String>> j = new HashMap();
    private HashMap<String, String> k;
    private Set<String> l = new HashSet<String>();

    public k(g g2, m m2) {
        this.e = g2;
        this.f = m2;
        this.k = new HashMap();
        this.g = new HashMap();
    }

    public m a() {
        return this.f;
    }

    public void b() {
        this.b = false;
        this.c = false;
        this.d = null;
        this.h = null;
        this.i.clear();
    }

    public void c() {
        this.c = true;
    }

    public boolean d() {
        return this.c;
    }

    public void e() {
        this.b = true;
    }

    public boolean f() {
        return this.b;
    }

    public void a(String string) {
        this.i.add(string);
    }

    public void b(String string) {
        while (this.i.remove(string)) {
        }
        this.a(string);
    }

    public void a(String string, String string2) {
        this.f.a("Will trace method " + this.d + "#" + string + ":" + string2 + " as requested");
        this.k.put(this.d + "#" + string, string2);
    }

    public void b(String string, String string2) {
        this.f.a("Will skip all tracing in method " + this.d + "#" + string + ":" + string2 + " as requested");
        this.g.put(this.d + "#" + string, string2);
    }

    public void a(String string, String string2, String string3, String string4) {
        this.f.a("Adding traced method parameter " + string2 + " for method " + string);
        String string5 = this.d + "#" + string;
        if (!this.j.containsKey(string5)) {
            this.j.put(string5, new ArrayList());
        }
        ArrayList<String> arrayList = this.j.get(string5);
        arrayList.add(string2);
        arrayList.add(string3);
        arrayList.add(string4);
    }

    public ArrayList<String> c(String string) {
        return this.j.get(this.d + "#" + string);
    }

    public boolean c(String string, String string2) {
        return this.a(this.k, string, string2);
    }

    public boolean d(String string, String string2) {
        return this.a(this.g, string, string2);
    }

    private boolean a(Map<String, String> map, String string, String string2) {
        if (map.get(this.d + "#" + string) != null && string2.equals(string2)) {
            return true;
        }
        return false;
    }

    public List<String> g() {
        return this.i;
    }

    public boolean d(String string) {
        return this.i.contains(string);
    }

    public void e(String string) {
        this.d = string;
    }

    public String h() {
        return this.d;
    }

    public String i() {
        return this.d.replaceAll("/", ".");
    }

    public String j() {
        return this.h.replaceAll("/", ".");
    }

    public String k() {
        if (this.d.contains("/")) {
            return this.d.substring(this.d.lastIndexOf("/") + 1);
        }
        return this.d;
    }

    public void f(String string) {
        this.h = string;
    }

    public String l() {
        return this.h;
    }

    public b a(byte[] arrby) {
        return new b(arrby, this.f());
    }

    public c a(c c2) {
        return this.e.a(c2);
    }

    public Collection<c> a(String string, String string2, String string3) {
        return this.e.a(string, string2, string3);
    }

    public void g(String string) {
        this.l.add(string);
    }

    public boolean h(String string) {
        return this.l.contains(string);
    }

    public Set<String> m() {
        return this.l;
    }
}

