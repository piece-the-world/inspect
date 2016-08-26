/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a.c;

import com.growingio.e.a.a.a.c.p;
import com.growingio.e.a.a.a.f;
import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class v
extends p
implements DataInput {
    public v(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public boolean readBoolean() throws IOException, EOFException {
        return 0 != this.readByte();
    }

    @Override
    public byte readByte() throws IOException, EOFException {
        return (byte)this.in.read();
    }

    @Override
    public char readChar() throws IOException, EOFException {
        return (char)this.readShort();
    }

    @Override
    public double readDouble() throws IOException, EOFException {
        return f.g(this.in);
    }

    @Override
    public float readFloat() throws IOException, EOFException {
        return f.f(this.in);
    }

    @Override
    public void readFully(byte[] arrby) throws IOException, EOFException {
        this.readFully(arrby, 0, arrby.length);
    }

    @Override
    public void readFully(byte[] arrby, int n2, int n3) throws IOException, EOFException {
        int n4;
        for (int i2 = n3; i2 > 0; i2 -= n4) {
            int n5 = n2 + n3 - i2;
            n4 = this.read(arrby, n5, i2);
            if (-1 != n4) continue;
            throw new EOFException();
        }
    }

    @Override
    public int readInt() throws IOException, EOFException {
        return f.c(this.in);
    }

    @Override
    public String readLine() throws IOException, EOFException {
        throw new UnsupportedOperationException("Operation not supported: readLine()");
    }

    @Override
    public long readLong() throws IOException, EOFException {
        return f.e(this.in);
    }

    @Override
    public short readShort() throws IOException, EOFException {
        return f.a(this.in);
    }

    @Override
    public int readUnsignedByte() throws IOException, EOFException {
        return this.in.read();
    }

    @Override
    public int readUnsignedShort() throws IOException, EOFException {
        return f.b(this.in);
    }

    @Override
    public String readUTF() throws IOException, EOFException {
        throw new UnsupportedOperationException("Operation not supported: readUTF()");
    }

    @Override
    public int skipBytes(int n2) throws IOException, EOFException {
        return (int)this.in.skip(n2);
    }
}

