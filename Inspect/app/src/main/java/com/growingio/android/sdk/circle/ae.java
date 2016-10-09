/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.ProgressDialog
 */
package com.growingio.android.sdk.circle;

import android.app.ProgressDialog;
import com.growingio.android.sdk.a.i;
import com.growingio.android.sdk.circle.k;

class ae
implements i {
    final /* synthetic */ ProgressDialog a;
    final /* synthetic */ k b;

    ae(k k2, ProgressDialog progressDialog) {
        this.b = k2;
        this.a = progressDialog;
    }

    @Override
    public void a() {
        try {
            k.c(this.b);
            if (this.a.isShowing()) {
                this.a.dismiss();
            }
        }
        catch (IllegalArgumentException var1_1) {
            // empty catch block
        }
    }
}

