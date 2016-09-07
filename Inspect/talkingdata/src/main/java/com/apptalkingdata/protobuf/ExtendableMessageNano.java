/*
 * Decompiled with CFR 0_115.
 */
package com.apptalkingdata.protobuf;

import com.apptalkingdata.protobuf.CodedOutputByteBufferNano;
import com.apptalkingdata.protobuf.FieldArray;
import com.apptalkingdata.protobuf.FieldData;
import com.apptalkingdata.protobuf.InternalNano;
import com.apptalkingdata.protobuf.MessageNano;

public abstract class ExtendableMessageNano
extends MessageNano {
    protected FieldArray unknownFieldData;

    @Override
    protected int computeSerializedSize() {
        int n2 = 0;
        if (this.unknownFieldData != null) {
            for (int i2 = 0; i2 < this.unknownFieldData.size(); ++i2) {
                FieldData fieldData = this.unknownFieldData.dataAt(i2);
                n2 += fieldData.computeSerializedSize();
            }
        }
        return n2;
    }

    @Override
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.unknownFieldData == null) {
            return;
        }
        for (int i2 = 0; i2 < this.unknownFieldData.size(); ++i2) {
            FieldData fieldData = this.unknownFieldData.dataAt(i2);
            fieldData.writeTo(codedOutputByteBufferNano);
        }
    }

    @Override
    public ExtendableMessageNano clone() {
        ExtendableMessageNano extendableMessageNano = (ExtendableMessageNano)super.clone();
        InternalNano.cloneUnknownFieldData(this, extendableMessageNano);
        return extendableMessageNano;
    }
}

