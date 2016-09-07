/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.am;
import com.tendcloud.tenddata.ap;

public class ak
extends am
implements ap {
    private short a;
    private String b;

    @Override
    public String a() {
        return this.b;
    }

    @Override
    public short b() {
        return this.a;
    }

    @Override
    public void setHttpStatusMessage(String string) {
        this.b = string;
    }

    @Override
    public void setHttpStatus(short s2) {
        this.a = s2;
    }
}

