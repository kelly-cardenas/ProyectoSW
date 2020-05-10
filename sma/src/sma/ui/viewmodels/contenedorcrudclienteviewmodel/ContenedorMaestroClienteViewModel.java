/**
 */
package sma.ui.viewmodels.contenedorcrudclienteviewmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Maestro Cliente View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorMaestroClienteViewModel#getOwnedByContenedorCrudClienteViewModel <em>Owned By Contenedor Crud Cliente View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorMaestroClienteViewModel#getClienteViewModel <em>Cliente View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorMaestroClienteViewModel#getTheClienteViewModel <em>The Cliente View Model</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage#getContenedorMaestroClienteViewModel()
 * @model
 * @generated
 */
public interface ContenedorMaestroClienteViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By Contenedor Crud Cliente View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel#getTheContenedorMaestroClienteViewModel <em>The Contenedor Maestro Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Contenedor Crud Cliente View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Contenedor Crud Cliente View Model</em>' container reference.
	 * @see #setOwnedByContenedorCrudClienteViewModel(ContenedorCrudClienteViewModel)
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage#getContenedorMaestroClienteViewModel_OwnedByContenedorCrudClienteViewModel()
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel#getTheContenedorMaestroClienteViewModel
	 * @model opposite="theContenedorMaestroClienteViewModel" transient="false"
	 * @generated
	 */
	ContenedorCrudClienteViewModel getOwnedByContenedorCrudClienteViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorMaestroClienteViewModel#getOwnedByContenedorCrudClienteViewModel <em>Owned By Contenedor Crud Cliente View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Contenedor Crud Cliente View Model</em>' container reference.
	 * @see #getOwnedByContenedorCrudClienteViewModel()
	 * @generated
	 */
	void setOwnedByContenedorCrudClienteViewModel(ContenedorCrudClienteViewModel value);

	/**
	 * Returns the value of the '<em><b>Cliente View Model</b></em>' containment reference list.
	 * The list contents are of type {@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel}.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel#getThe0ContenedorMaestroClienteViewModel <em>The0 Contenedor Maestro Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cliente View Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cliente View Model</em>' containment reference list.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage#getContenedorMaestroClienteViewModel_ClienteViewModel()
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel#getThe0ContenedorMaestroClienteViewModel
	 * @model opposite="the0ContenedorMaestroClienteViewModel" containment="true"
	 * @generated
	 */
	EList<ClienteViewModel> getClienteViewModel();

	/**
	 * Returns the value of the '<em><b>The Cliente View Model</b></em>' reference list.
	 * The list contents are of type {@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel}.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel#getTheContenedorMaestroClienteViewModel <em>The Contenedor Maestro Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Cliente View Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Cliente View Model</em>' reference list.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage#getContenedorMaestroClienteViewModel_TheClienteViewModel()
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel#getTheContenedorMaestroClienteViewModel
	 * @model opposite="theContenedorMaestroClienteViewModel"
	 * @generated
	 */
	EList<ClienteViewModel> getTheClienteViewModel();

} // ContenedorMaestroClienteViewModel
