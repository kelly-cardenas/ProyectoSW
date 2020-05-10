/**
 */
package sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl;

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

import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel;
import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorVehiculosRegistradosViewModel;
import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage;
import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Vehiculos Registrados View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorVehiculosRegistradosViewModelImpl#getOwnedByContenedorRegistroVehiculoViewModel <em>Owned By Contenedor Registro Vehiculo View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorVehiculosRegistradosViewModelImpl#getVehiculoViewModel <em>Vehiculo View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorVehiculosRegistradosViewModelImpl extends EObjectImpl implements ContenedorVehiculosRegistradosViewModel {
	/**
	 * The cached value of the '{@link #getVehiculoViewModel() <em>Vehiculo View Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehiculoViewModel()
	 * @generated
	 * @ordered
	 */
	protected EList<VehiculoViewModel> vehiculoViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorVehiculosRegistradosViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorregistrovehiculoviewmodelPackage.Literals.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroVehiculoViewModel getOwnedByContenedorRegistroVehiculoViewModel() {
		if (eContainerFeatureID() != ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL) return null;
		return (ContenedorRegistroVehiculoViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorRegistroVehiculoViewModel(ContenedorRegistroVehiculoViewModel newOwnedByContenedorRegistroVehiculoViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorRegistroVehiculoViewModel, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorRegistroVehiculoViewModel(ContenedorRegistroVehiculoViewModel newOwnedByContenedorRegistroVehiculoViewModel) {
		if (newOwnedByContenedorRegistroVehiculoViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL && newOwnedByContenedorRegistroVehiculoViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorRegistroVehiculoViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorRegistroVehiculoViewModel != null)
				msgs = ((InternalEObject)newOwnedByContenedorRegistroVehiculoViewModel).eInverseAdd(this, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL, ContenedorRegistroVehiculoViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorRegistroVehiculoViewModel(newOwnedByContenedorRegistroVehiculoViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL, newOwnedByContenedorRegistroVehiculoViewModel, newOwnedByContenedorRegistroVehiculoViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VehiculoViewModel> getVehiculoViewModel() {
		if (vehiculoViewModel == null) {
			vehiculoViewModel = new EObjectContainmentWithInverseEList<VehiculoViewModel>(VehiculoViewModel.class, this, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__VEHICULO_VIEW_MODEL, ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__THE0_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL);
		}
		return vehiculoViewModel;
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
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByContenedorRegistroVehiculoViewModel((ContenedorRegistroVehiculoViewModel)otherEnd, msgs);
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__VEHICULO_VIEW_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVehiculoViewModel()).basicAdd(otherEnd, msgs);
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
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL:
				return basicSetOwnedByContenedorRegistroVehiculoViewModel(null, msgs);
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__VEHICULO_VIEW_MODEL:
				return ((InternalEList<?>)getVehiculoViewModel()).basicRemove(otherEnd, msgs);
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
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL, ContenedorRegistroVehiculoViewModel.class, msgs);
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
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL:
				return getOwnedByContenedorRegistroVehiculoViewModel();
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__VEHICULO_VIEW_MODEL:
				return getVehiculoViewModel();
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
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL:
				setOwnedByContenedorRegistroVehiculoViewModel((ContenedorRegistroVehiculoViewModel)newValue);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__VEHICULO_VIEW_MODEL:
				getVehiculoViewModel().clear();
				getVehiculoViewModel().addAll((Collection<? extends VehiculoViewModel>)newValue);
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
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL:
				setOwnedByContenedorRegistroVehiculoViewModel((ContenedorRegistroVehiculoViewModel)null);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__VEHICULO_VIEW_MODEL:
				getVehiculoViewModel().clear();
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
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL:
				return getOwnedByContenedorRegistroVehiculoViewModel() != null;
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__VEHICULO_VIEW_MODEL:
				return vehiculoViewModel != null && !vehiculoViewModel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContenedorVehiculosRegistradosViewModelImpl
