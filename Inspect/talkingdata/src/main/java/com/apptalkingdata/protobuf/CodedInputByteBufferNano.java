/*
 * Decompiled with CFR 0_115.
 */
package com.apptalkingdata.protobuf;

import com.apptalkingdata.protobuf.InvalidProtocolBufferNanoException;
import com.apptalkingdata.protobuf.MessageNano;
import com.apptalkingdata.protobuf.WireFormatNano;

public final class CodedInputByteBufferNano {
    private final byte[] buffer;
    private int bufferStart;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int bufferPos;
    private int lastTag;
    private int currentLimit = Integer.MAX_VALUE;
    private int recursionDepth;
    private int recursionLimit = 64;
    private int sizeLimit = 67108864;
    private static final int DEFAULT_RECURSION_LIMIT = 64;
    private static final int DEFAULT_SIZE_LIMIT = 67108864;

    public static CodedInputByteBufferNano newInstance(byte[] arrby) {
        return CodedInputByteBufferNano.newInstance(arrby, 0, arrby.length);
    }

    public static CodedInputByteBufferNano newInstance(byte[] arrby, int n2, int n3) {
        return new CodedInputByteBufferNano(arrby, n2, n3);
    }

    public int readTag() {
        if (this.isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        this.lastTag = this.readRawVarint32();
        if (this.lastTag == 0) {
            throw InvalidProtocolBufferNanoException.invalidTag();
        }
        return this.lastTag;
    }

    public void checkLastTagWas(int n2) {
        if (this.lastTag != n2) {
            throw InvalidProtocolBufferNanoException.invalidEndTag();
        }
    }

    public boolean skipField(int n2) {
        switch (WireFormatNano.getTagWireType(n2)) {
            case 0: {
                this.readInt32();
                return true;
            }
            case 1: {
                this.readRawLittleEndian64();
                return true;
            }
            case 2: {
                this.skipRawBytes(this.readRawVarint32());
                return true;
            }
            case 3: {
                this.skipMessage();
                this.checkLastTagWas(WireFormatNano.makeTag(WireFormatNano.getTagFieldNumber(n2), 4));
                return true;
            }
            case 4: {
                return false;
            }
            case 5: {
                this.readRawLittleEndian32();
                return true;
            }
        }
        throw InvalidProtocolBufferNanoException.invalidWireType();
    }

    public void skipMessage() {
        int n2;
        while ((n2 = this.readTag()) != 0 && this.skipField(n2)) {
        }
    }

    public double readDouble() {
        return Double.longBitsToDouble(this.readRawLittleEndian64());
    }

    public float readFloat() {
        return Float.intBitsToFloat(this.readRawLittleEndian32());
    }

    public long readUInt64() {
        return this.readRawVarint64();
    }

    public long readInt64() {
        return this.readRawVarint64();
    }

    public int readInt32() {
        return this.readRawVarint32();
    }

    public long readFixed64() {
        return this.readRawLittleEndian64();
    }

    public int readFixed32() {
        return this.readRawLittleEndian32();
    }

    public boolean readBool() {
        return this.readRawVarint32() != 0;
    }

    public String readString() {
        int n2 = this.readRawVarint32();
        if (n2 <= this.bufferSize - this.bufferPos && n2 > 0) {
            String string = new String(this.buffer, this.bufferPos, n2, "UTF-8");
            this.bufferPos += n2;
            return string;
        }
        return new String(this.readRawBytes(n2), "UTF-8");
    }

    public void readGroup(MessageNano messageNano, int n2) {
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        }
        ++this.recursionDepth;
        messageNano.mergeFrom(this);
        this.checkLastTagWas(WireFormatNano.makeTag(n2, 4));
        --this.recursionDepth;
    }

    public void readMessage(MessageNano messageNano) {
        int n2 = this.readRawVarint32();
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        }
        int n3 = this.pushLimit(n2);
        ++this.recursionDepth;
        messageNano.mergeFrom(this);
        this.checkLastTagWas(0);
        --this.recursionDepth;
        this.popLimit(n3);
    }

    public byte[] readBytes() {
        int n2 = this.readRawVarint32();
        if (n2 <= this.bufferSize - this.bufferPos && n2 > 0) {
            byte[] arrby = new byte[n2];
            System.arraycopy(this.buffer, this.bufferPos, arrby, 0, n2);
            this.bufferPos += n2;
            return arrby;
        }
        if (n2 == 0) {
            return WireFormatNano.EMPTY_BYTES;
        }
        return this.readRawBytes(n2);
    }

    public int readUInt32() {
        return this.readRawVarint32();
    }

    public int readEnum() {
        return this.readRawVarint32();
    }

    public int readSFixed32() {
        return this.readRawLittleEndian32();
    }

    public long readSFixed64() {
        return this.readRawLittleEndian64();
    }

    public int readSInt32() {
        return CodedInputByteBufferNano.decodeZigZag32(this.readRawVarint32());
    }

    public long readSInt64() {
        return CodedInputByteBufferNano.decodeZigZag64(this.readRawVarint64());
    }

    public int readRawVarint32() {
        byte by2 = this.readRawByte();
        if (by2 >= 0) {
            return by2;
        }
        int n2 = by2 & 127;
        by2 = this.readRawByte();
        if (by2 >= 0) {
            n2 |= by2 << 7;
        } else {
            n2 |= (by2 & 127) << 7;
            by2 = this.readRawByte();
            if (by2 >= 0) {
                n2 |= by2 << 14;
            } else {
                n2 |= (by2 & 127) << 14;
                by2 = this.readRawByte();
                if (by2 >= 0) {
                    n2 |= by2 << 21;
                } else {
                    n2 |= (by2 & 127) << 21;
                    by2 = this.readRawByte();
                    n2 |= by2 << 28;
                    if (by2 < 0) {
                        for (int i2 = 0; i2 < 5; ++i2) {
                            if (this.readRawByte() < 0) continue;
                            return n2;
                        }
                        throw InvalidProtocolBufferNanoException.malformedVarint();
                    }
                }
            }
        }
        return n2;
    }

    public long readRawVarint64() {
        long l2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte by2 = this.readRawByte();
            l2 |= (long)(by2 & 127) << i2;
            if ((by2 & 128) != 0) continue;
            return l2;
        }
        throw InvalidProtocolBufferNanoException.malformedVarint();
    }

    public int readRawLittleEndian32() {
        byte by2 = this.readRawByte();
        byte by3 = this.readRawByte();
        byte by4 = this.readRawByte();
        byte by5 = this.readRawByte();
        return by2 & 255 | (by3 & 255) << 8 | (by4 & 255) << 16 | (by5 & 255) << 24;
    }

    public long readRawLittleEndian64() {
        byte by2 = this.readRawByte();
        byte by3 = this.readRawByte();
        byte by4 = this.readRawByte();
        byte by5 = this.readRawByte();
        byte by6 = this.readRawByte();
        byte by7 = this.readRawByte();
        byte by8 = this.readRawByte();
        byte by9 = this.readRawByte();
        return (long)by2 & 255 | ((long)by3 & 255) << 8 | ((long)by4 & 255) << 16 | ((long)by5 & 255) << 24 | ((long)by6 & 255) << 32 | ((long)by7 & 255) << 40 | ((long)by8 & 255) << 48 | ((long)by9 & 255) << 56;
    }

    public static int decodeZigZag32(int n2) {
        return n2 >>> 1 ^ - (n2 & 1);
    }

    public static long decodeZigZag64(long l2) {
        return l2 >>> 1 ^ - (l2 & 1);
    }

    private CodedInputByteBufferNano(byte[] arrby, int n2, int n3) {
        this.buffer = arrby;
        this.bufferStart = n2;
        this.bufferSize = n2 + n3;
        this.bufferPos = n2;
    }

    public int pushLimit(int n2) {
        if (n2 < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int n3 = this.currentLimit;
        if ((n2 += this.bufferPos) > n3) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        this.currentLimit = n2;
        this.recomputeBufferSizeAfterLimit();
        return n3;
    }

    private void recomputeBufferSizeAfterLimit() {
        this.bufferSize += this.bufferSizeAfterLimit;
        int n2 = this.bufferSize;
        if (n2 > this.currentLimit) {
            this.bufferSizeAfterLimit = n2 - this.currentLimit;
            this.bufferSize -= this.bufferSizeAfterLimit;
        } else {
            this.bufferSizeAfterLimit = 0;
        }
    }

    public void popLimit(int n2) {
        this.currentLimit = n2;
        this.recomputeBufferSizeAfterLimit();
    }

    public boolean isAtEnd() {
        return this.bufferPos == this.bufferSize;
    }

    public byte readRawByte() {
        if (this.bufferPos == this.bufferSize) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        return this.buffer[this.bufferPos++];
    }

    public byte[] readRawBytes(int n2) {
        if (n2 < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        if (this.bufferPos + n2 > this.currentLimit) {
            this.skipRawBytes(this.currentLimit - this.bufferPos);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (n2 <= this.bufferSize - this.bufferPos) {
            byte[] arrby = new byte[n2];
            System.arraycopy(this.buffer, this.bufferPos, arrby, 0, n2);
            this.bufferPos += n2;
            return arrby;
        }
        throw InvalidProtocolBufferNanoException.truncatedMessage();
    }

    public void skipRawBytes(int n2) {
        if (n2 < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        if (this.bufferPos + n2 > this.currentLimit) {
            this.skipRawBytes(this.currentLimit - this.bufferPos);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (n2 <= this.bufferSize - this.bufferPos) {
            this.bufferPos += n2;
        } else {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
    }
}

