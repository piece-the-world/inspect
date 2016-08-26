/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.j.Q;
import com.growingio.a.a.j.an;
import com.growingio.a.a.j.aq;
import java.io.IOException;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.CharBuffer;
import java.util.LinkedList;
import java.util.Queue;

public final class ap {
    private final Readable a;
    private final Reader b;
    private final CharBuffer c = Q.a();
    private final char[] d = this.c.array();
    private final Queue<String> e = new LinkedList<String>();
    private final an f;

    public ap(Readable readable) {
        this.f = new aq(this);
        this.a = aU.a(readable);
        this.b = readable instanceof Reader ? (Reader)readable : null;
    }

    public String a() throws IOException {
        while (this.e.peek() == null) {
            int n2;
            this.c.clear();
            int n3 = n2 = this.b != null ? this.b.read(this.d, 0, this.d.length) : this.a.read(this.c);
            if (n2 == -1) {
                this.f.a();
                break;
            }
            this.f.a(this.d, 0, n2);
        }
        return this.e.poll();
    }

    static /* synthetic */ Queue a(ap ap2) {
        return ap2.e;
    }
}

