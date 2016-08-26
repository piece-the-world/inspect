/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.g;

import com.growingio.b.b;
import com.growingio.b.n;
import java.util.HashMap;
import java.util.UUID;

public abstract class a {
    public static HashMap<String, a> a = new HashMap<K, V>();
    private final String b;

    public a(String string) {
        String string2 = UUID.randomUUID().toString();
        a.put(string2, this);
        this.b = "((Callback) Callback.callbacks.get(\"" + string2 + "\")).result(new Object[]{" + string + "});";
    }

    public /* varargs */ abstract void a(Object ... var1);

    public String toString() {
        return this.a();
    }

    public String a() {
        return this.b;
    }

    public static void a(n n2, a a2) throws b {
        n2.f(a2.toString());
    }

    public static void b(n n2, a a2) throws b {
        n2.a(a2.toString(), false);
    }

    public static void a(n n2, a a2, boolean bl2) throws b {
        n2.a(a2.toString(), bl2);
    }

    public static int a(n n2, a a2, int n3) throws b {
        return n2.a(n3, a2.toString());
    }
}

