package com.netease.caipiao.dcsdk.binderhook.notification;

import com.netease.caipiao.dcsdk.binderhook.BaseBinderProxy;
import com.netease.caipiao.dcsdk.binderhook.BaseIInterfaceProxy;
import com.netease.caipiao.dcsdk.log.Logger;
import com.netease.caipiao.dcsdk.log.Tags;
import java.lang.reflect.Method;

public class BinderProxy extends BaseBinderProxy {
    public BinderProxy() {
        super(Tags.NOTIFICATION);
    }

    protected String getIInterfaceClassName() {
        return "android.app.INotificationManager";
    }

    protected BaseIInterfaceProxy getIInterfaceProxy() {
        return new IInterfaceProxy(this.originBinder);
    }

    protected Object OnInvoke(Object proxy, Method method, Object[] args) throws Throwable {
        Logger.debug(Tags.HOOK, "method=%s,BinderProxy:OnInvoke", method.getName());
        return method.invoke(this.originBinder, args);
    }
}
