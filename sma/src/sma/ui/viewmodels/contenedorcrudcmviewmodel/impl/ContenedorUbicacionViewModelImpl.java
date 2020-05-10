/**
 */
package sma.ui.viewmodels.contenedorcrudcmviewmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Ubicacion View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorUbicacionViewModelImpl#getOwnedByContenedorDetalleCMViewModel <em>Owned By Contenedor Detalle CM View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorUbicacionViewModelImpl#getPais <em>Pais</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorUbicacionViewModelImpl#getDepartamento <em>Departamento</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorUbicacionViewModelImpl#getCiudad <em>Ciudad</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorUbicacionViewModelImpl#getDireccion <em>Direccion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorUbicacionViewModelImpl extends EObjectImpl implements ContenedorUbicacionViewModel {
	/**
	 * The default value of the '{@link #getPais() <em>Pais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPais()
	 * @generated
	 * @ordered
	 */
	protected static final String PAIS_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getPais() <em>Pais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPais()
	 * @generated
	 * @ordered
	 */
	protected String pais = PAIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepartamento() <em>Departamento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartamento()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPARTAMENTO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getDepartamento() <em>Departamento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartamento()
	 * @generated
	 * @ordered
	 */
	protected String departamento = DEPARTAMENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCiudad() <em>Ciudad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCiudad()
	 * @generated
	 * @ordered
	 */
	protected static final String CIUDAD_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getCiudad() <em>Ciudad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCiudad()
	 * @generated
	 * @ordered
	 */
	protected String ciudad = CIUDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDireccion() <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDireccion()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECCION_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getDireccion() <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDireccion()
	 * @generated
	 * @ordered
	 */
	protected String direccion = DIRECCION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorUbicacionViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudcmviewmodelPackage.Literals.CONTENEDOR_UBICACION_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDetalleCMViewModel getOwnedByContenedorDetalleCMViewModel() {
		if (eContainerFeatureID() != ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL) return null;
		return (ContenedorDetalleCMViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorDetalleCMViewModel(ContenedorDetalleCMViewModel newOwnedByContenedorDetalleCMViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorDetalleCMViewModel, ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorDetalleCMViewModel(ContenedorDetalleCMViewModel newOwnedByContenedorDetalleCMViewModel) {
		if (newOwnedByContenedorDetalleCMViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL && newOwnedByContenedorDetalleCMViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorDetalleCMViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorDetalleCMViewModel != null)
				msgs = ((InternalEObject)newOwnedByContenedorDetalleCMViewModel).eInverseAdd(this, ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACION_VIEW_MODEL, ContenedorDetalleCMViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorDetalleCMViewModel(newOwnedByContenedorDetalleCMViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL, newOwnedByContenedorDetalleCMViewModel, newOwnedByContenedorDetalleCMViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPais(String newPais) {
		String oldPais = pais;
		pais = newPais;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__PAIS, oldPais, pais));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDepartamento() {
		return departamento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartamento(String newDepartamento) {
		String oldDepartamento = departamento;
		departamento = newDepartamento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__DEPARTAMENTO, oldDepartamento, departamento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCiudad(String newCiudad) {
		String oldCiudad = ciudad;
		ciudad = newCiudad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__CIUDAD, oldCiudad, ciudad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDireccion(String newDireccion) {
		String oldDireccion = direccion;
		direccion = newDireccion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__DIRECCION, oldDireccion, direccion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByContenedorDetalleCMViewModel((ContenedorDetalleCMViewModel)otherEnd, msgs);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL:
				return basicSetOwnedByContenedorDetalleCMViewModel(null, msgs);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACION_VIEW_MODEL, ContenedorDetalleCMViewModel.class, msgs);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL:
				return getOwnedByContenedorDetalleCMViewModel();
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__PAIS:
				return getPais();
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__DEPARTAMENTO:
				return getDepartamento();
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__CIUDAD:
				return getCiudad();
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__DIRECCION:
				return getDireccion();
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL:
				setOwnedByContenedorDetalleCMViewModel((ContenedorDetalleCMViewModel)newValue);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__PAIS:
				setPais((String)newValue);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__DEPARTAMENTO:
				setDepartamento((String)newValue);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__CIUDAD:
				setCiudad((String)newValue);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__DIRECCION:
				setDireccion((String)newValue);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL:
				setOwnedByContenedorDetalleCMViewModel((ContenedorDetalleCMViewModel)null);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__PAIS:
				setPais(PAIS_EDEFAULT);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__DEPARTAMENTO:
				setDepartamento(DEPARTAMENTO_EDEFAULT);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__CIUDAD:
				setCiudad(CIUDAD_EDEFAULT);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__DIRECCION:
				setDireccion(DIRECCION_EDEFAULT);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL:
				return getOwnedByContenedorDetalleCMViewModel() != null;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__PAIS:
				return PAIS_EDEFAULT == null ? pais != null : !PAIS_EDEFAULT.equals(pais);
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__DEPARTAMENTO:
				return DEPARTAMENTO_EDEFAULT == null ? departamento != null : !DEPARTAMENTO_EDEFAULT.equals(departamento);
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__CIUDAD:
				return CIUDAD_EDEFAULT == null ? ciudad != null : !CIUDAD_EDEFAULT.equals(ciudad);
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__DIRECCION:
				return DIRECCION_EDEFAULT == null ? direccion != null : !DIRECCION_EDEFAULT.equals(direccion);
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
		result.append(" (pais: ");
		result.append(pais);
		result.append(", departamento: ");
		result.append(departamento);
		result.append(", ciudad: ");
		result.append(ciudad);
		result.append(", direccion: ");
		result.append(direccion);
		result.append(')');
		return result.toString();
	}

} //ContenedorUbicacionViewModelImpl
