/**
 */
package sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorVehiculosRegistradosViewModel;
import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage;
import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehiculo View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.VehiculoViewModelImpl#getThe0ContenedorVehiculosRegistradosViewModel <em>The0 Contenedor Vehiculos Registrados View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.VehiculoViewModelImpl#getMarca <em>Marca</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.VehiculoViewModelImpl#getReferencia <em>Referencia</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.VehiculoViewModelImpl#getPlaca <em>Placa</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehiculoViewModelImpl extends EObjectImpl implements VehiculoViewModel {
	/**
	 * The default value of the '{@link #getMarca() <em>Marca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarca()
	 * @generated
	 * @ordered
	 */
	protected static final String MARCA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarca() <em>Marca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarca()
	 * @generated
	 * @ordered
	 */
	protected String marca = MARCA_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferencia() <em>Referencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencia()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferencia() <em>Referencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencia()
	 * @generated
	 * @ordered
	 */
	protected String referencia = REFERENCIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlaca() <em>Placa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaca()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaca() <em>Placa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaca()
	 * @generated
	 * @ordered
	 */
	protected String placa = PLACA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehiculoViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorregistrovehiculoviewmodelPackage.Literals.VEHICULO_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorVehiculosRegistradosViewModel getThe0ContenedorVehiculosRegistradosViewModel() {
		if (eContainerFeatureID() != ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__THE0_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL) return null;
		return (ContenedorVehiculosRegistradosViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThe0ContenedorVehiculosRegistradosViewModel(ContenedorVehiculosRegistradosViewModel newThe0ContenedorVehiculosRegistradosViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newThe0ContenedorVehiculosRegistradosViewModel, ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__THE0_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThe0ContenedorVehiculosRegistradosViewModel(ContenedorVehiculosRegistradosViewModel newThe0ContenedorVehiculosRegistradosViewModel) {
		if (newThe0ContenedorVehiculosRegistradosViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__THE0_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL && newThe0ContenedorVehiculosRegistradosViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newThe0ContenedorVehiculosRegistradosViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newThe0ContenedorVehiculosRegistradosViewModel != null)
				msgs = ((InternalEObject)newThe0ContenedorVehiculosRegistradosViewModel).eInverseAdd(this, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__VEHICULO_VIEW_MODEL, ContenedorVehiculosRegistradosViewModel.class, msgs);
			msgs = basicSetThe0ContenedorVehiculosRegistradosViewModel(newThe0ContenedorVehiculosRegistradosViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__THE0_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL, newThe0ContenedorVehiculosRegistradosViewModel, newThe0ContenedorVehiculosRegistradosViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarca(String newMarca) {
		String oldMarca = marca;
		marca = newMarca;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__MARCA, oldMarca, marca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferencia() {
		return referencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencia(String newReferencia) {
		String oldReferencia = referencia;
		referencia = newReferencia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__REFERENCIA, oldReferencia, referencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaca(String newPlaca) {
		String oldPlaca = placa;
		placa = newPlaca;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__PLACA, oldPlaca, placa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__THE0_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetThe0ContenedorVehiculosRegistradosViewModel((ContenedorVehiculosRegistradosViewModel)otherEnd, msgs);
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
			case ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__THE0_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL:
				return basicSetThe0ContenedorVehiculosRegistradosViewModel(null, msgs);
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
			case ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__THE0_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__VEHICULO_VIEW_MODEL, ContenedorVehiculosRegistradosViewModel.class, msgs);
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
			case ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__THE0_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL:
				return getThe0ContenedorVehiculosRegistradosViewModel();
			case ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__MARCA:
				return getMarca();
			case ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__REFERENCIA:
				return getReferencia();
			case ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__PLACA:
				return getPlaca();
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
			case ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__THE0_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL:
				setThe0ContenedorVehiculosRegistradosViewModel((ContenedorVehiculosRegistradosViewModel)newValue);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__MARCA:
				setMarca((String)newValue);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__REFERENCIA:
				setReferencia((String)newValue);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__PLACA:
				setPlaca((String)newValue);
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
			case ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__THE0_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL:
				setThe0ContenedorVehiculosRegistradosViewModel((ContenedorVehiculosRegistradosViewModel)null);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__MARCA:
				setMarca(MARCA_EDEFAULT);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__REFERENCIA:
				setReferencia(REFERENCIA_EDEFAULT);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__PLACA:
				setPlaca(PLACA_EDEFAULT);
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
			case ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__THE0_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL:
				return getThe0ContenedorVehiculosRegistradosViewModel() != null;
			case ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__MARCA:
				return MARCA_EDEFAULT == null ? marca != null : !MARCA_EDEFAULT.equals(marca);
			case ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__REFERENCIA:
				return REFERENCIA_EDEFAULT == null ? referencia != null : !REFERENCIA_EDEFAULT.equals(referencia);
			case ContenedorregistrovehiculoviewmodelPackage.VEHICULO_VIEW_MODEL__PLACA:
				return PLACA_EDEFAULT == null ? placa != null : !PLACA_EDEFAULT.equals(placa);
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
		result.append(" (marca: ");
		result.append(marca);
		result.append(", referencia: ");
		result.append(referencia);
		result.append(", placa: ");
		result.append(placa);
		result.append(')');
		return result.toString();
	}

} //VehiculoViewModelImpl
