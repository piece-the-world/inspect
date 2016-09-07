/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.as;
import com.tendcloud.tenddata.d;
import com.tendcloud.tenddata.e;
import com.tendcloud.tenddata.g;
import com.tendcloud.tenddata.h;
import com.tendcloud.tenddata.l;
import java.net.Socket;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;

public class ar
implements as.a {
    @Override
    public g b(e e2, l l2, Socket socket) {
        return new g((h)e2, l2);
    }

    @Override
    public g b(e e2, List list, Socket socket) {
        return new g((h)e2, list);
    }

    public SocketChannel b(SocketChannel socketChannel, SelectionKey selectionKey) {
        return socketChannel;
    }

    @Override
    public /* synthetic */ ByteChannel a(SocketChannel socketChannel, SelectionKey selectionKey) {
        return this.b(socketChannel, selectionKey);
    }

    @Override
    public /* synthetic */ d a(e e2, List list, Socket socket) {
        return this.b(e2, list, socket);
    }

    @Override
    public /* synthetic */ d a(e e2, l l2, Socket socket) {
        return this.b(e2, l2, socket);
    }
}

