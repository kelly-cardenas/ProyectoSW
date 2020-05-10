/**
 */
package sma.ui.viewmodels.contenedorcrudcmviewmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Maestro CM View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorMaestroCMViewModel#getOwnedByContenedorCRUDCMViewModel <em>Owned By Contenedor CRUDCM View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorMaestroCMViewModel#getListaCentroMant <em>Lista Centro Mant</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getContenedorMaestroCMViewModel()
 * @model
 * @generated
 */
public interface ContenedorMaestroCMViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By Contenedor CRUDCM View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel#getTheContenedorMaestroCMViewModel <em>The Contenedor Maestro CM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Contenedor CRUDCM View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Contenedor CRUDCM View Model</em>' container reference.
	 * @see #setOwnedByContenedorCRUDCMViewModel(ContenedorCRUDCMViewModel)
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getContenedorMaestroCMViewModel_OwnedByContenedorCRUDCMViewModel()
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel#getTheContenedorMaestroCMViewModel
	 * @model opposite="theContenedorMaestroCMViewModel" transient="false"
	 * @generated
	 */
	ContenedorCRUDCMViewModel getOwnedByContenedorCRUDCMViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorMaestroCMViewModel#getOwnedByContenedorCRUDCMViewModel <em>Owned By Contenedor CRUDCM View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Contenedor CRUDCM View Model</em>' container reference.
	 * @see #getOwnedByContenedorCRUDCMViewModel()
	 * @generated
	 */
	void setOwnedByContenedorCRUDCMViewModel(ContenedorCRUDCMViewModel value);

	/**
	 * Returns the value of the '<em><b>Lista Centro Mant</b></em>' containment reference list.
	 * The list contents are of type {@link sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel}.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel#getThe0ContenedorMaestroCMViewModel <em>The0 Contenedor Maestro CM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Centro Mant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Centro Mant</em>' containment reference list.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getContenedorMaestroCMViewModel_ListaCentroMant()
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel#getThe0ContenedorMaestroCMViewModel
	 * @model opposite="the0ContenedorMaestroCMViewModel" containment="true"
	 * @generated
	 */
	EList<CentroMantViewModel> getListaCentroMant();

} // ContenedorMaestroCMViewModel
