/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.os.Message
 *  android.view.View
 *  android.webkit.WebChromeClient
 *  android.webkit.WebChromeClient$FileChooserParams
 *  com.tencent.smtt.export.external.interfaces.ConsoleMessage
 *  com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback
 *  com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
 *  com.tencent.smtt.export.external.interfaces.IX5WebChromeClient$CustomViewCallback
 *  com.tencent.smtt.export.external.interfaces.JsPromptResult
 *  com.tencent.smtt.export.external.interfaces.JsResult
 *  com.tencent.smtt.sdk.ValueCallback
 *  com.tencent.smtt.sdk.WebChromeClient
 *  com.tencent.smtt.sdk.WebStorage
 *  com.tencent.smtt.sdk.WebStorage$QuotaUpdater
 *  com.tencent.smtt.sdk.WebView
 */
package com.growingio.android.sdk.collection;

import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.webkit.WebChromeClient;
import com.growingio.android.sdk.collection.VdsJsHelper;
import com.tencent.smtt.export.external.interfaces.ConsoleMessage;
import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.export.external.interfaces.JsPromptResult;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.sdk.ValueCallback;
import com.tencent.smtt.sdk.WebChromeClient;
import com.tencent.smtt.sdk.WebStorage;
import com.tencent.smtt.sdk.WebView;

class ap
extends WebChromeClient {
    final /* synthetic */ VdsJsHelper a;

    ap(VdsJsHelper vdsJsHelper) {
        this.a = vdsJsHelper;
    }

    public void onProgressChanged(WebView webView, int i2) {
        String string;
        webView.removeCallbacks((Runnable)this.a);
        if (i2 >= 60 && (string = webView.getUrl()) != null) {
            webView.postDelayed((Runnable)this.a, 1000);
        }
        ((WebChromeClient)VdsJsHelper.d(this.a)).onProgressChanged(webView, i2);
    }

    public void onExceededDatabaseQuota(String var1, String var2, long var3, long var5, long var7, WebStorage.QuotaUpdater var9) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onExceededDatabaseQuota(var1, var2, var3, var5, var7, var9);
        var9.updateQuota(var5);
    }

    public Bitmap getDefaultVideoPoster() {
        return ((WebChromeClient)VdsJsHelper.d(this.a)).getDefaultVideoPoster();
    }

    public void getVisitedHistory(ValueCallback var1) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).getVisitedHistory(var1);
    }

    public boolean onConsoleMessage(ConsoleMessage var1) {
        return ((WebChromeClient)VdsJsHelper.d(this.a)).onConsoleMessage(var1);
    }

    public boolean onCreateWindow(WebView var1, boolean var2, boolean var3, Message var4) {
        return ((WebChromeClient)VdsJsHelper.d(this.a)).onCreateWindow(var1, var2, var3, var4);
    }

    public void onGeolocationPermissionsHidePrompt() {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onGeolocationPermissionsHidePrompt();
    }

    public void onGeolocationPermissionsShowPrompt(String var1, GeolocationPermissionsCallback var2) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onGeolocationPermissionsShowPrompt(var1, var2);
    }

    public void onHideCustomView() {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onHideCustomView();
    }

    public boolean onJsAlert(WebView var1, String var2, String var3, JsResult var4) {
        return ((WebChromeClient)VdsJsHelper.d(this.a)).onJsAlert(var1, var2, var3, var4);
    }

    public boolean onJsConfirm(WebView var1, String var2, String var3, JsResult var4) {
        return ((WebChromeClient)VdsJsHelper.d(this.a)).onJsConfirm(var1, var2, var3, var4);
    }

    public boolean onJsPrompt(WebView var1, String var2, String var3, String var4, JsPromptResult var5) {
        return ((WebChromeClient)VdsJsHelper.d(this.a)).onJsPrompt(var1, var2, var3, var4, var5);
    }

    public boolean onJsBeforeUnload(WebView var1, String var2, String var3, JsResult var4) {
        return ((WebChromeClient)VdsJsHelper.d(this.a)).onJsBeforeUnload(var1, var2, var3, var4);
    }

    public boolean onJsTimeout() {
        return ((WebChromeClient)VdsJsHelper.d(this.a)).onJsTimeout();
    }

    public void onReachedMaxAppCacheSize(long var1, long var3, WebStorage.QuotaUpdater var5) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onReachedMaxAppCacheSize(var1, var3, var5);
    }

    public void onReceivedIcon(WebView var1, Bitmap var2) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onReceivedIcon(var1, var2);
    }

    public void onReceivedTouchIconUrl(WebView var1, String var2, boolean var3) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onReceivedTouchIconUrl(var1, var2, var3);
    }

    public void onReceivedTitle(WebView var1, String var2) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onReceivedTitle(var1, var2);
    }

    public void onRequestFocus(WebView var1) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onRequestFocus(var1);
    }

    public void onShowCustomView(View var1, IX5WebChromeClient.CustomViewCallback var2) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onShowCustomView(var1, var2);
    }

    public void onShowCustomView(View var1, int var2, IX5WebChromeClient.CustomViewCallback var3) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onShowCustomView(var1, var2, var3);
    }

    public void onCloseWindow(WebView var1) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onCloseWindow(var1);
    }

    public View getVideoLoadingProgressView() {
        return ((WebChromeClient)VdsJsHelper.d(this.a)).getVideoLoadingProgressView();
    }

    public void openFileChooser(ValueCallback var1, String var2, String var3) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).openFileChooser(var1, var2, var3);
    }

    public boolean onShowFileChooser(WebView var1, ValueCallback var2, WebChromeClient.FileChooserParams var3) {
        return ((WebChromeClient)VdsJsHelper.d(this.a)).onShowFileChooser(var1, var2, var3);
    }
}

