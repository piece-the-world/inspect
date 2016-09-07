/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.ad;
import com.tendcloud.tenddata.ae;
import com.tendcloud.tenddata.af;
import com.tendcloud.tenddata.ak;
import com.tendcloud.tenddata.an;
import com.tendcloud.tenddata.ap;
import com.tendcloud.tenddata.d;
import com.tendcloud.tenddata.h;
import com.tendcloud.tenddata.l;
import com.tendcloud.tenddata.t;
import java.net.InetSocketAddress;

public abstract class e
implements h {
    @Override
    public ap a(d d2, l l2, af af2) {
        return new ak();
    }

    @Override
    public void a(d d2, af af2, an an2) {
    }

    @Override
    public void a(d d2, af af2) {
    }

    @Override
    public void a(d d2, ad ad2) {
    }

    @Override
    public void b(d d2, ad ad2) {
        ae ae2 = new ae(ad2);
        ae2.setOptcode(ad.a.e);
        d2.sendFrame(ae2);
    }

    @Override
    public void c(d d2, ad ad2) {
    }

    @Override
    public String a(d d2) {
        InetSocketAddress inetSocketAddress = d2.d();
        if (null == inetSocketAddress) {
            throw new t("socket not bound");
        }
        StringBuffer stringBuffer = new StringBuffer(90);
        stringBuffer.append("<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"");
        stringBuffer.append(inetSocketAddress.getPort());
        stringBuffer.append("\" /></cross-domain-policy>\u0000");
        return stringBuffer.toString();
    }
}

