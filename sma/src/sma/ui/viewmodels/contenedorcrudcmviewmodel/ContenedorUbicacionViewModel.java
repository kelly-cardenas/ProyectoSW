/**
 */
package sma.ui.viewmodels.contenedorcrudcmviewmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Ubicacion View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel#getOwnedByContenedorDetalleCMViewModel <em>Owned By Contenedor Detalle CM View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel#getPais <em>Pais</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel#getDepartamento <em>Departamento</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel#getCiudad <em>Ciudad</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel#getDireccion <em>Direccion</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getContenedorUbicacionViewModel()
 * @model
 * @generated
 */
public interface ContenedorUbicacionViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By Contenedor Detalle CM View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel#getTheContenedorUbicacionViewModel <em>The Contenedor Ubicacion View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Contenedor Detalle CM View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Contenedor Detalle CM View Model</em>' container reference.
	 * @see #setOwnedByContenedorDetalleCMViewModel(ContenedorDetalleCMViewModel)
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getContenedorUbicacionViewModel_OwnedByContenedorDetalleCMViewModel()
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel#getTheContenedorUbicacionViewModel
	 * @model opposite="theContenedorUbicacionViewModel" transient="false"
	 * @generated
	 */
	ContenedorDetalleCMViewModel getOwnedByContenedorDetalleCMViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel#getOwnedByContenedorDetalleCMViewModel <em>Owned By Contenedor Detalle CM View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Contenedor Detalle CM View Model</em>' container reference.
	 * @see #getOwnedByContenedorDetalleCMViewModel()
	 * @generated
	 */
	void setOwnedByContenedorDetalleCMViewModel(ContenedorDetalleCMViewModel value);

	/**
	 * Returns the value of the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pais</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pais</em>' attribute.
	 * @see #setPais(String)
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getContenedorUbicacionViewModel_Pais()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getPais();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel#getPais <em>Pais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pais</em>' attribute.
	 * @see #getPais()
	 * @generated
	 */
	void setPais(String value);

	/**
	 * Returns the value of the '<em><b>Departamento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Departamento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departamento</em>' attribute.
	 * @see #setDepartamento(String)
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getContenedorUbicacionViewModel_Departamento()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getDepartamento();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel#getDepartamento <em>Departamento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departamento</em>' attribute.
	 * @see #getDepartamento()
	 * @generated
	 */
	void setDepartamento(String value);

	/**
	 * Returns the value of the '<em><b>Ciudad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ciudad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ciudad</em>' attribute.
	 * @see #setCiudad(String)
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getContenedorUbicacionViewModel_Ciudad()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getCiudad();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel#getCiudad <em>Ciudad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ciudad</em>' attribute.
	 * @see #getCiudad()
	 * @generated
	 */
	void setCiudad(String value);

	/**
	 * Returns the value of the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direccion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direccion</em>' attribute.
	 * @see #setDireccion(String)
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getContenedorUbicacionViewModel_Direccion()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getDireccion();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel#getDireccion <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direccion</em>' attribute.
	 * @see #getDireccion()
	 * @generated
	 */
	void setDireccion(String value);

} // ContenedorUbicacionViewModel
