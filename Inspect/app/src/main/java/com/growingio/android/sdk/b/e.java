/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.growingio.android.sdk.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.growingio.android.sdk.b.d;

final class e
implements Parcelable.Creator {
    e() {
    }

    public d a(Parcel parcel) {
        return new d(parcel);
    }

    public d[] a(int n2) {
        return new d[n2];
    }

    public /* synthetic */ Object[] newArray(int n2) {
        return this.a(n2);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a(parcel);
    }
}

