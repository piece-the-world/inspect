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

    public int lookupShort(short[] arrs, int n2) {
        return arrs[n2] & 65535;
    }

    public int loadByte(byte[] arrby, int n2) {
        return arrby[n2] & 255;
    }

    @Override
    public int loadInt(byte[] arrby, int n2) {
        return arrby[n2] & 255 | (arrby[n2 + 1] & 255) << 8 | (arrby[n2 + 2] & 255) << 16 | (arrby[n2 + 3] & 255) << 24;
    }

    @Override
    public void copyLong(byte[] arrby, int n2, byte[] arrby2, int n3) {
        for (int i2 = 0; i2 < 8; ++i2) {
            arrby2[n3 + i2] = arrby[n2 + i2];
        }
    }

    @Override
    public long loadLong(byte[] arrby, int n2) {
        return (long)arrby[n2] & 255 | ((long)arrby[n2 + 1] & 255) << 8 | ((long)arrby[n2 + 2] & 255) << 16 | ((long)arrby[n2 + 3] & 255) << 24 | ((long)arrby[n2 + 4] & 255) << 32 | ((long)arrby[n2 + 5] & 255) << 40 | ((long)arrby[n2 + 6] & 255) << 48 | ((long)arrby[n2 + 7] & 255) << 56;
    }

    public void copyMemory(byte[] arrby, int n2, byte[] arrby2, int n3, int n4) {
        System.arraycopy(arrby, n2, arrby2, n3, n4);
    }
}

