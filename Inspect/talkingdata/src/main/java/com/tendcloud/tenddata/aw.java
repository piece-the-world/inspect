/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.r;
import java.io.UnsupportedEncodingException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

public class aw {
    public static CodingErrorAction a = CodingErrorAction.REPORT;

    public static byte[] a(String string) {
        try {
            return string.getBytes("UTF8");
        }
        catch (UnsupportedEncodingException var1_1) {
            throw new RuntimeException(var1_1);
        }
    }

    public static byte[] b(String string) {
        try {
            return string.getBytes("ASCII");
        }
        catch (UnsupportedEncodingException var1_1) {
            throw new RuntimeException(var1_1);
        }
    }

    public static String a(byte[] arrby) {
        return aw.a(arrby, 0, arrby.length);
    }

    public static String a(byte[] arrby, int n2, int n3) {
        try {
            return new String(arrby, n2, n3, "ASCII");
        }
        catch (UnsupportedEncodingException var3_3) {
            throw new RuntimeException(var3_3);
        }
    }

    public static String b(byte[] arrby) {
        return aw.a(ByteBuffer.wrap(arrby));
    }

    public static String a(ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = Charset.forName("UTF8").newDecoder();
        charsetDecoder.onMalformedInput(a);
        charsetDecoder.onUnmappableCharacter(a);
        try {
            byteBuffer.mark();
            string = charsetDecoder.decode(byteBuffer).toString();
            byteBuffer.reset();
        }
        catch (CharacterCodingException var3_3) {
            throw new r(1007, var3_3);
        }
        return string;
    }

    public static void main(String[] arrstring) {
        aw.b(aw.a("\u0000"));
        aw.a(aw.b("\u0000"));
    }
}

