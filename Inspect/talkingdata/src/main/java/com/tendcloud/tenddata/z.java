/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.ad;
import com.tendcloud.tenddata.ae;
import com.tendcloud.tenddata.aw;
import com.tendcloud.tenddata.r;
import com.tendcloud.tenddata.s;
import com.tendcloud.tenddata.y;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class z
extends ae
implements y {
    static final ByteBuffer p = ByteBuffer.allocate(0);
    private int q;
    private String r;

    public z() {
        super(ad.a.f);
        this.setFin(true);
    }

    public z(int n2) {
        super(ad.a.f);
        this.setFin(true);
        this.a(n2, "");
    }

    public z(int n2, String string) {
        super(ad.a.f);
        this.setFin(true);
        this.a(n2, string);
    }

    private void a(int n2, String string) {
        if (string == null) {
            string = "";
        }
        if (n2 == 1015) {
            n2 = 1005;
            string = "";
        }
        if (n2 == 1005) {
            if (0 < string.length()) {
                throw new r(1002, "A close frame must have a closecode if it has a reason");
            }
            return;
        }
        byte[] arrby = aw.a(string);
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(n2);
        byteBuffer.position(2);
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(2 + arrby.length);
        byteBuffer2.put(byteBuffer);
        byteBuffer2.put(arrby);
        byteBuffer2.rewind();
        this.setPayload(byteBuffer2);
    }

    private void g() {
        this.q = 1005;
        ByteBuffer byteBuffer = super.c();
        byteBuffer.mark();
        if (byteBuffer.remaining() >= 2) {
            ByteBuffer byteBuffer2 = ByteBuffer.allocate(4);
            byteBuffer2.position(2);
            byteBuffer2.putShort(byteBuffer.getShort());
            byteBuffer2.position(0);
            this.q = byteBuffer2.getInt();
            if (this.q == 1006 || this.q == 1015 || this.q == 1005 || this.q > 4999 || this.q < 1000 || this.q == 1004) {
                throw new s("closecode must not be sent over the wire: " + this.q);
            }
        }
        byteBuffer.reset();
    }

    @Override
    public int a() {
        return this.q;
    }

    private void h() {
        if (this.q == 1005) {
            this.r = aw.a(super.c());
        } else {
            ByteBuffer byteBuffer = super.c();
            int n2 = byteBuffer.position();
            try {
                byteBuffer.position(byteBuffer.position() + 2);
                this.r = aw.a(byteBuffer);
            }
            catch (IllegalArgumentException var3_3) {
                throw new s(var3_3);
            }
            finally {
                byteBuffer.position(n2);
            }
        }
    }

    @Override
    public String b() {
        return this.r;
    }

    @Override
    public String toString() {
        return super.toString() + "code: " + this.q;
    }

    @Override
    public void setPayload(ByteBuffer byteBuffer) {
        super.setPayload(byteBuffer);
        this.g();
        this.h();
    }

    @Override
    public ByteBuffer c() {
        if (this.q == 1005) {
            return p;
        }
        return super.c();
    }
}

