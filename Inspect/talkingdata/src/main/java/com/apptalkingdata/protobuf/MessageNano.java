/*
 * Decompiled with CFR 0_115.
 */
package com.apptalkingdata.protobuf;

import com.apptalkingdata.protobuf.CodedInputByteBufferNano;
import com.apptalkingdata.protobuf.CodedOutputByteBufferNano;
import com.apptalkingdata.protobuf.InvalidProtocolBufferNanoException;
import com.apptalkingdata.protobuf.MessageNanoPrinter;
import java.io.IOException;

public abstract class MessageNano {
    public volatile int cachedSize = -1;

    public int getCachedSize() {
        if (this.cachedSize < 0) {
            this.getSerializedSize();
        }
        return this.cachedSize;
    }

    public int getSerializedSize() {
        int n2;
        this.cachedSize = n2 = this.computeSerializedSize();
        return n2;
    }

    public int computeSerializedSize() {
        return 0;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
    }

    public abstract MessageNano mergeFrom(CodedInputByteBufferNano var1);

    public static final byte[] toByteArray(MessageNano messageNano) {
        byte[] arrby = new byte[messageNano.getSerializedSize()];
        MessageNano.toByteArray(messageNano, arrby, 0, arrby.length);
        return arrby;
    }

    public static final void toByteArray(MessageNano messageNano, byte[] arrby, int n2, int n3) {
        try {
            CodedOutputByteBufferNano codedOutputByteBufferNano = CodedOutputByteBufferNano.newInstance(arrby, n2, n3);
            messageNano.writeTo(codedOutputByteBufferNano);
            codedOutputByteBufferNano.checkNoSpaceLeft();
        }
        catch (IOException var4_5) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", var4_5);
        }
    }

    public static final MessageNano mergeFrom(MessageNano messageNano, byte[] arrby) {
        return MessageNano.mergeFrom(messageNano, arrby, 0, arrby.length);
    }

    public static final MessageNano mergeFrom(MessageNano messageNano, byte[] arrby, int n2, int n3) {
        try {
            CodedInputByteBufferNano codedInputByteBufferNano = CodedInputByteBufferNano.newInstance(arrby, n2, n3);
            messageNano.mergeFrom(codedInputByteBufferNano);
            codedInputByteBufferNano.checkLastTagWas(0);
            return messageNano;
        }
        catch (InvalidProtocolBufferNanoException var4_5) {
            throw var4_5;
        }
        catch (IOException var4_6) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public String toString() {
        return MessageNanoPrinter.print(this);
    }

    public MessageNano clone() {
        return (MessageNano)super.clone();
    }
}

