/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

public final class aU {
    private aU() {
    }

    public static void a(boolean bl2) {
        if (!bl2) {
            throw new IllegalArgumentException();
        }
    }

    public static void a(boolean bl2, Object object) {
        if (!bl2) {
            throw new IllegalArgumentException(String.valueOf(object));
        }
    }

    public static /* varargs */ void a(boolean bl2, String string, Object ... arrobject) {
        if (!bl2) {
            throw new IllegalArgumentException(aU.a(string, arrobject));
        }
    }

    public static void a(boolean bl2, String string, char c2) {
        if (!bl2) {
            throw new IllegalArgumentException(aU.a(string, new Object[]{Character.valueOf(c2)}));
        }
    }

    public static void a(boolean bl2, String string, int n2) {
        if (!bl2) {
            throw new IllegalArgumentException(aU.a(string, new Object[]{n2}));
        }
    }

    public static void a(boolean bl2, String string, long l2) {
        if (!bl2) {
            throw new IllegalArgumentException(aU.a(string, new Object[]{l2}));
        }
    }

    public static void a(boolean bl2, String string, Object object) {
        if (!bl2) {
            throw new IllegalArgumentException(aU.a(string, new Object[]{object}));
        }
    }

    public static void a(boolean bl2, String string, char c2, char c3) {
        if (!bl2) {
            throw new IllegalArgumentException(aU.a(string, Character.valueOf(c2), Character.valueOf(c3)));
        }
    }

    public static void a(boolean bl2, String string, char c2, int n2) {
        if (!bl2) {
            throw new IllegalArgumentException(aU.a(string, Character.valueOf(c2), n2));
        }
    }

    public static void a(boolean bl2, String string, char c2, long l2) {
        if (!bl2) {
            throw new IllegalArgumentException(aU.a(string, Character.valueOf(c2), l2));
        }
    }

    public static void a(boolean bl2, String string, char c2, Object object) {
        if (!bl2) {
            throw new IllegalArgumentException(aU.a(string, Character.valueOf(c2), object));
        }
    }

    public static void a(boolean bl2, String string, int n2, char c2) {
        if (!bl2) {
            throw new IllegalArgumentException(aU.a(string, n2, Character.valueOf(c2)));
        }
    }

    public static void a(boolean bl2, String string, int n2, int n3) {
        if (!bl2) {
            throw new IllegalArgumentException(aU.a(string, n2, n3));
        }
    }

    public static void a(boolean bl2, String string, int n2, long l2) {
        if (!bl2) {
            throw new IllegalArgumentException(aU.a(string, n2, l2));
        }
    }

    public static void a(boolean bl2, String string, int n2, Object object) {
        if (!bl2) {
            throw new IllegalArgumentException(aU.a(string, n2, object));
        }
    }

    public static void a(boolean bl2, String string, long l2, char c2) {
        if (!bl2) {
            throw new IllegalArgumentException(aU.a(string, l2, Character.valueOf(c2)));
        }
    }

    public static void a(boolean bl2, String string, long l2, int n2) {
        if (!bl2) {
            throw new IllegalArgumentException(aU.a(string, l2, n2));
        }
    }

    public static void a(boolean bl2, String string, long l2, long l3) {
        if (!bl2) {
            throw new IllegalArgumentException(aU.a(string, l2, l3));
        }
    }

    public static void a(boolean bl2, String string, long l2, Object object) {
        if (!bl2) {
            throw new IllegalArgumentException(aU.a(string, l2, object));
        }
    }

    public static void a(boolean bl2, String string, Object object, char c2) {
        if (!bl2) {
            throw new IllegalArgumentException(aU.a(string, object, Character.valueOf(c2)));
        }
    }

    public static void a(boolean bl2, String string, Object object, int n2) {
        if (!bl2) {
            throw new IllegalArgumentException(aU.a(string, object, n2));
        }
    }

    public static void a(boolean bl2, String string, Object object, long l2) {
        if (!bl2) {
            throw new IllegalArgumentException(aU.a(string, object, l2));
        }
    }

    public static void a(boolean bl2, String string, Object object, Object object2) {
        if (!bl2) {
            throw new IllegalArgumentException(aU.a(string, object, object2));
        }
    }

    public static void a(boolean bl2, String string, Object object, Object object2, Object object3) {
        if (!bl2) {
            throw new IllegalArgumentException(aU.a(string, object, object2, object3));
        }
    }

    public static void a(boolean bl2, String string, Object object, Object object2, Object object3, Object object4) {
        if (!bl2) {
            throw new IllegalArgumentException(aU.a(string, object, object2, object3, object4));
        }
    }

    public static void b(boolean bl2) {
        if (!bl2) {
            throw new IllegalStateException();
        }
    }

    public static void b(boolean bl2, Object object) {
        if (!bl2) {
            throw new IllegalStateException(String.valueOf(object));
        }
    }

    public static /* varargs */ void b(boolean bl2, String string, Object ... arrobject) {
        if (!bl2) {
            throw new IllegalStateException(aU.a(string, arrobject));
        }
    }

    public static void b(boolean bl2, String string, char c2) {
        if (!bl2) {
            throw new IllegalStateException(aU.a(string, new Object[]{Character.valueOf(c2)}));
        }
    }

    public static void b(boolean bl2, String string, int n2) {
        if (!bl2) {
            throw new IllegalStateException(aU.a(string, new Object[]{n2}));
        }
    }

    public static void b(boolean bl2, String string, long l2) {
        if (!bl2) {
            throw new IllegalStateException(aU.a(string, new Object[]{l2}));
        }
    }

    public static void b(boolean bl2, String string, Object object) {
        if (!bl2) {
            throw new IllegalStateException(aU.a(string, new Object[]{object}));
        }
    }

    public static void b(boolean bl2, String string, char c2, char c3) {
        if (!bl2) {
            throw new IllegalStateException(aU.a(string, Character.valueOf(c2), Character.valueOf(c3)));
        }
    }

    public static void b(boolean bl2, String string, char c2, int n2) {
        if (!bl2) {
            throw new IllegalStateException(aU.a(string, Character.valueOf(c2), n2));
        }
    }

    public static void b(boolean bl2, String string, char c2, long l2) {
        if (!bl2) {
            throw new IllegalStateException(aU.a(string, Character.valueOf(c2), l2));
        }
    }

    public static void b(boolean bl2, String string, char c2, Object object) {
        if (!bl2) {
            throw new IllegalStateException(aU.a(string, Character.valueOf(c2), object));
        }
    }

    public static void b(boolean bl2, String string, int n2, char c2) {
        if (!bl2) {
            throw new IllegalStateException(aU.a(string, n2, Character.valueOf(c2)));
        }
    }

    public static void b(boolean bl2, String string, int n2, int n3) {
        if (!bl2) {
            throw new IllegalStateException(aU.a(string, n2, n3));
        }
    }

    public static void b(boolean bl2, String string, int n2, long l2) {
        if (!bl2) {
            throw new IllegalStateException(aU.a(string, n2, l2));
        }
    }

    public static void b(boolean bl2, String string, int n2, Object object) {
        if (!bl2) {
            throw new IllegalStateException(aU.a(string, n2, object));
        }
    }

    public static void b(boolean bl2, String string, long l2, char c2) {
        if (!bl2) {
            throw new IllegalStateException(aU.a(string, l2, Character.valueOf(c2)));
        }
    }

    public static void b(boolean bl2, String string, long l2, int n2) {
        if (!bl2) {
            throw new IllegalStateException(aU.a(string, l2, n2));
        }
    }

    public static void b(boolean bl2, String string, long l2, long l3) {
        if (!bl2) {
            throw new IllegalStateException(aU.a(string, l2, l3));
        }
    }

    public static void b(boolean bl2, String string, long l2, Object object) {
        if (!bl2) {
            throw new IllegalStateException(aU.a(string, l2, object));
        }
    }

    public static void b(boolean bl2, String string, Object object, char c2) {
        if (!bl2) {
            throw new IllegalStateException(aU.a(string, object, Character.valueOf(c2)));
        }
    }

    public static void b(boolean bl2, String string, Object object, int n2) {
        if (!bl2) {
            throw new IllegalStateException(aU.a(string, object, n2));
        }
    }

    public static void b(boolean bl2, String string, Object object, long l2) {
        if (!bl2) {
            throw new IllegalStateException(aU.a(string, object, l2));
        }
    }

    public static void b(boolean bl2, String string, Object object, Object object2) {
        if (!bl2) {
            throw new IllegalStateException(aU.a(string, object, object2));
        }
    }

    public static void b(boolean bl2, String string, Object object, Object object2, Object object3) {
        if (!bl2) {
            throw new IllegalStateException(aU.a(string, object, object2, object3));
        }
    }

    public static void b(boolean bl2, String string, Object object, Object object2, Object object3, Object object4) {
        if (!bl2) {
            throw new IllegalStateException(aU.a(string, object, object2, object3, object4));
        }
    }

    public static <T> T a(T t2) {
        if (t2 == null) {
            throw new NullPointerException();
        }
        return t2;
    }

    public static <T> T a(T t2, Object object) {
        if (t2 == null) {
            throw new NullPointerException(String.valueOf(object));
        }
        return t2;
    }

    public static /* varargs */ <T> T a(T t2, String string, Object ... arrobject) {
        if (t2 == null) {
            throw new NullPointerException(aU.a(string, arrobject));
        }
        return t2;
    }

    public static <T> T a(T t2, String string, char c2) {
        if (t2 == null) {
            throw new NullPointerException(aU.a(string, new Object[]{Character.valueOf(c2)}));
        }
        return t2;
    }

    public static <T> T a(T t2, String string, int n2) {
        if (t2 == null) {
            throw new NullPointerException(aU.a(string, new Object[]{n2}));
        }
        return t2;
    }

    public static <T> T a(T t2, String string, long l2) {
        if (t2 == null) {
            throw new NullPointerException(aU.a(string, new Object[]{l2}));
        }
        return t2;
    }

    public static <T> T a(T t2, String string, Object object) {
        if (t2 == null) {
            throw new NullPointerException(aU.a(string, new Object[]{object}));
        }
        return t2;
    }

    public static <T> T a(T t2, String string, char c2, char c3) {
        if (t2 == null) {
            throw new NullPointerException(aU.a(string, Character.valueOf(c2), Character.valueOf(c3)));
        }
        return t2;
    }

    public static <T> T a(T t2, String string, char c2, int n2) {
        if (t2 == null) {
            throw new NullPointerException(aU.a(string, Character.valueOf(c2), n2));
        }
        return t2;
    }

    public static <T> T a(T t2, String string, char c2, long l2) {
        if (t2 == null) {
            throw new NullPointerException(aU.a(string, Character.valueOf(c2), l2));
        }
        return t2;
    }

    public static <T> T a(T t2, String string, char c2, Object object) {
        if (t2 == null) {
            throw new NullPointerException(aU.a(string, Character.valueOf(c2), object));
        }
        return t2;
    }

    public static <T> T a(T t2, String string, int n2, char c2) {
        if (t2 == null) {
            throw new NullPointerException(aU.a(string, n2, Character.valueOf(c2)));
        }
        return t2;
    }

    public static <T> T a(T t2, String string, int n2, int n3) {
        if (t2 == null) {
            throw new NullPointerException(aU.a(string, n2, n3));
        }
        return t2;
    }

    public static <T> T a(T t2, String string, int n2, long l2) {
        if (t2 == null) {
            throw new NullPointerException(aU.a(string, n2, l2));
        }
        return t2;
    }

    public static <T> T a(T t2, String string, int n2, Object object) {
        if (t2 == null) {
            throw new NullPointerException(aU.a(string, n2, object));
        }
        return t2;
    }

    public static <T> T a(T t2, String string, long l2, char c2) {
        if (t2 == null) {
            throw new NullPointerException(aU.a(string, l2, Character.valueOf(c2)));
        }
        return t2;
    }

    public static <T> T a(T t2, String string, long l2, int n2) {
        if (t2 == null) {
            throw new NullPointerException(aU.a(string, l2, n2));
        }
        return t2;
    }

    public static <T> T a(T t2, String string, long l2, long l3) {
        if (t2 == null) {
            throw new NullPointerException(aU.a(string, l2, l3));
        }
        return t2;
    }

    public static <T> T a(T t2, String string, long l2, Object object) {
        if (t2 == null) {
            throw new NullPointerException(aU.a(string, l2, object));
        }
        return t2;
    }

    public static <T> T a(T t2, String string, Object object, char c2) {
        if (t2 == null) {
            throw new NullPointerException(aU.a(string, object, Character.valueOf(c2)));
        }
        return t2;
    }

    public static <T> T a(T t2, String string, Object object, int n2) {
        if (t2 == null) {
            throw new NullPointerException(aU.a(string, object, n2));
        }
        return t2;
    }

    public static <T> T a(T t2, String string, Object object, long l2) {
        if (t2 == null) {
            throw new NullPointerException(aU.a(string, object, l2));
        }
        return t2;
    }

    public static <T> T a(T t2, String string, Object object, Object object2) {
        if (t2 == null) {
            throw new NullPointerException(aU.a(string, object, object2));
        }
        return t2;
    }

    public static <T> T a(T t2, String string, Object object, Object object2, Object object3) {
        if (t2 == null) {
            throw new NullPointerException(aU.a(string, object, object2, object3));
        }
        return t2;
    }

    public static <T> T a(T t2, String string, Object object, Object object2, Object object3, Object object4) {
        if (t2 == null) {
            throw new NullPointerException(aU.a(string, object, object2, object3, object4));
        }
        return t2;
    }

    public static int a(int n2, int n3) {
        return aU.a(n2, n3, "index");
    }

    public static int a(int n2, int n3, String string) {
        if (n2 < 0 || n2 >= n3) {
            throw new IndexOutOfBoundsException(aU.c(n2, n3, string));
        }
        return n2;
    }

    private static String c(int n2, int n3, String string) {
        if (n2 < 0) {
            return aU.a("%s (%s) must not be negative", new Object[]{string, n2});
        }
        if (n3 < 0) {
            throw new IllegalArgumentException("negative size: " + n3);
        }
        return aU.a("%s (%s) must be less than size (%s)", new Object[]{string, n2, n3});
    }

    public static int b(int n2, int n3) {
        return aU.b(n2, n3, "index");
    }

    public static int b(int n2, int n3, String string) {
        if (n2 < 0 || n2 > n3) {
            throw new IndexOutOfBoundsException(aU.d(n2, n3, string));
        }
        return n2;
    }

    private static String d(int n2, int n3, String string) {
        if (n2 < 0) {
            return aU.a("%s (%s) must not be negative", new Object[]{string, n2});
        }
        if (n3 < 0) {
            throw new IllegalArgumentException("negative size: " + n3);
        }
        return aU.a("%s (%s) must not be greater than size (%s)", new Object[]{string, n2, n3});
    }

    public static void a(int n2, int n3, int n4) {
        if (n2 < 0 || n3 < n2 || n3 > n4) {
            throw new IndexOutOfBoundsException(aU.b(n2, n3, n4));
        }
    }

    private static String b(int n2, int n3, int n4) {
        if (n2 < 0 || n2 > n4) {
            return aU.d(n2, n4, "start index");
        }
        if (n3 < 0 || n3 > n4) {
            return aU.d(n3, n4, "end index");
        }
        return aU.a("end index (%s) must not be less than start index (%s)", n3, n2);
    }

    static /* varargs */ String a(String string, Object ... arrobject) {
        int n2;
        string = String.valueOf(string);
        StringBuilder stringBuilder = new StringBuilder(string.length() + 16 * arrobject.length);
        int n3 = 0;
        int n4 = 0;
        while (n4 < arrobject.length && (n2 = string.indexOf("%s", n3)) != -1) {
            stringBuilder.append(string, n3, n2);
            stringBuilder.append(arrobject[n4++]);
            n3 = n2 + 2;
        }
        stringBuilder.append(string, n3, string.length());
        if (n4 < arrobject.length) {
            stringBuilder.append(" [");
            stringBuilder.append(arrobject[n4++]);
            while (n4 < arrobject.length) {
                stringBuilder.append(", ");
                stringBuilder.append(arrobject[n4++]);
            }
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }
}

