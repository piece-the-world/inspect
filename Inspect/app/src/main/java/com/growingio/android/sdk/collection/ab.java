/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.collection;

import com.growingio.android.sdk.collection.aa;
import com.growingio.android.sdk.utils.c;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

class ab
implements Runnable {
    final /* synthetic */ aa a;

    ab(aa aa2) {
        this.a = aa2;
    }

    @Override
    public void run() {
        c.a = HttpsURLConnection.getDefaultSSLSocketFactory();
    }
}

