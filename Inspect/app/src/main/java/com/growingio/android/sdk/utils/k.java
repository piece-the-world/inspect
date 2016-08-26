/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  com.tencent.smtt.sdk.ValueCallback
 */
package com.growingio.android.sdk.utils;

import com.growingio.android.sdk.b.f;
import com.growingio.android.sdk.utils.i;
import com.growingio.android.sdk.utils.l;
import com.tencent.smtt.sdk.ValueCallback;

final class k
implements ValueCallback {
    final /* synthetic */ l a;

    k(l l2) {
        this.a = l2;
    }

    public void a(String string) {
        this.a.a(i.b(string));
    }

    public /* synthetic */ void onReceiveValue(Object object) {
        this.a((String)object);
    }
}

