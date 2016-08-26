/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.os.AsyncTask
 *  android.text.TextUtils
 */
package com.growingio.android.sdk.circle;

import android.annotation.TargetApi;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.b.o;
import com.growingio.android.sdk.circle.df;
import com.growingio.android.sdk.circle.dg;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executor;

public class de {
    @TargetApi(value=11)
    public void a(String string, String string2, List list, df df2) {
        if (TextUtils.isEmpty((CharSequence)string) || TextUtils.isEmpty((CharSequence)string2) || list == null || list.isEmpty() || df2 == null) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        for (i i2 : list) {
            arrayList.add(i2.j);
        }
        o o2 = new o(string, string2, arrayList, this.a());
        new dg(this, list, df2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new o[]{o2});
    }

    private String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("abs:");
        DateFormat dateFormat = DateFormat.getDateInstance(3);
        try {
            stringBuffer.append(dateFormat.parse(dateFormat.format(new Date())).getTime());
        }
        catch (ParseException var3_3) {
            var3_3.printStackTrace();
            stringBuffer.append(System.currentTimeMillis());
        }
        stringBuffer.append(",").append(System.currentTimeMillis());
        return stringBuffer.toString();
    }
}

