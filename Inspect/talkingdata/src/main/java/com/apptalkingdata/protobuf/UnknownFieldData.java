/*
 * Decompiled with CFR 0_115.
 */
package com.apptalkingdata.protobuf;

import com.apptalkingdata.protobuf.CodedOutputByteBufferNano;
import java.util.Arrays;

final class UnknownFieldData {
    final int tag;
    final byte[] bytes;

    UnknownFieldData(int n2, byte[] arrby) {
        this.tag = n2;
        this.bytes = arrby;
    }

    int computeSerializedSize() {
        int n2 = 0;
        n2 += CodedOutputByteBufferNano.computeRawVarint32Size(this.tag);
        return n2 += this.bytes.length;
    }

    void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeRawVarint32(this.tag);
        codedOutputByteBufferNano.writeRawBytes(this.bytes);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof UnknownFieldData)) {
            return false;
        }
        UnknownFieldData unknownFieldData = (UnknownFieldData)object;
        return this.tag == unknownFieldData.tag && Arrays.equals(this.bytes, unknownFieldData.bytes);
    }

    public int hashCode() {
        int n2 = 17;
        n2 = 31 * n2 + this.tag;
        n2 = 31 * n2 + Arrays.hashCode(this.bytes);
        return n2;
    }
}

