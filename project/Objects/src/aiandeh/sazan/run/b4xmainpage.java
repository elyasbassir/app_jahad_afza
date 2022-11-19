package aiandeh.sazan.run;

import android.webkit.*;
import android.webkit.WebChromeClient.*;
import android.net.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "aiandeh.sazan.run.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", aiandeh.sazan.run.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvv1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvv2 = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webview1 = null;
public anywheresoftware.b4a.phone.Phone.ContentChooser _vvvvv3 = null;
public aiandeh.sazan.run.fileprovider _vvvvv4 = null;
public aiandeh.sazan.run.doubletaptoclose _vvvvv5 = null;
public anywheresoftware.b4a.objects.AnimationWrapper _vvvvv6 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _loading = null;
public aiandeh.sazan.run.main _vvvvv7 = null;
public aiandeh.sazan.run.page_index _page_index = null;
public aiandeh.sazan.run.animactivity _vvvvv0 = null;
public aiandeh.sazan.run.starter _vvvvvv1 = null;
public aiandeh.sazan.run.b4xpages _vvvvvv2 = null;
public aiandeh.sazan.run.b4xcollections _vvvvvv3 = null;
public boolean  _activity_keypress(int _keycode) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
 //BA.debugLineNum = 101;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==__c.KeyCodes.KEYCODE_BACK) { 
 //BA.debugLineNum = 102;BA.debugLine="If WebView1.Url = \"https://jahad-afza.iran.liara";
if ((_webview1.getUrl()).equals("https://jahad-afza.iran.liara.run/")) { 
 //BA.debugLineNum = 103;BA.debugLine="d.TapToClose";
_vvvvv5._vvvvvv4 /*String*/ ();
 }else {
 //BA.debugLineNum = 105;BA.debugLine="WebView1.Back";
_webview1.Back();
 };
 //BA.debugLineNum = 107;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return false;
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
anywheresoftware.b4j.object.JavaObject _client = null;
 //BA.debugLineNum = 26;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 27;BA.debugLine="Root = Root1";
_vvvvv1 = _root1;
 //BA.debugLineNum = 28;BA.debugLine="Root.LoadLayout(\"index\")";
_vvvvv1.LoadLayout("index",ba);
 //BA.debugLineNum = 29;BA.debugLine="Provider.Initialize";
_vvvvv4._initialize /*String*/ (ba);
 //BA.debugLineNum = 30;BA.debugLine="Dim client As JavaObject";
_client = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 31;BA.debugLine="client.InitializeNewInstance(Application.PackageN";
_client.InitializeNewInstance(__c.Application.getPackageName()+".b4xmainpage$MyChromeClient",new Object[]{this});
 //BA.debugLineNum = 32;BA.debugLine="WebView1.As(JavaObject).RunMethod(\"setWebChromeCl";
((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_webview1.getObject()))).RunMethod("setWebChromeClient",new Object[]{(Object)(_client.getObject())});
 //BA.debugLineNum = 33;BA.debugLine="WebView1.LoadUrl(\"https://jahad-afza.iran.liara.r";
_webview1.LoadUrl("https://jahad-afza.iran.liara.run/");
 //BA.debugLineNum = 34;BA.debugLine="d.Initialize(\"برای خروج دوباره کلیک کنید!\")";
_vvvvv5._initialize /*String*/ (ba,"برای خروج دوباره کلیک کنید!");
 //BA.debugLineNum = 35;BA.debugLine="WebView1.LoadUrl(\"https://jahad-afza.iran.liara.r";
_webview1.LoadUrl("https://jahad-afza.iran.liara.run/");
 //BA.debugLineNum = 36;BA.debugLine="WebView1.ZoomEnabled=False";
_webview1.setZoomEnabled(__c.False);
 //BA.debugLineNum = 37;BA.debugLine="loading.Visible=True";
_loading.setVisible(__c.True);
 //BA.debugLineNum = 40;BA.debugLine="anim.InitializeTranslate(\"anim\",2%x,1%y,3%x,4%y)";
_vvvvv6.InitializeTranslate(ba,"anim",(float) (__c.PerXToCurrent((float) (2),ba)),(float) (__c.PerYToCurrent((float) (1),ba)),(float) (__c.PerXToCurrent((float) (3),ba)),(float) (__c.PerYToCurrent((float) (4),ba)));
 //BA.debugLineNum = 41;BA.debugLine="anim.Duration=1000";
_vvvvv6.setDuration((long) (1000));
 //BA.debugLineNum = 42;BA.debugLine="anim.RepeatMode = anim.REPEAT_REVERSE";
_vvvvv6.setRepeatMode(_vvvvv6.REPEAT_REVERSE);
 //BA.debugLineNum = 43;BA.debugLine="anim.RepeatCount=-1";
_vvvvv6.setRepeatCount((int) (-1));
 //BA.debugLineNum = 44;BA.debugLine="anim.Start(loading)";
_vvvvv6.Start((android.view.View)(_loading.getObject()));
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
_vvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
_vvvvv2 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Private WebView1 As WebView";
_webview1 = new anywheresoftware.b4a.objects.WebViewWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private cc As ContentChooser";
_vvvvv3 = new anywheresoftware.b4a.phone.Phone.ContentChooser();
 //BA.debugLineNum = 13;BA.debugLine="Private Provider As FileProvider";
_vvvvv4 = new aiandeh.sazan.run.fileprovider();
 //BA.debugLineNum = 14;BA.debugLine="Dim d As DoubleTaptoClose";
_vvvvv5 = new aiandeh.sazan.run.doubletaptoclose();
 //BA.debugLineNum = 16;BA.debugLine="Private WebView1 As WebView";
_webview1 = new anywheresoftware.b4a.objects.WebViewWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim anim As Animation";
_vvvvv6 = new anywheresoftware.b4a.objects.AnimationWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private loading As ImageView";
_loading = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public void  _showfile_chooser(Object _filepathcallback,Object _filechooserparams) throws Exception{
ResumableSub_ShowFile_Chooser rsub = new ResumableSub_ShowFile_Chooser(this,_filepathcallback,_filechooserparams);
rsub.resume(ba, null);
}
public static class ResumableSub_ShowFile_Chooser extends BA.ResumableSub {
public ResumableSub_ShowFile_Chooser(aiandeh.sazan.run.b4xmainpage parent,Object _filepathcallback,Object _filechooserparams) {
this.parent = parent;
this._filepathcallback = _filepathcallback;
this._filechooserparams = _filechooserparams;
}
aiandeh.sazan.run.b4xmainpage parent;
Object _filepathcallback;
Object _filechooserparams;
boolean _success = false;
String _dir = "";
String _filename = "";
anywheresoftware.b4j.object.JavaObject _jo = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 48;BA.debugLine="cc.Initialize(\"CC\")";
parent._vvvvv3.Initialize("CC");
 //BA.debugLineNum = 49;BA.debugLine="cc.Show(\"*/*\", \"Choose File\")";
parent._vvvvv3.Show(ba,"*/*","Choose File");
 //BA.debugLineNum = 50;BA.debugLine="Wait For CC_Result (Success As Boolean, Dir As St";
parent.__c.WaitFor("cc_result", ba, this, null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_success = (Boolean) result[0];
_dir = (String) result[1];
_filename = (String) result[2];
;
 //BA.debugLineNum = 51;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(parent));
 //BA.debugLineNum = 52;BA.debugLine="If Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_success) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 53;BA.debugLine="Log(FileName)";
parent.__c.LogImpl("51048582",_filename,0);
 //BA.debugLineNum = 54;BA.debugLine="File.Copy(Dir, FileName, Provider.SharedFolder,";
parent.__c.File.Copy(_dir,_filename,parent._vvvvv4._vvvvvvv3 /*String*/ ,"TempFile");
 //BA.debugLineNum = 55;BA.debugLine="jo.RunMethod(\"SendResult\", Array(Provider.GetFil";
_jo.RunMethod("SendResult",new Object[]{parent._vvvvv4._vvvvvvv1 /*Object*/ ("TempFile"),_filepathcallback});
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 57;BA.debugLine="jo.RunMethod(\"SendResult\", Array(Null, FilePathC";
_jo.RunMethod("SendResult",new Object[]{parent.__c.Null,_filepathcallback});
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cc_result(boolean _success,String _dir,String _filename) throws Exception{
}
public boolean  _webview1_overrideurl(String _url) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Private Sub WebView1_OverrideUrl (Url As String) A";
 //BA.debugLineNum = 94;BA.debugLine="WebView1.Visible=False";
_webview1.setVisible(__c.False);
 //BA.debugLineNum = 95;BA.debugLine="anim.Start(loading)";
_vvvvv6.Start((android.view.View)(_loading.getObject()));
 //BA.debugLineNum = 96;BA.debugLine="loading.Visible=True";
_loading.setVisible(__c.True);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return false;
}
public String  _webview1_pagefinished(String _url) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Private Sub WebView1_PageFinished (Url As String)";
 //BA.debugLineNum = 88;BA.debugLine="WebView1.Visible=True";
_webview1.setVisible(__c.True);
 //BA.debugLineNum = 89;BA.debugLine="anim.Stop(loading)";
_vvvvv6.Stop((android.view.View)(_loading.getObject()));
 //BA.debugLineNum = 90;BA.debugLine="loading.Visible=False";
_loading.setVisible(__c.False);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
public void SendResult(Uri uri, ValueCallback<Uri[]> filePathCallback) {
	if (uri != null)
		filePathCallback.onReceiveValue(new Uri[] {uri});
	else
		filePathCallback.onReceiveValue(null);
		
}
public static class MyChromeClient extends WebChromeClient {
	private final B4AClass target;
	public MyChromeClient(B4AClass target) {
		this.target = target;
	}
@Override
 public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback,
            FileChooserParams fileChooserParams) {
		target.getBA().raiseEventFromUI(this, "showfile_chooser", filePathCallback, fileChooserParams);
        return true;
    }
	}
}
