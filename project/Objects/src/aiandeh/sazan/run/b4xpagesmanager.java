package aiandeh.sazan.run;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xpagesmanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "aiandeh.sazan.run.b4xpagesmanager");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", aiandeh.sazan.run.b4xpagesmanager.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public aiandeh.sazan.run.b4xorderedmap _vvvvvvvvvvvvvvvvv1 = null;
public aiandeh.sazan.run.b4xorderedmap _vvvvvvvvvvvvvvvvv2 = null;
public anywheresoftware.b4j.object.JavaObject _vvvvvvvvvvvvvvvvv3 = null;
public aiandeh.sazan.run.b4xset _vvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvv2 = null;
public anywheresoftware.b4a.objects.ActivityWrapper _vvvvvvvvvvvvvvvvv5 = null;
public boolean _vvvvvvvvvvvvvvvvv6 = false;
public anywheresoftware.b4j.object.JavaObject _vvvvvvvvvvvvvvvvv7 = null;
public boolean _vvvvvvvvvvvvvvvvv0 = false;
public int _vvvvvvvvvvvvvvvvvv1 = 0;
public aiandeh.sazan.run.b4xmainpage _vvv2 = null;
public String _vvvvvvvvvvvvvvvvvv2 = "";
public boolean _vvvvvvvvvvvvvvvvvv3 = false;
public aiandeh.sazan.run.main _vvvvv7 = null;
public aiandeh.sazan.run.page_index _page_index = null;
public aiandeh.sazan.run.animactivity _vvvvv0 = null;
public aiandeh.sazan.run.starter _vvvvvv1 = null;
public aiandeh.sazan.run.b4xpages _vvvvvv2 = null;
public aiandeh.sazan.run.b4xcollections _vvvvvv3 = null;
public static class _b4xpageparent{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.ActivityWrapper NativeType;
public anywheresoftware.b4a.objects.collections.List MenuItems;
public void Initialize() {
IsInitialized = true;
NativeType = new anywheresoftware.b4a.objects.ActivityWrapper();
MenuItems = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _b4amenuitem{
public boolean IsInitialized;
public Object Title;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper Bitmap;
public String Tag;
public boolean AddToBar;
public anywheresoftware.b4j.object.JavaObject NativeMenuItem;
public void Initialize() {
IsInitialized = true;
Title = new Object();
Bitmap = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
Tag = "";
AddToBar = false;
NativeMenuItem = new anywheresoftware.b4j.object.JavaObject();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _b4xpageinfo{
public boolean IsInitialized;
public Object B4XPage;
public String Id;
public boolean Created;
public Object Title;
public anywheresoftware.b4a.objects.B4XViewWrapper Root;
public boolean IsFirst;
public aiandeh.sazan.run.b4xpagesmanager._b4xpageparent Parent;
public void Initialize() {
IsInitialized = true;
B4XPage = new Object();
Id = "";
Created = false;
Title = new Object();
Root = new anywheresoftware.b4a.objects.B4XViewWrapper();
IsFirst = false;
Parent = new aiandeh.sazan.run.b4xpagesmanager._b4xpageparent();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _activity_actionbarhomeclick() throws Exception{
aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _pi = null;
 //BA.debugLineNum = 129;BA.debugLine="Public Sub Activity_ActionBarHomeClick";
 //BA.debugLineNum = 130;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = _vvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 131;BA.debugLine="If pi <> Null Then";
if (_pi!= null) { 
 //BA.debugLineNum = 132;BA.debugLine="If CloseRequestExists (pi) Then";
if (_vvvvvvvvvvvvvv6(_pi)) { 
 //BA.debugLineNum = 133;BA.debugLine="HandleCloseRequest(pi)";
_vvvvvvvvvvvvvvv0(_pi);
 }else {
 //BA.debugLineNum = 135;BA.debugLine="ClosePage(pi.B4XPage)";
_vv3(_pi.B4XPage /*Object*/ );
 };
 };
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return "";
}
public boolean  _activity_keypress(int _keycode) throws Exception{
aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _pi = null;
 //BA.debugLineNum = 465;BA.debugLine="Public Sub Activity_KeyPress (KeyCode As Int) As B";
 //BA.debugLineNum = 466;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==__c.KeyCodes.KEYCODE_BACK) { 
 //BA.debugLineNum = 467;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = _vvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 468;BA.debugLine="If CloseRequestExists(pi) Then";
if (_vvvvvvvvvvvvvv6(_pi)) { 
 //BA.debugLineNum = 469;BA.debugLine="HandleCloseRequest(pi)";
_vvvvvvvvvvvvvvv0(_pi);
 }else {
 //BA.debugLineNum = 471;BA.debugLine="ClosePage(pi.B4XPage)";
_vv3(_pi.B4XPage /*Object*/ );
 };
 //BA.debugLineNum = 473;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 475;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 476;BA.debugLine="End Sub";
return false;
}
public String  _activity_pause() throws Exception{
 //BA.debugLineNum = 632;BA.debugLine="Public Sub Activity_Pause";
 //BA.debugLineNum = 633;BA.debugLine="RaiseEventWithResult(GetTopPage, \"B4XPage_Disappe";
_vvvvvvvvvvvvvvvv3(_vvvvvvvvvvvvvvv7(),"B4XPage_Disappear",(Object[])(__c.Null));
 //BA.debugLineNum = 634;BA.debugLine="BackgroundStateChanged(False)";
_vvvvvvvvvvvvvv3(__c.False);
 //BA.debugLineNum = 635;BA.debugLine="End Sub";
return "";
}
public String  _activity_resume() throws Exception{
boolean _shouldraise = false;
 //BA.debugLineNum = 607;BA.debugLine="Public Sub Activity_Resume";
 //BA.debugLineNum = 608;BA.debugLine="Dim ShouldRaise As Boolean = IsForeground = False";
_shouldraise = _vvvvvvvvvvvvvvvvv0==__c.False;
 //BA.debugLineNum = 609;BA.debugLine="BackgroundStateChanged(True)";
_vvvvvvvvvvvvvv3(__c.True);
 //BA.debugLineNum = 610;BA.debugLine="If ShouldRaise Then";
if (_shouldraise) { 
 //BA.debugLineNum = 611;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
_vvvvvvvvvvvvvvvv2(_vvvvvvvvvvvvvvv7(),"B4XPage_Appear",(Object[])(__c.Null));
 };
 //BA.debugLineNum = 613;BA.debugLine="End Sub";
return "";
}
public aiandeh.sazan.run.b4xpagesmanager._b4amenuitem  _v0(Object _b4xpage,Object _title) throws Exception{
aiandeh.sazan.run.b4xpagesmanager._b4amenuitem _mi = null;
 //BA.debugLineNum = 478;BA.debugLine="Public Sub AddMenuItem (B4XPage As Object, Title A";
 //BA.debugLineNum = 479;BA.debugLine="Dim mi As B4AMenuItem";
_mi = new aiandeh.sazan.run.b4xpagesmanager._b4amenuitem();
 //BA.debugLineNum = 480;BA.debugLine="mi.Initialize";
_mi.Initialize();
 //BA.debugLineNum = 481;BA.debugLine="mi.Title = Title";
_mi.Title /*Object*/  = _title;
 //BA.debugLineNum = 482;BA.debugLine="mi.Tag = Title";
_mi.Tag /*String*/  = BA.ObjectToString(_title);
 //BA.debugLineNum = 483;BA.debugLine="FindPIFromB4XPage(B4XPage).Parent.MenuItems.Add(m";
_vvvvvvvvvvvvvvv4(_b4xpage).Parent /*aiandeh.sazan.run.b4xpagesmanager._b4xpageparent*/ .MenuItems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_mi));
 //BA.debugLineNum = 484;BA.debugLine="Return mi";
if (true) return _mi;
 //BA.debugLineNum = 485;BA.debugLine="End Sub";
return null;
}
public String  _vv1(String _id,Object _b4xpage) throws Exception{
String _idtolower = "";
 //BA.debugLineNum = 141;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
 //BA.debugLineNum = 142;BA.debugLine="Dim IdToLower As String = Id.ToLowerCase";
_idtolower = _id.toLowerCase();
 //BA.debugLineNum = 143;BA.debugLine="If IdToB4XPage.ContainsKey(IdToLower) Then";
if (_vvvvvvvvvvvvvvvvv1._vvvvvvvvvv6 /*boolean*/ ((Object)(_idtolower))) { 
 //BA.debugLineNum = 144;BA.debugLine="Log($\"Page with this id already exists: ${IdToLo";
__c.LogImpl("98912899",("Page with this id already exists: "+__c.SmartStringFormatter("",(Object)(_idtolower))+"!"),0);
 //BA.debugLineNum = 145;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 147;BA.debugLine="IdToB4XPage.Put(IdToLower, CreateB4XPageInfo(B4XP";
_vvvvvvvvvvvvvvvvv1._vvvvvvvvvvv3 /*String*/ ((Object)(_idtolower),(Object)(_vvvvvvvvvvvvvv7(_b4xpage,_idtolower,__c.False,(Object)(_id))));
 //BA.debugLineNum = 148;BA.debugLine="If IdToB4XPage.Size = 1 Then ShowPage(IdToLower)";
if (_vvvvvvvvvvvvvvvvv1._getvvvvvvvv2 /*int*/ ()==1) { 
_vvv4(_idtolower);};
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return "";
}
public String  _vv2(String _id,Object _b4xpage) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
 //BA.debugLineNum = 152;BA.debugLine="AddPage (Id, B4XPage)";
_vv1(_id,_b4xpage);
 //BA.debugLineNum = 153;BA.debugLine="CreatePageIfNeeded(GetPageFromId(Id))";
_vvvvvvvvvvvvvvv2(_vvvvvvvvvvvvvvv5(_id));
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvv3(boolean _newstate) throws Exception{
String _ev = "";
aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _pi = null;
 //BA.debugLineNum = 615;BA.debugLine="Private Sub BackgroundStateChanged (NewState As Bo";
 //BA.debugLineNum = 616;BA.debugLine="If IsForeground = NewState Then Return";
if (_vvvvvvvvvvvvvvvvv0==_newstate) { 
if (true) return "";};
 //BA.debugLineNum = 617;BA.debugLine="IsForeground = NewState";
_vvvvvvvvvvvvvvvvv0 = _newstate;
 //BA.debugLineNum = 618;BA.debugLine="Dim ev As String";
_ev = "";
 //BA.debugLineNum = 619;BA.debugLine="If IsForeground Then ev = \"B4XPage_Foreground\" El";
if (_vvvvvvvvvvvvvvvvv0) { 
_ev = "B4XPage_Foreground";}
else {
_ev = "B4XPage_Background";};
 //BA.debugLineNum = 620;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
{
final anywheresoftware.b4a.BA.IterableList group5 = _vvvvvvvvvvvvvvvvv1._getvvvvvvvvvvvvv5 /*anywheresoftware.b4a.objects.collections.List*/ ();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_pi = (aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo)(group5.Get(index5));
 //BA.debugLineNum = 621;BA.debugLine="If xui.SubExists(pi.B4XPage, ev, 0) Then";
if (_vvvvv2.SubExists(ba,_pi.B4XPage /*Object*/ ,_ev,(int) (0))) { 
 //BA.debugLineNum = 622;BA.debugLine="LogEvent(pi, ev)";
_vvvvvvvvvvvvvvvv1(_pi,_ev);
 //BA.debugLineNum = 623;BA.debugLine="If IsForeground Then";
if (_vvvvvvvvvvvvvvvvv0) { 
 //BA.debugLineNum = 624;BA.debugLine="CallSubDelayed(pi.B4XPage, ev)";
__c.CallSubDelayed(ba,_pi.B4XPage /*Object*/ ,_ev);
 }else {
 //BA.debugLineNum = 626;BA.debugLine="CallSub(pi.B4XPage, ev)";
__c.CallSubNew(ba,_pi.B4XPage /*Object*/ ,_ev);
 };
 };
 }
};
 //BA.debugLineNum = 630;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvv4() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _jme = null;
boolean _isappcompat = false;
anywheresoftware.b4j.object.JavaObject _pi = null;
Object[] _activities = null;
anywheresoftware.b4j.object.JavaObject _act = null;
String _name = "";
int _screenorientation = 0;
 //BA.debugLineNum = 96;BA.debugLine="Private Sub CheckMainActivityOrientations";
 //BA.debugLineNum = 98;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 99;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(ba);
 //BA.debugLineNum = 101;BA.debugLine="ActionBar = jo.RunMethod(\"getActionBar\", Null)";
_vvvvvvvvvvvvvvvvv7 = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("getActionBar",(Object[])(__c.Null))));
 //BA.debugLineNum = 102;BA.debugLine="If ActionBar.IsInitialized = False Then";
if (_vvvvvvvvvvvvvvvvv7.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 103;BA.debugLine="Dim jme As JavaObject = Me";
_jme = new anywheresoftware.b4j.object.JavaObject();
_jme = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
 //BA.debugLineNum = 104;BA.debugLine="Dim IsAppCompat As Boolean = jme.RunMethod(\"chec";
_isappcompat = BA.ObjectToBoolean(_jme.RunMethod("checkIfAppCompat",new Object[]{(Object)(_jo.getObject())}));
 //BA.debugLineNum = 105;BA.debugLine="If IsAppCompat Then";
if (_isappcompat) { 
 //BA.debugLineNum = 106;BA.debugLine="ActionBar = jo.RunMethod(\"getSupportActionBar\",";
_vvvvvvvvvvvvvvvvv7 = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("getSupportActionBar",(Object[])(__c.Null))));
 };
 };
 //BA.debugLineNum = 110;BA.debugLine="Dim pi As JavaObject = jo.RunMethodJO(\"getPackage";
_pi = new anywheresoftware.b4j.object.JavaObject();
_pi = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethodJO("getPackageManager",(Object[])(__c.Null)).RunMethod("getPackageInfo",new Object[]{(Object)(__c.Application.getPackageName()),(Object)(1)})));
 //BA.debugLineNum = 111;BA.debugLine="Dim activities() As Object = pi.GetField(\"activit";
_activities = (Object[])(_pi.GetField("activities"));
 //BA.debugLineNum = 112;BA.debugLine="For Each Act As JavaObject In activities";
_act = new anywheresoftware.b4j.object.JavaObject();
{
final Object[] group13 = _activities;
final int groupLen13 = group13.length
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_act = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(group13[index13]));
 //BA.debugLineNum = 113;BA.debugLine="Dim name As String = Act.GetField(\"name\")";
_name = BA.ObjectToString(_act.GetField("name"));
 //BA.debugLineNum = 114;BA.debugLine="If name.EndsWith(\".main\") Then";
if (_name.endsWith(".main")) { 
 //BA.debugLineNum = 115;BA.debugLine="Dim screenOrientation As Int = Act.GetField(\"sc";
_screenorientation = (int)(BA.ObjectToNumber(_act.GetField("screenOrientation")));
 //BA.debugLineNum = 116;BA.debugLine="If screenOrientation = -1 Then";
if (_screenorientation==-1) { 
 //BA.debugLineNum = 117;BA.debugLine="LogColor(\"#SupportedOrientations attribute mus";
__c.LogImpl("98781845","#SupportedOrientations attribute must be set to landscape or portrait.",_vvvvv2.Color_Red);
 };
 };
 }
};
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private IdToB4XPage As B4XOrderedMap";
_vvvvvvvvvvvvvvvvv1 = new aiandeh.sazan.run.b4xorderedmap();
 //BA.debugLineNum = 24;BA.debugLine="Private RootB4XToPage As B4XOrderedMap";
_vvvvvvvvvvvvvvvvv2 = new aiandeh.sazan.run.b4xorderedmap();
 //BA.debugLineNum = 26;BA.debugLine="Private Context As JavaObject";
_vvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 27;BA.debugLine="Type B4XPageParent (NativeType As Activity, MenuI";
;
 //BA.debugLineNum = 28;BA.debugLine="Type B4AMenuItem (Title As Object, Bitmap As B4XB";
;
 //BA.debugLineNum = 34;BA.debugLine="Type B4XPageInfo (B4XPage As Object, Id As String";
;
 //BA.debugLineNum = 38;BA.debugLine="Public mStackOfPageIds As B4XSet";
_vvvvvvvvvvvvvvvvv4 = new aiandeh.sazan.run.b4xset();
 //BA.debugLineNum = 39;BA.debugLine="Private xui As XUI 'ignore";
_vvvvv2 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 43;BA.debugLine="Private mMainForm As Activity";
_vvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.ActivityWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Public ShowUpIndicator As Boolean = True";
_vvvvvvvvvvvvvvvvv6 = __c.True;
 //BA.debugLineNum = 45;BA.debugLine="Public ActionBar As JavaObject";
_vvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 49;BA.debugLine="Public IsForeground As Boolean";
_vvvvvvvvvvvvvvvvv0 = false;
 //BA.debugLineNum = 50;BA.debugLine="Public TransitionAnimationDuration As Int = 100";
_vvvvvvvvvvvvvvvvvv1 = (int) (100);
 //BA.debugLineNum = 51;BA.debugLine="Public MainPage As B4XMainPage";
_vvv2 = new aiandeh.sazan.run.b4xmainpage();
 //BA.debugLineNum = 52;BA.debugLine="Private StackString As String";
_vvvvvvvvvvvvvvvvvv2 = "";
 //BA.debugLineNum = 53;BA.debugLine="Public LogEvents As Boolean = False";
_vvvvvvvvvvvvvvvvvv3 = __c.False;
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _vv3(Object _b4xpage) throws Exception{
aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _pi = null;
 //BA.debugLineNum = 209;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
 //BA.debugLineNum = 210;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
_pi = _vvvvvvvvvvvvvvv4(_b4xpage);
 //BA.debugLineNum = 211;BA.debugLine="If mStackOfPageIds.Contains(pi.Id) = False Then R";
if (_vvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvv2 /*boolean*/ ((Object)(_pi.Id /*String*/ ))==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 212;BA.debugLine="If xui.IsB4i And GetTopPage <> pi Then";
if (_vvvvv2.getIsB4i() && (_vvvvvvvvvvvvvvv7()).equals(_pi) == false) { 
 //BA.debugLineNum = 213;BA.debugLine="Log(\"Only top page can be closed\")";
__c.LogImpl("99175044","Only top page can be closed",0);
 //BA.debugLineNum = 214;BA.debugLine="Return";
if (true) return "";
 }else if(_vvvvv2.getIsB4i() && _vvvvvvvvvvvvvvvvv4._getvvvvvvvv2 /*int*/ ()==1) { 
 //BA.debugLineNum = 216;BA.debugLine="Log(\"First page cannot be closed\")";
__c.LogImpl("99175047","First page cannot be closed",0);
 //BA.debugLineNum = 217;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 219;BA.debugLine="ClosePageImpl(pi)";
_vvvvvvvvvvvvvv5(_pi);
 //BA.debugLineNum = 220;BA.debugLine="If GetTopPage = pi Then";
if ((_vvvvvvvvvvvvvvv7()).equals(_pi)) { 
 //BA.debugLineNum = 221;BA.debugLine="TopPageDisappear";
_vvvvvvvvvvvvvvvv6();
 };
 //BA.debugLineNum = 223;BA.debugLine="If xui.IsB4A And mStackOfPageIds.Size = 1 Then Re";
if (_vvvvv2.getIsB4A() && _vvvvvvvvvvvvvvvvv4._getvvvvvvvv2 /*int*/ ()==1) { 
if (true) return "";};
 //BA.debugLineNum = 224;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
_vvvvvvvvvvvvvvvvv4._vvvvvvvvv6 /*String*/ ((Object)(_pi.Id /*String*/ ));
 //BA.debugLineNum = 225;BA.debugLine="If xui.IsB4A Then ShowPageImpl(GetTopPage)";
if (_vvvvv2.getIsB4A()) { 
_vvvvvvvvvvvvvvvv4(_vvvvvvvvvvvvvvv7());};
 //BA.debugLineNum = 226;BA.debugLine="TopPageAppear";
_vvvvvvvvvvvvvvvv5();
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvv5(aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
anywheresoftware.b4a.objects.IntentWrapper _i = null;
 //BA.debugLineNum = 312;BA.debugLine="Private Sub ClosePageImpl (pi As B4XPageInfo) 'ign";
 //BA.debugLineNum = 314;BA.debugLine="If mStackOfPageIds.Size = 1 Then";
if (_vvvvvvvvvvvvvvvvv4._getvvvvvvvv2 /*int*/ ()==1) { 
 //BA.debugLineNum = 315;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
 //BA.debugLineNum = 316;BA.debugLine="i.Initialize(i.ACTION_MAIN, \"\")";
_i.Initialize(_i.ACTION_MAIN,"");
 //BA.debugLineNum = 317;BA.debugLine="i.AddCategory(\"android.intent.category.HOME\")";
_i.AddCategory("android.intent.category.HOME");
 //BA.debugLineNum = 318;BA.debugLine="i.Flags = 0x10000000";
_i.setFlags(((int)0x10000000));
 //BA.debugLineNum = 319;BA.debugLine="StartActivity(i)";
__c.StartActivity(ba,(Object)(_i.getObject()));
 }else {
 //BA.debugLineNum = 321;BA.debugLine="pi.Root.RemoveViewFromParent";
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return "";
}
public boolean  _vvvvvvvvvvvvvv6(aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
 //BA.debugLineNum = 531;BA.debugLine="Private Sub CloseRequestExists (pi As B4XPageInfo)";
 //BA.debugLineNum = 532;BA.debugLine="Return xui.SubExists(pi.B4XPage, \"B4XPage_CloseRe";
if (true) return _vvvvv2.SubExists(ba,_pi.B4XPage /*Object*/ ,"B4XPage_CloseRequest",(int) (0));
 //BA.debugLineNum = 533;BA.debugLine="End Sub";
return false;
}
public aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo  _vvvvvvvvvvvvvv7(Object _b4xpage,String _id,boolean _created,Object _title) throws Exception{
aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _t1 = null;
 //BA.debugLineNum = 417;BA.debugLine="Private Sub CreateB4XPageInfo (B4XPage As Object,";
 //BA.debugLineNum = 418;BA.debugLine="Dim t1 As B4XPageInfo";
_t1 = new aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo();
 //BA.debugLineNum = 419;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 420;BA.debugLine="t1.B4XPage = B4XPage";
_t1.B4XPage /*Object*/  = _b4xpage;
 //BA.debugLineNum = 421;BA.debugLine="t1.Id = Id";
_t1.Id /*String*/  = _id;
 //BA.debugLineNum = 422;BA.debugLine="t1.Created = Created";
_t1.Created /*boolean*/  = _created;
 //BA.debugLineNum = 423;BA.debugLine="t1.Title = Title";
_t1.Title /*Object*/  = _title;
 //BA.debugLineNum = 424;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 425;BA.debugLine="End Sub";
return null;
}
public aiandeh.sazan.run.b4xpagesmanager._b4xpageparent  _vvvvvvvvvvvvvv0(Object _nativetype) throws Exception{
aiandeh.sazan.run.b4xpagesmanager._b4xpageparent _t1 = null;
 //BA.debugLineNum = 595;BA.debugLine="Private Sub CreateB4XPageParent (NativeType As Obj";
 //BA.debugLineNum = 601;BA.debugLine="Dim t1 As B4XPageParent";
_t1 = new aiandeh.sazan.run.b4xpagesmanager._b4xpageparent();
 //BA.debugLineNum = 602;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 603;BA.debugLine="t1.NativeType = NativeType";
_t1.NativeType /*anywheresoftware.b4a.objects.ActivityWrapper*/  = (anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(_nativetype));
 //BA.debugLineNum = 604;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 605;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvv1(Object _menu) throws Exception{
aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _pi = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
aiandeh.sazan.run.b4xpagesmanager._b4amenuitem _mi = null;
anywheresoftware.b4j.object.JavaObject _nativemenuitem = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd = null;
anywheresoftware.b4j.object.JavaObject _listener = null;
 //BA.debugLineNum = 491;BA.debugLine="Public Sub CreateMenu (Menu As Object)";
 //BA.debugLineNum = 492;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = _vvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 493;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
 //BA.debugLineNum = 494;BA.debugLine="Dim jo As JavaObject = Menu";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_menu));
 //BA.debugLineNum = 495;BA.debugLine="For Each mi As B4AMenuItem In pi.Parent.MenuItems";
{
final anywheresoftware.b4a.BA.IterableList group4 = _pi.Parent /*aiandeh.sazan.run.b4xpagesmanager._b4xpageparent*/ .MenuItems /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_mi = (aiandeh.sazan.run.b4xpagesmanager._b4amenuitem)(group4.Get(index4));
 //BA.debugLineNum = 496;BA.debugLine="Dim NativeMenuItem As JavaObject = jo.RunMethod(";
_nativemenuitem = new anywheresoftware.b4j.object.JavaObject();
_nativemenuitem = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("add",new Object[]{_mi.Title /*Object*/ })));
 //BA.debugLineNum = 497;BA.debugLine="If mi.Bitmap.IsInitialized Then";
if (_mi.Bitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()) { 
 //BA.debugLineNum = 498;BA.debugLine="Dim bd As BitmapDrawable";
_bd = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
 //BA.debugLineNum = 499;BA.debugLine="bd.Initialize(mi.Bitmap)";
_bd.Initialize((android.graphics.Bitmap)(_mi.Bitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()));
 //BA.debugLineNum = 500;BA.debugLine="NativeMenuItem.RunMethod(\"setIcon\", Array(bd))";
_nativemenuitem.RunMethod("setIcon",new Object[]{(Object)(_bd.getObject())});
 };
 //BA.debugLineNum = 502;BA.debugLine="If mi.AddToBar Then";
if (_mi.AddToBar /*boolean*/ ) { 
 //BA.debugLineNum = 503;BA.debugLine="NativeMenuItem.RunMethod(\"setShowAsAction\", Arr";
_nativemenuitem.RunMethod("setShowAsAction",new Object[]{(Object)(1)});
 };
 //BA.debugLineNum = 505;BA.debugLine="Dim listener As JavaObject";
_listener = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 506;BA.debugLine="listener.InitializeNewInstance(Application.Packa";
_listener.InitializeNewInstance(__c.Application.getPackageName()+".b4xpagesmanager$PagesMenuListener",new Object[]{_pi.B4XPage /*Object*/ ,(Object)(_mi.Tag /*String*/ )});
 //BA.debugLineNum = 507;BA.debugLine="NativeMenuItem.RunMethod(\"setOnMenuItemClickList";
_nativemenuitem.RunMethod("setOnMenuItemClickListener",new Object[]{(Object)(_listener.getObject())});
 }
};
 //BA.debugLineNum = 509;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvv2(aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Private Sub CreatePageIfNeeded(pi As B4XPageInfo)";
 //BA.debugLineNum = 350;BA.debugLine="If pi.Created Then Return";
if (_pi.Created /*boolean*/ ) { 
if (true) return "";};
 //BA.debugLineNum = 351;BA.debugLine="pi.IsFirst = IdToB4XPage.Size = 1";
_pi.IsFirst /*boolean*/  = _vvvvvvvvvvvvvvvvv1._getvvvvvvvv2 /*int*/ ()==1;
 //BA.debugLineNum = 352;BA.debugLine="CreatePageImpl (pi)";
_vvvvvvvvvvvvvvv3(_pi);
 //BA.debugLineNum = 353;BA.debugLine="pi.Created = True";
_pi.Created /*boolean*/  = __c.True;
 //BA.debugLineNum = 354;BA.debugLine="RootB4XToPage.Put(pi.Root, pi)";
_vvvvvvvvvvvvvvvvv2._vvvvvvvvvvv3 /*String*/ ((Object)(_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_pi));
 //BA.debugLineNum = 355;BA.debugLine="LogEvent(pi, \"B4XPage_Created\")";
_vvvvvvvvvvvvvvvv1(_pi,"B4XPage_Created");
 //BA.debugLineNum = 356;BA.debugLine="CallSub2(pi.B4XPage, \"B4XPage_Created\", pi.root)";
__c.CallSubNew2(ba,_pi.B4XPage /*Object*/ ,"B4XPage_Created",(Object)(_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ));
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvv3(aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
 //BA.debugLineNum = 366;BA.debugLine="Private Sub CreatePageImpl (pi As B4XPageInfo)";
 //BA.debugLineNum = 378;BA.debugLine="pi.Root = xui.CreatePanel(\"root\")";
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _vvvvv2.CreatePanel(ba,"root");
 //BA.debugLineNum = 379;BA.debugLine="pi.root.SetLayoutAnimated(0, 0, 0, 100%x, 100%y)";
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 380;BA.debugLine="pi.Parent = CreateB4XPageParent(mMainForm)";
_pi.Parent /*aiandeh.sazan.run.b4xpagesmanager._b4xpageparent*/  = _vvvvvvvvvvvvvv0((Object)(_vvvvvvvvvvvvvvvvv5.getObject()));
 //BA.debugLineNum = 381;BA.debugLine="pi.Parent.MenuItems.Initialize";
_pi.Parent /*aiandeh.sazan.run.b4xpagesmanager._b4xpageparent*/ .MenuItems /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return "";
}
public aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo  _vvvvvvvvvvvvvvv4(Object _page) throws Exception{
aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _pi = null;
 //BA.debugLineNum = 303;BA.debugLine="Public Sub FindPIFromB4XPage (Page As Object) As B";
 //BA.debugLineNum = 304;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
{
final anywheresoftware.b4a.BA.IterableList group1 = _vvvvvvvvvvvvvvvvv1._getvvvvvvvvvvvvv5 /*anywheresoftware.b4a.objects.collections.List*/ ();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_pi = (aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo)(group1.Get(index1));
 //BA.debugLineNum = 305;BA.debugLine="If pi.B4XPage = Page Then";
if ((_pi.B4XPage /*Object*/ ).equals(_page)) { 
 //BA.debugLineNum = 306;BA.debugLine="Return pi";
if (true) return _pi;
 };
 }
};
 //BA.debugLineNum = 309;BA.debugLine="Return Null";
if (true) return (aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo)(__c.Null);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public Object  _vv6(String _id) throws Exception{
 //BA.debugLineNum = 391;BA.debugLine="Public Sub GetPage (Id As String) As Object";
 //BA.debugLineNum = 392;BA.debugLine="Return GetPageFromId(Id).B4XPage";
if (true) return _vvvvvvvvvvvvvvv5(_id).B4XPage /*Object*/ ;
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
return null;
}
public aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo  _vvvvvvvvvvvvvvv5(String _id) throws Exception{
aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _pi = null;
 //BA.debugLineNum = 395;BA.debugLine="Private Sub GetPageFromId (id As String) As B4XPag";
 //BA.debugLineNum = 396;BA.debugLine="Dim pi As B4XPageInfo = IdToB4XPage.Get(id.ToLowe";
_pi = (aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo)(_vvvvvvvvvvvvvvvvv1._vvvvvvv7 /*Object*/ ((Object)(_id.toLowerCase())));
 //BA.debugLineNum = 397;BA.debugLine="If pi = Null Then";
if (_pi== null) { 
 //BA.debugLineNum = 398;BA.debugLine="Log(\"Error: page id not found: \" & id)";
__c.LogImpl("99830403","Error: page id not found: "+_id,0);
 //BA.debugLineNum = 399;BA.debugLine="Log(\"Ids: \" & IdToB4XPage.Keys) 'ignore";
__c.LogImpl("99830404","Ids: "+BA.ObjectToString(_vvvvvvvvvvvvvvvvv1._getvvvvvvvvvvv2 /*anywheresoftware.b4a.objects.collections.List*/ ()),0);
 };
 //BA.debugLineNum = 401;BA.debugLine="Return pi";
if (true) return _pi;
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return null;
}
public aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo  _vvvvvvvvvvvvvvv6(anywheresoftware.b4a.objects.B4XViewWrapper _root) throws Exception{
 //BA.debugLineNum = 404;BA.debugLine="Public Sub GetPageInfoFromRoot (Root As B4XView) A";
 //BA.debugLineNum = 405;BA.debugLine="Return RootB4XToPage.Get(Root)";
if (true) return (aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo)(_vvvvvvvvvvvvvvvvv2._vvvvvvv7 /*Object*/ ((Object)(_root.getObject())));
 //BA.debugLineNum = 406;BA.debugLine="End Sub";
return null;
}
public aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo  _vvvvvvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 589;BA.debugLine="Public Sub GetTopPage As B4XPageInfo";
 //BA.debugLineNum = 590;BA.debugLine="If mStackOfPageIds.Size = 0 Then Return Null";
if (_vvvvvvvvvvvvvvvvv4._getvvvvvvvv2 /*int*/ ()==0) { 
if (true) return (aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo)(__c.Null);};
 //BA.debugLineNum = 591;BA.debugLine="Return IdToB4XPage.Get(mStackOfPageIds.AsList.Get";
if (true) return (aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo)(_vvvvvvvvvvvvvvvvv1._vvvvvvv7 /*Object*/ (_vvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvv1 /*anywheresoftware.b4a.objects.collections.List*/ ().Get((int) (_vvvvvvvvvvvvvvvvv4._getvvvvvvvv2 /*int*/ ()-1))));
 //BA.debugLineNum = 592;BA.debugLine="End Sub";
return null;
}
public void  _vvvvvvvvvvvvvvv0(aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
ResumableSub_HandleCloseRequest rsub = new ResumableSub_HandleCloseRequest(this,_pi);
rsub.resume(ba, null);
}
public static class ResumableSub_HandleCloseRequest extends BA.ResumableSub {
public ResumableSub_HandleCloseRequest(aiandeh.sazan.run.b4xpagesmanager parent,aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _pi) {
this.parent = parent;
this._pi = _pi;
}
aiandeh.sazan.run.b4xpagesmanager parent;
aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _pi;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
boolean _shouldclose = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 536;BA.debugLine="LogEvent(pi, \"B4XPage_CloseRequest\")";
parent._vvvvvvvvvvvvvvvv1(_pi,"B4XPage_CloseRequest");
 //BA.debugLineNum = 537;BA.debugLine="Dim rs As ResumableSub = CallSub(pi.B4XPage, \"B4X";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), (anywheresoftware.b4a.BA.ResumableSub)(parent.__c.CallSubNew(ba,_pi.B4XPage /*Object*/ ,"B4XPage_CloseRequest")));
 //BA.debugLineNum = 538;BA.debugLine="Wait For (rs) Complete (ShouldClose As Boolean)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_shouldclose = (Boolean) result[0];
;
 //BA.debugLineNum = 539;BA.debugLine="If ShouldClose Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_shouldclose) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 540;BA.debugLine="ClosePage(pi.B4XPage)";
parent._vv3(_pi.B4XPage /*Object*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 542;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(boolean _shouldclose) throws Exception{
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ActivityWrapper _activity) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _module = null;
boolean _nonmainpagewasadded = false;
 //BA.debugLineNum = 59;BA.debugLine="Public Sub Initialize (Activity As Activity)";
 //BA.debugLineNum = 63;BA.debugLine="IdToB4XPage.Initialize";
_vvvvvvvvvvvvvvvvv1._initialize /*String*/ (ba);
 //BA.debugLineNum = 64;BA.debugLine="RootB4XToPage.Initialize";
_vvvvvvvvvvvvvvvvv2._initialize /*String*/ (ba);
 //BA.debugLineNum = 65;BA.debugLine="mStackOfPageIds.Initialize";
_vvvvvvvvvvvvvvvvv4._initialize /*String*/ (ba);
 //BA.debugLineNum = 69;BA.debugLine="Context.InitializeContext";
_vvvvvvvvvvvvvvvvv3.InitializeContext(ba);
 //BA.debugLineNum = 70;BA.debugLine="mMainForm = Activity";
_vvvvvvvvvvvvvvvvv5 = _activity;
 //BA.debugLineNum = 71;BA.debugLine="CheckMainActivityOrientations";
_vvvvvvvvvvvvvv4();
 //BA.debugLineNum = 72;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
 //BA.debugLineNum = 73;BA.debugLine="Dim module As JavaObject";
_module = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 74;BA.debugLine="module.InitializeStatic(jo.RunMethodJO(\"getActivi";
_module.InitializeStatic(BA.ObjectToString(_jo.RunMethodJO("getActivityBA",(Object[])(__c.Null)).GetField("className"))).SetField("dontPause",(Object)(__c.True));
 //BA.debugLineNum = 78;BA.debugLine="B4XPages.InternalSetPagesManager(Me)";
_vvvvvv2._vv0 /*String*/ (ba,this);
 //BA.debugLineNum = 79;BA.debugLine="MainPage.Initialize";
_vvv2._initialize /*String*/ (ba);
 //BA.debugLineNum = 80;BA.debugLine="Dim NonMainPageWasAdded As Boolean = IdToB4XPage.";
_nonmainpagewasadded = _vvvvvvvvvvvvvvvvv1._getvvvvvvvv2 /*int*/ ()>0;
 //BA.debugLineNum = 81;BA.debugLine="IdToB4XPage.Put(\"~~~~~temp~~~~\", CreateB4XPageInf";
_vvvvvvvvvvvvvvvvv1._vvvvvvvvvvv3 /*String*/ ((Object)("~~~~~temp~~~~"),(Object)(_vvvvvvvvvvvvvv7((Object)(_vvv2),"",__c.False,(Object)(""))));
 //BA.debugLineNum = 82;BA.debugLine="BackgroundStateChanged(True)";
_vvvvvvvvvvvvvv3(__c.True);
 //BA.debugLineNum = 83;BA.debugLine="IdToB4XPage.Remove(\"~~~~~temp~~~~\")";
_vvvvvvvvvvvvvvvvv1._vvvvvvvvv6 /*String*/ ((Object)("~~~~~temp~~~~"));
 //BA.debugLineNum = 84;BA.debugLine="AddPageAndCreate(\"MainPage\", MainPage)";
_vv2("MainPage",(Object)(_vvv2));
 //BA.debugLineNum = 85;BA.debugLine="If LogEvents = False Then";
if (_vvvvvvvvvvvvvvvvvv3==__c.False) { 
 //BA.debugLineNum = 86;BA.debugLine="Log(\"Call B4XPages.GetManager.LogEvents = True t";
__c.LogImpl("98716315","Call B4XPages.GetManager.LogEvents = True to enable logging B4XPages events.",0);
 };
 //BA.debugLineNum = 88;BA.debugLine="If NonMainPageWasAdded Then";
if (_nonmainpagewasadded) { 
 //BA.debugLineNum = 89;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(_vvvvv2.getIsB4i())) { 
 //BA.debugLineNum = 90;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
_vvvvvvvvvvvvvvvv2(_vvvvvvvvvvvvvvv7(),"B4XPage_Appear",(Object[])(__c.Null));
 };
 };
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvv1(aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _pi,String _ev) throws Exception{
String _msg = "";
 //BA.debugLineNum = 637;BA.debugLine="Private Sub LogEvent (pi As B4XPageInfo, ev As Str";
 //BA.debugLineNum = 638;BA.debugLine="If LogEvents Then";
if (_vvvvvvvvvvvvvvvvvv3) { 
 //BA.debugLineNum = 639;BA.debugLine="Dim msg As String = $\"*** ${pi.Id}: ${ev} ${Stac";
_msg = ("*** "+__c.SmartStringFormatter("",(Object)(_pi.Id /*String*/ ))+": "+__c.SmartStringFormatter("",(Object)(_ev))+" "+__c.SmartStringFormatter("",(Object)(_vvvvvvvvvvvvvvvvvv2))+"");
 //BA.debugLineNum = 640;BA.debugLine="Log(msg)";
__c.LogImpl("910944515",_msg,0);
 };
 //BA.debugLineNum = 642;BA.debugLine="End Sub";
return "";
}
public String  _mainform_resize(double _width,double _height) throws Exception{
int _w = 0;
int _h = 0;
 //BA.debugLineNum = 582;BA.debugLine="Public Sub MainForm_Resize(Width As Double, Height";
 //BA.debugLineNum = 583;BA.debugLine="Dim w As Int = Width";
_w = (int) (_width);
 //BA.debugLineNum = 584;BA.debugLine="Dim h As Int = Height";
_h = (int) (_height);
 //BA.debugLineNum = 585;BA.debugLine="RaiseEvent(GetPageInfoFromRoot(Sender), \"B4XPage_";
_vvvvvvvvvvvvvvvv2(_vvvvvvvvvvvvvvv6((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)))),"B4XPage_Resize",new Object[]{(Object)(_w),(Object)(_h)});
 //BA.debugLineNum = 586;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvv2(aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _targetpage,String _subname,Object[] _params) throws Exception{
int _length = 0;
 //BA.debugLineNum = 545;BA.debugLine="Public Sub RaiseEvent (TargetPage As B4XPageInfo,";
 //BA.debugLineNum = 546;BA.debugLine="If TargetPage = Null Then Return";
if (_targetpage== null) { 
if (true) return "";};
 //BA.debugLineNum = 547;BA.debugLine="Dim length As Int";
_length = 0;
 //BA.debugLineNum = 548;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
if (_params== null) { 
_length = (int) (0);}
else {
_length = _params.length;};
 //BA.debugLineNum = 549;BA.debugLine="LogEvent(TargetPage, SubName)";
_vvvvvvvvvvvvvvvv1(_targetpage,_subname);
 //BA.debugLineNum = 550;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
if (_vvvvv2.SubExists(ba,_targetpage.B4XPage /*Object*/ ,_subname,_length)==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 551;BA.debugLine="Select length";
switch (_length) {
case 0: {
 //BA.debugLineNum = 553;BA.debugLine="CallSubDelayed(TargetPage.B4XPage, SubName)";
__c.CallSubDelayed(ba,_targetpage.B4XPage /*Object*/ ,_subname);
 break; }
case 1: {
 //BA.debugLineNum = 555;BA.debugLine="CallSubDelayed2(TargetPage.B4XPage, SubName, Pa";
__c.CallSubDelayed2(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)]);
 break; }
case 2: {
 //BA.debugLineNum = 557;BA.debugLine="CallSubDelayed3(TargetPage.B4XPage, SubName, Pa";
__c.CallSubDelayed3(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)],_params[(int) (1)]);
 break; }
default: {
 //BA.debugLineNum = 559;BA.debugLine="Log(\"Too many parameters\")";
__c.LogImpl("910420238","Too many parameters",0);
 break; }
}
;
 //BA.debugLineNum = 561;BA.debugLine="End Sub";
return "";
}
public Object  _vvvvvvvvvvvvvvvv3(aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _targetpage,String _subname,Object[] _params) throws Exception{
int _length = 0;
 //BA.debugLineNum = 563;BA.debugLine="Public Sub RaiseEventWithResult (TargetPage As B4X";
 //BA.debugLineNum = 564;BA.debugLine="If TargetPage = Null Then Return Null";
if (_targetpage== null) { 
if (true) return __c.Null;};
 //BA.debugLineNum = 565;BA.debugLine="Dim length As Int";
_length = 0;
 //BA.debugLineNum = 566;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
if (_params== null) { 
_length = (int) (0);}
else {
_length = _params.length;};
 //BA.debugLineNum = 567;BA.debugLine="LogEvent(TargetPage, SubName)";
_vvvvvvvvvvvvvvvv1(_targetpage,_subname);
 //BA.debugLineNum = 568;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
if (_vvvvv2.SubExists(ba,_targetpage.B4XPage /*Object*/ ,_subname,_length)==__c.False) { 
if (true) return __c.Null;};
 //BA.debugLineNum = 569;BA.debugLine="Select length";
switch (_length) {
case 0: {
 //BA.debugLineNum = 571;BA.debugLine="Return CallSub(TargetPage.B4XPage, SubName)";
if (true) return __c.CallSubNew(ba,_targetpage.B4XPage /*Object*/ ,_subname);
 break; }
case 1: {
 //BA.debugLineNum = 573;BA.debugLine="Return CallSub2(TargetPage.B4XPage, SubName, Pa";
if (true) return __c.CallSubNew2(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)]);
 break; }
case 2: {
 //BA.debugLineNum = 575;BA.debugLine="Return CallSub3(TargetPage.B4XPage, SubName, Pa";
if (true) return __c.CallSubNew3(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)],_params[(int) (1)]);
 break; }
default: {
 //BA.debugLineNum = 577;BA.debugLine="Log(\"Too many parameters\")";
__c.LogImpl("910485774","Too many parameters",0);
 break; }
}
;
 //BA.debugLineNum = 579;BA.debugLine="Return Null";
if (true) return __c.Null;
 //BA.debugLineNum = 580;BA.debugLine="End Sub";
return null;
}
public String  _vvv3(Object _b4xpage,Object _title) throws Exception{
aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _pi = null;
 //BA.debugLineNum = 360;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
 //BA.debugLineNum = 361;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
_pi = _vvvvvvvvvvvvvvv4(_b4xpage);
 //BA.debugLineNum = 362;BA.debugLine="pi.Title = Title";
_pi.Title /*Object*/  = _title;
 //BA.debugLineNum = 363;BA.debugLine="pi.Parent.NativeType.Title = Title";
_pi.Parent /*aiandeh.sazan.run.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4a.objects.ActivityWrapper*/ .setTitle(BA.ObjectToCharSequence(_title));
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return "";
}
public String  _vvv4(String _id) throws Exception{
aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _pi = null;
aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _top = null;
 //BA.debugLineNum = 156;BA.debugLine="Public Sub ShowPage (Id As String)";
 //BA.debugLineNum = 157;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
_pi = _vvvvvvvvvvvvvvv5(_id);
 //BA.debugLineNum = 158;BA.debugLine="If pi = GetTopPage Then Return";
if ((_pi).equals(_vvvvvvvvvvvvvvv7())) { 
if (true) return "";};
 //BA.debugLineNum = 159;BA.debugLine="CreatePageIfNeeded(pi)";
_vvvvvvvvvvvvvvv2(_pi);
 //BA.debugLineNum = 160;BA.debugLine="TopPageDisappear";
_vvvvvvvvvvvvvvvv6();
 //BA.debugLineNum = 162;BA.debugLine="Dim Top As B4XPageInfo = GetTopPage";
_top = _vvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 163;BA.debugLine="If Top <> Null Then";
if (_top!= null) { 
 //BA.debugLineNum = 164;BA.debugLine="Top.Root.RemoveViewFromParent";
_top.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
 //BA.debugLineNum = 174;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
_vvvvvvvvvvvvvvvvv4._vvvvvvvvv6 /*String*/ ((Object)(_pi.Id /*String*/ ));
 //BA.debugLineNum = 175;BA.debugLine="ShowPageImpl(pi)";
_vvvvvvvvvvvvvvvv4(_pi);
 //BA.debugLineNum = 176;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
_vvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvv0 /*String*/ ((Object)(_pi.Id /*String*/ ));
 //BA.debugLineNum = 177;BA.debugLine="TopPageAppear";
_vvvvvvvvvvvvvvvv5();
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public String  _vvv5(String _id) throws Exception{
aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _pi = null;
aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _pagetoremove = null;
 //BA.debugLineNum = 180;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
 //BA.debugLineNum = 181;BA.debugLine="If GetTopPage = Null Then";
if (_vvvvvvvvvvvvvvv7()== null) { 
 //BA.debugLineNum = 182;BA.debugLine="ShowPage(Id)";
_vvv4(_id);
 //BA.debugLineNum = 183;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 185;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
_pi = _vvvvvvvvvvvvvvv5(_id);
 //BA.debugLineNum = 186;BA.debugLine="CreatePageIfNeeded(pi)";
_vvvvvvvvvvvvvvv2(_pi);
 //BA.debugLineNum = 187;BA.debugLine="TopPageDisappear";
_vvvvvvvvvvvvvvvv6();
 //BA.debugLineNum = 191;BA.debugLine="For Each Id As String In mStackOfPageIds.AsList";
{
final anywheresoftware.b4a.BA.IterableList group8 = _vvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvv1 /*anywheresoftware.b4a.objects.collections.List*/ ();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_id = BA.ObjectToString(group8.Get(index8));
 //BA.debugLineNum = 192;BA.debugLine="Dim PageToRemove As B4XPageInfo = GetPageFromId(";
_pagetoremove = _vvvvvvvvvvvvvvv5(_id);
 //BA.debugLineNum = 194;BA.debugLine="PageToRemove.Root.RemoveViewFromParent";
_pagetoremove.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 }
};
 //BA.debugLineNum = 201;BA.debugLine="mStackOfPageIds.Clear";
_vvvvvvvvvvvvvvvvv4._vvvvvvv6 /*String*/ ();
 //BA.debugLineNum = 202;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
_vvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvv0 /*String*/ ((Object)(_pi.Id /*String*/ ));
 //BA.debugLineNum = 203;BA.debugLine="If xui.IsB4A Or xui.IsB4J Then";
if (_vvvvv2.getIsB4A() || _vvvvv2.getIsB4J()) { 
 //BA.debugLineNum = 204;BA.debugLine="ShowPageImpl(pi)";
_vvvvvvvvvvvvvvvv4(_pi);
 };
 //BA.debugLineNum = 206;BA.debugLine="TopPageAppear";
_vvvvvvvvvvvvvvvv5();
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvv4(aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
 //BA.debugLineNum = 330;BA.debugLine="Private Sub ShowPageImpl (pi As B4XPageInfo)";
 //BA.debugLineNum = 336;BA.debugLine="If pi.Root.Parent.IsInitialized Then pi.Root.Remo";
if (_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
 //BA.debugLineNum = 337;BA.debugLine="Dim pnl As Panel = pi.Root";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
 //BA.debugLineNum = 338;BA.debugLine="If TransitionAnimationDuration > 0 Then";
if (_vvvvvvvvvvvvvvvvvv1>0) { 
 //BA.debugLineNum = 339;BA.debugLine="mMainForm.AddView(pnl, 0, 0, 20dip, 20dip)";
_vvvvvvvvvvvvvvvvv5.AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 340;BA.debugLine="pnl.SetLayoutAnimated(TransitionAnimationDuratio";
_pnl.SetLayoutAnimated(_vvvvvvvvvvvvvvvvvv1,(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 }else {
 //BA.debugLineNum = 342;BA.debugLine="mMainForm.AddView(pnl, 0, 0, 100%x, 100%y)";
_vvvvvvvvvvvvvvvvv5.AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 };
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvv5() throws Exception{
aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _pi = null;
 //BA.debugLineNum = 285;BA.debugLine="Private Sub TopPageAppear";
 //BA.debugLineNum = 286;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = _vvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 287;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
 //BA.debugLineNum = 288;BA.debugLine="pi.Parent.NativeType.Title = pi.Title";
_pi.Parent /*aiandeh.sazan.run.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4a.objects.ActivityWrapper*/ .setTitle(BA.ObjectToCharSequence(_pi.Title /*Object*/ ));
 //BA.debugLineNum = 289;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(_vvvvv2.getIsB4i())) { 
 //BA.debugLineNum = 290;BA.debugLine="If IsForeground Then";
if (_vvvvvvvvvvvvvvvvv0) { 
 //BA.debugLineNum = 291;BA.debugLine="RaiseEvent(pi, \"B4XPage_Appear\", Null)";
_vvvvvvvvvvvvvvvv2(_pi,"B4XPage_Appear",(Object[])(__c.Null));
 };
 };
 //BA.debugLineNum = 295;BA.debugLine="If ShowUpIndicator And ActionBar.IsInitialized Th";
if (_vvvvvvvvvvvvvvvvv6 && _vvvvvvvvvvvvvvvvv7.IsInitialized()) { 
 //BA.debugLineNum = 296;BA.debugLine="ActionBar.RunMethod(\"setDisplayHomeAsUpEnabled\",";
_vvvvvvvvvvvvvvvvv7.RunMethod("setDisplayHomeAsUpEnabled",new Object[]{(Object)(_vvvvvvvvvvvvvvvvv4._getvvvvvvvv2 /*int*/ ()>1)});
 };
 //BA.debugLineNum = 298;BA.debugLine="UpdateMenuItems";
_vvvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 300;BA.debugLine="UpdateStackString";
_vvvvvvvvvvvvvvvv0();
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvv6() throws Exception{
aiandeh.sazan.run.b4xpagesmanager._b4xpageinfo _pi = null;
 //BA.debugLineNum = 274;BA.debugLine="Private Sub TopPageDisappear";
 //BA.debugLineNum = 275;BA.debugLine="If xui.IsB4J Then Return";
if (_vvvvv2.getIsB4J()) { 
if (true) return "";};
 //BA.debugLineNum = 276;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = _vvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 277;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
 //BA.debugLineNum = 278;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(_vvvvv2.getIsB4i())) { 
 //BA.debugLineNum = 279;BA.debugLine="If IsForeground Then";
if (_vvvvvvvvvvvvvvvvv0) { 
 //BA.debugLineNum = 280;BA.debugLine="RaiseEventWithResult(pi, \"B4XPage_Disappear\", N";
_vvvvvvvvvvvvvvvv3(_pi,"B4XPage_Disappear",(Object[])(__c.Null));
 };
 };
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 487;BA.debugLine="Private Sub UpdateMenuItems";
 //BA.debugLineNum = 488;BA.debugLine="Context.RunMethod(\"invalidateOptionsMenu\", Null)";
_vvvvvvvvvvvvvvvvv3.RunMethod("invalidateOptionsMenu",(Object[])(__c.Null));
 //BA.debugLineNum = 489;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvv0() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _id = "";
 //BA.debugLineNum = 644;BA.debugLine="Public Sub UpdateStackString";
 //BA.debugLineNum = 645;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 646;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 647;BA.debugLine="sb.Append(\"[\")";
_sb.Append("[");
 //BA.debugLineNum = 648;BA.debugLine="If mStackOfPageIds.Size > 0 Then";
if (_vvvvvvvvvvvvvvvvv4._getvvvvvvvv2 /*int*/ ()>0) { 
 //BA.debugLineNum = 649;BA.debugLine="For Each id As String In mStackOfPageIds.AsList";
{
final anywheresoftware.b4a.BA.IterableList group5 = _vvvvvvvvvvvvvvvvv4._vvvvvvvvvvvvvv1 /*anywheresoftware.b4a.objects.collections.List*/ ();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_id = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 650;BA.debugLine="sb.Append(id).Append(\", \")";
_sb.Append(_id).Append(", ");
 }
};
 //BA.debugLineNum = 652;BA.debugLine="sb.Remove(sb.Length - 2, sb.Length)";
_sb.Remove((int) (_sb.getLength()-2),_sb.getLength());
 };
 //BA.debugLineNum = 654;BA.debugLine="sb.Append(\"]\")";
_sb.Append("]");
 //BA.debugLineNum = 655;BA.debugLine="StackString = sb.ToString";
_vvvvvvvvvvvvvvvvvv2 = _sb.ToString();
 //BA.debugLineNum = 656;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
public boolean checkIfAppCompat(android.app.Activity act) {
	return act.getClass().getSuperclass().getName().equals("androidx.appcompat.app.AppCompatActivity");
}
public static class PagesMenuListener implements android.view.MenuItem.OnMenuItemClickListener {
	private B4AClass target;
	private String tag;
	public PagesMenuListener(B4AClass target, String tag) {
		this.target = target;
		this.tag = tag;
	}
 	public boolean onMenuItemClick(android.view.MenuItem item) {
		target.getBA().raiseEventFromUI(null, "b4xpage_menuclick", tag);
		return true;
	}
}
}
