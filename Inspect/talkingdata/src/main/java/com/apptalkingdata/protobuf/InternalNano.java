/*
 * Decompiled with CFR 0_115.
 */
package com.apptalkingdata.protobuf;

import com.apptalkingdata.protobuf.ExtendableMessageNano;
import com.apptalkingdata.protobuf.FieldArray;
import java.util.Arrays;

public final class InternalNano {
    public static final Object LAZY_INIT_LOCK = new Object();

    private InternalNano() {
    }

    public static boolean equals(int[] arrn, int[] arrn2) {
        if (arrn == null || arrn.length == 0) {
            return arrn2 == null || arrn2.length == 0;
        }
        return Arrays.equals(arrn, arrn2);
    }

    public static boolean equals(long[] arrl, long[] arrl2) {
        if (arrl == null || arrl.length == 0) {
            return arrl2 == null || arrl2.length == 0;
        }
        return Arrays.equals(arrl, arrl2);
    }

    public static boolean equals(float[] arrf, float[] arrf2) {
        if (arrf == null || arrf.length == 0) {
            return arrf2 == null || arrf2.length == 0;
        }
        return Arrays.equals(arrf, arrf2);
    }

    public static boolean equals(double[] arrd, double[] arrd2) {
        if (arrd == null || arrd.length == 0) {
            return arrd2 == null || arrd2.length == 0;
        }
        return Arrays.equals(arrd, arrd2);
    }

    public static boolean equals(boolean[] arrbl, boolean[] arrbl2) {
        if (arrbl == null || arrbl.length == 0) {
            return arrbl2 == null || arrbl2.length == 0;
        }
        return Arrays.equals(arrbl, arrbl2);
    }

    public static boolean equals(byte[][] arrby, byte[][] arrby2) {
        int n2;
        int n3 = 0;
        int n4 = arrby == null ? 0 : arrby.length;
        int n5 = 0;
        int n6 = n2 = arrby2 == null ? 0 : arrby2.length;
        do {
            boolean bl2;
            if (n3 < n4 && arrby[n3] == null) {
                ++n3;
                continue;
            }
            while (n5 < n2 && arrby2[n5] == null) {
                ++n5;
            }
            boolean bl3 = n3 >= n4;
            boolean bl4 = bl2 = n5 >= n2;
            if (bl3 && bl2) {
                return true;
            }
            if (bl3 != bl2) {
                return false;
            }
            if (!Arrays.equals(arrby[n3], arrby2[n5])) {
                return false;
            }
            ++n3;
            ++n5;
        } while (true);
    }

    public static boolean equals(Object[] arrobject, Object[] arrobject2) {
        int n2;
        int n3 = 0;
        int n4 = arrobject == null ? 0 : arrobject.length;
        int n5 = 0;
        int n6 = n2 = arrobject2 == null ? 0 : arrobject2.length;
        do {
            boolean bl2;
            if (n3 < n4 && arrobject[n3] == null) {
                ++n3;
                continue;
            }
            while (n5 < n2 && arrobject2[n5] == null) {
                ++n5;
            }
            boolean bl3 = n3 >= n4;
            boolean bl4 = bl2 = n5 >= n2;
            if (bl3 && bl2) {
                return true;
            }
            if (bl3 != bl2) {
                return false;
            }
            if (!arrobject[n3].equals(arrobject2[n5])) {
                return false;
            }
            ++n3;
            ++n5;
        } while (true);
    }

    public static void cloneUnknownFieldData(ExtendableMessageNano extendableMessageNano, ExtendableMessageNano extendableMessageNano2) {
        if (extendableMessageNano.unknownFieldData != null) {
            extendableMessageNano2.unknownFieldData = extendableMessageNano.unknownFieldData.clone();
        }
    }
}

