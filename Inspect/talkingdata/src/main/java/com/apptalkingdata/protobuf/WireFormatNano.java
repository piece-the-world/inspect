/*
 * Decompiled with CFR 0_115.
 */
package com.apptalkingdata.protobuf;

import com.apptalkingdata.protobuf.CodedInputByteBufferNano;

public final class WireFormatNano {
    static final int WIRETYPE_VARINT = 0;
    static final int WIRETYPE_FIXED64 = 1;
    static final int WIRETYPE_LENGTH_DELIMITED = 2;
    static final int WIRETYPE_START_GROUP = 3;
    static final int WIRETYPE_END_GROUP = 4;
    static final int WIRETYPE_FIXED32 = 5;
    static final int TAG_TYPE_BITS = 3;
    static final int TAG_TYPE_MASK = 7;
    public static final byte[] EMPTY_BYTES = new byte[0];

    private WireFormatNano() {
    }

    static int getTagWireType(int n2) {
        return n2 & 7;
    }

    public static int getTagFieldNumber(int n2) {
        return n2 >>> 3;
    }

    static int makeTag(int n2, int n3) {
        return n2 << 3 | n3;
    }

    public static boolean parseUnknownField(CodedInputByteBufferNano codedInputByteBufferNano, int n2) {
        return codedInputByteBufferNano.skipField(n2);
    }
}

