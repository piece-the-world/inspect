/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.ad;
import com.tendcloud.tenddata.ae;
import com.tendcloud.tenddata.af;
import com.tendcloud.tenddata.ah;
import com.tendcloud.tenddata.ai;
import com.tendcloud.tenddata.aj;
import com.tendcloud.tenddata.ak;
import com.tendcloud.tenddata.al;
import com.tendcloud.tenddata.an;
import com.tendcloud.tenddata.ap;
import com.tendcloud.tenddata.aw;
import com.tendcloud.tenddata.d;
import com.tendcloud.tenddata.q;
import com.tendcloud.tenddata.r;
import com.tendcloud.tenddata.t;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public abstract class l {
    public static int a = 1000;
    public static int b = 64;
    public static final byte[] c = aw.a("<policy-file-request/>\u0000");
    protected d.b d = null;
    protected ad.a e = null;

    public static ByteBuffer a(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(byteBuffer.remaining());
        byte by2 = 48;
        byte by3 = 48;
        while (byteBuffer.hasRemaining()) {
            by2 = by3;
            by3 = byteBuffer.get();
            byteBuffer2.put(by3);
            if (by2 != 13 || by3 != 10) continue;
            byteBuffer2.limit(byteBuffer2.position() - 2);
            byteBuffer2.position(0);
            return byteBuffer2;
        }
        byteBuffer.position(byteBuffer.position() - byteBuffer2.position());
        return null;
    }

    public static String b(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = l.a(byteBuffer);
        return byteBuffer2 == null ? null : aw.a(byteBuffer2.array(), 0, byteBuffer2.limit());
    }

    public static ai a(ByteBuffer byteBuffer, d.b b2) {
        ai ai2;
        String[] arrstring;
        String string = l.b(byteBuffer);
        if (string == null) {
            throw new q(byteBuffer.capacity() + 128);
        }
        String[] arrstring2 = string.split(" ", 3);
        if (arrstring2.length != 3) {
            throw new t();
        }
        if (b2 == d.b.a) {
            ai2 = new ak();
            arrstring = (ap)ai2;
            arrstring.setHttpStatus(Short.parseShort(arrstring2[1]));
            arrstring.setHttpStatusMessage(arrstring2[2]);
        } else {
            arrstring = new aj();
            arrstring.setResourceDescriptor(arrstring2[1]);
            ai2 = arrstring;
        }
        string = l.b(byteBuffer);
        while (string != null && string.length() > 0) {
            arrstring = string.split(":", 2);
            if (arrstring.length != 2) {
                throw new t("not an http header");
            }
            ai2.a(arrstring[0], arrstring[1].replaceFirst("^ +", ""));
            string = l.b(byteBuffer);
        }
        if (string == null) {
            throw new q();
        }
        return ai2;
    }

    public abstract b a(af var1, an var2);

    public abstract b a(af var1);

    protected boolean a(al al2) {
        return al2.a("Upgrade").equalsIgnoreCase("websocket") && al2.a("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade");
    }

    public abstract ByteBuffer a(ad var1);

    public abstract List a(ByteBuffer var1, boolean var2);

    public abstract List a(String var1, boolean var2);

    public List a(ad.a a2, ByteBuffer byteBuffer, boolean bl2) {
        if (a2 != ad.a.c && a2 != ad.a.b && a2 != ad.a.b) {
            throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
        }
        this.e = this.e != null ? ad.a.a : a2;
        ae ae2 = new ae(this.e);
        try {
            ae2.setPayload(byteBuffer);
        }
        catch (r var5_5) {
            throw new RuntimeException(var5_5);
        }
        ae2.setFin(bl2);
        this.e = bl2 ? null : a2;
        return Collections.singletonList(ae2);
    }

    public abstract void a();

    public List a(al al2, d.b b2) {
        return this.a(al2, b2, true);
    }

    public List a(al al2, d.b b2, boolean bl2) {
        byte[] arrby;
        byte[] arrby2;
        StringBuilder stringBuilder = new StringBuilder(100);
        if (al2 instanceof af) {
            stringBuilder.append("GET ");
            stringBuilder.append(((af)al2).a());
            stringBuilder.append(" HTTP/1.1");
        } else if (al2 instanceof an) {
            stringBuilder.append("HTTP/1.1 101 " + ((an)al2).a());
        } else {
            throw new RuntimeException("unknow role");
        }
        stringBuilder.append("\r\n");
        Iterator iterator = al2.c();
        while (iterator.hasNext()) {
            arrby2 = (byte[])iterator.next();
            arrby = al2.a((String)arrby2);
            stringBuilder.append((String)arrby2);
            stringBuilder.append(": ");
            stringBuilder.append((String)arrby);
            stringBuilder.append("\r\n");
        }
        stringBuilder.append("\r\n");
        arrby2 = aw.b(stringBuilder.toString());
        arrby = bl2 ? al2.d() : null;
        ByteBuffer byteBuffer = ByteBuffer.allocate((arrby == null ? 0 : arrby.length) + arrby2.length);
        byteBuffer.put(arrby2);
        if (arrby != null) {
            byteBuffer.put(arrby);
        }
        byteBuffer.flip();
        return Collections.singletonList(byteBuffer);
    }

    public abstract ah a(ah var1);

    public abstract ai a(af var1, ap var2);

    public abstract List c(ByteBuffer var1);

    public abstract a b();

    public abstract l c();

    public al d(ByteBuffer byteBuffer) {
        return l.a(byteBuffer, this.d);
    }

    public int a(int n2) {
        if (n2 < 0) {
            throw new r(1002, "Negative count");
        }
        return n2;
    }

    public void setParseMode(d.b b2) {
        this.d = b2;
    }

    public d.b d() {
        return this.d;
    }

    public static enum a {
        a,
        b,
        c;
        

        private a() {
        }
    }

    public static enum b {
        a,
        b;
        

        private b() {
        }
    }

}

