/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.g.c;

import com.growingio.b.g.c.d;
import java.io.IOException;
import java.net.Socket;

class b
extends Thread {
    d a;
    Socket b;

    public b(d d2, Socket socket) {
        this.a = d2;
        this.b = socket;
    }

    @Override
    public void run() {
        try {
            this.a.a(this.b);
        }
        catch (IOException var1_1) {
            // empty catch block
        }
    }
}

