package aiandeh.sazan.run;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class animactivity {
private static animactivity mostCurrent = new animactivity();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public aiandeh.sazan.run.main _vvvvv7 = null;
public aiandeh.sazan.run.page_index _page_index = null;
public aiandeh.sazan.run.starter _vvvvvv1 = null;
public aiandeh.sazan.run.b4xpages _vvvvvv2 = null;
public aiandeh.sazan.run.b4xcollections _vvvvvv3 = null;
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="private Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static String  _v5(anywheresoftware.b4a.BA _ba,String _inanimation,String _outanimation) throws Exception{
anywheresoftware.b4a.agraham.reflection.Reflection _r1 = null;
String _package = "";
int _in = 0;
int _out = 0;
 //BA.debugLineNum = 9;BA.debugLine="Sub setAnimActivity(InAnimation As String, OutAnim";
 //BA.debugLineNum = 10;BA.debugLine="Dim r1 As Reflector";
_r1 = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 11;BA.debugLine="Dim package As String";
_package = "";
 //BA.debugLineNum = 12;BA.debugLine="Dim In, out As Int";
_in = 0;
_out = 0;
 //BA.debugLineNum = 13;BA.debugLine="package = r1.GetStaticField(\"anywheresoftware.b4a";
_package = BA.ObjectToString(_r1.GetStaticField("anywheresoftware.b4a.BA","packageName"));
 //BA.debugLineNum = 14;BA.debugLine="In = r1.GetStaticField(package & \".R$anim\", InAni";
_in = (int)(BA.ObjectToNumber(_r1.GetStaticField(_package+".R$anim",_inanimation)));
 //BA.debugLineNum = 15;BA.debugLine="out = r1.GetStaticField(package & \".R$anim\", OutA";
_out = (int)(BA.ObjectToNumber(_r1.GetStaticField(_package+".R$anim",_outanimation)));
 //BA.debugLineNum = 16;BA.debugLine="r1.Target = r1.GetActivity";
_r1.Target = (Object)(_r1.GetActivity((_ba.processBA == null ? _ba : _ba.processBA)));
 //BA.debugLineNum = 17;BA.debugLine="r1.RunMethod4(\"overridePendingTransition\", Array";
_r1.RunMethod4("overridePendingTransition",new Object[]{(Object)(_in),(Object)(_out)},new String[]{"java.lang.int","java.lang.int"});
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
}
