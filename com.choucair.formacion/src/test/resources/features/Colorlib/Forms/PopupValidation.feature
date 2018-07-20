
@Regresion
Feature: Formulario Popup Validacion
El usuario debe poder ingresar al formulario los datos requeridos 
Cada campo del formulario realiza validaciones de obligariedad,
longitud y formato, el sistema debe presentar las validaciones respectivas
para cada campo a traves de un globo informativo


@CasoExitoso
	Scenario: Diligenciamiento existoso del formulario Popup validacion,
						no se presenta ningun mensaje de validacion.
	Given Autentico en colorlib con usuario "demo" y clave "demo"
	And   Ingreso a la funcionalidad Forms validacion
	When Diligencio formulario Popup Validacion
	Then Verifico ingreso exitoso
	



	
