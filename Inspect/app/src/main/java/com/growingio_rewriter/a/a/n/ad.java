/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.n.ab;
import com.growingio.a.a.n.ae;
import com.growingio.a.a.n.af;
import com.growingio.a.a.n.ag;
import com.growingio.a.a.n.ah;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

abstract class ad
extends Enum<ad> {
    public static final /* enum */ ad a = new ae("OWNED_BY_ENCLOSING_CLASS", 0);
    public static final /* enum */ ad b = new ag("LOCAL_CLASS_HAS_NO_OWNER", 1);
    static final ad c;
    private static final /* synthetic */ ad[] d;

    public static ad[] a() {
        return (ad[])d.clone();
    }

    public static ad a(String string) {
        return (ad)((Object)Enum.valueOf(ad.class, string));
    }

    private ad() {
        super(string, n2);
    }

    abstract Class<?> a(Class<?> var1);

    private static ad b() {
        Class<?> class_ = new ah().getClass();
        ParameterizedType parameterizedType = (ParameterizedType)class_.getGenericSuperclass();
        for (ad ad2 : ad.a()) {
            if (ad2.a(af.class) != parameterizedType.getOwnerType()) continue;
            return ad2;
        }
        throw new AssertionError();
    }

    /* synthetic */ ad(String string, int n2, ab ab2) {
        this();
    }

    static {
        d = new ad[]{a, b};
        c = ad.b();
    }
}

