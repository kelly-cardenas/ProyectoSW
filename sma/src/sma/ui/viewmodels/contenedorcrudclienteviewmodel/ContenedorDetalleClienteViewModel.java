/**
 */
package sma.ui.viewmodels.contenedorcrudclienteviewmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Detalle Cliente View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel#getOwnedByContenedorCrudClienteViewModel <em>Owned By Contenedor Crud Cliente View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel#getTheContenedorDatosPersonalesViewModel <em>The Contenedor Datos Personales View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel#getTheContenedorDatosdelacuentaViewModel <em>The Contenedor Datosdelacuenta View Model</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage#getContenedorDetalleClienteViewModel()
 * @model
 * @generated
 */
public interface ContenedorDetalleClienteViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By Contenedor Crud Cliente View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel#getTheContenedorDetalleClienteViewModel <em>The Contenedor Detalle Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Contenedor Crud Cliente View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Contenedor Crud Cliente View Model</em>' container reference.
	 * @see #setOwnedByContenedorCrudClienteViewModel(ContenedorCrudClienteViewModel)
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage#getContenedorDetalleClienteViewModel_OwnedByContenedorCrudClienteViewModel()
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel#getTheContenedorDetalleClienteViewModel
	 * @model opposite="theContenedorDetalleClienteViewModel" transient="false"
	 * @generated
	 */
	ContenedorCrudClienteViewModel getOwnedByContenedorCrudClienteViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel#getOwnedByContenedorCrudClienteViewModel <em>Owned By Contenedor Crud Cliente View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Contenedor Crud Cliente View Model</em>' container reference.
	 * @see #getOwnedByContenedorCrudClienteViewModel()
	 * @generated
	 */
	void setOwnedByContenedorCrudClienteViewModel(ContenedorCrudClienteViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Datos Personales View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosPersonalesViewModel#getOwnedByContenedorDetalleClienteViewModel <em>Owned By Contenedor Detalle Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Datos Personales View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Datos Personales View Model</em>' containment reference.
	 * @see #setTheContenedorDatosPersonalesViewModel(ContenedorDatosPersonalesViewModel)
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage#getContenedorDetalleClienteViewModel_TheContenedorDatosPersonalesViewModel()
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosPersonalesViewModel#getOwnedByContenedorDetalleClienteViewModel
	 * @model opposite="ownedByContenedorDetalleClienteViewModel" containment="true"
	 * @generated
	 */
	ContenedorDatosPersonalesViewModel getTheContenedorDatosPersonalesViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel#getTheContenedorDatosPersonalesViewModel <em>The Contenedor Datos Personales View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Datos Personales View Model</em>' containment reference.
	 * @see #getTheContenedorDatosPersonalesViewModel()
	 * @generated
	 */
	void setTheContenedorDatosPersonalesViewModel(ContenedorDatosPersonalesViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Datosdelacuenta View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosdelacuentaViewModel#getOwnedByContenedorDetalleClienteViewModel <em>Owned By Contenedor Detalle Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Datosdelacuenta View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Datosdelacuenta View Model</em>' containment reference.
	 * @see #setTheContenedorDatosdelacuentaViewModel(ContenedorDatosdelacuentaViewModel)
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage#getContenedorDetalleClienteViewModel_TheContenedorDatosdelacuentaViewModel()
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosdelacuentaViewModel#getOwnedByContenedorDetalleClienteViewModel
	 * @model opposite="ownedByContenedorDetalleClienteViewModel" containment="true"
	 * @generated
	 */
	ContenedorDatosdelacuentaViewModel getTheContenedorDatosdelacuentaViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel#getTheContenedorDatosdelacuentaViewModel <em>The Contenedor Datosdelacuenta View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Datosdelacuenta View Model</em>' containment reference.
	 * @see #getTheContenedorDatosdelacuentaViewModel()
	 * @generated
	 */
	void setTheContenedorDatosdelacuentaViewModel(ContenedorDatosdelacuentaViewModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\t\t\r\n\t\tContenedorDatosPersonalesViewModel datosPersonalesVM = getTheContenedorDatosPersonalesViewModel();\r\n\t\tContenedorDatosdelacuentaViewModel datosCuentaCM\t = getTheContenedorDatosdelacuentaViewModel();\r\n\t\t\r\n\t\tif ( datosPersonalesVM == null ) {\r\n\t\t\tdatosPersonalesVM = sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelFactory\r\n\t\t\t\t\t\t\t\t.eINSTANCE.createContenedorDatosPersonalesViewModel();\r\n\t\t}\r\n\t\t\r\n\t\tif ( datosCuentaCM == null ) {\r\n\t\t\tdatosCuentaCM \t= sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelFactory\r\n\t\t\t\t\t\t\t.eINSTANCE.createContenedorDatosdelacuentaViewModel();\r\n\t\t}\r\n\t\t\r\n\t\tsetTheContenedorDatosdelacuentaViewModel(datosCuentaCM);\r\n\t\tsetTheContenedorDatosPersonalesViewModel(datosPersonalesVM);\r\n\t\t\r\n\t\t\r\n\t'"
	 * @generated
	 */
	void implementarModelo();

} // ContenedorDetalleClienteViewModel
