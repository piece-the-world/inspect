/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.i;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SocketChannel;

public class a
implements i {
    private final ByteChannel a;

    public a(ByteChannel byteChannel) {
        this.a = byteChannel;
    }

    public a(i i2) {
        this.a = i2;
    }

    @Override
    public int read(ByteBuffer byteBuffer) {
        return this.a.read(byteBuffer);
    }

    @Override
    public boolean isOpen() {
        return this.a.isOpen();
    }

    @Override
    public void close() {
        this.a.close();
    }

    @Override
    public int write(ByteBuffer byteBuffer) {
        return this.a.write(byteBuffer);
    }

    @Override
    public boolean a() {
        return this.a instanceof i ? ((i)this.a).a() : false;
    }

    @Override
    public void b() {
        if (this.a instanceof i) {
            ((i)this.a).b();
        }
    }

    @Override
    public boolean c() {
        return this.a instanceof i ? ((i)this.a).c() : false;
    }

    @Override
    public int a(ByteBuffer byteBuffer) {
        return this.a instanceof i ? ((i)this.a).a(byteBuffer) : 0;
    }

    @Override
    public boolean d() {
        if (this.a instanceof SocketChannel) {
            return ((SocketChannel)this.a).isBlocking();
        }
        if (this.a instanceof i) {
            return ((i)this.a).d();
        }
        return false;
    }
}

