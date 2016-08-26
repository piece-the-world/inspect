/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ec;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.fh;
import com.growingio.a.a.d.oP;
import com.growingio.a.a.m.z;
import com.growingio.a.a.n.C;
import com.growingio.a.a.n.G;
import com.growingio.a.a.n.H;
import com.growingio.a.a.n.I;
import com.growingio.a.a.n.J;
import com.growingio.a.a.n.K;
import com.growingio.a.a.n.O;
import com.growingio.a.a.n.Y;
import com.growingio.a.a.n.aa;
import com.growingio.a.a.n.aj;
import com.growingio.a.a.n.l;
import com.growingio.a.a.n.v;
import com.growingio.a.a.n.w;
import com.growingio.a.a.n.x;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Map;

public abstract class F<T>
extends v<T>
implements Serializable {
    private final Type a;
    private transient x b;

    protected F() {
        this.a = this.a();
        aU.b(!(this.a instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", (Object)this.a);
    }

    protected F(Class<?> class_) {
        Type type = super.a();
        this.a = type instanceof Class ? type : F.a(class_).b((Type)type).a;
    }

    private F(Type type) {
        this.a = aU.a(type);
    }

    public static <T> F<T> a(Class<T> class_) {
        return new O(class_);
    }

    public static F<?> a(Type type) {
        return new O(type);
    }

    public final Class<? super T> b() {
        Class<T> class_;
        Class<T> class_2 = class_ = this.o().k_().next();
        return class_2;
    }

    public final Type c() {
        return this.a;
    }

    public final <X> F<T> a(w<X> w2, F<X> f2) {
        x x2 = new x().a(ei.c(new C(w2.a), f2.a));
        return new O(x2.b(this.a));
    }

    public final <X> F<T> a(w<X> w2, Class<X> class_) {
        return this.a(w2, F.a(class_));
    }

    public final F<?> b(Type type) {
        aU.a(type);
        x x2 = this.b;
        if (x2 == null) {
            x2 = this.b = x.a(this.a);
        }
        return F.a(x2.b(type));
    }

    private Type[] a(Type[] arrtype) {
        for (int i2 = 0; i2 < arrtype.length; ++i2) {
            arrtype[i2] = this.b(arrtype[i2]).c();
        }
        return arrtype;
    }

    private F<?> e(Type type) {
        F f2 = this.b(type);
        f2.b = this.b;
        return f2;
    }

    final F<? super T> d() {
        if (this.a instanceof TypeVariable) {
            return this.f(((TypeVariable)this.a).getBounds()[0]);
        }
        if (this.a instanceof WildcardType) {
            return this.f(((WildcardType)this.a).getUpperBounds()[0]);
        }
        Type type = this.b().getGenericSuperclass();
        if (type == null) {
            return null;
        }
        F f2 = this.e(type);
        return f2;
    }

    private F<? super T> f(Type type) {
        F f2 = F.a(type);
        if (f2.b().isInterface()) {
            return null;
        }
        F f3 = f2;
        return f3;
    }

    final ea<F<? super T>> e() {
        if (this.a instanceof TypeVariable) {
            return this.b(((TypeVariable)this.a).getBounds());
        }
        if (this.a instanceof WildcardType) {
            return this.b(((WildcardType)this.a).getUpperBounds());
        }
        ec ec2 = ea.g();
        for (Type type : this.b().getGenericInterfaces()) {
            F f2 = this.e(type);
            ec2.c(f2);
        }
        return ec2.b();
    }

    private ea<F<? super T>> b(Type[] arrtype) {
        ec ec2 = ea.g();
        for (Type type : arrtype) {
            F f2 = F.a(type);
            if (!f2.b().isInterface()) continue;
            ec2.c(f2);
        }
        return ec2.b();
    }

    public final F<T> f() {
        return new Y(this);
    }

    public final F<? super T> b(Class<? super T> class_) {
        aU.a(this.e(class_), "%s is not a super class of %s", class_, (Object)this);
        if (this.a instanceof TypeVariable) {
            return this.a(class_, ((TypeVariable)this.a).getBounds());
        }
        if (this.a instanceof WildcardType) {
            return this.a(class_, ((WildcardType)this.a).getUpperBounds());
        }
        if (class_.isArray()) {
            return this.f(class_);
        }
        F f2 = this.e(F.d(class_).a);
        return f2;
    }

    public final F<? extends T> c(Class<?> class_) {
        aU.a(!(this.a instanceof TypeVariable), "Cannot get subtype of type variable <%s>", (Object)this);
        if (this.a instanceof WildcardType) {
            return this.b(class_, ((WildcardType)this.a).getLowerBounds());
        }
        if (this.g()) {
            return this.g(class_);
        }
        aU.a(this.b().isAssignableFrom(class_), "%s isn't a subclass of %s", class_, (Object)this);
        Type type = this.h(class_);
        F f2 = F.a(type);
        return f2;
    }

    public final boolean a(F<?> f2) {
        return f2.d(this.c());
    }

    public final boolean c(Type type) {
        return F.a(type).d(this.c());
    }

    public final boolean b(F<?> f2) {
        return this.d(f2.c());
    }

    public final boolean d(Type type) {
        aU.a(type);
        if (type instanceof WildcardType) {
            return F.d(((WildcardType)type).getLowerBounds()).b(this.a);
        }
        if (this.a instanceof WildcardType) {
            return F.d(((WildcardType)this.a).getUpperBounds()).a(type);
        }
        if (this.a instanceof TypeVariable) {
            return this.a.equals(type) || F.d(((TypeVariable)this.a).getBounds()).a(type);
        }
        if (this.a instanceof GenericArrayType) {
            return super.b((GenericArrayType)this.a);
        }
        if (type instanceof Class) {
            return this.e((Class)type);
        }
        if (type instanceof ParameterizedType) {
            return this.a((ParameterizedType)type);
        }
        if (type instanceof GenericArrayType) {
            return this.a((GenericArrayType)type);
        }
        return false;
    }

    public final boolean g() {
        return this.k() != null;
    }

    public final boolean h() {
        return this.a instanceof Class && ((Class)this.a).isPrimitive();
    }

    public final F<T> i() {
        if (this.h()) {
            Class class_ = (Class)this.a;
            return F.a(z.b(class_));
        }
        return this;
    }

    private boolean n() {
        return z.b().contains(this.a);
    }

    public final F<T> j() {
        if (this.n()) {
            Class class_ = (Class)this.a;
            return F.a(z.c(class_));
        }
        return this;
    }

    public final F<?> k() {
        Type type = aa.e(this.a);
        if (type == null) {
            return null;
        }
        return F.a(type);
    }

    public final l<T, Object> a(Method method) {
        aU.a(this.e(method.getDeclaringClass()), "%s not declared by %s", (Object)method, (Object)this);
        return new G(this, method);
    }

    public final l<T, T> a(Constructor<?> constructor) {
        aU.a(constructor.getDeclaringClass() == this.b(), "%s not declared by %s", constructor, this.b());
        return new H(this, constructor);
    }

    public boolean equals(Object object) {
        if (object instanceof F) {
            F f2 = (F)object;
            return this.a.equals(f2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return aa.d(this.a);
    }

    protected Object l() {
        return F.a(new x().b(this.a));
    }

    final F<T> m() {
        new I(this).a(this.a);
        return this;
    }

    private boolean e(Class<?> class_) {
        oP<Class<T>> oP2 = this.o().k_();
        while (oP2.hasNext()) {
            Class<T> class_2 = oP2.next();
            if (!class_.isAssignableFrom(class_2)) continue;
            return true;
        }
        return false;
    }

    private boolean a(ParameterizedType parameterizedType) {
        Class class_ = F.a(parameterizedType).b();
        if (!this.e(class_)) {
            return false;
        }
        TypeVariable<Class<?>>[] arrtypeVariable = class_.getTypeParameters();
        Type[] arrtype = parameterizedType.getActualTypeArguments();
        for (int i2 = 0; i2 < arrtypeVariable.length; ++i2) {
            if (super.g(arrtype[i2])) continue;
            return false;
        }
        return true;
    }

    private boolean a(GenericArrayType genericArrayType) {
        if (this.a instanceof Class) {
            Class class_ = (Class)this.a;
            if (!class_.isArray()) {
                return false;
            }
            return F.a(class_.getComponentType()).d(genericArrayType.getGenericComponentType());
        }
        if (this.a instanceof GenericArrayType) {
            GenericArrayType genericArrayType2 = (GenericArrayType)this.a;
            return F.a(genericArrayType2.getGenericComponentType()).d(genericArrayType.getGenericComponentType());
        }
        return false;
    }

    private boolean b(GenericArrayType genericArrayType) {
        if (this.a instanceof Class) {
            Class class_ = (Class)this.a;
            if (!class_.isArray()) {
                return class_.isAssignableFrom(Object[].class);
            }
            return F.a(genericArrayType.getGenericComponentType()).d(class_.getComponentType());
        }
        if (this.a instanceof GenericArrayType) {
            return F.a(genericArrayType.getGenericComponentType()).d(((GenericArrayType)this.a).getGenericComponentType());
        }
        return false;
    }

    private boolean g(Type type) {
        if (this.a.equals(type)) {
            return true;
        }
        if (type instanceof WildcardType) {
            return F.c(((WildcardType)type).getUpperBounds()).b(this.a) && F.c(((WildcardType)type).getLowerBounds()).a(this.a);
        }
        return false;
    }

    private static K c(Type[] arrtype) {
        return new K(arrtype, false);
    }

    private static K d(Type[] arrtype) {
        return new K(arrtype, true);
    }

    private fg<Class<? super T>> o() {
        fh fh2 = fg.l();
        new J(this, fh2).a(this.a);
        fg<Class<? super T>> fg2 = fh2.b();
        return fg2;
    }

    static <T> F<? extends T> d(Class<T> class_) {
        Type type;
        if (class_.isArray()) {
            Type type2 = aa.a(F.d(class_.getComponentType()).a);
            F f2 = F.a(type2);
            return f2;
        }
        Type[] arrtype = class_.getTypeParameters();
        Type type3 = type = class_.isMemberClass() && !Modifier.isStatic(class_.getModifiers()) ? F.d(class_.getEnclosingClass()).a : null;
        if (arrtype.length > 0 || type != null && type != class_.getEnclosingClass()) {
            F f3 = F.a(aa.a(type, class_, arrtype));
            return f3;
        }
        return F.a(class_);
    }

    private F<? super T> a(Class<? super T> class_, Type[] arrtype) {
        for (Type type : arrtype) {
            F f2 = F.a(type);
            if (!f2.d(class_)) continue;
            F<? super T> f3 = f2.b(class_);
            return f3;
        }
        throw new IllegalArgumentException(class_ + " isn't a super type of " + this);
    }

    private F<? extends T> b(Class<?> class_, Type[] arrtype) {
        int n2 = 0;
        Type[] arrtype2 = arrtype;
        int n3 = arrtype2.length;
        if (n2 < n3) {
            Type type = arrtype2[n2];
            F f2 = F.a(type);
            return f2.c(class_);
        }
        throw new IllegalArgumentException(class_ + " isn't a subclass of " + this);
    }

    private F<? super T> f(Class<? super T> class_) {
        F f2 = aU.a(this.k(), "%s isn't a super type of %s", class_, (Object)this);
        F f3 = f2.b(class_.getComponentType());
        F f4 = F.a(F.h(f3.a));
        return f4;
    }

    private F<? extends T> g(Class<?> class_) {
        F f2 = this.k().c(class_.getComponentType());
        F f3 = F.a(F.h(f2.a));
        return f3;
    }

    private Type h(Class<?> class_) {
        if (this.a instanceof Class && (class_.getTypeParameters().length == 0 || this.b().getTypeParameters().length != 0)) {
            return class_;
        }
        F f2 = F.d(class_);
        Type type = f2.b(this.b()).a;
        return new x().a(type, this.a).b(f2.a);
    }

    private static Type h(Type type) {
        return aj.b.a(type);
    }

    static /* synthetic */ Type[] a(F f2, Type[] arrtype) {
        return f2.a(arrtype);
    }

    static /* synthetic */ fg c(F f2) {
        return f2.o();
    }

    static /* synthetic */ Type d(F f2) {
        return f2.a;
    }

    /* synthetic */ F(Type type, G g2) {
        this(type);
    }
}

