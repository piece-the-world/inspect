/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Process
 *  android.support.v7.widget.RecyclerView
 *  android.text.TextUtils
 *  android.util.DisplayMetrics
 *  android.util.LruCache
 *  android.util.SparseArray
 *  android.view.Display
 *  android.view.View
 *  android.view.ViewParent
 *  android.view.WindowManager
 *  android.webkit.ValueCallback
 *  android.webkit.WebView
 *  android.widget.AbsSeekBar
 *  android.widget.AdapterView
 *  android.widget.Button
 *  android.widget.CheckBox
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.RadioButton
 *  android.widget.RadioGroup
 *  android.widget.RatingBar
 *  android.widget.SeekBar
 *  android.widget.Spinner
 *  android.widget.Switch
 *  android.widget.TextView
 *  android.widget.ToggleButton
 *  com.tencent.smtt.sdk.ValueCallback
 *  com.tencent.smtt.sdk.WebView
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.widget.AbsSeekBar;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.growingio.android.sdk.a.e;
import com.growingio.android.sdk.b.f;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.utils.LogUtil;
import com.growingio.android.sdk.utils.a;
import com.growingio.android.sdk.utils.j;
import com.growingio.android.sdk.utils.k;
import com.growingio.android.sdk.utils.l;
import com.tencent.smtt.sdk.WebView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(value=12)
public class i {
    private static SparseArray b;
    private static Set c;
    public static final Matcher a;
    private static LruCache d;

    public static String a(Class class_) {
        String string = (String)d.get((Object)class_);
        if (TextUtils.isEmpty((CharSequence)string)) {
            string = class_.getSimpleName();
            if (TextUtils.isEmpty((CharSequence)string)) {
                string = "Anonymous";
            }
            d.put((Object)class_, (Object)string);
            a.a(class_, string);
        }
        return string;
    }

    public static String a(View view, String string) {
        String string2 = "";
        Object object = view.getTag(84159244);
        if (object != null) {
            string2 = String.valueOf(object);
        } else {
            String string3;
            if (view instanceof EditText) {
                CharSequence charSequence = ((EditText)view).getHint();
                if (!TextUtils.isEmpty((CharSequence)charSequence)) {
                    string2 = charSequence.toString();
                }
            } else if (view instanceof RatingBar) {
                string2 = String.valueOf(((RatingBar)view).getRating());
            } else if (view instanceof Spinner) {
                Object object2 = ((Spinner)view).getSelectedItem();
                if (object2 instanceof String) {
                    string2 = (String)object2;
                } else {
                    View view2 = ((Spinner)view).getSelectedView();
                    if (view2 instanceof TextView && ((TextView)view2).getText() != null) {
                        string2 = ((TextView)view2).getText().toString();
                    }
                }
            } else if (view instanceof SeekBar) {
                string2 = String.valueOf(((SeekBar)view).getProgress());
            } else if (view instanceof RadioGroup) {
                RadioGroup radioGroup = (RadioGroup)view;
                View view3 = radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
                if (view3 != null && view3 instanceof RadioButton && ((RadioButton)view3).getText() != null) {
                    string2 = ((RadioButton)view3).getText().toString();
                }
            } else if (view instanceof TextView) {
                if (((TextView)view).getText() != null) {
                    string2 = ((TextView)view).getText().toString();
                }
            } else if (view instanceof ImageView && !TextUtils.isEmpty((CharSequence)string)) {
                string2 = string;
            } else if (view instanceof android.webkit.WebView) {
                String string4 = ((android.webkit.WebView)view).getUrl();
                if (string4 != null) {
                    string2 = string4;
                }
            } else if (a.c((Object)view) && (string3 = ((WebView)view).getUrl()) != null) {
                string2 = string3;
            }
            if (TextUtils.isEmpty((CharSequence)string2) && view.getContentDescription() != null) {
                string2 = view.getContentDescription().toString();
            }
        }
        return i.a(string2);
    }

    public static String a(String string) {
        if (string == null) {
            return "";
        }
        if (!TextUtils.isEmpty((CharSequence)string) && string.length() > 50) {
            string = string.substring(0, 50);
        }
        return string;
    }

    public static boolean a(View view) {
        return view instanceof AdapterView || a.a && view instanceof RecyclerView || a.a((Object)view) || a.d && view.getClass().equals(a.k);
    }

    public static boolean a(String string, String string2) {
        if (string.charAt(0) == '*') {
            if (!GConfig.b) {
                return false;
            }
            return string2.endsWith(string.substring(1));
        }
        if (string.charAt(0) == '/') {
            if (GConfig.b) {
                try {
                    return string.equals(a.reset(string2).replaceAll(""));
                }
                catch (Exception var2_2) {
                    if (GConfig.a) {
                        var2_2.printStackTrace();
                    }
                }
            } else {
                return string.equals(string2);
            }
        }
        return false;
    }

    public static String a(View view, boolean bl2) {
        int n2;
        Object object = view.getTag(84159242);
        if (object != null && object instanceof String) {
            return (String)object;
        }
        if (bl2) {
            return null;
        }
        if (b == null) {
            b = new SparseArray();
        }
        if (c == null) {
            c = new HashSet();
        }
        if ((n2 = view.getId()) > 2130706432 && !c.contains(n2)) {
            String string = (String)b.get(n2);
            if (string != null) {
                return string;
            }
            try {
                string = view.getResources().getResourceEntryName(n2);
                b.put(n2, (Object)string);
                return string;
            }
            catch (Exception var5_5) {
                c.add(n2);
            }
        }
        return null;
    }

    public static Bundle a(Context context) {
        String string = context.getPackageName();
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(string, 128);
            Bundle bundle = applicationInfo.metaData;
            if (null == bundle) {
                bundle = new Bundle();
            }
            return bundle;
        }
        catch (PackageManager.NameNotFoundException var2_3) {
            throw new RuntimeException("Can't configure GrowingIO whit package name " + string, (Throwable)var2_3);
        }
    }

    public static String b(String string, String string2) {
        byte[] arrby;
        try {
            arrby = MessageDigest.getInstance("MD5").digest(string2.getBytes("UTF-8"));
        }
        catch (NoSuchAlgorithmException var3_3) {
            throw new RuntimeException("Huh, MD5 should be supported?", var3_3);
        }
        catch (UnsupportedEncodingException var3_4) {
            throw new RuntimeException("Huh, UTF-8 should be supported?", var3_4);
        }
        StringBuilder stringBuilder = new StringBuilder(arrby.length * 2);
        for (byte by2 : arrby) {
            if ((by2 & 255) < 16) {
                stringBuilder.append("0");
            }
            stringBuilder.append(Integer.toHexString(by2 & 255));
        }
        return string + "_" + stringBuilder.toString();
    }

    public static boolean b(View view) {
        Object object = view.getTag(84159238);
        if (object != null && object instanceof com.growingio.android.sdk.b.k) {
            com.growingio.android.sdk.b.k k2 = (com.growingio.android.sdk.b.k)object;
            return k2.a == 1;
        }
        return false;
    }

    public static String c(View view) {
        if (view instanceof Switch || view instanceof ToggleButton) {
            return "\u5f00\u5173";
        }
        if (view instanceof CheckBox) {
            return "\u590d\u9009\u6846";
        }
        if (view instanceof RadioGroup) {
            return "\u5355\u9009\u6846";
        }
        if (view instanceof Button) {
            return "\u6309\u94ae";
        }
        if (view instanceof EditText) {
            return "\u8f93\u5165\u6846";
        }
        if (view instanceof ImageView) {
            return "\u56fe\u7247";
        }
        if (view instanceof android.webkit.WebView || a.c((Object)view)) {
            return "H5\u5143\u7d20";
        }
        if (view instanceof TextView) {
            return "\u6587\u5b57";
        }
        return "\u5176\u4ed6\u5143\u7d20";
    }

    public static boolean d(View view) {
        return view.isClickable() || view instanceof RadioGroup || view instanceof Spinner || view instanceof AbsSeekBar || view.getParent() != null && view.getParent() instanceof AdapterView && ((AdapterView)view.getParent()).isClickable();
    }

    public static int a(Context context, float f2) {
        float f3 = context.getResources().getDisplayMetrics().density;
        return (int)(f2 * f3 + 0.5f);
    }

    public static int b(Context context, float f2) {
        float f3 = context.getResources().getDisplayMetrics().scaledDensity;
        return (int)(f2 * f3 + 0.5f);
    }

    public static String b(Context context) {
        ActivityManager activityManager = (ActivityManager)context.getSystemService("activity");
        List list = activityManager.getRunningAppProcesses();
        if (list == null) {
            return "";
        }
        int n2 = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
            if (runningAppProcessInfo.pid != n2) continue;
            if (context.getPackageName().equals(runningAppProcessInfo.processName)) {
                return "";
            }
            return runningAppProcessInfo.processName + ".";
        }
        return "";
    }

    public static void a(View view, Rect rect, boolean bl2, int[] arrn) {
        if (bl2) {
            view.getGlobalVisibleRect(rect);
        } else {
            if (arrn == null || arrn.length != 2) {
                arrn = new int[2];
            }
            view.getLocationOnScreen(arrn);
            rect.set(0, 0, view.getWidth(), view.getHeight());
            rect.offset(arrn[0], arrn[1]);
        }
    }

    public static void a(View view, Rect rect, boolean bl2) {
        i.a(view, rect, bl2, null);
    }

    @TargetApi(value=9)
    public static int a(Activity activity) {
        int n2;
        int n3 = activity.getWindowManager().getDefaultDisplay().getRotation();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int n4 = displayMetrics.widthPixels;
        int n5 = displayMetrics.heightPixels;
        if ((n3 == 0 || n3 == 2) && n5 > n4 || (n3 == 1 || n3 == 3) && n4 > n5) {
            switch (n3) {
                case 0: {
                    n2 = 1;
                    break;
                }
                case 1: {
                    n2 = 0;
                    break;
                }
                case 2: {
                    n2 = 9;
                    break;
                }
                case 3: {
                    n2 = 8;
                    break;
                }
                default: {
                    n2 = 1;
                    break;
                }
            }
        } else {
            switch (n3) {
                case 0: {
                    n2 = 0;
                    break;
                }
                case 1: {
                    n2 = 1;
                    break;
                }
                case 2: {
                    n2 = 8;
                    break;
                }
                case 3: {
                    n2 = 9;
                    break;
                }
                default: {
                    n2 = 0;
                }
            }
        }
        return n2;
    }

    public static /* varargs */ void a(View view, String string, Object ... webView) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("javascript:try{");
        stringBuilder.append(string);
        stringBuilder.append("(");
        String string2 = "";
        for (Object object : webView) {
            stringBuilder.append(string2);
            string2 = ",";
            if (object instanceof String) {
                stringBuilder.append("'");
            }
            stringBuilder.append(object);
            if (!(object instanceof String)) continue;
            stringBuilder.append("'");
        }
        stringBuilder.append(");}catch(ex){console.log(ex);}");
        try {
            android.webkit.WebView webView2;
            if (view instanceof android.webkit.WebView) {
                webView2 = (android.webkit.WebView)view;
                webView2.loadUrl(stringBuilder.toString());
            } else if (a.c((Object)view)) {
                webView2 = (WebView)view;
                webView2.loadUrl(stringBuilder.toString());
            }
        }
        catch (Exception var5_6) {
            LogUtil.d("WebView", "call javascript failed " + var5_6);
        }
    }

    public static String e(View view) {
        if (view instanceof android.webkit.WebView) {
            return ((android.webkit.WebView)view).getTitle();
        }
        if (a.c((Object)view)) {
            return ((WebView)view).getTitle();
        }
        return null;
    }

    public static void a(View view, l l2) {
        if (view instanceof android.webkit.WebView) {
            if (Build.VERSION.SDK_INT >= 19) {
                ((android.webkit.WebView)view).evaluateJavascript("_vds_hybrid.getPageInfo()", (ValueCallback)new j(l2));
            } else {
                l2.a(null);
            }
        } else if (a.c((Object)view)) {
            ((WebView)view).evaluateJavascript("_vds_hybrid.getPageInfo()", (com.tencent.smtt.sdk.ValueCallback)new k(l2));
        }
    }

    public static f b(String string) {
        Activity activity = com.growingio.android.sdk.circle.j.e().d();
        if (activity == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            c c2 = c.h();
            String string2 = c2.b() + "::" + jSONObject.optString("d", "");
            String string3 = c2.a(activity) + "::" + jSONObject.optString("p", "");
            String string4 = jSONObject.optString("q", "");
            return e.c().a(string2, string3, string4);
        }
        catch (JSONException var2_3) {
            var2_3.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @TargetApi(value=9)
    public static void a(byte[] arrby, String string) {
        File file = new File(string);
        File file2 = file.getParentFile();
        if (file2.isDirectory() || file2.mkdirs()) {
            FileOutputStream fileOutputStream = null;
            try {
                fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(arrby);
            }
            finally {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    }
                    catch (IOException var5_5) {
                        var5_5.printStackTrace();
                    }
                    file.setReadable(true);
                }
            }
        }
    }

    static {
        a = Pattern.compile("#[\\+\\.a-zA-Z0-9_-]+").matcher("");
        d = new LruCache(100);
    }
}

