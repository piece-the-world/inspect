/*
 * Decompiled with CFR 0_115.
 */
package com.apptalkingdata.protobuf;

import com.apptalkingdata.protobuf.CodedOutputByteBufferNano;
import com.apptalkingdata.protobuf.Extension;
import com.apptalkingdata.protobuf.MessageNano;
import com.apptalkingdata.protobuf.UnknownFieldData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class FieldData
implements Cloneable {
    private Extension cachedExtension;
    private Object value;
    private List unknownFieldData = new ArrayList();

    FieldData() {
    }

    int computeSerializedSize() {
        int n2 = 0;
        if (this.value != null) {
            n2 = this.cachedExtension.computeSerializedSize(this.value);
        } else {
            for (UnknownFieldData unknownFieldData : this.unknownFieldData) {
                n2 += unknownFieldData.computeSerializedSize();
            }
        }
        return n2;
    }

    void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.value != null) {
            this.cachedExtension.writeTo(this.value, codedOutputByteBufferNano);
        } else {
            for (UnknownFieldData unknownFieldData : this.unknownFieldData) {
                unknownFieldData.writeTo(codedOutputByteBufferNano);
            }
        }
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof FieldData)) {
            return false;
        }
        FieldData fieldData = (FieldData)object;
        if (this.value != null && fieldData.value != null) {
            if (this.cachedExtension != fieldData.cachedExtension) {
                return false;
            }
            if (!this.cachedExtension.clazz.isArray()) {
                return this.value.equals(fieldData.value);
            }
            if (this.value instanceof byte[]) {
                return Arrays.equals((byte[])this.value, (byte[])fieldData.value);
            }
            if (this.value instanceof int[]) {
                return Arrays.equals((int[])this.value, (int[])fieldData.value);
            }
            if (this.value instanceof long[]) {
                return Arrays.equals((long[])this.value, (long[])fieldData.value);
            }
            if (this.value instanceof float[]) {
                return Arrays.equals((float[])this.value, (float[])fieldData.value);
            }
            if (this.value instanceof double[]) {
                return Arrays.equals((double[])this.value, (double[])fieldData.value);
            }
            if (this.value instanceof boolean[]) {
                return Arrays.equals((boolean[])this.value, (boolean[])fieldData.value);
            }
            return Arrays.deepEquals((Object[])this.value, (Object[])fieldData.value);
        }
        if (this.unknownFieldData != null && fieldData.unknownFieldData != null) {
            return this.unknownFieldData.equals(fieldData.unknownFieldData);
        }
        try {
            return Arrays.equals(this.toByteArray(), fieldData.toByteArray());
        }
        catch (IOException var3_3) {
            throw new IllegalStateException(var3_3);
        }
    }

    public int hashCode() {
        int n2 = 17;
        try {
            n2 = 31 * n2 + Arrays.hashCode(this.toByteArray());
        }
        catch (IOException var2_2) {
            throw new IllegalStateException(var2_2);
        }
        return n2;
    }

    private byte[] toByteArray() {
        byte[] arrby = new byte[this.computeSerializedSize()];
        CodedOutputByteBufferNano codedOutputByteBufferNano = CodedOutputByteBufferNano.newInstance(arrby);
        this.writeTo(codedOutputByteBufferNano);
        return arrby;
    }

    public final FieldData clone() {
        FieldData fieldData = new FieldData();
        try {
            fieldData.cachedExtension = this.cachedExtension;
            if (this.unknownFieldData == null) {
                fieldData.unknownFieldData = null;
            } else {
                fieldData.unknownFieldData.addAll(this.unknownFieldData);
            }
            if (this.value != null) {
                if (this.value instanceof MessageNano) {
                    fieldData.value = ((MessageNano)this.value).clone();
                } else if (this.value instanceof byte[]) {
                    fieldData.value = ((byte[])this.value).clone();
                } else if (this.value instanceof byte[][]) {
                    byte[][] arrarrby;
                    byte[][] arrby = (byte[][])this.value;
                    fieldData.value = arrarrby = new byte[arrby.length][];
                    for (int i2 = 0; i2 < arrby.length; ++i2) {
                        arrarrby[i2] = (byte[])arrby[i2].clone();
                    }
                } else if (this.value instanceof boolean[]) {
                    fieldData.value = ((boolean[])this.value).clone();
                } else if (this.value instanceof int[]) {
                    fieldData.value = ((int[])this.value).clone();
                } else if (this.value instanceof long[]) {
                    fieldData.value = ((long[])this.value).clone();
                } else if (this.value instanceof float[]) {
                    fieldData.value = ((float[])this.value).clone();
                } else if (this.value instanceof double[]) {
                    fieldData.value = ((double[])this.value).clone();
                } else if (this.value instanceof MessageNano[]) {
                    MessageNano[] arrmessageNano;
                    MessageNano[] arrmessageNano2 = (MessageNano[])this.value;
                    fieldData.value = arrmessageNano = new MessageNano[arrmessageNano2.length];
                    for (int i3 = 0; i3 < arrmessageNano2.length; ++i3) {
                        arrmessageNano[i3] = arrmessageNano2[i3].clone();
                    }
                }
            }
            return fieldData;
        }
        catch (CloneNotSupportedException var2_4) {
            throw new AssertionError(var2_4);
        }
    }
}

