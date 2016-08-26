/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class nt
implements Serializable {
    final Object g;
    final Object h;
    private static final long a = 0;

    nt(Object object, Object object2) {
        this.g = aU.a(object);
        this.h = object2 == null ? this : object2;
    }

    Object e() {
        return this.g;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String toString() {
        Object object = this.h;
        synchronized (object) {
            return this.g.toString();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        Object object = this.h;
        synchronized (object) {
            objectOutputStream.defaultWriteObject();
        }
    }
}

