/*
 * Decompiled with CFR 0_115.
 */
package com.apptalkingdata.protobuf;

import com.apptalkingdata.protobuf.CodedInputByteBufferNano;
import com.apptalkingdata.protobuf.CodedOutputByteBufferNano;
import com.apptalkingdata.protobuf.MessageNano;
import com.apptalkingdata.protobuf.UnknownFieldData;
import com.apptalkingdata.protobuf.WireFormatNano;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Extension {
    public static final int TYPE_DOUBLE = 1;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_INT64 = 3;
    public static final int TYPE_UINT64 = 4;
    public static final int TYPE_INT32 = 5;
    public static final int TYPE_FIXED64 = 6;
    public static final int TYPE_FIXED32 = 7;
    public static final int TYPE_BOOL = 8;
    public static final int TYPE_STRING = 9;
    public static final int TYPE_GROUP = 10;
    public static final int TYPE_MESSAGE = 11;
    public static final int TYPE_BYTES = 12;
    public static final int TYPE_UINT32 = 13;
    public static final int TYPE_ENUM = 14;
    public static final int TYPE_SFIXED32 = 15;
    public static final int TYPE_SFIXED64 = 16;
    public static final int TYPE_SINT32 = 17;
    public static final int TYPE_SINT64 = 18;
    protected final int type;
    protected final Class clazz;
    public final int tag;
    protected final boolean repeated;

    @Deprecated
    public static Extension createMessageTyped(int n2, Class class_, int n3) {
        return new Extension(n2, class_, n3, false);
    }

    public static Extension createMessageTyped(int n2, Class class_, long l2) {
        return new Extension(n2, class_, (int)l2, false);
    }

    public static Extension createRepeatedMessageTyped(int n2, Class class_, long l2) {
        return new Extension(n2, class_, (int)l2, true);
    }

    public static Extension createPrimitiveTyped(int n2, Class class_, long l2) {
        return new PrimitiveExtension(n2, class_, (int)l2, false, 0, 0);
    }

    public static Extension createRepeatedPrimitiveTyped(int n2, Class class_, long l2, long l3, long l4) {
        return new PrimitiveExtension(n2, class_, (int)l2, true, (int)l3, (int)l4);
    }

    private Extension(int n2, Class class_, int n3, boolean bl2) {
        this.type = n2;
        this.clazz = class_;
        this.tag = n3;
        this.repeated = bl2;
    }

    final Object getValueFrom(List list) {
        if (list == null) {
            return null;
        }
        return this.repeated ? this.getRepeatedValueFrom(list) : this.getSingularValueFrom(list);
    }

    private Object getRepeatedValueFrom(List list) {
        int n2;
        ArrayList arrayList = new ArrayList();
        for (n2 = 0; n2 < list.size(); ++n2) {
            UnknownFieldData unknownFieldData = (UnknownFieldData)list.get(n2);
            if (unknownFieldData.bytes.length == 0) continue;
            this.readDataInto(unknownFieldData, arrayList);
        }
        n2 = arrayList.size();
        if (n2 == 0) {
            return null;
        }
        Object t2 = this.clazz.cast(Array.newInstance(this.clazz.getComponentType(), n2));
        for (int i2 = 0; i2 < n2; ++i2) {
            Array.set(t2, i2, arrayList.get(i2));
        }
        return t2;
    }

    private Object getSingularValueFrom(List list) {
        if (list.isEmpty()) {
            return null;
        }
        UnknownFieldData unknownFieldData = (UnknownFieldData)list.get(list.size() - 1);
        return this.clazz.cast(this.readData(CodedInputByteBufferNano.newInstance(unknownFieldData.bytes)));
    }

    protected Object readData(CodedInputByteBufferNano codedInputByteBufferNano) {
        Class class_ = this.repeated ? this.clazz.getComponentType() : this.clazz;
        try {
            switch (this.type) {
                case 10: {
                    MessageNano messageNano = (MessageNano)class_.newInstance();
                    codedInputByteBufferNano.readGroup(messageNano, WireFormatNano.getTagFieldNumber(this.tag));
                    return messageNano;
                }
                case 11: {
                    MessageNano messageNano = (MessageNano)class_.newInstance();
                    codedInputByteBufferNano.readMessage(messageNano);
                    return messageNano;
                }
            }
            throw new IllegalArgumentException("Unknown type " + this.type);
        }
        catch (InstantiationException var3_4) {
            throw new IllegalArgumentException("Error creating instance of class " + class_, var3_4);
        }
        catch (IllegalAccessException var3_5) {
            throw new IllegalArgumentException("Error creating instance of class " + class_, var3_5);
        }
        catch (IOException var3_6) {
            throw new IllegalArgumentException("Error reading extension field", var3_6);
        }
    }

    protected void readDataInto(UnknownFieldData unknownFieldData, List list) {
        list.add(this.readData(CodedInputByteBufferNano.newInstance(unknownFieldData.bytes)));
    }

    void writeTo(Object object, CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.repeated) {
            this.writeRepeatedData(object, codedOutputByteBufferNano);
        } else {
            this.writeSingularData(object, codedOutputByteBufferNano);
        }
    }

    protected void writeSingularData(Object object, CodedOutputByteBufferNano codedOutputByteBufferNano) {
        block6 : {
            try {
                codedOutputByteBufferNano.writeRawVarint32(this.tag);
                switch (this.type) {
                    case 10: {
                        MessageNano messageNano = (MessageNano)object;
                        int n2 = WireFormatNano.getTagFieldNumber(this.tag);
                        codedOutputByteBufferNano.writeGroupNoTag(messageNano);
                        codedOutputByteBufferNano.writeTag(n2, 4);
                        break block6;
                    }
                    case 11: {
                        MessageNano messageNano = (MessageNano)object;
                        codedOutputByteBufferNano.writeMessageNoTag(messageNano);
                        break block6;
                    }
                }
                throw new IllegalArgumentException("Unknown type " + this.type);
            }
            catch (IOException var3_4) {
                throw new IllegalStateException(var3_4);
            }
        }
    }

    protected void writeRepeatedData(Object object, CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int n2 = Array.getLength(object);
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object2 = Array.get(object, i2);
            if (object2 == null) continue;
            this.writeSingularData(object2, codedOutputByteBufferNano);
        }
    }

    int computeSerializedSize(Object object) {
        if (this.repeated) {
            return this.computeRepeatedSerializedSize(object);
        }
        return this.computeSingularSerializedSize(object);
    }

    protected int computeRepeatedSerializedSize(Object object) {
        int n2 = 0;
        int n3 = Array.getLength(object);
        for (int i2 = 0; i2 < n3; ++i2) {
            Object object2 = Array.get(object, i2);
            if (object2 == null) continue;
            n2 += this.computeSingularSerializedSize(Array.get(object, i2));
        }
        return n2;
    }

    protected int computeSingularSerializedSize(Object object) {
        int n2 = WireFormatNano.getTagFieldNumber(this.tag);
        switch (this.type) {
            case 10: {
                MessageNano messageNano = (MessageNano)object;
                return CodedOutputByteBufferNano.computeGroupSize(n2, messageNano);
            }
            case 11: {
                MessageNano messageNano = (MessageNano)object;
                return CodedOutputByteBufferNano.computeMessageSize(n2, messageNano);
            }
        }
        throw new IllegalArgumentException("Unknown type " + this.type);
    }

    static class PrimitiveExtension
    extends Extension {
        private final int nonPackedTag;
        private final int packedTag;

        public PrimitiveExtension(int n2, Class class_, int n3, boolean bl2, int n4, int n5) {
            super(n2, class_, n3, bl2);
            this.nonPackedTag = n4;
            this.packedTag = n5;
        }

        @Override
        protected Object readData(CodedInputByteBufferNano codedInputByteBufferNano) {
            try {
                switch (this.type) {
                    case 1: {
                        return codedInputByteBufferNano.readDouble();
                    }
                    case 2: {
                        return Float.valueOf(codedInputByteBufferNano.readFloat());
                    }
                    case 3: {
                        return codedInputByteBufferNano.readInt64();
                    }
                    case 4: {
                        return codedInputByteBufferNano.readUInt64();
                    }
                    case 5: {
                        return codedInputByteBufferNano.readInt32();
                    }
                    case 6: {
                        return codedInputByteBufferNano.readFixed64();
                    }
                    case 7: {
                        return codedInputByteBufferNano.readFixed32();
                    }
                    case 8: {
                        return codedInputByteBufferNano.readBool();
                    }
                    case 9: {
                        return codedInputByteBufferNano.readString();
                    }
                    case 12: {
                        return codedInputByteBufferNano.readBytes();
                    }
                    case 13: {
                        return codedInputByteBufferNano.readUInt32();
                    }
                    case 14: {
                        return codedInputByteBufferNano.readEnum();
                    }
                    case 15: {
                        return codedInputByteBufferNano.readSFixed32();
                    }
                    case 16: {
                        return codedInputByteBufferNano.readSFixed64();
                    }
                    case 17: {
                        return codedInputByteBufferNano.readSInt32();
                    }
                    case 18: {
                        return codedInputByteBufferNano.readSInt64();
                    }
                }
                throw new IllegalArgumentException("Unknown type " + this.type);
            }
            catch (IOException var2_2) {
                throw new IllegalArgumentException("Error reading extension field", var2_2);
            }
        }

        @Override
        protected void readDataInto(UnknownFieldData unknownFieldData, List list) {
            if (unknownFieldData.tag == this.nonPackedTag) {
                list.add(this.readData(CodedInputByteBufferNano.newInstance(unknownFieldData.bytes)));
            } else {
                CodedInputByteBufferNano codedInputByteBufferNano = CodedInputByteBufferNano.newInstance(unknownFieldData.bytes);
                try {
                    codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                }
                catch (IOException var4_4) {
                    throw new IllegalArgumentException("Error reading extension field", var4_4);
                }
                while (!codedInputByteBufferNano.isAtEnd()) {
                    list.add(this.readData(codedInputByteBufferNano));
                }
            }
        }

        @Override
        protected final void writeSingularData(Object object, CodedOutputByteBufferNano codedOutputByteBufferNano) {
            block20 : {
                try {
                    codedOutputByteBufferNano.writeRawVarint32(this.tag);
                    switch (this.type) {
                        case 1: {
                            Double d2 = (Double)object;
                            codedOutputByteBufferNano.writeDoubleNoTag(d2);
                            break block20;
                        }
                        case 2: {
                            Float f2 = (Float)object;
                            codedOutputByteBufferNano.writeFloatNoTag(f2.floatValue());
                            break block20;
                        }
                        case 3: {
                            Long l2 = (Long)object;
                            codedOutputByteBufferNano.writeInt64NoTag(l2);
                            break block20;
                        }
                        case 4: {
                            Long l3 = (Long)object;
                            codedOutputByteBufferNano.writeUInt64NoTag(l3);
                            break block20;
                        }
                        case 5: {
                            Integer n2 = (Integer)object;
                            codedOutputByteBufferNano.writeInt32NoTag(n2);
                            break block20;
                        }
                        case 6: {
                            Long l4 = (Long)object;
                            codedOutputByteBufferNano.writeFixed64NoTag(l4);
                            break block20;
                        }
                        case 7: {
                            Integer n3 = (Integer)object;
                            codedOutputByteBufferNano.writeFixed32NoTag(n3);
                            break block20;
                        }
                        case 8: {
                            Boolean bl2 = (Boolean)object;
                            codedOutputByteBufferNano.writeBoolNoTag(bl2);
                            break block20;
                        }
                        case 9: {
                            String string = (String)object;
                            codedOutputByteBufferNano.writeStringNoTag(string);
                            break block20;
                        }
                        case 12: {
                            byte[] arrby = (byte[])object;
                            codedOutputByteBufferNano.writeBytesNoTag(arrby);
                            break block20;
                        }
                        case 13: {
                            Integer n4 = (Integer)object;
                            codedOutputByteBufferNano.writeUInt32NoTag(n4);
                            break block20;
                        }
                        case 14: {
                            Integer n5 = (Integer)object;
                            codedOutputByteBufferNano.writeEnumNoTag(n5);
                            break block20;
                        }
                        case 15: {
                            Integer n6 = (Integer)object;
                            codedOutputByteBufferNano.writeSFixed32NoTag(n6);
                            break block20;
                        }
                        case 16: {
                            Long l5 = (Long)object;
                            codedOutputByteBufferNano.writeSFixed64NoTag(l5);
                            break block20;
                        }
                        case 17: {
                            Integer n7 = (Integer)object;
                            codedOutputByteBufferNano.writeSInt32NoTag(n7);
                            break block20;
                        }
                        case 18: {
                            Long l6 = (Long)object;
                            codedOutputByteBufferNano.writeSInt64NoTag(l6);
                            break block20;
                        }
                    }
                    throw new IllegalArgumentException("Unknown type " + this.type);
                }
                catch (IOException var3_4) {
                    throw new IllegalStateException(var3_4);
                }
            }
        }

        @Override
        protected void writeRepeatedData(Object object, CodedOutputByteBufferNano codedOutputByteBufferNano) {
            block35 : {
                if (this.tag == this.nonPackedTag) {
                    super.writeRepeatedData(object, codedOutputByteBufferNano);
                } else {
                    if (this.tag == this.packedTag) {
                        int n2 = Array.getLength(object);
                        int n3 = this.computePackedDataSize(object);
                        try {
                            codedOutputByteBufferNano.writeRawVarint32(this.tag);
                            codedOutputByteBufferNano.writeRawVarint32(n3);
                            switch (this.type) {
                                case 8: {
                                    for (int i2 = 0; i2 < n2; ++i2) {
                                        codedOutputByteBufferNano.writeBoolNoTag(Array.getBoolean(object, i2));
                                    }
                                    break block35;
                                }
                                case 7: {
                                    for (int i3 = 0; i3 < n2; ++i3) {
                                        codedOutputByteBufferNano.writeFixed32NoTag(Array.getInt(object, i3));
                                    }
                                    break block35;
                                }
                                case 15: {
                                    for (int i4 = 0; i4 < n2; ++i4) {
                                        codedOutputByteBufferNano.writeSFixed32NoTag(Array.getInt(object, i4));
                                    }
                                    break block35;
                                }
                                case 2: {
                                    for (int i5 = 0; i5 < n2; ++i5) {
                                        codedOutputByteBufferNano.writeFloatNoTag(Array.getFloat(object, i5));
                                    }
                                    break block35;
                                }
                                case 6: {
                                    for (int i6 = 0; i6 < n2; ++i6) {
                                        codedOutputByteBufferNano.writeFixed64NoTag(Array.getLong(object, i6));
                                    }
                                    break block35;
                                }
                                case 16: {
                                    for (int i7 = 0; i7 < n2; ++i7) {
                                        codedOutputByteBufferNano.writeSFixed64NoTag(Array.getLong(object, i7));
                                    }
                                    break block35;
                                }
                                case 1: {
                                    for (int i8 = 0; i8 < n2; ++i8) {
                                        codedOutputByteBufferNano.writeDoubleNoTag(Array.getDouble(object, i8));
                                    }
                                    break block35;
                                }
                                case 5: {
                                    for (int i9 = 0; i9 < n2; ++i9) {
                                        codedOutputByteBufferNano.writeInt32NoTag(Array.getInt(object, i9));
                                    }
                                    break block35;
                                }
                                case 17: {
                                    for (int i10 = 0; i10 < n2; ++i10) {
                                        codedOutputByteBufferNano.writeSInt32NoTag(Array.getInt(object, i10));
                                    }
                                    break block35;
                                }
                                case 13: {
                                    for (int i11 = 0; i11 < n2; ++i11) {
                                        codedOutputByteBufferNano.writeUInt32NoTag(Array.getInt(object, i11));
                                    }
                                    break block35;
                                }
                                case 3: {
                                    for (int i12 = 0; i12 < n2; ++i12) {
                                        codedOutputByteBufferNano.writeInt64NoTag(Array.getLong(object, i12));
                                    }
                                    break block35;
                                }
                                case 18: {
                                    for (int i13 = 0; i13 < n2; ++i13) {
                                        codedOutputByteBufferNano.writeSInt64NoTag(Array.getLong(object, i13));
                                    }
                                    break block35;
                                }
                                case 4: {
                                    for (int i14 = 0; i14 < n2; ++i14) {
                                        codedOutputByteBufferNano.writeUInt64NoTag(Array.getLong(object, i14));
                                    }
                                    break block35;
                                }
                                case 14: {
                                    for (int i15 = 0; i15 < n2; ++i15) {
                                        codedOutputByteBufferNano.writeEnumNoTag(Array.getInt(object, i15));
                                    }
                                    break block35;
                                }
                                default: {
                                    throw new IllegalArgumentException("Unpackable type " + this.type);
                                }
                            }
                        }
                        catch (IOException var5_19) {
                            throw new IllegalStateException(var5_19);
                        }
                    }
                    throw new IllegalArgumentException("Unexpected repeated extension tag " + this.tag + ", unequal to both non-packed variant " + this.nonPackedTag + " and packed variant " + this.packedTag);
                }
            }
        }

        private int computePackedDataSize(Object object) {
            int n2 = 0;
            int n3 = Array.getLength(object);
            switch (this.type) {
                case 8: {
                    n2 = n3;
                    break;
                }
                case 2: 
                case 7: 
                case 15: {
                    n2 = n3 * 4;
                    break;
                }
                case 1: 
                case 6: 
                case 16: {
                    n2 = n3 * 8;
                    break;
                }
                case 5: {
                    for (int i2 = 0; i2 < n3; ++i2) {
                        n2 += CodedOutputByteBufferNano.computeInt32SizeNoTag(Array.getInt(object, i2));
                    }
                    break;
                }
                case 17: {
                    for (int i3 = 0; i3 < n3; ++i3) {
                        n2 += CodedOutputByteBufferNano.computeSInt32SizeNoTag(Array.getInt(object, i3));
                    }
                    break;
                }
                case 13: {
                    for (int i4 = 0; i4 < n3; ++i4) {
                        n2 += CodedOutputByteBufferNano.computeUInt32SizeNoTag(Array.getInt(object, i4));
                    }
                    break;
                }
                case 3: {
                    for (int i5 = 0; i5 < n3; ++i5) {
                        n2 += CodedOutputByteBufferNano.computeInt64SizeNoTag(Array.getLong(object, i5));
                    }
                    break;
                }
                case 18: {
                    for (int i6 = 0; i6 < n3; ++i6) {
                        n2 += CodedOutputByteBufferNano.computeSInt64SizeNoTag(Array.getLong(object, i6));
                    }
                    break;
                }
                case 4: {
                    for (int i7 = 0; i7 < n3; ++i7) {
                        n2 += CodedOutputByteBufferNano.computeUInt64SizeNoTag(Array.getLong(object, i7));
                    }
                    break;
                }
                case 14: {
                    for (int i8 = 0; i8 < n3; ++i8) {
                        n2 += CodedOutputByteBufferNano.computeEnumSizeNoTag(Array.getInt(object, i8));
                    }
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unexpected non-packable type " + this.type);
                }
            }
            return n2;
        }

        @Override
        protected int computeRepeatedSerializedSize(Object object) {
            if (this.tag == this.nonPackedTag) {
                return super.computeRepeatedSerializedSize(object);
            }
            if (this.tag == this.packedTag) {
                int n2 = this.computePackedDataSize(object);
                int n3 = n2 + CodedOutputByteBufferNano.computeRawVarint32Size(n2);
                return n3 + CodedOutputByteBufferNano.computeRawVarint32Size(this.tag);
            }
            throw new IllegalArgumentException("Unexpected repeated extension tag " + this.tag + ", unequal to both non-packed variant " + this.nonPackedTag + " and packed variant " + this.packedTag);
        }

        @Override
        protected final int computeSingularSerializedSize(Object object) {
            int n2 = WireFormatNano.getTagFieldNumber(this.tag);
            switch (this.type) {
                case 1: {
                    Double d2 = (Double)object;
                    return CodedOutputByteBufferNano.computeDoubleSize(n2, d2);
                }
                case 2: {
                    Float f2 = (Float)object;
                    return CodedOutputByteBufferNano.computeFloatSize(n2, f2.floatValue());
                }
                case 3: {
                    Long l2 = (Long)object;
                    return CodedOutputByteBufferNano.computeInt64Size(n2, l2);
                }
                case 4: {
                    Long l3 = (Long)object;
                    return CodedOutputByteBufferNano.computeUInt64Size(n2, l3);
                }
                case 5: {
                    Integer n3 = (Integer)object;
                    return CodedOutputByteBufferNano.computeInt32Size(n2, n3);
                }
                case 6: {
                    Long l4 = (Long)object;
                    return CodedOutputByteBufferNano.computeFixed64Size(n2, l4);
                }
                case 7: {
                    Integer n4 = (Integer)object;
                    return CodedOutputByteBufferNano.computeFixed32Size(n2, n4);
                }
                case 8: {
                    Boolean bl2 = (Boolean)object;
                    return CodedOutputByteBufferNano.computeBoolSize(n2, bl2);
                }
                case 9: {
                    String string = (String)object;
                    return CodedOutputByteBufferNano.computeStringSize(n2, string);
                }
                case 12: {
                    byte[] arrby = (byte[])object;
                    return CodedOutputByteBufferNano.computeBytesSize(n2, arrby);
                }
                case 13: {
                    Integer n5 = (Integer)object;
                    return CodedOutputByteBufferNano.computeUInt32Size(n2, n5);
                }
                case 14: {
                    Integer n6 = (Integer)object;
                    return CodedOutputByteBufferNano.computeEnumSize(n2, n6);
                }
                case 15: {
                    Integer n7 = (Integer)object;
                    return CodedOutputByteBufferNano.computeSFixed32Size(n2, n7);
                }
                case 16: {
                    Long l5 = (Long)object;
                    return CodedOutputByteBufferNano.computeSFixed64Size(n2, l5);
                }
                case 17: {
                    Integer n8 = (Integer)object;
                    return CodedOutputByteBufferNano.computeSInt32Size(n2, n8);
                }
                case 18: {
                    Long l6 = (Long)object;
                    return CodedOutputByteBufferNano.computeSInt64Size(n2, l6);
                }
            }
            throw new IllegalArgumentException("Unknown type " + this.type);
        }
    }

}

