package com.choucair.formacion.definition;

import com.choucair.formacion.steps.PopupValidationSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class PopupValidationDefinition  {
	@Steps
	PopupValidationSteps PopupValidationSteps;
	
	@Given("^Autentico en colorlib con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void autentico_en_colorlib_con_usuario_y_clave(String strUsuario, String strPass) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		PopupValidationSteps.login_colorlib(strUsuario,strPass);
	}

	@Given("^Ingreso a la funcionalidad Forms validacion$")
	public void ingreso_a_la_funcionalidad_Forms_validacion() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
		
	}

	@When("^Diligencio formulario Popup Validacion$")
	public void diligencio_formulario_Popup_Validacion() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
		
	}

	@Then("^Verifico ingreso exitoso$")
	public void verifico_ingreso_exitoso() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
		
	}


}
