/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.b.a;

import com.growingio.e.b.a.e;
import com.growingio.e.b.b.l;
import com.growingio.e.b.c;
import com.growingio.e.b.h;
import java.util.Queue;

public class b
implements c {
    String b;
    l c;
    Queue<e> d;

    public b(l l2, Queue<e> queue) {
        this.c = l2;
        this.b = l2.a();
        this.d = queue;
    }

    @Override
    public String a() {
        return this.b;
    }

    private void a(com.growingio.e.b.a.c c2, String string, Object[] arrobject, Throwable throwable) {
        this.a(c2, null, string, arrobject, throwable);
    }

    private void a(com.growingio.e.b.a.c c2, h h2, String string, Object[] arrobject, Throwable throwable) {
        e e2 = new e();
        e2.a(System.currentTimeMillis());
        e2.a(c2);
        e2.a(this.c);
        e2.a(this.b);
        e2.b(string);
        e2.a(arrobject);
        e2.a(throwable);
        e2.c(Thread.currentThread().getName());
        this.d.add(e2);
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public void a(String string) {
        this.a(com.growingio.e.b.a.c.e, string, null, null);
    }

    @Override
    public void a(String string, Object object) {
        this.a(com.growingio.e.b.a.c.e, string, new Object[]{object}, null);
    }

    @Override
    public void a(String string, Object object, Object object2) {
        this.a(com.growingio.e.b.a.c.e, string, new Object[]{object, object2}, null);
    }

    @Override
    public /* varargs */ void a(String string, Object ... arrobject) {
        this.a(com.growingio.e.b.a.c.e, string, arrobject, null);
    }

    @Override
    public void a(String string, Throwable throwable) {
        this.a(com.growingio.e.b.a.c.e, string, null, throwable);
    }

    @Override
    public boolean a(h h2) {
        return true;
    }

    @Override
    public void a(h h2, String string) {
        this.a(com.growingio.e.b.a.c.e, h2, string, null, null);
    }

    @Override
    public void a(h h2, String string, Object object) {
        this.a(com.growingio.e.b.a.c.e, h2, string, new Object[]{object}, null);
    }

    @Override
    public void a(h h2, String string, Object object, Object object2) {
        this.a(com.growingio.e.b.a.c.e, h2, string, new Object[]{object, object2}, null);
    }

    @Override
    public /* varargs */ void a(h h2, String string, Object ... arrobject) {
        this.a(com.growingio.e.b.a.c.e, h2, string, arrobject, null);
    }

    @Override
    public void a(h h2, String string, Throwable throwable) {
        this.a(com.growingio.e.b.a.c.e, h2, string, null, throwable);
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public void b(String string) {
        this.a(com.growingio.e.b.a.c.e, string, null, null);
    }

    @Override
    public void b(String string, Object object) {
        this.a(com.growingio.e.b.a.c.d, string, new Object[]{object}, null);
    }

    @Override
    public void b(String string, Object object, Object object2) {
        this.a(com.growingio.e.b.a.c.d, string, new Object[]{object, object2}, null);
    }

    @Override
    public /* varargs */ void b(String string, Object ... arrobject) {
        this.a(com.growingio.e.b.a.c.d, string, arrobject, null);
    }

    @Override
    public void b(String string, Throwable throwable) {
        this.a(com.growingio.e.b.a.c.d, string, null, throwable);
    }

    @Override
    public boolean b(h h2) {
        return true;
    }

    @Override
    public void b(h h2, String string) {
        this.a(com.growingio.e.b.a.c.d, h2, string, null, null);
    }

    @Override
    public void b(h h2, String string, Object object) {
        this.a(com.growingio.e.b.a.c.d, h2, string, new Object[]{object}, null);
    }

    @Override
    public void b(h h2, String string, Object object, Object object2) {
        this.a(com.growingio.e.b.a.c.d, h2, string, new Object[]{object, object2}, null);
    }

    @Override
    public /* varargs */ void b(h h2, String string, Object ... arrobject) {
        this.a(com.growingio.e.b.a.c.d, h2, string, arrobject, null);
    }

    @Override
    public void b(h h2, String string, Throwable throwable) {
        this.a(com.growingio.e.b.a.c.d, h2, string, null, throwable);
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public void c(String string) {
        this.a(com.growingio.e.b.a.c.c, string, null, null);
    }

    @Override
    public void c(String string, Object object) {
        this.a(com.growingio.e.b.a.c.c, string, new Object[]{object}, null);
    }

    @Override
    public void c(String string, Object object, Object object2) {
        this.a(com.growingio.e.b.a.c.c, string, new Object[]{object, object2}, null);
    }

    @Override
    public /* varargs */ void c(String string, Object ... arrobject) {
        this.a(com.growingio.e.b.a.c.c, string, arrobject, null);
    }

    @Override
    public void c(String string, Throwable throwable) {
        this.a(com.growingio.e.b.a.c.c, string, null, throwable);
    }

    @Override
    public boolean c(h h2) {
        return true;
    }

    @Override
    public void c(h h2, String string) {
        this.a(com.growingio.e.b.a.c.c, h2, string, null, null);
    }

    @Override
    public void c(h h2, String string, Object object) {
        this.a(com.growingio.e.b.a.c.c, h2, string, new Object[]{object}, null);
    }

    @Override
    public void c(h h2, String string, Object object, Object object2) {
        this.a(com.growingio.e.b.a.c.c, h2, string, new Object[]{object, object2}, null);
    }

    @Override
    public /* varargs */ void c(h h2, String string, Object ... arrobject) {
        this.a(com.growingio.e.b.a.c.c, h2, string, arrobject, null);
    }

    @Override
    public void c(h h2, String string, Throwable throwable) {
        this.a(com.growingio.e.b.a.c.c, h2, string, null, throwable);
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void d(String string) {
        this.a(com.growingio.e.b.a.c.b, string, null, null);
    }

    @Override
    public void d(String string, Object object) {
        this.a(com.growingio.e.b.a.c.b, string, new Object[]{object}, null);
    }

    @Override
    public void d(String string, Object object, Object object2) {
        this.a(com.growingio.e.b.a.c.b, string, new Object[]{object, object2}, null);
    }

    @Override
    public /* varargs */ void d(String string, Object ... arrobject) {
        this.a(com.growingio.e.b.a.c.b, string, arrobject, null);
    }

    @Override
    public void d(String string, Throwable throwable) {
        this.a(com.growingio.e.b.a.c.b, string, null, throwable);
    }

    @Override
    public boolean d(h h2) {
        return true;
    }

    @Override
    public void d(h h2, String string) {
        this.a(com.growingio.e.b.a.c.b, string, null, null);
    }

    @Override
    public void d(h h2, String string, Object object) {
        this.a(com.growingio.e.b.a.c.b, string, new Object[]{object}, null);
    }

    @Override
    public void d(h h2, String string, Object object, Object object2) {
        this.a(com.growingio.e.b.a.c.b, h2, string, new Object[]{object, object2}, null);
    }

    @Override
    public /* varargs */ void d(h h2, String string, Object ... arrobject) {
        this.a(com.growingio.e.b.a.c.b, h2, string, arrobject, null);
    }

    @Override
    public void d(h h2, String string, Throwable throwable) {
        this.a(com.growingio.e.b.a.c.b, h2, string, null, throwable);
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void e(String string) {
        this.a(com.growingio.e.b.a.c.a, string, null, null);
    }

    @Override
    public void e(String string, Object object) {
        this.a(com.growingio.e.b.a.c.a, string, new Object[]{object}, null);
    }

    @Override
    public void e(String string, Object object, Object object2) {
        this.a(com.growingio.e.b.a.c.a, string, new Object[]{object, object2}, null);
    }

    @Override
    public /* varargs */ void e(String string, Object ... arrobject) {
        this.a(com.growingio.e.b.a.c.a, string, arrobject, null);
    }

    @Override
    public void e(String string, Throwable throwable) {
        this.a(com.growingio.e.b.a.c.a, string, null, throwable);
    }

    @Override
    public boolean e(h h2) {
        return true;
    }

    @Override
    public void e(h h2, String string) {
        this.a(com.growingio.e.b.a.c.a, h2, string, null, null);
    }

    @Override
    public void e(h h2, String string, Object object) {
        this.a(com.growingio.e.b.a.c.a, h2, string, new Object[]{object}, null);
    }

    @Override
    public void e(h h2, String string, Object object, Object object2) {
        this.a(com.growingio.e.b.a.c.a, h2, string, new Object[]{object, object2}, null);
    }

    @Override
    public /* varargs */ void e(h h2, String string, Object ... arrobject) {
        this.a(com.growingio.e.b.a.c.a, h2, string, arrobject, null);
    }

    @Override
    public void e(h h2, String string, Throwable throwable) {
        this.a(com.growingio.e.b.a.c.a, h2, string, null, throwable);
    }
}

