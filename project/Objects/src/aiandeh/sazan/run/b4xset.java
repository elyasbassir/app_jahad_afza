package aiandeh.sazan.run;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xset extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "aiandeh.sazan.run.b4xset");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", aiandeh.sazan.run.b4xset.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public aiandeh.sazan.run.b4xorderedmap _vvvvvvvvvvvvv6 = null;
public aiandeh.sazan.run.main _vvvvv7 = null;
public aiandeh.sazan.run.page_index _page_index = null;
public aiandeh.sazan.run.animactivity _vvvvv0 = null;
public aiandeh.sazan.run.starter _vvvvvv1 = null;
public aiandeh.sazan.run.b4xpages _vvvvvv2 = null;
public aiandeh.sazan.run.b4xcollections _vvvvvv3 = null;
public String  _vvvvvvvvvvvvv0(Object _value) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Add(Value As Object)";
 //BA.debugLineNum = 10;BA.debugLine="map.Put(Value, \"\")";
_vvvvvvvvvvvvv6._vvvvvvvvvvv3 /*String*/ (_value,(Object)(""));
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _vvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Public Sub AsList As List";
 //BA.debugLineNum = 30;BA.debugLine="Return map.Keys";
if (true) return _vvvvvvvvvvvvv6._getvvvvvvvvvvv2 /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private map As B4XOrderedMap";
_vvvvvvvvvvvvv6 = new aiandeh.sazan.run.b4xorderedmap();
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvv6() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Public Sub Clear";
 //BA.debugLineNum = 26;BA.debugLine="map.Clear";
_vvvvvvvvvvvvv6._vvvvvvv6 /*String*/ ();
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public boolean  _vvvvvvvvvvvvvv2(Object _value) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Contains (Value As Object) As Boolean";
 //BA.debugLineNum = 18;BA.debugLine="Return map.ContainsKey(Value)";
if (true) return _vvvvvvvvvvvvv6._vvvvvvvvvv6 /*boolean*/ (_value);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return false;
}
public int  _getvvvvvvvv2() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Public Sub getSize As Int";
 //BA.debugLineNum = 22;BA.debugLine="Return map.Size";
if (true) return _vvvvvvvvvvvvv6._getvvvvvvvv2 /*int*/ ();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 5;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 6;BA.debugLine="map.Initialize";
_vvvvvvvvvvvvv6._initialize /*String*/ (ba);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvv6(Object _value) throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Remove(Value As Object)";
 //BA.debugLineNum = 14;BA.debugLine="map.Remove(Value)";
_vvvvvvvvvvvvv6._vvvvvvvvv6 /*String*/ (_value);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
