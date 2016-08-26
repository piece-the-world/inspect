/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.j;

import java.io.DataOutput;

public interface q
extends DataOutput {
    @Override
    public void write(int var1);

    @Override
    public void write(byte[] var1);

    @Override
    public void write(byte[] var1, int var2, int var3);

    @Override
    public void writeBoolean(boolean var1);

    @Override
    public void writeByte(int var1);

    @Override
    public void writeShort(int var1);

    @Override
    public void writeChar(int var1);

    @Override
    public void writeInt(int var1);

    @Override
    public void writeLong(long var1);

    @Override
    public void writeFloat(float var1);

    @Override
    public void writeDouble(double var1);

    @Override
    public void writeChars(String var1);

    @Override
    public void writeUTF(String var1);

    @Override
    public void writeBytes(String var1);

    public byte[] a();
}

