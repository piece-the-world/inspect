/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.app.Dialog
 *  android.app.DialogFragment
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnKeyListener
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.os.AsyncTask
 *  android.os.Bundle
 *  android.text.Editable
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  android.text.SpannableString
 *  android.text.StaticLayout
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.text.style.AbsoluteSizeSpan
 *  android.util.Base64
 *  android.util.DisplayMetrics
 *  android.util.Pair
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.webkit.WebView
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.Button
 *  android.widget.CheckBox
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.RadioButton
 *  android.widget.RadioGroup
 *  android.widget.RadioGroup$OnCheckedChangeListener
 *  android.widget.ScrollView
 *  android.widget.Switch
 *  android.widget.TextView
 *  android.widget.Toast
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.circle;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import com.growingio.android.sdk.a.e;
import com.growingio.android.sdk.b.d;
import com.growingio.android.sdk.b.f;
import com.growingio.android.sdk.b.h;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.b.l;
import com.growingio.android.sdk.circle.GIOCircleRootPanel;
import com.growingio.android.sdk.circle.as;
import com.growingio.android.sdk.circle.at;
import com.growingio.android.sdk.circle.au;
import com.growingio.android.sdk.circle.av;
import com.growingio.android.sdk.circle.aw;
import com.growingio.android.sdk.circle.ax;
import com.growingio.android.sdk.circle.ay;
import com.growingio.android.sdk.circle.az;
import com.growingio.android.sdk.circle.ba;
import com.growingio.android.sdk.circle.bb;
import com.growingio.android.sdk.circle.bc;
import com.growingio.android.sdk.circle.bd;
import com.growingio.android.sdk.circle.be;
import com.growingio.android.sdk.circle.bf;
import com.growingio.android.sdk.circle.bg;
import com.growingio.android.sdk.circle.bh;
import com.growingio.android.sdk.circle.bi;
import com.growingio.android.sdk.circle.bj;
import com.growingio.android.sdk.circle.bk;
import com.growingio.android.sdk.circle.bm;
import com.growingio.android.sdk.circle.bn;
import com.growingio.android.sdk.circle.bo;
import com.growingio.android.sdk.circle.bq;
import com.growingio.android.sdk.circle.br;
import com.growingio.android.sdk.circle.bs;
import com.growingio.android.sdk.circle.bt;
import com.growingio.android.sdk.circle.by;
import com.growingio.android.sdk.circle.cm;
import com.growingio.android.sdk.circle.co;
import com.growingio.android.sdk.circle.cr;
import com.growingio.android.sdk.circle.ct;
import com.growingio.android.sdk.circle.de;
import com.growingio.android.sdk.circle.df;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.collection.q;
import com.growingio.android.sdk.utils.LogUtil;
import com.growingio.android.sdk.utils.g;
import com.growingio.android.sdk.utils.m;
import com.growingio.android.sdk.utils.o;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(value=11)
public class ar
extends DialogFragment {
    private static String[] d = new String[]{"", "k", "m", "b", "t"};
    private cm e;
    private SimpleDateFormat f = new SimpleDateFormat("dd/MM", Locale.CHINESE);
    final DecimalFormat a = new DecimalFormat("#,###.##");
    final DecimalFormat b = new DecimalFormat("###E0");
    private f g;
    private boolean h;
    private Bitmap i;
    private String j;
    private Context k;
    List c;
    private i l;
    private List m;
    private f n;
    private ScrollView o;
    private ImageView p;
    private i q;
    private i r;
    private boolean s;
    private ListView t;
    private ImageView u;
    private TextView v;
    private TextView w;
    private View x;
    private EditText y;
    private ViewGroup z;
    private View A;
    private View B;
    private View C;
    private CheckBox D;
    private TextView E;
    private View F;
    private TextView G;
    private TextView H;
    private TextView I;
    private View J;
    private Switch K;
    private View L;
    private Switch M;
    private View N;
    private CheckBox O;
    private TextView P;
    private TextView Q;
    private RadioGroup R;
    private co S;
    private View T;
    private View U;
    private View V;
    private View W;
    private View X;
    private View Y;
    private EditText Z;
    private Switch aa;
    private TextView ab;
    private EditText ac;
    private EditText ad;
    private Switch ae;
    private EditText af;
    private Switch ag;
    private List ah;
    private boolean ai;
    private boolean aj = false;
    private int ak;
    private int al;
    private JSONArray am;
    private boolean an;
    private boolean ao;
    private int ap;
    private bs aq;
    private int ar = -2;
    private boolean as = false;
    private boolean at = false;
    private boolean au = false;
    private boolean av = true;
    private Window aw;
    private View ax;

    q a() {
        return q.d();
    }

    e b() {
        return e.c();
    }

    public ar() {
        this.setStyle(0, 16973837);
        ct.a();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = super.onCreateDialog(bundle);
        dialog.getWindow().setSoftInputMode(18);
        dialog.getWindow().getDecorView().setTag((Object)"DO_NOT_DRAW");
        this.aw = dialog.getWindow();
        dialog.setOnKeyListener((DialogInterface.OnKeyListener)new as(this));
        return dialog;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = g.a("growing_dialog_event_detail_v2", viewGroup, false);
        if (this.h || this.c != null && this.c.size() > 0) {
            this.ak = com.growingio.android.sdk.utils.i.a(view.getContext(), 400.0f);
            this.al = com.growingio.android.sdk.utils.i.a(view.getContext(), 100.0f);
            this.a(view);
            if (this.h) {
                this.c();
            } else {
                this.a((i)this.c.get(0));
            }
        } else {
            if (view == null) {
                view = new View(layoutInflater.getContext());
            }
            view.post((Runnable)new bd(this));
            return view;
        }
        GIOCircleRootPanel gIOCircleRootPanel = new GIOCircleRootPanel(this.k);
        gIOCircleRootPanel.addView(view);
        com.growingio.android.sdk.utils.h.a(new bj(this), 300);
        return gIOCircleRootPanel;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.l != null) {
            this.l = null;
        }
        if (this.i != null && this.i != ct.b()) {
            this.i.recycle();
            this.i = null;
        }
        if (this.ar == -1 && this.k instanceof Activity) {
            ((Activity)this.k).setRequestedOrientation(-1);
        }
        j.e().g();
        this.k = null;
        if (this.aq != null) {
            this.aq.cancel(true);
            this.aq = null;
        }
    }

    private void a(String string, String string2, String string3) {
        this.n = new f();
        this.n.c = "\u5f53\u524d\u9875\u9762";
        this.n.d = "page";
        this.n.f = new h();
        this.n.f.d = string;
        this.n.f.b = string2;
        this.n.f.f = string3;
        this.n.f.a = "";
        this.n.f.c = "";
        this.n.f.e = "";
        this.n.f.g = "";
    }

    public void a(f f2, Activity activity, i i2) {
        this.h = true;
        this.j = f2.d;
        this.g = f2;
        this.l = i2;
        this.k = activity;
        if (i2 != null) {
            this.a(c.h().b() + "::", c.h().a(activity) + "::", f2.f.f);
        }
        this.a((Context)activity);
    }

    public void a(Context context, List list, String string, String string2, boolean bl2, String string3) {
        this.h = false;
        this.k = context;
        this.c = list;
        this.j = string2;
        this.as = bl2;
        com.growingio.android.sdk.b.j j2 = this.c != null && !this.c.isEmpty() && ((i)this.c.get((int)0)).q != null ? ((i)this.c.get((int)0)).q : null;
        this.a(string3, string, j2 != null ? j2.c : "");
        if (j2 != null) {
            this.m = this.b().b(this.n);
        }
        this.a(context);
    }

    @TargetApi(value=14)
    private void a(View view) {
        this.o = (ScrollView)view.findViewById(g.c("sv_edit_panel"));
        this.u = (ImageView)view.findViewById(g.c("btn_save"));
        this.u.setOnClickListener((View.OnClickListener)new bk(this));
        this.w = (TextView)view.findViewById(g.c("tv_title"));
        this.v = (TextView)view.findViewById(g.c("tv_cancel"));
        this.v.setOnClickListener((View.OnClickListener)new bm(this));
        this.t = (ListView)view.findViewById(g.c("lv_screenshots"));
        this.t.setOnItemClickListener((AdapterView.OnItemClickListener)new bn(this));
        this.p = (ImageView)view.findViewById(g.c("iv_screenshot"));
        this.p.setOnClickListener((View.OnClickListener)new bo(this));
        this.x = view.findViewById(g.c("ll_name_container"));
        this.y = (EditText)view.findViewById(g.c("et_name"));
        this.y.setOnClickListener((View.OnClickListener)new bq(this));
        this.G = (TextView)view.findViewById(g.c("tv_yesterday_imp_value"));
        this.H = (TextView)view.findViewById(g.c("tv_yesterday_clck_value"));
        this.I = (TextView)view.findViewById(g.c("tv_yesterday_percent_value"));
        this.z = (ViewGroup)view.findViewById(g.c("chart_container"));
        this.A = view.findViewById(g.c("chart_loading_progress"));
        this.J = view.findViewById(g.c("select_other_elements"));
        if (this.h) {
            this.J.setVisibility(8);
        } else {
            this.J.setVisibility(this.c.size() > 1 ? 0 : 8);
            this.J.setOnClickListener((View.OnClickListener)new br(this));
        }
        this.F = view.findViewById(g.c("ll_ignore_position_container"));
        this.K = (Switch)view.findViewById(g.c("sw_ignore_position"));
        this.K.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)new at(this));
        this.L = view.findViewById(g.c("ll_ignore_text_container"));
        this.M = (Switch)view.findViewById(g.c("sw_ignore_text"));
        this.N = view.findViewById(g.c("ll_select_text"));
        this.P = (TextView)view.findViewById(g.c("tv_toggle_select_text_state"));
        this.O = (CheckBox)view.findViewById(g.c("cb_toggle_select_text"));
        this.O.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)new au(this));
        this.Q = (TextView)view.findViewById(g.c("tv_select_text_element_tip"));
        this.R = (RadioGroup)view.findViewById(g.c("rg_content_text"));
        this.R.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener)new av(this));
        this.M.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)new aw(this));
        this.C = view.findViewById(g.c("ll_more_options_container"));
        this.E = (TextView)view.findViewById(g.c("tv_more_optioins_state"));
        this.B = view.findViewById(g.c("text_group_loading_progress"));
        this.D = (CheckBox)view.findViewById(g.c("ck_more_options"));
        this.D.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)new ax(this));
        view.findViewById(g.c("iv_ignore_position_tip")).setOnClickListener((View.OnClickListener)new ay(this));
        view.findViewById(g.c("iv_ignore_text_tip")).setOnClickListener((View.OnClickListener)new az(this));
        this.T = view.findViewById(g.c("rl_href_container"));
        this.U = view.findViewById(g.c("rl_select_page_container"));
        this.V = view.findViewById(g.c("iv_select_page_arrow"));
        this.W = view.findViewById(g.c("rl_domain_container"));
        this.X = view.findViewById(g.c("rl_path_container"));
        this.Y = view.findViewById(g.c("rl_query_container"));
        this.Z = (EditText)view.findViewById(g.c("et_href"));
        this.aa = (Switch)view.findViewById(g.c("sw_href_toggle"));
        this.ab = (TextView)view.findViewById(g.c("tv_select_page_name"));
        this.ac = (EditText)view.findViewById(g.c("et_domain"));
        this.ad = (EditText)view.findViewById(g.c("et_path"));
        this.ae = (Switch)view.findViewById(g.c("sw_path_toggle"));
        this.af = (EditText)view.findViewById(g.c("et_query"));
        this.ag = (Switch)view.findViewById(g.c("sw_query_toggle"));
        this.aa.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)new ba(this));
        this.ae.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)new bb(this));
        this.ag.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)new bc(this));
        if (this.m != null && this.m.size() > 1) {
            this.U.setOnClickListener((View.OnClickListener)new be(this));
        } else {
            this.V.setVisibility(4);
        }
    }

    @TargetApi(value=14)
    private void a(i i2) {
        this.q = i2;
        this.r = i2;
        this.an = true;
        this.t.setVisibility(8);
        this.W.setVisibility(8);
        this.X.setVisibility(8);
        this.Y.setVisibility(8);
        this.o.setVisibility(0);
        this.x.setVisibility(0);
        this.u.setVisibility(0);
        this.ah = this.c(i2);
        this.s = i2.n || com.growingio.android.sdk.utils.i.d(i2.c);
        this.ao = false;
        this.r();
        this.ao = true;
        this.k();
        this.n();
        this.o();
    }

    private void c() {
        this.an = true;
        this.t.setVisibility(8);
        this.o.setVisibility(0);
        this.x.setVisibility(0);
        this.F.setVisibility(8);
        this.N.setVisibility(8);
        this.Q.setVisibility(8);
        this.L.setVisibility(8);
        this.y.setText((CharSequence)this.g.c);
        this.y.setSelection(this.y.getText().length());
        if (this.l != null) {
            this.i = ct.a(this.l);
            this.C.setVisibility(0);
            this.d();
        } else {
            this.i = ct.a(o.c());
            this.C.setVisibility(8);
        }
        this.t();
        this.p.setImageBitmap(this.i);
        this.p.setEnabled(this.i.getHeight() > this.al);
        this.ak = Math.max(this.al, this.i.getHeight());
        this.ak = Math.min(this.ak, com.growingio.android.sdk.utils.i.a(this.k, 400.0f));
        this.av = true;
        this.j();
        this.n();
    }

    @TargetApi(value=14)
    private void d() {
        this.ao = false;
        if (!TextUtils.isEmpty((CharSequence)this.g.g.d)) {
            this.ac.setText((CharSequence)this.g.g.d.replace(this.n.f.d, ""));
        } else {
            this.ac.setText((CharSequence)"");
        }
        if (!TextUtils.isEmpty((CharSequence)this.g.g.b)) {
            this.ad.setText((CharSequence)this.g.g.b.replace(this.n.f.b, ""));
        } else {
            this.ad.setText((CharSequence)"");
        }
        this.ae.setChecked(true);
        this.ad.setEnabled(true);
        this.af.setText((CharSequence)this.g.g.f);
        if (!TextUtils.isEmpty((CharSequence)this.g.g.f)) {
            this.ag.setChecked(true);
            this.af.setEnabled(true);
        } else {
            this.ag.setChecked(false);
            this.af.setEnabled(false);
        }
        this.ao = true;
    }

    private f b(i i2) {
        String string = i2.e == -1 ? null : String.valueOf(i2.e);
        String string2 = i2.q != null && !TextUtils.isEmpty((CharSequence)i2.q.d) ? i2.q.d : null;
        return e.a(this.n.f.d, this.j, this.n.f.b, i2.j, 0, i2.k, string, this.n.f.f, string2, this.n.g);
    }

    private void e() {
        for (int i2 = 0; i2 < this.ah.size(); ++i2) {
            this.R.addView((View)this.a(((i)this.ah.get((int)i2)).k, this.ah.get(i2)));
        }
    }

    @TargetApi(value=14)
    private void a(boolean bl2) {
        if (this.ah.size() > 0) {
            if (bl2) {
                this.R.getChildAt(0).setVisibility(8);
                if (this.R.findViewById(this.R.getCheckedRadioButtonId()).getTag() == null) {
                    ((RadioButton)this.R.getChildAt(1)).setChecked(true);
                }
            } else {
                RadioButton radioButton = (RadioButton)this.R.getChildAt(0);
                radioButton.setVisibility(0);
            }
            this.f();
        }
        this.Q.setVisibility(!bl2 && this.O.isChecked() && !this.ai ? 0 : 8);
    }

    private void f() {
        Object object;
        String string = null;
        View view = this.R.findViewById(this.R.getCheckedRadioButtonId());
        if (view != null && (object = (i)view.getTag()) != null) {
            string = object.k;
        }
        if (string == null) {
            this.O.setText((CharSequence)g.a("growing_label_select_none_text", new Object[0]));
        } else {
            object = this.M.isChecked() ? "growing_label_select_text" : "growing_label_select_text_for_group";
            int n2 = this.a((String)object, string);
            if (string.length() > n2) {
                string = string.substring(0, n2) + "\u2026";
            }
            this.O.setText((CharSequence)g.a((String)object, string));
        }
    }

    private RadioButton a(String string, Object object) {
        RadioButton radioButton = (RadioButton)g.a("growing_rtl_radio_button", null, false);
        radioButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        radioButton.setText((CharSequence)string);
        radioButton.setTag(object);
        return radioButton;
    }

    private List c(i i2) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty((CharSequence)i2.k)) {
            this.ai = true;
        } else if (i2.c instanceof WebView) {
            this.ai = !TextUtils.isEmpty((CharSequence)i2.k);
        } else if (i2.c instanceof ViewGroup) {
            i2.a(new bf(this, i2, arrayList));
            i2.b();
            if (arrayList.size() > 1) {
                Collections.swap(arrayList, 0, this.ap);
            }
            this.ai = false;
        }
        return arrayList;
    }

    private void g() {
        this.t.setVisibility(0);
        this.o.setVisibility(8);
        this.x.setVisibility(8);
        this.u.setVisibility(8);
        this.p();
        this.w.setText((CharSequence)"\u5176\u4ed6\u5143\u7d20");
        if (this.t.getAdapter() == null || !(this.t.getAdapter() instanceof cr)) {
            cr cr2 = new cr(LayoutInflater.from((Context)this.k), this.c);
            this.t.setAdapter((ListAdapter)cr2);
        }
        ((cr)this.t.getAdapter()).a(this.q);
    }

    private void h() {
        this.t.setVisibility(0);
        this.o.setVisibility(8);
        this.x.setVisibility(8);
        this.u.setVisibility(8);
        this.p();
        this.w.setText((CharSequence)"\u9009\u62e9\u9875\u9762");
        if (this.t.getAdapter() == null || !(this.t.getAdapter() instanceof by)) {
            by by2 = new by(this.m);
            this.t.setAdapter((ListAdapter)by2);
        }
        ((by)this.t.getAdapter()).a(this.n);
    }

    private void a(JSONArray jSONArray) {
        this.A.setVisibility(8);
        if (jSONArray == null) {
            this.am = null;
            this.i();
            return;
        }
        int n2 = -1;
        int n3 = -1;
        try {
            int n4 = jSONArray.length();
            if (n4 > 0) {
                JSONArray jSONArray2 = jSONArray.getJSONObject(0).getJSONArray("data");
                if (jSONArray2.length() > 2) {
                    n2 = jSONArray2.getJSONObject(jSONArray2.length() - 2).getInt("y");
                    this.G.setText((CharSequence)this.b(this.a(n2)));
                }
                if (n4 > 1) {
                    JSONArray jSONArray3 = jSONArray.getJSONObject(1).getJSONArray("data");
                    if (this.s && jSONArray3.length() > 2) {
                        n3 = jSONArray3.getJSONObject(jSONArray3.length() - 2).getInt("y");
                        this.H.setText((CharSequence)this.b(this.a(n3)));
                        if (n3 >= 0 && n2 > 0) {
                            this.I.setText((CharSequence)this.b(new DecimalFormat("#0.0#%").format((float)n3 / (float)n2)));
                        }
                    }
                }
                this.am = jSONArray;
            } else {
                this.am = null;
            }
        }
        catch (JSONException var4_5) {
            var4_5.printStackTrace();
        }
        this.i();
    }

    private void i() {
        if (this.e == null) {
            this.e = new cm(this.k, g.a("giosdk_chart_grid_color"), g.a("giosdk_chart_t_color"));
            this.z.addView(this.e.a(), 0, new ViewGroup.LayoutParams(-1, -1));
        }
        this.e.a(this.am);
        this.e.a(0);
    }

    private void j() {
        if (this.aq != null) {
            this.aq.cancel(true);
        }
        this.A.setVisibility(0);
        this.s();
        this.aq = new bs(this);
        this.aq.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new f[]{this.g});
    }

    private void k() {
        if (this.q != null && this.ao) {
            i i2 = this.q;
            this.g = this.b(i2);
            if (this.ah.size() > 0) {
                int n2 = this.R.getCheckedRadioButtonId();
                View view = this.R.findViewById(n2);
                i2 = view != null && view.getTag() != null ? (i)view.getTag() : this.r;
                this.g = this.b(i2);
            }
            this.g.a(this.y.getText().toString().trim());
            this.g.b(!this.M.isChecked() ? null : i2.k);
            if (i2.m) {
                this.g.c(!this.K.isChecked() ? null : String.valueOf(i2.e));
            }
            this.g.g.g = this.aa.isChecked() ? this.Z.getText().toString().trim() : null;
            this.j();
        }
    }

    private void l() {
        this.g.a(this.y.getText().toString().trim());
        if (this.h && this.l != null && this.ao) {
            this.g.g.d = this.n.f.d + this.ac.getText().toString().trim();
            if (this.ae.isChecked()) {
                this.g.g.b = this.n.f.b + this.ad.getText().toString().trim();
                this.ad.setEnabled(true);
            } else {
                this.g.g.b = this.n.f.b + '*';
                this.ad.setEnabled(false);
            }
            if (this.ag.isChecked()) {
                this.g.g.f = this.af.getText().toString().trim();
                this.af.setEnabled(true);
            } else {
                this.g.g.f = null;
                this.af.setEnabled(false);
            }
            this.j();
        }
    }

    private void m() {
        if (!this.h) {
            this.k();
        } else {
            this.l();
        }
        d d2 = null;
        if (this.h) {
            d2 = new d();
            d2.a = "0";
            d2.b = "0";
            d2.c = String.valueOf(ct.d());
            d2.d = String.valueOf(ct.f());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.i.compress(Bitmap.CompressFormat.JPEG, 70, (OutputStream)byteArrayOutputStream);
            byte[] arrby = byteArrayOutputStream.toByteArray();
            d2.f = "data:image/jpeg;base64," + Base64.encodeToString((byte[])arrby, (int)2);
            byteArrayOutputStream.reset();
            ct.b().compress(Bitmap.CompressFormat.JPEG, 10, (OutputStream)byteArrayOutputStream);
            d2.e = "data:image/jpeg;base64," + Base64.encodeToString((byte[])byteArrayOutputStream.toByteArray(), (int)2);
        } else {
            d2 = this.q.g;
            int n2 = Integer.parseInt(d2.a);
            int n3 = Integer.parseInt(d2.b);
            RectF rectF = new RectF((float)n2, (float)n3, (float)(n2 + Integer.parseInt(d2.c)), (float)(n3 + Integer.parseInt(d2.d)));
            byte[] arrby = ct.a(this.i, (int)rectF.width(), (int)rectF.height());
            d2.e = "data:image/jpeg;base64," + Base64.encodeToString((byte[])arrby, (int)2);
            byte[] arrby2 = ct.a(o.c(), rectF);
            d2.f = "data:image/jpeg;base64," + Base64.encodeToString((byte[])arrby2, (int)2);
        }
        this.g.a(d2);
        this.g.i = this.q != null && this.q.q != null || this.l != null ? "app_circle_web" : "app_circle";
        this.w.setText((CharSequence)g.a("growing_title_saving", new Object[0]));
        new bt(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new f[]{this.g});
    }

    private void a(Pair pair) {
        this.n();
        this.b(true);
        if ((Integer)pair.first == 200) {
            Toast.makeText((Context)this.k, (CharSequence)"\u4fdd\u5b58\u6210\u529f", (int)0).show();
            this.a((String)null);
            if (GConfig.o().q()) {
                new AlertDialog.Builder(this.k).setTitle((CharSequence)"\u6307\u6807\u4fdd\u5b58\u6210\u529f").setMessage((CharSequence)"\u8bf7\u5728GrowingIO\u7f51\u7ad9\u201c\u6307\u6807\u7ba1\u7406\u201d\u4e2d\u67e5\u770b").setPositiveButton((CharSequence)"\u77e5\u9053\u4e86", null).create().show();
                GConfig.o().b(false);
            } else {
                Toast.makeText((Context)this.k, (CharSequence)"\u4fdd\u5b58\u6210\u529f", (int)1).show();
            }
            try {
                f f2 = new f(new JSONObject(new String((byte[])pair.second)));
                if (this.h) {
                    this.b().a(f2.b);
                }
                this.b().a(f2);
            }
            catch (Exception var2_3) {
                var2_3.printStackTrace();
            }
            j.e().l();
            this.dismiss();
        } else {
            String string;
            String string2;
            string2 = null;
            string = null;
            if ((Integer)pair.first == 422) {
                try {
                    JSONObject jSONObject = new JSONObject(new String((byte[])pair.second));
                    string2 = jSONObject.getString("error");
                    if (string2.contains("\u76f8\u540c\u89c4\u5219")) {
                        string = "duplicate_tag";
                    } else if (string2.contains("\u8be5\u540d\u79f0\u5df2\u88ab\u5360\u7528")) {
                        string = "duplicate_name";
                    }
                }
                catch (JSONException var4_7) {
                    LogUtil.d("GrowingIO.EditWindow", "get error msg error", (Throwable)var4_7);
                }
            } else if ((Integer)pair.first >= 400) {
                string2 = pair.second != null && ((byte[])pair.second).length > 0 ? new String((byte[])pair.second) : "Oops \u670d\u52a1\u5668\u53d1\u751f\u4e86\u70b9\u9519\u8bef\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5";
                string = "server_error";
            } else if ((Integer)pair.first == 0) {
                string2 = "\u65e0\u6cd5\u8fde\u63a5\u5230\u670d\u52a1\u5668\uff0c\u8bf7\u786e\u4fdd\u5df2\u7ecf\u63a5\u5165\u5230\u4e92\u8054\u7f51";
                string = "network_disconnect";
            }
            new AlertDialog.Builder(this.k).setTitle((CharSequence)"\u4fdd\u5b58\u5931\u8d25").setMessage((CharSequence)string2).setPositiveButton((CharSequence)"\u77e5\u9053\u4e86", null).create().show();
            this.a(string);
        }
    }

    private void b(boolean bl2) {
        this.u.setEnabled(bl2);
        this.v.setEnabled(bl2);
        this.y.setEnabled(bl2);
        this.D.setEnabled(bl2);
        this.M.setEnabled(bl2);
        this.K.setEnabled(bl2);
        this.R.setEnabled(bl2);
        this.O.setEnabled(bl2);
    }

    private void a(String string) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("consistent_with_default_rule", (Object)(this.av ? "yes" : "no"));
            if (!TextUtils.isEmpty((CharSequence)string)) {
                jSONObject.put("failure_reason", (Object)string);
            }
        }
        catch (JSONException var3_3) {
            // empty catch block
        }
        this.a().a("/DialogWindow/LinearLayout[0]/FrameLayout[1]/GIOCircleRootPanel[0]/TagSaveResult[0]", jSONObject.toString(), false);
    }

    private void a(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity)context;
            this.ar = activity.getRequestedOrientation();
            activity.setRequestedOrientation(com.growingio.android.sdk.utils.i.a(activity));
        }
    }

    private void n() {
        this.w.setText((CharSequence)g.a("growing_title_new_tag", new Object[0]));
    }

    private void o() {
        this.v.setText((CharSequence)"\u53d6\u6d88");
        this.v.setOnClickListener((View.OnClickListener)new bg(this));
    }

    private void p() {
        this.v.setText((CharSequence)"\u8fd4\u56de");
        this.v.setOnClickListener((View.OnClickListener)new bh(this));
    }

    private void q() {
        if (this.t.getAdapter() instanceof by) {
            this.t.setVisibility(8);
            this.o.setVisibility(0);
            this.x.setVisibility(0);
            this.u.setVisibility(0);
            this.n();
            this.o();
            if (this.g != null && this.n != null) {
                this.ab.setText((CharSequence)this.n.c);
                if (this.n.f != null) {
                    this.g.f.d = this.n.f.d;
                    this.g.f.b = this.n.f.b;
                    this.g.f.f = this.n.f.f;
                }
                if (this.n.g != null) {
                    this.g.g.d = this.n.g.d;
                    this.g.g.b = this.n.g.b;
                    this.g.g.f = this.n.g.f;
                }
                this.j();
            }
        } else {
            this.a(this.q);
        }
    }

    private void r() {
        if (!(this.m != null && !this.m.isEmpty() || this.q.m || this.ai || this.ah != null && !this.ah.isEmpty() || this.c != null && this.c.size() > 1)) {
            this.C.setVisibility(8);
        } else {
            this.C.setVisibility(0);
        }
        this.v();
        this.D.setChecked(false);
        this.E.setText((CharSequence)g.a("growing_label_expand_text", new Object[0]));
        this.x();
    }

    private String d(i i2) {
        String string;
        if (this.ai) {
            if (i2.k.length() <= 8) {
                return "-" + i2.k;
            }
        } else if (this.ah.size() > 0 && (string = ((i)this.ah.get((int)0)).k).length() <= 8) {
            return "-" + string;
        }
        return "";
    }

    private void s() {
        this.G.setText((CharSequence)"--");
        this.H.setText((CharSequence)"--");
        this.I.setText((CharSequence)"--");
        if (this.e != null) {
            this.e.a(8);
        }
    }

    private void e(i i2) {
        this.y.setText((CharSequence)(com.growingio.android.sdk.utils.i.c(i2.c) + this.d(i2)));
        this.y.setSelection(this.y.getText().length());
    }

    private void t() {
        Drawable drawable = null;
        if (this.h) {
            drawable = g.b("ic_name");
        } else {
            if (this.q == null || this.q.c == null) {
                return;
            }
            drawable = this.q.c instanceof Switch || this.q.c instanceof CheckBox || this.q.c instanceof RadioButton || this.q.c instanceof Button ? g.b("ic_type_btn") : (this.q.c instanceof EditText || this.q.c instanceof TextView ? g.b("ic_type_txt") : (this.q.c instanceof ImageView ? g.b("ic_type_img") : g.b("ic_type_elem")));
        }
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.y.setCompoundDrawables(drawable, null, null, null);
    }

    private void u() {
        this.N.setVisibility(this.ai ? 8 : 0);
        this.R.removeAllViews();
        if (this.ah.size() > 0) {
            this.R.addView((View)this.a(g.a("growing_label_select_text_no_group", new Object[0]), (Object)null));
            this.e();
            ((RadioButton)this.R.getChildAt(0)).setChecked(true);
            this.L.setVisibility(0);
            this.N.setVisibility(0);
        } else {
            this.L.setVisibility(this.ai ? 0 : 8);
            this.N.setVisibility(8);
        }
    }

    @TargetApi(value=14)
    private void v() {
        this.i = ct.a(this.q);
        this.p.setImageBitmap(this.i);
        this.p.setEnabled(this.i.getHeight() > this.al);
        this.ak = Math.max(this.al, this.i.getHeight());
        this.ak = Math.min(this.ak, com.growingio.android.sdk.utils.i.a(this.k, 400.0f));
        this.t();
        this.u();
        this.O.setChecked(false);
        this.P.setText((CharSequence)g.a("growing_label_expand_text", new Object[0]));
        if (this.q.q != null && !TextUtils.isEmpty((CharSequence)this.q.q.d)) {
            this.Z.setText((CharSequence)this.q.q.d);
            this.Z.setEnabled(true);
            this.aa.setChecked(true);
        } else {
            this.Z.setText((CharSequence)"");
            this.Z.setEnabled(false);
            this.aa.setChecked(false);
        }
        if (this.n != null) {
            this.ab.setText((CharSequence)this.n.c);
        }
        if (!this.q.m) {
            this.e(this.q);
            this.F.setVisibility(8);
            this.K.setChecked(true);
            this.M.setChecked(true);
        } else if (!this.as) {
            this.y.setText((CharSequence)("\u5217\u8868-\u7b2c" + (this.q.e + (this.q.q == null ? 1 : 0)) + "\u4f4d"));
            this.y.setSelection(this.y.getText().length());
            this.F.setVisibility(0);
            this.K.setChecked(true);
            this.M.setChecked(false);
        } else {
            this.e(this.q);
            this.F.setVisibility(0);
            this.K.setChecked(false);
            this.M.setChecked(false);
            if (this.y() && this.ah != null && !this.ah.isEmpty()) {
                this.y.setText((CharSequence)"\u5217\u8868-\u5404\u6807\u9898\u6570\u636e");
                this.y.setSelection(this.y.getText().length());
                if (this.ah.size() == 1) {
                    ((RadioButton)this.R.getChildAt(1)).setChecked(true);
                } else if (this.ah.size() > 1) {
                    this.at = true;
                    this.d(false);
                }
            }
        }
        this.a(this.M.isChecked());
        this.av = true;
    }

    private void c(boolean bl2) {
        this.E.setText((CharSequence)g.a(bl2 ? "growing_label_collapse_text" : "growing_label_expand_text", new Object[0]));
        if (this.at && bl2) {
            this.d(true);
        } else if (bl2) {
            this.w();
        } else {
            this.x();
        }
    }

    private void d(boolean bl2) {
        if (bl2) {
            this.B.setVisibility(0);
        }
        this.u.setEnabled(false);
        if (this.au) {
            return;
        }
        new de().a(this.k.getPackageName(), this.n.f.b, this.ah, new bi(this, bl2));
    }

    private void w() {
        if (this.h) {
            this.W.setVisibility(0);
            this.X.setVisibility(0);
            this.Y.setVisibility(TextUtils.isEmpty((CharSequence)this.g.g.f) ? 8 : 0);
        } else {
            this.B.setVisibility(8);
            this.F.setVisibility(this.q.m ? 0 : 8);
            this.N.setVisibility(this.ai ? 8 : 0);
            if (this.ah.size() > 0) {
                this.L.setVisibility(0);
                this.N.setVisibility(0);
            } else {
                this.L.setVisibility(this.ai ? 0 : 8);
                this.N.setVisibility(8);
            }
            this.J.setVisibility(this.c.size() > 1 ? 0 : 8);
            this.T.setVisibility(this.q.q != null && !TextUtils.isEmpty((CharSequence)this.q.q.d) ? 0 : 8);
            this.U.setVisibility(this.m != null && this.m.size() > 0 ? 0 : 8);
        }
    }

    private void x() {
        this.F.setVisibility(8);
        this.L.setVisibility(8);
        this.N.setVisibility(8);
        this.U.setVisibility(8);
        this.J.setVisibility(8);
        this.O.setChecked(false);
        this.B.setVisibility(8);
        this.T.setVisibility(8);
        this.W.setVisibility(8);
        this.X.setVisibility(8);
        this.Y.setVisibility(8);
    }

    private boolean y() {
        if (m.b(this.q.c) && this.q.c.getWidth() > this.k.getResources().getDisplayMetrics().widthPixels / 2 || m.c(this.q.c)) {
            return true;
        }
        return false;
    }

    private void a(View view, String string) {
        if (this.S == null) {
            this.S = new co(this.k);
        }
        if (!this.S.isShowing()) {
            this.S.a(view, string);
        }
    }

    private int a(String string, String string2) {
        StaticLayout staticLayout;
        int n2 = 8;
        float f2 = StaticLayout.getDesiredWidth((CharSequence)g.a(string, "\u2026"), (TextPaint)this.O.getPaint());
        int n3 = (int)((float)(this.k.getResources().getDisplayMetrics().widthPixels - com.growingio.android.sdk.utils.i.a(this.k, 92.0f)) - f2);
        if (n3 > 0 && ((n2 = (staticLayout = new StaticLayout((CharSequence)string2, this.O.getPaint(), n3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false)).getLineVisibleEnd(0)) > 8 || n2 <= 0)) {
            n2 = 8;
        }
        return n2;
    }

    private String a(double d2) {
        if (d2 > 999.0) {
            String string = this.b.format(d2);
            string = string.replaceAll("E[0-9]", d[Character.getNumericValue(string.charAt(string.length() - 1)) / 3]);
            while (string.length() > 4 || string.matches("[0-9]+\\.[a-z]")) {
                string = string.substring(0, string.length() - 2) + string.substring(string.length() - 1);
            }
            return string;
        }
        return this.a.format(d2);
    }

    private SpannableString b(String string) {
        String[] arrstring;
        if (TextUtils.isEmpty((CharSequence)string)) {
            return new SpannableString((CharSequence)"");
        }
        int n2 = string.length();
        SpannableString spannableString = new SpannableString((CharSequence)string);
        String string2 = string.substring(n2 - 1, n2);
        for (String string3 : arrstring = new String[]{"%", "k", "m", "b", "t"}) {
            if (!string2.equals(string3)) continue;
            spannableString.setSpan((Object)new AbsoluteSizeSpan(16, true), n2 - 1, n2, 33);
        }
        return spannableString;
    }

    static /* synthetic */ ListView a(ar ar2) {
        return ar2.t;
    }

    static /* synthetic */ void b(ar ar2) {
        ar2.q();
    }

    static /* synthetic */ boolean c(ar ar2) {
        return ar2.h;
    }

    static /* synthetic */ boolean d(ar ar2) {
        return ar2.as;
    }

    static /* synthetic */ View a(ar ar2, View view) {
        ar2.ax = view;
        return ar2.ax;
    }

    static /* synthetic */ Window e(ar ar2) {
        return ar2.aw;
    }

    static /* synthetic */ EditText f(ar ar2) {
        return ar2.y;
    }

    static /* synthetic */ Context g(ar ar2) {
        return ar2.k;
    }

    static /* synthetic */ void a(ar ar2, boolean bl2) {
        ar2.b(bl2);
    }

    static /* synthetic */ void h(ar ar2) {
        ar2.m();
    }

    static /* synthetic */ void a(ar ar2, i i2) {
        ar2.a(i2);
    }

    static /* synthetic */ f a(ar ar2, f f2) {
        ar2.n = f2;
        return ar2.n;
    }

    static /* synthetic */ List i(ar ar2) {
        return ar2.m;
    }

    static /* synthetic */ f j(ar ar2) {
        return ar2.n;
    }

    static /* synthetic */ ImageView k(ar ar2) {
        return ar2.p;
    }

    static /* synthetic */ boolean l(ar ar2) {
        return ar2.aj;
    }

    static /* synthetic */ int m(ar ar2) {
        return ar2.al;
    }

    static /* synthetic */ int n(ar ar2) {
        return ar2.ak;
    }

    static /* synthetic */ boolean b(ar ar2, boolean bl2) {
        ar2.aj = bl2;
        return ar2.aj;
    }

    static /* synthetic */ boolean o(ar ar2) {
        return ar2.an;
    }

    static /* synthetic */ boolean c(ar ar2, boolean bl2) {
        ar2.an = bl2;
        return ar2.an;
    }

    static /* synthetic */ void p(ar ar2) {
        ar2.g();
    }

    static /* synthetic */ boolean d(ar ar2, boolean bl2) {
        ar2.av = bl2;
        return ar2.av;
    }

    static /* synthetic */ void q(ar ar2) {
        ar2.k();
    }

    static /* synthetic */ RadioGroup r(ar ar2) {
        return ar2.R;
    }

    static /* synthetic */ Switch s(ar ar2) {
        return ar2.M;
    }

    static /* synthetic */ TextView t(ar ar2) {
        return ar2.Q;
    }

    static /* synthetic */ TextView u(ar ar2) {
        return ar2.P;
    }

    static /* synthetic */ void v(ar ar2) {
        ar2.f();
    }

    static /* synthetic */ void e(ar ar2, boolean bl2) {
        ar2.a(bl2);
    }

    static /* synthetic */ void f(ar ar2, boolean bl2) {
        ar2.c(bl2);
    }

    static /* synthetic */ void a(ar ar2, View view, String string) {
        ar2.a(view, string);
    }

    static /* synthetic */ EditText w(ar ar2) {
        return ar2.Z;
    }

    static /* synthetic */ void x(ar ar2) {
        ar2.l();
    }

    static /* synthetic */ void y(ar ar2) {
        ar2.h();
    }

    static /* synthetic */ int a(ar ar2, int n2) {
        ar2.ap = n2;
        return ar2.ap;
    }

    static /* synthetic */ void a(ar ar2, JSONArray jSONArray) {
        ar2.a(jSONArray);
    }

    static /* synthetic */ void a(ar ar2, Pair pair) {
        ar2.a(pair);
    }

    static /* synthetic */ boolean g(ar ar2, boolean bl2) {
        ar2.au = bl2;
        return ar2.au;
    }

    static /* synthetic */ ImageView z(ar ar2) {
        return ar2.u;
    }

    static /* synthetic */ boolean h(ar ar2, boolean bl2) {
        ar2.at = bl2;
        return ar2.at;
    }

    static /* synthetic */ List a(ar ar2, List list) {
        ar2.ah = list;
        return ar2.ah;
    }

    static /* synthetic */ RadioButton a(ar ar2, String string, Object object) {
        return ar2.a(string, object);
    }

    static /* synthetic */ void A(ar ar2) {
        ar2.e();
    }

    static /* synthetic */ void B(ar ar2) {
        ar2.w();
    }
}

