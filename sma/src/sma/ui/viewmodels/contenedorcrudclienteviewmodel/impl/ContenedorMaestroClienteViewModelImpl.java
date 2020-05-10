/**
 */
package sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorMaestroClienteViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Maestro Cliente View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorMaestroClienteViewModelImpl#getOwnedByContenedorCrudClienteViewModel <em>Owned By Contenedor Crud Cliente View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorMaestroClienteViewModelImpl#getListaCliente <em>Lista Cliente</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorMaestroClienteViewModelImpl extends EObjectImpl implements ContenedorMaestroClienteViewModel {
	/**
	 * The cached value of the '{@link #getListaCliente() <em>Lista Cliente</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaCliente()
	 * @generated
	 * @ordered
	 */
	protected EList<ClienteViewModel> listaCliente;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorMaestroClienteViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudclienteviewmodelPackage.Literals.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCrudClienteViewModel getOwnedByContenedorCrudClienteViewModel() {
		if (eContainerFeatureID() != ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL) return null;
		return (ContenedorCrudClienteViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorCrudClienteViewModel(ContenedorCrudClienteViewModel newOwnedByContenedorCrudClienteViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorCrudClienteViewModel, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorCrudClienteViewModel(ContenedorCrudClienteViewModel newOwnedByContenedorCrudClienteViewModel) {
		if (newOwnedByContenedorCrudClienteViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL && newOwnedByContenedorCrudClienteViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorCrudClienteViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorCrudClienteViewModel != null)
				msgs = ((InternalEObject)newOwnedByContenedorCrudClienteViewModel).eInverseAdd(this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL, ContenedorCrudClienteViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorCrudClienteViewModel(newOwnedByContenedorCrudClienteViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL, newOwnedByContenedorCrudClienteViewModel, newOwnedByContenedorCrudClienteViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClienteViewModel> getListaCliente() {
		if (listaCliente == null) {
			listaCliente = new EObjectContainmentWithInverseEList<ClienteViewModel>(ClienteViewModel.class, this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__LISTA_CLIENTE, ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL);
		}
		return listaCliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByContenedorCrudClienteViewModel((ContenedorCrudClienteViewModel)otherEnd, msgs);
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__LISTA_CLIENTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaCliente()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				return basicSetOwnedByContenedorCrudClienteViewModel(null, msgs);
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__LISTA_CLIENTE:
				return ((InternalEList<?>)getListaCliente()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL, ContenedorCrudClienteViewModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				return getOwnedByContenedorCrudClienteViewModel();
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__LISTA_CLIENTE:
				return getListaCliente();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				setOwnedByContenedorCrudClienteViewModel((ContenedorCrudClienteViewModel)newValue);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__LISTA_CLIENTE:
				getListaCliente().clear();
				getListaCliente().addAll((Collection<? extends ClienteViewModel>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				setOwnedByContenedorCrudClienteViewModel((ContenedorCrudClienteViewModel)null);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__LISTA_CLIENTE:
				getListaCliente().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				return getOwnedByContenedorCrudClienteViewModel() != null;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__LISTA_CLIENTE:
				return listaCliente != null && !listaCliente.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContenedorMaestroClienteViewModelImpl
