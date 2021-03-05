package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ColorlibLoginPage;

import net.thucydides.core.annotations.Step;

public class PopupValidationSteps {
	
	
	ColorlibLoginPage ColorlibLoginPage;
	
	@Step
	
	public void login_colorlib(String strUsuario, String strPass) {
		// TODO Auto-generated method stub
		ColorlibLoginPage.open();
	/* 
	  b.Ingresar usuario demo
	  c.Ingresar password demo
	  d.Click en bogon sing in
	   */
		
		ColorlibLoginPage.IngresarDatos(strUsuario,strPass);
	// e.Vefificar la autenticacion (label en home)
		
		ColorlibLoginPage.VerificaHome();
		
		
	}

}
