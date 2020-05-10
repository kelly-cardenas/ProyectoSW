/**
 */
package sma.ui.viewmodels.contenedorcontactarcmviewmodel;

import sma.ui.UI;

import sma.ui.viewmodels.ViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Contactar Cm View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel#getOwnedByUI <em>Owned By UI</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel#getTheContenedorCmrecomendadosViewModel <em>The Contenedor Cmrecomendados View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel#getTheContenedorUbicacionactualViewModel <em>The Contenedor Ubicacionactual View Model</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage#getContenedorContactarCmViewModel()
 * @model
 * @generated
 */
public interface ContenedorContactarCmViewModel extends ViewModel {
	/**
	 * Returns the value of the '<em><b>Owned By UI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.UI#getTheContenedorContactarCmViewModel <em>The Contenedor Contactar Cm View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By UI</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By UI</em>' container reference.
	 * @see #setOwnedByUI(UI)
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage#getContenedorContactarCmViewModel_OwnedByUI()
	 * @see sma.ui.UI#getTheContenedorContactarCmViewModel
	 * @model opposite="theContenedorContactarCmViewModel" transient="false"
	 * @generated
	 */
	UI getOwnedByUI();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel#getOwnedByUI <em>Owned By UI</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By UI</em>' container reference.
	 * @see #getOwnedByUI()
	 * @generated
	 */
	void setOwnedByUI(UI value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Cmrecomendados View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorCmrecomendadosViewModel#getOwnedByContenedorContactarCmViewModel <em>Owned By Contenedor Contactar Cm View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Cmrecomendados View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Cmrecomendados View Model</em>' containment reference.
	 * @see #setTheContenedorCmrecomendadosViewModel(ContenedorCmrecomendadosViewModel)
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage#getContenedorContactarCmViewModel_TheContenedorCmrecomendadosViewModel()
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorCmrecomendadosViewModel#getOwnedByContenedorContactarCmViewModel
	 * @model opposite="ownedByContenedorContactarCmViewModel" containment="true"
	 * @generated
	 */
	ContenedorCmrecomendadosViewModel getTheContenedorCmrecomendadosViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel#getTheContenedorCmrecomendadosViewModel <em>The Contenedor Cmrecomendados View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Cmrecomendados View Model</em>' containment reference.
	 * @see #getTheContenedorCmrecomendadosViewModel()
	 * @generated
	 */
	void setTheContenedorCmrecomendadosViewModel(ContenedorCmrecomendadosViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Ubicacionactual View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel#getOwnedByContenedorContactarCmViewModel <em>Owned By Contenedor Contactar Cm View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Ubicacionactual View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Ubicacionactual View Model</em>' containment reference.
	 * @see #setTheContenedorUbicacionactualViewModel(ContenedorUbicacionactualViewModel)
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage#getContenedorContactarCmViewModel_TheContenedorUbicacionactualViewModel()
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel#getOwnedByContenedorContactarCmViewModel
	 * @model opposite="ownedByContenedorContactarCmViewModel" containment="true"
	 * @generated
	 */
	ContenedorUbicacionactualViewModel getTheContenedorUbicacionactualViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel#getTheContenedorUbicacionactualViewModel <em>The Contenedor Ubicacionactual View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Ubicacionactual View Model</em>' containment reference.
	 * @see #getTheContenedorUbicacionactualViewModel()
	 * @generated
	 */
	void setTheContenedorUbicacionactualViewModel(ContenedorUbicacionactualViewModel value);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\t\t\r\n\t\t\t\t\t\tgetOwnedByUI().mostrarCmsCercanos(this);\r\n\t\t\t\t\t\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	void mostrarCmsCercanos();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\t\t\r\n\t\t\t\t\r\n\t\t\t\tContenedorUbicacionactualViewModel ubicacionActualVM \t= getTheContenedorUbicacionactualViewModel();\r\n\t\t\t\tContenedorCmrecomendadosViewModel cmRecomendadosVM\t\t= getTheContenedorCmrecomendadosViewModel();\r\n\t\t\t\t\r\n\t\t\t\tif ( ubicacionActualVM == null ) {\r\n\t\t\t\t\tubicacionActualVM = sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelFactory\r\n\t\t\t\t\t\t\t.eINSTANCE.createContenedorUbicacionactualViewModel();\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\tif ( cmRecomendadosVM == null ) {\r\n\t\t\t\t\tcmRecomendadosVM = sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelFactory\r\n\t\t\t\t\t\t\t.eINSTANCE.createContenedorCmrecomendadosViewModel();\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\tsetTheContenedorCmrecomendadosViewModel(cmRecomendadosVM);\r\n\t\t\t\tsetTheContenedorUbicacionactualViewModel(ubicacionActualVM);\r\n\t\t\t\t\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	void implementarModelo();

} // ContenedorContactarCmViewModel
