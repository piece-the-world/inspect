/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.location.Location;
import com.tendcloud.tenddata.cs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class cr {
    public static List a(Context context) {
        ArrayList arrayList = new ArrayList();
        if (!cs.b) {
            return arrayList;
        }
        if (cs.a(23) && context.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            return arrayList;
        }
        return arrayList;
    }

    public static String b(Context context) {
        List list = cr.a(context);
        StringBuffer stringBuffer = new StringBuffer();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Location location;
            stringBuffer.append(location.getLatitude()).append(',').append(location.getLongitude()).append(',').append((location = (Location)iterator.next()).hasAltitude() ? Double.valueOf(location.getAltitude()) : "").append(',').append(location.getTime()).append(',').append(location.hasAccuracy() ? Float.valueOf(location.getAccuracy()) : "").append(',').append(location.hasBearing() ? Float.valueOf(location.getBearing()) : "").append(',').append(location.hasSpeed() ? Float.valueOf(location.getSpeed()) : "").append(',').append(location.getProvider()).append(':');
        }
        return stringBuffer.toString();
    }

    public static JSONArray c(Context context) {
        List list = cr.a(context);
        JSONArray jSONArray = new JSONArray();
        for (Location location : list) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("lat", location.getLatitude());
                jSONObject.put("lng", location.getLongitude());
                jSONObject.put("ts", location.getTime());
                if (cs.a(17)) {
                    jSONObject.put("elapsed", location.getElapsedRealtimeNanos());
                }
                if (location.hasAltitude()) {
                    jSONObject.put("altitude", location.getAltitude());
                }
                if (location.hasAccuracy()) {
                    jSONObject.put("accurate", (double)location.getAccuracy());
                }
                if (location.hasBearing()) {
                    jSONObject.put("bearing", (double)location.getBearing());
                }
                if (location.hasSpeed()) {
                    jSONObject.put("speed", (double)location.getSpeed());
                }
                jSONObject.put("provider", (Object)location.getProvider());
                jSONArray.put((Object)jSONObject);
            }
            catch (Throwable var6_6) {}
        }
        return jSONArray;
    }

    public static JSONArray d(Context context) {
        return null;
    }

    public static Long[][] e(Context context) {
        Long[][] arrlong = new Long[3][];
        return arrlong;
    }
}

