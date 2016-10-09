/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.collection;

import com.growingio.android.sdk.collection.ae;
import com.growingio.android.sdk.utils.c;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

class af
implements Runnable {
    final /* synthetic */ ae a;

    af(ae ae2) {
        this.a = ae2;
    }

    @Override
    public void run() {
        c.a = HttpsURLConnection.getDefaultSSLSocketFactory();
    }
}

