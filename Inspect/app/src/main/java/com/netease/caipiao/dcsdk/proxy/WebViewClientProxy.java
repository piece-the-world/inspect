package com.netease.caipiao.dcsdk.proxy;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Message;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.netease.caipiao.dcsdk.event.Event;
import com.netease.caipiao.dcsdk.event.EventCache;
import com.netease.caipiao.dcsdk.log.Logger;
import com.netease.caipiao.dcsdk.log.Tags;
import java.lang.ref.WeakReference;

public class WebViewClientProxy extends WebViewClient {
    private String error;
    private String url;
    private WebViewClient webViewClient;
    private final WeakReference<WebView> webViewRef;

    public WeakReference<WebView> getWebViewRef() {
        return this.webViewRef;
    }

    public WebViewClient getWebViewClient() {
        return this.webViewClient;
    }

    public String getError() {
        return this.error;
    }

    public String getUrl() {
        return this.url;
    }

    public WebViewClientProxy(WebViewClient webViewClient, WebView webView) {
        this.webViewClient = webViewClient;
        this.webViewRef = new WeakReference(webView);
    }

    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        Logger.debug(Tags.WEBVIEW_PROXY, "WebViewClientProxy:shouldOverrideUrlLoading;url=%s", url);
        return this.webViewClient.shouldOverrideUrlLoading(view, url);
    }

    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        Logger.debug(Tags.WEBVIEW_PROXY, "WebViewClientProxy:onPageStarted;url=%s", url);
        this.webViewClient.onPageStarted(view, url, favicon);
    }

    public void onPageFinished(WebView view, String url) {
        Logger.debug(Tags.WEBVIEW_PROXY, "WebViewClientProxy:onPageFinished;url=%s", url);
        this.url = url;
        this.webViewClient.onPageFinished(view, url);
        EventCache.getInstance().add(Event.fromWebView(this));
        this.error = null;
    }

    public void onLoadResource(WebView view, String url) {
        this.webViewClient.onLoadResource(view, url);
    }

    public void onPageCommitVisible(WebView view, String url) {
        if (VERSION.SDK_INT >= 23) {
            this.webViewClient.onPageCommitVisible(view, url);
        } else {
            super.onPageCommitVisible(view, url);
        }
    }

    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        return this.webViewClient.shouldInterceptRequest(view, url);
    }

    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        if (VERSION.SDK_INT >= 21) {
            return this.webViewClient.shouldInterceptRequest(view, request);
        }
        return super.shouldInterceptRequest(view, request);
    }

    public void onTooManyRedirects(WebView view, Message cancelMsg, Message continueMsg) {
        this.webViewClient.onTooManyRedirects(view, cancelMsg, continueMsg);
    }

    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        this.error = description;
        Logger.debug(Tags.WEBVIEW_PROXY, "WebViewClientProxy:onReceivedError;errorCode=%d,description=%s,failingUrl=%s", Integer.valueOf(errorCode), description, failingUrl);
        this.webViewClient.onReceivedError(view, errorCode, description, failingUrl);
    }

    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        if (VERSION.SDK_INT >= 23) {
            this.webViewClient.onReceivedError(view, request, error);
        } else {
            super.onReceivedError(view, request, error);
        }
    }

    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        Logger.debug(Tags.WEBVIEW_PROXY, "WebViewClientProxy:onReceivedHttpError;request=%s", request);
        if (VERSION.SDK_INT >= 23) {
            this.webViewClient.onReceivedHttpError(view, request, errorResponse);
        } else {
            super.onReceivedHttpError(view, request, errorResponse);
        }
    }

    public void onFormResubmission(WebView view, Message dontResend, Message resend) {
        this.webViewClient.onFormResubmission(view, dontResend, resend);
    }

    public void doUpdateVisitedHistory(WebView view, String url, boolean isReload) {
        this.webViewClient.doUpdateVisitedHistory(view, url, isReload);
    }

    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        Logger.debug(Tags.WEBVIEW_PROXY, "WebViewClientProxy:onReceivedSslError;error=%s", error);
        this.webViewClient.onReceivedSslError(view, handler, error);
    }

    public void onReceivedClientCertRequest(WebView view, ClientCertRequest request) {
        if (VERSION.SDK_INT >= 21) {
            this.webViewClient.onReceivedClientCertRequest(view, request);
        } else {
            super.onReceivedClientCertRequest(view, request);
        }
    }

    public void onReceivedHttpAuthRequest(WebView view, HttpAuthHandler handler, String host, String realm) {
        this.webViewClient.onReceivedHttpAuthRequest(view, handler, host, realm);
    }

    public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
        return this.webViewClient.shouldOverrideKeyEvent(view, event);
    }

    public void onUnhandledKeyEvent(WebView view, KeyEvent event) {
        this.webViewClient.onUnhandledKeyEvent(view, event);
    }

    public void onUnhandledInputEvent(WebView view, InputEvent event) {
        if (VERSION.SDK_INT >= 21) {
            this.webViewClient.onUnhandledInputEvent(view, event);
        } else {
            super.onUnhandledInputEvent(view, event);
        }
    }

    public void onScaleChanged(WebView view, float oldScale, float newScale) {
        this.webViewClient.onScaleChanged(view, oldScale, newScale);
    }

    public void onReceivedLoginRequest(WebView view, String realm, String account, String args) {
        this.webViewClient.onReceivedLoginRequest(view, realm, account, args);
    }
}
