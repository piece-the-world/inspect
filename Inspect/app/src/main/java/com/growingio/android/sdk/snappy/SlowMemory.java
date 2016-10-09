/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.snappy;

import com.growingio.android.sdk.snappy.d;

class SlowMemory
implements d {
    SlowMemory() {
    }

    @Override
    public boolean fastAccessSupported() {
        return false;
    }

    public int lookupShort(short[] data, int index) {
        return data[index] & 65535;
    }

    public int loadByte(byte[] data, int index) {
        return data[index] & 255;
    }

    @Override
    public int loadInt(byte[] data, int index) {
        return data[index] & 255 | (data[index + 1] & 255) << 8 | (data[index + 2] & 255) << 16 | (data[index + 3] & 255) << 24;
    }

    @Override
    public void copyLong(byte[] src, int srcIndex, byte[] dest, int destIndex) {
        for (int i2 = 0; i2 < 8; ++i2) {
            dest[destIndex + i2] = src[srcIndex + i2];
        }
    }

    @Override
    public long loadLong(byte[] data, int index) {
        return (long)data[index] & 255 | ((long)data[index + 1] & 255) << 8 | ((long)data[index + 2] & 255) << 16 | ((long)data[index + 3] & 255) << 24 | ((long)data[index + 4] & 255) << 32 | ((long)data[index + 5] & 255) << 40 | ((long)data[index + 6] & 255) << 48 | ((long)data[index + 7] & 255) << 56;
    }

    public void copyMemory(byte[] input, int inputIndex, byte[] output, int outputIndex, int length) {
        System.arraycopy(input, inputIndex, output, outputIndex, length);
    }
}

