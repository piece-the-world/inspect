/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.j.Q;
import com.growingio.a.a.j.T;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.Writer;

public abstract class I {
    protected I() {
    }

    public abstract Writer a() throws IOException;

    public Writer b() throws IOException {
        Writer writer = this.a();
        return writer instanceof BufferedWriter ? (BufferedWriter)writer : new BufferedWriter(writer);
    }

    public void a(CharSequence charSequence) throws IOException {
        aU.a(charSequence);
        T t2 = T.a();
        try {
            Writer writer = t2.a(this.a());
            writer.append(charSequence);
            writer.flush();
        }
        catch (Throwable var3_4) {
            throw t2.a(var3_4);
        }
        finally {
            t2.close();
        }
    }

    public void a(Iterable<? extends CharSequence> iterable) throws IOException {
        this.a(iterable, System.getProperty("line.separator"));
    }

    public void a(Iterable<? extends CharSequence> iterable, String string) throws IOException {
        aU.a(iterable);
        aU.a(string);
        T t2 = T.a();
        try {
            Writer writer = t2.a(this.b());
            for (CharSequence charSequence : iterable) {
                writer.append(charSequence).append(string);
            }
            writer.flush();
        }
        catch (Throwable var4_5) {
            throw t2.a(var4_5);
        }
        finally {
            t2.close();
        }
    }

    public long a(Readable readable) throws IOException {
        aU.a(readable);
        T t2 = T.a();
        try {
            Writer writer = t2.a(this.a());
            long l2 = Q.a(readable, writer);
            writer.flush();
            long l3 = l2;
            return l3;
        }
        catch (Throwable var3_4) {
            throw t2.a(var3_4);
        }
        finally {
            t2.close();
        }
    }
}

