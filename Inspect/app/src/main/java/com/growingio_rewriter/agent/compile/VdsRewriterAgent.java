/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.d.a.f;
import com.growingio.d.a.u;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.instrument.ClassDefinition;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarInputStream;

public class VdsRewriterAgent {
    private static final String b = "com/android/ant/DexExecTask";
    static final String a = "com/android/dx/command/dexer/Main";
    private static final String c = "growingio.instrumentation.disabled";
    private static final Set<String> d = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList("dx", "dx.bat")));
    private static final String[] e = new String[]{"com/growingio/android/sdk/"};
    private static final Class f = SecurityManager.class;
    private static final String g = "packageAccessLock";
    private static final Set<String> h = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList("java", "java.exe")));
    private static final String i = "com/jayway/maven/plugins/android/phase08preparepackage/DexMojo";
    private static final String j = "preDexLibraries";
    private static final String k = "PRINT_TO_INFO_LOG";
    private static final String l = "java/lang/ProcessBuilder";
    private static final String m = "processClass";
    private static final String n = "SET_INSTRUMENTATION_DISABLED_FLAG";
    private static final String o = "start";
    public static u CollectorClassType = u.b("com/growingio/android/sdk/agent/VdsAgent");
    public static String VERSION;
    private static Map<String, String> p;
    public static boolean instrumentationDisabled;

    public static void agentmain(String string, Instrumentation instrumentation) {
        VdsRewriterAgent.premain(string, instrumentation);
    }

    public static String getVersion()

    `

    {
        return VERSION;
    }

    public static Map<String, String> getAgentOptions() {
        return p;
    }

    public static void premain(String string, Instrumentation instrumentation) {
        Object object;
        Throwable throwable = null;
        try {
            p = VdsRewriterAgent.a(string);
        }
        catch (Throwable var4_3) {
            throwable = var4_3;
        }
        String string2 = p.get("logfile");
        m m2 = string2 == null ? new r(p) : new i(p, string2);
        if (throwable != null) {
            m2.b("Agent args error: " + string, throwable);
        }
        try {
            m2.a("Rewriter jar path: " + VdsRewriterAgent.f());
            object = new JarInputStream(new FileInputStream(VdsRewriterAgent.f()));
            VERSION = object.getManifest().getMainAttributes().getValue("VDS-Version");
        }
        catch (FileNotFoundException var5_7) {
            m2.a("", var5_7);
            throw new IllegalStateException("Can not access jar file");
        }
        catch (Exception var5_8) {
            m2.a("", var5_8);
            throw new IllegalStateException("VDS-Version missed in Manifest. " + var5_8.getMessage());
        }
        m2.d("Bootstrapping GrowingIO Android class rewriter, version: " + VERSION);
        object = ManagementFactory.getRuntimeMXBean().getName();
        m2.d("Agent running in process " + object.substring(0, object.indexOf(64)) + " arguments: " + string);
        try {
            S s2;
            if (p.containsKey("gradle")) {
                if (p.containsKey("instrument")) {
                    m2.a("instrumenting with gradle...");
                    instrumentationDisabled = false;
                    s2 = new M(m2);
                    VdsRewriterAgent.a(m2);
                } else {
                    instrumentationDisabled = true;
                    s2 = new aa(null);
                }
            } else if (p.containsKey("deinstrument")) {
                s2 = new aa(null);
            } else {
                m2.a("instrumenting with ant...");
                s2 = new M(m2);
                VdsRewriterAgent.a(m2);
            }
            instrumentation.addTransformer(s2, true);
            ArrayList<Class> arrayList = new ArrayList<Class>();
            for (Class class_ : instrumentation.getAllLoadedClasses()) {
                if (!s2.a(class_)) continue;
                arrayList.add(class_);
            }
            if (!arrayList.isEmpty()) {
                if (instrumentation.isRetransformClassesSupported()) {
                    instrumentation.retransformClasses(arrayList.toArray(new Class[arrayList.size()]));
                } else {
                    m2.c("Unable to retransform classes: " + arrayList);
                }
            }
            if (s2 instanceof M) {
                VdsRewriterAgent.a(instrumentation, s2, ProcessBuilder.class);
            }
        }
        catch (Throwable var6_10) {
            m2.b("Agent startup error", var6_10);
            RuntimeException runtimeException = new RuntimeException(var6_10);
        }
    }

    private static void a(Instrumentation instrumentation, ClassFileTransformer classFileTransformer, Class<?> class_) throws IOException, IllegalClassFormatException, ClassNotFoundException, UnmodifiableClassException {
        String string = class_.getName().replace('.', '/');
        InputStream inputStream = (class_.getClassLoader() == null ? VdsRewriterAgent.class.getClassLoader() : class_.getClassLoader()).getResourceAsStream(string + ".class");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        com.growingio.agent.a.n.a(inputStream, byteArrayOutputStream);
        inputStream.close();
        instrumentation.redefineClasses(new ClassDefinition(class_, classFileTransformer.transform(class_.getClassLoader(), string, class_, null, byteArrayOutputStream.toByteArray())));
    }

    private static Map<String, String> a(String string) {
        if (string == null) {
            return Collections.emptyMap();
        }
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (String string2 : string.split(";")) {
            String[] arrstring = string2.split("=");
            if (arrstring.length == 2) {
                hashMap.put(arrstring[0], arrstring[1]);
                continue;
            }
            throw new IllegalArgumentException("Invalid argument: " + string2);
        }
        return hashMap;
    }

    private static f d(f f2, m m2) {
        return new a(m2, f2, new s());
    }

    private static f e(f f2, m m2) {
        String string = "VdsAgentFile";
        v v2 = new v();
        return new C(m2, f2, v2);
    }

    private static f f(f f2, m m2) {
        D d2 = new D(327680, f2);
        return d2;
    }

    private static f b(f f2, m m2, String string) {
        G g2 = new G(string);
        return new a(m2, f2, g2);
    }

    private static String f() throws URISyntaxException {
        return new File(VdsRewriterAgent.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getAbsolutePath();
    }

    private static void a(m m2) throws Exception {
        Field field = f.getDeclaredField("packageAccessLock");
        field.setAccessible(true);
        Field field2 = Field.class.getDeclaredField("modifiers");
        field2.setAccessible(true);
        field2.setInt(field, field.getModifiers() & -17);
        if (field.get(null) instanceof T) {
            m2.a("Detected cached instrumentation.");
        } else {
            field.set(null, new T(m2));
        }
    }

    private static String b(String string, String string2) {
        return string + "." + string2;
    }

    static /* synthetic */ Class a() {
        return f;
    }

    static /* synthetic */ String b() throws URISyntaxException {
        return VdsRewriterAgent.f();
    }

    static /* synthetic */ f a(f f2, m m2) {
        return VdsRewriterAgent.d(f2, m2);
    }

    static /* synthetic */ f b(f f2, m m2) {
        return VdsRewriterAgent.e(f2, m2);
    }

    static /* synthetic */ f a(f f2, m m2, String string) {
        return VdsRewriterAgent.b(f2, m2, string);
    }

    static /* synthetic */ f c(f f2, m m2) {
        return VdsRewriterAgent.f(f2, m2);
    }

    static /* synthetic */ String a(String string, String string2) {
        return VdsRewriterAgent.b(string, string2);
    }

    static /* synthetic */ Set c() {
        return d;
    }

    static /* synthetic */ Set d() {
        return h;
    }

    static /* synthetic */ String[] e() {
        return e;
    }

    static {
        p = Collections.emptyMap();
        instrumentationDisabled = false;
    }
}

