/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Rect
 *  android.os.AsyncTask
 *  android.os.Message
 *  android.text.TextUtils
 *  android.util.Log
 *  android.view.View
 *  android.webkit.ConsoleMessage
 *  android.webkit.GeolocationPermissions
 *  android.webkit.GeolocationPermissions$Callback
 *  android.webkit.JsPromptResult
 *  android.webkit.JsResult
 *  android.webkit.PermissionRequest
 *  android.webkit.ValueCallback
 *  android.webkit.WebChromeClient
 *  android.webkit.WebChromeClient$CustomViewCallback
 *  android.webkit.WebChromeClient$FileChooserParams
 *  android.webkit.WebSettings
 *  android.webkit.WebStorage
 *  android.webkit.WebStorage$QuotaUpdater
 *  android.webkit.WebView
 *  com.tencent.smtt.sdk.WebChromeClient
 *  com.tencent.smtt.sdk.WebSettings
 *  com.tencent.smtt.sdk.WebView
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.collection;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import com.growingio.android.sdk.b.d;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.ct;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.VdsJsHelper$VdsBridge;
import com.growingio.android.sdk.collection.ag;
import com.growingio.android.sdk.collection.ak;
import com.growingio.android.sdk.collection.al;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.utils.LogUtil;
import com.growingio.android.sdk.utils.a;
import com.tencent.smtt.sdk.WebView;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

class VdsJsHelper
extends WebChromeClient
implements Runnable {
    private String a;
    private String b;
    private WeakReference c;
    private final int d = 1000;
    private WebChromeClient e;
    private Object f;
    private Object g;
    private i h;
    private boolean i = false;
    private boolean j = false;
    private static boolean k = false;

    public VdsJsHelper(View view) {
        this.c = new WeakReference<View>(view);
        this.a(view);
    }

    public boolean isReturnedData() {
        return this.j;
    }

    public void update(i i2, boolean bl2) {
        if (i2 == null) {
            this.h = null;
        } else {
            this.b = c.h().o();
            if (this.b == null) {
                return;
            }
            boolean bl3 = this.h == null;
            this.h = i2.c();
            this.c = new WeakReference<View>(i2.c);
            if (this.i || bl3) {
                this.i = false;
                i2.c.removeCallbacks((Runnable)this);
                i2.c.postDelayed((Runnable)this, 1000);
                if (GConfig.a) {
                    Log.d((String)"VdsJsHelper", (String)"update: hook WebView after 1000ms");
                }
            } else if (this.j && bl2) {
                if (GConfig.a) {
                    Log.d((String)"VdsJsHelper", (String)("update: get impression from WebView " + (Object)i2.c));
                }
                com.growingio.android.sdk.utils.i.a(i2.c, "_vds_hybrid.impressAllElements", true);
            }
        }
        this.a();
    }

    @Override
    public void run() {
        View view = (View)this.c.get();
        if (view != null) {
            if (this.h != null) {
                try {
                    boolean bl2 = j.e().b();
                    String string = ag.a().b();
                    if (view instanceof android.webkit.WebView) {
                        android.webkit.WebView webView = (android.webkit.WebView)view;
                        webView.loadUrl(this.a(webView.getContext()));
                        if (bl2 && string != null) {
                            webView.loadUrl(string);
                        }
                    } else if (a.c((Object)view)) {
                        WebView webView = (WebView)view;
                        webView.loadUrl(this.a(webView.getContext()));
                        if (bl2 && string != null) {
                            webView.loadUrl(string);
                        }
                    }
                }
                catch (Exception var2_3) {
                    var2_3.printStackTrace();
                }
            } else {
                this.i = true;
                LogUtil.d("VdsJsHelper", "null ViewNode, re-hook when node ready");
            }
        } else {
            LogUtil.d("VdsJsHelper", "null WebView, hook cancelled");
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @TargetApi(value=11)
    private String a(Context context) {
        if (!k) {
            this.b(context);
            k = true;
        }
        if (!TextUtils.isEmpty((CharSequence)this.a)) {
            return this.a;
        }
        FileInputStream fileInputStream = null;
        try {
            int n2;
            fileInputStream = new FileInputStream(this.c(context));
            StringBuilder stringBuilder = new StringBuilder(19200);
            stringBuilder.append("javascript:");
            byte[] arrby = new byte[4096];
            while ((n2 = fileInputStream.read(arrby)) > 0) {
                stringBuilder.append(new String(arrby, 0, n2));
            }
            String string = this.a = stringBuilder.toString();
            return string;
        }
        catch (IOException var3_4) {}
        finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            }
            catch (IOException var7_9) {}
        }
        return "javascript:!function(){function e(){this.init=t,this.traverse=n,this.hitTest=o,this.showMaskView=a,this.hideMaskView=s,this.hoverOn=r,this.viewWidth=0,this.lastViewNode={}}function t(){this.hoverMaskView=document.createElement(\"div\"),this.hoverMaskView.id=\"vds-mask-view\",this.hoverMaskView.style.position=\"fixed\",this.hoverMaskView.style.backgroundColor=\"rgba(255, 72, 36, 0.3)\",this.hoverMaskView.style.borderRadius=\"3px\",this.hoverMaskView.style.border=\"rgba(255, 72, 36,0.78) solid 1px\",this.hoverMaskView.setAttribute(\"growing-ignore\",\"\"),this.hoverMaskView.style.margin=\"0\",this.hoverMaskView.style.padding=\"0\",this.hoverMaskView.style.width=\"0\",this.hoverMaskView.style.height=\"0\",this.hoverMaskView.style.left=\"0\",this.hoverMaskView.style.zIndex=\"99999\",this.hoverMaskView.style.display=\"none\"}function i(e){var t,i,n,r,o;return 1===d.blacklistedTags[e.tagName]||e.hasAttribute(\"growing-ignore\")?!1:d.isLeaf(e)&&(null!=(i=e.innerText)?i.trim().length:void 0)<50?!(0===(null!=(n=e.innerText)?n.trim().length:void 0)&&(rect=e[u],o=rect.width,t=rect.height,o>.5*window.innerWidth&&t>=.5*window.innerHeight)):!(!d.isParentOfLeaf(e)||!((null!=(r=e.innerText)?r.trim().length:void 0)>0||e.hasAttributes()))}function n(e,t,r){var a=e.childNodes;if(e!=document.body&&o(e,t,r)&&(\"INPUT\"!=e.nodeName||\"submit\"==e.type||\"button\"==e.type)&&\"vds-mask-view\"!=e.id&&i(e)&&l.push(e),a)for(var s=0;s<=a.length-1;s++)e.nodeName&&\"SCRIPT\"!=e.nodeName&&3!==e.nodeType&&n(a[s],t,r)}function r(e,t){if(e!=this.curX||t!=this.curY){if(this.curX=e,this.curY=t,d.circling=!0,d.isMoving=!0,!h&&d.setShowCircledTags&&(h=d.setShowCircledTags(!1)),l.splice(0,l.length),n(document.body,e,t),c=!1,l.length>0){var i=l[l.length-1];if(i&&\"BODY\"!=i.tagName&&!i.hasAttribute(\"growing-ignore\"))return this.hoveredElem=i,void this.showMaskView(this.hoveredElem)}this.hoveredElem=null,this.hideMaskView()}}function o(e,t,i){if(e.getBoundingClientRect){var n=e[u];return n&&!c||(n=e.getBoundingClientRect(),e[u]=n),n.left<=t&&n.right>t&&n.top<=i&&n.bottom>i}}function a(e){if(e.getBoundingClientRect){this.hoverMaskView.parentNode||document.body.appendChild(this.hoverMaskView);var t=e.getBoundingClientRect();this.hoverMaskView.style.left=t.left+\"px\",this.hoverMaskView.style.top=t.top+\"px\",this.hoverMaskView.style.width=t.width+\"px\",this.hoverMaskView.style.height=t.height+\"px\",this.hoverMaskView.style.display=\"block\"}}function s(){this.hoverMaskView.style.display=\"none\",c=!0}if(!window._vds_hybrid){_vds_hybrid_config=window._vds_hybrid_config||{},_vds_hybrid_config.imp=void 0==_vds_hybrid_config.imp||_vds_hybrid_config.imp;var d={blacklistedClassRegex:/^(clear|clearfix|active|hover|enabled|hidden|display|focus|disabled|ng-|growing-)/,IMPRESSED_FLAG:\"_impressed_\",blacklistedTags:{SCRIPT:1,STYLE:1,NOSCRIPT:1,IFRAME:1,BR:1,FONT:1,SVG:1,CANVAS:1,svg:1,canvas:1,tspan:1,text:1,g:1,rect:1,path:1,defs:1,clipPath:1,desc:1,title:1},listTags:[\"TR\",\"LI\",\"DL\"],supportedClickTags:[\"I\",\"SPAN\"],supportedIconTags:[\"A\",\"BUTTON\"],bind:function(e,t){return function(){return e.apply(t,arguments)}},TaggingNode:function(){function e(e){var t,i;this.node=e,this.name=e.tagName.toLowerCase(),t=null!=(i=e.getAttribute(\"class\"))?i.replace(/(^| )(clear|clearfix|active|hover|enabled|hidden|display|focus|disabled|ng-|growing-)[^\\. ]*/g,\"\").trim():void 0,(null!=t?t.length:void 0)>0&&(this.klass=t.split(/\\s+/).sort()),d.utils.hasAttr(e,\"id\")&&null===e.getAttribute(\"id\").match(/^[0-9]/)&&(this.id=e.getAttribute(\"id\")),d.utils.hasAttr(e,\"href\")&&(this.href=e.getAttribute(\"href\"))}return e.prototype.path=function(){var e,t,i,n,r;if(n=\"/\"+this.name,null!=this.id&&(n+=\"#\"+this.id),null!=this.klass)for(r=this.klass,e=0,i=r.length;i>e;e++)t=r[e],n+=\".\"+t;return n},e}(),path:function(e){var t,i,n,r;for(i=\"\",t=new d.TaggingNode(e);\"body\"!==t.name&&\"html\"!==t.name&&(n=t.path(),i=n+i,r=t.node.parentNode,r&&r.tagName);)t=new d.TaggingNode(r);return i},index:function(e){var t,i,n,r,o,a,s;for(o=e;o&&\"BODY\"!==o.tagName&&-1===d.utils.indexOf(d.listTags,o.tagName);)o=o.parentNode;if(o)for(a=o.parentNode,i=1,s=a.childNodes,t=0,n=s.length;n>t;t++)if(r=s[t],r.tagName===o.tagName){if(r===o)return i;i+=1}},isLeaf:function(e){var t,i,n,r;if(e.hasChildNodes())for(r=e.childNodes,i=0,n=r.length;n>i;i++)if(t=r[i],1===t.nodeType)return!1;return!0},isParentOfLeaf:function(e){var t,i,n,r;if(!e.childNodes)return!1;for(r=e.childNodes,i=0,n=r.length;n>i;i++)if(t=r[i],!d.isLeaf(t))return!1;return!0},DomObserver:function(){function e(){this.pendingScanNodes=!1,this.trackPageView=d.bind(this.trackPageView,this)}return e.prototype.registerDomObserver=function(){var e={impressNodes:function(e){return function(t,i,n,r){var o,a,s,l,h;if(e.currentPath=d.utils.path(),e.currentQuery=d.utils.query(),i&&!n&&e.trackPageView(0,!0),n||_vds_hybrid_config.imp){for(h={t:n?\"snap\":\"imp\",d:window.location.host,tm:+Date.now(),ptm:e.pageLoaded,p:e.currentPath},e.currentQuery.length>0&&(h.q=e.currentQuery),a=[],s=0,l=t.length;l>s;s++)o=t[s],o&&(a=a.concat(e.getLeafNodes(o,t.length,i,n)));if(h.e=a,void 0!=r&&(h.seqid=r),a.length>0){if(n&&d.isMoving){var c=[],u=d.circleHelper.curX,f=d.circleHelper.curY;window._vds_bridge&&(u*=devicePixelRatio,f*=devicePixelRatio);for(var s=0;s<a.length;s++){var g=a[s];u>=g.ex&&u<=g.ex+g.ew&&f>=g.ey&&f<=g.ey+g.eh&&c.push(g)}h.e=c}n&&window._vds_bridge?_vds_bridge.hoverNodes(JSON.stringify(h)):e.send(h)}else window._vds_ios&&n&&e.send({seqid:r})}}}(this)};if(d.TreeMirror=new d.TreeMirrorClient(document.body,e),d.track||(d.track=function(e){return function(t,i){if(t&&i){var n={t:\"cstm\",d:window.location.host,p:e.currentPath,ptm:e.pageLoaded,tm:+Date.now(),n:t};e.currentQuery&&(n.q=e.currentQuery),n.e=i,window._vds_ios?e.send(n):window._vds_bridge&&_vds_bridge.saveCustomEvent(JSON.stringify(n))}}}(this),\"function\"==typeof window.vdsHybridReadyCallback&&window.vdsHybridReadyCallback(d.track)),void 0==_vds_hybrid_config.imp||_vds_hybrid_config.imp)if(window.MutationObserver){var t=new MutationObserver(function(e){var t=[];try{e.forEach(function(e){t=\"attributes\"===e.type?t.concat(d.TreeMirror.serializeAdded([e.target])):t.concat(d.TreeMirror.serializeAdded(e.addedNodes))}),t.length>0&&d.TreeMirror.mirror.impressNodes(t)}catch(i){console.log(i)}});t.observe(document.body,{childList:!0,attributes:!0,subtree:!0,attributeFilter:[\"class\",\"style\"]})}else d.scanNodesAfterClick=!0},e.prototype.getLeafNodes=function(e,t,i,n){var r,o,a,s,l,h,c,u,f;if(a=[],h=!0,e.leaf)1===e.nodeType&&((null!=(c=e.attributes)?c.href:void 0)||null!=e.text)&&(i||!e.known||n)&&(l=this.nodeMessage(e,!0,n),t>1&&(l.idx=e.idx),a.push(l));else{for(u=e.childNodes,childLeafs=[],o=0,s=u.length;s>o;o++)r=u[o],r.leaf||(h=!1),childLeafs=childLeafs.concat(this.getLeafNodes(r,e.childNodes.length,i,n));d.isMoving&&(a=a.concat(childLeafs)),h&&(n||(null!=(f=e.attributes)?f.any:void 0))&&(i||!e.known||n)&&(e.text=d.utils.parentOfLeafText(e),e.childNodes&&e.childNodes.length>0&&e.childNodes[0].idx&&(e.idx=e.childNodes[0].idx),l=this.nodeMessage(e,!1,n),a.push(l)),d.isMoving||(a=a.concat(childLeafs))}return a},e.prototype.nodeMessage=function(e,t,i){var n,r,o,a,s,l,h;return r={x:e.path},i&&(r.ex=e.ex,r.ey=e.ey,r.ew=e.ew,r.eh=e.eh,r.nodeType=\"hybrid\"),(null!=(o=e.text)?o.length:void 0)>0?r.v=null!=(a=e.text)?a.slice(0,40):void 0:t||0!==(null!=(s=e.text)?s.length:void 0)||-1===d.utils.indexOf(d.supportedIconTags,e.tagName)||(h=e.dom,h&&(polt=null!=(l=h.innerText)?l.trim():void 0,polt&&polt.length>0&&polt.length<50&&(r.v=polt))),(n=e.attributes)&&n.href&&0!==n.href.indexOf(\"javascript\")&&(r.h=d.utils.normalizePath(n.href.slice(0,320)),delete e.attributes.href),e.idx&&(r.idx=e.idx),r},e.prototype.registerEventListener=function(){var e,t,i,n,r,o,a,s;n={click:\"clck\",change:\"imp\"},s={tspan:1,text:1,g:1,rect:1,path:1,defs:1,clipPath:1,desc:1,title:1},t=[\"TEXTAREA\",\"HTML\",\"BODY\"],o=[\"button\",\"submit\"],a=[\"A\",\"BUTTON\",\"INPUT\",\"IMG\"],r=[\"radio\",\"checkbox\"],e=function(e,t,i){return e.addEventListener?e.addEventListener(t,i,!0):e.attachEvent?e.attachEvent(\"on\"+t,i):e[\"on\"+t]=i},i=function(e){return function(i){var l,h,c,u,f,g,p,v,m,w,y,b,N,x;if(!document.body.className.match(/\\bvds-entrytext\\b/)){if(N=i.target||i.srcElement,N.hasAttribute(\"growing-ignore\"))return;for(;N&&1===s[N.tagName]&&N.parentNode;)N=N.parentNode;if(-1!==d.utils.indexOf(d.supportedClickTags,N.tagName)&&N.parentNode&&-1!==d.utils.indexOf(d.supportedIconTags,N.parentNode.tagName)&&(N=N.parentNode),b=N.tagName,\"click\"===i.type){if(-1!==d.utils.indexOf(t,b))return;if(\"INPUT\"===b&&-1===d.utils.indexOf(o,N.type))return;if(-1===d.utils.indexOf(a,b)&&!d.isLeaf(N)&&!d.isParentOfLeaf(N))return}if(v={d:window.location.host,ptm:e.pageLoaded,tm:+Date.now()},v.t=n[i.type],v.p=e.currentPath,e.currentQuery.length>0&&(v.q=e.currentQuery),l={},d.circling&&(l.nodeType=\"hybrid\"),l.x=d.path(N),-1===l.x.indexOf(\"/dl\")&&-1===l.x.indexOf(\"/tr\")&&-1===l.x.indexOf(\"/li\")||(l.idx=d.index(N)),d.utils.hasAttr(N,\"href\")&&(h=N.getAttribute(\"href\"),h&&(l.h=d.utils.normalizePath(h.slice(0,320)))),\"click\"===i.type&&N.getBoundingClientRect){var T=N.getBoundingClientRect();l.ex=T.left,l.ey=T.top,l.ew=T.width,l.eh=T.height}if(\"click\"===i.type&&d.isLeaf(N))\"IMG\"===b?(-1===(null!=(w=N.src)?w.indexOf(\"data:image\"):void 0)&&(l.h=N.src),N.alt?l.v=N.alt:l.h&&(f=l.h.split(\"?\")[0],u=f.split(\"/\"),u.length>0&&(l.v=u[u.length-1]))):\"INPUT\"===b?l.v=N.value:null!=N.textContent?(x=N.textContent.trim(),x.length>0&&x.length<50&&(l.v=x)):null!=N.innerText&&(x=N.innerText.trim(),x.length>0&&x.length<50?l.v=x:\"A\"===b&&(l.v=x.slice(0,30)));else if(\"change\"===i.type&&\"TEXTAREA\"!==b&&(\"INPUT\"===b&&-1!==d.utils.indexOf(r,N.type)||\"SELECT\"===b))l.v=N.value;else if(\"submit\"===i.type)for(y=N.getElementsByTagName(\"input\"),c=0,p=y.length;p>c;c++)g=y[c],\"search\"!==g.type&&(\"text\"!==g.type||\"q\"!==g.id&&-1===g.id.indexOf(\"search\")&&-1===g.className.indexOf(\"search\")&&\"q\"!==g.name&&-1===g.name.indexOf(\"search\"))||(l.x=d.path(g),l.v=g.value.trim());else\"click\"===i.type&&d.isParentOfLeaf(N)&&(m=d.utils.parentOfLeafText(N),m.length>0&&m.length<50?l.v=m:0===m.length&&-1!==d.utils.indexOf(d.supportedIconTags,b)&&(m=N.innerText.trim(),m.length>0&&m.length<50&&(l.v=m)));return v.e=[l],\"click\"===i.type&&d.scanNodesAfterClick&&(e.pengdingScanTimeout&&clearTimeout(e.pengdingScanTimeout),e.pendingScanNodes=!0,e.pengdingScanTimeout=setTimeout(function(){return e.pendingScanNodes=!1,e.scanNewNodes()},500)),e.send(v)}}}(this);var l=[];for(var h in n)l.push(e(document,h,i));return l},e.prototype.scanNewNodes=function(){d.impressAllElements(!1)},e.prototype.trackPageView=function(e,t){var i;return null==e&&(e=0),(null==this.pageLoaded||t)&&(this.pageLoaded=+Date.now()),i={v:document.title.slice(0,255),t:\"page\",d:window.location.host,tm:this.pageLoaded,p:this.currentPath,rp:document.referrer},this.currentQuery||(this.currentQuery=d.utils.query()),this.currentQuery.length>0&&(i.q=this.currentQuery),e>0&&(i.fl=e),this.send(i)},e.prototype.registerHistoryHandler=function(){var e,t;return e=window.history.pushState,t=window.history.replaceState,null!=e&&(window.history.pushState=function(t){return function(){return t.prevUrl=window.location.toString(),e.apply(window.history,arguments),t.pageChanged()}}(this)),null!=t&&(window.history.replaceState=function(e){return function(){return e.prevUrl=window.location.toString(),t.apply(window.history,arguments),e.pageChanged()}}(this)),null!=e&&(this.prevUrl=document.referrer,\"function\"==typeof Object.defineProperty&&Object.defineProperty(document,\"referrer\",{get:function(e){return function(){return e.prevUrl}}(this),configurable:!0}),d.utils.bind(window,\"popstate\",d.bind(this.pageChanged,this),!0)),_vds_hybrid_config.hashtag?d.utils.bind(window,\"hashchange\",d.bind(this.pageChanged,this),!0):void 0},e.prototype.pageChanged=function(){var e,t;e=d.utils.path(),t=d.utils.query(),this.currentPath===e&&this.currentQuery===t||(_vds_hybrid_config.hashtag&&(this.prevUrl=window.location.protocol+\"//\"+window.location.host+this.currentPath+this.currentQuery),this.currentPath=e,this.currentQuery=t,this.pageLoaded=+Date.now(),this.trackPageView(1))},e.prototype.domLoadedHandler=function(e){return this.domLoadedHandler.done?void 0:(this.domLoadedHandler.done=!0,this.registerEventListener(),setTimeout(function(e){return function(){return e.registerDomObserver()}}(this),1e3),window.history.pushState&&this.registerHistoryHandler(),this)},e.prototype.blind=function(){var e;return e=!1},e.prototype.observe=function(e){var t,i,n,r;if(this.send=e,this.currentPath=d.utils.path(),this.currentQuery=d.utils.query(),this.trackPageView(),document.addEventListener)\"interactive\"===document.readyState||\"complete\"===document.readyState?this.domLoadedHandler():d.utils.bind(document,\"DOMContentLoaded\",function(e){return function(){return e.domLoadedHandler()}}(this));else if(document.attachEvent){d.utils.bind(document,\"onreadystatechange\",function(e){return function(){return e.domLoadedHandler()}}(this)),r=!1;try{r=null===window.frameElement}catch(n){i=n}document.documentElement.doScroll&&r&&(t=function(e){return function(){var n;try{document.documentElement.doScroll(\"left\")}catch(n){return i=n,void setTimeout(t,1)}return e.domLoadedHandler()}}(this))()}d.utils.bind(window,\"load\",function(e){return function(){return e.domLoadedHandler()}}(this)),d.utils.bind(window,\"beforeunload\",function(e){return function(t){var i,n;if(e.pendingScanNodes)for(e.scanNewNodes(),n=+Date.now(),i=n+300;i>n;)n=+Date.now()}}(this))},e}()};window._vds_hybrid=d,window._vds_hybrid.TreeMirrorClient=function(){function e(e,t,i){this.target=e,this.mirror=t,this.impressAllNode()}var t=[\"button\",\"submit\"];return e.prototype.impressAllNode=function(e,t,i){var n=this.serializeTarget(t);this.mirror.impressNodes(n,e,t,i)},e.prototype.serializeTarget=function(e){for(var t=[],i=this.target.firstChild;i;i=i.nextSibling){var n=this.serializeNode(i,!0,void 0,void 0,e);null!==n&&t.push(n)}return t},e.prototype.serializeAdded=function(e,t){var i=this,n=e;if(0===n.length)return[];for(var r=[],o=0;o<n.length;o++){var a=n[o];if(3==a.nodeType&&(a=a.parentNode),1==a.nodeType&&a!=document.body&&a&&1!==d.blacklistedTags[a.tagName]){var s=a.parentNode;if(s&&1==s.nodeType){var l=s.getAttribute(\"id\"),h=s.getAttribute(\"class\"),c=a.getAttribute(\"class\");if(!l||-1===l.toLowerCase().indexOf(\"clock\")&&-1===l.toLowerCase().indexOf(\"countdown\"))if(!h||-1===h.toLowerCase().indexOf(\"clock\")&&-1===h.toLowerCase().indexOf(\"countdown\"))if(s.getAttribute(\"data-countdown\"));else if(c&&-1!==c.indexOf(\"daterangepicker\"));else if(a.hasAttribute(\"growing-ignore\"));else{for(;s&&\"BODY\"!==s.tagName&&1==s.nodeType&&!s.hasAttribute(\"growing-ignore\");)s=s.parentNode;\"BODY\"===s.tagName&&r.push(a)}else;else;}}}var u=[];return r.forEach(function(e){for(var n=void 0,r=e;r&&\"BODY\"!==r.tagName&&-1===d.listTags.indexOf(r.tagName);)r=r.parentNode;if(r&&\"BODY\"!==r.tagName)for(var o=r.parentNode,a=1,s=o.childNodes[a-1];a<=o.childNodes.length;a++)if(s.tagName===r.tagName&&s===r){n=a;break}var l=i.serializeNode(e,!0,void 0,n,t);u.push(l)}),u},e.prototype.serializeNode=function(e,i,n,r,o){if(null===e)return null;if(1===d.blacklistedTags[e.tagName])return null;if(void 0===n){n=\"/\";for(var a=e.parentElement;a&&\"BODY\"!==a.tagName&&\"HTML\"!==a.tagName;){var s=\"/\"+a.tagName.toLowerCase(),l=a.getAttribute(\"id\");if(l&&null===l.match(/^[0-9]/)&&(s+=\"#\"+l),a.hasAttribute(\"class\"))for(var h=a.getAttribute(\"class\").trim().split(/\\s+/).sort(),c=0;c<h.length;c++)h[c].length>0&&null===d.blacklistedClassRegex.exec(h[c])&&(s+=\".\"+h[c]);n=s+n,a=a.parentElement}}var u={nodeType:e.nodeType};switch(1===u.nodeType&&-1!==d.supportedIconTags.indexOf(e.tagName)&&(u.dom=e),u.nodeType){case 10:var f=e;u.name=f.name,u.publicId=f.publicId,u.systemId=f.systemId;break;case 8:return null;case 3:if(\"/\"===n||0===e.textContent.trim().length)return null;u.textContent=e.textContent.trim(),u.textContent.length>0&&(u.leaf=!0,u.text=u.textContent,u.path=n.slice(0,-1));break;case 1:if(\"none\"===window.getComputedStyle(e).display&&\"A\"!==e.tagName&&null===e.querySelector(\"a\"))return null;var g=e;if(u.tagName=g.tagName,u.attributes={any:g.hasAttributes()},o&&g.getBoundingClientRect){var p=g.getBoundingClientRect();d.circleHelper.scaleFactor?(u.ex=p.left/d.circleHelper.scaleFactor,u.ey=p.top/d.circleHelper.scaleFactor,u.ew=p.width/d.circleHelper.scaleFactor,u.eh=p.height/d.circleHelper.scaleFactor):window._vds_bridge?(u.ex=p.left*devicePixelRatio,u.ey=p.top*devicePixelRatio,u.ew=p.width*devicePixelRatio,u.eh=p.height*devicePixelRatio):(u.ex=p.left,u.ey=p.top,u.ew=p.width,u.eh=p.height)}if(u.known=g[d.IMPRESSED_FLAG],u.known||(g[d.IMPRESSED_FLAG]=1),n+=g.tagName.toLowerCase(),g.hasAttribute(\"id\")&&null===g.getAttribute(\"id\").match(/^[0-9]/)&&(n+=\"#\"+g.getAttribute(\"id\")),g.hasAttribute(\"class\")){h=g.getAttribute(\"class\").trim().split(/\\s+/).sort();for(var c=0;c<h.length;c++)h[c].length>0&&null===d.blacklistedClassRegex.exec(h[c])&&(n+=\".\"+h[c])}g.hasAttribute(\"href\")&&(u.attributes.href=g.getAttribute(\"href\"));var v,m=!0;if(n+=\"/\",i)if(g.childNodes.length>0){if(u.childNodes=[],g.hasAttribute(\"growing-ignore\"))return null;for(var w=0,y=g.firstChild;y;y=y.nextSibling)if(1!==y.nodeType||!y.hasAttribute(\"growing-ignore\")){-1!==d.listTags.indexOf(y.tagName)&&(w+=1);var b;if(b=w>0?this.serializeNode(y,!0,n,w,o):this.serializeNode(y,!0,n,r,o),null===b)m=!1;else if(\"undefined\"!=typeof b.childNodes){m=!1,v=!0;for(var N=0;N<b.childNodes.length;N++)if(b.childNodes[N].tagName){v=!1;break}v&&r&&(b.idx=r),u.childNodes.push(b)}else{if((0===g.offsetWidth||0===g.offsetHeight)&&\"A\"!==g.tagName)return null;b.leaf&&(r&&(b.idx=r),u.childNodes.push(b))}}}else u.childNodes=[];else{if(g.hasChildNodes()){for(var x=!0,c=0;c<g.childNodes.length;c++)if(1===g.childNodes[c].nodeType&&(m=!1,g.childNodes[c].hasChildNodes()))for(var N=0;N<g.childNodes[c].childNodes.length;N++)if(1===g.childNodes[c].childNodes[N].nodeType){x=!1;break}if(!m&&(u.parent_of_leaf=x,x)){for(var T=\"\",_=\"\",c=0;c<g.childNodes.length;c++)3===g.childNodes[c].nodeType&&(_=g.childNodes[c].textContent.trim(),_.length>0&&(T+=_+\" \"));T=T.trim(),T.length>0&&(u.text=T)}}if(-1!==n.indexOf(\"/dl\")||-1!==n.indexOf(\"/tr\")||-1!==n.indexOf(\"/li\")){for(var k=g;k&&\"BODY\"!==k.tagName&&-1===d.listTags.indexOf(k.tagName);)k=k.parentNode;if(k){var O,A,C,L=k.parentNode,M=1;for(O=0,A=L.childNodes.length;A>O;O++)C=L.childNodes[O],C.tagName===k.tagName&&(C===k&&(u.idx=M),M+=1)}}}if(m)if(u.idx=r,u.leaf=!0,\"IMG\"===g.tagName){if(g.src&&-1===g.src.indexOf(\"data:image\")&&(u.attributes.href=g.src),g.alt)u.text=g.alt;else if(u.attributes.href){var P=u.attributes.href.split(\"?\")[0];if(P){var E=P.split(\"/\");E.length>0&&(u.text=E[E.length-1])}}}else if(\"INPUT\"===g.tagName&&-1!==t.indexOf(g.type))u.text=g.value;else{var S=g.textContent.trim();if(!o&&0===S.length&&\"I\"!==g.tagName&&\"A\"!==g.tagName&&\"BUTTON\"!==g.tagName)return null;u.text=S}u.path=n.slice(0,-1)}return u},e}(),window._vds_hybrid.utils={bind:function(e,t,i,n){return null==n&&(n=!1),null!=document.addEventListener?e.addEventListener(t,i,n):null!=document.attachEvent?e.attachEvent(\"on\"+t,function(){var t;return t=window.event,t.currentTarget=e,t.target=t.srcElement,i.call(e,t)}):e[\"on\"+t]=i},hasAttr:function(e,t){return e.hasAttribute?e.hasAttribute(t):!!e[t]},path:function(){var e,t;return t=this.normalizePath(window.location.pathname),_vds_hybrid_config.hashtag?(e=window.location.hash,t+=-1!==e.indexOf(\"?\")?e.split(\"?\")[0]:e):t},normalizePath:function(e){var t;return t=e.length,t>1&&\"/\"===e[t-1]?e.slice(0,t-1):e},query:function(){var e;return e=window.location.search,e.length>1&&\"?\"===e[0]?e.slice(1):e},isEmpty:function(e){var t;return!function(){var i,n,r;for(r=[],i=0,n=e.length;n>i;i++)t=e[i],r.push(e.hasOwnProperty(t));return r}()},parentOfLeafText:function(e){var t,i,n,r,o,a;if(n=\"\",!e.childNodes)return\"\";for(a=e.childNodes,r=0,o=a.length;o>r;r++)t=a[r],3===t.nodeType&&(null!=t.textContent?i=t.textContent.trim():null!=t.data&&(i=t.data.trim()),i.length>0&&(n+=i+\" \"));return n=n.trim()},indexOf:function(e,t){var i,n,r;if(null!=Array.prototype.indexOf)return e.indexOf(t);for(n=e.length,i=-1;++i<n;)if(r=e[i],r===t)return i;return-1}};var l=[],h=!1,c=!0,u=\"_bounding_rect_\";d.cancelHover=function(){d.circleHelper.hideMaskView(),h&&(h=!1,d.setShowCircledTags(!0))},d.findElementAtPoint=function(e){d.circleHelper.hideMaskView();var t=[];if(l&&l.length>0){if(l.length>1){for(var i=[],n=0;n<l.length;n++){for(var r=!1,o=l.length-1;o>=0;o--)if(n!=o&&l[o]==l[n].parentNode){r=!0;break}r||i.push(l[n])}l=i}for(var n=l.length-1;n>=0;n--){var a=l[n],s=d.path(a);if(-1!==s.indexOf(\"/dl\")||-1!==s.indexOf(\"/tr\")||-1!==s.indexOf(\"/li\"))var h=d.index(a);var c=d.TreeMirror.serializeNode(a,!0,void 0,h,!0);c&&t.push(c)}d.TreeMirror.mirror.impressNodes(t,!0,!0,e)}else window._vds_ios&&d.sendQueue({seqid:e});d.isMoving=!1},d.snapshotAllElements=function(e){d.circling=!0,d.TreeMirror.impressAllNode(!0,!0,e)},d.impressAllElements=function(e,t){d.TreeMirror.impressAllNode(e,!1,t)};var f=new e;f.init(),window._vds_hybrid.circleHelper=f,window._vds_bridge?d.hoverOn=function(e,t){d.circleHelper.hoverOn(e/devicePixelRatio,t/devicePixelRatio)}:window._vds_ios&&(d.hoverOn=function(e,t,i){d.circleHelper.hoverOn(e,t,i)},d.eventCount=0,d.readyToSend=!0,d.messageQueue=[],d.sendQueue=function(e){d.UIWebView?d.readyToSend?d.sendWithIFrame([e]):d.messageQueue.push(e):window.webkit.messageHandlers.GrowingIO_WKWebView.postMessage([e])},d.sendWithIFrame=function(e){d.readyToSend=!1;var t=encodeURI(\"/growinghybridsdk-\"+d.eventCount++ +\"?\"+JSON.stringify(e));d.dataFrame?d.dataFrame.src=t:(d.dataFrame=document.createElement(\"IFRAME\"),d.dataFrame.style.width=0,d.dataFrame.style.height=0,d.dataFrame.style.margin=0,d.dataFrame.style.padding=0,d.dataFrame.style.border=0,d.dataFrame.style.position=\"fixed\",d.dataFrame.style.display=\"none\",d.dataFrame.src=t,document.body.appendChild(d.dataFrame))},d.pollEvents=function(){d.messageQueue.length>0?(d.sendWithIFrame(d.messageQueue),d.messageQueue=[]):d.readyToSend=!0}),d.getPageInfo=function(){var e={d:location.host,p:d.utils.path(),q:d.utils.query(),v:document.title.slice(0,255)};return window._vds_ios?JSON.stringify(e):e},d.startTracing=function(e){d.tracker||(d.tracker=new d.DomObserver,window._vds_bridge?d.tracker.observe(function(e){_vds_bridge.saveEvent(JSON.stringify(e))}):window._vds_ios&&(d.UIWebView=\"UIWebView\"==e,(new d.DomObserver).observe(function(e){e&&d.sendQueue(e)})))},window._vds_bridge&&d.startTracing(),console.log(\"start\")}}();";
    }

    @TargetApi(value=11)
    private void b(Context context) {
        new ak(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[]{this.c(context)});
    }

    private String c(Context context) {
        return context.getFilesDir() + "/" + "vds_hybrid.min.js";
    }

    public void setClient(WebChromeClient webChromeClient) {
        this.e = webChromeClient;
    }

    private List a(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("e");
        int n2 = jSONArray.length();
        ArrayList<i> arrayList = new ArrayList<i>(n2);
        View view = (View)this.c.get();
        String string = jSONObject.getString("d");
        String string2 = jSONObject.getString("p");
        String string3 = jSONObject.optString("q", null);
        double d2 = ct.g();
        int[] arrn = new int[2];
        view.getLocationOnScreen(arrn);
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        for (int i2 = 0; i2 < n2; ++i2) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            i i3 = this.h.c();
            com.growingio.android.sdk.b.j j2 = new com.growingio.android.sdk.b.j();
            j2.a = string;
            j2.b = string2;
            j2.c = string3;
            j2.d = jSONObject2.optString("h", null);
            j2.e = jSONObject2.optString("nodeType", null);
            i3.q = j2;
            i3.c = view;
            if (jSONObject2.opt("idx") != null) {
                i3.m = true;
                i3.e = jSONObject2.getInt("idx");
                i3.j = i3.i + "::" + jSONObject2.getString("x");
            } else {
                i3.j = i3.j + "::" + jSONObject2.getString("x");
            }
            i3.k = jSONObject2.optString("v", "");
            int n3 = (int)jSONObject2.getDouble("ex");
            int n4 = (int)jSONObject2.getDouble("ey");
            int n5 = (int)jSONObject2.getDouble("ew");
            int n6 = (int)jSONObject2.getDouble("eh");
            i3.p = new Rect(n3, n4, n5 + n3, n6 + n4);
            i3.p.offset(arrn[0], arrn[1]);
            boolean bl2 = i3.p.intersect(rect);
            d d3 = new d();
            d3.a = String.valueOf((int)((double)i3.p.left * d2));
            d3.b = String.valueOf((int)((double)i3.p.top * d2));
            d3.c = String.valueOf((int)((double)i3.p.width() * d2));
            d3.d = String.valueOf((int)((double)i3.p.height() * d2));
            i3.g = d3;
            arrayList.add(i3);
        }
        return arrayList;
    }

    @SuppressLint(value={"SetJavaScriptEnabled", "AddJavascriptInterface"})
    private void a(View view) {
        this.a();
        if (view instanceof android.webkit.WebView) {
            android.webkit.WebView webView = (android.webkit.WebView)view;
            webView.getSettings().setJavaScriptEnabled(true);
            webView.addJavascriptInterface((Object)new VdsJsHelper$VdsBridge(this, null), "_vds_bridge");
        } else if (a.c((Object)view)) {
            WebView webView = (WebView)view;
            webView.getSettings().setJavaScriptEnabled(true);
            webView.addJavascriptInterface((Object)new VdsJsHelper$VdsBridge(this, null), "_vds_bridge");
        }
    }

    private void a() {
        View view = (View)this.c.get();
        if (view != null) {
            Object object;
            boolean bl2 = true;
            if (view instanceof android.webkit.WebView) {
                object = (android.webkit.WebView)view;
                object.setWebChromeClient((WebChromeClient)this);
            } else if (a.c((Object)view)) {
                bl2 = false;
                object = (WebView)view;
                this.g = this.b();
                try {
                    object.setWebChromeClient((com.tencent.smtt.sdk.WebChromeClient)this.g);
                }
                catch (Exception var4_4) {
                    var4_4.printStackTrace();
                }
            }
            object = view.getTag(84159239);
            if (object != null) {
                if (object instanceof WebChromeClient) {
                    this.e = (WebChromeClient)object;
                } else if (a.d(object)) {
                    this.f = object;
                }
            }
            if (bl2) {
                this.e = this.e != null ? this.e : new WebChromeClient();
            } else {
                this.f = this.f != null ? this.f : new Object();
            }
        }
    }

    public void onProgressChanged(android.webkit.WebView webView, int n2) {
        String string;
        webView.removeCallbacks((Runnable)this);
        if (n2 >= 60 && (string = webView.getUrl()) != null) {
            webView.postDelayed((Runnable)this, 1000);
        }
        this.e.onProgressChanged(webView, n2);
    }

    private com.tencent.smtt.sdk.WebChromeClient b() {
        if (this.g == null) {
            this.g = new al(this);
        }
        return (com.tencent.smtt.sdk.WebChromeClient)this.g;
    }

    public boolean onJsAlert(android.webkit.WebView webView, String string, String string2, JsResult jsResult) {
        return this.e.onJsAlert(webView, string, string2, jsResult);
    }

    public boolean onJsTimeout() {
        return this.e.onJsTimeout();
    }

    @TargetApi(value=8)
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return this.e.onConsoleMessage(consoleMessage);
    }

    public boolean onCreateWindow(android.webkit.WebView webView, boolean bl2, boolean bl3, Message message) {
        return this.e.onCreateWindow(webView, bl2, bl3, message);
    }

    public boolean onJsBeforeUnload(android.webkit.WebView webView, String string, String string2, JsResult jsResult) {
        return this.e.onJsBeforeUnload(webView, string, string2, jsResult);
    }

    public boolean onJsConfirm(android.webkit.WebView webView, String string, String string2, JsResult jsResult) {
        return this.e.onJsConfirm(webView, string, string2, jsResult);
    }

    public boolean onJsPrompt(android.webkit.WebView webView, String string, String string2, String string3, JsPromptResult jsPromptResult) {
        return this.e.onJsPrompt(webView, string, string2, string3, jsPromptResult);
    }

    public void onCloseWindow(android.webkit.WebView webView) {
        this.e.onCloseWindow(webView);
    }

    public void onGeolocationPermissionsHidePrompt() {
        this.e.onGeolocationPermissionsHidePrompt();
    }

    public void onGeolocationPermissionsShowPrompt(String string, GeolocationPermissions.Callback callback) {
        this.e.onGeolocationPermissionsShowPrompt(string, callback);
    }

    public void onHideCustomView() {
        this.e.onHideCustomView();
    }

    public void onReceivedIcon(android.webkit.WebView webView, Bitmap bitmap) {
        this.e.onReceivedIcon(webView, bitmap);
    }

    public void onReceivedTitle(android.webkit.WebView webView, String string) {
        this.e.onReceivedTitle(webView, string);
    }

    public void onReceivedTouchIconUrl(android.webkit.WebView webView, String string, boolean bl2) {
        this.e.onReceivedTouchIconUrl(webView, string, bl2);
    }

    public void onRequestFocus(android.webkit.WebView webView) {
        this.e.onRequestFocus(webView);
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.e.onShowCustomView(view, customViewCallback);
    }

    @TargetApi(value=14)
    public void onShowCustomView(View view, int n2, WebChromeClient.CustomViewCallback customViewCallback) {
        this.e.onShowCustomView(view, n2, customViewCallback);
    }

    public void onConsoleMessage(String string, int n2, String string2) {
        this.e.onConsoleMessage(string, n2, string2);
    }

    public void onExceededDatabaseQuota(String string, String string2, long l2, long l3, long l4, WebStorage.QuotaUpdater quotaUpdater) {
        this.e.onExceededDatabaseQuota(string, string2, l2, l3, l4, quotaUpdater);
    }

    public void onReachedMaxAppCacheSize(long l2, long l3, WebStorage.QuotaUpdater quotaUpdater) {
        this.e.onReachedMaxAppCacheSize(l2, l3, quotaUpdater);
    }

    public void openFileChooser(ValueCallback valueCallback, String string, String string2) {
        try {
            Method method = this.e.getClass().getDeclaredMethod("openFileChooser", ValueCallback.class, String.class, String.class);
            method.invoke((Object)this.e, new Object[]{valueCallback, string, string2});
        }
        catch (Exception var4_5) {
            var4_5.printStackTrace();
        }
    }

    public void openFileChooser(ValueCallback valueCallback, String string) {
        try {
            Method method = this.e.getClass().getDeclaredMethod("openFileChooser", ValueCallback.class, String.class);
            method.invoke((Object)this.e, new Object[]{valueCallback, string});
        }
        catch (Exception var3_4) {
            var3_4.printStackTrace();
        }
    }

    public void openFileChooser(ValueCallback valueCallback) {
        try {
            Method method = this.e.getClass().getDeclaredMethod("openFileChooser", ValueCallback.class);
            method.invoke((Object)this.e, new Object[]{valueCallback});
        }
        catch (Exception var2_3) {
            var2_3.printStackTrace();
        }
    }

    @TargetApi(value=21)
    public boolean onShowFileChooser(android.webkit.WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return this.e.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    @TargetApi(value=21)
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        this.e.onPermissionRequest(permissionRequest);
    }

    @TargetApi(value=21)
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        this.e.onPermissionRequestCanceled(permissionRequest);
    }

    static /* synthetic */ i a(VdsJsHelper vdsJsHelper) {
        return vdsJsHelper.h;
    }

    static /* synthetic */ boolean a(VdsJsHelper vdsJsHelper, boolean bl2) {
        vdsJsHelper.j = bl2;
        return vdsJsHelper.j;
    }

    static /* synthetic */ String b(VdsJsHelper vdsJsHelper) {
        return vdsJsHelper.b;
    }

    static /* synthetic */ List a(VdsJsHelper vdsJsHelper, JSONObject jSONObject) {
        return vdsJsHelper.a(jSONObject);
    }

    static /* synthetic */ WeakReference c(VdsJsHelper vdsJsHelper) {
        return vdsJsHelper.c;
    }

    static /* synthetic */ Object d(VdsJsHelper vdsJsHelper) {
        return vdsJsHelper.f;
    }
}

