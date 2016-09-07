/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.tendcloud.tenddata;

import android.content.Context;
import com.apptalkingdata.push.service.HttpCallback;
import com.tendcloud.tenddata.ay;
import com.tendcloud.tenddata.az;
import com.tendcloud.tenddata.be;
import com.tendcloud.tenddata.bf;
import com.tendcloud.tenddata.bh;
import com.tendcloud.tenddata.bw;
import java.util.ArrayList;
import java.util.List;

public class bd {
    private static final String a = bd.class.getSimpleName();

    private static String a(Context context, String string) {
        return bw.b(context) + string;
    }

    public static a a(Context context) {
        a a2 = new a();
        ArrayList<ay> arrayList = new ArrayList<ay>();
        arrayList.add(new ay("app", bw.c(context)));
        String string = String.format("/api/q/a/%s", bw.a(context));
        string = bd.a(context, string);
        bf bf2 = new bf(string, arrayList, new be(a2));
        bf2.a();
        bh.a(a, a2.toString());
        return a2;
    }

    public static class a {
        public String a;
        public int b;

        public boolean a() {
            return !az.a(this.a) && this.b != 0;
        }

        public String toString() {
            return String.format("%s:%d", this.a, this.b);
        }
    }

}

