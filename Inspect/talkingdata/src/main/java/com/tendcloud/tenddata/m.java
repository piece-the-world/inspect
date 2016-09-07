/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 */
package com.tendcloud.tenddata;

import android.annotation.SuppressLint;
import com.tendcloud.tenddata.ad;
import com.tendcloud.tenddata.ae;
import com.tendcloud.tenddata.af;
import com.tendcloud.tenddata.ah;
import com.tendcloud.tenddata.ai;
import com.tendcloud.tenddata.al;
import com.tendcloud.tenddata.an;
import com.tendcloud.tenddata.ap;
import com.tendcloud.tenddata.au;
import com.tendcloud.tenddata.aw;
import com.tendcloud.tenddata.d;
import com.tendcloud.tenddata.l;
import com.tendcloud.tenddata.r;
import com.tendcloud.tenddata.s;
import com.tendcloud.tenddata.t;
import com.tendcloud.tenddata.v;
import com.tendcloud.tenddata.w;
import com.tendcloud.tenddata.z;
import java.math.BigInteger;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@SuppressLint(value={"Assert", "UseValueOf"})
public class m
extends l {
    private ByteBuffer g;
    private ad h = null;
    private final Random i = new Random();

    public static int b(al al2) {
        String string = al2.a("Sec-WebSocket-Version");
        if (string.length() > 0) {
            try {
                int n2 = new Integer(string.trim());
                return n2;
            }
            catch (NumberFormatException var3_3) {
                return -1;
            }
        }
        return -1;
    }

    @Override
    public l.b a(af af2, an an2) {
        if (!af2.b("Sec-WebSocket-Key") || !an2.b("Sec-WebSocket-Accept")) {
            return l.b.b;
        }
        String string = an2.a("Sec-WebSocket-Accept");
        String string2 = af2.a("Sec-WebSocket-Key");
        if ((string2 = this.a(string2)).equals(string)) {
            return l.b.a;
        }
        return l.b.b;
    }

    @Override
    public l.b a(af af2) {
        int n2 = m.b(af2);
        if (n2 == 7 || n2 == 8) {
            return this.a((al)af2) ? l.b.a : l.b.b;
        }
        return l.b.b;
    }

    @Override
    public ByteBuffer a(ad ad2) {
        boolean bl2;
        ByteBuffer byteBuffer = ad2.c();
        boolean bl3 = bl2 = this.d == d.b.a;
        int n2 = byteBuffer.remaining() <= 125 ? 1 : (byteBuffer.remaining() <= 65535 ? 2 : 8);
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(1 + (n2 > 1 ? n2 + 1 : n2) + (bl2 ? 4 : 0) + byteBuffer.remaining());
        byte by2 = this.a(ad2.f());
        byte by3 = (byte)(ad2.d() ? -128 : 0);
        by3 = (byte)(by3 | by2);
        byteBuffer2.put(by3);
        byte[] arrby = this.a(byteBuffer.remaining(), n2);
        assert (arrby.length == n2);
        if (n2 == 1) {
            byteBuffer2.put((byte)(arrby[0] | (bl2 ? -128 : 0)));
        } else if (n2 == 2) {
            byteBuffer2.put((byte)(126 | (bl2 ? -128 : 0)));
            byteBuffer2.put(arrby);
        } else if (n2 == 8) {
            byteBuffer2.put((byte)(127 | (bl2 ? -128 : 0)));
            byteBuffer2.put(arrby);
        } else {
            throw new RuntimeException("Size representation not supported/specified");
        }
        if (bl2) {
            ByteBuffer byteBuffer3 = ByteBuffer.allocate(4);
            byteBuffer3.putInt(this.i.nextInt());
            byteBuffer2.put(byteBuffer3.array());
            int n3 = 0;
            while (byteBuffer.hasRemaining()) {
                byteBuffer2.put((byte)(byteBuffer.get() ^ byteBuffer3.get(n3 % 4)));
                ++n3;
            }
        } else {
            byteBuffer2.put(byteBuffer);
        }
        assert (byteBuffer2.remaining() == 0);
        byteBuffer2.flip();
        return byteBuffer2;
    }

    @Override
    public List a(ByteBuffer byteBuffer, boolean bl2) {
        ae ae2 = new ae();
        try {
            ae2.setPayload(byteBuffer);
        }
        catch (r var4_4) {
            throw new w(var4_4);
        }
        ae2.setFin(true);
        ae2.setOptcode(ad.a.c);
        ae2.setTransferemasked(bl2);
        return Collections.singletonList(ae2);
    }

    @Override
    public List a(String string, boolean bl2) {
        ae ae2 = new ae();
        try {
            ae2.setPayload(ByteBuffer.wrap(aw.a(string)));
        }
        catch (r var4_4) {
            throw new w(var4_4);
        }
        ae2.setFin(true);
        ae2.setOptcode(ad.a.b);
        ae2.setTransferemasked(bl2);
        return Collections.singletonList(ae2);
    }

    private byte a(ad.a a2) {
        if (a2 == ad.a.a) {
            return 0;
        }
        if (a2 == ad.a.b) {
            return 1;
        }
        if (a2 == ad.a.c) {
            return 2;
        }
        if (a2 == ad.a.f) {
            return 8;
        }
        if (a2 == ad.a.d) {
            return 9;
        }
        if (a2 == ad.a.e) {
            return 10;
        }
        throw new RuntimeException("Don't know how to handle " + a2.toString());
    }

    private String a(String string) {
        MessageDigest messageDigest;
        String string2 = string.trim();
        String string3 = string2 + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
        try {
            messageDigest = MessageDigest.getInstance("SHA1");
        }
        catch (NoSuchAlgorithmException var5_5) {
            throw new RuntimeException(var5_5);
        }
        return au.a(messageDigest.digest(string3.getBytes()));
    }

    @Override
    public ah a(ah ah2) {
        ah2.a("Upgrade", "websocket");
        ah2.a("Connection", "Upgrade");
        ah2.a("Sec-WebSocket-Version", "8");
        byte[] arrby = new byte[16];
        this.i.nextBytes(arrby);
        ah2.a("Sec-WebSocket-Key", au.a(arrby));
        return ah2;
    }

    @Override
    public ai a(af af2, ap ap2) {
        ap2.a("Upgrade", "websocket");
        ap2.a("Connection", af2.a("Connection"));
        ap2.setHttpStatusMessage("Switching Protocols");
        String string = af2.a("Sec-WebSocket-Key");
        if (string == null) {
            throw new t("missing Sec-WebSocket-Key");
        }
        ap2.a("Sec-WebSocket-Accept", this.a(string));
        return ap2;
    }

    private byte[] a(long l2, int n2) {
        byte[] arrby = new byte[n2];
        int n3 = 8 * n2 - 8;
        for (int i2 = 0; i2 < n2; ++i2) {
            arrby[i2] = (byte)(l2 >>> n3 - 8 * i2);
        }
        return arrby;
    }

    private ad.a a(byte by2) {
        switch (by2) {
            case 0: {
                return ad.a.a;
            }
            case 1: {
                return ad.a.b;
            }
            case 2: {
                return ad.a.c;
            }
            case 8: {
                return ad.a.f;
            }
            case 9: {
                return ad.a.d;
            }
            case 10: {
                return ad.a.e;
            }
        }
        throw new s("unknow optcode " + (short)by2);
    }

    @Override
    public List c(ByteBuffer byteBuffer) {
        int n2;
        ad ad2;
        LinkedList<ad> linkedList = new LinkedList<ad>();
        if (this.g != null) {
            try {
                byteBuffer.mark();
                int n3 = byteBuffer.remaining();
                n2 = this.g.remaining();
                if (n2 > n3) {
                    this.g.put(byteBuffer.array(), byteBuffer.position(), n3);
                    byteBuffer.position(byteBuffer.position() + n3);
                    return Collections.emptyList();
                }
                this.g.put(byteBuffer.array(), byteBuffer.position(), n2);
                byteBuffer.position(byteBuffer.position() + n2);
                ad2 = this.e((ByteBuffer)this.g.duplicate().position(0));
                linkedList.add(ad2);
                this.g = null;
            }
            catch (a var4_4) {
                int n4 = this.g.limit();
                ByteBuffer byteBuffer2 = ByteBuffer.allocate(this.a(var4_4.a()));
                assert (byteBuffer2.limit() > this.g.limit());
                this.g.rewind();
                byteBuffer2.put(this.g);
                this.g = byteBuffer2;
                return this.c(byteBuffer);
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                ad2 = this.e(byteBuffer);
                linkedList.add(ad2);
                continue;
            }
            catch (a var4_5) {
                byteBuffer.reset();
                n2 = var4_5.a();
                this.g = ByteBuffer.allocate(this.a(n2));
                this.g.put(byteBuffer);
                break;
            }
        }
        return linkedList;
    }

    public ad e(ByteBuffer byteBuffer) {
        Object object;
        Object object2;
        int n2;
        int n3 = byteBuffer.remaining();
        if (n3 < (n2 = 2)) {
            throw new a(n2);
        }
        byte by2 = byteBuffer.get();
        boolean bl2 = by2 >> 8 != 0;
        byte by3 = (byte)((by2 & 127) >> 4);
        if (by3 != 0) {
            throw new s("bad rsv " + by3);
        }
        byte by4 = byteBuffer.get();
        boolean bl3 = (by4 & -128) != 0;
        int n4 = by4 & 127;
        ad.a a2 = this.a((byte)(by2 & 15));
        if (!(bl2 || a2 != ad.a.d && a2 != ad.a.e && a2 != ad.a.f)) {
            throw new s("control frames may no be fragmented");
        }
        if (n4 < 0 || n4 > 125) {
            if (a2 == ad.a.d || a2 == ad.a.e || a2 == ad.a.f) {
                throw new s("more than 125 octets");
            }
            if (n4 == 126) {
                if (n3 < (n2 += 2)) {
                    throw new a(n2);
                }
                object2 = new byte[3];
                object2[1] = byteBuffer.get();
                object2[2] = byteBuffer.get();
                n4 = new BigInteger((byte[])object2).intValue();
            } else {
                if (n3 < (n2 += 8)) {
                    throw new a(n2);
                }
                object2 = new byte[8];
                for (object = 0; object < 8; ++object) {
                    object2[object] = byteBuffer.get();
                }
                long l2 = new BigInteger((byte[])object2).longValue();
                if (l2 > Integer.MAX_VALUE) {
                    throw new v("Payloadsize is to big...");
                }
                n4 = (int)l2;
            }
        }
        n2 += bl3 ? 4 : 0;
        if (n3 < (n2 += n4)) {
            throw new a(n2);
        }
        object2 = ByteBuffer.allocate(this.a(n4));
        if (bl3) {
            byte[] arrby = new byte[4];
            byteBuffer.get(arrby);
            for (int i2 = 0; i2 < n4; ++i2) {
                object2.put((byte)(byteBuffer.get() ^ arrby[i2 % 4]));
            }
        } else {
            object2.put(byteBuffer.array(), byteBuffer.position(), object2.limit());
            byteBuffer.position(byteBuffer.position() + object2.limit());
        }
        if (a2 == ad.a.f) {
            object = new z();
        } else {
            object = new ae();
            object.setFin(bl2);
            object.setOptcode(a2);
        }
        object2.flip();
        object.setPayload((ByteBuffer)object2);
        return object;
    }

    @Override
    public void a() {
        this.g = null;
    }

    @Override
    public l c() {
        return new m();
    }

    @Override
    public l.a b() {
        return l.a.c;
    }

    class a
    extends Throwable {
        private static final long b = 7330519489840500997L;
        private int c;

        public a(int n2) {
            this.c = n2;
        }

        public int a() {
            return this.c;
        }
    }

}

