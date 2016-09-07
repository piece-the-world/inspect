/*
 * Decompiled with CFR 0_115.
 */
package com.apptalkingdata.protobuf;

import com.apptalkingdata.protobuf.FieldData;

public final class FieldArray
implements Cloneable {
    private static final FieldData DELETED = new FieldData();
    private boolean mGarbage = false;
    private int[] mFieldNumbers;
    private FieldData[] mData;
    private int mSize;

    FieldArray() {
        this(10);
    }

    FieldArray(int n2) {
        n2 = this.idealIntArraySize(n2);
        this.mFieldNumbers = new int[n2];
        this.mData = new FieldData[n2];
        this.mSize = 0;
    }

    private void gc() {
        int n2 = this.mSize;
        int n3 = 0;
        int[] arrn = this.mFieldNumbers;
        FieldData[] arrfieldData = this.mData;
        for (int i2 = 0; i2 < n2; ++i2) {
            FieldData fieldData = arrfieldData[i2];
            if (fieldData == DELETED) continue;
            if (i2 != n3) {
                arrn[n3] = arrn[i2];
                arrfieldData[n3] = fieldData;
                arrfieldData[i2] = null;
            }
            ++n3;
        }
        this.mGarbage = false;
        this.mSize = n3;
    }

    int size() {
        if (this.mGarbage) {
            this.gc();
        }
        return this.mSize;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    FieldData dataAt(int n2) {
        if (this.mGarbage) {
            this.gc();
        }
        return this.mData[n2];
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof FieldArray)) {
            return false;
        }
        FieldArray fieldArray = (FieldArray)object;
        if (this.size() != fieldArray.size()) {
            return false;
        }
        return this.arrayEquals(this.mFieldNumbers, fieldArray.mFieldNumbers, this.mSize) && this.arrayEquals(this.mData, fieldArray.mData, this.mSize);
    }

    public int hashCode() {
        if (this.mGarbage) {
            this.gc();
        }
        int n2 = 17;
        for (int i2 = 0; i2 < this.mSize; ++i2) {
            n2 = 31 * n2 + this.mFieldNumbers[i2];
            n2 = 31 * n2 + this.mData[i2].hashCode();
        }
        return n2;
    }

    private int idealIntArraySize(int n2) {
        return this.idealByteArraySize(n2 * 4) / 4;
    }

    private int idealByteArraySize(int n2) {
        for (int i2 = 4; i2 < 32; ++i2) {
            if (n2 > (1 << i2) - 12) continue;
            return (1 << i2) - 12;
        }
        return n2;
    }

    private boolean arrayEquals(int[] arrn, int[] arrn2, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            if (arrn[i2] == arrn2[i2]) continue;
            return false;
        }
        return true;
    }

    private boolean arrayEquals(FieldData[] arrfieldData, FieldData[] arrfieldData2, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            if (arrfieldData[i2].equals(arrfieldData2[i2])) continue;
            return false;
        }
        return true;
    }

    public final FieldArray clone() {
        int n2 = this.size();
        FieldArray fieldArray = new FieldArray(n2);
        System.arraycopy(this.mFieldNumbers, 0, fieldArray.mFieldNumbers, 0, n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.mData[i2] == null) continue;
            fieldArray.mData[i2] = this.mData[i2].clone();
        }
        fieldArray.mSize = n2;
        return fieldArray;
    }
}

