/**
 */
package sma.ui.viewmodels.contenedorloginviewmodel;

import org.eclipse.emf.ecore.EObject;

import sma.ui.UI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Login View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel#getOwnedByUI <em>Owned By UI</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel#getTheContenedorDetalleLoginViewModel <em>The Contenedor Detalle Login View Model</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorloginviewmodelPackage#getContenedorLoginViewModel()
 * @model
 * @generated
 */
public interface ContenedorLoginViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By UI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.UI#getTheContenedorLoginViewModel <em>The Contenedor Login View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By UI</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By UI</em>' container reference.
	 * @see #setOwnedByUI(UI)
	 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorloginviewmodelPackage#getContenedorLoginViewModel_OwnedByUI()
	 * @see sma.ui.UI#getTheContenedorLoginViewModel
	 * @model opposite="theContenedorLoginViewModel" transient="false"
	 * @generated
	 */
	UI getOwnedByUI();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel#getOwnedByUI <em>Owned By UI</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By UI</em>' container reference.
	 * @see #getOwnedByUI()
	 * @generated
	 */
	void setOwnedByUI(UI value);

	/**
	 * Returns the value of the '<em><b>Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usuario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuario</em>' attribute.
	 * @see #setUsuario(String)
	 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorloginviewmodelPackage#getContenedorLoginViewModel_Usuario()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getUsuario();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel#getUsuario <em>Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usuario</em>' attribute.
	 * @see #getUsuario()
	 * @generated
	 */
	void setUsuario(String value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Detalle Login View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorDetalleLoginViewModel#getOwnedByContenedorLoginViewModel <em>Owned By Contenedor Login View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Detalle Login View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Detalle Login View Model</em>' containment reference.
	 * @see #setTheContenedorDetalleLoginViewModel(ContenedorDetalleLoginViewModel)
	 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorloginviewmodelPackage#getContenedorLoginViewModel_TheContenedorDetalleLoginViewModel()
	 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorDetalleLoginViewModel#getOwnedByContenedorLoginViewModel
	 * @model opposite="ownedByContenedorLoginViewModel" containment="true"
	 * @generated
	 */
	ContenedorDetalleLoginViewModel getTheContenedorDetalleLoginViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel#getTheContenedorDetalleLoginViewModel <em>The Contenedor Detalle Login View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Detalle Login View Model</em>' containment reference.
	 * @see #getTheContenedorDetalleLoginViewModel()
	 * @generated
	 */
	void setTheContenedorDetalleLoginViewModel(ContenedorDetalleLoginViewModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="sma.String" eventoDataType="sma.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t\tString action = \"\";\n\t\treturn action;\n'"
	 * @generated
	 */
	String upadateDialog(String evento);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='//TODO prueba\n'"
	 * @generated
	 */
	void prueba();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='//TODO implementarModelo\n'"
	 * @generated
	 */
	void implementarModelo();

} // ContenedorLoginViewModel
