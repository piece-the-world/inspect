package com.netease.caipiao.datacollection.callback;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.netease.caipiao.datacollection.log.AppLog;
import com.netease.caipiao.datacollection.log.LogTags;

public class MyWebViewClient extends WebViewClient {
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        AppLog.debug(LogTags.WEB_VIEW, "onPageStarted:url=%s", url);
        super.onPageStarted(view, url, favicon);
    }

    public void onPageFinished(WebView view, String url) {
        AppLog.debug(LogTags.WEB_VIEW, "onPageFinished:url=%s", url);
        super.onPageFinished(view, url);
    }

    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        AppLog.debug(LogTags.WEB_VIEW, "shouldOverrideUrlLoading:url=%s", url);
        return super.shouldOverrideUrlLoading(view, url);
    }

    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        AppLog.debug(LogTags.WEB_VIEW, "onReceivedError:errorCode=%d,description=%s,failingUrl=%s", Integer.valueOf(errorCode), description, failingUrl);
        super.onReceivedError(view, errorCode, description, failingUrl);
    }
}
