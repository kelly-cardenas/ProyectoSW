/**
 */
package sma.domain.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import sma.domain.CentroMant;
import sma.domain.DomainPackage;
import sma.domain.UbicacionCM;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ubicacion CM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.domain.impl.UbicacionCMImpl#getPais <em>Pais</em>}</li>
 *   <li>{@link sma.domain.impl.UbicacionCMImpl#getDepartamento <em>Departamento</em>}</li>
 *   <li>{@link sma.domain.impl.UbicacionCMImpl#getCiudad <em>Ciudad</em>}</li>
 *   <li>{@link sma.domain.impl.UbicacionCMImpl#getDireccion <em>Direccion</em>}</li>
 *   <li>{@link sma.domain.impl.UbicacionCMImpl#getOwnedBy <em>Owned By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UbicacionCMImpl extends EObjectImpl implements UbicacionCM {
	/**
	 * The default value of the '{@link #getPais() <em>Pais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPais()
	 * @generated
	 * @ordered
	 */
	protected static final String PAIS_EDEFAULT = null;

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
	protected static final String DEPARTAMENTO_EDEFAULT = null;

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
	protected static final String CIUDAD_EDEFAULT = null;

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
	protected static final String DIRECCION_EDEFAULT = null;

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
	 * The cached value of the '{@link #getOwnedBy() <em>Owned By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBy()
	 * @generated
	 * @ordered
	 */
	protected CentroMant ownedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UbicacionCMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.UBICACION_CM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.UBICACION_CM__PAIS, oldPais, pais));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.UBICACION_CM__DEPARTAMENTO, oldDepartamento, departamento));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.UBICACION_CM__CIUDAD, oldCiudad, ciudad));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.UBICACION_CM__DIRECCION, oldDireccion, direccion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentroMant getOwnedBy() {
		if (ownedBy != null && ownedBy.eIsProxy()) {
			InternalEObject oldOwnedBy = (InternalEObject)ownedBy;
			ownedBy = (CentroMant)eResolveProxy(oldOwnedBy);
			if (ownedBy != oldOwnedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.UBICACION_CM__OWNED_BY, oldOwnedBy, ownedBy));
			}
		}
		return ownedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentroMant basicGetOwnedBy() {
		return ownedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedBy(CentroMant newOwnedBy, NotificationChain msgs) {
		CentroMant oldOwnedBy = ownedBy;
		ownedBy = newOwnedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.UBICACION_CM__OWNED_BY, oldOwnedBy, newOwnedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedBy(CentroMant newOwnedBy) {
		if (newOwnedBy != ownedBy) {
			NotificationChain msgs = null;
			if (ownedBy != null)
				msgs = ((InternalEObject)ownedBy).eInverseRemove(this, DomainPackage.CENTRO_MANT__UBICACION, CentroMant.class, msgs);
			if (newOwnedBy != null)
				msgs = ((InternalEObject)newOwnedBy).eInverseAdd(this, DomainPackage.CENTRO_MANT__UBICACION, CentroMant.class, msgs);
			msgs = basicSetOwnedBy(newOwnedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.UBICACION_CM__OWNED_BY, newOwnedBy, newOwnedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.UBICACION_CM__OWNED_BY:
				if (ownedBy != null)
					msgs = ((InternalEObject)ownedBy).eInverseRemove(this, DomainPackage.CENTRO_MANT__UBICACION, CentroMant.class, msgs);
				return basicSetOwnedBy((CentroMant)otherEnd, msgs);
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
			case DomainPackage.UBICACION_CM__OWNED_BY:
				return basicSetOwnedBy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.UBICACION_CM__PAIS:
				return getPais();
			case DomainPackage.UBICACION_CM__DEPARTAMENTO:
				return getDepartamento();
			case DomainPackage.UBICACION_CM__CIUDAD:
				return getCiudad();
			case DomainPackage.UBICACION_CM__DIRECCION:
				return getDireccion();
			case DomainPackage.UBICACION_CM__OWNED_BY:
				if (resolve) return getOwnedBy();
				return basicGetOwnedBy();
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
			case DomainPackage.UBICACION_CM__PAIS:
				setPais((String)newValue);
				return;
			case DomainPackage.UBICACION_CM__DEPARTAMENTO:
				setDepartamento((String)newValue);
				return;
			case DomainPackage.UBICACION_CM__CIUDAD:
				setCiudad((String)newValue);
				return;
			case DomainPackage.UBICACION_CM__DIRECCION:
				setDireccion((String)newValue);
				return;
			case DomainPackage.UBICACION_CM__OWNED_BY:
				setOwnedBy((CentroMant)newValue);
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
			case DomainPackage.UBICACION_CM__PAIS:
				setPais(PAIS_EDEFAULT);
				return;
			case DomainPackage.UBICACION_CM__DEPARTAMENTO:
				setDepartamento(DEPARTAMENTO_EDEFAULT);
				return;
			case DomainPackage.UBICACION_CM__CIUDAD:
				setCiudad(CIUDAD_EDEFAULT);
				return;
			case DomainPackage.UBICACION_CM__DIRECCION:
				setDireccion(DIRECCION_EDEFAULT);
				return;
			case DomainPackage.UBICACION_CM__OWNED_BY:
				setOwnedBy((CentroMant)null);
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
			case DomainPackage.UBICACION_CM__PAIS:
				return PAIS_EDEFAULT == null ? pais != null : !PAIS_EDEFAULT.equals(pais);
			case DomainPackage.UBICACION_CM__DEPARTAMENTO:
				return DEPARTAMENTO_EDEFAULT == null ? departamento != null : !DEPARTAMENTO_EDEFAULT.equals(departamento);
			case DomainPackage.UBICACION_CM__CIUDAD:
				return CIUDAD_EDEFAULT == null ? ciudad != null : !CIUDAD_EDEFAULT.equals(ciudad);
			case DomainPackage.UBICACION_CM__DIRECCION:
				return DIRECCION_EDEFAULT == null ? direccion != null : !DIRECCION_EDEFAULT.equals(direccion);
			case DomainPackage.UBICACION_CM__OWNED_BY:
				return ownedBy != null;
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

} //UbicacionCMImpl
