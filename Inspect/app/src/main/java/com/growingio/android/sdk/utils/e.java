/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.utils;

import com.growingio.android.sdk.utils.c;
import com.growingio.android.sdk.utils.d;
import java.util.HashMap;
import java.util.Map;

public class e {
    private String a;
    private String b = "GET";
    private Map c = new HashMap();
    private byte[] d = new byte[0];
    private long e = 0;

    public e a(String string) {
        this.a = string;
        return this;
    }

    public e b(String string) {
        this.b = string;
        return this;
    }

    public e a(long l2) {
        this.e = l2;
        return this;
    }

    public e a(Map map) {
        this.c = map;
        return this;
    }

    public e a(byte[] arrby) {
        this.d = arrby;
        return this;
    }

    public c a() {
        return new c(this.a, this.b, this.c, this.d, this.e, null);
    }
}

