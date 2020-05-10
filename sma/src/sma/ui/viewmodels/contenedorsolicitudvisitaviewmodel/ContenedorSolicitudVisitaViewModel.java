/**
 */
package sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel;

import sma.ui.UI;

import sma.ui.viewmodels.ViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Solicitud Visita View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel#getOwnedByUI <em>Owned By UI</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel#getTheContenedorBusquedaViewModel <em>The Contenedor Busqueda View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel#getTheContenedorDatosCmViewModel <em>The Contenedor Datos Cm View Model</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelPackage#getContenedorSolicitudVisitaViewModel()
 * @model
 * @generated
 */
public interface ContenedorSolicitudVisitaViewModel extends ViewModel {
	/**
	 * Returns the value of the '<em><b>Owned By UI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.UI#getTheContenedorSolicitudVisitaViewModel <em>The Contenedor Solicitud Visita View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By UI</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By UI</em>' container reference.
	 * @see #setOwnedByUI(UI)
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelPackage#getContenedorSolicitudVisitaViewModel_OwnedByUI()
	 * @see sma.ui.UI#getTheContenedorSolicitudVisitaViewModel
	 * @model opposite="theContenedorSolicitudVisitaViewModel" transient="false"
	 * @generated
	 */
	UI getOwnedByUI();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel#getOwnedByUI <em>Owned By UI</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By UI</em>' container reference.
	 * @see #getOwnedByUI()
	 * @generated
	 */
	void setOwnedByUI(UI value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Busqueda View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorBusquedaViewModel#getOwnedByContenedorSolicitudVisitaViewModel <em>Owned By Contenedor Solicitud Visita View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Busqueda View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Busqueda View Model</em>' containment reference.
	 * @see #setTheContenedorBusquedaViewModel(ContenedorBusquedaViewModel)
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelPackage#getContenedorSolicitudVisitaViewModel_TheContenedorBusquedaViewModel()
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorBusquedaViewModel#getOwnedByContenedorSolicitudVisitaViewModel
	 * @model opposite="ownedByContenedorSolicitudVisitaViewModel" containment="true"
	 * @generated
	 */
	ContenedorBusquedaViewModel getTheContenedorBusquedaViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel#getTheContenedorBusquedaViewModel <em>The Contenedor Busqueda View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Busqueda View Model</em>' containment reference.
	 * @see #getTheContenedorBusquedaViewModel()
	 * @generated
	 */
	void setTheContenedorBusquedaViewModel(ContenedorBusquedaViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Datos Cm View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel#getOwnedByContenedorSolicitudVisitaViewModel <em>Owned By Contenedor Solicitud Visita View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Datos Cm View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Datos Cm View Model</em>' containment reference.
	 * @see #setTheContenedorDatosCmViewModel(ContenedorDatosCmViewModel)
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelPackage#getContenedorSolicitudVisitaViewModel_TheContenedorDatosCmViewModel()
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel#getOwnedByContenedorSolicitudVisitaViewModel
	 * @model opposite="ownedByContenedorSolicitudVisitaViewModel" containment="true"
	 * @generated
	 */
	ContenedorDatosCmViewModel getTheContenedorDatosCmViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel#getTheContenedorDatosCmViewModel <em>The Contenedor Datos Cm View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Datos Cm View Model</em>' containment reference.
	 * @see #getTheContenedorDatosCmViewModel()
	 * @generated
	 */
	void setTheContenedorDatosCmViewModel(ContenedorDatosCmViewModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="sma.String" eventoDataType="sma.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\t\t\r\n\t\t\t\t\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\tString action = \"\";\r\n\t\t\t\t\t\t\t\treturn action;\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	String upadateDialog(String evento);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\t\t\r\n\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\t\t\tContenedorBusquedaViewModel busquedaVM \t= getTheContenedorBusquedaViewModel();\r\n\t\t\t\t \t\tContenedorDatosCmViewModel datosCmVM \t= getTheContenedorDatosCmViewModel();\r\n\t\t\t\t \t\t\r\n\t\t\t\t \t\tif ( busquedaVM == null ) {\r\n\t\t\t\t\t\t\tbusquedaVM = sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelFactory\r\n\t\t\t\t\t\t\t\t\t\t.eINSTANCE.createContenedorBusquedaViewModel();\r\n\t\t\t\t\t\t}\r\n\t\t\t\t \t\t\r\n\t\t\t\t \t\tif (datosCmVM == null) {\r\n\t\t\t\t\t\t\tdatosCmVM\t= sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelFactory\r\n\t\t\t\t\t\t\t\t\t\t.eINSTANCE.createContenedorDatosCmViewModel();\r\n\t\t\t\t\t\t}\r\n\t\t\t\t \t\t\r\n\t\t\t\t \t\tsetTheContenedorBusquedaViewModel(busquedaVM);\r\n\t\t\t\t \t\tsetTheContenedorDatosCmViewModel(datosCmVM);\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	void implementarModelo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\t\t\r\n\t\t\t\t\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\tgetOwnedByUI().solicitarVisita(this);\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	void solicitarVisita();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idCmDataType="sma.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\t\t\r\n\t\t\t\t\r\n\t\t\t\t\t\tgetOwnedByUI().mostrarInfoCmSolicitudVisita(idCm);\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	void mostrarInfoCmSolicitudVisita(String idCm);

} // ContenedorSolicitudVisitaViewModel
