/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Message
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tendcloud.tenddata.TCAgent;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.dr;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class dk
implements dr.f {
    private final Handler a;
    private final Runnable b;
    private final Map c = new HashMap();
    private static final int d = 128;
    private static final int e = 1000;

    dk(Handler handler) {
        this.b = new a();
        this.a = handler;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(View view, String string, boolean bl2) {
        long l2 = System.currentTimeMillis();
        Hashtable<String, Object> hashtable = new Hashtable<String, Object>();
        String string2 = dk.a(view);
        hashtable.put("text", string2 == null ? "" : string2);
        hashtable.put("dynamic_event", true);
        hashtable.put("id", string);
        hashtable.put("time", l2);
        if (bl2) {
            b b2 = new b(view, string);
            c c2 = new c(string, hashtable, l2);
            Map map = this.c;
            synchronized (map) {
                boolean bl3 = this.c.isEmpty();
                this.c.put(b2, c2);
                if (bl3) {
                    this.a.postDelayed(this.b, 1000);
                }
            }
        } else {
            Message message = this.a.obtainMessage(13);
            message.obj = hashtable;
            this.a.sendMessage(message);
        }
    }

    private static String a(View view) {
        String string = null;
        if (view instanceof TextView) {
            TextView textView = (TextView)view;
            CharSequence charSequence = textView.getText();
            if (null != charSequence) {
                string = charSequence.toString();
            }
        } else if (view instanceof ViewGroup) {
            StringBuilder stringBuilder = new StringBuilder();
            ViewGroup viewGroup = (ViewGroup)view;
            int n2 = viewGroup.getChildCount();
            boolean bl2 = false;
            for (int i2 = 0; i2 < n2 && stringBuilder.length() < 128; ++i2) {
                View view2 = viewGroup.getChildAt(i2);
                String string2 = dk.a(view2);
                if (null == string2 || string2.length() <= 0) continue;
                if (bl2) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(string2);
                bl2 = true;
            }
            if (stringBuilder.length() > 128) {
                string = stringBuilder.substring(0, 128);
            } else if (bl2) {
                string = stringBuilder.toString();
            }
        }
        return string;
    }

    static class c {
        public final long a;
        public final String b;
        public final Hashtable c;

        public c(String string, Hashtable hashtable, long l2) {
            this.b = string;
            this.c = hashtable;
            this.a = l2;
        }
    }

    static class b {
        private final int a;

        public b(View view, String string) {
            this.a = view.hashCode() ^ string.hashCode();
        }

        public boolean equals(Object object) {
            if (object instanceof b) {
                return this.a == object.hashCode();
            }
            return false;
        }

        public int hashCode() {
            return this.a;
        }
    }

    final class a
    implements Runnable {
        private a() {
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void run() {
            long l2 = System.currentTimeMillis();
            Map map = dk.this.c;
            synchronized (map) {
                Iterator iterator = dk.this.c.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry entry = iterator.next();
                    c c2 = (c)entry.getValue();
                    if (l2 - c2.a <= 1000) continue;
                    TCAgent.onEvent(ab.mContext, c2.b, "", c2.c);
                    iterator.remove();
                }
                if (!dk.this.c.isEmpty()) {
                    dk.this.a.postDelayed((Runnable)this, 500);
                }
            }
        }
    }

}

