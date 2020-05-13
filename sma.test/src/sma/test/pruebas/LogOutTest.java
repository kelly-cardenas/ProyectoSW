package sma.test.pruebas;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import sma.ModelFactory;
import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelFactory;
import sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel;
import sma.ui.viewmodels.contenedorloginviewmodel.ContenedorloginviewmodelFactory;

public class LogOutTest {

	static ModelFactory modelFactory;
	
	@BeforeClass
	public static void beforeTest() {
		
		modelFactory = AllTests.getModelFactory();
		
	}
	
	public void hacerLogOutTest() {
		
		ContenedorLoginViewModel loginVM = modelFactory.getTheUI().getTheContenedorLoginViewModel();
		 
		loginVM.hacerLogOut();
		
		assertNull("El tipo de usuario logueado no se reinicio correctamente", modelFactory.getTheUI().getTipoLogueado());
		assertNull("El id del usuario logueado no se reinicio corretamente", modelFactory.getTheUI().getIdLogueado());
		
	}

}
