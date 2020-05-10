/**
 */
package sma.ui.viewmodels.contenedorcrudcmviewmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Detalle CM View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel#getOwnedByContenedorCRUDCMViewModel <em>Owned By Contenedor CRUDCM View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel#getTheContenedorInformacionCMViewModel <em>The Contenedor Informacion CM View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel#getTheContenedorUbicacionViewModel <em>The Contenedor Ubicacion View Model</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getContenedorDetalleCMViewModel()
 * @model
 * @generated
 */
public interface ContenedorDetalleCMViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By Contenedor CRUDCM View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel#getTheContenedorDetalleCMViewModel <em>The Contenedor Detalle CM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Contenedor CRUDCM View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Contenedor CRUDCM View Model</em>' container reference.
	 * @see #setOwnedByContenedorCRUDCMViewModel(ContenedorCRUDCMViewModel)
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getContenedorDetalleCMViewModel_OwnedByContenedorCRUDCMViewModel()
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel#getTheContenedorDetalleCMViewModel
	 * @model opposite="theContenedorDetalleCMViewModel" transient="false"
	 * @generated
	 */
	ContenedorCRUDCMViewModel getOwnedByContenedorCRUDCMViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel#getOwnedByContenedorCRUDCMViewModel <em>Owned By Contenedor CRUDCM View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Contenedor CRUDCM View Model</em>' container reference.
	 * @see #getOwnedByContenedorCRUDCMViewModel()
	 * @generated
	 */
	void setOwnedByContenedorCRUDCMViewModel(ContenedorCRUDCMViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Informacion CM View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel#getOwnedByContenedorDetalleCMViewModel <em>Owned By Contenedor Detalle CM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Informacion CM View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Informacion CM View Model</em>' containment reference.
	 * @see #setTheContenedorInformacionCMViewModel(ContenedorInformacionCMViewModel)
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getContenedorDetalleCMViewModel_TheContenedorInformacionCMViewModel()
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel#getOwnedByContenedorDetalleCMViewModel
	 * @model opposite="ownedByContenedorDetalleCMViewModel" containment="true"
	 * @generated
	 */
	ContenedorInformacionCMViewModel getTheContenedorInformacionCMViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel#getTheContenedorInformacionCMViewModel <em>The Contenedor Informacion CM View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Informacion CM View Model</em>' containment reference.
	 * @see #getTheContenedorInformacionCMViewModel()
	 * @generated
	 */
	void setTheContenedorInformacionCMViewModel(ContenedorInformacionCMViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Ubicacion View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel#getOwnedByContenedorDetalleCMViewModel <em>Owned By Contenedor Detalle CM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Ubicacion View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Ubicacion View Model</em>' containment reference.
	 * @see #setTheContenedorUbicacionViewModel(ContenedorUbicacionViewModel)
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getContenedorDetalleCMViewModel_TheContenedorUbicacionViewModel()
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel#getOwnedByContenedorDetalleCMViewModel
	 * @model opposite="ownedByContenedorDetalleCMViewModel" containment="true"
	 * @generated
	 */
	ContenedorUbicacionViewModel getTheContenedorUbicacionViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel#getTheContenedorUbicacionViewModel <em>The Contenedor Ubicacion View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Ubicacion View Model</em>' containment reference.
	 * @see #getTheContenedorUbicacionViewModel()
	 * @generated
	 */
	void setTheContenedorUbicacionViewModel(ContenedorUbicacionViewModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\r\n\t\tContenedorInformacionCMViewModel informacionCMVM = getTheContenedorInformacionCMViewModel();\r\n\t\tContenedorUbicacionViewModel \tubicacionCMVM\t = getTheContenedorUbicacionViewModel();\r\n\t\t\r\n\t\tif ( informacionCMVM == null ) {\r\n\t\t\tinformacionCMVM = sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelFactory\r\n\t\t\t\t\t.eINSTANCE.createContenedorInformacionCMViewModel();\r\n\t\t}\r\n\t\t\r\n\t\tif ( ubicacionCMVM == null ) {\r\n\t\t\tubicacionCMVM = sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelFactory\r\n\t\t\t\t\t.eINSTANCE.createContenedorUbicacionViewModel();\r\n\t\t}\r\n\t\t\r\n\t\tsetTheContenedorInformacionCMViewModel(informacionCMVM);\r\n\t\tsetTheContenedorUbicacionViewModel(ubicacionCMVM);\r\n\t\t\r\n\t'"
	 * @generated
	 */
	void implementarModelo();

} // ContenedorDetalleCMViewModel
