/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
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
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.support.v4.app.DialogFragment
 *  android.support.v4.app.Fragment
 *  android.support.v4.app.FragmentManager
 *  android.support.v4.app.FragmentTransaction
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
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

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;
import android.view.View;
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
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.ag;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.collection.q;
import com.growingio.android.sdk.utils.LogUtil;
import com.growingio.android.sdk.utils.h;
import com.growingio.android.sdk.utils.m;
import com.tencent.smtt.sdk.WebView;
import java.net.URLConnection;

public class VdsAgent {
    static boolean a = false;

    public static void onClick(Object object, View view) {
        try {
            if (object instanceof View.OnClickListener) {
                m.a(view);
            }
        }
        catch (Exception var2_2) {
            LogUtil.d(var2_2);
        }
    }

    public static void onClick(Object object, DialogInterface dialogInterface, int n2) {
        try {
            if (object instanceof DialogInterface.OnClickListener) {
                m.a(dialogInterface, n2);
            }
        }
        catch (Exception var3_3) {
            LogUtil.d(var3_3);
        }
    }

    public static boolean onGroupClick(Object object, ExpandableListView expandableListView, View view, int n2, long l2) {
        try {
            if (object instanceof ExpandableListView.OnGroupClickListener) {
                m.a(view);
            }
        }
        catch (Exception var6_5) {
            LogUtil.d(var6_5);
        }
        return false;
    }

    public static boolean onChildClick(Object object, ExpandableListView expandableListView, View view, int n2, int n3, long l2) {
        try {
            if (object instanceof ExpandableListView.OnChildClickListener) {
                m.a(view);
            }
        }
        catch (Exception var7_6) {
            LogUtil.d(var7_6);
        }
        return false;
    }

    public static void onItemClick(Object object, AdapterView adapterView, View view, int n2, long l2) {
        try {
            if (object instanceof AdapterView.OnItemClickListener || object instanceof AdapterView.OnItemSelectedListener) {
                m.a(adapterView, view, n2, l2);
            }
        }
        catch (Exception var6_5) {
            LogUtil.d(var6_5);
        }
    }

    public static void onItemSelected(Object object, AdapterView adapterView, View view, int n2, long l2) {
        VdsAgent.onItemClick(object, adapterView, view, n2, l2);
    }

    public static void onStopTrackingTouch(Object object, SeekBar seekBar) {
        try {
            m.a((View)seekBar);
        }
        catch (Exception var2_2) {
            LogUtil.d(var2_2);
        }
    }

    public static void onRatingChanged(Object object, RatingBar ratingBar, float f2, boolean bl2) {
        try {
            if (bl2) {
                m.a((View)ratingBar);
            }
        }
        catch (Exception var4_4) {
            LogUtil.d(var4_4);
        }
    }

    public static boolean onMenuItemClick(Object object, MenuItem menuItem) {
        try {
            if (object instanceof PopupMenu.OnMenuItemClickListener) {
                m.a(menuItem);
            }
        }
        catch (Exception var2_2) {
            LogUtil.d(var2_2);
        }
        return false;
    }

    public static boolean onOptionsItemSelected(Object object, MenuItem menuItem) {
        try {
            if (object instanceof Activity && !com.growingio.android.sdk.utils.a.e(object)) {
                m.a(menuItem);
            }
        }
        catch (Exception var2_2) {
            LogUtil.d(var2_2);
        }
        return false;
    }

    public static void onCheckedChanged(Object object, RadioGroup radioGroup, int n2) {
        try {
            if (object instanceof RadioGroup.OnCheckedChangeListener) {
                m.a((View)radioGroup);
            }
        }
        catch (Exception var3_3) {
            LogUtil.d(var3_3);
        }
    }

    public static void onCheckedChanged(Object object, CompoundButton compoundButton, boolean bl2) {
        try {
            if (object instanceof CompoundButton.OnCheckedChangeListener) {
                m.a((View)compoundButton);
            }
        }
        catch (Exception var3_3) {
            LogUtil.d(var3_3);
        }
    }

    public static void onFragmentResume(Object object) {
        if (object instanceof Fragment) {
            if (Build.VERSION.SDK_INT >= 15 && ((Fragment)object).getUserVisibleHint() && ((Fragment)object).getId() != 0) {
                LogUtil.d("VdsAgent", "onFragmentResume: " + object);
                c c2 = c.h();
                if (c2 != null) {
                    c2.a((Fragment)object);
                }
            }
        } else if (com.growingio.android.sdk.utils.a.f(object) && ((android.support.v4.app.Fragment)object).getUserVisibleHint() && ((android.support.v4.app.Fragment)object).getId() != 0) {
            LogUtil.d("VdsAgent", "onFragmentResume: " + object);
            c c3 = c.h();
            if (c3 != null) {
                c3.a((android.support.v4.app.Fragment)object);
            }
        }
    }

    public static void onFragmentPause(Object object) {
        if (object instanceof Fragment) {
            if (Build.VERSION.SDK_INT >= 15 && ((Fragment)object).getUserVisibleHint() && ((Fragment)object).getId() != 0) {
                LogUtil.d("VdsAgent", "onFragmentPause: " + object);
                c c2 = c.h();
                if (c2 != null) {
                    c2.b((Fragment)object);
                }
            }
        } else if (com.growingio.android.sdk.utils.a.f(object) && ((android.support.v4.app.Fragment)object).getUserVisibleHint() && ((android.support.v4.app.Fragment)object).getId() != 0) {
            LogUtil.d("VdsAgent", "onFragmentPause: " + object);
            c c3 = c.h();
            if (c3 != null) {
                c3.b((android.support.v4.app.Fragment)object);
            }
        }
    }

    public static void setFragmentUserVisibleHint(Object object, boolean bl2) {
        if (object instanceof Fragment) {
            if (Build.VERSION.SDK_INT >= 15 && ((Fragment)object).isResumed() && ((Fragment)object).getId() != 0) {
                if (bl2) {
                    LogUtil.d("VdsAgent", "setFragmentUserVisibleHint: " + object);
                    c c2 = c.h();
                    if (c2 != null) {
                        c2.a((Fragment)object);
                    }
                } else {
                    LogUtil.d("VdsAgent", "setFragmentUserVisibleHint: " + object);
                    c c3 = c.h();
                    if (c3 != null) {
                        c3.b((Fragment)object);
                    }
                }
            }
        } else if (com.growingio.android.sdk.utils.a.f(object) && ((android.support.v4.app.Fragment)object).isResumed() && ((android.support.v4.app.Fragment)object).getId() != 0) {
            if (bl2) {
                LogUtil.d("VdsAgent", "setFragmentUserVisibleHint: " + object);
                c c4 = c.h();
                if (c4 != null) {
                    c4.a((android.support.v4.app.Fragment)object);
                }
            } else {
                LogUtil.d("VdsAgent", "setFragmentUserVisibleHint: " + object);
                c c5 = c.h();
                if (c5 != null) {
                    c5.b((android.support.v4.app.Fragment)object);
                }
            }
        }
    }

    public static void showDialogFragment(android.app.DialogFragment dialogFragment, android.app.FragmentManager fragmentManager, String string) {
        if (Build.VERSION.SDK_INT >= 11) {
            dialogFragment.show(fragmentManager, string);
            VdsAgent.a();
        }
    }

    public static int showDialogFragment(android.app.DialogFragment dialogFragment, android.app.FragmentTransaction fragmentTransaction, String string) {
        if (Build.VERSION.SDK_INT >= 11) {
            LogUtil.d("VdsAgent", "showDialogFragment: " + (Object)dialogFragment);
            int n2 = dialogFragment.show(fragmentTransaction, string);
            VdsAgent.a();
            return n2;
        }
        return 0;
    }

    public static void showDialogFragment(DialogFragment dialogFragment, FragmentManager fragmentManager, String string) {
        LogUtil.d("VdsAgent", "showDialogFragment: " + (Object)dialogFragment);
        dialogFragment.show(fragmentManager, string);
        VdsAgent.a();
    }

    public static int showDialogFragment(DialogFragment dialogFragment, FragmentTransaction fragmentTransaction, String string) {
        LogUtil.d("VdsAgent", "showDialogFragment: " + (Object)dialogFragment);
        int n2 = dialogFragment.show(fragmentTransaction, string);
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

    public static void showDialog(AlertDialog alertDialog) {
        VdsAgent.showDialog((Dialog)alertDialog);
    }

    public static void showDialog(DatePickerDialog datePickerDialog) {
        VdsAgent.showDialog((AlertDialog)datePickerDialog);
    }

    public static void showDialog(TimePickerDialog timePickerDialog) {
        VdsAgent.showDialog((AlertDialog)timePickerDialog);
    }

    public static void showDialog(ProgressDialog progressDialog) {
        VdsAgent.showDialog((AlertDialog)progressDialog);
    }

    public static void showPopupMenu(PopupMenu popupMenu) {
        popupMenu.show();
        VdsAgent.a();
    }

    public static void showToast(Toast toast) {
        toast.show();
        VdsAgent.a();
    }

    public static void showAsDropDown(PopupWindow popupWindow, View view) {
        popupWindow.showAsDropDown(view);
        VdsAgent.a();
    }

    public static void showAsDropDown(PopupWindow popupWindow, View view, int n2, int n3) {
        popupWindow.showAsDropDown(view, n2, n3);
        VdsAgent.a();
    }

    public static void showAsDropDown(PopupWindow popupWindow, View view, int n2, int n3, int n4) {
        popupWindow.showAsDropDown(view, n2, n3, n4);
        VdsAgent.a();
    }

    public static void showAtLocation(PopupWindow popupWindow, View view, int n2, int n3, int n4) {
        popupWindow.showAtLocation(view, n2, n3, n4);
        VdsAgent.a();
    }

    public static void onNewIntent(Object object, Intent intent) {
        j j2;
        if (object instanceof Activity && (j2 = j.e()) != null) {
            j2.a(intent, (Activity)object);
        }
    }

    public static void loadUrl(android.webkit.WebView webView, String string) {
        webView.loadUrl(string);
        LogUtil.d("VdsAgent", "loadUrl: " + string);
    }

    public static URLConnection openConnection(URLConnection uRLConnection) {
        LogUtil.d("VdsAgent", "openConnection: " + uRLConnection);
        return uRLConnection;
    }

    public static void setWebChromeClient(android.webkit.WebView webView, WebChromeClient webChromeClient) {
        if (a) {
            return;
        }
        webView.setWebChromeClient(webChromeClient);
        webView.setTag(84159239, (Object)webChromeClient);
        if (GConfig.a) {
            LogUtil.d("VdsAgent", "trackWebView: " + (Object)webView + " with client " + (Object)webChromeClient);
        }
        ag.a((View)webView, null);
    }

    public static void setWebChromeClient(WebView webView, com.tencent.smtt.sdk.WebChromeClient webChromeClient) {
        a = true;
        webView.setWebChromeClient(webChromeClient);
        a = false;
        webView.setTag(84159239, (Object)webChromeClient);
        if (GConfig.a) {
            LogUtil.d("VdsAgent", "trackWebView: " + (Object)webView + " with client " + (Object)webChromeClient);
        }
        ag.a((View)webView, null);
    }

    private static void a() {
        q q2 = q.d();
        if (q2 != null) {
            h.a(new a(q2), 500);
        }
    }
}

