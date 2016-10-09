/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 */
package com.growingio.android.sdk.circle;

import android.view.View;
import android.widget.AdapterView;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.a;
import java.util.Comparator;

class e
implements Comparator {
    final /* synthetic */ a a;

    e(a a2) {
        this.a = a2;
    }

    public int a(i i2, i i3) {
        int n2 = i2.c instanceof AdapterView ? -1 : 1;
        int n3 = i3.c instanceof AdapterView ? -1 : 1;
        return n3 - n2;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((i)object, (i)object2);
    }
}

