/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.n.aa;
import com.growingio.a.a.n.ao;
import com.growingio.a.a.n.ar;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class aq<D extends GenericDeclaration> {
    private final D a;
    private final String b;
    private final ea<Type> c;

    aq(D d2, String string, Type[] arrtype) {
        aa.a(arrtype, "bound for type variable");
        this.a = (GenericDeclaration)aU.a(d2);
        this.b = aU.a(string);
        this.c = ea.a(arrtype);
    }

    public Type[] a() {
        return aa.a(this.c);
    }

    public D b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.b;
    }

    public String toString() {
        return this.b;
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public boolean equals(Object object) {
        if (ao.a) {
            if (object != null && Proxy.isProxyClass(object.getClass()) && Proxy.getInvocationHandler(object) instanceof ar) {
                ar ar2 = (ar)Proxy.getInvocationHandler(object);
                aq aq2 = ar.a(ar2);
                return this.b.equals(aq2.c()) && this.a.equals(aq2.b()) && this.c.equals(aq2.c);
            }
            return false;
        }
        if (object instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable)object;
            return this.b.equals(typeVariable.getName()) && this.a.equals(typeVariable.getGenericDeclaration());
        }
        return false;
    }
}

