/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.ah;
import com.tendcloud.tenddata.am;

public class aj
extends am
implements ah {
    private String a = "*";

    @Override
    public void setResourceDescriptor(String string) {
        if (string == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        this.a = string;
    }

    @Override
    public String a() {
        return this.a;
    }
}

