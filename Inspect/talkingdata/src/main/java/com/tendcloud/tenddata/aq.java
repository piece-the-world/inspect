/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.as;
import com.tendcloud.tenddata.b;
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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;

public class aq
implements as.a {
    protected SSLContext a;
    protected ExecutorService b;

    public aq(SSLContext sSLContext) {
        this(sSLContext, Executors.newSingleThreadScheduledExecutor());
    }

    public aq(SSLContext sSLContext, ExecutorService executorService) {
        if (sSLContext == null || executorService == null) {
            throw new IllegalArgumentException();
        }
        this.a = sSLContext;
        this.b = executorService;
    }

    @Override
    public ByteChannel a(SocketChannel socketChannel, SelectionKey selectionKey) {
        SSLEngine sSLEngine = this.a.createSSLEngine();
        sSLEngine.setUseClientMode(false);
        return new b(socketChannel, sSLEngine, this.b, selectionKey);
    }

    @Override
    public g b(e e2, l l2, Socket socket) {
        return new g((h)e2, l2);
    }

    @Override
    public g b(e e2, List list, Socket socket) {
        return new g((h)e2, list);
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

