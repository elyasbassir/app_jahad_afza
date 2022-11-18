package aiandeh.sazan.run;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class doubletaptoclose extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "aiandeh.sazan.run.doubletaptoclose");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", aiandeh.sazan.run.doubletaptoclose.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.Timer _vvvvvv5 = null;
public anywheresoftware.b4a.objects.Timer _vvvvvv6 = null;
public float _vvvvvv7 = 0f;
public String _vvvvvv0 = "";
public aiandeh.sazan.run.main _vvvvv7 = null;
public aiandeh.sazan.run.page_index _page_index = null;
public aiandeh.sazan.run.animactivity _vvvvv0 = null;
public aiandeh.sazan.run.starter _vvvvvv1 = null;
public aiandeh.sazan.run.b4xpages _vvvvvv2 = null;
public aiandeh.sazan.run.b4xcollections _vvvvvv3 = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Private Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Ti As Timer";
_vvvvvv5 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 4;BA.debugLine="Private Timr As Timer";
_vvvvvv6 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 5;BA.debugLine="Private I As Float";
_vvvvvv7 = 0f;
 //BA.debugLineNum = 6;BA.debugLine="Private TT As String";
_vvvvvv0 = "";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,String _toasttext) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize (ToastText As String)";
 //BA.debugLineNum = 12;BA.debugLine="I = 0";
_vvvvvv7 = (float) (0);
 //BA.debugLineNum = 13;BA.debugLine="Ti.Initialize (\"Ti\",1000)";
_vvvvvv5.Initialize(ba,"Ti",(long) (1000));
 //BA.debugLineNum = 14;BA.debugLine="Ti.Enabled = True";
_vvvvvv5.setEnabled(__c.True);
 //BA.debugLineNum = 15;BA.debugLine="Timr.Initialize (\"Timr\",100)";
_vvvvvv6.Initialize(ba,"Timr",(long) (100));
 //BA.debugLineNum = 16;BA.debugLine="Timr.Enabled = True";
_vvvvvv6.setEnabled(__c.True);
 //BA.debugLineNum = 17;BA.debugLine="TT = ToastText";
_vvvvvv0 = _toasttext;
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvv4() throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Public Sub TapToClose";
 //BA.debugLineNum = 35;BA.debugLine="ToastMessageShow (TT,False)";
__c.ToastMessageShow(BA.ObjectToCharSequence(_vvvvvv0),__c.False);
 //BA.debugLineNum = 37;BA.debugLine="I = I+1.3";
_vvvvvv7 = (float) (_vvvvvv7+1.3);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public String  _ti_tick() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Private Sub Ti_Tick";
 //BA.debugLineNum = 21;BA.debugLine="If I > 0 Then";
if (_vvvvvv7>0) { 
 //BA.debugLineNum = 22;BA.debugLine="I = I-0.49";
_vvvvvv7 = (float) (_vvvvvv7-0.49);
 };
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _timr_tick() throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Private Sub Timr_Tick";
 //BA.debugLineNum = 28;BA.debugLine="If I >= 2 Then";
if (_vvvvvv7>=2) { 
 //BA.debugLineNum = 29;BA.debugLine="ExitApplication";
__c.ExitApplication();
 };
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
