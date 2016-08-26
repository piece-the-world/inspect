/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.b.b;

import com.growingio.e.b.b.e;
import com.growingio.e.b.b.n;
import java.util.HashMap;
import java.util.Map;

public final class g {
    static final char a = '{';
    static final char b = '}';
    static final String c = "{}";
    private static final char d = '\\';

    public static final e a(String string, Object object) {
        return g.a(string, new Object[]{object});
    }

    public static final e a(String string, Object object, Object object2) {
        return g.a(string, new Object[]{object, object2});
    }

    static final Throwable a(Object[] arrobject) {
        if (arrobject == null || arrobject.length == 0) {
            return null;
        }
        Object object = arrobject[arrobject.length - 1];
        if (object instanceof Throwable) {
            return (Throwable)object;
        }
        return null;
    }

    public static final e a(String string, Object[] arrobject) {
        Throwable throwable = g.a(arrobject);
        Object[] arrobject2 = arrobject;
        if (throwable != null) {
            arrobject2 = g.b(arrobject);
        }
        return g.a(string, arrobject2, throwable);
    }

    private static Object[] b(Object[] arrobject) {
        if (arrobject == null || arrobject.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int n2 = arrobject.length - 1;
        Object[] arrobject2 = new Object[n2];
        System.arraycopy(arrobject, 0, arrobject2, 0, n2);
        return arrobject2;
    }

    public static final e a(String string, Object[] arrobject, Throwable throwable) {
        if (string == null) {
            return new e(null, arrobject, throwable);
        }
        if (arrobject == null) {
            return new e(string);
        }
        int n2 = 0;
        StringBuilder stringBuilder = new StringBuilder(string.length() + 50);
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            int n3 = string.indexOf("{}", n2);
            if (n3 == -1) {
                if (n2 == 0) {
                    return new e(string, arrobject, throwable);
                }
                stringBuilder.append(string, n2, string.length());
                return new e(stringBuilder.toString(), arrobject, throwable);
            }
            if (g.a(string, n3)) {
                if (!g.b(string, n3)) {
                    --i2;
                    stringBuilder.append(string, n2, n3 - 1);
                    stringBuilder.append('{');
                    n2 = n3 + 1;
                    continue;
                }
                stringBuilder.append(string, n2, n3 - 1);
                g.a(stringBuilder, arrobject[i2], new HashMap<Object[], Object>());
                n2 = n3 + 2;
                continue;
            }
            stringBuilder.append(string, n2, n3);
            g.a(stringBuilder, arrobject[i2], new HashMap<Object[], Object>());
            n2 = n3 + 2;
        }
        stringBuilder.append(string, n2, string.length());
        return new e(stringBuilder.toString(), arrobject, throwable);
    }

    static final boolean a(String string, int n2) {
        if (n2 == 0) {
            return false;
        }
        char c2 = string.charAt(n2 - 1);
        if (c2 == '\\') {
            return true;
        }
        return false;
    }

    static final boolean b(String string, int n2) {
        if (n2 >= 2 && string.charAt(n2 - 2) == '\\') {
            return true;
        }
        return false;
    }

    private static void a(StringBuilder stringBuilder, Object object, Map<Object[], Object> map) {
        if (object == null) {
            stringBuilder.append("null");
            return;
        }
        if (!object.getClass().isArray()) {
            g.a(stringBuilder, object);
        } else if (object instanceof boolean[]) {
            g.a(stringBuilder, (boolean[])object);
        } else if (object instanceof byte[]) {
            g.a(stringBuilder, (byte[])object);
        } else if (object instanceof char[]) {
            g.a(stringBuilder, (char[])object);
        } else if (object instanceof short[]) {
            g.a(stringBuilder, (short[])object);
        } else if (object instanceof int[]) {
            g.a(stringBuilder, (int[])object);
        } else if (object instanceof long[]) {
            g.a(stringBuilder, (long[])object);
        } else if (object instanceof float[]) {
            g.a(stringBuilder, (float[])object);
        } else if (object instanceof double[]) {
            g.a(stringBuilder, (double[])object);
        } else {
            g.a(stringBuilder, (Object[])object, map);
        }
    }

    private static void a(StringBuilder stringBuilder, Object object) {
        try {
            String string = object.toString();
            stringBuilder.append(string);
        }
        catch (Throwable var2_3) {
            n.a("SLF4J: Failed toString() invocation on an object of type [" + object.getClass().getName() + "]", var2_3);
            stringBuilder.append("[FAILED toString()]");
        }
    }

    private static void a(StringBuilder stringBuilder, Object[] arrobject, Map<Object[], Object> map) {
        stringBuilder.append('[');
        if (!map.containsKey(arrobject)) {
            map.put(arrobject, null);
            int n2 = arrobject.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                g.a(stringBuilder, arrobject[i2], map);
                if (i2 == n2 - 1) continue;
                stringBuilder.append(", ");
            }
            map.remove(arrobject);
        } else {
            stringBuilder.append("...");
        }
        stringBuilder.append(']');
    }

    private static void a(StringBuilder stringBuilder, boolean[] arrbl) {
        stringBuilder.append('[');
        int n2 = arrbl.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(arrbl[i2]);
            if (i2 == n2 - 1) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(']');
    }

    private static void a(StringBuilder stringBuilder, byte[] arrby) {
        stringBuilder.append('[');
        int n2 = arrby.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(arrby[i2]);
            if (i2 == n2 - 1) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(']');
    }

    private static void a(StringBuilder stringBuilder, char[] arrc) {
        stringBuilder.append('[');
        int n2 = arrc.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(arrc[i2]);
            if (i2 == n2 - 1) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(']');
    }

    private static void a(StringBuilder stringBuilder, short[] arrs) {
        stringBuilder.append('[');
        int n2 = arrs.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(arrs[i2]);
            if (i2 == n2 - 1) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(']');
    }

    private static void a(StringBuilder stringBuilder, int[] arrn) {
        stringBuilder.append('[');
        int n2 = arrn.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(arrn[i2]);
            if (i2 == n2 - 1) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(']');
    }

    private static void a(StringBuilder stringBuilder, long[] arrl) {
        stringBuilder.append('[');
        int n2 = arrl.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(arrl[i2]);
            if (i2 == n2 - 1) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(']');
    }

    private static void a(StringBuilder stringBuilder, float[] arrf) {
        stringBuilder.append('[');
        int n2 = arrf.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(arrf[i2]);
            if (i2 == n2 - 1) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(']');
    }

    private static void a(StringBuilder stringBuilder, double[] arrd) {
        stringBuilder.append('[');
        int n2 = arrd.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(arrd[i2]);
            if (i2 == n2 - 1) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(']');
    }
}

