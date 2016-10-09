/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.app.Dialog
 *  android.app.DialogFragment
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnKeyListener
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.support.annotation.Nullable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.view.Window
 *  android.webkit.ValueCallback
 *  android.webkit.WebChromeClient
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.growingio.android.sdk.circle;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.growingio.android.sdk.circle.HybridEventEditDialog$HybridCircleContent;
import com.growingio.android.sdk.circle.aj;
import com.growingio.android.sdk.circle.ar;
import com.growingio.android.sdk.circle.as;
import com.growingio.android.sdk.circle.at;
import com.growingio.android.sdk.circle.bd;
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.GrowingIO;
import java.lang.ref.WeakReference;
import java.util.List;

@TargetApi(value=11)
public class HybridEventEditDialog
extends DialogFragment
implements aj {
    private static WebView c;
    private static WeakReference d;
    private static HybridEventEditDialog$HybridCircleContent e;
    WebChromeClient a;
    WebViewClient b;

    public HybridEventEditDialog() {
        this.a = new as(this);
        this.b = new at(this);
        bd.a();
    }

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        String string;
        this.setStyle(0, 16973837);
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.getWindow().setSoftInputMode(18);
        dialog.getWindow().getDecorView().setTag((Object)"DO_NOT_DRAW");
        HybridEventEditDialog.a(dialog.getContext());
        GrowingIO.ignoredView(dialog.getWindow().getDecorView());
        if (savedInstanceState != null && (string = savedInstanceState.getString("circle_content")) != null) {
            e = new HybridEventEditDialog$HybridCircleContent(string);
        }
        dialog.setOnKeyListener((DialogInterface.OnKeyListener)new ar(this));
        c.setWebChromeClient(this.a);
        c.setWebViewClient(this.b);
        return dialog;
    }

    public void onSaveInstanceState(Bundle outState) {
        if (e != null && HybridEventEditDialog.e.b != null) {
            outState.putString("circle_content", HybridEventEditDialog.e.b);
        }
    }

    @SuppressLint(value={"JavascriptInterface"})
    @Nullable
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        d = new WeakReference<HybridEventEditDialog>(this);
        return c;
    }

    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        this.b();
    }

    public void onDestroy() {
        super.onDestroy();
        this.b();
        k k2 = k.e();
        k2.h();
        k2.a((aj)null);
    }

    private void b() {
        if (c != null && this == d.get()) {
            ViewGroup viewGroup;
            if (Build.VERSION.SDK_INT >= 19) {
                c.evaluateJavascript("document.body.style.display = 'none';", null);
            }
            if ((viewGroup = (ViewGroup)c.getParent()) != null) {
                viewGroup.removeView((View)c);
            }
        }
    }

    @SuppressLint(value={"JavascriptInterface"})
    static void a(Context context) {
        if (c == null) {
            c = new WebView(context.getApplicationContext());
            c.getSettings().setJavaScriptEnabled(true);
            c.getSettings().setDomStorageEnabled(true);
            if (Build.VERSION.SDK_INT >= 19) {
                WebView.setWebContentsDebuggingEnabled((boolean)GConfig.DEBUG);
            }
        }
        c.clearHistory();
        c.addJavascriptInterface((Object)e, "_hybrid_circle_content");
        c.loadUrl("https://growing.ufilesec.ucloud.cn/hybrid_circle/circle.html");
    }

    public void a(Activity activity, List list, String string, String string2, Runnable runnable) {
        e = new HybridEventEditDialog$HybridCircleContent(list, activity, string, string2);
        runnable.run();
    }

    @Override
    public void a(String string) {
        if (c != null && Build.VERSION.SDK_INT >= 19) {
            c.evaluateJavascript("_setGrowingIOFullHybridCircleData(" + string + ")", null);
        }
    }

    static /* synthetic */ WebView a() {
        return c;
    }

    static {
        d = new WeakReference<Object>(null);
    }
}

