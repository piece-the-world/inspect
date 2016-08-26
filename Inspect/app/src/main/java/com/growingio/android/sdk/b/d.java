/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.growingio.android.sdk.b.e;
import org.json.JSONException;
import org.json.JSONObject;

public class d
implements Parcelable {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public static final Parcelable.Creator CREATOR = new e();

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (Object)this.a);
            jSONObject.put("y", (Object)this.b);
            jSONObject.put("w", (Object)this.c);
            jSONObject.put("h", (Object)this.d);
            jSONObject.put("target", (Object)this.e);
            jSONObject.put("viewport", (Object)this.f);
        }
        catch (JSONException var2_2) {
            // empty catch block
        }
        return jSONObject;
    }

    public static d a(JSONObject jSONObject) {
        d d2 = new d();
        try {
            d2.a = jSONObject.getString("x");
            d2.b = jSONObject.getString("y");
            d2.c = jSONObject.getString("w");
            d2.d = jSONObject.getString("h");
            d2.e = jSONObject.getString("target");
            d2.f = jSONObject.getString("viewport");
        }
        catch (JSONException var2_2) {
            // empty catch block
        }
        return d2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }

    public d() {
    }

    protected d(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
    }
}

