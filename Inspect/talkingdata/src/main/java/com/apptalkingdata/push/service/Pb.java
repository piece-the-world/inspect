/*
 * Decompiled with CFR 0_115.
 */
package com.apptalkingdata.push.service;

import com.apptalkingdata.protobuf.CodedInputByteBufferNano;
import com.apptalkingdata.protobuf.CodedOutputByteBufferNano;
import com.apptalkingdata.protobuf.InternalNano;
import com.apptalkingdata.protobuf.MessageNano;
import com.apptalkingdata.protobuf.WireFormatNano;

public interface Pb {

    public static final class Ack
    extends MessageNano {
        private static volatile Ack[] _emptyArray;
        public String id;

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        public static Ack[] emptyArray() {
            if (_emptyArray == null) {
                Object object = InternalNano.LAZY_INIT_LOCK;
                synchronized (object) {
                    if (_emptyArray == null) {
                        _emptyArray = new Ack[0];
                    }
                }
            }
            return _emptyArray;
        }

        public Ack() {
            this.clear();
        }

        public Ack clear() {
            this.id = "";
            this.cachedSize = -1;
            return this;
        }

        @Override
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
            codedOutputByteBufferNano.writeString(1, this.id);
            super.writeTo(codedOutputByteBufferNano);
        }

        @Override
        protected int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            return n2 += CodedOutputByteBufferNano.computeStringSize(1, this.id);
        }

        @Override
        public Ack mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
            block4 : do {
                int n2 = codedInputByteBufferNano.readTag();
                switch (n2) {
                    case 0: {
                        return this;
                    }
                    default: {
                        if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n2)) continue block4;
                        return this;
                    }
                    case 10: 
                }
                this.id = codedInputByteBufferNano.readString();
            } while (true);
        }
    }

    public static final class Ping
    extends MessageNano {
        public long seq;
        public long ct;

        public Ping() {
            this.clear();
        }

        public Ping clear() {
            this.seq = 0;
            this.ct = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
            codedOutputByteBufferNano.writeInt64(1, this.seq);
            if (this.ct != 0) {
                codedOutputByteBufferNano.writeInt64(2, this.ct);
            }
            super.writeTo(codedOutputByteBufferNano);
        }

        @Override
        protected int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            n2 += CodedOutputByteBufferNano.computeInt64Size(1, this.seq);
            if (this.ct != 0) {
                n2 += CodedOutputByteBufferNano.computeInt64Size(2, this.ct);
            }
            return n2;
        }

        @Override
        public Ping mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
            block5 : do {
                int n2 = codedInputByteBufferNano.readTag();
                switch (n2) {
                    case 0: {
                        return this;
                    }
                    default: {
                        if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n2)) continue block5;
                        return this;
                    }
                    case 8: {
                        this.seq = codedInputByteBufferNano.readInt64();
                        continue block5;
                    }
                    case 16: 
                }
                this.ct = codedInputByteBufferNano.readInt64();
            } while (true);
        }

        public static Ping parseFrom(byte[] arrby) {
            return (Ping)MessageNano.mergeFrom(new Ping(), arrby);
        }
    }

    public static final class Msg
    extends MessageNano {
        public static final int UNKNOWN = 0;
        public static final int TXT = 1;
        public String id;
        public String app;
        public int tp;
        public String desc;
        public byte[] d;
        public long ct;

        public Msg() {
            this.clear();
        }

        public Msg clear() {
            this.id = "";
            this.app = "";
            this.tp = 0;
            this.desc = "";
            this.d = WireFormatNano.EMPTY_BYTES;
            this.ct = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
            codedOutputByteBufferNano.writeString(1, this.id);
            codedOutputByteBufferNano.writeString(2, this.app);
            codedOutputByteBufferNano.writeInt32(3, this.tp);
            if (!this.desc.equals("")) {
                codedOutputByteBufferNano.writeString(4, this.desc);
            }
            codedOutputByteBufferNano.writeBytes(5, this.d);
            codedOutputByteBufferNano.writeInt64(6, this.ct);
            super.writeTo(codedOutputByteBufferNano);
        }

        @Override
        protected int computeSerializedSize() {
            int n2 = super.computeSerializedSize();
            n2 += CodedOutputByteBufferNano.computeStringSize(1, this.id);
            n2 += CodedOutputByteBufferNano.computeStringSize(2, this.app);
            n2 += CodedOutputByteBufferNano.computeInt32Size(3, this.tp);
            if (!this.desc.equals("")) {
                n2 += CodedOutputByteBufferNano.computeStringSize(4, this.desc);
            }
            n2 += CodedOutputByteBufferNano.computeBytesSize(5, this.d);
            return n2 += CodedOutputByteBufferNano.computeInt64Size(6, this.ct);
        }

        @Override
        public Msg mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
            block12 : do {
                int n2 = codedInputByteBufferNano.readTag();
                switch (n2) {
                    case 0: {
                        return this;
                    }
                    default: {
                        if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, n2)) continue block12;
                        return this;
                    }
                    case 10: {
                        this.id = codedInputByteBufferNano.readString();
                        continue block12;
                    }
                    case 18: {
                        this.app = codedInputByteBufferNano.readString();
                        continue block12;
                    }
                    case 24: {
                        int n3 = codedInputByteBufferNano.readInt32();
                        switch (n3) {
                            case 0: 
                            case 1: {
                                this.tp = n3;
                            }
                        }
                        continue block12;
                    }
                    case 34: {
                        this.desc = codedInputByteBufferNano.readString();
                        continue block12;
                    }
                    case 42: {
                        this.d = codedInputByteBufferNano.readBytes();
                        continue block12;
                    }
                    case 48: 
                }
                this.ct = codedInputByteBufferNano.readInt64();
            } while (true);
        }

        public static Msg parseFrom(byte[] arrby) {
            return (Msg)MessageNano.mergeFrom(new Msg(), arrby);
        }
    }

}

