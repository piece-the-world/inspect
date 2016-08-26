/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ek;
import com.growingio.a.a.n.B;
import com.growingio.a.a.n.C;
import com.growingio.a.a.n.aa;
import com.growingio.a.a.n.ao;
import com.growingio.a.a.n.x;
import com.growingio.a.a.n.y;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

class A {
    private final ei<C, Type> a;

    A() {
        this.a = ei.i();
    }

    private A(ei<C, Type> ei2) {
        this.a = ei2;
    }

    final A a(Map<C, ? extends Type> map) {
        ek<C, Type> ek2 = ei.j();
        ek2.b(this.a);
        for (Map.Entry<C, ? extends Type> entry : map.entrySet()) {
            Type type;
            C c2 = entry.getKey();
            aU.a(!c2.b(type = entry.getValue()), "Type variable %s bound to itself", (Object)c2);
            ek2.b(c2, type);
        }
        return new A(ek2.b());
    }

    final Type a(TypeVariable<?> typeVariable) {
        A a2 = this;
        B b2 = new B(this, typeVariable, a2);
        return this.a(typeVariable, b2);
    }

    Type a(TypeVariable<?> typeVariable, A a2) {
        Type type = this.a.get(new C(typeVariable));
        if (type == null) {
            Object[] arrobject = typeVariable.getBounds();
            if (arrobject.length == 0) {
                return typeVariable;
            }
            Object[] arrobject2 = x.a(new x(a2, null), (Type[])arrobject);
            if (ao.a && Arrays.equals(arrobject, arrobject2)) {
                return typeVariable;
            }
            return aa.a(typeVariable.getGenericDeclaration(), typeVariable.getName(), (Type[])arrobject2);
        }
        return new x(a2, null).b(type);
    }
}

