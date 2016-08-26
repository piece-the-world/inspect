/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ec;
import com.growingio.a.a.n.aa;
import com.growingio.a.a.n.ab;
import com.growingio.a.a.n.ak;
import com.growingio.a.a.n.al;
import com.growingio.a.a.n.am;
import com.growingio.a.a.n.an;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

abstract class aj
extends Enum<aj> {
    public static final /* enum */ aj a = new ak("JAVA6", 0);
    public static final /* enum */ aj b = new al("JAVA7", 1);
    public static final /* enum */ aj c = new am("JAVA8", 2);
    static final aj d;
    private static final /* synthetic */ aj[] e;

    public static aj[] a() {
        return (aj[])e.clone();
    }

    public static aj a(String string) {
        return (aj)((Object)Enum.valueOf(aj.class, string));
    }

    private aj() {
        super(string, n2);
    }

    abstract Type a(Type var1);

    abstract Type b(Type var1);

    String c(Type type) {
        return aa.d(type);
    }

    final ea<Type> a(Type[] arrtype) {
        ec<Type> ec2 = ea.g();
        for (Type type : arrtype) {
            ec2.c(this.b(type));
        }
        return ec2.b();
    }

    /* synthetic */ aj(String string, int n2, ab ab2) {
        this();
    }

    static {
        e = new aj[]{a, b, c};
        d = AnnotatedElement.class.isAssignableFrom(TypeVariable.class) ? c : (new an().a() instanceof Class ? b : a);
    }
}

