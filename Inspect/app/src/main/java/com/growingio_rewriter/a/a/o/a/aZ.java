/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.aM;
import com.growingio.a.a.o.a.aS;
import com.growingio.a.a.o.a.aT;

public final class aZ
extends aS {
    private final aS c;

    private aZ(aT aT2, aT aT3, aS aS2) {
        super(aT2, aT3);
        this.c = aS2;
        this.initCause(aS2);
    }

    public aS a() {
        return this.c;
    }

    @Override
    public String getMessage() {
        StringBuilder stringBuilder = new StringBuilder(super.getMessage());
        for (Throwable throwable = this.c; throwable != null; throwable = throwable.getCause()) {
            stringBuilder.append(", ").append(throwable.getMessage());
        }
        return stringBuilder.toString();
    }

    /* synthetic */ aZ(aT aT2, aT aT3, aS aS2, aM aM2) {
        this(aT2, aT3, aS2);
    }
}

