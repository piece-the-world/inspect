/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.j.B;
import com.growingio.a.a.m.q;
import com.growingio.a.a.m.u;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class ar
extends FilterInputStream
implements DataInput {
    public ar(InputStream inputStream) {
        super(aU.a(inputStream));
    }

    @Override
    public String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override
    public void readFully(byte[] arrby) throws IOException {
        B.a((InputStream)this, arrby);
    }

    @Override
    public void readFully(byte[] arrby, int n2, int n3) throws IOException {
        B.a(this, arrby, n2, n3);
    }

    @Override
    public int skipBytes(int n2) throws IOException {
        return (int)this.in.skip(n2);
    }

    @Override
    public int readUnsignedByte() throws IOException {
        int n2 = this.in.read();
        if (0 > n2) {
            throw new EOFException();
        }
        return n2;
    }

    @Override
    public int readUnsignedShort() throws IOException {
        byte by2 = this.a();
        byte by3 = this.a();
        return q.a(0, 0, by3, by2);
    }

    @Override
    public int readInt() throws IOException {
        byte by2 = this.a();
        byte by3 = this.a();
        byte by4 = this.a();
        byte by5 = this.a();
        return q.a(by5, by4, by3, by2);
    }

    @Override
    public long readLong() throws IOException {
        byte by2 = this.a();
        byte by3 = this.a();
        byte by4 = this.a();
        byte by5 = this.a();
        byte by6 = this.a();
        byte by7 = this.a();
        byte by8 = this.a();
        byte by9 = this.a();
        return u.a(by9, by8, by7, by6, by5, by4, by3, by2);
    }

    @Override
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(this.readInt());
    }

    @Override
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(this.readLong());
    }

    @Override
    public String readUTF() throws IOException {
        return new DataInputStream(this.in).readUTF();
    }

    @Override
    public short readShort() throws IOException {
        return (short)this.readUnsignedShort();
    }

    @Override
    public char readChar() throws IOException {
        return (char)this.readUnsignedShort();
    }

    @Override
    public byte readByte() throws IOException {
        return (byte)this.readUnsignedByte();
    }

    @Override
    public boolean readBoolean() throws IOException {
        return this.readUnsignedByte() != 0;
    }

    private byte a() throws IOException, EOFException {
        int n2 = this.in.read();
        if (-1 == n2) {
            throw new EOFException();
        }
        return (byte)n2;
    }
}

