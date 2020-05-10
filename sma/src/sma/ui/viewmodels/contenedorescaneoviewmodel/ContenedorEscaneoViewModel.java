/**
 */
package sma.ui.viewmodels.contenedorescaneoviewmodel;

import sma.ui.UI;

import sma.ui.viewmodels.ViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Escaneo View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getOwnedByUI <em>Owned By UI</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getTheContenedorSeleccionautoViewModel <em>The Contenedor Seleccionauto View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getTheContenedorFallasViewModel <em>The Contenedor Fallas View Model</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getContenedorEscaneoViewModel()
 * @model
 * @generated
 */
public interface ContenedorEscaneoViewModel extends ViewModel {
	/**
	 * Returns the value of the '<em><b>Owned By UI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.UI#getTheContenedorEscaneoViewModel <em>The Contenedor Escaneo View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By UI</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By UI</em>' container reference.
	 * @see #setOwnedByUI(UI)
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getContenedorEscaneoViewModel_OwnedByUI()
	 * @see sma.ui.UI#getTheContenedorEscaneoViewModel
	 * @model opposite="theContenedorEscaneoViewModel" transient="false"
	 * @generated
	 */
	UI getOwnedByUI();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getOwnedByUI <em>Owned By UI</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By UI</em>' container reference.
	 * @see #getOwnedByUI()
	 * @generated
	 */
	void setOwnedByUI(UI value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Seleccionauto View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorSeleccionautoViewModel#getOwnedByContenedorEscaneoViewModel <em>Owned By Contenedor Escaneo View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Seleccionauto View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Seleccionauto View Model</em>' containment reference.
	 * @see #setTheContenedorSeleccionautoViewModel(ContenedorSeleccionautoViewModel)
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getContenedorEscaneoViewModel_TheContenedorSeleccionautoViewModel()
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorSeleccionautoViewModel#getOwnedByContenedorEscaneoViewModel
	 * @model opposite="ownedByContenedorEscaneoViewModel" containment="true"
	 * @generated
	 */
	ContenedorSeleccionautoViewModel getTheContenedorSeleccionautoViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getTheContenedorSeleccionautoViewModel <em>The Contenedor Seleccionauto View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Seleccionauto View Model</em>' containment reference.
	 * @see #getTheContenedorSeleccionautoViewModel()
	 * @generated
	 */
	void setTheContenedorSeleccionautoViewModel(ContenedorSeleccionautoViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Fallas View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel#getOwnedByContenedorEscaneoViewModel <em>Owned By Contenedor Escaneo View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Fallas View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Fallas View Model</em>' containment reference.
	 * @see #setTheContenedorFallasViewModel(ContenedorFallasViewModel)
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getContenedorEscaneoViewModel_TheContenedorFallasViewModel()
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel#getOwnedByContenedorEscaneoViewModel
	 * @model opposite="ownedByContenedorEscaneoViewModel" containment="true"
	 * @generated
	 */
	ContenedorFallasViewModel getTheContenedorFallasViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getTheContenedorFallasViewModel <em>The Contenedor Fallas View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Fallas View Model</em>' containment reference.
	 * @see #getTheContenedorFallasViewModel()
	 * @generated
	 */
	void setTheContenedorFallasViewModel(ContenedorFallasViewModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="sma.String" eventoDataType="sma.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\t\t\r\n\t\t\t\tString action = \"\";\r\n\t\t\t\treturn action;\r\n\t\t\r\n\t'"
	 * @generated
	 */
	String upadateDialog(String evento);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="sma.EBooleanObject"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\t\t\r\n\t\tgetTheUI().escanearVehiculo(getTheContenedorSeleccionautoViewModel().getPlacavehiculo());\r\n\t\treturn true;\r\n\t\t\r\n\t'"
	 * @generated
	 */
	Boolean escanearVehiculo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\t\t\r\n\t\tContenedorSeleccionautoViewModel seleccionAutoVM \t= getTheContenedorSeleccionautoViewModel();\r\n\t\tContenedorFallasViewModel fallasVM\t\t\t\t\t= getTheContenedorFallasViewModel();\r\n\t\t\r\n\t\tif (seleccionAutoVM == null) \r\n\t\t{\r\n\t\t\tseleccionAutoVM\t\t= sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelFactory\r\n\t\t\t\t\t\t\t\t\t.eINSTANCE.createContenedorSeleccionautoViewModel();\r\n\t\t}\r\n\t\t\r\n\t\tif (fallasVM == null) {\r\n\t\t\tfallasVM\t\t\t= sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelFactory\r\n\t\t\t\t\t\t\t\t.eINSTANCE.createContenedorFallasViewModel();\r\n\t\t}\r\n\t\t\r\n\t\tsetTheContenedorFallasViewModel(fallasVM);\r\n\t\tsetTheContenedorSeleccionautoViewModel(seleccionAutoVM);\r\n\t\t\r\n\t'"
	 * @generated
	 */
	void implementarModelo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\t\t\r\n\t\tgetTheUI().mostrarEstadoVehCliente(this);\r\n\t'"
	 * @generated
	 */
	void mostrarEstadoVehiculo();

} // ContenedorEscaneoViewModel
