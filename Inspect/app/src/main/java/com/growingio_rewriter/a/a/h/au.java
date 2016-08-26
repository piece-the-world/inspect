/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.h.M;
import com.growingio.a.a.h.av;
import com.growingio.a.a.h.aw;
import com.growingio.a.a.h.ax;
import com.growingio.a.a.h.h;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class au
extends h
implements Serializable {
    private final MessageDigest a;
    private final int b;
    private final boolean c;
    private final String d;

    au(String string, String string2) {
        this.a = au.a(string);
        this.b = this.a.getDigestLength();
        this.d = aU.a(string2);
        this.c = au.a(this.a);
    }

    au(String string, int n2, String string2) {
        this.d = aU.a(string2);
        this.a = au.a(string);
        int n3 = this.a.getDigestLength();
        aU.a(n2 >= 4 && n2 <= n3, "bytes (%s) must be >= 4 and < %s", n2, n3);
        this.b = n2;
        this.c = au.a(this.a);
    }

    private static boolean a(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        }
        catch (CloneNotSupportedException var1_1) {
            return false;
        }
    }

    @Override
    public int b() {
        return this.b * 8;
    }

    public String toString() {
        return this.d;
    }

    private static MessageDigest a(String string) {
        try {
            return MessageDigest.getInstance(string);
        }
        catch (NoSuchAlgorithmException var1_1) {
            throw new AssertionError(var1_1);
        }
    }

    @Override
    public M a() {
        if (this.c) {
            try {
                return new aw((MessageDigest)this.a.clone(), this.b, null);
            }
            catch (CloneNotSupportedException var1_1) {
                // empty catch block
            }
        }
        return new aw(au.a(this.a.getAlgorithm()), this.b, null);
    }

    Object c() {
        return new ax(this.a.getAlgorithm(), this.b, this.d, null);
    }
}

