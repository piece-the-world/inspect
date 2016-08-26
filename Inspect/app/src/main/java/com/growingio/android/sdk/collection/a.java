/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  android.view.View
 */
package com.growingio.android.sdk.collection;

import android.util.SparseArray;
import android.view.View;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.b.l;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.b;
import com.growingio.android.sdk.utils.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class a {
    private final String a;
    private SparseArray b = new SparseArray();
    private List c;
    private WeakReference d;
    private long e;
    private String f;
    private l g;

    public a(String string, long l2, View view, String string2) {
        this.g = new b(this);
        this.e = l2;
        this.d = new WeakReference<View>(view);
        this.f = string;
        this.a = string2;
    }

    public List a() {
        this.c = new ArrayList();
        if (this.d != null && this.d.get() != null) {
            m.a((View)this.d.get(), this.a, this.g);
        }
        ArrayList<com.growingio.android.sdk.b.a> arrayList = new ArrayList<com.growingio.android.sdk.b.a>(2);
        GConfig gConfig = GConfig.o();
        if (gConfig.c() && this.c.size() > 0) {
            com.growingio.android.sdk.b.a a2 = com.growingio.android.sdk.b.a.a();
            a2.a = this.c;
            a2.b = this.e;
            a2.g = this.f;
            arrayList.add(a2);
        }
        return arrayList;
    }

    private com.growingio.android.sdk.b.b a(i i2) {
        com.growingio.android.sdk.b.b b2 = new com.growingio.android.sdk.b.b();
        b2.a = i2.j;
        b2.b = System.currentTimeMillis();
        b2.c = i2.e;
        b2.d = i2.k;
        b2.e = i2.l;
        return b2;
    }

    static /* synthetic */ SparseArray a(a a2) {
        return a2.b;
    }

    static /* synthetic */ com.growingio.android.sdk.b.b a(a a2, i i2) {
        return a2.a(i2);
    }

    static /* synthetic */ List b(a a2) {
        return a2.c;
    }
}

