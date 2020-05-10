/**
 */
package sma.ui.viewmodels.contenedorcrudcmviewmodel.impl;

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

import sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorMaestroCMViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Maestro CM View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorMaestroCMViewModelImpl#getOwnedByContenedorCRUDCMViewModel <em>Owned By Contenedor CRUDCM View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorMaestroCMViewModelImpl#getListaCentroMant <em>Lista Centro Mant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorMaestroCMViewModelImpl extends EObjectImpl implements ContenedorMaestroCMViewModel {
	/**
	 * The cached value of the '{@link #getListaCentroMant() <em>Lista Centro Mant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaCentroMant()
	 * @generated
	 * @ordered
	 */
	protected EList<CentroMantViewModel> listaCentroMant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorMaestroCMViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudcmviewmodelPackage.Literals.CONTENEDOR_MAESTRO_CM_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCRUDCMViewModel getOwnedByContenedorCRUDCMViewModel() {
		if (eContainerFeatureID() != ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL) return null;
		return (ContenedorCRUDCMViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorCRUDCMViewModel(ContenedorCRUDCMViewModel newOwnedByContenedorCRUDCMViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorCRUDCMViewModel, ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorCRUDCMViewModel(ContenedorCRUDCMViewModel newOwnedByContenedorCRUDCMViewModel) {
		if (newOwnedByContenedorCRUDCMViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL && newOwnedByContenedorCRUDCMViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorCRUDCMViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorCRUDCMViewModel != null)
				msgs = ((InternalEObject)newOwnedByContenedorCRUDCMViewModel).eInverseAdd(this, ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CM_VIEW_MODEL, ContenedorCRUDCMViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorCRUDCMViewModel(newOwnedByContenedorCRUDCMViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL, newOwnedByContenedorCRUDCMViewModel, newOwnedByContenedorCRUDCMViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CentroMantViewModel> getListaCentroMant() {
		if (listaCentroMant == null) {
			listaCentroMant = new EObjectContainmentWithInverseEList<CentroMantViewModel>(CentroMantViewModel.class, this, ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL__LISTA_CENTRO_MANT, ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CM_VIEW_MODEL);
		}
		return listaCentroMant;
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByContenedorCRUDCMViewModel((ContenedorCRUDCMViewModel)otherEnd, msgs);
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL__LISTA_CENTRO_MANT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaCentroMant()).basicAdd(otherEnd, msgs);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL:
				return basicSetOwnedByContenedorCRUDCMViewModel(null, msgs);
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL__LISTA_CENTRO_MANT:
				return ((InternalEList<?>)getListaCentroMant()).basicRemove(otherEnd, msgs);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CM_VIEW_MODEL, ContenedorCRUDCMViewModel.class, msgs);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL:
				return getOwnedByContenedorCRUDCMViewModel();
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL__LISTA_CENTRO_MANT:
				return getListaCentroMant();
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL:
				setOwnedByContenedorCRUDCMViewModel((ContenedorCRUDCMViewModel)newValue);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL__LISTA_CENTRO_MANT:
				getListaCentroMant().clear();
				getListaCentroMant().addAll((Collection<? extends CentroMantViewModel>)newValue);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL:
				setOwnedByContenedorCRUDCMViewModel((ContenedorCRUDCMViewModel)null);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL__LISTA_CENTRO_MANT:
				getListaCentroMant().clear();
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL:
				return getOwnedByContenedorCRUDCMViewModel() != null;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL__LISTA_CENTRO_MANT:
				return listaCentroMant != null && !listaCentroMant.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContenedorMaestroCMViewModelImpl
