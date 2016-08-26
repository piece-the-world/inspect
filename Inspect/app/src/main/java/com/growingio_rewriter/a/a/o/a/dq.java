/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import java.util.concurrent.Semaphore;

class dq
extends Semaphore {
    long a;
    long b;
    long c;

    dq(int n2) {
        super(n2, false);
    }
}

