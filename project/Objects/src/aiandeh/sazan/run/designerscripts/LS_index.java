package aiandeh.sazan.run.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_index{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[index/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 4;BA.debugLine="WebView1.SetLeftAndRight(0%x,100%x)"[index/General script]
views.get("webview1").vw.setLeft((int)((0d / 100 * width)));
views.get("webview1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 5;BA.debugLine="WebView1.SetTopAndBottom(0%y,100%Y)"[index/General script]
views.get("webview1").vw.setTop((int)((0d / 100 * height)));
views.get("webview1").vw.setHeight((int)((100d / 100 * height) - ((0d / 100 * height))));
//BA.debugLineNum = 7;BA.debugLine="loading.SetLeftAndRight(15%x,90%x)"[index/General script]
views.get("loading").vw.setLeft((int)((15d / 100 * width)));
views.get("loading").vw.setWidth((int)((90d / 100 * width) - ((15d / 100 * width))));
//BA.debugLineNum = 8;BA.debugLine="loading.SetTopAndBottom(30%y,70%y)"[index/General script]
views.get("loading").vw.setTop((int)((30d / 100 * height)));
views.get("loading").vw.setHeight((int)((70d / 100 * height) - ((30d / 100 * height))));

}
}