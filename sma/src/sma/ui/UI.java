/**
 */
package sma.ui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import sma.ModelFactory;

import sma.domain.Domain;

import sma.ui.viewmodels.ViewModel;

import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel;

import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel;

import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel;

import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel;

import sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel;

import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel;

import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.UI#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link sma.ui.UI#getIdLogueado <em>Id Logueado</em>}</li>
 *   <li>{@link sma.ui.UI#getTipoLogueado <em>Tipo Logueado</em>}</li>
 *   <li>{@link sma.ui.UI#getTheDomain <em>The Domain</em>}</li>
 *   <li>{@link sma.ui.UI#getTheContenedorCrudClienteViewModel <em>The Contenedor Crud Cliente View Model</em>}</li>
 *   <li>{@link sma.ui.UI#getTheContenedorCRUDCMViewModel <em>The Contenedor CRUDCM View Model</em>}</li>
 *   <li>{@link sma.ui.UI#getTheContenedorRegistroVehiculoViewModel <em>The Contenedor Registro Vehiculo View Model</em>}</li>
 *   <li>{@link sma.ui.UI#getTheContenedorLoginViewModel <em>The Contenedor Login View Model</em>}</li>
 *   <li>{@link sma.ui.UI#getLstViewModels <em>Lst View Models</em>}</li>
 *   <li>{@link sma.ui.UI#getTheContenedorEscaneoViewModel <em>The Contenedor Escaneo View Model</em>}</li>
 *   <li>{@link sma.ui.UI#getTheContenedorContactarCmViewModel <em>The Contenedor Contactar Cm View Model</em>}</li>
 *   <li>{@link sma.ui.UI#getTheContenedorSolicitudVisitaViewModel <em>The Contenedor Solicitud Visita View Model</em>}</li>
 * </ul>
 *
 * @see sma.ui.UiPackage#getUI()
 * @model
 * @generated
 */
public interface UI extends EObject {
	/**
	 * Returns the value of the '<em><b>The Model Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ModelFactory#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Model Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Model Factory</em>' container reference.
	 * @see #setTheModelFactory(ModelFactory)
	 * @see sma.ui.UiPackage#getUI_TheModelFactory()
	 * @see sma.ModelFactory#getTheUI
	 * @model opposite="theUI" transient="false"
	 * @generated
	 */
	ModelFactory getTheModelFactory();

	/**
	 * Sets the value of the '{@link sma.ui.UI#getTheModelFactory <em>The Model Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Model Factory</em>' container reference.
	 * @see #getTheModelFactory()
	 * @generated
	 */
	void setTheModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>Id Logueado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Logueado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Logueado</em>' attribute.
	 * @see #setIdLogueado(String)
	 * @see sma.ui.UiPackage#getUI_IdLogueado()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getIdLogueado();

	/**
	 * Sets the value of the '{@link sma.ui.UI#getIdLogueado <em>Id Logueado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Logueado</em>' attribute.
	 * @see #getIdLogueado()
	 * @generated
	 */
	void setIdLogueado(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Logueado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Logueado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Logueado</em>' attribute.
	 * @see #setTipoLogueado(String)
	 * @see sma.ui.UiPackage#getUI_TipoLogueado()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getTipoLogueado();

	/**
	 * Sets the value of the '{@link sma.ui.UI#getTipoLogueado <em>Tipo Logueado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Logueado</em>' attribute.
	 * @see #getTipoLogueado()
	 * @generated
	 */
	void setTipoLogueado(String value);

	/**
	 * Returns the value of the '<em><b>The Domain</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sma.domain.Domain#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain</em>' reference.
	 * @see #setTheDomain(Domain)
	 * @see sma.ui.UiPackage#getUI_TheDomain()
	 * @see sma.domain.Domain#getTheUI
	 * @model opposite="theUI"
	 * @generated
	 */
	Domain getTheDomain();

	/**
	 * Sets the value of the '{@link sma.ui.UI#getTheDomain <em>The Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Domain</em>' reference.
	 * @see #getTheDomain()
	 * @generated
	 */
	void setTheDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Crud Cliente View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel#getOwnedByUI <em>Owned By UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Crud Cliente View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Crud Cliente View Model</em>' containment reference.
	 * @see #setTheContenedorCrudClienteViewModel(ContenedorCrudClienteViewModel)
	 * @see sma.ui.UiPackage#getUI_TheContenedorCrudClienteViewModel()
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel#getOwnedByUI
	 * @model opposite="ownedByUI" containment="true"
	 * @generated
	 */
	ContenedorCrudClienteViewModel getTheContenedorCrudClienteViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.UI#getTheContenedorCrudClienteViewModel <em>The Contenedor Crud Cliente View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Crud Cliente View Model</em>' containment reference.
	 * @see #getTheContenedorCrudClienteViewModel()
	 * @generated
	 */
	void setTheContenedorCrudClienteViewModel(ContenedorCrudClienteViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor CRUDCM View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel#getOwnedByUI <em>Owned By UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor CRUDCM View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor CRUDCM View Model</em>' containment reference.
	 * @see #setTheContenedorCRUDCMViewModel(ContenedorCRUDCMViewModel)
	 * @see sma.ui.UiPackage#getUI_TheContenedorCRUDCMViewModel()
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel#getOwnedByUI
	 * @model opposite="ownedByUI" containment="true"
	 * @generated
	 */
	ContenedorCRUDCMViewModel getTheContenedorCRUDCMViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.UI#getTheContenedorCRUDCMViewModel <em>The Contenedor CRUDCM View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor CRUDCM View Model</em>' containment reference.
	 * @see #getTheContenedorCRUDCMViewModel()
	 * @generated
	 */
	void setTheContenedorCRUDCMViewModel(ContenedorCRUDCMViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Registro Vehiculo View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel#getOwnedByUI <em>Owned By UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Registro Vehiculo View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Registro Vehiculo View Model</em>' containment reference.
	 * @see #setTheContenedorRegistroVehiculoViewModel(ContenedorRegistroVehiculoViewModel)
	 * @see sma.ui.UiPackage#getUI_TheContenedorRegistroVehiculoViewModel()
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel#getOwnedByUI
	 * @model opposite="ownedByUI" containment="true"
	 * @generated
	 */
	ContenedorRegistroVehiculoViewModel getTheContenedorRegistroVehiculoViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.UI#getTheContenedorRegistroVehiculoViewModel <em>The Contenedor Registro Vehiculo View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Registro Vehiculo View Model</em>' containment reference.
	 * @see #getTheContenedorRegistroVehiculoViewModel()
	 * @generated
	 */
	void setTheContenedorRegistroVehiculoViewModel(ContenedorRegistroVehiculoViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Login View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel#getOwnedByUI <em>Owned By UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Login View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Login View Model</em>' containment reference.
	 * @see #setTheContenedorLoginViewModel(ContenedorLoginViewModel)
	 * @see sma.ui.UiPackage#getUI_TheContenedorLoginViewModel()
	 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel#getOwnedByUI
	 * @model opposite="ownedByUI" containment="true"
	 * @generated
	 */
	ContenedorLoginViewModel getTheContenedorLoginViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.UI#getTheContenedorLoginViewModel <em>The Contenedor Login View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Login View Model</em>' containment reference.
	 * @see #getTheContenedorLoginViewModel()
	 * @generated
	 */
	void setTheContenedorLoginViewModel(ContenedorLoginViewModel value);

	/**
	 * Returns the value of the '<em><b>Lst View Models</b></em>' reference list.
	 * The list contents are of type {@link sma.ui.viewmodels.ViewModel}.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.ViewModel#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst View Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst View Models</em>' reference list.
	 * @see sma.ui.UiPackage#getUI_LstViewModels()
	 * @see sma.ui.viewmodels.ViewModel#getTheUI
	 * @model opposite="theUI"
	 * @generated
	 */
	EList<ViewModel> getLstViewModels();

	/**
	 * Returns the value of the '<em><b>The Contenedor Escaneo View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getOwnedByUI <em>Owned By UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Escaneo View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Escaneo View Model</em>' containment reference.
	 * @see #setTheContenedorEscaneoViewModel(ContenedorEscaneoViewModel)
	 * @see sma.ui.UiPackage#getUI_TheContenedorEscaneoViewModel()
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getOwnedByUI
	 * @model opposite="ownedByUI" containment="true"
	 * @generated
	 */
	ContenedorEscaneoViewModel getTheContenedorEscaneoViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.UI#getTheContenedorEscaneoViewModel <em>The Contenedor Escaneo View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Escaneo View Model</em>' containment reference.
	 * @see #getTheContenedorEscaneoViewModel()
	 * @generated
	 */
	void setTheContenedorEscaneoViewModel(ContenedorEscaneoViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Contactar Cm View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel#getOwnedByUI <em>Owned By UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Contactar Cm View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Contactar Cm View Model</em>' containment reference.
	 * @see #setTheContenedorContactarCmViewModel(ContenedorContactarCmViewModel)
	 * @see sma.ui.UiPackage#getUI_TheContenedorContactarCmViewModel()
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel#getOwnedByUI
	 * @model opposite="ownedByUI" containment="true"
	 * @generated
	 */
	ContenedorContactarCmViewModel getTheContenedorContactarCmViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.UI#getTheContenedorContactarCmViewModel <em>The Contenedor Contactar Cm View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Contactar Cm View Model</em>' containment reference.
	 * @see #getTheContenedorContactarCmViewModel()
	 * @generated
	 */
	void setTheContenedorContactarCmViewModel(ContenedorContactarCmViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Solicitud Visita View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel#getOwnedByUI <em>Owned By UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Solicitud Visita View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Solicitud Visita View Model</em>' containment reference.
	 * @see #setTheContenedorSolicitudVisitaViewModel(ContenedorSolicitudVisitaViewModel)
	 * @see sma.ui.UiPackage#getUI_TheContenedorSolicitudVisitaViewModel()
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel#getOwnedByUI
	 * @model opposite="ownedByUI" containment="true"
	 * @generated
	 */
	ContenedorSolicitudVisitaViewModel getTheContenedorSolicitudVisitaViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.UI#getTheContenedorSolicitudVisitaViewModel <em>The Contenedor Solicitud Visita View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Solicitud Visita View Model</em>' containment reference.
	 * @see #getTheContenedorSolicitudVisitaViewModel()
	 * @generated
	 */
	void setTheContenedorSolicitudVisitaViewModel(ContenedorSolicitudVisitaViewModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tContenedorCrudClienteViewModel crudCLienteVM = getTheContenedorCrudClienteViewModel();\r\n\t\tContenedorCRUDCMViewModel crudCMVM = getTheContenedorCRUDCMViewModel();\r\n\t\tContenedorRegistroVehiculoViewModel registroVehiVM = getTheContenedorRegistroVehiculoViewModel();\r\n\t\tContenedorLoginViewModel loginVM = getTheContenedorLoginViewModel();\r\n\t\tContenedorEscaneoViewModel escaneoClienteVM = getTheContenedorEscaneoViewModel();\r\n\t\tContenedorContactarCmViewModel contactarCmVM = getTheContenedorContactarCmViewModel();\r\n\t\tContenedorSolicitudVisitaViewModel solicitudVisitaVM = getTheContenedorSolicitudVisitaViewModel();\r\n\r\n\t\tif (crudCLienteVM == null) {\r\n\t\t\tcrudCLienteVM = sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelFactory.eINSTANCE\r\n\t\t\t\t\t.createContenedorCrudClienteViewModel();\r\n\t\t}\r\n\r\n\t\tif (crudCMVM == null) {\r\n\t\t\tcrudCMVM = sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelFactory.eINSTANCE\r\n\t\t\t\t\t.createContenedorCRUDCMViewModel();\r\n\t\t}\r\n\r\n\t\tif (registroVehiVM == null) {\r\n\t\t\tregistroVehiVM = sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelFactory.eINSTANCE\r\n\t\t\t\t\t.createContenedorRegistroVehiculoViewModel();\r\n\t\t}\r\n\r\n\t\tif (loginVM == null) {\r\n\t\t\tloginVM = sma.ui.viewmodels.contenedorloginviewmodel.ContenedorloginviewmodelFactory.eINSTANCE\r\n\t\t\t\t\t.createContenedorLoginViewModel();\r\n\t\t}\r\n\r\n\t\tif (escaneoClienteVM == null) {\r\n\t\t\tescaneoClienteVM = sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelFactory.eINSTANCE\r\n\t\t\t\t\t.createContenedorEscaneoViewModel();\r\n\t\t}\r\n\r\n\t\tif (contactarCmVM == null) {\r\n\t\t\tcontactarCmVM = sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelFactory.eINSTANCE\r\n\t\t\t\t\t.createContenedorContactarCmViewModel();\r\n\t\t}\r\n\r\n\t\tif (solicitudVisitaVM == null) {\r\n\t\t\tsolicitudVisitaVM = sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelFactory.eINSTANCE\r\n\t\t\t\t\t.createContenedorSolicitudVisitaViewModel();\r\n\t\t}\r\n\r\n\t\tsetTheContenedorCrudClienteViewModel(crudCLienteVM);\r\n\t\tsetTheContenedorCRUDCMViewModel(crudCMVM);\r\n\t\tsetTheContenedorRegistroVehiculoViewModel(registroVehiVM);\r\n\t\tsetTheContenedorLoginViewModel(loginVM);\r\n\t\tsetTheContenedorEscaneoViewModel(escaneoClienteVM);\r\n\t\tsetTheContenedorContactarCmViewModel(contactarCmVM);\r\n\t\tsetTheContenedorSolicitudVisitaViewModel(solicitudVisitaVM);\r\n\r\n\t\tcrudCLienteVM.implementarModelo();\r\n\t\tcrudCMVM.implementarModelo();\r\n\t\tregistroVehiVM.implementarModelo();\r\n\t\tloginVM.implementarModelo();\r\n\t\tescaneoClienteVM.implementarModelo();\r\n\t\tcontactarCmVM.implementarModelo();\r\n\t\tsolicitudVisitaVM.implementarModelo();\r\n\r\n\t'"
	 * @generated
	 */
	void implementarModelo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tgetTheDomain().registrarUsuario(formulario);\r\n\r\n\t'"
	 * @generated
	 */
	void registrarCliente(ContenedorCrudClienteViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tgetTheDomain().registrarCm(formulario);\r\n\r\n\t'"
	 * @generated
	 */
	void RegistrarCm(ContenedorCRUDCMViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tif (getTipoLogueado() != null) {\r\n\t\t\tif (getTipoLogueado().equals(\"sin logueo\")) {\r\n\t\t\t\tSystem.out.println(\"no hay usuarios logueados\");\r\n\t\t\t} else {\r\n\t\t\t\tif (getTipoLogueado().equals(\"cm\")) {\r\n\t\t\t\t\tSystem.out.println(\"el usuario logueado no tiene acceso a registrar vehiculos\");\r\n\t\t\t\t} else {\r\n\t\t\t\t\tif (getTipoLogueado().equals(\"cliente\")) {\r\n\t\t\t\t\t\tgetTheDomain().registrarAutomovil(formulario, getIdLogueado());\r\n\t\t\t\t\t}\r\n\r\n\t\t\t\t}\r\n\r\n\t\t\t}\r\n\t\t} else {\r\n\t\t\tSystem.out.println(\"no hay usuarios logueados\");\r\n\t\t}\r\n\r\n\t'"
	 * @generated
	 */
	void registrarVehiculo(ContenedorRegistroVehiculoViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tgetTheDomain().actualizarCrudCliente(formulario);\r\n\r\n\t'"
	 * @generated
	 */
	void actualizarCrudCliente(ContenedorCrudClienteViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tgetTheDomain().actualizarCrudCm(formulario);\r\n\r\n\t'"
	 * @generated
	 */
	void actualizarCrudCm(ContenedorCRUDCMViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tgetTheDomain().actualizarVentanaRegistroCliente(formulario);\r\n\r\n\t'"
	 * @generated
	 */
	void actualizarVentanaRegistroVehiculo(ContenedorRegistroVehiculoViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="sma.EBooleanObject"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tboolean login;\r\n\t\tlogin = getTheDomain().hacerLogin(formulario);\r\n\r\n\t\tif (login) {\r\n\t\t\tactualizarVentanaRegistroVehiculo(getTheContenedorRegistroVehiculoViewModel());\r\n\t\t}\r\n\t\treturn login;\r\n\r\n\t'"
	 * @generated
	 */
	Boolean hacerLogin(ContenedorLoginViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model placaVehDataType="sma.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tgetTheDomain().escanearVehiculo(placaVeh);\r\n\r\n\t'"
	 * @generated
	 */
	void escanearVehiculo(String placaVeh);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tgetTheDomain().mostrarEstadoVehCliente(formulario);\r\n\r\n\t'"
	 * @generated
	 */
	void mostrarEstadoVehCliente(ContenedorEscaneoViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tgetTheDomain().mostrarCmsCercanos(formulario);\r\n\r\n\t'"
	 * @generated
	 */
	void mostrarCmsCercanos(ContenedorContactarCmViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tif (getTipoLogueado() != null) {\r\n\t\t\tif (getTipoLogueado().equals(\"sin logueo\")) {\r\n\t\t\t\tSystem.out.println(\"no hay usuarios logueados\");\r\n\t\t\t} else {\r\n\t\t\t\tif (getTipoLogueado().equals(\"cm\")) {\r\n\t\t\t\t\tSystem.out.println(\"el usuario logueado no tiene acceso a registrar vehiculos\");\r\n\t\t\t\t} else {\r\n\t\t\t\t\tif (getTipoLogueado().equals(\"cliente\")) {\r\n\t\t\t\t\t\tgetTheDomain().solicitarVisita(formulario);\r\n\t\t\t\t\t}\r\n\r\n\t\t\t\t}\r\n\r\n\t\t\t}\r\n\t\t} else {\r\n\t\t\tSystem.out.println(\"no hay usuarios logueados\");\r\n\t\t}\r\n\t'"
	 * @generated
	 */
	void solicitarVisita(ContenedorSolicitudVisitaViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idCmDataType="sma.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\r\n\t\t\r\n\t\tif (getTipoLogueado() != null) {\r\n\t\t\tif (getTipoLogueado().equals(\"sin logueo\")) {\r\n\t\t\t\tSystem.out.println(\"no hay usuarios logueados\");\r\n\t\t\t} else {\r\n\t\t\t\tif (getTipoLogueado().equals(\"cm\")) {\r\n\t\t\t\t\tSystem.out.println(\"el usuario logueado no tiene acceso a registrar vehiculos\");\r\n\t\t\t\t} else {\r\n\t\t\t\t\tif (getTipoLogueado().equals(\"cliente\")) {\r\n\t\t\t\t\t\tgetTheDomain().mostrarInfoCmSolicitudVisita(idCm, getTheContenedorSolicitudVisitaViewModel());\r\n\t\t\t\t\t}\r\n\r\n\t\t\t\t}\r\n\r\n\t\t\t}\r\n\t\t} else {\r\n\t\t\tSystem.out.println(\"no hay usuarios logueados\");\r\n\t\t}\r\n\t\t\r\n\t'"
	 * @generated
	 */
	void mostrarInfoCmSolicitudVisita(String idCm);

} // UI
