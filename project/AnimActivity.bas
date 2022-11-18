B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=11.5
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
private Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub setAnimActivity(InAnimation As String, OutAnimation As String)
	Dim r1 As Reflector
	Dim package As String
	Dim In, out As Int
	package = r1.GetStaticField("anywheresoftware.b4a.BA", "packageName")
	In = r1.GetStaticField(package & ".R$anim", InAnimation)
	out = r1.GetStaticField(package & ".R$anim", OutAnimation)
	r1.Target = r1.GetActivity
	r1.RunMethod4("overridePendingTransition", Array As Object(In, out), _
	Array As String("java.lang.int", "java.lang.int"))
End Sub