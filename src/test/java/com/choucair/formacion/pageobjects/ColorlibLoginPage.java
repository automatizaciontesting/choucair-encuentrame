package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")

public class ColorlibLoginPage extends PageObject {
	

	//campo usuario
		@FindBy(xpath="(//INPUT[@type='text'])[1]")
		public WebElementFacade txtUsername;
	//campo password
		@FindBy(xpath="(//INPUT[@type='password'])[1]")
		public WebElementFacade txtPassword;
	//campo boton
		@FindBy(xpath="//BUTTON[@class='btn btn-lg btn-primary btn-block'][text()='Sign in']")
		public WebElementFacade btnSingIn;
		
	//label del home a verificar
		@FindBy(xpath="//H1[@id='bootstrap-admin-template']")
		public WebElementFacade lblHomePpal;	

	
	public void IngresarDatos(String strUsuario, String strPass) {
		// TODO Auto-generated method stub}
		txtUsername.sendKeys(strUsuario);	
		txtPassword.sendKeys(strPass);
		btnSingIn.click();

	}

	public void VerificaHome() {
		// TODO Auto-generated method stub
		String labelv = "Bootstrap-Admin-Template"; 
		String strMensaje=lblHomePpal.getText();
		assertThat(strMensaje,containsText(labelv));
		
	}



}
