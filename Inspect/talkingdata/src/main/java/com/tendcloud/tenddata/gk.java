/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class gk {
    private final Object a;
    private final Method b;
    private final int c;
    private boolean d = true;

    gk(Object object, Method method) {
        if (object == null) {
            throw new NullPointerException("EventHandler target cannot be null.");
        }
        if (method == null) {
            throw new NullPointerException("EventHandler method cannot be null.");
        }
        this.a = object;
        this.b = method;
        method.setAccessible(true);
        int n2 = 31;
        this.c = (31 + method.hashCode()) * 31 + object.hashCode();
    }

    public boolean a() {
        return this.d;
    }

    public void b() {
        this.d = false;
    }

    public void handleEvent(Object object) {
        if (!this.d) {
            throw new IllegalStateException(this.toString() + " has been invalidated and can no longer handle events.");
        }
        try {
            this.b.invoke(this.a, object);
        }
        catch (IllegalAccessException var2_2) {
            throw new AssertionError(var2_2);
        }
        catch (InvocationTargetException var2_3) {
            if (var2_3.getCause() instanceof Error) {
                throw (Error)var2_3.getCause();
            }
            throw var2_3;
        }
    }

    public String toString() {
        return "[EventHandler " + this.b + "]";
    }

    public int hashCode() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        gk gk2 = (gk)object;
        return this.b.equals(gk2.b) && this.a == gk2.a;
    }
}

