package sma.test.pruebas;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import sma.ModelFactory;
import sma.domain.CentroMant;
import sma.domain.reparacionvehiculo.Reparacion;
import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel;
import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel;

public class GestionDeVisitaTest {

	static ModelFactory modelFactory;

	@BeforeClass
	public static void beforeClass() {

		modelFactory = AllTests.getModelFactory();
		System.out.println(" prueba de persistencia " + modelFactory.getTheDomain().getListaUsuarios());

	}

	@Test
	public void testContactarCentroMant() {
		ContenedorContactarCmViewModel contactarCmVM = modelFactory.getTheUI().getTheContenedorContactarCmViewModel();

		contactarCmVM.getTheContenedorUbicacionactualViewModel().setPais("colombia");
		contactarCmVM.getTheContenedorUbicacionactualViewModel().setDepartamento("quindio");
		contactarCmVM.getTheContenedorUbicacionactualViewModel().setCiudad("armenia");

		contactarCmVM.mostrarCmsCercanos();

		assertEquals(1, contactarCmVM.getTheContenedorCmrecomendadosViewModel().getListaListaCmViewModel().size());
	}

	@Test
	public void testSolictudVisita() {
		 
		ContenedorSolicitudVisitaViewModel solicitudVisitaVM = modelFactory.getTheUI().getTheContenedorSolicitudVisitaViewModel();
		
		solicitudVisitaVM.getTheContenedorBusquedaViewModel().setIdcm("0");
		solicitudVisitaVM.getTheContenedorBusquedaViewModel().setPlacavehiculo("crk23c");
		
		solicitudVisitaVM.mostrarInfoCmSolicitudVisita("0");
		
		solicitudVisitaVM.solicitarVisita();
		
		
		CentroMant centroMant = null;
		for (CentroMant centroMantBucle : modelFactory.getTheDomain().getListaDeCentMant()) {
			
			for (Reparacion reparacion : centroMantBucle.getHistorialReparacion()) {
				
				if (reparacion.getTheAutomovil().getPlaca().equals("crk23c")) {
					
					centroMant = centroMantBucle;
					break;
				}
				
			}
			
		}
		
		assertNotNull("La solicitud de reparacion no ha sido asignada correctamente", centroMant);
		
		
	}

}
