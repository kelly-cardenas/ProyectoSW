package sma.test.pruebas;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import sma.ModelFactory;
import sma.domain.Automovil;
import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel;

public class RegistroVehiculoTest {

	static ModelFactory modelFactory;
	
	@BeforeClass
	public static void BeforeClass() {
		modelFactory = AllTests.getModelFactory();
	}
	
	@Test
	public void testRegistrarAutomovil() {
		ContenedorRegistroVehiculoViewModel registroVehiculoVM = modelFactory.getTheUI().getTheContenedorRegistroVehiculoViewModel();
		
		
		
		registroVehiculoVM.getTheContenedorDetalleVehiculoViewModel().setMarca("chevrolet");
		registroVehiculoVM.getTheContenedorDetalleVehiculoViewModel().setModelo("2012");
		registroVehiculoVM.getTheContenedorDetalleVehiculoViewModel().setPlaca("crk23c");
		registroVehiculoVM.getTheContenedorDetalleVehiculoViewModel().setPropietario("0");
		registroVehiculoVM.getTheContenedorDetalleVehiculoViewModel().setReferencia("SAIL");
		registroVehiculoVM.getTheContenedorDetalleVehiculoViewModel().setTipovehiculo("sedan");
		
		modelFactory.getTheUI().setIdLogueado("0");
		modelFactory.getTheUI().setTipoLogueado("cliente");
		registroVehiculoVM.registrarVehiculo();
		
		Automovil automovil = null;
		
		for (Automovil auto : modelFactory.getTheDomain().getListaAutomoviles()) {
			if (auto.getPlaca().equals("crk23c")) {
				automovil = auto;
				break;
			}
		}
		
		assertNotNull(automovil, "El registro del vehiculo no fue realizado");
		
	}

}
