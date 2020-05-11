
package sma.test.pruebas;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sma.ModelFactory;
import sma.smaFactory;
import sma.domain.Automovil;
import sma.domain.CentroMant;
import sma.domain.Domain;
import sma.domain.Usuario;
import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel;
import sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel;
import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel;


public class RegistrosTest {

static ModelFactory modelFactory;
//static Domain domain;
	
	
	@BeforeClass
	public static void beforeClass()
	{
		modelFactory = AllTests.getModelFactory();
	}
	
	
	@Test
	@Before
	public void testRegistrarUsuario() {
		//System.out.println("Test");
		ContenedorCrudClienteViewModel crudCliente = modelFactory.getTheUI().getTheContenedorCrudClienteViewModel();
		
		crudCliente.getTheContenedorDetalleClienteViewModel().getTheContenedorDatosdelacuentaViewModel().setContrasenia("password");
		crudCliente.getTheContenedorDetalleClienteViewModel().getTheContenedorDatosdelacuentaViewModel().setUsuario("user");
		
		crudCliente.getTheContenedorDetalleClienteViewModel().getTheContenedorDatosPersonalesViewModel().setApellido("suarez");
		crudCliente.getTheContenedorDetalleClienteViewModel().getTheContenedorDatosPersonalesViewModel().setCedula("12345");
		crudCliente.getTheContenedorDetalleClienteViewModel().getTheContenedorDatosPersonalesViewModel().setCorreoelectronico("user@gmail.com");
		crudCliente.getTheContenedorDetalleClienteViewModel().getTheContenedorDatosPersonalesViewModel().setEdad("23");
		crudCliente.getTheContenedorDetalleClienteViewModel().getTheContenedorDatosPersonalesViewModel().setNombre("andres");
		
		crudCliente.registrarCliente();
		
		sma.domain.Usuario usuario= null;// sma.domain.DomainFactory.eINSTANCE.createUsuario();

		for (Usuario user : modelFactory.getTheDomain().getListaUsuarios()) {
			if (user.getNumDI().equals("12345")) {
				
				usuario= user;
				break;
			}
		}
		
		assertNotNull(usuario, "El usuario no fue registrado");
		
		
	}
	
	
	@Test
	public void testRegistrarCentroMant() {
		ContenedorCRUDCMViewModel registroCmVM = modelFactory.getTheUI().getTheContenedorCRUDCMViewModel();
		
		
		registroCmVM.getTheContenedorDetalleCMViewModel().getTheContenedorInformacionCMViewModel().
		setDescripcion("Taller especializado en sistema de transmision");
		registroCmVM.getTheContenedorDetalleCMViewModel().getTheContenedorInformacionCMViewModel().setNombrecm("Centro 1");
		registroCmVM.getTheContenedorDetalleCMViewModel().getTheContenedorInformacionCMViewModel().setNombrerepresentante("Alberto Casas");
	
		registroCmVM.getTheContenedorDetalleCMViewModel().getTheContenedorUbicacionViewModel().setCiudad("armenia");
		registroCmVM.getTheContenedorDetalleCMViewModel().getTheContenedorUbicacionViewModel().setDepartamento("quindio");
		registroCmVM.getTheContenedorDetalleCMViewModel().getTheContenedorUbicacionViewModel().setDireccion("direccion");
		registroCmVM.getTheContenedorDetalleCMViewModel().getTheContenedorUbicacionViewModel().setPais("colombia");
		
		registroCmVM.registrarCm();
		
		CentroMant cm = null;
		
		for (CentroMant cm2 : modelFactory.getTheDomain().getListaDeCentMant()) {
			if (cm2.getNombre().equals("Centro 1")) {
				cm = cm2;
				break;
			}
		}
		
		
		assertEquals("No se hizo un solo registro", 1, modelFactory.getTheDomain().getListaDeCentMant().size());
		assertNotNull(cm, "No se registró el usuario con exito");
		
	
	}
	
	@Test
	@After
	public void testLogin() {
		 
		ContenedorLoginViewModel loginVM = modelFactory.getTheUI().getTheContenedorLoginViewModel();
		
		loginVM.getTheContenedorDetalleLoginViewModel().setUsuario("user");
		loginVM.getTheContenedorDetalleLoginViewModel().setContrasenia("password");
		
		loginVM.prueba();
		
		String idUsuarioLogueado = modelFactory.getTheUI().getIdLogueado();
		
		assertNotNull(idUsuarioLogueado, "EL logueo del usuario no ha sido registrado");
		assertEquals("El usuario no se clasificó correctamente", "cliente", modelFactory.getTheUI().getTipoLogueado());
	}


//	@AfterClass
//	public static void limpieza() {
//		modelFactory = null;
//	}
}
