package com.netease.caipiao.dcsdk.utils;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class FieldUtils {
    private static Map<String, Field> sFieldCache;

    static {
        sFieldCache = new HashMap();
    }

    private static String getKey(Class<?> cls, String fieldName) {
        StringBuilder sb = new StringBuilder();
        sb.append(cls.toString()).append("#").append(fieldName);
        return sb.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Field getField(java.lang.Class<?> r12, java.lang.String r13, boolean r14) {
        /*
        if (r12 == 0) goto L_0x0039;
    L_0x0002:
        r7 = 1;
    L_0x0003:
        r8 = "The class must not be null";
        r9 = 0;
        r9 = new java.lang.Object[r9];
        com.netease.caipiao.dcsdk.utils.Validate.isTrue(r7, r8, r9);
        r7 = android.text.TextUtils.isEmpty(r13);
        if (r7 != 0) goto L_0x003b;
    L_0x0011:
        r7 = 1;
    L_0x0012:
        r8 = "The field name must not be blank/empty";
        r9 = 0;
        r9 = new java.lang.Object[r9];
        com.netease.caipiao.dcsdk.utils.Validate.isTrue(r7, r8, r9);
        r4 = getKey(r12, r13);
        r8 = sFieldCache;
        monitor-enter(r8);
        r7 = sFieldCache;	 Catch:{ all -> 0x003d }
        r1 = r7.get(r4);	 Catch:{ all -> 0x003d }
        r1 = (java.lang.reflect.Field) r1;	 Catch:{ all -> 0x003d }
        monitor-exit(r8);	 Catch:{ all -> 0x003d }
        if (r1 == 0) goto L_0x0040;
    L_0x002c:
        if (r14 == 0) goto L_0x0038;
    L_0x002e:
        r7 = r1.isAccessible();
        if (r7 != 0) goto L_0x0038;
    L_0x0034:
        r7 = 1;
        r1.setAccessible(r7);
    L_0x0038:
        return r1;
    L_0x0039:
        r7 = 0;
        goto L_0x0003;
    L_0x003b:
        r7 = 0;
        goto L_0x0012;
    L_0x003d:
        r7 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x003d }
        throw r7;
    L_0x0040:
        r0 = r12;
    L_0x0041:
        if (r0 == 0) goto L_0x006b;
    L_0x0043:
        r3 = r0.getDeclaredField(r13);	 Catch:{ NoSuchFieldException -> 0x0065 }
        r7 = r3.getModifiers();	 Catch:{ NoSuchFieldException -> 0x0065 }
        r7 = java.lang.reflect.Modifier.isPublic(r7);	 Catch:{ NoSuchFieldException -> 0x0065 }
        if (r7 != 0) goto L_0x0057;
    L_0x0051:
        if (r14 == 0) goto L_0x0066;
    L_0x0053:
        r7 = 1;
        r3.setAccessible(r7);	 Catch:{ NoSuchFieldException -> 0x0065 }
    L_0x0057:
        r8 = sFieldCache;	 Catch:{ NoSuchFieldException -> 0x0065 }
        monitor-enter(r8);	 Catch:{ NoSuchFieldException -> 0x0065 }
        r7 = sFieldCache;	 Catch:{ all -> 0x0062 }
        r7.put(r4, r3);	 Catch:{ all -> 0x0062 }
        monitor-exit(r8);	 Catch:{ all -> 0x0062 }
        r1 = r3;
        goto L_0x0038;
    L_0x0062:
        r7 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x0062 }
        throw r7;	 Catch:{ NoSuchFieldException -> 0x0065 }
    L_0x0065:
        r7 = move-exception;
    L_0x0066:
        r0 = r0.getSuperclass();
        goto L_0x0041;
    L_0x006b:
        r5 = 0;
        r7 = com.netease.caipiao.dcsdk.utils.Utils.getAllInterfaces(r12);
        r8 = r7.iterator();
    L_0x0074:
        r7 = r8.hasNext();
        if (r7 == 0) goto L_0x0099;
    L_0x007a:
        r2 = r8.next();
        r2 = (java.lang.Class) r2;
        r6 = r2.getField(r13);	 Catch:{ NoSuchFieldException -> 0x00a7 }
        if (r5 != 0) goto L_0x0097;
    L_0x0086:
        r7 = 1;
    L_0x0087:
        r9 = "Reference to field %s is ambiguous relative to %s; a matching field exists on two or more implemented interfaces.";
        r10 = 2;
        r10 = new java.lang.Object[r10];	 Catch:{ NoSuchFieldException -> 0x00a7 }
        r11 = 0;
        r10[r11] = r13;	 Catch:{ NoSuchFieldException -> 0x00a7 }
        r11 = 1;
        r10[r11] = r12;	 Catch:{ NoSuchFieldException -> 0x00a7 }
        com.netease.caipiao.dcsdk.utils.Validate.isTrue(r7, r9, r10);	 Catch:{ NoSuchFieldException -> 0x00a7 }
        r5 = r6;
        goto L_0x0074;
    L_0x0097:
        r7 = 0;
        goto L_0x0087;
    L_0x0099:
        r8 = sFieldCache;
        monitor-enter(r8);
        r7 = sFieldCache;	 Catch:{ all -> 0x00a4 }
        r7.put(r4, r5);	 Catch:{ all -> 0x00a4 }
        monitor-exit(r8);	 Catch:{ all -> 0x00a4 }
        r1 = r5;
        goto L_0x0038;
    L_0x00a4:
        r7 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x00a4 }
        throw r7;
    L_0x00a7:
        r7 = move-exception;
        goto L_0x0074;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netease.caipiao.dcsdk.utils.FieldUtils.getField(java.lang.Class, java.lang.String, boolean):java.lang.reflect.Field");
    }

    public static Object readField(Field field, Object target, boolean forceAccess) throws IllegalAccessException {
        Validate.isTrue(field != null, "The field must not be null", new Object[0]);
        if (!forceAccess || field.isAccessible()) {
            MemberUtils.setAccessibleWorkaround(field);
        } else {
            field.setAccessible(true);
        }
        return field.get(target);
    }

    public static void writeField(Field field, Object target, Object value, boolean forceAccess) throws IllegalAccessException {
        Validate.isTrue(field != null, "The field must not be null", new Object[0]);
        if (!forceAccess || field.isAccessible()) {
            MemberUtils.setAccessibleWorkaround(field);
        } else {
            field.setAccessible(true);
        }
        field.set(target, value);
    }

    public static Object readField(Field field, Object target) throws IllegalAccessException {
        return readField(field, target, true);
    }

    public static Field getField(Class<?> cls, String fieldName) {
        return getField(cls, fieldName, true);
    }

    public static Object readField(Object target, String fieldName) throws IllegalAccessException {
        boolean z;
        if (target != null) {
            z = true;
        } else {
            z = false;
        }
        Validate.isTrue(z, "target object must not be null", new Object[0]);
        Field field = getField(target.getClass(), fieldName, true);
        if (field != null) {
            z = true;
        } else {
            z = false;
        }
        Validate.isTrue(z, "Cannot locate field %s on %s", fieldName, cls);
        return readField(field, target, false);
    }

    public static Object readField(Object target, String fieldName, boolean forceAccess) throws IllegalAccessException {
        boolean z;
        if (target != null) {
            z = true;
        } else {
            z = false;
        }
        Validate.isTrue(z, "target object must not be null", new Object[0]);
        Field field = getField(target.getClass(), fieldName, forceAccess);
        if (field != null) {
            z = true;
        } else {
            z = false;
        }
        Validate.isTrue(z, "Cannot locate field %s on %s", fieldName, cls);
        return readField(field, target, forceAccess);
    }

    public static void writeField(Object target, String fieldName, Object value) throws IllegalAccessException {
        writeField(target, fieldName, value, true);
    }

    public static void writeField(Object target, String fieldName, Object value, boolean forceAccess) throws IllegalAccessException {
        boolean z;
        if (target != null) {
            z = true;
        } else {
            z = false;
        }
        Validate.isTrue(z, "target object must not be null", new Object[0]);
        Field field = getField(target.getClass(), fieldName, true);
        if (field != null) {
            z = true;
        } else {
            z = false;
        }
        Validate.isTrue(z, "Cannot locate declared field %s.%s", cls.getName(), fieldName);
        writeField(field, target, value, forceAccess);
    }

    public static void writeField(Field field, Object target, Object value) throws IllegalAccessException {
        writeField(field, target, value, true);
    }

    public static Object readStaticField(Field field, boolean forceAccess) throws IllegalAccessException {
        boolean z;
        if (field != null) {
            z = true;
        } else {
            z = false;
        }
        Validate.isTrue(z, "The field must not be null", new Object[0]);
        Validate.isTrue(Modifier.isStatic(field.getModifiers()), "The field '%s' is not static", field.getName());
        return readField(field, null, forceAccess);
    }

    public static Object readStaticField(Class<?> cls, String fieldName) throws IllegalAccessException {
        boolean z;
        Field field = getField(cls, fieldName, true);
        if (field != null) {
            z = true;
        } else {
            z = false;
        }
        Validate.isTrue(z, "Cannot locate field '%s' on %s", fieldName, cls);
        return readStaticField(field, true);
    }

    public static void writeStaticField(Field field, Object value, boolean forceAccess) throws IllegalAccessException {
        Validate.isTrue(field != null, "The field must not be null", new Object[0]);
        Validate.isTrue(Modifier.isStatic(field.getModifiers()), "The field %s.%s is not static", field.getDeclaringClass().getName(), field.getName());
        writeField(field, null, value, forceAccess);
    }

    public static void writeStaticField(Class<?> cls, String fieldName, Object value) throws IllegalAccessException {
        boolean z;
        Field field = getField(cls, fieldName, true);
        if (field != null) {
            z = true;
        } else {
            z = false;
        }
        Validate.isTrue(z, "Cannot locate field %s on %s", fieldName, cls);
        writeStaticField(field, value, true);
    }

    public static Field getDeclaredField(Class<?> cls, String fieldName, boolean forceAccess) {
        boolean z = true;
        Validate.isTrue(cls != null, "The class must not be null", new Object[0]);
        if (TextUtils.isEmpty(fieldName)) {
            z = false;
        }
        Validate.isTrue(z, "The field name must not be blank/empty", new Object[0]);
        try {
            Field field = cls.getDeclaredField(fieldName);
            if (MemberUtils.isAccessible(field)) {
                return field;
            }
            if (!forceAccess) {
                return null;
            }
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException e) {
            return null;
        }
    }

    public static void writeDeclaredField(Object target, String fieldName, Object value) throws IllegalAccessException {
        boolean z;
        if (target != null) {
            z = true;
        } else {
            z = false;
        }
        Validate.isTrue(z, "target object must not be null", new Object[0]);
        Field field = getDeclaredField(target.getClass(), fieldName, true);
        if (field != null) {
            z = true;
        } else {
            z = false;
        }
        Validate.isTrue(z, "Cannot locate declared field %s.%s", cls.getName(), fieldName);
        writeField(field, target, value, false);
    }
}
