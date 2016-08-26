package com.netease.caipiao.dcsdk.proxy;

import android.text.TextUtils;
import com.netease.caipiao.dcsdk.log.Logger;
import com.netease.caipiao.dcsdk.log.Tags;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class WebViewProviderProxy implements InvocationHandler {
    private final Object provider;

    public static Object newInstance(Object provider) {
        return Proxy.newProxyInstance(provider.getClass().getClassLoader(), provider.getClass().getInterfaces(), new WebViewProviderProxy(provider));
    }

    private WebViewProviderProxy(Object provider) {
        this.provider = provider;
    }

    public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
        try {
            Logger.debug(Tags.WEBVIEW_PROXY, "WebViewProxy:invoke(); before method %s", m.getName());
            Object result = m.invoke(this.provider, args);
            if (TextUtils.isEmpty(m.getName()) || m.getName().equals("setWebViewClient")) {
                Logger.debug(Tags.WEBVIEW_PROXY, "WebViewProxy:invoke(); after method %s", m.getName());
            } else {
                Logger.debug(Tags.WEBVIEW_PROXY, "WebViewProxy:invoke(); after method %s", m.getName());
            }
            return result;
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (Exception e2) {
            throw new RuntimeException("unexpected invocation exception: " + e2.getMessage());
        } catch (Throwable th) {
            Logger.debug(Tags.WEBVIEW_PROXY, "WebViewProxy:invoke(); after method %s", m.getName());
        }
    }
}
