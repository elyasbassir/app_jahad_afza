B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=11.5
@EndOfDesignText@
'Class module
Private Sub Class_Globals
	Private Ti As Timer
	Private Timr As Timer
	Private I As Float
	Private TT As String

End Sub

'1,8 Seconds
Public Sub Initialize (ToastText As String)
	I = 0
	Ti.Initialize ("Ti",1000)
	Ti.Enabled = True
	Timr.Initialize ("Timr",100)
	Timr.Enabled = True
	TT = ToastText
End Sub
Private Sub Ti_Tick

	If I > 0 Then
		I = I-0.49
	End If

End Sub
Private Sub Timr_Tick

	If I >= 2 Then
		ExitApplication
	End If

End Sub
Public Sub TapToClose

	ToastMessageShow (TT,False)
	
	I = I+1.3
		
End Sub