package com.netease.caipiao.dcsdk.binderhook;

import android.os.IBinder;
import com.netease.caipiao.dcsdk.log.Logger;
import com.netease.caipiao.dcsdk.log.Tags;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;

public abstract class BaseIInterfaceProxy implements InvocationHandler {
    protected Object originInterface;
    protected Class stub;

    protected abstract String getStubClassName();

    public BaseIInterfaceProxy(IBinder originBinder) {
        try {
            this.stub = Class.forName(getStubClassName());
            this.originInterface = this.stub.getDeclaredMethod("asInterface", new Class[]{IBinder.class}).invoke(null, new Object[]{originBinder});
        } catch (ClassNotFoundException e) {
            Logger.debug(Tags.HOOK, "BaseIInterfaceProxy Exception ! %s", e.toString());
        } catch (NoSuchMethodException e2) {
            Logger.debug(Tags.HOOK, "BaseIInterfaceProxy Exception ! %s", e2.toString());
        } catch (InvocationTargetException e3) {
            Logger.debug(Tags.HOOK, "BaseIInterfaceProxy Exception ! %s", e3.toString());
        } catch (IllegalAccessException e4) {
            Logger.debug(Tags.HOOK, "BaseIInterfaceProxy Exception ! %s", e4.toString());
        }
    }
}
