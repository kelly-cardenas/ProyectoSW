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
 *   <li>{@link sma.domain.automatizacionrevision.impl.sensorImpl#getIndiceEmisionGases <em>Indice Emision Gases</em>}</li>
 *   <li>{@link sma.domain.automatizacionrevision.impl.sensorImpl#getImpacto <em>Impacto</em>}</li>
 *   <li>{@link sma.domain.automatizacionrevision.impl.sensorImpl#getIndiceGasesOfensivos <em>Indice Gases Ofensivos</em>}</li>
 *   <li>{@link sma.domain.automatizacionrevision.impl.sensorImpl#getIndiceGasesNocivos <em>Indice Gases Nocivos</em>}</li>
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
	protected static final String ID_EDEFAULT = " ";

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
	protected static final String INFO_COMP_EDEFAULT = " ";

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
	 * The default value of the '{@link #getIndiceEmisionGases() <em>Indice Emision Gases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndiceEmisionGases()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INDICE_EMISION_GASES_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getIndiceEmisionGases() <em>Indice Emision Gases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndiceEmisionGases()
	 * @generated
	 * @ordered
	 */
	protected Integer indiceEmisionGases = INDICE_EMISION_GASES_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpacto() <em>Impacto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpacto()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IMPACTO_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getImpacto() <em>Impacto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpacto()
	 * @generated
	 * @ordered
	 */
	protected Integer impacto = IMPACTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndiceGasesOfensivos() <em>Indice Gases Ofensivos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndiceGasesOfensivos()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INDICE_GASES_OFENSIVOS_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getIndiceGasesOfensivos() <em>Indice Gases Ofensivos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndiceGasesOfensivos()
	 * @generated
	 * @ordered
	 */
	protected Integer indiceGasesOfensivos = INDICE_GASES_OFENSIVOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndiceGasesNocivos() <em>Indice Gases Nocivos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndiceGasesNocivos()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INDICE_GASES_NOCIVOS_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getIndiceGasesNocivos() <em>Indice Gases Nocivos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndiceGasesNocivos()
	 * @generated
	 * @ordered
	 */
	protected Integer indiceGasesNocivos = INDICE_GASES_NOCIVOS_EDEFAULT;

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
	public Integer getIndiceEmisionGases() {
		return indiceEmisionGases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndiceEmisionGases(Integer newIndiceEmisionGases) {
		Integer oldIndiceEmisionGases = indiceEmisionGases;
		indiceEmisionGases = newIndiceEmisionGases;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutomatizacionrevisionPackage.SENSOR__INDICE_EMISION_GASES, oldIndiceEmisionGases, indiceEmisionGases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getImpacto() {
		return impacto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpacto(Integer newImpacto) {
		Integer oldImpacto = impacto;
		impacto = newImpacto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutomatizacionrevisionPackage.SENSOR__IMPACTO, oldImpacto, impacto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIndiceGasesOfensivos() {
		return indiceGasesOfensivos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndiceGasesOfensivos(Integer newIndiceGasesOfensivos) {
		Integer oldIndiceGasesOfensivos = indiceGasesOfensivos;
		indiceGasesOfensivos = newIndiceGasesOfensivos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutomatizacionrevisionPackage.SENSOR__INDICE_GASES_OFENSIVOS, oldIndiceGasesOfensivos, indiceGasesOfensivos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIndiceGasesNocivos() {
		return indiceGasesNocivos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndiceGasesNocivos(Integer newIndiceGasesNocivos) {
		Integer oldIndiceGasesNocivos = indiceGasesNocivos;
		indiceGasesNocivos = newIndiceGasesNocivos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutomatizacionrevisionPackage.SENSOR__INDICE_GASES_NOCIVOS, oldIndiceGasesNocivos, indiceGasesNocivos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ActualizarIndiceGases() {
			setIndiceGasesNocivos((int)Math.random()*600+50);
				setIndiceGasesOfensivos((int)Math.random()*600 + 50);
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
			case AutomatizacionrevisionPackage.SENSOR__INDICE_EMISION_GASES:
				return getIndiceEmisionGases();
			case AutomatizacionrevisionPackage.SENSOR__IMPACTO:
				return getImpacto();
			case AutomatizacionrevisionPackage.SENSOR__INDICE_GASES_OFENSIVOS:
				return getIndiceGasesOfensivos();
			case AutomatizacionrevisionPackage.SENSOR__INDICE_GASES_NOCIVOS:
				return getIndiceGasesNocivos();
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
			case AutomatizacionrevisionPackage.SENSOR__INDICE_EMISION_GASES:
				setIndiceEmisionGases((Integer)newValue);
				return;
			case AutomatizacionrevisionPackage.SENSOR__IMPACTO:
				setImpacto((Integer)newValue);
				return;
			case AutomatizacionrevisionPackage.SENSOR__INDICE_GASES_OFENSIVOS:
				setIndiceGasesOfensivos((Integer)newValue);
				return;
			case AutomatizacionrevisionPackage.SENSOR__INDICE_GASES_NOCIVOS:
				setIndiceGasesNocivos((Integer)newValue);
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
			case AutomatizacionrevisionPackage.SENSOR__INDICE_EMISION_GASES:
				setIndiceEmisionGases(INDICE_EMISION_GASES_EDEFAULT);
				return;
			case AutomatizacionrevisionPackage.SENSOR__IMPACTO:
				setImpacto(IMPACTO_EDEFAULT);
				return;
			case AutomatizacionrevisionPackage.SENSOR__INDICE_GASES_OFENSIVOS:
				setIndiceGasesOfensivos(INDICE_GASES_OFENSIVOS_EDEFAULT);
				return;
			case AutomatizacionrevisionPackage.SENSOR__INDICE_GASES_NOCIVOS:
				setIndiceGasesNocivos(INDICE_GASES_NOCIVOS_EDEFAULT);
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
			case AutomatizacionrevisionPackage.SENSOR__INDICE_EMISION_GASES:
				return INDICE_EMISION_GASES_EDEFAULT == null ? indiceEmisionGases != null : !INDICE_EMISION_GASES_EDEFAULT.equals(indiceEmisionGases);
			case AutomatizacionrevisionPackage.SENSOR__IMPACTO:
				return IMPACTO_EDEFAULT == null ? impacto != null : !IMPACTO_EDEFAULT.equals(impacto);
			case AutomatizacionrevisionPackage.SENSOR__INDICE_GASES_OFENSIVOS:
				return INDICE_GASES_OFENSIVOS_EDEFAULT == null ? indiceGasesOfensivos != null : !INDICE_GASES_OFENSIVOS_EDEFAULT.equals(indiceGasesOfensivos);
			case AutomatizacionrevisionPackage.SENSOR__INDICE_GASES_NOCIVOS:
				return INDICE_GASES_NOCIVOS_EDEFAULT == null ? indiceGasesNocivos != null : !INDICE_GASES_NOCIVOS_EDEFAULT.equals(indiceGasesNocivos);
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
		result.append(", indiceEmisionGases: ");
		result.append(indiceEmisionGases);
		result.append(", impacto: ");
		result.append(impacto);
		result.append(", indiceGasesOfensivos: ");
		result.append(indiceGasesOfensivos);
		result.append(", indiceGasesNocivos: ");
		result.append(indiceGasesNocivos);
		result.append(')');
		return result.toString();
	}

} //sensorImpl
