/**
 */
package sma.ui.viewmodels.contenedorescaneoviewmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lista Fallas View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel#getOwnedByContenedorFallasViewModel <em>Owned By Contenedor Fallas View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel#getGravedad <em>Gravedad</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel#getPiesaaveriada <em>Piesaaveriada</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel#getOrigen <em>Origen</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getListaFallasViewModel()
 * @model
 * @generated
 */
public interface ListaFallasViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By Contenedor Fallas View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel#getListaListaFallasViewModel <em>Lista Lista Fallas View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Contenedor Fallas View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Contenedor Fallas View Model</em>' container reference.
	 * @see #setOwnedByContenedorFallasViewModel(ContenedorFallasViewModel)
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getListaFallasViewModel_OwnedByContenedorFallasViewModel()
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel#getListaListaFallasViewModel
	 * @model opposite="listaListaFallasViewModel" transient="false"
	 * @generated
	 */
	ContenedorFallasViewModel getOwnedByContenedorFallasViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel#getOwnedByContenedorFallasViewModel <em>Owned By Contenedor Fallas View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Contenedor Fallas View Model</em>' container reference.
	 * @see #getOwnedByContenedorFallasViewModel()
	 * @generated
	 */
	void setOwnedByContenedorFallasViewModel(ContenedorFallasViewModel value);

	/**
	 * Returns the value of the '<em><b>Gravedad</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gravedad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gravedad</em>' attribute.
	 * @see #setGravedad(String)
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getListaFallasViewModel_Gravedad()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getGravedad();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel#getGravedad <em>Gravedad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gravedad</em>' attribute.
	 * @see #getGravedad()
	 * @generated
	 */
	void setGravedad(String value);

	/**
	 * Returns the value of the '<em><b>Piesaaveriada</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Piesaaveriada</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piesaaveriada</em>' attribute.
	 * @see #setPiesaaveriada(String)
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getListaFallasViewModel_Piesaaveriada()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getPiesaaveriada();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel#getPiesaaveriada <em>Piesaaveriada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Piesaaveriada</em>' attribute.
	 * @see #getPiesaaveriada()
	 * @generated
	 */
	void setPiesaaveriada(String value);

	/**
	 * Returns the value of the '<em><b>Origen</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' attribute.
	 * @see #setOrigen(String)
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getListaFallasViewModel_Origen()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getOrigen();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel#getOrigen <em>Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' attribute.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(String value);

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getListaFallasViewModel_Descripcion()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

} // ListaFallasViewModel
