/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.widget.TextView
 */
package com.tendcloud.tenddata;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.tendcloud.tenddata.dm;
import com.tendcloud.tenddata.dp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

@TargetApi(value=16)
abstract class dr
implements dp.a {
    private final List a;
    private final dp b;

    void a(View view) {
        this.b.a(view, this.a, this);
    }

    abstract void a();

    protected dr(List list) {
        this.a = list;
        this.b = new dp();
    }

    protected List b() {
        return this.a;
    }

    protected dp c() {
        return this.b;
    }

    protected abstract String d();

    static abstract class d
    extends dr {
        private final f a;
        private final String b;
        private final boolean c;

        public d(List list, String string, f f2, boolean bl2) {
            super(list);
            this.a = f2;
            this.b = string;
            this.c = bl2;
        }

        protected void b(View view) {
            this.a.a(view, this.b, this.c);
        }

        protected String e() {
            return this.b;
        }
    }

    static class i
    extends d {
        private boolean a = false;

        public i(List list, String string, f f2) {
            super(list, string, f2, false);
        }

        @Override
        public void a() {
        }

        @Override
        public void accumulate(View view) {
            if (view != null && !this.a) {
                this.b(view);
            }
            this.a = view != null;
        }

        @Override
        protected String d() {
            return this.e() + " when Detected";
        }
    }

    static class b
    extends d {
        private final Map a = new HashMap();

        public b(List list, String string, f f2) {
            super(list, string, f2, true);
        }

        @Override
        public void a() {
            for (Map.Entry entry : this.a.entrySet()) {
                TextView textView = (TextView)entry.getKey();
                TextWatcher textWatcher = (TextWatcher)entry.getValue();
                textView.removeTextChangedListener(textWatcher);
            }
            this.a.clear();
        }

        @Override
        public void accumulate(View view) {
            if (view instanceof TextView) {
                TextView textView = (TextView)view;
                a a2 = new a((View)textView);
                TextWatcher textWatcher = (TextWatcher)this.a.get((Object)textView);
                if (null != textWatcher) {
                    textView.removeTextChangedListener(textWatcher);
                }
                textView.addTextChangedListener((TextWatcher)a2);
                this.a.put(textView, a2);
            }
        }

        @Override
        protected String d() {
            return this.e() + " on Text Change";
        }

        class a
        implements TextWatcher {
            private final View b;

            public a(View view) {
                this.b = view;
            }

            public void beforeTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
            }

            public void onTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
            }

            public void afterTextChanged(Editable editable) {
                b.this.b(this.b);
            }
        }

    }

    static class com.tendcloud.tenddata.dr$a
    extends d {
        private final int a;
        private final WeakHashMap b;

        com.tendcloud.tenddata.dr$a(List list, int n2, String string, f f2) {
            super(list, string, f2, false);
            this.a = n2;
            this.b = new WeakHashMap();
        }

        @Override
        public void a() {
            for (Map.Entry entry : this.b.entrySet()) {
                View view = (View)entry.getKey();
                a a2 = (a)((Object)entry.getValue());
                View.AccessibilityDelegate accessibilityDelegate = this.c(view);
                if (accessibilityDelegate == a2) {
                    view.setAccessibilityDelegate(a2.a());
                    continue;
                }
                if (!(accessibilityDelegate instanceof a)) continue;
                a a3 = (a)accessibilityDelegate;
                a3.a(a2);
            }
            this.b.clear();
        }

        @Override
        public void accumulate(View view) {
            a a2;
            View.AccessibilityDelegate accessibilityDelegate = this.c(view);
            if (accessibilityDelegate instanceof a && (a2 = (a)accessibilityDelegate).a(this.e())) {
                return;
            }
            a2 = new a(accessibilityDelegate);
            view.setAccessibilityDelegate((View.AccessibilityDelegate)a2);
            this.b.put(view, a2);
        }

        @Override
        protected String d() {
            return this.e() + " event when (" + this.a + ")";
        }

        private View.AccessibilityDelegate c(View view) {
            View.AccessibilityDelegate accessibilityDelegate = null;
            try {
                Class class_ = view.getClass();
                Method method = class_.getMethod("getAccessibilityDelegate", new Class[0]);
                accessibilityDelegate = (View.AccessibilityDelegate)method.invoke((Object)view, new Object[0]);
            }
            catch (NoSuchMethodException var3_4) {
            }
            catch (IllegalAccessException var3_5) {
            }
            catch (InvocationTargetException var3_6) {
                // empty catch block
            }
            return accessibilityDelegate;
        }

        class a
        extends View.AccessibilityDelegate {
            private View.AccessibilityDelegate b;

            a(View.AccessibilityDelegate accessibilityDelegate) {
                this.b = accessibilityDelegate;
            }

            View.AccessibilityDelegate a() {
                return this.b;
            }

            boolean a(String string) {
                if (a.this.e() == string) {
                    return true;
                }
                if (this.b instanceof a) {
                    return ((a)this.b).a(string);
                }
                return false;
            }

            void a(a a2) {
                if (this.b == a2) {
                    this.b = a2.a();
                } else if (this.b instanceof a) {
                    a a3 = (a)this.b;
                    a3.a(a2);
                }
            }

            public void sendAccessibilityEvent(View view, int n2) {
                if (n2 == a.this.a) {
                    a.this.b(view);
                }
                if (null != this.b) {
                    this.b.sendAccessibilityEvent(view, n2);
                }
            }
        }

    }

    static class c {
        private c() {
        }

        boolean a(TreeMap treeMap) {
            ArrayList arrayList = new ArrayList();
            while (!treeMap.isEmpty()) {
                View view = (View)treeMap.firstKey();
                if (this.a(treeMap, view, arrayList)) continue;
                return false;
            }
            return true;
        }

        private boolean a(TreeMap treeMap, View view, List list) {
            if (list.contains((Object)view)) {
                return false;
            }
            if (treeMap.containsKey((Object)view)) {
                List list2 = (List)treeMap.remove((Object)view);
                list.add(view);
                int n2 = list2.size();
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (this.a(treeMap, (View)list2.get(i2), list)) continue;
                    return false;
                }
                list.remove((Object)view);
            }
            return true;
        }
    }

    static class h
    extends dr {
        private final dm a;
        private final dm b;
        private final WeakHashMap c;
        private final Object[] d;

        h(List list, dm dm2, dm dm3) {
            super(list);
            this.a = dm2;
            this.b = dm3;
            this.d = new Object[1];
            this.c = new WeakHashMap();
        }

        @Override
        public void a() {
            for (Map.Entry entry : this.c.entrySet()) {
                View view = (View)entry.getKey();
                Object v2 = entry.getValue();
                if (null == v2) continue;
                this.d[0] = v2;
                this.a.a(view, this.d);
            }
        }

        @Override
        public void accumulate(View view) {
            Object[] arrobject;
            if (null != this.b && 1 == (arrobject = this.a.a()).length) {
                Object object = arrobject[0];
                Object object2 = this.b.a(view);
                if (object == object2) {
                    return;
                }
                if (null != object) {
                    if (object instanceof Bitmap && object2 instanceof Bitmap) {
                        Bitmap bitmap = (Bitmap)object;
                        Bitmap bitmap2 = (Bitmap)object2;
                        if (bitmap.sameAs(bitmap2)) {
                            return;
                        }
                    } else if (object instanceof BitmapDrawable && object2 instanceof BitmapDrawable) {
                        Bitmap bitmap = ((BitmapDrawable)object).getBitmap();
                        Bitmap bitmap3 = ((BitmapDrawable)object2).getBitmap();
                        if (bitmap != null && bitmap.sameAs(bitmap3)) {
                            return;
                        }
                    } else if (object.equals(object2)) {
                        return;
                    }
                }
                if (!(object2 instanceof Bitmap || object2 instanceof BitmapDrawable || this.c.containsKey((Object)view))) {
                    this.d[0] = object2;
                    if (this.a.a(this.d)) {
                        this.c.put(view, object2);
                    } else {
                        this.c.put(view, null);
                    }
                }
            }
            this.a.a(view);
        }

        @Override
        protected String d() {
            return "Property Mutator";
        }
    }

    static class e {
        private final String a;
        private final String b;

        public e(String string, String string2) {
            this.a = string;
            this.b = string2;
        }

        String a() {
            return this.a;
        }

        String b() {
            return this.b;
        }
    }

    static interface g {
        public void onLayoutError(e var1);
    }

    static interface f {
        public void a(View var1, String var2, boolean var3);
    }

}

