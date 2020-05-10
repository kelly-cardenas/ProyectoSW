/**
 */
package sma.domain.automatizacionrevision.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sma.domain.Automovil;
import sma.domain.DomainPackage;

import sma.domain.automatizacionrevision.AutomatizacionrevisionPackage;
import sma.domain.automatizacionrevision.sensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.domain.automatizacionrevision.impl.sensorImpl#getOwnerBy <em>Owner By</em>}</li>
 *   <li>{@link sma.domain.automatizacionrevision.impl.sensorImpl#getId <em>Id</em>}</li>
 *   <li>{@link sma.domain.automatizacionrevision.impl.sensorImpl#getInfoComp <em>Info Comp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class sensorImpl extends EObjectImpl implements sensor {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInfoComp() <em>Info Comp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoComp()
	 * @generated
	 * @ordered
	 */
	protected static final String INFO_COMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInfoComp() <em>Info Comp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoComp()
	 * @generated
	 * @ordered
	 */
	protected String infoComp = INFO_COMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected sensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutomatizacionrevisionPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Automovil getOwnerBy() {
		if (eContainerFeatureID() != AutomatizacionrevisionPackage.SENSOR__OWNER_BY) return null;
		return (Automovil)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerBy(Automovil newOwnerBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerBy, AutomatizacionrevisionPackage.SENSOR__OWNER_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerBy(Automovil newOwnerBy) {
		if (newOwnerBy != eInternalContainer() || (eContainerFeatureID() != AutomatizacionrevisionPackage.SENSOR__OWNER_BY && newOwnerBy != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerBy != null)
				msgs = ((InternalEObject)newOwnerBy).eInverseAdd(this, DomainPackage.AUTOMOVIL__SENSOR, Automovil.class, msgs);
			msgs = basicSetOwnerBy(newOwnerBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutomatizacionrevisionPackage.SENSOR__OWNER_BY, newOwnerBy, newOwnerBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutomatizacionrevisionPackage.SENSOR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInfoComp() {
		return infoComp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfoComp(String newInfoComp) {
		String oldInfoComp = infoComp;
		infoComp = newInfoComp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutomatizacionrevisionPackage.SENSOR__INFO_COMP, oldInfoComp, infoComp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AutomatizacionrevisionPackage.SENSOR__OWNER_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerBy((Automovil)otherEnd, msgs);
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
			case AutomatizacionrevisionPackage.SENSOR__OWNER_BY:
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
			case AutomatizacionrevisionPackage.SENSOR__OWNER_BY:
				return eInternalContainer().eInverseRemove(this, DomainPackage.AUTOMOVIL__SENSOR, Automovil.class, msgs);
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
			case AutomatizacionrevisionPackage.SENSOR__OWNER_BY:
				return getOwnerBy();
			case AutomatizacionrevisionPackage.SENSOR__ID:
				return getId();
			case AutomatizacionrevisionPackage.SENSOR__INFO_COMP:
				return getInfoComp();
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
			case AutomatizacionrevisionPackage.SENSOR__OWNER_BY:
				setOwnerBy((Automovil)newValue);
				return;
			case AutomatizacionrevisionPackage.SENSOR__ID:
				setId((String)newValue);
				return;
			case AutomatizacionrevisionPackage.SENSOR__INFO_COMP:
				setInfoComp((String)newValue);
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
			case AutomatizacionrevisionPackage.SENSOR__OWNER_BY:
				setOwnerBy((Automovil)null);
				return;
			case AutomatizacionrevisionPackage.SENSOR__ID:
				setId(ID_EDEFAULT);
				return;
			case AutomatizacionrevisionPackage.SENSOR__INFO_COMP:
				setInfoComp(INFO_COMP_EDEFAULT);
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
			case AutomatizacionrevisionPackage.SENSOR__OWNER_BY:
				return getOwnerBy() != null;
			case AutomatizacionrevisionPackage.SENSOR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AutomatizacionrevisionPackage.SENSOR__INFO_COMP:
				return INFO_COMP_EDEFAULT == null ? infoComp != null : !INFO_COMP_EDEFAULT.equals(infoComp);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", infoComp: ");
		result.append(infoComp);
		result.append(')');
		return result.toString();
	}

} //sensorImpl
