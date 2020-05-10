/**
 */
package sma.ui.viewmodels.contenedorcontactarcmviewmodel;

import org.eclipse.emf.common.util.EList;

import sma.ui.viewmodels.ViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Cmrecomendados View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorCmrecomendadosViewModel#getListaListaCmViewModel <em>Lista Lista Cm View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorCmrecomendadosViewModel#getOwnedByContenedorContactarCmViewModel <em>Owned By Contenedor Contactar Cm View Model</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage#getContenedorCmrecomendadosViewModel()
 * @model
 * @generated
 */
public interface ContenedorCmrecomendadosViewModel extends ViewModel {
	/**
	 * Returns the value of the '<em><b>Lista Lista Cm View Model</b></em>' containment reference list.
	 * The list contents are of type {@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel}.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel#getOwnedByContenedorCmrecomendadosViewModel <em>Owned By Contenedor Cmrecomendados View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Lista Cm View Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Lista Cm View Model</em>' containment reference list.
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage#getContenedorCmrecomendadosViewModel_ListaListaCmViewModel()
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel#getOwnedByContenedorCmrecomendadosViewModel
	 * @model opposite="ownedByContenedorCmrecomendadosViewModel" containment="true"
	 * @generated
	 */
	EList<ListaCmViewModel> getListaListaCmViewModel();

	/**
	 * Returns the value of the '<em><b>Owned By Contenedor Contactar Cm View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel#getTheContenedorCmrecomendadosViewModel <em>The Contenedor Cmrecomendados View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Contenedor Contactar Cm View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Contenedor Contactar Cm View Model</em>' container reference.
	 * @see #setOwnedByContenedorContactarCmViewModel(ContenedorContactarCmViewModel)
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage#getContenedorCmrecomendadosViewModel_OwnedByContenedorContactarCmViewModel()
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel#getTheContenedorCmrecomendadosViewModel
	 * @model opposite="theContenedorCmrecomendadosViewModel" transient="false"
	 * @generated
	 */
	ContenedorContactarCmViewModel getOwnedByContenedorContactarCmViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorCmrecomendadosViewModel#getOwnedByContenedorContactarCmViewModel <em>Owned By Contenedor Contactar Cm View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Contenedor Contactar Cm View Model</em>' container reference.
	 * @see #getOwnedByContenedorContactarCmViewModel()
	 * @generated
	 */
	void setOwnedByContenedorContactarCmViewModel(ContenedorContactarCmViewModel value);

} // ContenedorCmrecomendadosViewModel
