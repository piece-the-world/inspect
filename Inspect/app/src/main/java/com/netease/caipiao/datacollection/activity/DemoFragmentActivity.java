package com.netease.caipiao.datacollection.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.netease.caipiao.datacollection.C0268R;
import com.netease.caipiao.datacollection.fragments.DemoFragment1;
import com.netease.caipiao.datacollection.fragments.DemoFragment2;
import com.netease.caipiao.datacollection.fragments.JumpListener;
import com.netease.caipiao.dcsdk.event.ProtoEvent.WebViewMsg;

public class DemoFragmentActivity extends FragmentActivity implements JumpListener {
    private String dataPathTest;
    private boolean dataPathTestB0;
    private Boolean dataPathTestB1;
    private char dataPathTestC0;
    private Character dataPathTestC1;
    private float dataPathTestF0;
    private Float dataPathTestF1;
    private int dataPathTestI0;
    private Integer dataPathTestI1;
    private FragmentManager fragmentManager;

    public DemoFragmentActivity() {
        this.dataPathTest = "test view path!";
        this.dataPathTestI0 = 100;
        this.dataPathTestI1 = Integer.valueOf(200);
        this.dataPathTestB0 = false;
        this.dataPathTestB1 = Boolean.valueOf(false);
        this.dataPathTestF0 = 0.1f;
        this.dataPathTestF1 = Float.valueOf(0.2f);
        this.dataPathTestC0 = '0';
        this.dataPathTestC1 = Character.valueOf('1');
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0268R.layout.demo_fragment_activity);
        this.fragmentManager = getSupportFragmentManager();
        FragmentTransaction trans = this.fragmentManager.beginTransaction();
        trans.replace(C0268R.id.fl, new DemoFragment1());
        trans.commit();
    }

    public void jumpTo(int id) {
        switch (id) {
            case WebViewMsg.EVENTNAME_FIELD_NUMBER /*1*/:
                FragmentTransaction trans1 = this.fragmentManager.beginTransaction();
                trans1.replace(C0268R.id.fl, new DemoFragment1());
                trans1.addToBackStack("deomfragment");
                trans1.commit();
            case WebViewMsg.EVENTTIME_FIELD_NUMBER /*2*/:
                FragmentTransaction trans2 = this.fragmentManager.beginTransaction();
                trans2.replace(C0268R.id.fl, new DemoFragment2());
                trans2.addToBackStack("deomfragment2");
                trans2.commit();
            default:
        }
    }

    public int getDataPathTestI1() {
        return this.dataPathTestI0;
    }
}
