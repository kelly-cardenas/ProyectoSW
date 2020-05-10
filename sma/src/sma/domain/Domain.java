/**
 */
package sma.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import sma.ModelFactory;

import sma.ui.UI;

import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel;

import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel;

import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel;

import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel;

import sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel;

import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel;

import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.domain.Domain#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link sma.domain.Domain#getIncrementalIdCliente <em>Incremental Id Cliente</em>}</li>
 *   <li>{@link sma.domain.Domain#getIncrementalIdCm <em>Incremental Id Cm</em>}</li>
 *   <li>{@link sma.domain.Domain#getIncrementalIdAuto <em>Incremental Id Auto</em>}</li>
 *   <li>{@link sma.domain.Domain#getListaAutomoviles <em>Lista Automoviles</em>}</li>
 *   <li>{@link sma.domain.Domain#getListaDeCentMant <em>Lista De Cent Mant</em>}</li>
 *   <li>{@link sma.domain.Domain#getListaUsuarios <em>Lista Usuarios</em>}</li>
 *   <li>{@link sma.domain.Domain#getTheUI <em>The UI</em>}</li>
 * </ul>
 *
 * @see sma.domain.DomainPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>The Model Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ModelFactory#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Model Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Model Factory</em>' container reference.
	 * @see #setTheModelFactory(ModelFactory)
	 * @see sma.domain.DomainPackage#getDomain_TheModelFactory()
	 * @see sma.ModelFactory#getTheDomain
	 * @model opposite="theDomain" transient="false"
	 * @generated
	 */
	ModelFactory getTheModelFactory();

	/**
	 * Sets the value of the '{@link sma.domain.Domain#getTheModelFactory <em>The Model Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Model Factory</em>' container reference.
	 * @see #getTheModelFactory()
	 * @generated
	 */
	void setTheModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>Incremental Id Cliente</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incremental Id Cliente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incremental Id Cliente</em>' attribute.
	 * @see #setIncrementalIdCliente(Integer)
	 * @see sma.domain.DomainPackage#getDomain_IncrementalIdCliente()
	 * @model default="0" dataType="sma.EIntegerObject"
	 * @generated
	 */
	Integer getIncrementalIdCliente();

	/**
	 * Sets the value of the '{@link sma.domain.Domain#getIncrementalIdCliente <em>Incremental Id Cliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incremental Id Cliente</em>' attribute.
	 * @see #getIncrementalIdCliente()
	 * @generated
	 */
	void setIncrementalIdCliente(Integer value);

	/**
	 * Returns the value of the '<em><b>Incremental Id Cm</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incremental Id Cm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incremental Id Cm</em>' attribute.
	 * @see #setIncrementalIdCm(Integer)
	 * @see sma.domain.DomainPackage#getDomain_IncrementalIdCm()
	 * @model default="0" dataType="sma.EIntegerObject"
	 * @generated
	 */
	Integer getIncrementalIdCm();

	/**
	 * Sets the value of the '{@link sma.domain.Domain#getIncrementalIdCm <em>Incremental Id Cm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incremental Id Cm</em>' attribute.
	 * @see #getIncrementalIdCm()
	 * @generated
	 */
	void setIncrementalIdCm(Integer value);

	/**
	 * Returns the value of the '<em><b>Incremental Id Auto</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incremental Id Auto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incremental Id Auto</em>' attribute.
	 * @see #setIncrementalIdAuto(Integer)
	 * @see sma.domain.DomainPackage#getDomain_IncrementalIdAuto()
	 * @model default="0" dataType="sma.EIntegerObject"
	 * @generated
	 */
	Integer getIncrementalIdAuto();

	/**
	 * Sets the value of the '{@link sma.domain.Domain#getIncrementalIdAuto <em>Incremental Id Auto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incremental Id Auto</em>' attribute.
	 * @see #getIncrementalIdAuto()
	 * @generated
	 */
	void setIncrementalIdAuto(Integer value);

	/**
	 * Returns the value of the '<em><b>Lista Automoviles</b></em>' containment reference list.
	 * The list contents are of type {@link sma.domain.Automovil}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Automoviles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Automoviles</em>' containment reference list.
	 * @see sma.domain.DomainPackage#getDomain_ListaAutomoviles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Automovil> getListaAutomoviles();

	/**
	 * Returns the value of the '<em><b>Lista De Cent Mant</b></em>' containment reference list.
	 * The list contents are of type {@link sma.domain.CentroMant}.
	 * It is bidirectional and its opposite is '{@link sma.domain.CentroMant#getOwnedByDomain <em>Owned By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista De Cent Mant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista De Cent Mant</em>' containment reference list.
	 * @see sma.domain.DomainPackage#getDomain_ListaDeCentMant()
	 * @see sma.domain.CentroMant#getOwnedByDomain
	 * @model opposite="ownedByDomain" containment="true"
	 * @generated
	 */
	EList<CentroMant> getListaDeCentMant();

	/**
	 * Returns the value of the '<em><b>Lista Usuarios</b></em>' containment reference list.
	 * The list contents are of type {@link sma.domain.Usuario}.
	 * It is bidirectional and its opposite is '{@link sma.domain.Usuario#getOwnerByDomain <em>Owner By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Usuarios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Usuarios</em>' containment reference list.
	 * @see sma.domain.DomainPackage#getDomain_ListaUsuarios()
	 * @see sma.domain.Usuario#getOwnerByDomain
	 * @model opposite="ownerByDomain" containment="true"
	 * @generated
	 */
	EList<Usuario> getListaUsuarios();

	/**
	 * Returns the value of the '<em><b>The UI</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.UI#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The UI</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The UI</em>' reference.
	 * @see #setTheUI(UI)
	 * @see sma.domain.DomainPackage#getDomain_TheUI()
	 * @see sma.ui.UI#getTheDomain
	 * @model opposite="theDomain"
	 * @generated
	 */
	UI getTheUI();

	/**
	 * Sets the value of the '{@link sma.domain.Domain#getTheUI <em>The UI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The UI</em>' reference.
	 * @see #getTheUI()
	 * @generated
	 */
	void setTheUI(UI value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='// implementar modelo'"
	 * @generated
	 */
	void implementarModelo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='Usuario usuario = sma.domain.DomainFactory.eINSTANCE.createUsuario();\r\n\t\tsma.domain.UbicacionUsu ubicacionUsu = sma.domain.DomainFactory.eINSTANCE.createUbicacionUsu();\r\n\r\n\t\t// -------------------------------------------Asignacion el ID autoincremental\r\n\t\t// al usuario-------------------------------------------------------\r\n\t\tusuario.setId(String.valueOf(incrementarIdCliente()));\r\n\r\n\t\t// -------------------------------------------Asignacion de atributos personales\r\n\t\t// al usuario-------------------------------------------------------\r\n\r\n\t\tusuario.setNombres(formulario.getTheContenedorDetalleClienteViewModel()\r\n\t\t\t\t.getTheContenedorDatosPersonalesViewModel().getNombre());\r\n\t\tusuario.setApellidos(formulario.getTheContenedorDetalleClienteViewModel()\r\n\t\t\t\t.getTheContenedorDatosPersonalesViewModel().getApellido());\r\n\t\tusuario.setNumDI(formulario.getTheContenedorDetalleClienteViewModel().getTheContenedorDatosPersonalesViewModel()\r\n\t\t\t\t.getCedula());\r\n\t\tusuario.setEdad(Integer.parseInt(formulario.getTheContenedorDetalleClienteViewModel()\r\n\t\t\t\t.getTheContenedorDatosPersonalesViewModel().getEdad()));\r\n\t\tusuario.setEmail(formulario.getTheContenedorDetalleClienteViewModel().getTheContenedorDatosPersonalesViewModel()\r\n\t\t\t\t.getCorreoelectronico());\r\n\r\n\t\t// -------------------------------------------Asignacion de atributos de la\r\n\t\t// cuenta del usuario-------------------------------------------------------\r\n\t\tusuario.setUsuario(formulario.getTheContenedorDetalleClienteViewModel()\r\n\t\t\t\t.getTheContenedorDatosdelacuentaViewModel().getUsuario());\r\n\t\tusuario.setContrasenia(formulario.getTheContenedorDetalleClienteViewModel()\r\n\t\t\t\t.getTheContenedorDatosdelacuentaViewModel().getContrasenia());\r\n\r\n\t\t// -------------------------------------------Asignacion de la\r\n\t\t// ubicacion-------------------------------------------------------\r\n\t\tusuario.setUbicacion(ubicacionUsu);\r\n\t\tubicacionUsu.setOwnerBy(usuario);\r\n\t\tSystem.out.println(\"registrado usuario\" + usuario.getNombres());\r\n\t\tgetListaUsuarios().add(usuario);'"
	 * @generated
	 */
	void registrarUsuario(ContenedorCrudClienteViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='CentroMant centroMantenimiento = sma.domain.DomainFactory.eINSTANCE.createCentroMant();\r\n\t\tsma.domain.UbicacionCM ubicacionCM = sma.domain.DomainFactory.eINSTANCE.createUbicacionCM();\r\n\r\n\t\t// -------------------------------------------Asignacion informacion de\r\n\t\t// CM-------------------------------------------------------\r\n\t\tcentroMantenimiento.setId(String.valueOf(incrementarIdCm()));\r\n\r\n\t\t// -------------------------------------------Asignacion informacion de\r\n\t\t// CM-------------------------------------------------------\r\n\t\tcentroMantenimiento.setNombre(\r\n\t\t\t\tformulario.getTheContenedorDetalleCMViewModel().getTheContenedorInformacionCMViewModel().getNombrecm());\r\n\t\tcentroMantenimiento.setNombreRepresentante(formulario.getTheContenedorDetalleCMViewModel()\r\n\t\t\t\t.getTheContenedorInformacionCMViewModel().getNombrerepresentante());\r\n\t\tcentroMantenimiento.setDescripcion(formulario.getTheContenedorDetalleCMViewModel()\r\n\t\t\t\t.getTheContenedorInformacionCMViewModel().getDescripcion());\r\n\r\n\t\t// -------------------------------------------Asignacion de ubicacion de\r\n\t\t// CM-------------------------------------------------------\r\n\t\tubicacionCM.setPais(\r\n\t\t\t\tformulario.getTheContenedorDetalleCMViewModel().getTheContenedorUbicacionViewModel().getPais());\r\n\t\tubicacionCM.setDepartamento(\r\n\t\t\t\tformulario.getTheContenedorDetalleCMViewModel().getTheContenedorUbicacionViewModel().getDepartamento());\r\n\t\tubicacionCM.setCiudad(\r\n\t\t\t\tformulario.getTheContenedorDetalleCMViewModel().getTheContenedorUbicacionViewModel().getCiudad());\r\n\t\tubicacionCM.setDireccion(\r\n\t\t\t\tformulario.getTheContenedorDetalleCMViewModel().getTheContenedorUbicacionViewModel().getDireccion());\r\n\r\n\t\tcentroMantenimiento.setUbicacion(ubicacionCM);\r\n\t\tubicacionCM.setOwnedBy(centroMantenimiento);\r\n\r\n\t\tgetListaDeCentMant().add(centroMantenimiento);'"
	 * @generated
	 */
	void registrarCm(ContenedorCRUDCMViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idPropietarioDataType="sma.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Automovil automovil = sma.domain.DomainFactory.eINSTANCE.createAutomovil();\r\n\t\t// Usuario usuario = sma.domain.DomainFactory.eINSTANCE.createUsuario();\r\n\r\n\t\t// -------------------------------Asignar id incremental al\r\n\t\t// automovil-------------------------------------------------------\r\n\t\tautomovil.setId(String.valueOf(incrementarIdAuto()));\r\n\r\n\t\t// -------------------------------Asignar Propiedades al\r\n\t\t// automovil--------------------------------------------------------------\r\n\t\tautomovil.setMarca(formulario.getTheContenedorDetalleVehiculoViewModel().getMarca());\r\n\t\tautomovil.setModelo(Integer.parseInt(formulario.getTheContenedorDetalleVehiculoViewModel().getModelo()));\r\n\t\tautomovil.setPlaca(formulario.getTheContenedorDetalleVehiculoViewModel().getPlaca());\r\n\t\tautomovil.setReferencia(formulario.getTheContenedorDetalleVehiculoViewModel().getReferencia());\r\n\t\tautomovil.setTipoUso(formulario.getTheContenedorDetalleVehiculoViewModel().getTipovehiculo());\r\n\r\n\t\t// --------------------------------------------Agregar a la lista de Autos\r\n\t\t// registrados del usuario-------------------------------------\r\n\t\tfor (Usuario usu : listaUsuarios) {\r\n\t\t\tif (usu.getId().equals(idPropietario)) {\r\n\r\n\t\t\t\tautomovil.setPropietario(usu);\r\n\t\t\t\tusu.getAutomoviles().add(automovil);\r\n\t\t\t\tgetListaAutomoviles().add(automovil);\r\n\t\t\t\tSystem.out.println(\"auto registrado al propietario \" + usu.getNombres());\r\n\t\t\t}\r\n\r\n\t\t}'"
	 * @generated
	 */
	void registrarAutomovil(ContenedorRegistroVehiculoViewModel formulario, String idPropietario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="sma.EIntegerObject"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (incrementalIdCliente == null) {\r\n\t\t\tincrementalIdCliente = 0;\r\n\r\n\t\t}\r\n\t\tint retorno = incrementalIdCliente;\r\n\t\tincrementalIdCliente = incrementalIdCliente + 1;\r\n\r\n\t\treturn retorno;'"
	 * @generated
	 */
	Integer incrementarIdCliente();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="sma.EIntegerObject"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (incrementalIdCm == null) {\r\n\t\t\tincrementalIdCm = 0;\r\n\t\t}\r\n\r\n\t\tint retorno = incrementalIdCm;\r\n\t\tincrementalIdCm = incrementalIdCm + 1;\r\n\r\n\t\treturn retorno;'"
	 * @generated
	 */
	Integer incrementarIdCm();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="sma.EIntegerObject"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (incrementalIdAuto == null) {\r\n\t\t\tincrementalIdAuto = 0;\r\n\t\t}\r\n\t\tint retorno = incrementalIdAuto;\r\n\t\tincrementalIdAuto = incrementalIdAuto + 1;\r\n\r\n\t\treturn retorno;'"
	 * @generated
	 */
	Integer incrementarIdAuto();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='formulario.getTheContenedorMaestroClienteViewModel().getListaCliente().clear();\r\n\r\n\t\tfor (Usuario user : listaUsuarios) {\r\n\t\t\tSystem.out.println(\"usuario en vm \" + user.getNombres());\r\n\t\t\tsma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel cliente = sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelFactory.eINSTANCE\r\n\t\t\t\t\t.createClienteViewModel();\r\n\r\n\t\t\tcliente.setEdad(String.valueOf(user.getEdad()));\r\n\t\t\tcliente.setEmail(user.getEmail());\r\n\t\t\tcliente.setIdentificacion(user.getNumDI());\r\n\t\t\tcliente.setNombre(user.getNombres());\r\n\r\n\t\t\tformulario.getTheContenedorMaestroClienteViewModel().getListaCliente().add(cliente);\r\n\t\t}\r\n\r\n\t\t/// Migueeeeeee'"
	 * @generated
	 */
	void actualizarCrudCliente(ContenedorCrudClienteViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='formulario.getTheContenedorMaestroCMViewModel().getListaCentroMant().clear();\r\n\r\n\t\tfor (CentroMant cm : listaDeCentMant) {\r\n\r\n\t\t\tsma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel centroMantVm = sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelFactory.eINSTANCE\r\n\t\t\t\t\t.createCentroMantViewModel();\r\n\r\n\t\t\tcentroMantVm.setCiudad(cm.getUbicacion().getCiudad());\r\n\t\t\tcentroMantVm.setNombrecm(cm.getNombre());\r\n\t\t\tcentroMantVm.setNombrerepresentante(cm.getNombreRepresentante());\r\n\r\n\t\t\tformulario.getTheContenedorMaestroCMViewModel().getListaCentroMant().add(centroMantVm);\r\n\t\t}'"
	 * @generated
	 */
	void actualizarCrudCm(ContenedorCRUDCMViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='formulario.getTheContenedorVehiculosRegistradosViewModel().getListaVehiculo().clear();\r\n\r\n\t\tfor (Usuario user : listaUsuarios) {\r\n\t\t\tif (user.getId().equals(getTheUI().getIdLogueado())) {\r\n\t\t\t\tformulario.getTheContenedorDetalleVehiculoViewModel().setPropietario(user.getNombres());\r\n\t\t\t\tfor (sma.domain.Automovil auto : user.getAutomoviles()) {\r\n\r\n\t\t\t\t\tsma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel vehiculoVM = sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelFactory.eINSTANCE\r\n\t\t\t\t\t\t\t.createVehiculoViewModel();\r\n\r\n\t\t\t\t\tvehiculoVM.setMarca(auto.getMarca());\r\n\t\t\t\t\tvehiculoVM.setPlaca(auto.getPlaca());\r\n\t\t\t\t\tvehiculoVM.setReferencia(auto.getReferencia());\r\n\r\n\t\t\t\t\tformulario.getTheContenedorVehiculosRegistradosViewModel().getListaVehiculo().add(vehiculoVM);\r\n\r\n\t\t\t\t}\r\n\r\n\t\t\t\tbreak;\r\n\t\t\t}\r\n\r\n\t\t}'"
	 * @generated
	 */
	void actualizarVentanaRegistroCliente(ContenedorRegistroVehiculoViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="sma.EBooleanObject"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (getListaUsuarios() != null) {\r\n\t\t\tfor (Usuario user : getListaUsuarios()) {\r\n\r\n\t\t\t\tif (user.getUsuario().equals(formulario.getTheContenedorDetalleLoginViewModel().getUsuario())) {\r\n\r\n\t\t\t\t\tif (user.getContrasenia()\r\n\t\t\t\t\t\t\t.equals(formulario.getTheContenedorDetalleLoginViewModel().getContrasenia())) {\r\n\r\n\t\t\t\t\t\tgetTheUI().setIdLogueado(user.getId());\r\n\t\t\t\t\t\tgetTheUI().setTipoLogueado(\"cliente\");\r\n\t\t\t\t\t\treturn true;\r\n\r\n\t\t\t\t\t}\r\n\r\n\t\t\t\t}\r\n\r\n\t\t\t}\r\n\r\n\t\t\t// for (CentroMant cm : getListaDeCentMant()) {\r\n\t\t\t//\r\n\t\t\t// if\r\n\t\t\t// (cm.getUsuario().equals(formulario.getTheContenedorDetalleLoginViewModel().getUsuario()))\r\n\t\t\t// {\r\n\t\t\t//\r\n\t\t\t// if\r\n\t\t\t// (cm.getContrasenia().equals(formulario.getTheContenedorDetalleLoginViewModel().getContrasenia()))\r\n\t\t\t// {\r\n\t\t\t//\r\n\t\t\t// getTheUI().setIdLogueado(cm.getId());\r\n\t\t\t// getTheUI().setTipoLogueado(\"cm\");\r\n\t\t\t// return true;\r\n\t\t\t//\r\n\t\t\t// }\r\n\t\t\t//\r\n\t\t\t// }\r\n\t\t\t//\r\n\t\t\t// }\r\n\t\t}\r\n\t\treturn false;'"
	 * @generated
	 */
	Boolean hacerLogin(ContenedorLoginViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model placaVehDataType="sma.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='for (Automovil auto : listaAutomoviles) {\r\n\r\n\t\t\tif (auto.getPlaca().equals(placaVeh)) {\r\n\r\n\t\t\t\t// auto.asignarFallas();\r\n\r\n\t\t\t}\r\n\r\n\t\t}'"
	 * @generated
	 */
	void escanearVehiculo(String placaVeh);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for (Automovil auto : listaAutomoviles) {\r\n\r\n\t\t\tif (auto.getPlaca().equals(formulario.getTheContenedorSeleccionautoViewModel().getPlacavehiculo())) {\r\n\r\n\t\t\t\tif (auto.getListaDeFallas() != null) {\r\n\r\n\t\t\t\t\tfor (sma.domain.automatizacionrevision.FallaMecanica falla : auto.getListaDeFallas()) {\r\n\t\t\t\t\t\tsma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel fallaVM = sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelFactory.eINSTANCE\r\n\t\t\t\t\t\t\t\t.createListaFallasViewModel();\r\n\r\n\t\t\t\t\t\tfallaVM.setGravedad(falla.getGravedad());\r\n\t\t\t\t\t\tfallaVM.setOrigen(falla.getOrigen());\r\n\t\t\t\t\t\tfallaVM.setGravedad(falla.getGravedad());\r\n\t\t\t\t\t\tfallaVM.setOrigen(falla.getOrigen());\r\n\r\n\t\t\t\t\t\tformulario.getTheContenedorFallasViewModel().getListaListaFallasViewModel().add(fallaVM);\r\n\r\n\t\t\t\t\t}\r\n\r\n\t\t\t\t}\r\n\r\n\t\t\t}\r\n\r\n\t\t}'"
	 * @generated
	 */
	void mostrarEstadoVehCliente(ContenedorEscaneoViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for (CentroMant centroMant : listaDeCentMant) {\r\n\t\t\tSystem.out.println(formulario.getTheContenedorUbicacionactualViewModel().getDepartamento()+\"  -  \"+\r\n\t\t\t\t\tformulario.getTheContenedorUbicacionactualViewModel().getPais()\t);\r\n\t\t\tif (centroMant.getUbicacion().getPais()\r\n\t\t\t\t\t.equals(formulario.getTheContenedorUbicacionactualViewModel().getPais())\r\n\t\t\t\t\t&amp;&amp; centroMant.getUbicacion().getDepartamento()\r\n\t\t\t\t\t\t\t.equals(formulario.getTheContenedorUbicacionactualViewModel().getDepartamento())) {\r\n\r\n\t\t\t\tsma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel cmVM = sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelFactory.eINSTANCE\r\n\t\t\t\t\t\t.createListaCmViewModel();\r\n\r\n\t\t\t\tcmVM.setNombre(centroMant.getNombre());\r\n\t\t\t\tcmVM.setNombrerepresentante(centroMant.getNombreRepresentante());\r\n\t\t\t\tcmVM.setDireccion(centroMant.getUbicacion().getDireccion());\r\n\r\n\t\t\t\tformulario.getTheContenedorCmrecomendadosViewModel().getListaListaCmViewModel().add(cmVM);\r\n\t\t\t\t\r\n\t\t\t}\r\n\r\n\t\t}'"
	 * @generated
	 */
	void mostrarCmsCercanos(ContenedorContactarCmViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for (CentroMant centroMant : listaDeCentMant) {\r\n\r\n\t\t\tif (centroMant.getId().equals(formulario.getTheContenedorBusquedaViewModel().getIdcm())) {\r\n\r\n\t\t\t\tfor (Automovil auto : listaAutomoviles) {\r\n\r\n\t\t\t\t\tif (auto.getPlaca().equals(formulario.getTheContenedorBusquedaViewModel().getPlacavehiculo())) {\r\n\r\n\t\t\t\t\t\tif (auto.getPropietario().getId().equals(getTheUI().getIdLogueado())) {\r\n\t\t\t\t\t\t\tcentroMant.procesarSolicitudVisita(auto);\r\n\t\t\t\t\t\t\tbreak;\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t\telse\r\n\t\t\t\t\t\t{\r\n\t\t\t\t\t\t\tSystem.out.println(\"El usuario logueado no tiene el vehiculo registrado\");\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t}\r\n\r\n\t\t\t\t}\r\n\t\t\t\tSystem.out.println(\"auto no registrado\");\r\n\r\n\t\t\t}\r\n\r\n\t\t}'"
	 * @generated
	 */
	void solicitarVisita(ContenedorSolicitudVisitaViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idCmDataType="sma.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='for (CentroMant centroMant : listaDeCentMant) {\r\n\r\n\t\t\tif (centroMant.getId().equals(idCm)) {\r\n\t\t\t\tSystem.out.println(\"encuentra el CM\");\r\n\t\t\t\tFormulario.getTheContenedorDatosCmViewModel().setDireccion(centroMant.getUbicacion().getDireccion());\r\n\t\t\t\tFormulario.getTheContenedorDatosCmViewModel().setNombrecm(centroMant.getNombre());\r\n\t\t\t\tFormulario.getTheContenedorDatosCmViewModel()\r\n\t\t\t\t\t\t.setNombrerepresentante(centroMant.getNombreRepresentante());\r\n\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t\t\r\n\r\n\t\t}'"
	 * @generated
	 */
	void mostrarInfoCmSolicitudVisita(String idCm, ContenedorSolicitudVisitaViewModel Formulario);

} // Domain
