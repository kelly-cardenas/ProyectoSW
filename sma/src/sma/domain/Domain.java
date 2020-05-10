/**
 */
package sma.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import sma.ModelFactory;

import sma.ui.UI;

import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel;

import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel;

import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel;

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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incremental Id Cliente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incremental Id Cliente</em>' attribute.
	 * @see #setIncrementalIdCliente(Integer)
	 * @see sma.domain.DomainPackage#getDomain_IncrementalIdCliente()
	 * @model dataType="sma.EIntegerObject"
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incremental Id Cm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incremental Id Cm</em>' attribute.
	 * @see #setIncrementalIdCm(Integer)
	 * @see sma.domain.DomainPackage#getDomain_IncrementalIdCm()
	 * @model dataType="sma.EIntegerObject"
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incremental Id Auto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incremental Id Auto</em>' attribute.
	 * @see #setIncrementalIdAuto(Integer)
	 * @see sma.domain.DomainPackage#getDomain_IncrementalIdAuto()
	 * @model dataType="sma.EIntegerObject"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='//implementar modelo'"
	 * @generated
	 */
	void implementarModelo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='Usuario usuario = \t\t\tsma.domain.DomainFactory.eINSTANCE.createUsuario();\r\n\t\t\t\t\t\tsma.domain.UbicacionUsu ubicacionUsu = sma.domain.DomainFactory.eINSTANCE.createUbicacionUsu();\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t//-------------------------------------------Asignacion el ID autoincremental al usuario-------------------------------------------------------\r\n\t\t\t\t\t\tusuario.setId(String.valueOf(incrementarIdCliente()));\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t//-------------------------------------------Asignacion de atributos personales al usuario-------------------------------------------------------\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\tusuario.setNombres(formulario.getTheContenedorDetalleClienteViewModel().getTheContenedorDatosPersonalesViewModel().getNombre());\r\n\t\t\t\t\t\tusuario.setApellidos(formulario.getTheContenedorDetalleClienteViewModel().getTheContenedorDatosPersonalesViewModel().getApellido());\r\n\t\t\t\t\t\tusuario.setNumDI(formulario.getTheContenedorDetalleClienteViewModel().getTheContenedorDatosPersonalesViewModel().getCedula());\r\n\t\t\t\t\t\tusuario.setEdad(Integer.parseInt(formulario.getTheContenedorDetalleClienteViewModel().getTheContenedorDatosPersonalesViewModel().getEdad()));\r\n\t\t\t\t\t\tusuario.setEmail(formulario.getTheContenedorDetalleClienteViewModel().getTheContenedorDatosPersonalesViewModel().getCorreoelectronico());\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t//-------------------------------------------Asignacion de atributos de la cuenta del usuario-------------------------------------------------------\r\n\t\t\t\t\t\tusuario.setUsuario(formulario.getTheContenedorDetalleClienteViewModel().getTheContenedorDatosdelacuentaViewModel().getContrase\361a());\r\n\t\t\t\t\t\tusuario.setContrasenia(formulario.getTheContenedorDetalleClienteViewModel().getTheContenedorDatosdelacuentaViewModel().getContrase\361a());\r\n\t\t\t\r\n\t\t\t\t\t\t//-------------------------------------------Asignacion de la ubicacion-------------------------------------------------------\r\n\t\t\t\t\t\tusuario.setUbicacion(ubicacionUsu);\r\n\t\t\t\t\t\tubicacionUsu.setOwnerBy(usuario);\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\tlistaUsuarios.add(usuario);'"
	 * @generated
	 */
	void registrarUsuario(ContenedorCrudClienteViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='CentroMant centroMantenimiento \t= sma.domain.DomainFactory.eINSTANCE.createCentroMant();\r\n\t\tsma.domain.UbicacionCM ubicacionCM\t\t\t= sma.domain.DomainFactory.eINSTANCE.createUbicacionCM();\r\n\t\t\t\t\t\r\n\t\t\t\t\t//-------------------------------------------Asignacion informacion de CM-------------------------------------------------------\r\n\t\t\t\t\tcentroMantenimiento.setId(String.valueOf(incrementalIdCm));\r\n\t\t\r\n\t\t\t\t\t//-------------------------------------------Asignacion informacion de CM-------------------------------------------------------\r\n\t\t\t\t\tcentroMantenimiento.setNombre(formulario.getTheContenedorDetalleCMViewModel().getTheContenedorInformacionCMViewModel().getNombrecm());\r\n\t\t\t\t\tcentroMantenimiento.setNombreRepresentante(formulario.getTheContenedorDetalleCMViewModel().getTheContenedorInformacionCMViewModel().getNombrerepresentante());\r\n\t\t\t\t\tcentroMantenimiento.setDescripcion(formulario.getTheContenedorDetalleCMViewModel().getTheContenedorInformacionCMViewModel().getDescripcion());\r\n\t\t\t\t\t\r\n\t\t\t\t\t//-------------------------------------------Asignacion de ubicacion de CM-------------------------------------------------------\r\n\t\t\t\t\tubicacionCM.setPais(formulario.getTheContenedorDetalleCMViewModel().getTheContenedorUbicacionViewModel().getPais());\r\n\t\t\t\t\tubicacionCM.setDepartamento(formulario.getTheContenedorDetalleCMViewModel().getTheContenedorUbicacionViewModel().getDepartamento());\r\n\t\t\t\t\tubicacionCM.setCiudad(formulario.getTheContenedorDetalleCMViewModel().getTheContenedorUbicacionViewModel().getCiudad());\r\n\t\t\t\t\tubicacionCM.setDireccion(formulario.getTheContenedorDetalleCMViewModel().getTheContenedorUbicacionViewModel().getDireccion());\r\n\t\t\t\t\t\r\n\t\t\t\t\tcentroMantenimiento.setUbicacion(ubicacionCM);\r\n\t\t\t\t\tubicacionCM.setOwnedBy(centroMantenimiento);\r\n\t\t\t\t\t\r\n\t\t\t\t\tlistaDeCentMant.add(centroMantenimiento);'"
	 * @generated
	 */
	void registrarCm(ContenedorCRUDCMViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idPropietarioDataType="sma.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Automovil automovil = sma.domain.DomainFactory.eINSTANCE.createAutomovil();\r\n\t\t\t\t//Usuario usuario = sma.domain.DomainFactory.eINSTANCE.createUsuario();\r\n\t\t\t\t\r\n\t\t\t\t//-------------------------------Asignar id incremental al automovil-------------------------------------------------------\r\n\t\t\t\tautomovil.setId(String.valueOf(incrementalIdAuto));\r\n\t\t\t\t\r\n\t\t\t\t//-------------------------------Asignar Propiedades al automovil--------------------------------------------------------------\r\n\t\t\t\tautomovil.setMarca(formulario.getTheContenedorDetalleVehiculoViewModel().getMarca());\r\n\t\t\t\tautomovil.setModelo(Integer.parseInt(formulario.getTheContenedorDetalleVehiculoViewModel().getModelo()));\r\n\t\t\t\tautomovil.setPlaca(formulario.getTheContenedorDetalleVehiculoViewModel().getPlaca());\r\n\t\t\t\tautomovil.setReferencia(formulario.getTheContenedorDetalleVehiculoViewModel().getReferencia());\r\n\t\t\t\tautomovil.setTipoUso(formulario.getTheContenedorDetalleVehiculoViewModel().getTipovehiculo());\r\n\t\t\t\t\r\n\t\t\t\t//--------------------------------------------Agregar a la lista de Autos registrados del usuario-------------------------------------\r\n\t\t\t\tfor (Usuario usu : listaUsuarios) {\r\n\t\t\t\t\tif ( usu.getId().equals( idPropietario ) ) {\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\tautomovil.setPropietario(usu);\r\n\t\t\t\t\t\tusu.getAutomoviles().add(automovil);\r\n\t\t\t\t\t\r\n\t\t\t\t\t}\r\n\t\t\t\t}'"
	 * @generated
	 */
	void registrarAutomovil(ContenedorRegistroVehiculoViewModel formulario, String idPropietario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="sma.EIntegerObject"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='int retorno = incrementalIdCliente;\r\n\t\tincrementalIdCliente = incrementalIdCliente +1;\r\n\t\t\r\n\t\treturn retorno;'"
	 * @generated
	 */
	Integer incrementarIdCliente();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="sma.EIntegerObject"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='int retorno = incrementalIdCm;\r\n\t\tincrementalIdCm = incrementalIdCm +1;\r\n\t\t\r\n\t\treturn retorno;'"
	 * @generated
	 */
	Integer incrementarIdCm();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="sma.EIntegerObject"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='int retorno = incrementalIdAuto;\r\n\t\tincrementalIdAuto = incrementalIdAuto +1;\r\n\t\t\r\n\t\treturn retorno;'"
	 * @generated
	 */
	Integer incrementarIdAuto();

} // Domain
