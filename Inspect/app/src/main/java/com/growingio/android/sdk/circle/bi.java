/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.RadioButton
 */
package com.growingio.android.sdk.circle;

import android.view.View;
import android.widget.RadioButton;
import com.growingio.android.sdk.circle.ar;
import com.growingio.android.sdk.circle.df;
import com.growingio.android.sdk.utils.g;
import java.util.List;

class bi
implements df {
    final /* synthetic */ boolean a;
    final /* synthetic */ ar b;

    bi(ar ar2, boolean bl2) {
        this.b = ar2;
        this.a = bl2;
    }

    @Override
    public void a(List list) {
        ar.g(this.b, false);
        ar.z(this.b).setEnabled(true);
        if (list != null && !list.isEmpty()) {
            ar.h(this.b, false);
            ar.a(this.b, list);
            ar.r(this.b).removeAllViews();
            ar.r(this.b).addView((View)ar.a(this.b, g.a("growing_label_select_text_no_group", new Object[0]), (Object)null));
            ar.A(this.b);
            ((RadioButton)ar.r(this.b).getChildAt(1)).setChecked(true);
        } else if (ar.r(this.b).findViewById(ar.r(this.b).getCheckedRadioButtonId()).getTag() == null) {
            ((RadioButton)ar.r(this.b).getChildAt(1)).setChecked(true);
        }
        if (this.a) {
            ar.B(this.b);
        }
    }
}

