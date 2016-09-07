/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.a;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

public abstract class j
extends a {
    protected final ByteBuffer a;

    public j(ByteChannel byteChannel) {
        super(byteChannel);
        try {
            this.a = ByteBuffer.wrap(this.e().getBytes("ASCII"));
        }
        catch (UnsupportedEncodingException var2_2) {
            throw new RuntimeException(var2_2);
        }
    }

    @Override
    public int write(ByteBuffer byteBuffer) {
        if (!this.a.hasRemaining()) {
            return super.write(byteBuffer);
        }
        return super.write(this.a);
    }

    public abstract String e();
}

