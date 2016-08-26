package com.netease.caipiao.dcsdk.binderhook;

import android.os.IBinder;
import com.netease.caipiao.dcsdk.log.Logger;
import com.netease.caipiao.dcsdk.log.Tags;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.Map;

public class Hook {
    private static Field cacheField;
    private static Class<?> serviceManager;

    private Hook() {
    }

    public static void hookBinder(BaseBinderProxy binderProxy) {
        if (binderProxy != null && !binderProxy.isHooked()) {
            try {
                if (serviceManager == null) {
                    serviceManager = Class.forName("android.os.ServiceManager");
                }
                binderProxy.setOriginBinder((IBinder) serviceManager.getDeclaredMethod("getService", new Class[]{String.class}).invoke(null, new Object[]{binderProxy.getServiceName()}));
                IBinder hookedBinder = (IBinder) Proxy.newProxyInstance(serviceManager.getClassLoader(), new Class[]{IBinder.class}, binderProxy);
                if (cacheField == null) {
                    cacheField = serviceManager.getDeclaredField("sCache");
                    cacheField.setAccessible(true);
                }
                ((Map) cacheField.get(null)).put(binderProxy.getServiceName(), hookedBinder);
                binderProxy.setHooked(true);
                Logger.debug(Tags.HOOK, "hookBinder %s succeed!", binderProxy.getServiceName());
            } catch (ClassNotFoundException e) {
                Logger.debug(Tags.HOOK, "hookBinder Exception ! %s", e.toString());
            } catch (IllegalAccessException e2) {
                Logger.debug(Tags.HOOK, "hookBinder Exception ! %s", e2.toString());
            } catch (NoSuchFieldException e3) {
                Logger.debug(Tags.HOOK, "hookBinder Exception ! %s", e3.toString());
            } catch (InvocationTargetException e4) {
                Logger.debug(Tags.HOOK, "hookBinder Exception ! %s", e4.toString());
            } catch (NoSuchMethodException e5) {
                Logger.debug(Tags.HOOK, "hookBinder Exception ! %s", e5.toString());
            }
        }
    }

    public static void unhookBinder(BaseBinderProxy binderProxy) {
        if (binderProxy != null && binderProxy.isHooked()) {
            try {
                if (serviceManager == null) {
                    serviceManager = Class.forName("android.os.ServiceManager");
                }
                if (cacheField == null) {
                    cacheField = serviceManager.getDeclaredField("sCache");
                    cacheField.setAccessible(true);
                }
                ((Map) cacheField.get(null)).remove(binderProxy.getServiceName());
                binderProxy.setHooked(false);
                Logger.debug(Tags.HOOK, "unhookBinder %s succeed!", binderProxy.getServiceName());
            } catch (ClassNotFoundException e) {
                Logger.debug(Tags.HOOK, "unhookBinder Exception ! %s", e.toString());
            } catch (IllegalAccessException e2) {
                Logger.debug(Tags.HOOK, "unhookBinder Exception ! %s", e2.toString());
            } catch (NoSuchFieldException e3) {
                Logger.debug(Tags.HOOK, "unhookBinder Exception ! %s", e3.toString());
            }
        }
    }
}
