/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.webkit.ValueCallback
 */
package com.growingio.android.sdk.utils;

import android.webkit.ValueCallback;
import com.growingio.android.sdk.b.f;
import com.growingio.android.sdk.utils.i;
import com.growingio.android.sdk.utils.l;

final class j
implements ValueCallback {
    final /* synthetic */ l a;

    j(l l2) {
        this.a = l2;
    }

    public void a(String string) {
        this.a.a(i.b(string));
    }

    public /* synthetic */ void onReceiveValue(Object object) {
        this.a((String)object);
    }
}

