/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.content.DialogInterface
 *  android.support.v4.view.ViewPager
 *  android.support.v7.widget.RecyclerView
 *  android.support.v7.widget.RecyclerView$LayoutManager
 *  android.text.Editable
 *  android.text.TextUtils
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.widget.AbsListView
 *  android.widget.AdapterView
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.ExpandableListView
 *  android.widget.Spinner
 */
package com.growingio.android.sdk.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Spinner;
import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.aq;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.collection.t;
import com.growingio.android.sdk.utils.LogUtil;
import com.growingio.android.sdk.utils.a;
import com.growingio.android.sdk.utils.j;
import com.growingio.android.sdk.utils.l;
import com.growingio.android.sdk.utils.m;
import com.growingio.android.sdk.utils.n;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class k {
    private static m a = new m(null);
    private static m b = new m(null);

    private static t a() {
        return t.d();
    }

    public static boolean a(View view, String string, boolean bl2) {
        if (view.hashCode() == k.a().c()) {
            return true;
        }
        return !(view instanceof aq) && view instanceof ViewGroup && (!bl2 || view.getWindowVisibility() != 8 && view.getVisibility() == 0 && !TextUtils.equals((CharSequence)string, (CharSequence)n.d()) && view.getWidth() != 0 && view.getHeight() != 0);
    }

    public static int a(View[] arrview) {
        int n2 = 0;
        t t2 = k.a();
        if (t2 == null) {
            return n2;
        }
        for (View view : arrview) {
            if (view == null) continue;
            String string = t2.a(view);
            n2 += string.equals(n.d()) ? 1 : 0;
        }
        return n2;
    }

    public static void a(View[] arrview, com.growingio.android.sdk.b.l l2) {
        boolean bl2 = k.a(arrview) > 1;
        t t2 = k.a();
        try {
            for (View view : arrview) {
                View view2 = view;
                String string = t2.a(view2);
                if (!k.a(view2, string, bl2)) continue;
                k.a(view2, string, l2);
            }
        }
        catch (OutOfMemoryError var4_5) {
            com.growingio.android.sdk.collection.n.a("oomt");
        }
    }

    public static void a(View view, String string, com.growingio.android.sdk.b.l l2) {
        if (view == null) {
            return;
        }
        int[] arrn = new int[2];
        view.getLocationOnScreen(arrn);
        boolean bl2 = arrn[0] == 0 && arrn[1] == 0;
        i i2 = new i(view, 0, -1, j.a(view), bl2, false, false, string, string, string, l2);
        Object object = view.getTag(84159243);
        if (object != null && object instanceof String) {
            i2.l = (String)object;
        }
        if (i2.d()) {
            if (!n.b(view)) {
                i2.a();
            } else {
                i2.b();
            }
        }
    }

    public static i a(MenuItem menuItem) {
        if (menuItem == null) {
            return null;
        }
        n.a();
        View[] arrview = n.b();
        try {
            View view;
            for (View view22 : arrview) {
                if (view22.getClass() != n.d || (view = k.a(view22, menuItem)) == null) continue;
                return k.a(view);
            }
            for (View view22 : arrview) {
                if (view22.getClass() == n.d || (view = k.a(view22, menuItem)) == null) continue;
                return k.a(view);
            }
        }
        catch (InvocationTargetException var2_3) {
            var2_3.printStackTrace();
        }
        catch (IllegalAccessException var2_4) {
            var2_4.printStackTrace();
        }
        return null;
    }

    public static i a(View view) {
        c c2 = c.k();
        if (c2 == null || !GConfig.q().a()) {
            return null;
        }
        Activity activity = c2.i();
        if (activity == null || j.b(view)) {
            return null;
        }
        i i2 = k.a(view, (com.growingio.android.sdk.b.l)b);
        if (i2 == null) {
            return null;
        }
        b.a();
        b.b(i2);
        i2.b();
        return i2;
    }

    public static com.growingio.android.sdk.b.a a(i i2) {
        if (i2 == null) {
            return null;
        }
        c c2 = c.k();
        if (c2 == null || !GConfig.q().a()) {
            return null;
        }
        Activity activity = c2.i();
        if (activity == null || j.b(i2.c)) {
            return null;
        }
        com.growingio.android.sdk.b.a a2 = com.growingio.android.sdk.b.a.c();
        a2.g = c2.b(activity);
        a2.a = m.a(b);
        a2.b = t.d().a();
        return a2;
    }

    public static void a(com.growingio.android.sdk.b.a a2, i i2) {
        t.d().a((g)a2);
        com.growingio.android.sdk.circle.k k2 = com.growingio.android.sdk.circle.k.e();
        if (k2.c()) {
            k2.a(i2);
        }
    }

    public static void b(View view) {
        i i2 = k.a(view);
        if (i2 == null) {
            return;
        }
        com.growingio.android.sdk.b.a a2 = k.a(i2);
        if (a2 == null) {
            return;
        }
        k.a(a2, i2);
    }

    private static boolean a(View view, i i2) {
        Object object;
        if (view instanceof EditText && (object = view.getTag(84159246)) != null) {
            String string = object.toString();
            String string2 = ((EditText)view).getText().toString();
            if (TextUtils.isEmpty((CharSequence)string2) || string.equals(string2)) {
                return false;
            }
            view.setTag(84159246, (Object)string2);
            i2.k = string2;
            return true;
        }
        return false;
    }

    public static void c(View view) {
        c c2 = c.k();
        if (c2 == null || !GConfig.q().a()) {
            return;
        }
        Activity activity = c2.i();
        if (activity == null || j.b(view)) {
            return;
        }
        t t2 = t.d();
        i i2 = k.a(view, (com.growingio.android.sdk.b.l)a);
        if (i2 == null) {
            return;
        }
        if (!k.a(view, i2)) {
            return;
        }
        a.a();
        a.b(i2);
        com.growingio.android.sdk.b.a a2 = com.growingio.android.sdk.b.a.d();
        a2.g = c2.b(activity);
        a2.a = m.a(a);
        a2.b = t2.a();
        t2.a((g)a2);
    }

    public static i a(View view, com.growingio.android.sdk.b.l l2) {
        String string;
        Object object;
        Object object2;
        ArrayList<Object> arrayList = new ArrayList<Object>(8);
        arrayList.add((Object)view);
        for (ViewParent viewParent = view.getParent(); viewParent != null && viewParent instanceof ViewGroup; viewParent = viewParent.getParent()) {
            if (j.b((View)viewParent)) {
                return null;
            }
            arrayList.add((Object)((ViewGroup)viewParent));
        }
        int n2 = arrayList.size() - 1;
        View view2 = (View)arrayList.get(n2);
        n.a();
        String string2 = string = n.a(view2);
        String string3 = string;
        boolean bl2 = false;
        String string4 = null;
        String string5 = null;
        boolean bl3 = false;
        int n3 = -1;
        int n4 = 0;
        if (!n.b(view2) && !(view2.getParent() instanceof View)) {
            string3 = string2 = string2 + "/" + j.a(view2.getClass());
            if (GConfig.USE_ID && (object2 = j.a(view2, bl3)) != null) {
                if (view2.getTag(84159242) != null) {
                    bl3 = true;
                }
                string2 = string2 + "#" + (String)object2;
                string3 = string3 + "#" + (String)object2;
            }
        }
        if ((object2 = view2.getTag(84159243)) != null && object2 instanceof String) {
            string5 = (String)object2;
        }
        if (view2 instanceof ViewGroup) {
            object = (ViewGroup)view2;
            for (int i2 = n2 - 1; i2 >= 0; --i2) {
                n4 = 0;
                View view3 = (View)arrayList.get(i2);
                Object object3 = view3.getTag(84159241);
                if (object3 != null) {
                    string2 = "/" + object3;
                    string3 = string3 + "/" + object3;
                } else {
                    int n5;
                    Object object4;
                    object3 = j.a(view3.getClass());
                    n4 = object.indexOfChild(view3);
                    if (a.b(object)) {
                        n4 = ((ViewPager)object).getCurrentItem();
                        bl2 = true;
                    } else if (object instanceof AdapterView) {
                        object4 = (AdapterView)object;
                        n4 = object4.getFirstVisiblePosition() + n4;
                        bl2 = true;
                    } else if (a.a(object) && (n5 = k.a(view3, (ViewGroup)object)) >= 0) {
                        bl2 = true;
                        n4 = n5;
                    }
                    if (object instanceof ExpandableListView) {
                        int n6;
                        object4 = (ExpandableListView)object;
                        long l3 = object4.getExpandableListPosition(n4);
                        if (ExpandableListView.getPackedPositionType((long)l3) == 2) {
                            if (n4 < object4.getHeaderViewsCount()) {
                                string2 = string2 + "/ELH[" + n4 + "]/" + object3 + "[0]";
                                string3 = string3 + "/ELH[" + n4 + "]/" + object3 + "[0]";
                            } else {
                                n6 = n4 - (object4.getCount() - object4.getFooterViewsCount());
                                string2 = string2 + "/ELF[" + n6 + "]/" + object3 + "[0]";
                                string3 = string3 + "/ELF[" + n6 + "]/" + object3 + "[0]";
                            }
                        } else {
                            n6 = ExpandableListView.getPackedPositionGroup((long)l3);
                            int n7 = ExpandableListView.getPackedPositionChild((long)l3);
                            if (n7 != -1) {
                                n3 = n7;
                                string2 = string2 + "/ELVG[" + n6 + "]/ELVC[" + n7 + "]/" + object3 + "[0]";
                                string3 = string2 + "/ELVG[" + n6 + "]/ELVC[-]/" + object3 + "[0]";
                            } else {
                                n3 = n6;
                                string3 = string2 + "/ELVG[-]/" + object3 + "[0]";
                                string2 = string2 + "/ELVG[" + n6 + "]/" + object3 + "[0]";
                            }
                        }
                    } else if (j.a((View)object)) {
                        object4 = object.getTag(84159238);
                        if (object4 != null && object4 instanceof com.growingio.android.sdk.b.k) {
                            com.growingio.android.sdk.b.k k2 = (com.growingio.android.sdk.b.k)object4;
                            n4 = k2.a(n4);
                            string4 = j.a(String.valueOf(((List)k2.c).get(n4)));
                        }
                        n3 = n4;
                        string3 = string2 + "/" + object3 + "[-]";
                        string2 = string2 + "/" + object3 + "[" + n3 + "]";
                    } else if (a.c(object)) {
                        string2 = string2 + "/" + object3 + "[0]";
                        string3 = string3 + "/" + object3 + "[0]";
                    } else {
                        string2 = string2 + "/" + object3 + "[" + n4 + "]";
                        string3 = string3 + "/" + object3 + "[" + n4 + "]";
                    }
                    if (GConfig.USE_ID && (object4 = j.a(view3, bl3)) != null) {
                        if (view3.getTag(84159242) != null) {
                            bl3 = true;
                        }
                        string2 = string2 + "#" + (String)object4;
                        string3 = string3 + "#" + (String)object4;
                    }
                }
                object2 = view3.getTag(84159243);
                if (object2 != null && object2 instanceof String) {
                    string5 = (String)object2;
                }
                if (!(view3 instanceof ViewGroup)) break;
                object = (ViewGroup)view3;
            }
        }
        if ((object2 = view.getTag(84159243)) != null && object2 instanceof String) {
            string5 = (String)object2;
        }
        object = new i(view, n4, n3, bl2, string.equals(n.d()), true, bl3, string2, string3, string, l2);
        object.k = j.a(view, string4);
        object.l = string5;
        object.s = string3;
        object.h = string4;
        return object;
    }

    public static int a(View view, ViewGroup viewGroup) {
        if (a.a && viewGroup instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView)viewGroup;
            if (a.b) {
                return recyclerView.getChildAdapterPosition(view);
            }
            return recyclerView.getChildPosition(view);
        }
        if (a.d && viewGroup.getClass().equals(a.k)) {
            try {
                return (Integer)a.l.invoke((Object)viewGroup, new Object[]{view});
            }
            catch (IllegalAccessException var2_3) {
                LogUtil.d(var2_3);
            }
            catch (InvocationTargetException var2_4) {
                LogUtil.d(var2_4);
            }
        }
        return -1;
    }

    public static void a(AdapterView adapterView, View view, int n2, long l2) {
        if (adapterView instanceof Spinner) {
            k.b((View)adapterView);
        } else {
            k.b(view);
        }
    }

    private static View a(View view, MenuItem menuItem) {
        if (n.c(view) == menuItem) {
            return view;
        }
        if (view instanceof ViewGroup) {
            for (int i2 = 0; i2 < ((ViewGroup)view).getChildCount(); ++i2) {
                View view2 = k.a(((ViewGroup)view).getChildAt(i2), menuItem);
                if (view2 == null) continue;
                return view2;
            }
        }
        return null;
    }

    public static boolean d(View view) {
        if (view == null) {
            return false;
        }
        for (ViewParent viewParent = view.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
            if (viewParent instanceof AbsListView || a.a && viewParent instanceof RecyclerView && ((RecyclerView)viewParent).getLayoutManager().canScrollVertically()) {
                return true;
            }
            try {
                if (!a.d || !viewParent.getClass().equals(a.k) || !((Boolean)a.n.invoke(a.m.invoke((Object)viewParent, new Object[0]), new Object[0])).booleanValue()) continue;
                return true;
            }
            catch (IllegalAccessException var2_3) {
                var2_3.printStackTrace();
                continue;
            }
            catch (InvocationTargetException var2_4) {
                var2_4.printStackTrace();
                continue;
            }
            catch (NullPointerException var2_5) {
                var2_5.printStackTrace();
            }
        }
        return false;
    }

    public static void a(DialogInterface dialogInterface, int n2) {
        try {
            if (dialogInterface instanceof AlertDialog) {
                k.b((View)((AlertDialog)dialogInterface).getButton(n2));
            }
        }
        catch (Exception var2_2) {
            LogUtil.d(var2_2);
        }
    }
}

