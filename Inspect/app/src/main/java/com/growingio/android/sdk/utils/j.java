/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.os.Bundle
 *  android.os.Process
 *  android.text.TextUtils
 *  android.util.DisplayMetrics
 *  android.util.LruCache
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.ViewParent
 *  android.webkit.WebView
 *  android.widget.AbsSeekBar
 *  android.widget.AdapterView
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.RadioButton
 *  android.widget.RadioGroup
 *  android.widget.RatingBar
 *  android.widget.SeekBar
 *  android.widget.Spinner
 *  android.widget.TextView
 *  com.tencent.smtt.sdk.WebView
 */
package com.growingio.android.sdk.utils;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import android.widget.AbsSeekBar;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import com.growingio.android.sdk.b.k;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.utils.LogUtil;
import com.growingio.android.sdk.utils.a;
import com.tencent.smtt.sdk.WebView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@TargetApi(value=12)
public class j {
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
            } else if (a.d((Object)view) && (string3 = ((WebView)view).getUrl()) != null) {
                string2 = string3;
            }
            if (TextUtils.isEmpty((CharSequence)string2)) {
                if (string != null) {
                    string2 = string;
                } else if (view.getContentDescription() != null) {
                    string2 = view.getContentDescription().toString();
                }
            }
        }
        return j.a(string2);
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
        return view instanceof AdapterView || a.a((Object)view) || a.b((Object)view);
    }

    public static boolean a(String string, String string2) {
        if (string.charAt(0) == '*') {
            if (!GConfig.USE_ID) {
                return false;
            }
            return string2.endsWith(string.substring(1));
        }
        if (string.charAt(0) == '/') {
            if (GConfig.USE_ID) {
                try {
                    return string.equals(a.reset(string2).replaceAll(""));
                }
                catch (Exception var2_2) {
                    if (GConfig.DEBUG) {
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

    public static boolean b(View view) {
        Object object = view.getTag(84159238);
        if (object != null && object instanceof k) {
            k k2 = (k)object;
            return k2.a == 1;
        }
        return false;
    }

    public static boolean c(View view) {
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
        j.a(view, rect, bl2, null);
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
            } else if (a.d((Object)view)) {
                webView2 = (WebView)view;
                webView2.loadUrl(stringBuilder.toString());
            }
        }
        catch (Exception var5_6) {
            LogUtil.d("WebView", "call javascript failed ", var5_6);
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

