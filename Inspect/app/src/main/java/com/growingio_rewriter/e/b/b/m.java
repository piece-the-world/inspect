/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.b.b;

import com.growingio.e.b.a;
import com.growingio.e.b.a.e;
import com.growingio.e.b.b.l;
import com.growingio.e.b.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

public class m
implements a {
    boolean a = false;
    final Map<String, l> b = new HashMap<String, l>();
    final LinkedBlockingQueue<e> c = new LinkedBlockingQueue();

    @Override
    public synchronized c a(String string) {
        l l2 = this.b.get(string);
        if (l2 == null) {
            l2 = new l(string, this.c, this.a);
            this.b.put(string, l2);
        }
        return l2;
    }

    public List<String> a() {
        return new ArrayList<String>(this.b.keySet());
    }

    public List<l> b() {
        return new ArrayList<l>(this.b.values());
    }

    public LinkedBlockingQueue<e> c() {
        return this.c;
    }

    public void d() {
        this.a = true;
    }

    public void e() {
        this.b.clear();
        this.c.clear();
    }
}

