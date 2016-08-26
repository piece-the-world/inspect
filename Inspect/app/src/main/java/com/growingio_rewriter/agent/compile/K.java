/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.L;
import com.growingio.agent.compile.VdsRewriterAgent;
import com.growingio.d.a.a.j;
import com.growingio.d.a.a.o;
import com.growingio.d.a.u;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

class K {
    private final j a;

    public K(j j2) {
        this.a = j2;
    }

    public K a() {
        this.a.a_(1);
        return this;
    }

    public K b() {
        this.a.a(u.a(VdsRewriterAgent.a()));
        this.a.a("packageAccessLock");
        this.a.a(u.a(Class.class), new o("getDeclaredField", "(Ljava/lang/String;)Ljava/lang/reflect/Field;"));
        this.a.i();
        this.a.a_(4);
        this.a.a(u.a(Field.class), new o("setAccessible", "(Z)V"));
        this.a.a_(1);
        this.a.a(u.a(Field.class), new o("get", "(Ljava/lang/Object;)Ljava/lang/Object;"));
        return this;
    }

    public K a(String string) {
        o o2 = new o("dummy", string);
        this.a.b(o2.d().length);
        u u2 = u.a(Object.class);
        this.a.h(u2);
        for (int i2 = 0; i2 < o2.d().length; ++i2) {
            this.a.i();
            this.a.b(i2);
            this.a.c(i2);
            this.a.c(u2);
        }
        return this;
    }

    public /* varargs */ K a(Runnable ... arrrunnable) {
        this.a.b(arrrunnable.length);
        u u2 = u.b("java/lang/Object");
        this.a.h(u2);
        for (int i2 = 0; i2 < arrrunnable.length; ++i2) {
            this.a.i();
            this.a.b(i2);
            arrrunnable[i2].run();
            this.a.c(u2);
        }
        return this;
    }

    public K b(String string) {
        this.b();
        this.a.a("PRINT_TO_INFO_LOG");
        this.a.a_(1);
        this.a(new L(this, string));
        this.c();
        return this;
    }

    public K c() {
        return this.a(true);
    }

    public K a(boolean bl2) {
        this.a.d(u.a(InvocationHandler.class), new o("invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;"));
        if (bl2) {
            this.a.g();
        }
        return this;
    }

    public K c(String string) {
        this.a.a(string);
        this.a.a_(1);
        return this;
    }

    static /* synthetic */ j a(K k2) {
        return k2.a;
    }
}

