/**
 */
package sma.domain.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sma.domain.DomainPackage;
import sma.domain.UbicacionUsu;
import sma.domain.Usuario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ubicacion Usu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.domain.impl.UbicacionUsuImpl#getPais <em>Pais</em>}</li>
 *   <li>{@link sma.domain.impl.UbicacionUsuImpl#getDepartamento <em>Departamento</em>}</li>
 *   <li>{@link sma.domain.impl.UbicacionUsuImpl#getCiudad <em>Ciudad</em>}</li>
 *   <li>{@link sma.domain.impl.UbicacionUsuImpl#getOwnerBy <em>Owner By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UbicacionUsuImpl extends EObjectImpl implements UbicacionUsu {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UbicacionUsuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.UBICACION_USU;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.UBICACION_USU__PAIS, oldPais, pais));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.UBICACION_USU__DEPARTAMENTO, oldDepartamento, departamento));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.UBICACION_USU__CIUDAD, oldCiudad, ciudad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usuario getOwnerBy() {
		if (eContainerFeatureID() != DomainPackage.UBICACION_USU__OWNER_BY) return null;
		return (Usuario)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerBy(Usuario newOwnerBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerBy, DomainPackage.UBICACION_USU__OWNER_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerBy(Usuario newOwnerBy) {
		if (newOwnerBy != eInternalContainer() || (eContainerFeatureID() != DomainPackage.UBICACION_USU__OWNER_BY && newOwnerBy != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerBy != null)
				msgs = ((InternalEObject)newOwnerBy).eInverseAdd(this, DomainPackage.USUARIO__UBICACION, Usuario.class, msgs);
			msgs = basicSetOwnerBy(newOwnerBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.UBICACION_USU__OWNER_BY, newOwnerBy, newOwnerBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.UBICACION_USU__OWNER_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerBy((Usuario)otherEnd, msgs);
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
			case DomainPackage.UBICACION_USU__OWNER_BY:
				return basicSetOwnerBy(null, msgs);
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
			case DomainPackage.UBICACION_USU__OWNER_BY:
				return eInternalContainer().eInverseRemove(this, DomainPackage.USUARIO__UBICACION, Usuario.class, msgs);
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
			case DomainPackage.UBICACION_USU__PAIS:
				return getPais();
			case DomainPackage.UBICACION_USU__DEPARTAMENTO:
				return getDepartamento();
			case DomainPackage.UBICACION_USU__CIUDAD:
				return getCiudad();
			case DomainPackage.UBICACION_USU__OWNER_BY:
				return getOwnerBy();
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
			case DomainPackage.UBICACION_USU__PAIS:
				setPais((String)newValue);
				return;
			case DomainPackage.UBICACION_USU__DEPARTAMENTO:
				setDepartamento((String)newValue);
				return;
			case DomainPackage.UBICACION_USU__CIUDAD:
				setCiudad((String)newValue);
				return;
			case DomainPackage.UBICACION_USU__OWNER_BY:
				setOwnerBy((Usuario)newValue);
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
			case DomainPackage.UBICACION_USU__PAIS:
				setPais(PAIS_EDEFAULT);
				return;
			case DomainPackage.UBICACION_USU__DEPARTAMENTO:
				setDepartamento(DEPARTAMENTO_EDEFAULT);
				return;
			case DomainPackage.UBICACION_USU__CIUDAD:
				setCiudad(CIUDAD_EDEFAULT);
				return;
			case DomainPackage.UBICACION_USU__OWNER_BY:
				setOwnerBy((Usuario)null);
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
			case DomainPackage.UBICACION_USU__PAIS:
				return PAIS_EDEFAULT == null ? pais != null : !PAIS_EDEFAULT.equals(pais);
			case DomainPackage.UBICACION_USU__DEPARTAMENTO:
				return DEPARTAMENTO_EDEFAULT == null ? departamento != null : !DEPARTAMENTO_EDEFAULT.equals(departamento);
			case DomainPackage.UBICACION_USU__CIUDAD:
				return CIUDAD_EDEFAULT == null ? ciudad != null : !CIUDAD_EDEFAULT.equals(ciudad);
			case DomainPackage.UBICACION_USU__OWNER_BY:
				return getOwnerBy() != null;
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
		result.append(')');
		return result.toString();
	}

} //UbicacionUsuImpl
