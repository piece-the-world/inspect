/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.m.u;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class as
extends FilterOutputStream
implements DataOutput {
    public as(OutputStream outputStream) {
        super(new DataOutputStream(aU.a(outputStream)));
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) throws IOException {
        this.out.write(arrby, n2, n3);
    }

    @Override
    public void writeBoolean(boolean bl2) throws IOException {
        ((DataOutputStream)this.out).writeBoolean(bl2);
    }

    @Override
    public void writeByte(int n2) throws IOException {
        ((DataOutputStream)this.out).writeByte(n2);
    }

    @Override
    public void writeBytes(String string) throws IOException {
        ((DataOutputStream)this.out).writeBytes(string);
    }

    @Override
    public void writeChar(int n2) throws IOException {
        this.writeShort(n2);
    }

    @Override
    public void writeChars(String string) throws IOException {
        for (int i2 = 0; i2 < string.length(); ++i2) {
            this.writeChar(string.charAt(i2));
        }
    }

    @Override
    public void writeDouble(double d2) throws IOException {
        this.writeLong(Double.doubleToLongBits(d2));
    }

    @Override
    public void writeFloat(float f2) throws IOException {
        this.writeInt(Float.floatToIntBits(f2));
    }

    @Override
    public void writeInt(int n2) throws IOException {
        this.out.write(255 & n2);
        this.out.write(255 & n2 >> 8);
        this.out.write(255 & n2 >> 16);
        this.out.write(255 & n2 >> 24);
    }

    @Override
    public void writeLong(long l2) throws IOException {
        byte[] arrby = u.b(Long.reverseBytes(l2));
        this.write(arrby, 0, arrby.length);
    }

    @Override
    public void writeShort(int n2) throws IOException {
        this.out.write(255 & n2);
        this.out.write(255 & n2 >> 8);
    }

    @Override
    public void writeUTF(String string) throws IOException {
        ((DataOutputStream)this.out).writeUTF(string);
    }

    @Override
    public void close() throws IOException {
        this.out.close();
    }
}

