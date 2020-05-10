/**
 */
package sma.ui.viewmodels.contenedorcrudcmviewmodel;

import org.eclipse.emf.ecore.EObject;

import sma.ui.UI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor CRUDCM View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel#getOwnedByUI <em>Owned By UI</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel#getTheContenedorDetalleCMViewModel <em>The Contenedor Detalle CM View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel#getTheContenedorMaestroCMViewModel <em>The Contenedor Maestro CM View Model</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getContenedorCRUDCMViewModel()
 * @model
 * @generated
 */
public interface ContenedorCRUDCMViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By UI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.UI#getTheContenedorCRUDCMViewModel <em>The Contenedor CRUDCM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By UI</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By UI</em>' container reference.
	 * @see #setOwnedByUI(UI)
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getContenedorCRUDCMViewModel_OwnedByUI()
	 * @see sma.ui.UI#getTheContenedorCRUDCMViewModel
	 * @model opposite="theContenedorCRUDCMViewModel" transient="false"
	 * @generated
	 */
	UI getOwnedByUI();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel#getOwnedByUI <em>Owned By UI</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By UI</em>' container reference.
	 * @see #getOwnedByUI()
	 * @generated
	 */
	void setOwnedByUI(UI value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Detalle CM View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel#getOwnedByContenedorCRUDCMViewModel <em>Owned By Contenedor CRUDCM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Detalle CM View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Detalle CM View Model</em>' containment reference.
	 * @see #setTheContenedorDetalleCMViewModel(ContenedorDetalleCMViewModel)
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getContenedorCRUDCMViewModel_TheContenedorDetalleCMViewModel()
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel#getOwnedByContenedorCRUDCMViewModel
	 * @model opposite="ownedByContenedorCRUDCMViewModel" containment="true"
	 * @generated
	 */
	ContenedorDetalleCMViewModel getTheContenedorDetalleCMViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel#getTheContenedorDetalleCMViewModel <em>The Contenedor Detalle CM View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Detalle CM View Model</em>' containment reference.
	 * @see #getTheContenedorDetalleCMViewModel()
	 * @generated
	 */
	void setTheContenedorDetalleCMViewModel(ContenedorDetalleCMViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Maestro CM View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorMaestroCMViewModel#getOwnedByContenedorCRUDCMViewModel <em>Owned By Contenedor CRUDCM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Maestro CM View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Maestro CM View Model</em>' containment reference.
	 * @see #setTheContenedorMaestroCMViewModel(ContenedorMaestroCMViewModel)
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getContenedorCRUDCMViewModel_TheContenedorMaestroCMViewModel()
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorMaestroCMViewModel#getOwnedByContenedorCRUDCMViewModel
	 * @model opposite="ownedByContenedorCRUDCMViewModel" containment="true"
	 * @generated
	 */
	ContenedorMaestroCMViewModel getTheContenedorMaestroCMViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel#getTheContenedorMaestroCMViewModel <em>The Contenedor Maestro CM View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Maestro CM View Model</em>' containment reference.
	 * @see #getTheContenedorMaestroCMViewModel()
	 * @generated
	 */
	void setTheContenedorMaestroCMViewModel(ContenedorMaestroCMViewModel value);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\t\t\tContenedorDetalleCMViewModel detalleCMVM = getTheContenedorDetalleCMViewModel();\r\n\t\t\t\tContenedorMaestroCMViewModel maestroCMVM = getTheContenedorMaestroCMViewModel();\r\n\t\t\t\t\r\n\t\t\t\tif ( detalleCMVM == null ) {\r\n\t\t\t\t\tdetalleCMVM = sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelFactory\r\n\t\t\t\t\t\t\t\t.eINSTANCE.createContenedorDetalleCMViewModel();\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\tif ( maestroCMVM == null ) {\r\n\t\t\t\t\t\r\n\t\t\t\t\tmaestroCMVM = sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelFactory\r\n\t\t\t\t\t\t\t\t.eINSTANCE.createContenedorMaestroCMViewModel();\r\n\t\t\t\t\t\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\tsetTheContenedorDetalleCMViewModel(detalleCMVM);\r\n\t\t\t\tsetTheContenedorMaestroCMViewModel(maestroCMVM);\r\n\t\t\r\n\t\tdetalleCMVM.implementarModelo();\r\n\t'"
	 * @generated
	 */
	void implementarModelo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\t\tgetOwnedByUI().RegistrarCm(this);\r\n\t'"
	 * @generated
	 */
	void registrarCm();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\t\tgetOwnedByUI().actualizarCrudCm(this);\r\n\t'"
	 * @generated
	 */
	void actualizarCrudCm();

} // ContenedorCRUDCMViewModel
