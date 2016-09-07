/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.ad;
import java.nio.ByteBuffer;

public interface ac
extends ad {
    public void setFin(boolean var1);

    public void setOptcode(ad.a var1);

    public void setPayload(ByteBuffer var1);

    public void setTransferemasked(boolean var1);
}

