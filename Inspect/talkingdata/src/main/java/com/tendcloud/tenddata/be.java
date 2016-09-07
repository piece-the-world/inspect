/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.apptalkingdata.push.service.HttpCallback;
import com.tendcloud.tenddata.bd;
import com.tendcloud.tenddata.bg;

static final class be
implements HttpCallback {
    final /* synthetic */ bd.a a;

    be(bd.a a2) {
        this.a = a2;
    }

    @Override
    public void requestSuccess(String string) {
        String[] arrstring = string.split(":");
        if (arrstring.length == 2) {
            this.a.a = arrstring[0];
            this.a.b = Integer.valueOf(arrstring[1]);
            bg.a("Client-Inited", "true");
        }
    }

    @Override
    public void requestError(int n2, Exception exception) {
        exception.printStackTrace();
    }
}

