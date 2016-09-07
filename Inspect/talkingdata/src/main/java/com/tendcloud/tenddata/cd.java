/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

static final class cd
implements HostnameVerifier {
    cd() {
    }

    @Override
    public boolean verify(String string, SSLSession sSLSession) {
        return true;
    }
}

