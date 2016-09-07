/*
 * Decompiled with CFR 0_115.
 */
package com.apptalkingdata.protobuf;

import com.apptalkingdata.protobuf.MessageNano;
import com.apptalkingdata.protobuf.WireFormatNano;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class CodedOutputByteBufferNano {
    private static final int MAX_UTF8_EXPANSION = 3;
    private final ByteBuffer buffer;
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    public static final int LITTLE_ENDIAN_64_SIZE = 8;

    private CodedOutputByteBufferNano(byte[] arrby, int n2, int n3) {
        this(ByteBuffer.wrap(arrby, n2, n3));
    }

    private CodedOutputByteBufferNano(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        this.buffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static CodedOutputByteBufferNano newInstance(byte[] arrby) {
        return CodedOutputByteBufferNano.newInstance(arrby, 0, arrby.length);
    }

    public static CodedOutputByteBufferNano newInstance(byte[] arrby, int n2, int n3) {
        return new CodedOutputByteBufferNano(arrby, n2, n3);
    }

    public void writeInt64(int n2, long l2) {
        this.writeTag(n2, 0);
        this.writeInt64NoTag(l2);
    }

    public void writeInt32(int n2, int n3) {
        this.writeTag(n2, 0);
        this.writeInt32NoTag(n3);
    }

    public void writeString(int n2, String string) {
        this.writeTag(n2, 2);
        this.writeStringNoTag(string);
    }

    public void writeBytes(int n2, byte[] arrby) {
        this.writeTag(n2, 2);
        this.writeBytesNoTag(arrby);
    }

    public void writeDoubleNoTag(double d2) {
        this.writeRawLittleEndian64(Double.doubleToLongBits(d2));
    }

    public void writeFloatNoTag(float f2) {
        this.writeRawLittleEndian32(Float.floatToIntBits(f2));
    }

    public void writeUInt64NoTag(long l2) {
        this.writeRawVarint64(l2);
    }

    public void writeInt64NoTag(long l2) {
        this.writeRawVarint64(l2);
    }

    public void writeInt32NoTag(int n2) {
        if (n2 >= 0) {
            this.writeRawVarint32(n2);
        } else {
            this.writeRawVarint64(n2);
        }
    }

    public void writeFixed64NoTag(long l2) {
        this.writeRawLittleEndian64(l2);
    }

    public void writeFixed32NoTag(int n2) {
        this.writeRawLittleEndian32(n2);
    }

    public void writeBoolNoTag(boolean bl2) {
        this.writeRawByte(bl2 ? 1 : 0);
    }

    public void writeStringNoTag(String string) {
        try {
            int n2 = CodedOutputByteBufferNano.computeRawVarint32Size(string.length());
            int n3 = CodedOutputByteBufferNano.computeRawVarint32Size(string.length() * 3);
            if (n2 == n3) {
                int n4 = this.buffer.position();
                if (this.buffer.remaining() < n2) {
                    throw new OutOfSpaceException(n4 + n2, this.buffer.limit());
                }
                this.buffer.position(n4 + n2);
                CodedOutputByteBufferNano.encode(string, this.buffer);
                int n5 = this.buffer.position();
                this.buffer.position(n4);
                this.writeRawVarint32(n5 - n4 - n2);
                this.buffer.position(n5);
            } else {
                this.writeRawVarint32(CodedOutputByteBufferNano.encodedLength(string));
                CodedOutputByteBufferNano.encode(string, this.buffer);
            }
        }
        catch (BufferOverflowException var2_3) {
            OutOfSpaceException outOfSpaceException = new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
            outOfSpaceException.initCause(var2_3);
            throw outOfSpaceException;
        }
    }

    private static int encodedLength(CharSequence charSequence) {
        int n2;
        int n3;
        int n4 = n3 = charSequence.length();
        for (n2 = 0; n2 < n3 && charSequence.charAt(n2) < ''; ++n2) {
        }
        while (n2 < n3) {
            char c2 = charSequence.charAt(n2);
            if (c2 < '\u0800') {
                n4 += 127 - c2 >>> 31;
            } else {
                n4 += CodedOutputByteBufferNano.encodedLengthGeneral(charSequence, n2);
                break;
            }
            ++n2;
        }
        if (n4 < n3) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + ((long)n4 + 0x100000000L));
        }
        return n4;
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int n2) {
        int n3 = charSequence.length();
        int n4 = 0;
        for (int i2 = n2; i2 < n3; ++i2) {
            char c2 = charSequence.charAt(i2);
            if (c2 < '\u0800') {
                n4 += 127 - c2 >>> 31;
                continue;
            }
            n4 += 2;
            if ('\ud800' > c2 || c2 > '\udfff') continue;
            int n5 = Character.codePointAt(charSequence, i2);
            if (n5 < 65536) {
                throw new IllegalArgumentException("Unpaired surrogate at index " + i2);
            }
            ++i2;
        }
        return n4;
    }

    private static void encode(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if (byteBuffer.hasArray()) {
            try {
                int n2 = CodedOutputByteBufferNano.encode(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
                byteBuffer.position(n2 - byteBuffer.arrayOffset());
            }
            catch (ArrayIndexOutOfBoundsException var2_3) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(var2_3);
                throw bufferOverflowException;
            }
        } else {
            CodedOutputByteBufferNano.encodeDirect(charSequence, byteBuffer);
        }
    }

    private static void encodeDirect(CharSequence charSequence, ByteBuffer byteBuffer) {
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2;
            char c3 = charSequence.charAt(i2);
            if (c3 < '') {
                byteBuffer.put((byte)c3);
                continue;
            }
            if (c3 < '\u0800') {
                byteBuffer.put((byte)(960 | c3 >>> 6));
                byteBuffer.put((byte)(128 | 63 & c3));
                continue;
            }
            if (c3 < '\ud800' || '\udfff' < c3) {
                byteBuffer.put((byte)(480 | c3 >>> 12));
                byteBuffer.put((byte)(128 | 63 & c3 >>> 6));
                byteBuffer.put((byte)(128 | 63 & c3));
                continue;
            }
            if (i2 + 1 == charSequence.length() || !Character.isSurrogatePair(c3, c2 = charSequence.charAt(++i2))) {
                throw new IllegalArgumentException("Unpaired surrogate at index " + (i2 - 1));
            }
            int n3 = Character.toCodePoint(c3, c2);
            byteBuffer.put((byte)(240 | n3 >>> 18));
            byteBuffer.put((byte)(128 | 63 & n3 >>> 12));
            byteBuffer.put((byte)(128 | 63 & n3 >>> 6));
            byteBuffer.put((byte)(128 | 63 & n3));
        }
    }

    private static int encode(CharSequence charSequence, byte[] arrby, int n2, int n3) {
        int n4;
        char c2;
        int n5 = charSequence.length();
        int n6 = n2;
        int n7 = n2 + n3;
        for (n4 = 0; n4 < n5 && n4 + n6 < n7 && (c2 = charSequence.charAt(n4)) < ''; ++n4) {
            arrby[n6 + n4] = (byte)c2;
        }
        if (n4 == n5) {
            return n6 + n5;
        }
        n6 += n4;
        while (n4 < n5) {
            c2 = charSequence.charAt(n4);
            if (c2 < '' && n6 < n7) {
                arrby[n6++] = (byte)c2;
            } else if (c2 < '\u0800' && n6 <= n7 - 2) {
                arrby[n6++] = (byte)(960 | c2 >>> 6);
                arrby[n6++] = (byte)(128 | 63 & c2);
            } else if ((c2 < '\ud800' || '\udfff' < c2) && n6 <= n7 - 3) {
                arrby[n6++] = (byte)(480 | c2 >>> 12);
                arrby[n6++] = (byte)(128 | 63 & c2 >>> 6);
                arrby[n6++] = (byte)(128 | 63 & c2);
            } else if (n6 <= n7 - 4) {
                char c3;
                if (n4 + 1 == charSequence.length() || !Character.isSurrogatePair(c2, c3 = charSequence.charAt(++n4))) {
                    throw new IllegalArgumentException("Unpaired surrogate at index " + (n4 - 1));
                }
                int n8 = Character.toCodePoint(c2, c3);
                arrby[n6++] = (byte)(240 | n8 >>> 18);
                arrby[n6++] = (byte)(128 | 63 & n8 >>> 12);
                arrby[n6++] = (byte)(128 | 63 & n8 >>> 6);
                arrby[n6++] = (byte)(128 | 63 & n8);
            } else {
                if (!('\ud800' > c2 || c2 > '\udfff' || n4 + 1 != charSequence.length() && Character.isSurrogatePair(c2, charSequence.charAt(n4 + 1)))) {
                    throw new IllegalArgumentException("Unpaired surrogate at index " + n4);
                }
                throw new ArrayIndexOutOfBoundsException("Failed writing " + c2 + " at index " + n6);
            }
            ++n4;
        }
        return n6;
    }

    public void writeGroupNoTag(MessageNano messageNano) {
        messageNano.writeTo(this);
    }

    public void writeMessageNoTag(MessageNano messageNano) {
        this.writeRawVarint32(messageNano.getCachedSize());
        messageNano.writeTo(this);
    }

    public void writeBytesNoTag(byte[] arrby) {
        this.writeRawVarint32(arrby.length);
        this.writeRawBytes(arrby);
    }

    public void writeUInt32NoTag(int n2) {
        this.writeRawVarint32(n2);
    }

    public void writeEnumNoTag(int n2) {
        this.writeRawVarint32(n2);
    }

    public void writeSFixed32NoTag(int n2) {
        this.writeRawLittleEndian32(n2);
    }

    public void writeSFixed64NoTag(long l2) {
        this.writeRawLittleEndian64(l2);
    }

    public void writeSInt32NoTag(int n2) {
        this.writeRawVarint32(CodedOutputByteBufferNano.encodeZigZag32(n2));
    }

    public void writeSInt64NoTag(long l2) {
        this.writeRawVarint64(CodedOutputByteBufferNano.encodeZigZag64(l2));
    }

    public static int computeDoubleSize(int n2, double d2) {
        return CodedOutputByteBufferNano.computeTagSize(n2) + CodedOutputByteBufferNano.computeDoubleSizeNoTag(d2);
    }

    public static int computeFloatSize(int n2, float f2) {
        return CodedOutputByteBufferNano.computeTagSize(n2) + CodedOutputByteBufferNano.computeFloatSizeNoTag(f2);
    }

    public static int computeUInt64Size(int n2, long l2) {
        return CodedOutputByteBufferNano.computeTagSize(n2) + CodedOutputByteBufferNano.computeUInt64SizeNoTag(l2);
    }

    public static int computeInt64Size(int n2, long l2) {
        return CodedOutputByteBufferNano.computeTagSize(n2) + CodedOutputByteBufferNano.computeInt64SizeNoTag(l2);
    }

    public static int computeInt32Size(int n2, int n3) {
        return CodedOutputByteBufferNano.computeTagSize(n2) + CodedOutputByteBufferNano.computeInt32SizeNoTag(n3);
    }

    public static int computeFixed64Size(int n2, long l2) {
        return CodedOutputByteBufferNano.computeTagSize(n2) + CodedOutputByteBufferNano.computeFixed64SizeNoTag(l2);
    }

    public static int computeFixed32Size(int n2, int n3) {
        return CodedOutputByteBufferNano.computeTagSize(n2) + CodedOutputByteBufferNano.computeFixed32SizeNoTag(n3);
    }

    public static int computeBoolSize(int n2, boolean bl2) {
        return CodedOutputByteBufferNano.computeTagSize(n2) + CodedOutputByteBufferNano.computeBoolSizeNoTag(bl2);
    }

    public static int computeStringSize(int n2, String string) {
        return CodedOutputByteBufferNano.computeTagSize(n2) + CodedOutputByteBufferNano.computeStringSizeNoTag(string);
    }

    public static int computeGroupSize(int n2, MessageNano messageNano) {
        return CodedOutputByteBufferNano.computeTagSize(n2) * 2 + CodedOutputByteBufferNano.computeGroupSizeNoTag(messageNano);
    }

    public static int computeMessageSize(int n2, MessageNano messageNano) {
        return CodedOutputByteBufferNano.computeTagSize(n2) + CodedOutputByteBufferNano.computeMessageSizeNoTag(messageNano);
    }

    public static int computeBytesSize(int n2, byte[] arrby) {
        return CodedOutputByteBufferNano.computeTagSize(n2) + CodedOutputByteBufferNano.computeBytesSizeNoTag(arrby);
    }

    public static int computeUInt32Size(int n2, int n3) {
        return CodedOutputByteBufferNano.computeTagSize(n2) + CodedOutputByteBufferNano.computeUInt32SizeNoTag(n3);
    }

    public static int computeEnumSize(int n2, int n3) {
        return CodedOutputByteBufferNano.computeTagSize(n2) + CodedOutputByteBufferNano.computeEnumSizeNoTag(n3);
    }

    public static int computeSFixed32Size(int n2, int n3) {
        return CodedOutputByteBufferNano.computeTagSize(n2) + CodedOutputByteBufferNano.computeSFixed32SizeNoTag(n3);
    }

    public static int computeSFixed64Size(int n2, long l2) {
        return CodedOutputByteBufferNano.computeTagSize(n2) + CodedOutputByteBufferNano.computeSFixed64SizeNoTag(l2);
    }

    public static int computeSInt32Size(int n2, int n3) {
        return CodedOutputByteBufferNano.computeTagSize(n2) + CodedOutputByteBufferNano.computeSInt32SizeNoTag(n3);
    }

    public static int computeSInt64Size(int n2, long l2) {
        return CodedOutputByteBufferNano.computeTagSize(n2) + CodedOutputByteBufferNano.computeSInt64SizeNoTag(l2);
    }

    public static int computeDoubleSizeNoTag(double d2) {
        return 8;
    }

    public static int computeFloatSizeNoTag(float f2) {
        return 4;
    }

    public static int computeUInt64SizeNoTag(long l2) {
        return CodedOutputByteBufferNano.computeRawVarint64Size(l2);
    }

    public static int computeInt64SizeNoTag(long l2) {
        return CodedOutputByteBufferNano.computeRawVarint64Size(l2);
    }

    public static int computeInt32SizeNoTag(int n2) {
        if (n2 >= 0) {
            return CodedOutputByteBufferNano.computeRawVarint32Size(n2);
        }
        return 10;
    }

    public static int computeFixed64SizeNoTag(long l2) {
        return 8;
    }

    public static int computeFixed32SizeNoTag(int n2) {
        return 4;
    }

    public static int computeBoolSizeNoTag(boolean bl2) {
        return 1;
    }

    public static int computeStringSizeNoTag(String string) {
        int n2 = CodedOutputByteBufferNano.encodedLength(string);
        return CodedOutputByteBufferNano.computeRawVarint32Size(n2) + n2;
    }

    public static int computeGroupSizeNoTag(MessageNano messageNano) {
        return messageNano.getSerializedSize();
    }

    public static int computeMessageSizeNoTag(MessageNano messageNano) {
        int n2 = messageNano.getSerializedSize();
        return CodedOutputByteBufferNano.computeRawVarint32Size(n2) + n2;
    }

    public static int computeBytesSizeNoTag(byte[] arrby) {
        return CodedOutputByteBufferNano.computeRawVarint32Size(arrby.length) + arrby.length;
    }

    public static int computeUInt32SizeNoTag(int n2) {
        return CodedOutputByteBufferNano.computeRawVarint32Size(n2);
    }

    public static int computeEnumSizeNoTag(int n2) {
        return CodedOutputByteBufferNano.computeRawVarint32Size(n2);
    }

    public static int computeSFixed32SizeNoTag(int n2) {
        return 4;
    }

    public static int computeSFixed64SizeNoTag(long l2) {
        return 8;
    }

    public static int computeSInt32SizeNoTag(int n2) {
        return CodedOutputByteBufferNano.computeRawVarint32Size(CodedOutputByteBufferNano.encodeZigZag32(n2));
    }

    public static int computeSInt64SizeNoTag(long l2) {
        return CodedOutputByteBufferNano.computeRawVarint64Size(CodedOutputByteBufferNano.encodeZigZag64(l2));
    }

    public int spaceLeft() {
        return this.buffer.remaining();
    }

    public void checkNoSpaceLeft() {
        if (this.spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public void writeRawByte(byte by2) {
        if (!this.buffer.hasRemaining()) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.put(by2);
    }

    public void writeRawByte(int n2) {
        this.writeRawByte((byte)n2);
    }

    public void writeRawBytes(byte[] arrby) {
        this.writeRawBytes(arrby, 0, arrby.length);
    }

    public void writeRawBytes(byte[] arrby, int n2, int n3) {
        if (this.buffer.remaining() < n3) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.put(arrby, n2, n3);
    }

    public void writeTag(int n2, int n3) {
        this.writeRawVarint32(WireFormatNano.makeTag(n2, n3));
    }

    public static int computeTagSize(int n2) {
        return CodedOutputByteBufferNano.computeRawVarint32Size(WireFormatNano.makeTag(n2, 0));
    }

    public void writeRawVarint32(int n2) {
        do {
            if ((n2 & -128) == 0) {
                this.writeRawByte(n2);
                return;
            }
            this.writeRawByte(n2 & 127 | 128);
            n2 >>>= 7;
        } while (true);
    }

    public static int computeRawVarint32Size(int n2) {
        if ((n2 & -128) == 0) {
            return 1;
        }
        if ((n2 & -16384) == 0) {
            return 2;
        }
        if ((n2 & -2097152) == 0) {
            return 3;
        }
        if ((n2 & -268435456) == 0) {
            return 4;
        }
        return 5;
    }

    public void writeRawVarint64(long l2) {
        do {
            if ((l2 & -128) == 0) {
                this.writeRawByte((int)l2);
                return;
            }
            this.writeRawByte((int)l2 & 127 | 128);
            l2 >>>= 7;
        } while (true);
    }

    public static int computeRawVarint64Size(long l2) {
        if ((l2 & -128) == 0) {
            return 1;
        }
        if ((l2 & -16384) == 0) {
            return 2;
        }
        if ((l2 & -2097152) == 0) {
            return 3;
        }
        if ((l2 & -268435456) == 0) {
            return 4;
        }
        if ((l2 & -34359738368L) == 0) {
            return 5;
        }
        if ((l2 & -4398046511104L) == 0) {
            return 6;
        }
        if ((l2 & -562949953421312L) == 0) {
            return 7;
        }
        if ((l2 & -72057594037927936L) == 0) {
            return 8;
        }
        if ((l2 & Long.MIN_VALUE) == 0) {
            return 9;
        }
        return 10;
    }

    public void writeRawLittleEndian32(int n2) {
        if (this.buffer.remaining() < 4) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.putInt(n2);
    }

    public void writeRawLittleEndian64(long l2) {
        if (this.buffer.remaining() < 8) {
            throw new OutOfSpaceException(this.buffer.position(), this.buffer.limit());
        }
        this.buffer.putLong(l2);
    }

    public static int encodeZigZag32(int n2) {
        return n2 << 1 ^ n2 >> 31;
    }

    public static long encodeZigZag64(long l2) {
        return l2 << 1 ^ l2 >> 63;
    }

    public static class OutOfSpaceException
    extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException(int n2, int n3) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + n2 + " limit " + n3 + ").");
        }
    }

}

