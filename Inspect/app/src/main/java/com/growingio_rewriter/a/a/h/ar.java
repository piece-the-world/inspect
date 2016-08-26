/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.h.M;
import com.growingio.a.a.h.as;
import com.growingio.a.a.h.at;
import com.growingio.a.a.h.h;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

final class ar
extends h {
    private final Mac a;
    private final Key b;
    private final String c;
    private final int d;
    private final boolean e;

    ar(String string, Key key, String string2) {
        this.a = ar.a(string, key);
        this.b = aU.a(key);
        this.c = aU.a(string2);
        this.d = this.a.getMacLength() * 8;
        this.e = ar.a(this.a);
    }

    @Override
    public int b() {
        return this.d;
    }

    private static boolean a(Mac mac) {
        try {
            mac.clone();
            return true;
        }
        catch (CloneNotSupportedException var1_1) {
            return false;
        }
    }

    private static Mac a(String string, Key key) {
        try {
            Mac mac = Mac.getInstance(string);
            mac.init(key);
            return mac;
        }
        catch (NoSuchAlgorithmException var2_3) {
            throw new IllegalStateException(var2_3);
        }
        catch (InvalidKeyException var2_4) {
            throw new IllegalArgumentException(var2_4);
        }
    }

    @Override
    public M a() {
        if (this.e) {
            try {
                return new at((Mac)this.a.clone(), null);
            }
            catch (CloneNotSupportedException var1_1) {
                // empty catch block
            }
        }
        return new at(ar.a(this.a.getAlgorithm(), this.b), null);
    }

    public String toString() {
        return this.c;
    }
}

