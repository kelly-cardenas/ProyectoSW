/**
 */
package sma.ui.viewmodels.contenedorescaneoviewmodel;

import org.eclipse.emf.common.util.EList;

import sma.ui.viewmodels.ViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Fallas View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel#getOwnedByContenedorEscaneoViewModel <em>Owned By Contenedor Escaneo View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel#getNumeroerrores <em>Numeroerrores</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel#getEstadoveh <em>Estadoveh</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel#getListaListaFallasViewModel <em>Lista Lista Fallas View Model</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getContenedorFallasViewModel()
 * @model
 * @generated
 */
public interface ContenedorFallasViewModel extends ViewModel {
	/**
	 * Returns the value of the '<em><b>Owned By Contenedor Escaneo View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getTheContenedorFallasViewModel <em>The Contenedor Fallas View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Contenedor Escaneo View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Contenedor Escaneo View Model</em>' container reference.
	 * @see #setOwnedByContenedorEscaneoViewModel(ContenedorEscaneoViewModel)
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getContenedorFallasViewModel_OwnedByContenedorEscaneoViewModel()
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getTheContenedorFallasViewModel
	 * @model opposite="theContenedorFallasViewModel" transient="false"
	 * @generated
	 */
	ContenedorEscaneoViewModel getOwnedByContenedorEscaneoViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel#getOwnedByContenedorEscaneoViewModel <em>Owned By Contenedor Escaneo View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Contenedor Escaneo View Model</em>' container reference.
	 * @see #getOwnedByContenedorEscaneoViewModel()
	 * @generated
	 */
	void setOwnedByContenedorEscaneoViewModel(ContenedorEscaneoViewModel value);

	/**
	 * Returns the value of the '<em><b>Numeroerrores</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numeroerrores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numeroerrores</em>' attribute.
	 * @see #setNumeroerrores(String)
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getContenedorFallasViewModel_Numeroerrores()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getNumeroerrores();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel#getNumeroerrores <em>Numeroerrores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numeroerrores</em>' attribute.
	 * @see #getNumeroerrores()
	 * @generated
	 */
	void setNumeroerrores(String value);

	/**
	 * Returns the value of the '<em><b>Estadoveh</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estadoveh</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estadoveh</em>' attribute.
	 * @see #setEstadoveh(String)
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getContenedorFallasViewModel_Estadoveh()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getEstadoveh();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel#getEstadoveh <em>Estadoveh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estadoveh</em>' attribute.
	 * @see #getEstadoveh()
	 * @generated
	 */
	void setEstadoveh(String value);

	/**
	 * Returns the value of the '<em><b>Lista Lista Fallas View Model</b></em>' containment reference list.
	 * The list contents are of type {@link sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel}.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel#getOwnedByContenedorFallasViewModel <em>Owned By Contenedor Fallas View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Lista Fallas View Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Lista Fallas View Model</em>' containment reference list.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getContenedorFallasViewModel_ListaListaFallasViewModel()
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel#getOwnedByContenedorFallasViewModel
	 * @model opposite="ownedByContenedorFallasViewModel" containment="true"
	 * @generated
	 */
	EList<ListaFallasViewModel> getListaListaFallasViewModel();

} // ContenedorFallasViewModel
