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

import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel;
import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel;
import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Detalle Vehiculo View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorDetalleVehiculoViewModelImpl#getPropietario <em>Propietario</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorDetalleVehiculoViewModelImpl#getMarca <em>Marca</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorDetalleVehiculoViewModelImpl#getReferencia <em>Referencia</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorDetalleVehiculoViewModelImpl#getModelo <em>Modelo</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorDetalleVehiculoViewModelImpl#getTipovehiculo <em>Tipovehiculo</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorDetalleVehiculoViewModelImpl#getPlaca <em>Placa</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorDetalleVehiculoViewModelImpl#getOwnedByContenedorRegistroVehiculoViewModel <em>Owned By Contenedor Registro Vehiculo View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorDetalleVehiculoViewModelImpl extends EObjectImpl implements ContenedorDetalleVehiculoViewModel {
	/**
	 * The default value of the '{@link #getPropietario() <em>Propietario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropietario()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPIETARIO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getPropietario() <em>Propietario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropietario()
	 * @generated
	 * @ordered
	 */
	protected String propietario = PROPIETARIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarca() <em>Marca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarca()
	 * @generated
	 * @ordered
	 */
	protected static final String MARCA_EDEFAULT = " ";

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
	protected static final String REFERENCIA_EDEFAULT = " ";

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
	 * The default value of the '{@link #getModelo() <em>Modelo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelo()
	 * @generated
	 * @ordered
	 */
	protected static final String MODELO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getModelo() <em>Modelo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelo()
	 * @generated
	 * @ordered
	 */
	protected String modelo = MODELO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipovehiculo() <em>Tipovehiculo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipovehiculo()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPOVEHICULO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getTipovehiculo() <em>Tipovehiculo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipovehiculo()
	 * @generated
	 * @ordered
	 */
	protected String tipovehiculo = TIPOVEHICULO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlaca() <em>Placa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaca()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACA_EDEFAULT = " ";

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
	protected ContenedorDetalleVehiculoViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorregistrovehiculoviewmodelPackage.Literals.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropietario() {
		return propietario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropietario(String newPropietario) {
		String oldPropietario = propietario;
		propietario = newPropietario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__PROPIETARIO, oldPropietario, propietario));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__MARCA, oldMarca, marca));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__REFERENCIA, oldReferencia, referencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelo(String newModelo) {
		String oldModelo = modelo;
		modelo = newModelo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__MODELO, oldModelo, modelo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipovehiculo() {
		return tipovehiculo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipovehiculo(String newTipovehiculo) {
		String oldTipovehiculo = tipovehiculo;
		tipovehiculo = newTipovehiculo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__TIPOVEHICULO, oldTipovehiculo, tipovehiculo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__PLACA, oldPlaca, placa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroVehiculoViewModel getOwnedByContenedorRegistroVehiculoViewModel() {
		if (eContainerFeatureID() != ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL) return null;
		return (ContenedorRegistroVehiculoViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorRegistroVehiculoViewModel(ContenedorRegistroVehiculoViewModel newOwnedByContenedorRegistroVehiculoViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorRegistroVehiculoViewModel, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorRegistroVehiculoViewModel(ContenedorRegistroVehiculoViewModel newOwnedByContenedorRegistroVehiculoViewModel) {
		if (newOwnedByContenedorRegistroVehiculoViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL && newOwnedByContenedorRegistroVehiculoViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorRegistroVehiculoViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorRegistroVehiculoViewModel != null)
				msgs = ((InternalEObject)newOwnedByContenedorRegistroVehiculoViewModel).eInverseAdd(this, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL, ContenedorRegistroVehiculoViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorRegistroVehiculoViewModel(newOwnedByContenedorRegistroVehiculoViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL, newOwnedByContenedorRegistroVehiculoViewModel, newOwnedByContenedorRegistroVehiculoViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByContenedorRegistroVehiculoViewModel((ContenedorRegistroVehiculoViewModel)otherEnd, msgs);
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
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL:
				return basicSetOwnedByContenedorRegistroVehiculoViewModel(null, msgs);
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
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL, ContenedorRegistroVehiculoViewModel.class, msgs);
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
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__PROPIETARIO:
				return getPropietario();
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__MARCA:
				return getMarca();
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__REFERENCIA:
				return getReferencia();
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__MODELO:
				return getModelo();
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__TIPOVEHICULO:
				return getTipovehiculo();
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__PLACA:
				return getPlaca();
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL:
				return getOwnedByContenedorRegistroVehiculoViewModel();
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
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__PROPIETARIO:
				setPropietario((String)newValue);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__MARCA:
				setMarca((String)newValue);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__REFERENCIA:
				setReferencia((String)newValue);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__MODELO:
				setModelo((String)newValue);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__TIPOVEHICULO:
				setTipovehiculo((String)newValue);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__PLACA:
				setPlaca((String)newValue);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL:
				setOwnedByContenedorRegistroVehiculoViewModel((ContenedorRegistroVehiculoViewModel)newValue);
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
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__PROPIETARIO:
				setPropietario(PROPIETARIO_EDEFAULT);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__MARCA:
				setMarca(MARCA_EDEFAULT);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__REFERENCIA:
				setReferencia(REFERENCIA_EDEFAULT);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__MODELO:
				setModelo(MODELO_EDEFAULT);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__TIPOVEHICULO:
				setTipovehiculo(TIPOVEHICULO_EDEFAULT);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__PLACA:
				setPlaca(PLACA_EDEFAULT);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL:
				setOwnedByContenedorRegistroVehiculoViewModel((ContenedorRegistroVehiculoViewModel)null);
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
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__PROPIETARIO:
				return PROPIETARIO_EDEFAULT == null ? propietario != null : !PROPIETARIO_EDEFAULT.equals(propietario);
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__MARCA:
				return MARCA_EDEFAULT == null ? marca != null : !MARCA_EDEFAULT.equals(marca);
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__REFERENCIA:
				return REFERENCIA_EDEFAULT == null ? referencia != null : !REFERENCIA_EDEFAULT.equals(referencia);
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__MODELO:
				return MODELO_EDEFAULT == null ? modelo != null : !MODELO_EDEFAULT.equals(modelo);
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__TIPOVEHICULO:
				return TIPOVEHICULO_EDEFAULT == null ? tipovehiculo != null : !TIPOVEHICULO_EDEFAULT.equals(tipovehiculo);
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__PLACA:
				return PLACA_EDEFAULT == null ? placa != null : !PLACA_EDEFAULT.equals(placa);
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL:
				return getOwnedByContenedorRegistroVehiculoViewModel() != null;
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
		result.append(" (propietario: ");
		result.append(propietario);
		result.append(", marca: ");
		result.append(marca);
		result.append(", referencia: ");
		result.append(referencia);
		result.append(", modelo: ");
		result.append(modelo);
		result.append(", tipovehiculo: ");
		result.append(tipovehiculo);
		result.append(", placa: ");
		result.append(placa);
		result.append(')');
		return result.toString();
	}

} //ContenedorDetalleVehiculoViewModelImpl
