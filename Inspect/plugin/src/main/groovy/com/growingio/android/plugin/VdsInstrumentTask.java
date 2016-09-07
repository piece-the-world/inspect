/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  com.growingio.agent.compile.VdsRewriterAgent
 *  com.sun.tools.attach.VirtualMachine
 *  groovy.lang.GroovyObject
 *  groovy.lang.MetaClass
 *  org.codehaus.groovy.reflection.ClassInfo
 *  org.codehaus.groovy.runtime.BytecodeInterface8
 *  org.codehaus.groovy.runtime.ScriptBytecodeAdapter
 *  org.codehaus.groovy.runtime.callsite.CallSite
 *  org.codehaus.groovy.runtime.callsite.CallSiteArray
 *  org.codehaus.groovy.runtime.typehandling.ShortTypeHandling
 *  org.gradle.api.DefaultTask
 *  org.gradle.api.tasks.TaskAction
 */
package com.growingio.android.plugin;

import com.growingio.agent.compile.VdsRewriterAgent;
import com.sun.tools.attach.VirtualMachine;

import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.ref.SoftReference;
import java.net.URISyntaxException;
import java.util.Properties;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;

public class VdsInstrumentTask
        extends DefaultTask
        implements GroovyObject {
    private static /* synthetic */ ClassInfo $staticClassInfo;
    public static transient /* synthetic */ boolean __$stMC;
    private transient /* synthetic */ MetaClass metaClass;
    private static /* synthetic */ SoftReference $callSiteArray;

    public VdsInstrumentTask() {
        MetaClass metaClass;
        VdsInstrumentTask vdsInstrumentTask;
        CallSite[] arrcallSite = VdsInstrumentTask.$getCallSiteArray();
        this.metaClass = metaClass = this.$getStaticMetaClass();
    }

    protected String getJarPath() {
        CallSite[] arrcallSite = VdsInstrumentTask.$getCallSiteArray();
        String string = ShortTypeHandling.castToString((Object) arrcallSite[0].call(arrcallSite[1].callConstructor((Object) File.class, arrcallSite[2].call(arrcallSite[3].call(arrcallSite[4].call(arrcallSite[5].call((Object) VdsRewriterAgent.class)))))));
        try {
            return string;
        } catch (URISyntaxException ex) {
            throw (Throwable) arrcallSite[6].callConstructor((Object) RuntimeException.class, (Object) ex);
        } catch (IOException ex) {
            throw (Throwable) arrcallSite[7].callConstructor((Object) RuntimeException.class, (Object) ex);
        }
    }

    protected String getJarPath() {
        CallSite[] arrcallSite = VdsInstrumentTask.$getCallSiteArray();
        String string = ShortTypeHandling.castToString((Object) "getCanonicalPath".call("<$constructor$>".callConstructor((Object) File.class, "getPath".call("getLocation".call("getCodeSource".call("getProtectionDomain".call((Object) VdsRewriterAgent.class)))))));
        try {
            return string;
        } catch (URISyntaxException ex) {
            throw (Throwable) "<$constructor$>".callConstructor((Object) RuntimeException.class, (Object) ex);
        } catch (IOException ex) {
            throw (Throwable) "<$constructor$>".callConstructor((Object) RuntimeException.class, (Object) ex);
        }
    }


    protected String getUserArgs() {
        CallSite[] arrcallSite = VdsInstrumentTask.$getCallSiteArray();
        Properties properties = (Properties) ScriptBytecodeAdapter.castToType((Object) arrcallSite[8].callConstructor((Object) Properties.class), (Class) Properties.class);
        arrcallSite[9].call((Object) properties, arrcallSite[10].callConstructor((Object) FileInputStream.class, arrcallSite[11].call(arrcallSite[12].callGetProperty(arrcallSite[13].callGroovyObjectGetProperty((Object) this)), (Object) "growingio.properties")));
        String string = ShortTypeHandling.castToString((Object) arrcallSite[14].call((Object) "gradle=1;", arrcallSite[15].call((Object) properties, (Object) "VDS.AgentArgs")));
        try {
            return string;
        } catch (Exception ex) {
            arrcallSite[16].call(arrcallSite[17].callGroovyObjectGetProperty((Object) this), (Object) "growingio.properties not found", (Object) ex);
        }
        return "gradle=1;";
    }

    protected String getAgentArgs() {
        CallSite[] arrcallSite = VdsInstrumentTask.$getCallSiteArray();
        if (__$stMC || BytecodeInterface8.disabledStandardMetaClass()) {
            return ShortTypeHandling.castToString((Object) arrcallSite[18].call((Object) "instrument=1;", arrcallSite[19].callCurrent((GroovyObject) this)));
        }
        return ShortTypeHandling.castToString((Object) arrcallSite[20].call((Object) "instrument=1;", (Object) this.getUserArgs()));
    }

    protected String getAgentArgs() {
        CallSite[] arrcallSite = VdsInstrumentTask.$getCallSiteArray();
        if (__$stMC || BytecodeInterface8.disabledStandardMetaClass()) {
            return ShortTypeHandling.castToString((Object) "plus".call((Object) "instrument=1;", "getUserArgs".callCurrent((GroovyObject) this)));
        }
        return ShortTypeHandling.castToString((Object) "plus".call((Object) "instrument=1;", (Object) this.getUserArgs()));
    }

    @TaskAction
    public void addVdsAgent() {
        Object object;
        CallSite[] arrcallSite = VdsInstrumentTask.$getCallSiteArray();
        Object name = arrcallSite[21].call(arrcallSite[22].call((Object) ManagementFactory.class));
        name = object = arrcallSite[23].call(name, (Object) 0, arrcallSite[24].call(name, (Object) "@"));
        arrcallSite[25].call(arrcallSite[26].callGroovyObjectGetProperty((Object) this), arrcallSite[27].call(arrcallSite[28].call(arrcallSite[29].call((Object) "attaching process ", name), (Object) " from "), arrcallSite[30].call((Object) ManagementFactory.class)));
        VirtualMachine vm = (VirtualMachine) ScriptBytecodeAdapter.castToType((Object) arrcallSite[31].call((Object) VirtualMachine.class, name), (Class) VirtualMachine.class);
        if (__$stMC || BytecodeInterface8.disabledStandardMetaClass()) {
            arrcallSite[32].call((Object) vm, arrcallSite[33].callCurrent((GroovyObject) this), arrcallSite[34].callCurrent((GroovyObject) this));
        } else {
            arrcallSite[35].call((Object) vm, (Object) this.getJarPath(), (Object) this.getAgentArgs());
        }
        arrcallSite[36].call((Object) vm);
    }

    public void addVdsAgent() {
        Object object;
        CallSite[] arrcallSite = VdsInstrumentTask.$getCallSiteArray();
        Object name = "getName".call("getRuntimeMXBean".call((Object) ManagementFactory.class));
        name = object = "substring".call(name, (Object) 0, "indexOf".call(name, (Object) "@"));
        "debug".call("logger".callGroovyObjectGetProperty((Object) this), "plus".call("plus".call("plus".call((Object) "attaching process ", name), (Object) " from "), "getRuntimeMXBean".call((Object) ManagementFactory.class)));
        VirtualMachine vm = (VirtualMachine) ScriptBytecodeAdapter.castToType((Object) "attach".call((Object) VirtualMachine.class, name), (Class) VirtualMachine.class);
        if (__$stMC || BytecodeInterface8.disabledStandardMetaClass()) {
            "loadAgent".call((Object) vm, "getJarPath".callCurrent((GroovyObject) this), "getAgentArgs".callCurrent((GroovyObject) this));
        } else {
            "loadAgent".call((Object) vm, (Object) this.getJarPath(), (Object) this.getAgentArgs());
        }
        "detach".call((Object) vm);
    }


    protected /* synthetic */ MetaClass $getStaticMetaClass() {
        if (this.getClass() != VdsInstrumentTask.class) {
            return ScriptBytecodeAdapter.initMetaClass((Object) ((Object) this));
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
        return this.getMetaClass().invokeMethod((Object) this, string, object);
    }

    public /* synthetic */ Object getProperty(String string) {
        return this.getMetaClass().getProperty((Object) this, string);
    }

    private static /* synthetic */ void $createCallSiteArray_1(String[] arrstring) {
        arrstring[0] = "getCanonicalPath";
        arrstring[1] = "<$constructor$>";
        arrstring[2] = "getPath";
        arrstring[3] = "getLocation";
        arrstring[4] = "getCodeSource";
        arrstring[5] = "getProtectionDomain";
        arrstring[6] = "<$constructor$>";
        arrstring[7] = "<$constructor$>";
        arrstring[8] = "<$constructor$>";
        arrstring[9] = "load";
        arrstring[10] = "<$constructor$>";
        arrstring[11] = "file";
        arrstring[12] = "rootProject";
        arrstring[13] = "project";
        arrstring[14] = "plus";
        arrstring[15] = "getProperty";
        arrstring[16] = "debug";
        arrstring[17] = "logger";
        arrstring[18] = "plus";
        arrstring[19] = "getUserArgs";
        arrstring[20] = "plus";
        arrstring[21] = "getName";
        arrstring[22] = "getRuntimeMXBean";
        arrstring[23] = "substring";
        arrstring[24] = "indexOf";
        arrstring[25] = "debug";
        arrstring[26] = "logger";
        arrstring[27] = "plus";
        arrstring[28] = "plus";
        arrstring[29] = "plus";
        arrstring[30] = "getRuntimeMXBean";
        arrstring[31] = "attach";
        arrstring[32] = "loadAgent";
        arrstring[33] = "getJarPath";
        arrstring[34] = "getAgentArgs";
        arrstring[35] = "loadAgent";
        arrstring[36] = "detach";
    }

    private static /* synthetic */ CallSiteArray $createCallSiteArray() {
        String[] arrstring = new String[37];
        VdsInstrumentTask.$createCallSiteArray_1(arrstring);
        return new CallSiteArray((Class) VdsInstrumentTask.class, arrstring);
    }

    private static /* synthetic */ CallSite[] $getCallSiteArray() {
        CallSiteArray callSiteArray;
        if ($callSiteArray == null || (callSiteArray = (CallSiteArray) $callSiteArray.get()) == null) {
            callSiteArray = VdsInstrumentTask.$createCallSiteArray();
            $callSiteArray = new SoftReference<CallSiteArray>(callSiteArray);
        }
        return callSiteArray.array;
    }
}

