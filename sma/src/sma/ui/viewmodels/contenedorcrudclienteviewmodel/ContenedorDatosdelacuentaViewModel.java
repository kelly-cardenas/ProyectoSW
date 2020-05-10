/**
 */
package sma.ui.viewmodels.contenedorcrudclienteviewmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Datosdelacuenta View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosdelacuentaViewModel#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosdelacuentaViewModel#getContrasenia <em>Contrasenia</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosdelacuentaViewModel#getOwnedByContenedorDetalleClienteViewModel <em>Owned By Contenedor Detalle Cliente View Model</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage#getContenedorDatosdelacuentaViewModel()
 * @model
 * @generated
 */
public interface ContenedorDatosdelacuentaViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Usuario</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usuario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuario</em>' attribute.
	 * @see #setUsuario(String)
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage#getContenedorDatosdelacuentaViewModel_Usuario()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getUsuario();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosdelacuentaViewModel#getUsuario <em>Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usuario</em>' attribute.
	 * @see #getUsuario()
	 * @generated
	 */
	void setUsuario(String value);

	/**
	 * Returns the value of the '<em><b>Contrasenia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contrasenia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrasenia</em>' attribute.
	 * @see #setContrasenia(String)
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage#getContenedorDatosdelacuentaViewModel_Contrasenia()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getContrasenia();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosdelacuentaViewModel#getContrasenia <em>Contrasenia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrasenia</em>' attribute.
	 * @see #getContrasenia()
	 * @generated
	 */
	void setContrasenia(String value);

	/**
	 * Returns the value of the '<em><b>Owned By Contenedor Detalle Cliente View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel#getTheContenedorDatosdelacuentaViewModel <em>The Contenedor Datosdelacuenta View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Contenedor Detalle Cliente View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Contenedor Detalle Cliente View Model</em>' container reference.
	 * @see #setOwnedByContenedorDetalleClienteViewModel(ContenedorDetalleClienteViewModel)
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage#getContenedorDatosdelacuentaViewModel_OwnedByContenedorDetalleClienteViewModel()
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel#getTheContenedorDatosdelacuentaViewModel
	 * @model opposite="theContenedorDatosdelacuentaViewModel" transient="false"
	 * @generated
	 */
	ContenedorDetalleClienteViewModel getOwnedByContenedorDetalleClienteViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosdelacuentaViewModel#getOwnedByContenedorDetalleClienteViewModel <em>Owned By Contenedor Detalle Cliente View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Contenedor Detalle Cliente View Model</em>' container reference.
	 * @see #getOwnedByContenedorDetalleClienteViewModel()
	 * @generated
	 */
	void setOwnedByContenedorDetalleClienteViewModel(ContenedorDetalleClienteViewModel value);

} // ContenedorDatosdelacuentaViewModel
