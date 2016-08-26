/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.ab;
import com.growingio.a.a.d.hH;
import com.growingio.a.a.d.hT;
import com.growingio.a.a.d.hV;
import com.growingio.a.a.d.hY;
import com.growingio.a.a.d.hZ;
import com.growingio.a.a.d.id;

abstract class hX
extends Enum<hX> {
    public static final /* enum */ hX a = new hY("STRONG", 0);
    public static final /* enum */ hX b = new hZ("WEAK", 1);
    private static final /* synthetic */ hX[] c;

    public static hX[] a() {
        return (hX[])c.clone();
    }

    public static hX a(String string) {
        return (hX)((Object)Enum.valueOf(hX.class, string));
    }

    private hX() {
        super(string, n2);
    }

    abstract <K, V> id<K, V> a(hV<K, V> var1, hT<K, V> var2, V var3);

    abstract ab<Object> b();

    /* synthetic */ hX(String string, int n2, hH hH2) {
        this();
    }

    static {
        c = new hX[]{a, b};
    }
}

