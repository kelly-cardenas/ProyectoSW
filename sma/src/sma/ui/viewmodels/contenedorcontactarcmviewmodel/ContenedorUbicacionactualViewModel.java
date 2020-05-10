/**
 */
package sma.ui.viewmodels.contenedorcontactarcmviewmodel;

import sma.ui.viewmodels.ViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Ubicacionactual View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel#getOwnedByContenedorContactarCmViewModel <em>Owned By Contenedor Contactar Cm View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel#getPais <em>Pais</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel#getDepartamento <em>Departamento</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel#getCiudad <em>Ciudad</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage#getContenedorUbicacionactualViewModel()
 * @model
 * @generated
 */
public interface ContenedorUbicacionactualViewModel extends ViewModel {
	/**
	 * Returns the value of the '<em><b>Owned By Contenedor Contactar Cm View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel#getTheContenedorUbicacionactualViewModel <em>The Contenedor Ubicacionactual View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Contenedor Contactar Cm View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Contenedor Contactar Cm View Model</em>' container reference.
	 * @see #setOwnedByContenedorContactarCmViewModel(ContenedorContactarCmViewModel)
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage#getContenedorUbicacionactualViewModel_OwnedByContenedorContactarCmViewModel()
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel#getTheContenedorUbicacionactualViewModel
	 * @model opposite="theContenedorUbicacionactualViewModel" transient="false"
	 * @generated
	 */
	ContenedorContactarCmViewModel getOwnedByContenedorContactarCmViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel#getOwnedByContenedorContactarCmViewModel <em>Owned By Contenedor Contactar Cm View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Contenedor Contactar Cm View Model</em>' container reference.
	 * @see #getOwnedByContenedorContactarCmViewModel()
	 * @generated
	 */
	void setOwnedByContenedorContactarCmViewModel(ContenedorContactarCmViewModel value);

	/**
	 * Returns the value of the '<em><b>Pais</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pais</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pais</em>' attribute.
	 * @see #setPais(String)
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage#getContenedorUbicacionactualViewModel_Pais()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getPais();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel#getPais <em>Pais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pais</em>' attribute.
	 * @see #getPais()
	 * @generated
	 */
	void setPais(String value);

	/**
	 * Returns the value of the '<em><b>Departamento</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Departamento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departamento</em>' attribute.
	 * @see #setDepartamento(String)
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage#getContenedorUbicacionactualViewModel_Departamento()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getDepartamento();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel#getDepartamento <em>Departamento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departamento</em>' attribute.
	 * @see #getDepartamento()
	 * @generated
	 */
	void setDepartamento(String value);

	/**
	 * Returns the value of the '<em><b>Ciudad</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ciudad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ciudad</em>' attribute.
	 * @see #setCiudad(String)
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage#getContenedorUbicacionactualViewModel_Ciudad()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getCiudad();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel#getCiudad <em>Ciudad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ciudad</em>' attribute.
	 * @see #getCiudad()
	 * @generated
	 */
	void setCiudad(String value);

} // ContenedorUbicacionactualViewModel
