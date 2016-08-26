/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aC;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aW;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.n.ab;
import com.growingio.a.a.n.ac;
import com.growingio.a.a.n.ad;
import com.growingio.a.a.n.aj;
import com.growingio.a.a.n.ap;
import com.growingio.a.a.n.aq;
import com.growingio.a.a.n.ar;
import com.growingio.a.a.n.as;
import com.growingio.a.a.n.u;
import java.lang.reflect.Array;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

final class aa {
    private static final com.growingio.a.a.b.aq<Type, String> a = new ab();
    private static final aC b = aC.a(", ").b("null");

    static Type a(Type type) {
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType)type;
            Type[] arrtype = wildcardType.getLowerBounds();
            aU.a(arrtype.length <= 1, (Object)"Wildcard cannot have more than one lower bounds.");
            if (arrtype.length == 1) {
                return aa.c(aa.a(arrtype[0]));
            }
            Type[] arrtype2 = wildcardType.getUpperBounds();
            aU.a(arrtype2.length == 1, (Object)"Wildcard should have only one upper bound.");
            return aa.b(aa.a(arrtype2[0]));
        }
        return aj.d.a(type);
    }

    static /* varargs */ ParameterizedType a(Type type, Class<?> class_, Type ... arrtype) {
        if (type == null) {
            return aa.a(class_, arrtype);
        }
        aU.a(arrtype);
        aU.a(class_.getEnclosingClass() != null, "Owner type for unenclosed %s", class_);
        return new ap(type, class_, arrtype);
    }

    static /* varargs */ ParameterizedType a(Class<?> class_, Type ... arrtype) {
        return new ap(ad.c.a(class_), class_, arrtype);
    }

    static /* varargs */ <D extends GenericDeclaration> TypeVariable<D> a(D d2, String string, Type ... arrtype) {
        Type[] arrtype2;
        if (arrtype.length == 0) {
            Type[] arrtype3 = new Type[1];
            arrtype2 = arrtype3;
            arrtype3[0] = Object.class;
        } else {
            arrtype2 = arrtype;
        }
        return aa.b(d2, string, arrtype2);
    }

    static WildcardType b(Type type) {
        return new as(new Type[0], new Type[]{type});
    }

    static WildcardType c(Type type) {
        return new as(new Type[]{type}, new Type[]{Object.class});
    }

    static String d(Type type) {
        return type instanceof Class ? ((Class)type).getName() : type.toString();
    }

    static Type e(Type type) {
        aU.a(type);
        AtomicReference atomicReference = new AtomicReference();
        new ac(atomicReference).a(type);
        return (Type)atomicReference.get();
    }

    private static Type b(Type[] arrtype) {
        for (Type type : arrtype) {
            Class class_;
            Type type2 = aa.e(type);
            if (type2 == null) continue;
            if (type2 instanceof Class && (class_ = (Class)type2).isPrimitive()) {
                return class_;
            }
            return aa.b(type2);
        }
        return null;
    }

    private static <D extends GenericDeclaration> TypeVariable<D> b(D d2, String string, Type[] arrtype) {
        aq<D> aq2 = new aq<D>(d2, string, arrtype);
        TypeVariable typeVariable = (TypeVariable)u.a(TypeVariable.class, new ar(aq2));
        return typeVariable;
    }

    private static Type[] b(Collection<Type> collection) {
        return collection.toArray(new Type[collection.size()]);
    }

    private static Iterable<Type> b(Iterable<Type> iterable) {
        return fL.c(iterable, aW.a(aW.a(Object.class)));
    }

    private static void b(Type[] arrtype, String string) {
        for (Type type : arrtype) {
            if (!(type instanceof Class)) continue;
            Class class_ = (Class)type;
            aU.a(!class_.isPrimitive(), "Primitive type '%s' used as %s", (Object)class_, (Object)string);
        }
    }

    static Class<?> a(Class<?> class_) {
        return Array.newInstance(class_, 0).getClass();
    }

    private aa() {
    }

    static /* synthetic */ Type a(Type[] arrtype) {
        return aa.b(arrtype);
    }

    static /* synthetic */ void a(Type[] arrtype, String string) {
        aa.b(arrtype, string);
    }

    static /* synthetic */ Type[] a(Collection collection) {
        return aa.b(collection);
    }

    static /* synthetic */ com.growingio.a.a.b.aq a() {
        return a;
    }

    static /* synthetic */ aC b() {
        return b;
    }

    static /* synthetic */ Iterable a(Iterable iterable) {
        return aa.b(iterable);
    }
}

