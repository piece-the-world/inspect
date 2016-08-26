package com.netease.caipiao.dcsdk.binderhook;

import android.os.IBinder;
import android.os.IInterface;
import com.netease.caipiao.dcsdk.log.Logger;
import com.netease.caipiao.dcsdk.log.Tags;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public abstract class BaseBinderProxy implements InvocationHandler {
    private boolean hooked;
    protected Class iinterface;
    protected IBinder originBinder;
    private String serviceName;

    protected abstract Object OnInvoke(Object obj, Method method, Object[] objArr) throws Throwable;

    protected abstract String getIInterfaceClassName();

    protected abstract BaseIInterfaceProxy getIInterfaceProxy();

    public BaseBinderProxy(String mServiceName) {
        this.hooked = false;
        this.serviceName = mServiceName;
        try {
            this.iinterface = Class.forName(getIInterfaceClassName());
        } catch (ClassNotFoundException e) {
            Logger.debug(Tags.HOOK, "BaseBinderProxy Exception ! %s", e.toString());
        }
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Logger.debug(Tags.HOOK, "BaseBinderProxy:invoke; method=%s,", method.getName());
        if (!"queryLocalInterface".equals(method.getName()) || this.iinterface == null) {
            return OnInvoke(proxy, method, args);
        }
        return Proxy.newProxyInstance(proxy.getClass().getClassLoader(), new Class[]{IBinder.class, IInterface.class, this.iinterface}, getIInterfaceProxy());
    }

    public void setOriginBinder(IBinder originBinder) {
        this.originBinder = originBinder;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public boolean isHooked() {
        return this.hooked;
    }

    public void setHooked(boolean hooked) {
        this.hooked = hooked;
    }
}
