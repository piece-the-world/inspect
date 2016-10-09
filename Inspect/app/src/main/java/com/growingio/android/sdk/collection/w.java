/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalFocusChangeListener
 */
package com.growingio.android.sdk.collection;

import android.view.View;
import android.view.ViewTreeObserver;
import com.growingio.android.sdk.collection.t;
import com.growingio.android.sdk.utils.k;

class w
implements ViewTreeObserver.OnGlobalFocusChangeListener {
    final /* synthetic */ t a;

    w(t t2) {
        this.a = t2;
    }

    public void onGlobalFocusChanged(View oldFocus, View newFocus) {
        if (oldFocus == null) {
            return;
        }
        if (oldFocus.getTag(84159246) != null) {
            k.c(oldFocus);
        }
    }
}

