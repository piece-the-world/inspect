/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.g.a;

import com.growingio.b.g.a.b;
import com.growingio.b.g.a.d;
import com.growingio.b.g.a.h;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class i
implements Serializable {
    protected d a;
    protected h b;
    protected Method[] c;

    public i(Object object, Object[] arrobject) {
        this.b = (h)object;
        this.a = this.b.a();
        this.c = this.a.c();
    }

    protected i() {
        this.b = null;
        this.a = null;
        this.c = null;
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.b);
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.b = (h)objectInputStream.readObject();
        this.a = this.b.a();
        this.c = this.a.c();
    }

    public final d a() {
        return this.a;
    }

    public final Object b() {
        return this.b;
    }

    public final void a(Object object) {
        this.b = (h)object;
        this.a = this.b.a();
        this.c = this.a.c();
        this.b.a(this);
    }

    public final String a(int n2) {
        char c2;
        String string = this.c[n2].getName();
        int n3 = 3;
        while ((c2 = string.charAt(n3++)) >= '0' && '9' >= c2) {
        }
        return string.substring(n3);
    }

    public final Class[] b(int n2) {
        return this.c[n2].getParameterTypes();
    }

    public final Class c(int n2) {
        return this.c[n2].getReturnType();
    }

    public Object a(String string) {
        Class class_ = this.a().a();
        try {
            return class_.getField(string).get(this.b());
        }
        catch (NoSuchFieldException var3_3) {
            throw new RuntimeException(var3_3.toString());
        }
        catch (IllegalAccessException var3_4) {
            throw new RuntimeException(var3_4.toString());
        }
    }

    public void a(String string, Object object) {
        Class class_ = this.a().a();
        try {
            class_.getField(string).set(this.b(), object);
        }
        catch (NoSuchFieldException var4_4) {
            throw new RuntimeException(var4_4.toString());
        }
        catch (IllegalAccessException var4_5) {
            throw new RuntimeException(var4_5.toString());
        }
    }

    public Object a(int n2, Object[] arrobject) throws Throwable {
        try {
            return this.c[n2].invoke(this.b(), arrobject);
        }
        catch (InvocationTargetException var3_3) {
            throw var3_3.getTargetException();
        }
        catch (IllegalAccessException var3_4) {
            throw new b(var3_4);
        }
    }
}

