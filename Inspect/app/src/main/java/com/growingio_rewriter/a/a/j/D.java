/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.j.p;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

class D
implements p {
    final DataInput a;

    D(ByteArrayInputStream byteArrayInputStream) {
        this.a = new DataInputStream(byteArrayInputStream);
    }

    @Override
    public void readFully(byte[] arrby) {
        try {
            this.a.readFully(arrby);
        }
        catch (IOException var2_2) {
            throw new IllegalStateException(var2_2);
        }
    }

    @Override
    public void readFully(byte[] arrby, int n2, int n3) {
        try {
            this.a.readFully(arrby, n2, n3);
        }
        catch (IOException var4_4) {
            throw new IllegalStateException(var4_4);
        }
    }

    @Override
    public int skipBytes(int n2) {
        try {
            return this.a.skipBytes(n2);
        }
        catch (IOException var2_2) {
            throw new IllegalStateException(var2_2);
        }
    }

    @Override
    public boolean readBoolean() {
        try {
            return this.a.readBoolean();
        }
        catch (IOException var1_1) {
            throw new IllegalStateException(var1_1);
        }
    }

    @Override
    public byte readByte() {
        try {
            return this.a.readByte();
        }
        catch (EOFException var1_1) {
            throw new IllegalStateException(var1_1);
        }
        catch (IOException var1_2) {
            throw new AssertionError(var1_2);
        }
    }

    @Override
    public int readUnsignedByte() {
        try {
            return this.a.readUnsignedByte();
        }
        catch (IOException var1_1) {
            throw new IllegalStateException(var1_1);
        }
    }

    @Override
    public short readShort() {
        try {
            return this.a.readShort();
        }
        catch (IOException var1_1) {
            throw new IllegalStateException(var1_1);
        }
    }

    @Override
    public int readUnsignedShort() {
        try {
            return this.a.readUnsignedShort();
        }
        catch (IOException var1_1) {
            throw new IllegalStateException(var1_1);
        }
    }

    @Override
    public char readChar() {
        try {
            return this.a.readChar();
        }
        catch (IOException var1_1) {
            throw new IllegalStateException(var1_1);
        }
    }

    @Override
    public int readInt() {
        try {
            return this.a.readInt();
        }
        catch (IOException var1_1) {
            throw new IllegalStateException(var1_1);
        }
    }

    @Override
    public long readLong() {
        try {
            return this.a.readLong();
        }
        catch (IOException var1_1) {
            throw new IllegalStateException(var1_1);
        }
    }

    @Override
    public float readFloat() {
        try {
            return this.a.readFloat();
        }
        catch (IOException var1_1) {
            throw new IllegalStateException(var1_1);
        }
    }

    @Override
    public double readDouble() {
        try {
            return this.a.readDouble();
        }
        catch (IOException var1_1) {
            throw new IllegalStateException(var1_1);
        }
    }

    @Override
    public String readLine() {
        try {
            return this.a.readLine();
        }
        catch (IOException var1_1) {
            throw new IllegalStateException(var1_1);
        }
    }

    @Override
    public String readUTF() {
        try {
            return this.a.readUTF();
        }
        catch (IOException var1_1) {
            throw new IllegalStateException(var1_1);
        }
    }
}

