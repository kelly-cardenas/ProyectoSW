/**
 */
package sma.ui.viewmodels.contenedorescaneoviewmodel;

import sma.ui.viewmodels.ViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Seleccionauto View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorSeleccionautoViewModel#getOwnedByContenedorEscaneoViewModel <em>Owned By Contenedor Escaneo View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorSeleccionautoViewModel#getPlacavehiculo <em>Placavehiculo</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getContenedorSeleccionautoViewModel()
 * @model
 * @generated
 */
public interface ContenedorSeleccionautoViewModel extends ViewModel {
	/**
	 * Returns the value of the '<em><b>Owned By Contenedor Escaneo View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getTheContenedorSeleccionautoViewModel <em>The Contenedor Seleccionauto View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Contenedor Escaneo View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Contenedor Escaneo View Model</em>' container reference.
	 * @see #setOwnedByContenedorEscaneoViewModel(ContenedorEscaneoViewModel)
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getContenedorSeleccionautoViewModel_OwnedByContenedorEscaneoViewModel()
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getTheContenedorSeleccionautoViewModel
	 * @model opposite="theContenedorSeleccionautoViewModel" transient="false"
	 * @generated
	 */
	ContenedorEscaneoViewModel getOwnedByContenedorEscaneoViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorSeleccionautoViewModel#getOwnedByContenedorEscaneoViewModel <em>Owned By Contenedor Escaneo View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Contenedor Escaneo View Model</em>' container reference.
	 * @see #getOwnedByContenedorEscaneoViewModel()
	 * @generated
	 */
	void setOwnedByContenedorEscaneoViewModel(ContenedorEscaneoViewModel value);

	/**
	 * Returns the value of the '<em><b>Placavehiculo</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placavehiculo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placavehiculo</em>' attribute.
	 * @see #setPlacavehiculo(String)
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getContenedorSeleccionautoViewModel_Placavehiculo()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getPlacavehiculo();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorSeleccionautoViewModel#getPlacavehiculo <em>Placavehiculo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placavehiculo</em>' attribute.
	 * @see #getPlacavehiculo()
	 * @generated
	 */
	void setPlacavehiculo(String value);

} // ContenedorSeleccionautoViewModel
