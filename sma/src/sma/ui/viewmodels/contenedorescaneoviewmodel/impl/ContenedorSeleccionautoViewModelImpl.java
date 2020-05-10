/**
 */
package sma.ui.viewmodels.contenedorescaneoviewmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel;
import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorSeleccionautoViewModel;
import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage;

import sma.ui.viewmodels.impl.ViewModelImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Seleccionauto View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorSeleccionautoViewModelImpl#getOwnedByContenedorEscaneoViewModel <em>Owned By Contenedor Escaneo View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorSeleccionautoViewModelImpl#getPlacavehiculo <em>Placavehiculo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorSeleccionautoViewModelImpl extends ViewModelImpl implements ContenedorSeleccionautoViewModel {
	/**
	 * The default value of the '{@link #getPlacavehiculo() <em>Placavehiculo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacavehiculo()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACAVEHICULO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getPlacavehiculo() <em>Placavehiculo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacavehiculo()
	 * @generated
	 * @ordered
	 */
	protected String placavehiculo = PLACAVEHICULO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorSeleccionautoViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorescaneoviewmodelPackage.Literals.CONTENEDOR_SELECCIONAUTO_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorEscaneoViewModel getOwnedByContenedorEscaneoViewModel() {
		if (eContainerFeatureID() != ContenedorescaneoviewmodelPackage.CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL) return null;
		return (ContenedorEscaneoViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorEscaneoViewModel(ContenedorEscaneoViewModel newOwnedByContenedorEscaneoViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorEscaneoViewModel, ContenedorescaneoviewmodelPackage.CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorEscaneoViewModel(ContenedorEscaneoViewModel newOwnedByContenedorEscaneoViewModel) {
		if (newOwnedByContenedorEscaneoViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorescaneoviewmodelPackage.CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL && newOwnedByContenedorEscaneoViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorEscaneoViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorEscaneoViewModel != null)
				msgs = ((InternalEObject)newOwnedByContenedorEscaneoViewModel).eInverseAdd(this, ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_SELECCIONAUTO_VIEW_MODEL, ContenedorEscaneoViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorEscaneoViewModel(newOwnedByContenedorEscaneoViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorescaneoviewmodelPackage.CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL, newOwnedByContenedorEscaneoViewModel, newOwnedByContenedorEscaneoViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlacavehiculo() {
		return placavehiculo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacavehiculo(String newPlacavehiculo) {
		String oldPlacavehiculo = placavehiculo;
		placavehiculo = newPlacavehiculo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorescaneoviewmodelPackage.CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__PLACAVEHICULO, oldPlacavehiculo, placavehiculo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByContenedorEscaneoViewModel((ContenedorEscaneoViewModel)otherEnd, msgs);
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL:
				return basicSetOwnedByContenedorEscaneoViewModel(null, msgs);
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_SELECCIONAUTO_VIEW_MODEL, ContenedorEscaneoViewModel.class, msgs);
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL:
				return getOwnedByContenedorEscaneoViewModel();
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__PLACAVEHICULO:
				return getPlacavehiculo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL:
				setOwnedByContenedorEscaneoViewModel((ContenedorEscaneoViewModel)newValue);
				return;
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__PLACAVEHICULO:
				setPlacavehiculo((String)newValue);
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL:
				setOwnedByContenedorEscaneoViewModel((ContenedorEscaneoViewModel)null);
				return;
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__PLACAVEHICULO:
				setPlacavehiculo(PLACAVEHICULO_EDEFAULT);
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL:
				return getOwnedByContenedorEscaneoViewModel() != null;
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__PLACAVEHICULO:
				return PLACAVEHICULO_EDEFAULT == null ? placavehiculo != null : !PLACAVEHICULO_EDEFAULT.equals(placavehiculo);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (placavehiculo: ");
		result.append(placavehiculo);
		result.append(')');
		return result.toString();
	}

} //ContenedorSeleccionautoViewModelImpl
