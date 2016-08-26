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
 *  org.codehaus.groovy.runtime.typehandling.ShortTypeHandling
 */
package com.growingio.android.plugin;

import com.growingio.android.plugin.VdsInstrumentTask;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import java.lang.ref.SoftReference;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;

public class VdsDeinstrumentTask
extends VdsInstrumentTask {
    private static /* synthetic */ ClassInfo $staticClassInfo;
    public static transient /* synthetic */ boolean __$stMC;
    private static /* synthetic */ SoftReference $callSiteArray;

    public VdsDeinstrumentTask() {
        VdsDeinstrumentTask vdsDeinstrumentTask;
        CallSite[] arrcallSite = VdsDeinstrumentTask.$getCallSiteArray();
    }

    @Override
    protected String getAgentArgs() {
        CallSite[] arrcallSite = VdsDeinstrumentTask.$getCallSiteArray();
        return ShortTypeHandling.castToString((Object)arrcallSite[0].call((Object)"deinstrument=1;", arrcallSite[1].callCurrent((GroovyObject)this)));
    }

    @Override
    protected /* synthetic */ MetaClass $getStaticMetaClass() {
        if (this.getClass() != VdsDeinstrumentTask.class) {
            return ScriptBytecodeAdapter.initMetaClass((Object)((Object)this));
        }
        ClassInfo classInfo = $staticClassInfo;
        if (classInfo == null) {
            $staticClassInfo = classInfo = ClassInfo.getClassInfo(this.getClass());
        }
        return classInfo.getMetaClass();
    }

    public /* synthetic */ MetaClass super$4$$getStaticMetaClass() {
        return super.$getStaticMetaClass();
    }

    public /* synthetic */ String super$4$getAgentArgs() {
        return super.getAgentArgs();
    }

    private static /* synthetic */ void $createCallSiteArray_1(String[] arrstring) {
        arrstring[0] = "plus";
        arrstring[1] = "getUserArgs";
    }

    private static /* synthetic */ CallSiteArray $createCallSiteArray() {
        String[] arrstring = new String[2];
        VdsDeinstrumentTask.$createCallSiteArray_1(arrstring);
        return new CallSiteArray((Class)VdsDeinstrumentTask.class, arrstring);
    }

    private static /* synthetic */ CallSite[] $getCallSiteArray() {
        CallSiteArray callSiteArray;
        if ($callSiteArray == null || (callSiteArray = (CallSiteArray)$callSiteArray.get()) == null) {
            callSiteArray = VdsDeinstrumentTask.$createCallSiteArray();
            $callSiteArray = new SoftReference<CallSiteArray>(callSiteArray);
        }
        return callSiteArray.array;
    }
}

