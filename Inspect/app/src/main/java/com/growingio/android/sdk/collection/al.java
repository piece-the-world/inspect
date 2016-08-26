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

class al
extends WebChromeClient {
    final /* synthetic */ VdsJsHelper a;

    al(VdsJsHelper vdsJsHelper) {
        this.a = vdsJsHelper;
    }

    public void onProgressChanged(WebView webView, int n2) {
        String string;
        webView.removeCallbacks((Runnable)this.a);
        if (n2 >= 60 && (string = webView.getUrl()) != null) {
            webView.postDelayed((Runnable)this.a, 1000);
        }
        ((WebChromeClient)VdsJsHelper.d(this.a)).onProgressChanged(webView, n2);
    }

    public void onExceededDatabaseQuota(String string, String string2, long l2, long l3, long l4, WebStorage.QuotaUpdater quotaUpdater) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onExceededDatabaseQuota(string, string2, l2, l3, l4, quotaUpdater);
        quotaUpdater.updateQuota(l3);
    }

    public Bitmap getDefaultVideoPoster() {
        return ((WebChromeClient)VdsJsHelper.d(this.a)).getDefaultVideoPoster();
    }

    public void getVisitedHistory(ValueCallback valueCallback) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).getVisitedHistory(valueCallback);
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return ((WebChromeClient)VdsJsHelper.d(this.a)).onConsoleMessage(consoleMessage);
    }

    public boolean onCreateWindow(WebView webView, boolean bl2, boolean bl3, Message message) {
        return ((WebChromeClient)VdsJsHelper.d(this.a)).onCreateWindow(webView, bl2, bl3, message);
    }

    public void onGeolocationPermissionsHidePrompt() {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onGeolocationPermissionsHidePrompt();
    }

    public void onGeolocationPermissionsShowPrompt(String string, GeolocationPermissionsCallback geolocationPermissionsCallback) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onGeolocationPermissionsShowPrompt(string, geolocationPermissionsCallback);
    }

    public void onHideCustomView() {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onHideCustomView();
    }

    public boolean onJsAlert(WebView webView, String string, String string2, JsResult jsResult) {
        return ((WebChromeClient)VdsJsHelper.d(this.a)).onJsAlert(webView, string, string2, jsResult);
    }

    public boolean onJsConfirm(WebView webView, String string, String string2, JsResult jsResult) {
        return ((WebChromeClient)VdsJsHelper.d(this.a)).onJsConfirm(webView, string, string2, jsResult);
    }

    public boolean onJsPrompt(WebView webView, String string, String string2, String string3, JsPromptResult jsPromptResult) {
        return ((WebChromeClient)VdsJsHelper.d(this.a)).onJsPrompt(webView, string, string2, string3, jsPromptResult);
    }

    public boolean onJsBeforeUnload(WebView webView, String string, String string2, JsResult jsResult) {
        return ((WebChromeClient)VdsJsHelper.d(this.a)).onJsBeforeUnload(webView, string, string2, jsResult);
    }

    public boolean onJsTimeout() {
        return ((WebChromeClient)VdsJsHelper.d(this.a)).onJsTimeout();
    }

    public void onReachedMaxAppCacheSize(long l2, long l3, WebStorage.QuotaUpdater quotaUpdater) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onReachedMaxAppCacheSize(l2, l3, quotaUpdater);
    }

    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onReceivedIcon(webView, bitmap);
    }

    public void onReceivedTouchIconUrl(WebView webView, String string, boolean bl2) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onReceivedTouchIconUrl(webView, string, bl2);
    }

    public void onReceivedTitle(WebView webView, String string) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onReceivedTitle(webView, string);
    }

    public void onRequestFocus(WebView webView) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onRequestFocus(webView);
    }

    public void onShowCustomView(View view, IX5WebChromeClient.CustomViewCallback customViewCallback) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onShowCustomView(view, customViewCallback);
    }

    public void onShowCustomView(View view, int n2, IX5WebChromeClient.CustomViewCallback customViewCallback) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onShowCustomView(view, n2, customViewCallback);
    }

    public void onCloseWindow(WebView webView) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).onCloseWindow(webView);
    }

    public View getVideoLoadingProgressView() {
        return ((WebChromeClient)VdsJsHelper.d(this.a)).getVideoLoadingProgressView();
    }

    public void openFileChooser(ValueCallback valueCallback, String string, String string2) {
        ((WebChromeClient)VdsJsHelper.d(this.a)).openFileChooser(valueCallback, string, string2);
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return ((WebChromeClient)VdsJsHelper.d(this.a)).onShowFileChooser(webView, valueCallback, fileChooserParams);
    }
}

