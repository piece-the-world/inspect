package com.netease.caipiao.datacollection.activity;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import com.growingio.android.sdk.agent.VdsAgent;
import com.growingio.android.sdk.instrumentation.Instrumented;
import com.netease.caipiao.datacollection.C0268R;
import com.netease.caipiao.datacollection.callback.MyWebViewClient;

public class DemoWebviewActivity extends Activity implements OnClickListener {
    private Button bt1;
    private MyWebViewClient client;
    private EditText et1;
    private WebView wv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0268R.layout.demo_webview_activity);
        this.et1 = (EditText) findViewById(C0268R.id.et1);
        this.bt1 = (Button) findViewById(C0268R.id.bt1);
        this.bt1.setOnClickListener(this);
        initWebview();
    }

    private void initWebview() {
        this.wv = (WebView) findViewById(C0268R.id.wv);
        this.wv.getSettings().setSupportZoom(true);
        this.wv.getSettings().setJavaScriptEnabled(true);
        this.wv.getSettings().setSavePassword(false);
        this.wv.getSettings().setDomStorageEnabled(true);
        if (VERSION.SDK_INT >= 17) {
            this.wv.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        this.wv.getSettings().setGeolocationEnabled(true);
        this.wv.clearCache(false);
        this.wv.getSettings().setBuiltInZoomControls(true);
        this.client = new MyWebViewClient();
        this.wv.setWebViewClient(this.client);
        this.wv.setDownloadListener(null);
        this.wv.loadUrl("http://www.baidu.com");
    }

    @Instrumented
    public void onClick(View view) {
        VdsAgent.onClick(this, view);
        switch (view.getId()) {
            case C0268R.id.bt1 /*2131492945*/:
                if (this.et1.getText() != null) {
                    String url = this.et1.getText().toString();
                    if (!TextUtils.isEmpty(url)) {
                        if (!url.startsWith("http")) {
                            url = "http://" + url;
                        }
                        this.wv.loadUrl(url);
                    }
                }
            default:
        }
    }
}
