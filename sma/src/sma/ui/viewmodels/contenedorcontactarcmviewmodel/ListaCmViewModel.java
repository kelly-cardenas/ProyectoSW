/**
 */
package sma.ui.viewmodels.contenedorcontactarcmviewmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lista Cm View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel#getOwnedByContenedorCmrecomendadosViewModel <em>Owned By Contenedor Cmrecomendados View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel#getNombre <em>Nombre</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel#getNombrerepresentante <em>Nombrerepresentante</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel#getDireccion <em>Direccion</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage#getListaCmViewModel()
 * @model
 * @generated
 */
public interface ListaCmViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By Contenedor Cmrecomendados View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorCmrecomendadosViewModel#getListaListaCmViewModel <em>Lista Lista Cm View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Contenedor Cmrecomendados View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Contenedor Cmrecomendados View Model</em>' container reference.
	 * @see #setOwnedByContenedorCmrecomendadosViewModel(ContenedorCmrecomendadosViewModel)
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage#getListaCmViewModel_OwnedByContenedorCmrecomendadosViewModel()
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorCmrecomendadosViewModel#getListaListaCmViewModel
	 * @model opposite="listaListaCmViewModel" transient="false"
	 * @generated
	 */
	ContenedorCmrecomendadosViewModel getOwnedByContenedorCmrecomendadosViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel#getOwnedByContenedorCmrecomendadosViewModel <em>Owned By Contenedor Cmrecomendados View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Contenedor Cmrecomendados View Model</em>' container reference.
	 * @see #getOwnedByContenedorCmrecomendadosViewModel()
	 * @generated
	 */
	void setOwnedByContenedorCmrecomendadosViewModel(ContenedorCmrecomendadosViewModel value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage#getListaCmViewModel_Nombre()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Nombrerepresentante</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombrerepresentante</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombrerepresentante</em>' attribute.
	 * @see #setNombrerepresentante(String)
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage#getListaCmViewModel_Nombrerepresentante()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getNombrerepresentante();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel#getNombrerepresentante <em>Nombrerepresentante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombrerepresentante</em>' attribute.
	 * @see #getNombrerepresentante()
	 * @generated
	 */
	void setNombrerepresentante(String value);

	/**
	 * Returns the value of the '<em><b>Direccion</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direccion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direccion</em>' attribute.
	 * @see #setDireccion(String)
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage#getListaCmViewModel_Direccion()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getDireccion();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel#getDireccion <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direccion</em>' attribute.
	 * @see #getDireccion()
	 * @generated
	 */
	void setDireccion(String value);

} // ListaCmViewModel
