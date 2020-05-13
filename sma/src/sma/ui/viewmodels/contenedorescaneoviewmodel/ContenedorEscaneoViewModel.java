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
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getTheContenedorInformacionEmisionGasesViewModel <em>The Contenedor Informacion Emision Gases View Model</em>}</li>
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
	 * Returns the value of the '<em><b>The Contenedor Informacion Emision Gases View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel#getOwnedByContenedorEscaneoViewModel <em>Owned By Contenedor Escaneo View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Informacion Emision Gases View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Informacion Emision Gases View Model</em>' containment reference.
	 * @see #setTheContenedorInformacionEmisionGasesViewModel(ContenedorInformacionEmisionGasesViewModel)
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getContenedorEscaneoViewModel_TheContenedorInformacionEmisionGasesViewModel()
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel#getOwnedByContenedorEscaneoViewModel
	 * @model opposite="ownedByContenedorEscaneoViewModel" containment="true"
	 * @generated
	 */
	ContenedorInformacionEmisionGasesViewModel getTheContenedorInformacionEmisionGasesViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getTheContenedorInformacionEmisionGasesViewModel <em>The Contenedor Informacion Emision Gases View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Informacion Emision Gases View Model</em>' containment reference.
	 * @see #getTheContenedorInformacionEmisionGasesViewModel()
	 * @generated
	 */
	void setTheContenedorInformacionEmisionGasesViewModel(ContenedorInformacionEmisionGasesViewModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="sma.String" eventoDataType="sma.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tString action = \"\";\r\n\t\treturn action;\r\n\r\n\t'"
	 * @generated
	 */
	String upadateDialog(String evento);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\t\t\r\n\t\tContenedorSeleccionautoViewModel seleccionAutoVM = getTheContenedorSeleccionautoViewModel();\r\n\t\tContenedorInformacionEmisionGasesViewModel infoEmision = getTheContenedorInformacionEmisionGasesViewModel();\r\n\t\t\r\n\t\tif (seleccionAutoVM == null) {\r\n\t\t\tseleccionAutoVM = sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelFactory.eINSTANCE\r\n\t\t\t\t\t\t\t.createContenedorSeleccionautoViewModel();\r\n\t\t}\r\n\t\t\r\n\t\tif (infoEmision == null) {\r\n\t\t\tinfoEmision = sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelFactory.eINSTANCE\r\n\t\t\t\t\t\t\t.createContenedorInformacionEmisionGasesViewModel();\r\n\t\t}\r\n\t\t\r\n\t\tsetTheContenedorInformacionEmisionGasesViewModel(infoEmision);\r\n\t\tsetTheContenedorSeleccionautoViewModel(seleccionAutoVM);\r\n\t\t\r\n\t'"
	 * @generated
	 */
	void implementarModelo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tgetOwnedByUI().escanearVehiculo(this);\r\n\r\n\t'"
	 * @generated
	 */
	void realizarEscaneo();

} // ContenedorEscaneoViewModel
