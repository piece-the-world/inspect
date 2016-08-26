/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile.a;

import com.growingio.a.a.d.fg;
import com.growingio.agent.compile.a.b;
import com.growingio.agent.compile.a.m;
import com.growingio.agent.compile.k;
import com.growingio.d.a.a;
import com.growingio.d.a.c;
import com.growingio.d.a.f;
import com.growingio.d.a.j;
import com.growingio.d.a.r;
import java.text.MessageFormat;

public class l
extends f {
    private static final String b = "Lcom/growingio/android/sdk/instrumentation/DoNotTrack;";
    private static final String c = "Lcom/growingio/android/sdk/instrumentation/Track;";
    private final k d;
    private final com.growingio.agent.compile.m e;
    private static fg<String> h = fg.a("android/view/View$OnClickListener", "android/widget/AdapterView$OnItemClickListener", "android/content/DialogInterface$OnClickListener", "android/widget/CompoundButton$OnCheckedChangeListener", "android/widget/RadioGroup$OnCheckedChangeListener");
    static final fg<String> a = fg.a("android/accounts/AccountAuthenticatorActivity", "android/app/Activity", "android/app/ActivityGroup", "android/app/AliasActivity", "android/app/ExpandableListActivity", "android/app/LauncherActivity", "android/app/ListActivity", "android/app/NativeActivity", "android/app/TabActivity", "android/preference/PreferenceActivity", "android/support/v4/app/FragmentActivity", "android/support/v7/app/ActionBarActivity");

    public l(k k2, com.growingio.agent.compile.m m2) {
        super(327680);
        this.d = k2;
        this.e = m2;
    }

    @Override
    public void a(int n2, int n3, String string, String string2, String string3, String[] arrstring) {
        this.d.e(string);
        this.d.f(string3);
        if (string.startsWith("android/support/design/widget/Snackbar$") && arrstring != null && arrstring.length > 0 && arrstring[0].equals("android/view/View$OnClickListener")) {
            this.d.c();
        }
    }

    @Override
    public a a(String string, boolean bl2) {
        if (b.a(string)) {
            this.e.a(MessageFormat.format("[{0}] class has VDS tag: {1}", this.d.h(), string));
            this.d.a(string);
            if (string.equals("Lcom/growingio/android/sdk/instrumentation/DoNotTrack;")) {
                this.d.c();
            }
        }
        return null;
    }

    @Override
    public void a(c c2) {
    }

    @Override
    public void a() {
    }

    @Override
    public j a(int n2, String string, String string2, String string3, Object object) {
        return null;
    }

    @Override
    public void a(String string, String string2, String string3, int n2) {
    }

    @Override
    public r a(int n2, String string, String string2, String string3, String[] arrstring) {
        return new m(this, string, string2);
    }

    @Override
    public void a(String string, String string2, String string3) {
    }

    @Override
    public void a_(String string, String string2) {
    }

    static /* synthetic */ k a(l l2) {
        return l2.d;
    }
}

