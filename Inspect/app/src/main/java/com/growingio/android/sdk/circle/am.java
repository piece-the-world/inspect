/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
package com.growingio.android.sdk.circle;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.growingio.android.sdk.b.f;
import com.growingio.android.sdk.b.h;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.ag;
import com.growingio.android.sdk.circle.an;
import com.growingio.android.sdk.utils.g;
import com.growingio.android.sdk.utils.l;

class am
implements l {
    final /* synthetic */ TextView a;
    final /* synthetic */ View b;
    final /* synthetic */ ag c;

    am(ag ag2, TextView textView, View view) {
        this.c = ag2;
        this.a = textView;
        this.b = view;
    }

    @Override
    public void a(f f2) {
        Object object;
        if (f2 == null) {
            return;
        }
        if (f2.b != null) {
            f2 = f2.a();
        } else {
            object = com.growingio.android.sdk.utils.i.e(((i)ag.b((ag)this.c).get((int)0)).c);
            f2.c = !TextUtils.isEmpty((CharSequence)object) ? object : f2.f.d;
        }
        this.a.setText((CharSequence)f2.c);
        this.b.setVisibility(0);
        object = f2;
        this.b.findViewById(g.c("btn_define_h5_page")).setOnClickListener((View.OnClickListener)new an(this, (f)object));
    }
}

