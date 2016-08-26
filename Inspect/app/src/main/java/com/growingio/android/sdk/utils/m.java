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
 *  android.text.TextUtils
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.widget.AbsListView
 *  android.widget.AdapterView
 *  android.widget.Button
 *  android.widget.ExpandableListView
 *  android.widget.Spinner
 */
package com.growingio.android.sdk.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Spinner;
import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.b.k;
import com.growingio.android.sdk.b.l;
import com.growingio.android.sdk.circle.bu;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.collection.q;
import com.growingio.android.sdk.utils.LogUtil;
import com.growingio.android.sdk.utils.a;
import com.growingio.android.sdk.utils.i;
import com.growingio.android.sdk.utils.n;
import com.growingio.android.sdk.utils.o;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class m {
    private static ArrayList a;
    private static long b;
    private static l c;

    private static q c() {
        return q.d();
    }

    public static boolean a(View view, String string, boolean bl2) {
        if (view.hashCode() == m.c().c()) {
            return true;
        }
        return !(view instanceof bu) && view instanceof ViewGroup && (!bl2 || view.getWindowVisibility() != 8 && view.getVisibility() == 0 && !TextUtils.equals((CharSequence)string, (CharSequence)o.d()) && view.getWidth() != 0 && view.getHeight() != 0);
    }

    public static int a(View[] arrview) {
        int n2 = 0;
        q q2 = m.c();
        if (q2 == null) {
            return n2;
        }
        for (View view : arrview) {
            if (view == null) continue;
            String string = q2.a(view);
            n2 += string.equals(o.d()) ? 1 : 0;
        }
        return n2;
    }

    public static void a(View[] arrview, l l2) {
        boolean bl2 = m.a(arrview) > 1;
        q q2 = m.c();
        try {
            for (View view : arrview) {
                View view2 = view;
                String string = q2.a(view2);
                if (!m.a(view2, string, bl2)) continue;
                m.a(view2, string, l2);
            }
        }
        catch (OutOfMemoryError var4_5) {
            com.growingio.android.sdk.collection.m.a("oomt");
        }
    }

    public static void a(View view, String string, l l2) {
        if (view == null) {
            return;
        }
        int[] arrn = new int[2];
        view.getLocationOnScreen(arrn);
        boolean bl2 = arrn[0] == 0 && arrn[1] == 0;
        com.growingio.android.sdk.b.i i2 = new com.growingio.android.sdk.b.i(view, 0, -1, i.a(view), bl2, false, false, string, string, string, l2);
        Object object = view.getTag(84159243);
        if (object != null && object instanceof String) {
            i2.l = (String)object;
        }
        if (i2.d()) {
            i2.b();
        }
    }

    public static void a(View view) {
        String string;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        c c2 = c.h();
        if (c2 == null) {
            return;
        }
        Activity activity = c2.f();
        if (activity == null || i.b(view)) {
            return;
        }
        String string2 = c2.a(activity);
        ArrayList<Object> arrayList = new ArrayList<Object>(8);
        arrayList.add((Object)view);
        for (ViewParent viewParent = view.getParent(); viewParent != null && viewParent instanceof ViewGroup; viewParent = viewParent.getParent()) {
            if (i.b((View)viewParent)) {
                return;
            }
            arrayList.add((Object)((ViewGroup)viewParent));
        }
        int n2 = arrayList.size() - 1;
        View view2 = (View)arrayList.get(n2);
        String string3 = string = o.a(view2);
        String string4 = string;
        boolean bl2 = false;
        String string5 = null;
        String string6 = null;
        boolean bl3 = false;
        int n3 = -1;
        int n4 = 0;
        if (!o.b(view2) && !(view2.getParent() instanceof View)) {
            string4 = string3 = string3 + i.a(view2.getClass());
        }
        if ((object2 = view2.getTag(84159243)) != null && object2 instanceof String) {
            string6 = (String)object2;
        }
        if (view2 instanceof ViewGroup) {
            object4 = (ViewGroup)view2;
            for (int i2 = n2 - 1; i2 >= 0; --i2) {
                n4 = 0;
                object = (View)arrayList.get(i2);
                object3 = object.getTag(84159241);
                if (object3 != null) {
                    string3 = "/" + object3;
                    string4 = string4 + "/" + object3;
                } else {
                    Object object5;
                    object3 = i.a(object.getClass());
                    n4 = object4.indexOfChild((View)object);
                    if (a.a(object4)) {
                        n4 = ((ViewPager)object4).getCurrentItem();
                        bl2 = true;
                    } else if (object4 instanceof AdapterView) {
                        object5 = (AdapterView)object4;
                        n4 = object5.getFirstVisiblePosition() + n4;
                        bl2 = true;
                    } else if (a.a && object4 instanceof RecyclerView) {
                        object5 = (RecyclerView)object4;
                        n4 = a.b ? object5.getChildAdapterPosition((View)object) : object5.getChildPosition((View)object);
                        bl2 = true;
                    } else if (a.d && object4.getClass().equals(a.k)) {
                        try {
                            n4 = (Integer)a.l.invoke(object4, object);
                            bl2 = true;
                        }
                        catch (IllegalAccessException var22_24) {
                            LogUtil.d(var22_24);
                        }
                        catch (InvocationTargetException var22_25) {
                            LogUtil.d(var22_25);
                        }
                    }
                    if (object4 instanceof ExpandableListView) {
                        int n5;
                        object5 = (ExpandableListView)object4;
                        long l2 = object5.getExpandableListPosition(n4);
                        if (ExpandableListView.getPackedPositionType((long)l2) == 2) {
                            if (n4 < object5.getHeaderViewsCount()) {
                                string3 = string3 + "/ELH[" + n4 + "]/" + object3 + "[0]";
                                string4 = string4 + "/ELH[" + n4 + "]/" + object3 + "[0]";
                            } else {
                                n5 = n4 - (object5.getCount() - object5.getFooterViewsCount());
                                string3 = string3 + "/ELF[" + n5 + "]/" + object3 + "[0]";
                                string4 = string4 + "/ELF[" + n5 + "]/" + object3 + "[0]";
                            }
                        } else {
                            n5 = ExpandableListView.getPackedPositionGroup((long)l2);
                            int n6 = ExpandableListView.getPackedPositionChild((long)l2);
                            if (n6 != -1) {
                                n3 = n6;
                                string3 = string3 + "/ELVG[" + n5 + "]/ELVC[" + n6 + "]/" + object3 + "[0]";
                                string4 = string3 + "/ELVG[" + n5 + "]/ELVC[-]/" + object3 + "[0]";
                            } else {
                                n3 = n5;
                                string4 = string3 + "/ELVG[-]/" + object3 + "[0]";
                                string3 = string3 + "/ELVG[" + n5 + "]/" + object3 + "[0]";
                            }
                        }
                    } else if (i.a((View)object4)) {
                        object5 = object4.getTag(84159238);
                        if (object5 != null && object5 instanceof k) {
                            k k2 = (k)object5;
                            n4 = k2.a(n4);
                            string5 = i.a((String)((List)k2.c).get(n4));
                        }
                        n3 = n4;
                        string4 = string3 + "/" + object3 + "[-]";
                        string3 = string3 + "/" + object3 + "[" + n3 + "]";
                    } else if (a.b(object4)) {
                        string3 = string3 + "/" + object3 + "[0]";
                        string4 = string4 + "/" + object3 + "[0]";
                    } else {
                        string3 = string3 + "/" + object3 + "[" + n4 + "]";
                        string4 = string4 + "/" + object3 + "[" + n4 + "]";
                    }
                    if (GConfig.b && (object5 = i.a((View)object, bl3)) != null) {
                        if (object.getTag(84159242) != null) {
                            bl3 = true;
                        }
                        string3 = string3 + "#" + (String)object5;
                        string4 = string4 + "#" + (String)object5;
                    }
                }
                object2 = object.getTag(84159243);
                if (object2 != null && object2 instanceof String) {
                    string6 = (String)object2;
                }
                if (!(object instanceof ViewGroup)) break;
                object4 = (ViewGroup)object;
            }
        }
        if ((object2 = view.getTag(84159243)) != null && object2 instanceof String) {
            string6 = (String)object2;
        }
        a = new ArrayList();
        b = System.currentTimeMillis();
        object4 = new com.growingio.android.sdk.b.i(view, n4, n3, bl2, string.equals(o.d()), true, bl3, string3, string4, string, c);
        object4.k = i.a(view, string5);
        object4.l = string6;
        object4.s = string4;
        object4.h = string5;
        c.b((com.growingio.android.sdk.b.i)object4);
        object4.b();
        q q2 = q.d();
        object = com.growingio.android.sdk.b.a.c();
        object.g = string2;
        object.a = a;
        object.b = q2.a();
        q2.a((g)object);
        object3 = j.e();
        if (object3.c()) {
            object3.a((com.growingio.android.sdk.b.i)object4);
        }
    }

    public static void a(AdapterView adapterView, View view, int n2, long l2) {
        if (adapterView instanceof Spinner) {
            m.a((View)adapterView);
        } else {
            m.a(view);
        }
    }

    public static void a(MenuItem menuItem) {
        if (menuItem == null) {
            return;
        }
        o.a();
        View[] arrview = o.b();
        try {
            View view;
            for (View view22 : arrview) {
                if (view22.getClass() != o.d || (view = m.a(view22, menuItem)) == null) continue;
                m.a(view);
                return;
            }
            for (View view22 : arrview) {
                if (view22.getClass() == o.d || (view = m.a(view22, menuItem)) == null) continue;
                m.a(view);
                return;
            }
        }
        catch (InvocationTargetException var2_3) {
            var2_3.printStackTrace();
        }
        catch (IllegalAccessException var2_4) {
            var2_4.printStackTrace();
        }
    }

    private static View a(View view, MenuItem menuItem) {
        if (o.c(view) == menuItem) {
            return view;
        }
        if (view instanceof ViewGroup) {
            for (int i2 = 0; i2 < ((ViewGroup)view).getChildCount(); ++i2) {
                View view2 = m.a(((ViewGroup)view).getChildAt(i2), menuItem);
                if (view2 == null) continue;
                return view2;
            }
        }
        return null;
    }

    public static boolean b(View view) {
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

    public static boolean c(View view) {
        if (view == null) {
            return false;
        }
        for (ViewParent viewParent = view.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
            if (a.a && viewParent instanceof RecyclerView && ((RecyclerView)viewParent).getLayoutManager().canScrollHorizontally() || a.a((Object)viewParent)) {
                return true;
            }
            try {
                if (!a.d || !viewParent.getClass().equals(a.k) || !((Boolean)a.o.invoke(a.m.invoke((Object)viewParent, new Object[0]), new Object[0])).booleanValue()) continue;
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
                m.a((View)((AlertDialog)dialogInterface).getButton(n2));
            }
        }
        catch (Exception var2_2) {
            LogUtil.d(var2_2);
        }
    }

    static /* synthetic */ ArrayList a() {
        return a;
    }

    static /* synthetic */ long b() {
        return b;
    }

    static {
        c = new n();
    }
}

