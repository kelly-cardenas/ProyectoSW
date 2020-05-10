/**
 */
package sma.ui.viewmodels.contenedorloginviewmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Detalle Login View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorDetalleLoginViewModel#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorDetalleLoginViewModel#getContrasenia <em>Contrasenia</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorDetalleLoginViewModel#getOwnedByContenedorLoginViewModel <em>Owned By Contenedor Login View Model</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorloginviewmodelPackage#getContenedorDetalleLoginViewModel()
 * @model
 * @generated
 */
public interface ContenedorDetalleLoginViewModel extends EObject {
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
	 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorloginviewmodelPackage#getContenedorDetalleLoginViewModel_Usuario()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getUsuario();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorDetalleLoginViewModel#getUsuario <em>Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usuario</em>' attribute.
	 * @see #getUsuario()
	 * @generated
	 */
	void setUsuario(String value);

	/**
	 * Returns the value of the '<em><b>Contrasenia</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contrasenia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrasenia</em>' attribute.
	 * @see #setContrasenia(String)
	 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorloginviewmodelPackage#getContenedorDetalleLoginViewModel_Contrasenia()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getContrasenia();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorDetalleLoginViewModel#getContrasenia <em>Contrasenia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrasenia</em>' attribute.
	 * @see #getContrasenia()
	 * @generated
	 */
	void setContrasenia(String value);

	/**
	 * Returns the value of the '<em><b>Owned By Contenedor Login View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel#getTheContenedorDetalleLoginViewModel <em>The Contenedor Detalle Login View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Contenedor Login View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Contenedor Login View Model</em>' container reference.
	 * @see #setOwnedByContenedorLoginViewModel(ContenedorLoginViewModel)
	 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorloginviewmodelPackage#getContenedorDetalleLoginViewModel_OwnedByContenedorLoginViewModel()
	 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel#getTheContenedorDetalleLoginViewModel
	 * @model opposite="theContenedorDetalleLoginViewModel" transient="false"
	 * @generated
	 */
	ContenedorLoginViewModel getOwnedByContenedorLoginViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorDetalleLoginViewModel#getOwnedByContenedorLoginViewModel <em>Owned By Contenedor Login View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Contenedor Login View Model</em>' container reference.
	 * @see #getOwnedByContenedorLoginViewModel()
	 * @generated
	 */
	void setOwnedByContenedorLoginViewModel(ContenedorLoginViewModel value);

} // ContenedorDetalleLoginViewModel
