/*
 * Decompiled with CFR 0_115.
 */
package com.apptalkingdata.protobuf;

import com.apptalkingdata.protobuf.MessageNano;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class MessageNanoPrinter {
    private static final String INDENT = " ";
    private static final int MAX_STRING_LEN = 200;

    private MessageNanoPrinter() {
    }

    public static String print(MessageNano messageNano) {
        if (messageNano == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            MessageNanoPrinter.print(null, messageNano, new StringBuffer(), stringBuffer);
        }
        catch (IllegalAccessException var2_2) {
            return "Error printing proto: " + var2_2.getMessage();
        }
        catch (InvocationTargetException var2_3) {
            return "Error printing proto: " + var2_3.getMessage();
        }
        return stringBuffer.toString();
    }

    private static void print(String string, Object object, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        if (object != null) {
            if (object instanceof MessageNano) {
                Object object2;
                String string2;
                Class class_;
                int n2 = stringBuffer.length();
                if (string != null) {
                    stringBuffer2.append(stringBuffer).append(MessageNanoPrinter.deCamelCaseify(string)).append(" <\n");
                    stringBuffer.append(" ");
                }
                Class class_2 = object.getClass();
                for (Field field2 : class_2.getFields()) {
                    int n3 = field2.getModifiers();
                    string2 = field2.getName();
                    if ("cachedSize".equals(string2) || (n3 & 1) != 1 || (n3 & 8) == 8 || string2.startsWith("_") || string2.endsWith("_")) continue;
                    class_ = field2.getType();
                    object2 = field2.get(object);
                    if (class_.isArray()) {
                        Class class_3 = class_.getComponentType();
                        if (class_3 == Byte.TYPE) {
                            MessageNanoPrinter.print(string2, object2, stringBuffer, stringBuffer2);
                            continue;
                        }
                        int n4 = object2 == null ? 0 : Array.getLength(object2);
                        for (int i2 = 0; i2 < n4; ++i2) {
                            Object object3 = Array.get(object2, i2);
                            MessageNanoPrinter.print(string2, object3, stringBuffer, stringBuffer2);
                        }
                        continue;
                    }
                    MessageNanoPrinter.print(string2, object2, stringBuffer, stringBuffer2);
                }
                for (Field field : class_2.getMethods()) {
                    String string3 = field.getName();
                    if (!string3.startsWith("set")) continue;
                    string2 = string3.substring(3);
                    class_ = null;
                    try {
                        class_ = class_2.getMethod("has" + string2, new Class[0]);
                    }
                    catch (NoSuchMethodException var13_18) {
                        continue;
                    }
                    if (!((Boolean)class_.invoke(object, new Object[0])).booleanValue()) continue;
                    object2 = null;
                    try {
                        object2 = class_2.getMethod("get" + string2, new Class[0]);
                    }
                    catch (NoSuchMethodException var14_20) {
                        continue;
                    }
                    MessageNanoPrinter.print(string2, object2.invoke(object, new Object[0]), stringBuffer, stringBuffer2);
                }
                if (string != null) {
                    stringBuffer.setLength(n2);
                    stringBuffer2.append(stringBuffer).append(">\n");
                }
            } else {
                string = MessageNanoPrinter.deCamelCaseify(string);
                stringBuffer2.append(stringBuffer).append(string).append(": ");
                if (object instanceof String) {
                    String string4 = MessageNanoPrinter.sanitizeString((String)object);
                    stringBuffer2.append("\"").append(string4).append("\"");
                } else if (object instanceof byte[]) {
                    MessageNanoPrinter.appendQuotedBytes((byte[])object, stringBuffer2);
                } else {
                    stringBuffer2.append(object);
                }
                stringBuffer2.append("\n");
            }
        }
    }

    private static String deCamelCaseify(String string) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (i2 == 0) {
                stringBuffer.append(Character.toLowerCase(c2));
                continue;
            }
            if (Character.isUpperCase(c2)) {
                stringBuffer.append('_').append(Character.toLowerCase(c2));
                continue;
            }
            stringBuffer.append(c2);
        }
        return stringBuffer.toString();
    }

    private static String sanitizeString(String string) {
        if (!string.startsWith("http") && string.length() > 200) {
            string = string.substring(0, 200) + "[...]";
        }
        return MessageNanoPrinter.escapeString(string);
    }

    private static String escapeString(String string) {
        int n2 = string.length();
        StringBuilder stringBuilder = new StringBuilder(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = string.charAt(i2);
            if (c2 >= ' ' && c2 <= '~' && c2 != '\"' && c2 != '\'') {
                stringBuilder.append(c2);
                continue;
            }
            stringBuilder.append(String.format("\\u%04x", c2));
        }
        return stringBuilder.toString();
    }

    private static void appendQuotedBytes(byte[] arrby, StringBuffer stringBuffer) {
        if (arrby == null) {
            stringBuffer.append("\"\"");
            return;
        }
        stringBuffer.append('\"');
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            int n2 = arrby[i2] & 255;
            if (n2 == 92 || n2 == 34) {
                stringBuffer.append('\\').append((char)n2);
                continue;
            }
            if (n2 >= 32 && n2 < 127) {
                stringBuffer.append((char)n2);
                continue;
            }
            stringBuffer.append(String.format("\\%03o", n2));
        }
        stringBuffer.append('\"');
    }
}

