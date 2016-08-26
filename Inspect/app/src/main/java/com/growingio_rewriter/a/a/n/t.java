/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.b.aP;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.cx;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.oP;
import com.growingio.a.a.n.F;
import com.growingio.a.a.n.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.Collection;

public final class t
implements AnnotatedElement {
    private final l<?, ?> a;
    private final int b;
    private final F<?> c;
    private final ea<Annotation> d;

    t(l<?, ?> l2, int n2, F<?> f2, Annotation[] arrannotation) {
        this.a = l2;
        this.b = n2;
        this.c = f2;
        this.d = ea.a(arrannotation);
    }

    public F<?> a() {
        return this.c;
    }

    public l<?, ?> b() {
        return this.a;
    }

    @Override
    public boolean isAnnotationPresent(Class<? extends Annotation> class_) {
        return this.getAnnotation(class_) != null;
    }

    public <A extends Annotation> A getAnnotation(Class<A> class_) {
        aU.a(class_);
        oP<Annotation> oP2 = this.d.k_();
        while (oP2.hasNext()) {
            Annotation annotation = oP2.next();
            if (!class_.isInstance(annotation)) continue;
            return (A)((Annotation)class_.cast(annotation));
        }
        return null;
    }

    @Override
    public Annotation[] getAnnotations() {
        return this.getDeclaredAnnotations();
    }

    public <A extends Annotation> A[] getAnnotationsByType(Class<A> class_) {
        return this.getDeclaredAnnotationsByType(class_);
    }

    @Override
    public Annotation[] getDeclaredAnnotations() {
        return this.d.toArray(new Annotation[this.d.size()]);
    }

    public <A extends Annotation> A getDeclaredAnnotation(Class<A> class_) {
        aU.a(class_);
        return (A)((Annotation)cx.a(this.d).a(class_).e().d());
    }

    public <A extends Annotation> A[] getDeclaredAnnotationsByType(Class<A> class_) {
        return (Annotation[])cx.a(this.d).a(class_).b(class_);
    }

    public boolean equals(Object object) {
        if (object instanceof t) {
            t t2 = (t)object;
            return this.b == t2.b && this.a.equals(t2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.b;
    }

    public String toString() {
        return this.c + " arg" + this.b;
    }
}

