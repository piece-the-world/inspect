/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.ac;
import com.tendcloud.tenddata.ad;
import com.tendcloud.tenddata.aw;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class ae
implements ac {
    protected static byte[] a_ = new byte[0];
    protected boolean b_;
    protected ad.a c_;
    private ByteBuffer e;
    protected boolean d_;

    public ae() {
    }

    public ae(ad.a a2) {
        this.c_ = a2;
        this.e = ByteBuffer.wrap(a_);
    }

    public ae(ad ad2) {
        this.b_ = ad2.d();
        this.c_ = ad2.f();
        this.e = ad2.c();
        this.d_ = ad2.e();
    }

    @Override
    public boolean d() {
        return this.b_;
    }

    @Override
    public ad.a f() {
        return this.c_;
    }

    @Override
    public boolean e() {
        return this.d_;
    }

    @Override
    public ByteBuffer c() {
        return this.e;
    }

    @Override
    public void setFin(boolean bl2) {
        this.b_ = bl2;
    }

    @Override
    public void setOptcode(ad.a a2) {
        this.c_ = a2;
    }

    @Override
    public void setPayload(ByteBuffer byteBuffer) {
        this.e = byteBuffer;
    }

    @Override
    public void setTransferemasked(boolean bl2) {
        this.d_ = bl2;
    }

    @Override
    public void append(ad ad2) {
        ByteBuffer byteBuffer = ad2.c();
        if (this.e == null) {
            this.e = ByteBuffer.allocate(byteBuffer.remaining());
            byteBuffer.mark();
            this.e.put(byteBuffer);
            byteBuffer.reset();
        } else {
            byteBuffer.mark();
            this.e.position(this.e.limit());
            this.e.limit(this.e.capacity());
            if (byteBuffer.remaining() > this.e.remaining()) {
                ByteBuffer byteBuffer2 = ByteBuffer.allocate(byteBuffer.remaining() + this.e.capacity());
                this.e.flip();
                byteBuffer2.put(this.e);
                byteBuffer2.put(byteBuffer);
                this.e = byteBuffer2;
            } else {
                this.e.put(byteBuffer);
            }
            this.e.rewind();
            byteBuffer.reset();
        }
        this.b_ = ad2.d();
    }

    public String toString() {
        return "Framedata{ optcode:" + (Object)((Object)this.f()) + ", fin:" + this.d() + ", payloadlength:[pos:" + this.e.position() + ", len:" + this.e.remaining() + "], payload:" + Arrays.toString(aw.a(new String(this.e.array()))) + "}";
    }
}

