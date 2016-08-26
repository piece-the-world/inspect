/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  groovy.lang.GroovyObject
 *  groovy.lang.MetaClass
 *  org.codehaus.groovy.reflection.ClassInfo
 *  org.codehaus.groovy.runtime.ScriptBytecodeAdapter
 *  org.codehaus.groovy.runtime.callsite.CallSite
 *  org.codehaus.groovy.runtime.callsite.CallSiteArray
 */
package com.growingio.android.plugin;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

public class VdsPluginExtension
implements GroovyObject {
    private String version;
    private String arguments;
    private String projectId;
    private String urlScheme;
    private String channel;
    private double sampling;
    private boolean disabled;
    private boolean disableImpression;
    private boolean throttle;
    private boolean trackWebView;
    private boolean debugMode;
    private boolean testMode;
    private boolean diagnose;
    private long flushInterval;
    private long cellularDataLimit;
    private static /* synthetic */ ClassInfo $staticClassInfo;
    public static transient /* synthetic */ boolean __$stMC;
    private transient /* synthetic */ MetaClass metaClass;
    private static /* synthetic */ SoftReference $callSiteArray;

    public VdsPluginExtension() {
        MetaClass metaClass;
        VdsPluginExtension vdsPluginExtension;
        CallSite[] arrcallSite = VdsPluginExtension.$getCallSiteArray();
        this.metaClass = metaClass = this.$getStaticMetaClass();
    }

    protected /* synthetic */ MetaClass $getStaticMetaClass() {
        if (this.getClass() != VdsPluginExtension.class) {
            return ScriptBytecodeAdapter.initMetaClass((Object)this);
        }
        ClassInfo classInfo = $staticClassInfo;
        if (classInfo == null) {
            $staticClassInfo = classInfo = ClassInfo.getClassInfo(this.getClass());
        }
        return classInfo.getMetaClass();
    }

    public /* synthetic */ MetaClass getMetaClass() {
        MetaClass metaClass = this.metaClass;
        if (metaClass != null) {
            return metaClass;
        }
        this.metaClass = this.$getStaticMetaClass();
        return this.metaClass;
    }

    public /* synthetic */ void setMetaClass(MetaClass metaClass) {
        this.metaClass = metaClass;
    }

    public /* synthetic */ Object invokeMethod(String string, Object object) {
        return this.getMetaClass().invokeMethod((Object)this, string, object);
    }

    public /* synthetic */ Object getProperty(String string) {
        return this.getMetaClass().getProperty((Object)this, string);
    }

    public /* synthetic */ void setProperty(String string, Object object) {
        this.getMetaClass().setProperty((Object)this, string, object);
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String string) {
        this.version = string;
    }

    public String getArguments() {
        return this.arguments;
    }

    public void setArguments(String string) {
        this.arguments = string;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String string) {
        this.projectId = string;
    }

    public String getUrlScheme() {
        return this.urlScheme;
    }

    public void setUrlScheme(String string) {
        this.urlScheme = string;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String string) {
        this.channel = string;
    }

    public double getSampling() {
        return this.sampling;
    }

    public void setSampling(double d) {
        this.sampling = d;
    }

    public boolean getDisabled() {
        return this.disabled;
    }

    public boolean isDisabled() {
        return this.disabled;
    }

    public void setDisabled(boolean bl) {
        this.disabled = bl;
    }

    public boolean getDisableImpression() {
        return this.disableImpression;
    }

    public boolean isDisableImpression() {
        return this.disableImpression;
    }

    public void setDisableImpression(boolean bl) {
        this.disableImpression = bl;
    }

    public boolean getThrottle() {
        return this.throttle;
    }

    public boolean isThrottle() {
        return this.throttle;
    }

    public void setThrottle(boolean bl) {
        this.throttle = bl;
    }

    public boolean getTrackWebView() {
        return this.trackWebView;
    }

    public boolean isTrackWebView() {
        return this.trackWebView;
    }

    public void setTrackWebView(boolean bl) {
        this.trackWebView = bl;
    }

    public boolean getDebugMode() {
        return this.debugMode;
    }

    public boolean isDebugMode() {
        return this.debugMode;
    }

    public void setDebugMode(boolean bl) {
        this.debugMode = bl;
    }

    public boolean getTestMode() {
        return this.testMode;
    }

    public boolean isTestMode() {
        return this.testMode;
    }

    public void setTestMode(boolean bl) {
        this.testMode = bl;
    }

    public boolean getDiagnose() {
        return this.diagnose;
    }

    public boolean isDiagnose() {
        return this.diagnose;
    }

    public void setDiagnose(boolean bl) {
        this.diagnose = bl;
    }

    public long getFlushInterval() {
        return this.flushInterval;
    }

    public void setFlushInterval(long l) {
        this.flushInterval = l;
    }

    public long getCellularDataLimit() {
        return this.cellularDataLimit;
    }

    public void setCellularDataLimit(long l) {
        this.cellularDataLimit = l;
    }

    private static /* synthetic */ CallSiteArray $createCallSiteArray() {
        String[] arrstring = new String[]{};
        return new CallSiteArray((Class)VdsPluginExtension.class, arrstring);
    }

    private static /* synthetic */ CallSite[] $getCallSiteArray() {
        CallSiteArray callSiteArray;
        if ($callSiteArray == null || (callSiteArray = (CallSiteArray)$callSiteArray.get()) == null) {
            callSiteArray = VdsPluginExtension.$createCallSiteArray();
            $callSiteArray = new SoftReference<CallSiteArray>(callSiteArray);
        }
        return callSiteArray.array;
    }
}

