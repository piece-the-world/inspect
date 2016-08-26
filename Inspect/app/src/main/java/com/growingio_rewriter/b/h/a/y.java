/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.h.a;

import com.growingio.b.h.a.c;
import com.growingio.b.h.a.d;
import com.growingio.b.h.a.e;
import com.growingio.b.h.a.m;
import com.growingio.b.h.a.z;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.security.AccessController;
import java.security.PrivilegedActionException;

class y
implements Serializable {
    private String a;
    private String[] b;
    private byte[] c;
    private c d;

    y(Class class_, byte[] arrby, c c2) {
        this.c = arrby;
        this.d = c2;
        this.a = class_.getSuperclass().getName();
        Class<?>[] arrclass = class_.getInterfaces();
        int n2 = arrclass.length;
        this.b = new String[n2 - 1];
        String string = m.class.getName();
        String string2 = d.class.getName();
        for (int i2 = 0; i2 < n2; ++i2) {
            String string3 = arrclass[i2].getName();
            if (string3.equals(string) || string3.equals(string2)) continue;
            this.b[i2] = string3;
        }
    }

    protected Class a(String string) throws ClassNotFoundException {
        try {
            return (Class)AccessController.doPrivileged(new z(this, string));
        }
        catch (PrivilegedActionException var2_2) {
            throw new RuntimeException("cannot load the class: " + string, var2_2.getException());
        }
    }

    Object a() throws ObjectStreamException {
        try {
            int n2 = this.b.length;
            Class[] arrclass = new Class[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                arrclass[i2] = this.a(this.b[i2]);
            }
            e e2 = new e();
            e2.b(this.a(this.a));
            e2.a(arrclass);
            d d2 = (d)e2.a(this.c).newInstance();
            d2.a(this.d);
            return d2;
        }
        catch (ClassNotFoundException var1_2) {
            throw new InvalidClassException(var1_2.getMessage());
        }
        catch (InstantiationException var1_3) {
            throw new InvalidObjectException(var1_3.getMessage());
        }
        catch (IllegalAccessException var1_4) {
            throw new InvalidClassException(var1_4.getMessage());
        }
    }
}

