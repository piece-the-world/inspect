/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.ProgressDialog
 */
package com.growingio.android.sdk.circle;

import android.app.ProgressDialog;
import com.growingio.android.sdk.a.g;
import com.growingio.android.sdk.circle.j;

class ac
implements g {
    final /* synthetic */ ProgressDialog a;
    final /* synthetic */ j b;

    ac(j j2, ProgressDialog progressDialog) {
        this.b = j2;
        this.a = progressDialog;
    }

    @Override
    public void a() {
        try {
            j.c(this.b);
            if (this.a.isShowing()) {
                this.a.dismiss();
            }
        }
        catch (IllegalArgumentException var1_1) {
            // empty catch block
        }
    }
}

