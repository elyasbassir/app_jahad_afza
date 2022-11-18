package aiandeh.sazan.run.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_splash{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("background").vw.setLeft((int)((0d / 100 * width)));
views.get("background").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("background").vw.setTop((int)((0d / 100 * height)));
views.get("background").vw.setHeight((int)((100d / 100 * height) - ((0d / 100 * height))));
views.get("lable").vw.setLeft((int)((20d / 100 * width)));
views.get("lable").vw.setWidth((int)((80d / 100 * width) - ((20d / 100 * width))));
//BA.debugLineNum = 8;BA.debugLine="lable.SetTopAndBottom(10%y,100%y)"[splash/General script]
views.get("lable").vw.setTop((int)((10d / 100 * height)));
views.get("lable").vw.setHeight((int)((100d / 100 * height) - ((10d / 100 * height))));
//BA.debugLineNum = 10;BA.debugLine="logo.SetLeftAndRight(15%x,85%x)"[splash/General script]
views.get("logo").vw.setLeft((int)((15d / 100 * width)));
views.get("logo").vw.setWidth((int)((85d / 100 * width) - ((15d / 100 * width))));
//BA.debugLineNum = 11;BA.debugLine="logo.SetTopAndBottom(5%y,50%y)"[splash/General script]
views.get("logo").vw.setTop((int)((5d / 100 * height)));
views.get("logo").vw.setHeight((int)((50d / 100 * height) - ((5d / 100 * height))));
//BA.debugLineNum = 13;BA.debugLine="description.SetLeftAndRight(10%x,90%x)"[splash/General script]
views.get("description").vw.setLeft((int)((10d / 100 * width)));
views.get("description").vw.setWidth((int)((90d / 100 * width) - ((10d / 100 * width))));
//BA.debugLineNum = 14;BA.debugLine="description.SetTopAndBottom(50%y,100%y)"[splash/General script]
views.get("description").vw.setTop((int)((50d / 100 * height)));
views.get("description").vw.setHeight((int)((100d / 100 * height) - ((50d / 100 * height))));

}
}