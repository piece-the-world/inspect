/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.growingio.android.sdk.utils;

import android.view.View;
import java.util.Comparator;

final class o
implements Comparator {
    o() {
    }

    public int a(View view, View view2) {
        return view2.getWidth() * view2.getHeight() - view.getWidth() * view.getHeight();
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((View)object, (View)object2);
    }
}

