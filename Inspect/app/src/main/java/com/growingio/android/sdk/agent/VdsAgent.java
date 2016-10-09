/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.app.DatePickerDialog
 *  android.app.Dialog
 *  android.app.DialogFragment
 *  android.app.Fragment
 *  android.app.FragmentManager
 *  android.app.FragmentTransaction
 *  android.app.ProgressDialog
 *  android.app.TimePickerDialog
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.support.v4.app.DialogFragment
 *  android.support.v4.app.Fragment
 *  android.support.v4.app.FragmentManager
 *  android.support.v4.app.FragmentTransaction
 *  android.util.Log
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewParent
 *  android.webkit.WebChromeClient
 *  android.webkit.WebView
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.ExpandableListView
 *  android.widget.ExpandableListView$OnChildClickListener
 *  android.widget.ExpandableListView$OnGroupClickListener
 *  android.widget.PopupMenu
 *  android.widget.PopupMenu$OnMenuItemClickListener
 *  android.widget.PopupWindow
 *  android.widget.RadioGroup
 *  android.widget.RadioGroup$OnCheckedChangeListener
 *  android.widget.RatingBar
 *  android.widget.SeekBar
 *  android.widget.Toast
 *  com.tencent.smtt.sdk.WebChromeClient
 *  com.tencent.smtt.sdk.WebView
 */
package com.growingio.android.sdk.agent;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;
import com.growingio.android.sdk.agent.a;
import com.growingio.android.sdk.agent.b;
import com.growingio.android.sdk.agent.c;
import com.growingio.android.sdk.agent.d;
import com.growingio.android.sdk.agent.e;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.ak;
import com.growingio.android.sdk.collection.t;
import com.growingio.android.sdk.utils.LogUtil;
import com.tencent.smtt.sdk.WebView;
import java.lang.reflect.Field;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

public class VdsAgent {
    static boolean a = false;
    private static e b = new e(null);

    public static void clickOn(View view) {
        try {
            com.growingio.android.sdk.utils.k.b(view);
        }
        catch (Throwable var1_1) {
            LogUtil.d(var1_1);
        }
    }

    public static void onClick(Object object, View view) {
        try {
            if (object instanceof View.OnClickListener) {
                com.growingio.android.sdk.utils.k.b(view);
            }
        }
        catch (Throwable var2_2) {
            LogUtil.d(var2_2);
        }
    }

    public static void onClick(Object object, DialogInterface dialogInterface, int which) {
        try {
            if (object instanceof DialogInterface.OnClickListener) {
                com.growingio.android.sdk.utils.k.a(dialogInterface, which);
            }
        }
        catch (Throwable var3_3) {
            LogUtil.d(var3_3);
        }
    }

    public static void onItemClick(Object object, AdapterView parent, View view, int position, long id) {
        try {
            if (object instanceof AdapterView.OnItemClickListener || object instanceof AdapterView.OnItemSelectedListener) {
                com.growingio.android.sdk.utils.k.a(parent, view, position, id);
            }
        }
        catch (Throwable var6_5) {
            LogUtil.d(var6_5);
        }
    }

    public static void onItemSelected(Object object, AdapterView parent, View view, int position, long id) {
        VdsAgent.onItemClick(object, parent, view, position, id);
    }

    public static void onStopTrackingTouch(Object thisObj, SeekBar seekBar) {
        try {
            com.growingio.android.sdk.utils.k.b((View)seekBar);
        }
        catch (Throwable var2_2) {
            LogUtil.d(var2_2);
        }
    }

    public static void onRatingChanged(Object thisObj, RatingBar ratingBar, float rating, boolean fromUser) {
        try {
            if (fromUser) {
                com.growingio.android.sdk.utils.k.b((View)ratingBar);
            }
        }
        catch (Throwable var4_4) {
            LogUtil.d(var4_4);
        }
    }

    public static void onCheckedChanged(Object object, RadioGroup radioGroup, int i2) {
        try {
            if (object instanceof RadioGroup.OnCheckedChangeListener) {
                com.growingio.android.sdk.utils.k.b((View)radioGroup);
            }
        }
        catch (Throwable var3_3) {
            LogUtil.d(var3_3);
        }
    }

    public static void onCheckedChanged(Object object, CompoundButton button, boolean checked) {
        try {
            if (object instanceof CompoundButton.OnCheckedChangeListener) {
                com.growingio.android.sdk.utils.k.b((View)button);
            }
        }
        catch (Throwable var3_3) {
            LogUtil.d(var3_3);
        }
    }

    private static boolean a(View view) {
        View view2 = view;
        while (view != null && view.getVisibility() == 0) {
            ViewParent viewParent = view.getParent();
            if (viewParent == null) {
                LogUtil.d("VdsAgent", new Object[]{"Hit detached view: ", view2});
                return false;
            }
            if (viewParent instanceof View) {
                view = (View)viewParent;
                continue;
            }
            boolean bl2 = view2.getLocalVisibleRect(new Rect());
            if (!bl2) {
                LogUtil.d("VdsAgent", new Object[]{"Hit invisible rect view: ", view2});
            }
            return bl2;
        }
        return false;
    }

    private static boolean a(android.support.v4.app.Fragment fragment, boolean bl2) {
        boolean bl3;
        boolean bl4 = bl3 = fragment.getId() != 0;
        if (!bl3) {
            LogUtil.d("VdsAgent", new Object[]{"skip non-id fragment ", fragment});
            return false;
        }
        boolean bl5 = fragment.isHidden();
        if (bl5) {
            LogUtil.d("VdsAgent", new Object[]{"skip hidden fragment ", fragment});
            return false;
        }
        boolean bl6 = fragment.getUserVisibleHint();
        if (!bl6) {
            LogUtil.d("VdsAgent", new Object[]{"skip !userVisibleHint fragment ", fragment});
            return false;
        }
        boolean bl7 = true;
        android.support.v4.app.Fragment fragment2 = fragment.getParentFragment();
        if (fragment2 != null) {
            bl7 = VdsAgent.a(fragment2, bl2);
        }
        if (!bl7) {
            LogUtil.d("VdsAgent", new Object[]{"skip !visible parent fragment ", fragment});
            return false;
        }
        if (!bl2) {
            return true;
        }
        boolean bl8 = VdsAgent.a(fragment.getView());
        if (!bl8) {
            LogUtil.d("VdsAgent", new Object[]{"skip invisible view fragment ", fragment});
            return false;
        }
        return true;
    }

    @TargetApi(value=15)
    private static boolean a(Fragment fragment, boolean bl2) {
        Fragment fragment2;
        boolean bl3;
        boolean bl4 = bl3 = fragment.getId() != 0;
        if (!bl3) {
            LogUtil.d("VdsAgent", new Object[]{"skip non-id fragment ", fragment});
            return false;
        }
        boolean bl5 = fragment.isHidden();
        if (bl5) {
            LogUtil.d("VdsAgent", new Object[]{"skip hidden fragment ", fragment});
            return false;
        }
        boolean bl6 = fragment.getUserVisibleHint();
        if (!bl6) {
            LogUtil.d("VdsAgent", new Object[]{"skip !userVisibleHint fragment ", fragment});
            return false;
        }
        boolean bl7 = true;
        if (Build.VERSION.SDK_INT >= 17 && (fragment2 = fragment.getParentFragment()) != null) {
            bl7 = VdsAgent.a(fragment2, bl2);
        }
        if (!bl7) {
            LogUtil.d("VdsAgent", new Object[]{"skip !visible parent fragment ", fragment});
            return false;
        }
        if (!bl2) {
            return true;
        }
        boolean bl8 = VdsAgent.a(fragment.getView());
        if (!bl8) {
            LogUtil.d("VdsAgent", new Object[]{"skip invisible view fragment ", fragment});
            return false;
        }
        return true;
    }

    private static void c(Object object) {
        try {
            if (com.growingio.android.sdk.utils.a.g(object)) {
                if (VdsAgent.a((android.support.v4.app.Fragment)object, false)) {
                    LogUtil.d("VdsAgent", "onFragmentResume: ", object);
                    com.growingio.android.sdk.collection.c c2 = com.growingio.android.sdk.collection.c.k();
                    if (c2 != null) {
                        c2.a((android.support.v4.app.Fragment)object);
                    }
                } else {
                    LogUtil.d("VdsAgent", "skip invisible Fragment: ", object);
                }
            } else if (object instanceof Fragment && Build.VERSION.SDK_INT >= 15) {
                if (VdsAgent.a((Fragment)object, false)) {
                    LogUtil.d("VdsAgent", "onFragmentResume: ", object);
                    com.growingio.android.sdk.collection.c c3 = com.growingio.android.sdk.collection.c.k();
                    if (c3 != null) {
                        c3.a((Fragment)object);
                    }
                } else {
                    LogUtil.d("VdsAgent", "skip invisible Fragment: ", object);
                }
            }
        }
        catch (Throwable var1_3) {
            LogUtil.d(var1_3);
        }
    }

    private static void d(Object object) {
        try {
            if (com.growingio.android.sdk.utils.a.g(object)) {
                if (VdsAgent.a((android.support.v4.app.Fragment)object, false)) {
                    LogUtil.d("VdsAgent", "onFragmentPause: ", object);
                    com.growingio.android.sdk.collection.c c2 = com.growingio.android.sdk.collection.c.k();
                    if (c2 != null) {
                        c2.b((android.support.v4.app.Fragment)object);
                    }
                } else {
                    LogUtil.d("VdsAgent", "skip invisible Fragment: ", object);
                }
            } else if (object instanceof Fragment) {
                if (Build.VERSION.SDK_INT >= 15) {
                    if (VdsAgent.a((Fragment)object, false)) {
                        LogUtil.d("VdsAgent", "onFragmentPause: ", object);
                        com.growingio.android.sdk.collection.c c3 = com.growingio.android.sdk.collection.c.k();
                        if (c3 != null) {
                            c3.b((Fragment)object);
                        }
                    }
                } else {
                    LogUtil.d("VdsAgent", "skip invisible Fragment: ", object);
                }
            }
        }
        catch (Throwable var1_3) {
            LogUtil.d(var1_3);
        }
    }

    private static void b(Object object, boolean bl2) {
        VdsAgent.a(object, bl2, true);
    }

    private static void a(Object object, boolean bl2, boolean bl3) {
        try {
            if (com.growingio.android.sdk.utils.a.g(object)) {
                if (((android.support.v4.app.Fragment)object).isResumed() && VdsAgent.a((android.support.v4.app.Fragment)object, !bl3)) {
                    Object object2;
                    LogUtil.d("VdsAgent", "setFragmentUserVisibleHint: ", bl2, " @ ", object);
                    if (bl2) {
                        object2 = com.growingio.android.sdk.collection.c.k();
                        if (object2 != null) {
                            object2.a((android.support.v4.app.Fragment)object);
                        }
                    } else {
                        object2 = com.growingio.android.sdk.collection.c.k();
                        if (object2 != null) {
                            object2.b((android.support.v4.app.Fragment)object);
                        }
                    }
                    object2 = ((android.support.v4.app.Fragment)object).getChildFragmentManager().getFragments();
                    if (object2 != null) {
                        Iterator iterator = object2.iterator();
                        while (iterator.hasNext()) {
                            android.support.v4.app.Fragment fragment = (android.support.v4.app.Fragment)iterator.next();
                            VdsAgent.a((Object)fragment, bl2, false);
                        }
                    }
                } else {
                    LogUtil.d("VdsAgent", "skip invisible Fragment: ", object);
                }
            } else if (object instanceof Fragment && Build.VERSION.SDK_INT >= 15) {
                if (((Fragment)object).isResumed() && VdsAgent.a((Fragment)object, !bl3)) {
                    Object object3;
                    LogUtil.d("VdsAgent", "setFragmentUserVisibleHint: ", bl2, " @ ", object);
                    if (bl2) {
                        object3 = com.growingio.android.sdk.collection.c.k();
                        if (object3 != null) {
                            object3.a((Fragment)object);
                        }
                    } else {
                        LogUtil.d("VdsAgent", "setFragmentUserVisibleHint: ", object);
                        object3 = com.growingio.android.sdk.collection.c.k();
                        if (object3 != null) {
                            object3.b((Fragment)object);
                        }
                    }
                    object3 = VdsAgent.a((Fragment)object);
                    if (object3 != null) {
                        Iterator iterator = object3.iterator();
                        while (iterator.hasNext()) {
                            Fragment fragment = (Fragment)iterator.next();
                            VdsAgent.a((Object)fragment, bl2, false);
                        }
                    }
                } else {
                    LogUtil.d("VdsAgent", "skip invisible Fragment: ", object);
                }
            }
        }
        catch (Throwable var3_5) {
            LogUtil.d(var3_5);
        }
    }

    public static void onFragmentResume(Object fragment) {
        com.growingio.android.sdk.utils.i.a(new a(fragment));
    }

    public static void onFragmentPause(Object fragment) {
        com.growingio.android.sdk.utils.i.a(new b(fragment));
    }

    public static void setFragmentUserVisibleHint(Object fragment, boolean visibleToUser) {
        com.growingio.android.sdk.utils.i.a(new c(fragment, visibleToUser));
    }

    public static void onFragmentHiddenChanged(Object fragment, boolean hidden) {
        VdsAgent.setFragmentUserVisibleHint(fragment, !hidden);
    }

    public static void showDialogFragment(android.app.DialogFragment dialogFragment, android.app.FragmentManager manager, String tag) {
        if (Build.VERSION.SDK_INT >= 11) {
            dialogFragment.show(manager, tag);
            VdsAgent.a();
        }
    }

    public static int showDialogFragment(android.app.DialogFragment dialogFragment, android.app.FragmentTransaction transaction, String tag) {
        if (Build.VERSION.SDK_INT >= 11) {
            LogUtil.d("VdsAgent", new Object[]{"showDialogFragment: ", dialogFragment});
            int n2 = dialogFragment.show(transaction, tag);
            VdsAgent.a();
            return n2;
        }
        return 0;
    }

    public static void showDialogFragment(DialogFragment dialogFragment, FragmentManager manager, String tag) {
        LogUtil.d("VdsAgent", new Object[]{"showDialogFragment: ", dialogFragment});
        dialogFragment.show(manager, tag);
        VdsAgent.a();
    }

    public static int showDialogFragment(DialogFragment dialogFragment, FragmentTransaction transaction, String tag) {
        LogUtil.d("VdsAgent", new Object[]{"showDialogFragment: ", dialogFragment});
        int n2 = dialogFragment.show(transaction, tag);
        VdsAgent.a();
        return n2;
    }

    public static AlertDialog showAlertDialogBuilder(AlertDialog.Builder builder) {
        AlertDialog alertDialog = builder.show();
        VdsAgent.a();
        return alertDialog;
    }

    public static void showDialog(Dialog dialog) {
        dialog.show();
        VdsAgent.a();
    }

    public static void showDialog(AlertDialog dialog) {
        VdsAgent.showDialog((Dialog)dialog);
    }

    public static void showDialog(DatePickerDialog dialog) {
        VdsAgent.showDialog((AlertDialog)dialog);
    }

    public static void showDialog(TimePickerDialog dialog) {
        VdsAgent.showDialog((AlertDialog)dialog);
    }

    public static void showDialog(ProgressDialog dialog) {
        VdsAgent.showDialog((AlertDialog)dialog);
    }

    @TargetApi(value=11)
    public static void showPopupMenu(PopupMenu menu) {
        menu.show();
        VdsAgent.a();
    }

    public static void showToast(Toast toast) {
        toast.show();
        VdsAgent.a();
    }

    public static void showAsDropDown(PopupWindow window, View view) {
        window.showAsDropDown(view);
        VdsAgent.a();
    }

    public static void showAsDropDown(PopupWindow window, View view, int xoff, int yoff) {
        window.showAsDropDown(view, xoff, yoff);
        VdsAgent.a();
    }

    @TargetApi(value=19)
    public static void showAsDropDown(PopupWindow window, View view, int xoff, int yoff, int gravity) {
        window.showAsDropDown(view, xoff, yoff, gravity);
        VdsAgent.a();
    }

    public static void showAtLocation(PopupWindow window, View parent, int gravity, int x2, int y2) {
        window.showAtLocation(parent, gravity, x2, y2);
        VdsAgent.a();
    }

    public static void onNewIntent(Object activity, Intent intent) {
        k k2;
        if (activity instanceof Activity && (k2 = k.e()) != null) {
            k2.a(intent, (Activity)activity);
        }
    }

    public static void loadUrl(android.webkit.WebView webView, String url) {
        webView.loadUrl(url);
        LogUtil.d("VdsAgent", "loadUrl: ", url);
    }

    public static URLConnection openConnection(URLConnection con) {
        LogUtil.d("VdsAgent", "openConnection: ", con);
        return con;
    }

    public static void setWebChromeClient(android.webkit.WebView webView, WebChromeClient client) {
        if (a) {
            return;
        }
        webView.setWebChromeClient(client);
        webView.setTag(84159239, (Object)client);
        if (GConfig.DEBUG) {
            LogUtil.d("VdsAgent", new Object[]{"trackWebView: ", webView, " with client ", client});
        }
        ak.b((View)webView);
    }

    public static void setWebChromeClient(WebView webView, com.tencent.smtt.sdk.WebChromeClient client) {
        a = true;
        webView.setWebChromeClient(client);
        a = false;
        webView.setTag(84159239, (Object)client);
        if (GConfig.DEBUG) {
            LogUtil.d("VdsAgent", new Object[]{"trackWebView: ", webView, " with client ", client});
        }
        ak.b((View)webView);
    }

    private static List a(Fragment fragment) {
        if (Build.VERSION.SDK_INT >= 17) {
            android.app.FragmentManager fragmentManager = fragment.getChildFragmentManager();
            try {
                Field field = fragmentManager.getClass().getDeclaredField("mActive");
                field.setAccessible(true);
                return (List)field.get((Object)fragmentManager);
            }
            catch (Exception var2_3) {
                Log.w((String)"VdsAgent", (String)("getChildFragments failed. " + var2_3.getMessage()));
            }
        }
        return null;
    }

    private static void a() {
        t t2 = t.d();
        if (t2 != null) {
            com.growingio.android.sdk.utils.i.a(new d(t2), 500);
        }
    }

    private static boolean e(Object object) {
        boolean bl2 = false;
        if (object instanceof Boolean) {
            bl2 = (Boolean)object;
        }
        return bl2;
    }

    public static void handleClickResult(Object returnValueObject) {
        boolean bl2 = VdsAgent.e(returnValueObject);
        if (bl2 && b.a()) {
            com.growingio.android.sdk.utils.i.b(b);
            com.growingio.android.sdk.utils.i.a(b);
        } else {
            b.a(null);
        }
    }

    public static boolean onOptionsItemSelected(Object object, MenuItem item) {
        if (b.a()) {
            return false;
        }
        i i2 = null;
        if (object instanceof Activity && !com.growingio.android.sdk.utils.a.f(object)) {
            i2 = com.growingio.android.sdk.utils.k.a(item);
        }
        b.a(i2);
        return false;
    }

    public static boolean onMenuItemClick(Object object, MenuItem item) {
        if (b.a()) {
            return false;
        }
        i i2 = null;
        if (object instanceof PopupMenu.OnMenuItemClickListener) {
            i2 = com.growingio.android.sdk.utils.k.a(item);
        }
        b.a(i2);
        return false;
    }

    public static boolean onGroupClick(Object thisObject, ExpandableListView parent, View v2, int groupPosition, long id) {
        if (b.a()) {
            return false;
        }
        i i2 = null;
        if (thisObject instanceof ExpandableListView.OnGroupClickListener) {
            i2 = com.growingio.android.sdk.utils.k.a(v2);
        }
        b.a(i2);
        return false;
    }

    public static boolean onChildClick(Object thisObject, ExpandableListView parent, View v2, int groupPosition, int childPosition, long id) {
        if (b.a()) {
            return false;
        }
        i i2 = null;
        if (thisObject instanceof ExpandableListView.OnChildClickListener) {
            i2 = com.growingio.android.sdk.utils.k.a(v2);
        }
        b.a(i2);
        return false;
    }

    static /* synthetic */ void a(Object object) {
        VdsAgent.c(object);
    }

    static /* synthetic */ void b(Object object) {
        VdsAgent.d(object);
    }

    static /* synthetic */ void a(Object object, boolean bl2) {
        VdsAgent.b(object, bl2);
    }
}

