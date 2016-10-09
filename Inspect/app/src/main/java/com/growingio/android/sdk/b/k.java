/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.growingio.android.sdk.b;

import android.view.View;
import java.util.List;

public class k {
    public int a = 0;
    public View b;
    public Object c;

    public int a(int n2) {
        if (this.a == 2 && this.c instanceof List) {
            return n2 % ((List)this.c).size();
        }
        return n2;
    }
}

