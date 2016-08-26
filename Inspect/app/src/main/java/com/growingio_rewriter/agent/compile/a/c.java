/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile.a;

import com.growingio.agent.compile.a.d;
import com.growingio.agent.compile.k;
import com.growingio.agent.compile.m;
import com.growingio.d.a.f;
import com.growingio.d.a.r;
import java.util.HashSet;

public class c
extends f {
    private final k a;
    private final m b;
    private static final HashSet<String> c = new HashSet();

    public c(f f2, k k2, m m2) {
        super(327680, f2);
        this.a = k2;
        this.b = m2;
    }

    @Override
    public void a(int n2, int n3, String string, String string2, String string3, String[] arrstring) {
        super.a(n2, n3, string, string2, string3, arrstring);
    }

    @Override
    public r a(int n2, String string, String string2, String string3, String[] arrstring) {
        r r2 = super.a(n2, string, string2, string3, arrstring);
        if (this.a.d(string, string2) || this.a.d()) {
            this.b.a("skipping method " + string + string2 + " in " + this.a.h());
        } else if ((n2 & 2) == 0 && (n2 & 8) == 0 && c.contains(string + string2)) {
            this.a.e();
            return new d(this, r2, n2, string, string2);
        }
        return r2;
    }

    static /* synthetic */ k a(c c2) {
        return c2.a;
    }

    static /* synthetic */ m b(c c2) {
        return c2.b;
    }

    static {
        c.add("onCheckedChanged(Landroid/widget/CompoundButton;Z)V");
        c.add("onCheckedChanged(Landroid/widget/RadioGroup;I)V");
        c.add("onChildClick(Landroid/widget/ExpandableListView;Landroid/view/View;IIJ)Z");
        c.add("onClick(Landroid/content/DialogInterface;I)V");
        c.add("onClick(Landroid/view/View;)V");
        c.add("onGroupClick(Landroid/widget/ExpandableListView;Landroid/view/View;IJ)Z");
        c.add("onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        c.add("onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        c.add("onMenuItemClick(Landroid/view/MenuItem;)Z");
        c.add("onNewIntent(Landroid/content/Intent;)V");
        c.add("onOptionsItemSelected(Landroid/view/MenuItem;)Z");
        c.add("onRatingChanged(Landroid/widget/RatingBar;FZ)V");
        c.add("onStopTrackingTouch(Landroid/widget/SeekBar;)V");
    }
}

