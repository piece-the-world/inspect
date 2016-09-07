/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.d;
import com.tendcloud.tenddata.g;
import com.tendcloud.tenddata.i;
import com.tendcloud.tenddata.l;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.util.concurrent.BlockingQueue;

public class c {
    public static boolean a(ByteBuffer byteBuffer, g g2, ByteChannel byteChannel) {
        byteBuffer.clear();
        int n2 = byteChannel.read(byteBuffer);
        byteBuffer.flip();
        if (n2 == -1) {
            g2.n();
            return false;
        }
        return n2 != 0;
    }

    public static boolean a(ByteBuffer byteBuffer, g g2, i i2) {
        byteBuffer.clear();
        int n2 = i2.a(byteBuffer);
        byteBuffer.flip();
        if (n2 == -1) {
            g2.n();
            return false;
        }
        return i2.c();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean a(g g2, ByteChannel byteChannel) {
        ByteBuffer byteBuffer = (ByteBuffer)g2.h.peek();
        i i2 = null;
        if (byteBuffer == null) {
            if (byteChannel instanceof i && (i2 = (i)byteChannel).a()) {
                i2.b();
            }
        } else {
            do {
                byteChannel.write(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    return false;
                }
                g2.h.poll();
            } while ((byteBuffer = (ByteBuffer)g2.h.peek()) != null);
        }
        if (g2.h.isEmpty() && g2.h() && g2.j().d() == d.b.b) {
            g g3 = g2;
            synchronized (g3) {
                g2.m();
            }
        }
        return i2 != null ? !((i)byteChannel).a() : true;
    }
}

