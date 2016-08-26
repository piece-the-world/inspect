/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.growingio.android.sdk.collection;

import android.view.View;

final class o
implements Runnable {
    final /* synthetic */ View a;

    o(View view) {
        this.a = view;
    }

    @Override
    public void run() {
        this.a.setPressed(false);
    }
}

