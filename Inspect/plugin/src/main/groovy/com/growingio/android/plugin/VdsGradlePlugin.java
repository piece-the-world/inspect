/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  groovy.lang.Closure
 *  groovy.lang.GroovyObject
 *  groovy.lang.MetaClass
 *  groovy.lang.Reference
 *  org.codehaus.groovy.reflection.ClassInfo
 *  org.codehaus.groovy.runtime.GeneratedClosure
 *  org.codehaus.groovy.runtime.ScriptBytecodeAdapter
 *  org.codehaus.groovy.runtime.callsite.CallSite
 *  org.codehaus.groovy.runtime.callsite.CallSiteArray
 *  org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation
 *  org.gradle.api.Plugin
 *  org.gradle.api.Project
 *  org.gradle.language.base.plugins.LifecycleBasePlugin
 */
package com.growingio.android.plugin;

import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.language.base.plugins.LifecycleBasePlugin;

import java.lang.ref.SoftReference;

import groovy.lang.Closure;
import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import groovy.lang.Reference;

public class VdsGradlePlugin
        implements Plugin<Project>,
        GroovyObject {
    private static /* synthetic */ ClassInfo $staticClassInfo;
    public static transient /* synthetic */ boolean __$stMC;
    private transient /* synthetic */ MetaClass metaClass;
    private static /* synthetic */ SoftReference $callSiteArray;

    public VdsGradlePlugin() {
        MetaClass metaClass;
        VdsGradlePlugin vdsGradlePlugin;
        CallSite[] arrcallSite = VdsGradlePlugin.$getCallSiteArray();
        this.metaClass = metaClass = this.$getStaticMetaClass();
    }

    public void apply(Project project) {
        class _apply_closure3
                extends Closure
                implements GeneratedClosure {
            private /* synthetic */ Reference vdsInstrumentTask;
            private /* synthetic */ Reference vdsDeinstrumentTask;
            private static /* synthetic */ ClassInfo $staticClassInfo;
            public static transient /* synthetic */ boolean __$stMC;
            private static /* synthetic */ SoftReference $callSiteArray;

            public _apply_closure3(Object _outerInstance, Object _thisObject, Reference vdsInstrumentTask, Reference vdsDeinstrumentTask) {
                Reference reference;
                Reference reference2;
                CallSite[] arrcallSite = _apply_closure3.$getCallSiteArray();
                super(_outerInstance, _thisObject);
                this.vdsInstrumentTask = reference = vdsInstrumentTask;
                this.vdsDeinstrumentTask = reference2 = vdsDeinstrumentTask;
            }

            public Object doCall(Object task) {
                CallSite[] arrcallSite = _apply_closure3.$getCallSiteArray();
                if (DefaultTypeTransformation.booleanUnbox((Object) arrcallSite[0].call(arrcallSite[1].call(task), (Object) "transformClassesWithDexFor")) || DefaultTypeTransformation.booleanUnbox((Object) arrcallSite[2].call(arrcallSite[3].callGetProperty(task), (Object) "dex"))) {
                    arrcallSite[4].call(task, this.vdsInstrumentTask.get());
                    return arrcallSite[5].call(task, this.vdsDeinstrumentTask.get());
                }
                return null;
            }

            public Object getVdsInstrumentTask() {
                CallSite[] arrcallSite = _apply_closure3.$getCallSiteArray();
                return this.vdsInstrumentTask.get();
            }

            public Object getVdsDeinstrumentTask() {
                CallSite[] arrcallSite = _apply_closure3.$getCallSiteArray();
                return this.vdsDeinstrumentTask.get();
            }

            protected /* synthetic */ MetaClass $getStaticMetaClass() {
                if (this.getClass() != _apply_closure3.class) {
                    return ScriptBytecodeAdapter.initMetaClass((Object) ((Object) this));
                }
                ClassInfo classInfo = $staticClassInfo;
                if (classInfo == null) {
                    $staticClassInfo = classInfo = ClassInfo.getClassInfo(this.getClass());
                }
                return classInfo.getMetaClass();
            }

            private static /* synthetic */ void $createCallSiteArray_1(String[] arrstring) {
                arrstring[0] = "startsWith";
                arrstring[1] = "getName";
                arrstring[2] = "startsWith";
                arrstring[3] = "name";
                arrstring[4] = "dependsOn";
                arrstring[5] = "finalizedBy";
            }

            private static /* synthetic */ CallSiteArray $createCallSiteArray() {
                String[] arrstring = new String[6];
                _apply_closure3.$createCallSiteArray_1(arrstring);
                return new CallSiteArray((Class) _apply_closure3.class, arrstring);
            }

            private static /* synthetic */ CallSite[] $getCallSiteArray() {
                CallSiteArray callSiteArray;
                if ($callSiteArray == null || (callSiteArray = (CallSiteArray) $callSiteArray.get()) == null) {
                    callSiteArray = _apply_closure3.$createCallSiteArray();
                    $callSiteArray = new SoftReference<CallSiteArray>(callSiteArray);
                }
                return callSiteArray.array;
            }
        }
        class _apply_closure2
                extends Closure
                implements GeneratedClosure {
            private static /* synthetic */ ClassInfo $staticClassInfo;
            public static transient /* synthetic */ boolean __$stMC;
            private static /* synthetic */ SoftReference $callSiteArray;

            public _apply_closure2(Object _outerInstance, Object _thisObject) {
                CallSite[] arrcallSite = _apply_closure2.$getCallSiteArray();
                super(_outerInstance, _thisObject);
            }

            public Object doCall(Object it) {
                CallSite[] arrcallSite = _apply_closure2.$getCallSiteArray();
                Object object = arrcallSite[0].callGetProperty((Object) LifecycleBasePlugin.class);
                ScriptBytecodeAdapter.setGroovyObjectProperty((Object) object, (Class) _apply_closure2.class, (GroovyObject) this, (String) "group");
                return object;
            }

            public Object doCall() {
                CallSite[] arrcallSite = _apply_closure2.$getCallSiteArray();
                return this.doCall(null);
            }

            protected /* synthetic */ MetaClass $getStaticMetaClass() {
                if (this.getClass() != _apply_closure2.class) {
                    return ScriptBytecodeAdapter.initMetaClass((Object) ((Object) this));
                }
                ClassInfo classInfo = $staticClassInfo;
                if (classInfo == null) {
                    $staticClassInfo = classInfo = ClassInfo.getClassInfo(this.getClass());
                }
                return classInfo.getMetaClass();
            }

            private static /* synthetic */ void $createCallSiteArray_1(String[] arrstring) {
                arrstring[0] = "BUILD_GROUP";
            }

            private static /* synthetic */ CallSiteArray $createCallSiteArray() {
                String[] arrstring = new String[1];
                _apply_closure2.$createCallSiteArray_1(arrstring);
                return new CallSiteArray((Class) _apply_closure2.class, arrstring);
            }

            private static /* synthetic */ CallSite[] $getCallSiteArray() {
                CallSiteArray callSiteArray;
                if ($callSiteArray == null || (callSiteArray = (CallSiteArray) $callSiteArray.get()) == null) {
                    callSiteArray = _apply_closure2.$createCallSiteArray();
                    $callSiteArray = new SoftReference<CallSiteArray>(callSiteArray);
                }
                return callSiteArray.array;
            }
        }
        class _apply_closure1
                extends Closure
                implements GeneratedClosure {
            private static /* synthetic */ ClassInfo $staticClassInfo;
            public static transient /* synthetic */ boolean __$stMC;
            private static /* synthetic */ SoftReference $callSiteArray;

            public _apply_closure1(Object _outerInstance, Object _thisObject) {
                CallSite[] arrcallSite = _apply_closure1.$getCallSiteArray();
                super(_outerInstance, _thisObject);
            }

            public Object doCall(Object it) {
                CallSite[] arrcallSite = _apply_closure1.$getCallSiteArray();
                Object object = arrcallSite[0].callGetProperty((Object) LifecycleBasePlugin.class);
                ScriptBytecodeAdapter.setGroovyObjectProperty((Object) object, (Class) _apply_closure1.class, (GroovyObject) this, (String) "group");
                return object;
            }

            public Object doCall() {
                CallSite[] arrcallSite = _apply_closure1.$getCallSiteArray();
                return this.doCall(null);
            }

            protected /* synthetic */ MetaClass $getStaticMetaClass() {
                if (this.getClass() != _apply_closure1.class) {
                    return ScriptBytecodeAdapter.initMetaClass((Object) ((Object) this));
                }
                ClassInfo classInfo = $staticClassInfo;
                if (classInfo == null) {
                    $staticClassInfo = classInfo = ClassInfo.getClassInfo(this.getClass());
                }
                return classInfo.getMetaClass();
            }

            private static /* synthetic */ void $createCallSiteArray_1(String[] arrstring) {
                arrstring[0] = "BUILD_GROUP";
            }

            private static /* synthetic */ CallSiteArray $createCallSiteArray() {
                String[] arrstring = new String[1];
                _apply_closure1.$createCallSiteArray_1(arrstring);
                return new CallSiteArray((Class) _apply_closure1.class, arrstring);
            }

            private static /* synthetic */ CallSite[] $getCallSiteArray() {
                CallSiteArray callSiteArray;
                if ($callSiteArray == null || (callSiteArray = (CallSiteArray) $callSiteArray.get()) == null) {
                    callSiteArray = _apply_closure1.$createCallSiteArray();
                    $callSiteArray = new SoftReference<CallSiteArray>(callSiteArray);
                }
                return callSiteArray.array;
            }
        }
        CallSite[] arrcallSite = VdsGradlePlugin.$getCallSiteArray();
        "getCanonicalPath".call("<$constructor$>".callGetProperty((Object) project), (Object) "VdsConfig", (Object) VdsPluginExtension.class);
        Reference vdsInstrumentTask = new Reference(
                "getPath".call((Object) project,
                        (Object) ScriptBytecodeAdapter.createMap((Object[]) new Object[]{"type", VdsInstrumentTask.class}),
                        (Object) "vdsInstrumentTask"));
        "getLocation".call(vdsInstrumentTask.get(), (Object) new _apply_closure1(this, this));
        Reference vdsDeinstrumentTask = new Reference("getCodeSource".call((Object) project, (Object) ScriptBytecodeAdapter.createMap((Object[]) new Object[]{"type", VdsDeinstrumentTask.class}), (Object) "vdsDeinstrumentTask"));
        "getProtectionDomain".call(vdsDeinstrumentTask.get(), (Object) new _apply_closure2(this, this));
        "<$constructor$>".call("<$constructor$>".callGetProperty((Object) project), (Object) new _apply_closure3(this, this, vdsInstrumentTask, vdsDeinstrumentTask));
    }

    protected /* synthetic */ MetaClass $getStaticMetaClass() {
        if (this.getClass() != VdsGradlePlugin.class) {
            return ScriptBytecodeAdapter.initMetaClass((Object) this);
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

    public /* synthetic */ void setProperty(String string, Object object) {
        this.getMetaClass().setProperty((Object) this, string, object);
    }

    private static /* synthetic */ void $createCallSiteArray_1(String[] arrstring) {
        arrstring[0] = "create";
        arrstring[1] = "extensions";
        arrstring[2] = "task";
        arrstring[3] = "configure";
        arrstring[4] = "task";
        arrstring[5] = "configure";
        arrstring[6] = "whenTaskAdded";
        arrstring[7] = "tasks";
    }

    private static /* synthetic */ CallSiteArray $createCallSiteArray() {
        String[] arrstring = new String[8];
        VdsGradlePlugin.$createCallSiteArray_1(arrstring);
        return new CallSiteArray((Class) VdsGradlePlugin.class, arrstring);
    }

    private static /* synthetic */ CallSite[] $getCallSiteArray() {
        CallSiteArray callSiteArray;
        if ($callSiteArray == null || (callSiteArray = (CallSiteArray) $callSiteArray.get()) == null) {
            callSiteArray = VdsGradlePlugin.$createCallSiteArray();
            $callSiteArray = new SoftReference<CallSiteArray>(callSiteArray);
        }
        return callSiteArray.array;
    }

}

