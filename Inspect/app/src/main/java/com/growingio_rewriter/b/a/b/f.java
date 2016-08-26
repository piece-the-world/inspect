/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a.b;

import com.growingio.b.a.Q;
import com.growingio.b.a.b.e;
import com.growingio.b.a.b.p;
import com.growingio.b.a.b.q;
import com.growingio.b.g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;

public class f
extends p {
    p a;
    p[] b;

    public f(Q q2) {
        super('[', q2);
        this.a = null;
        this.b = null;
    }

    public f(p p2, Q q2) {
        super('[', q2);
        this.a = p2;
        this.b = null;
    }

    @Override
    Object a(ClassLoader classLoader, g g2, Method method) throws ClassNotFoundException {
        Class class_;
        if (this.b == null) {
            throw new ClassNotFoundException("no array elements found: " + method.getName());
        }
        int n2 = this.b.length;
        if (this.a == null) {
            class_ = method.getReturnType().getComponentType();
            if (class_ == null || n2 > 0) {
                throw new ClassNotFoundException("broken array type: " + method.getName());
            }
        } else {
            class_ = this.a.a(classLoader);
        }
        Object object = Array.newInstance(class_, n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            Array.set(object, i2, this.b[i2].a(classLoader, g2, method));
        }
        return object;
    }

    @Override
    Class a(ClassLoader classLoader) throws ClassNotFoundException {
        if (this.a == null) {
            throw new ClassNotFoundException("no array type specified");
        }
        Object object = Array.newInstance(this.a.a(classLoader), 0);
        return object.getClass();
    }

    public p a() {
        return this.a;
    }

    public p[] b() {
        return this.b;
    }

    public void a(p[] arrp) {
        this.b = arrp;
        if (arrp != null && arrp.length > 0) {
            this.a = arrp[0];
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("{");
        if (this.b != null) {
            for (int i2 = 0; i2 < this.b.length; ++i2) {
                stringBuffer.append(this.b[i2].toString());
                if (i2 + 1 >= this.b.length) continue;
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    @Override
    public void a(e e2) throws IOException {
        int n2 = this.b == null ? 0 : this.b.length;
        e2.f(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            this.b[i2].a(e2);
        }
    }

    @Override
    public void a(q q2) {
        q2.a(this);
    }
}

