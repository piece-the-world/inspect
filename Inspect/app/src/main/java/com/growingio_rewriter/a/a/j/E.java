/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.j.q;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class E
implements q {
    final DataOutput a;
    final ByteArrayOutputStream b;

    E(ByteArrayOutputStream byteArrayOutputStream) {
        this.b = byteArrayOutputStream;
        this.a = new DataOutputStream(byteArrayOutputStream);
    }

    @Override
    public void write(int n2) {
        try {
            this.a.write(n2);
        }
        catch (IOException var2_2) {
            throw new AssertionError(var2_2);
        }
    }

    @Override
    public void write(byte[] arrby) {
        try {
            this.a.write(arrby);
        }
        catch (IOException var2_2) {
            throw new AssertionError(var2_2);
        }
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) {
        try {
            this.a.write(arrby, n2, n3);
        }
        catch (IOException var4_4) {
            throw new AssertionError(var4_4);
        }
    }

    @Override
    public void writeBoolean(boolean bl2) {
        try {
            this.a.writeBoolean(bl2);
        }
        catch (IOException var2_2) {
            throw new AssertionError(var2_2);
        }
    }

    @Override
    public void writeByte(int n2) {
        try {
            this.a.writeByte(n2);
        }
        catch (IOException var2_2) {
            throw new AssertionError(var2_2);
        }
    }

    @Override
    public void writeBytes(String string) {
        try {
            this.a.writeBytes(string);
        }
        catch (IOException var2_2) {
            throw new AssertionError(var2_2);
        }
    }

    @Override
    public void writeChar(int n2) {
        try {
            this.a.writeChar(n2);
        }
        catch (IOException var2_2) {
            throw new AssertionError(var2_2);
        }
    }

    @Override
    public void writeChars(String string) {
        try {
            this.a.writeChars(string);
        }
        catch (IOException var2_2) {
            throw new AssertionError(var2_2);
        }
    }

    @Override
    public void writeDouble(double d2) {
        try {
            this.a.writeDouble(d2);
        }
        catch (IOException var3_2) {
            throw new AssertionError(var3_2);
        }
    }

    @Override
    public void writeFloat(float f2) {
        try {
            this.a.writeFloat(f2);
        }
        catch (IOException var2_2) {
            throw new AssertionError(var2_2);
        }
    }

    @Override
    public void writeInt(int n2) {
        try {
            this.a.writeInt(n2);
        }
        catch (IOException var2_2) {
            throw new AssertionError(var2_2);
        }
    }

    @Override
    public void writeLong(long l2) {
        try {
            this.a.writeLong(l2);
        }
        catch (IOException var3_2) {
            throw new AssertionError(var3_2);
        }
    }

    @Override
    public void writeShort(int n2) {
        try {
            this.a.writeShort(n2);
        }
        catch (IOException var2_2) {
            throw new AssertionError(var2_2);
        }
    }

    @Override
    public void writeUTF(String string) {
        try {
            this.a.writeUTF(string);
        }
        catch (IOException var2_2) {
            throw new AssertionError(var2_2);
        }
    }

    @Override
    public byte[] a() {
        return this.b.toByteArray();
    }
}

