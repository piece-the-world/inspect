/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 */
package com.tendcloud.tenddata;

import android.annotation.SuppressLint;
import com.tendcloud.tenddata.ad;
import com.tendcloud.tenddata.af;
import com.tendcloud.tenddata.ah;
import com.tendcloud.tenddata.ai;
import com.tendcloud.tenddata.al;
import com.tendcloud.tenddata.an;
import com.tendcloud.tenddata.ap;
import com.tendcloud.tenddata.d;
import com.tendcloud.tenddata.l;
import com.tendcloud.tenddata.o;
import com.tendcloud.tenddata.q;
import com.tendcloud.tenddata.s;
import com.tendcloud.tenddata.t;
import com.tendcloud.tenddata.z;
import java.nio.Buffer;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@SuppressLint(value={"UseValueOf"})
public class p
extends o {
    private boolean m = false;
    private static final byte[] n = new byte[]{-1, 0};
    private final Random o = new Random();

    public static byte[] a(String string, String string2, byte[] arrby) {
        MessageDigest messageDigest;
        byte[] arrby2 = p.a(string);
        byte[] arrby3 = p.a(string2);
        byte[] arrby4 = new byte[]{arrby2[0], arrby2[1], arrby2[2], arrby2[3], arrby3[0], arrby3[1], arrby3[2], arrby3[3], arrby[0], arrby[1], arrby[2], arrby[3], arrby[4], arrby[5], arrby[6], arrby[7]};
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        }
        catch (NoSuchAlgorithmException var7_7) {
            throw new RuntimeException(var7_7);
        }
        return messageDigest.digest(arrby4);
    }

    private static String f() {
        int n2;
        int n3;
        Random random = new Random();
        long l2 = 0xFFFFFFFFL;
        long l3 = random.nextInt(12) + 1;
        int n4 = new Long(l2 / l3).intValue();
        n4 = Math.abs(n4);
        int n5 = random.nextInt(n4) + 1;
        long l4 = (long)n5 * l3;
        String string = Long.toString(l4);
        int n6 = random.nextInt(12) + 1;
        for (n2 = 0; n2 < n6; ++n2) {
            n3 = random.nextInt(string.length());
            n3 = Math.abs(n3);
            char c2 = (char)(random.nextInt(95) + 33);
            if (c2 >= '0' && c2 <= '9') {
                c2 = (char)(c2 - 15);
            }
            string = new StringBuilder(string).insert(n3, c2).toString();
        }
        n2 = 0;
        while ((long)n2 < l3) {
            n3 = random.nextInt(string.length() - 1) + 1;
            n3 = Math.abs(n3);
            string = new StringBuilder(string).insert(n3, " ").toString();
            ++n2;
        }
        return string;
    }

    private static byte[] a(String string) {
        try {
            long l2 = Long.parseLong(string.replaceAll("[^0-9]", ""));
            long l3 = string.split(" ").length - 1;
            if (l3 == 0) {
                throw new t("invalid Sec-WebSocket-Key (/key2/)");
            }
            long l4 = new Long(l2 / l3);
            return new byte[]{(byte)(l4 >> 24), (byte)(l4 << 8 >> 24), (byte)(l4 << 16 >> 24), (byte)(l4 << 24 >> 24)};
        }
        catch (NumberFormatException var1_2) {
            throw new t("invalid Sec-WebSocket-Key (/key1/ or /key2/)");
        }
    }

    @Override
    public l.b a(af af2, an an2) {
        if (this.m) {
            return l.b.b;
        }
        try {
            if (!an2.a("Sec-WebSocket-Origin").equals(af2.a("Origin")) || !this.a(an2)) {
                return l.b.b;
            }
            byte[] arrby = an2.d();
            if (arrby == null || arrby.length == 0) {
                throw new q();
            }
            if (Arrays.equals(arrby, p.a(af2.a("Sec-WebSocket-Key1"), af2.a("Sec-WebSocket-Key2"), af2.d()))) {
                return l.b.a;
            }
            return l.b.b;
        }
        catch (t var3_4) {
            throw new RuntimeException("bad handshakerequest", var3_4);
        }
    }

    @Override
    public l.b a(af af2) {
        if (af2.a("Upgrade").equals("WebSocket") && af2.a("Connection").contains("Upgrade") && af2.a("Sec-WebSocket-Key1").length() > 0 && !af2.a("Sec-WebSocket-Key2").isEmpty() && af2.b("Origin")) {
            return l.b.a;
        }
        return l.b.b;
    }

    @Override
    public ah a(ah ah2) {
        ah2.a("Upgrade", "WebSocket");
        ah2.a("Connection", "Upgrade");
        ah2.a("Sec-WebSocket-Key1", p.f());
        ah2.a("Sec-WebSocket-Key2", p.f());
        if (!ah2.b("Origin")) {
            ah2.a("Origin", "random" + this.o.nextInt());
        }
        byte[] arrby = new byte[8];
        this.o.nextBytes(arrby);
        ah2.setContent(arrby);
        return ah2;
    }

    @Override
    public ai a(af af2, ap ap2) {
        ap2.setHttpStatusMessage("WebSocket Protocol Handshake");
        ap2.a("Upgrade", "WebSocket");
        ap2.a("Connection", af2.a("Connection"));
        ap2.a("Sec-WebSocket-Origin", af2.a("Origin"));
        String string = "ws://" + af2.a("Host") + af2.a();
        ap2.a("Sec-WebSocket-Location", string);
        String string2 = af2.a("Sec-WebSocket-Key1");
        String string3 = af2.a("Sec-WebSocket-Key2");
        byte[] arrby = af2.d();
        if (string2 == null || string3 == null || arrby == null || arrby.length != 8) {
            throw new t("Bad keys");
        }
        ap2.setContent(p.a(string2, string3, arrby));
        return ap2;
    }

    @Override
    public al d(ByteBuffer byteBuffer) {
        ai ai2 = p.a(byteBuffer, this.d);
        if ((ai2.b("Sec-WebSocket-Key1") || this.d == d.b.a) && !ai2.b("Sec-WebSocket-Version")) {
            byte[] arrby = new byte[this.d == d.b.b ? 8 : 16];
            try {
                byteBuffer.get(arrby);
            }
            catch (BufferUnderflowException var4_4) {
                throw new q(byteBuffer.capacity() + 16);
            }
            ai2.setContent(arrby);
        }
        return ai2;
    }

    @Override
    public List c(ByteBuffer byteBuffer) {
        byteBuffer.mark();
        List list = super.e(byteBuffer);
        if (list == null) {
            byteBuffer.reset();
            list = this.k;
            this.j = true;
            if (this.l != null) {
                throw new s();
            }
            this.l = ByteBuffer.allocate(2);
            if (byteBuffer.remaining() > this.l.remaining()) {
                throw new s();
            }
            this.l.put(byteBuffer);
            if (!this.l.hasRemaining()) {
                if (Arrays.equals(this.l.array(), n)) {
                    list.add(new z(1000));
                    return list;
                }
                throw new s();
            }
            this.k = new LinkedList();
            return list;
        }
        return list;
    }

    @Override
    public ByteBuffer a(ad ad2) {
        if (ad2.f() == ad.a.f) {
            return ByteBuffer.wrap(n);
        }
        return super.a(ad2);
    }

    @Override
    public l.a b() {
        return l.a.b;
    }

    @Override
    public l c() {
        return new p();
    }
}

