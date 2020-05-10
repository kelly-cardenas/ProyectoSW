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
import sma.domain.automatizacionrevision.FallaMecanica;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Falla Mecanica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.domain.automatizacionrevision.impl.FallaMecanicaImpl#getPiesaAveriada <em>Piesa Averiada</em>}</li>
 *   <li>{@link sma.domain.automatizacionrevision.impl.FallaMecanicaImpl#getGravedad <em>Gravedad</em>}</li>
 *   <li>{@link sma.domain.automatizacionrevision.impl.FallaMecanicaImpl#getOrigen <em>Origen</em>}</li>
 *   <li>{@link sma.domain.automatizacionrevision.impl.FallaMecanicaImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link sma.domain.automatizacionrevision.impl.FallaMecanicaImpl#getTheAutomovil <em>The Automovil</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FallaMecanicaImpl extends EObjectImpl implements FallaMecanica {
	/**
	 * The default value of the '{@link #getPiesaAveriada() <em>Piesa Averiada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPiesaAveriada()
	 * @generated
	 * @ordered
	 */
	protected static final String PIESA_AVERIADA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPiesaAveriada() <em>Piesa Averiada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPiesaAveriada()
	 * @generated
	 * @ordered
	 */
	protected String piesaAveriada = PIESA_AVERIADA_EDEFAULT;

	/**
	 * The default value of the '{@link #getGravedad() <em>Gravedad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravedad()
	 * @generated
	 * @ordered
	 */
	protected static final String GRAVEDAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGravedad() <em>Gravedad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravedad()
	 * @generated
	 * @ordered
	 */
	protected String gravedad = GRAVEDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrigen() <em>Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrigen() <em>Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected String origen = ORIGEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FallaMecanicaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AutomatizacionrevisionPackage.Literals.FALLA_MECANICA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPiesaAveriada() {
		return piesaAveriada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPiesaAveriada(String newPiesaAveriada) {
		String oldPiesaAveriada = piesaAveriada;
		piesaAveriada = newPiesaAveriada;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutomatizacionrevisionPackage.FALLA_MECANICA__PIESA_AVERIADA, oldPiesaAveriada, piesaAveriada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGravedad() {
		return gravedad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGravedad(String newGravedad) {
		String oldGravedad = gravedad;
		gravedad = newGravedad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutomatizacionrevisionPackage.FALLA_MECANICA__GRAVEDAD, oldGravedad, gravedad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigen(String newOrigen) {
		String oldOrigen = origen;
		origen = newOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutomatizacionrevisionPackage.FALLA_MECANICA__ORIGEN, oldOrigen, origen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutomatizacionrevisionPackage.FALLA_MECANICA__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Automovil getTheAutomovil() {
		if (eContainerFeatureID() != AutomatizacionrevisionPackage.FALLA_MECANICA__THE_AUTOMOVIL) return null;
		return (Automovil)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheAutomovil(Automovil newTheAutomovil, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheAutomovil, AutomatizacionrevisionPackage.FALLA_MECANICA__THE_AUTOMOVIL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheAutomovil(Automovil newTheAutomovil) {
		if (newTheAutomovil != eInternalContainer() || (eContainerFeatureID() != AutomatizacionrevisionPackage.FALLA_MECANICA__THE_AUTOMOVIL && newTheAutomovil != null)) {
			if (EcoreUtil.isAncestor(this, newTheAutomovil))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheAutomovil != null)
				msgs = ((InternalEObject)newTheAutomovil).eInverseAdd(this, DomainPackage.AUTOMOVIL__LISTA_DE_FALLAS, Automovil.class, msgs);
			msgs = basicSetTheAutomovil(newTheAutomovil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AutomatizacionrevisionPackage.FALLA_MECANICA__THE_AUTOMOVIL, newTheAutomovil, newTheAutomovil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AutomatizacionrevisionPackage.FALLA_MECANICA__THE_AUTOMOVIL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheAutomovil((Automovil)otherEnd, msgs);
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
			case AutomatizacionrevisionPackage.FALLA_MECANICA__THE_AUTOMOVIL:
				return basicSetTheAutomovil(null, msgs);
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
			case AutomatizacionrevisionPackage.FALLA_MECANICA__THE_AUTOMOVIL:
				return eInternalContainer().eInverseRemove(this, DomainPackage.AUTOMOVIL__LISTA_DE_FALLAS, Automovil.class, msgs);
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
			case AutomatizacionrevisionPackage.FALLA_MECANICA__PIESA_AVERIADA:
				return getPiesaAveriada();
			case AutomatizacionrevisionPackage.FALLA_MECANICA__GRAVEDAD:
				return getGravedad();
			case AutomatizacionrevisionPackage.FALLA_MECANICA__ORIGEN:
				return getOrigen();
			case AutomatizacionrevisionPackage.FALLA_MECANICA__DESCRIPCION:
				return getDescripcion();
			case AutomatizacionrevisionPackage.FALLA_MECANICA__THE_AUTOMOVIL:
				return getTheAutomovil();
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
			case AutomatizacionrevisionPackage.FALLA_MECANICA__PIESA_AVERIADA:
				setPiesaAveriada((String)newValue);
				return;
			case AutomatizacionrevisionPackage.FALLA_MECANICA__GRAVEDAD:
				setGravedad((String)newValue);
				return;
			case AutomatizacionrevisionPackage.FALLA_MECANICA__ORIGEN:
				setOrigen((String)newValue);
				return;
			case AutomatizacionrevisionPackage.FALLA_MECANICA__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case AutomatizacionrevisionPackage.FALLA_MECANICA__THE_AUTOMOVIL:
				setTheAutomovil((Automovil)newValue);
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
			case AutomatizacionrevisionPackage.FALLA_MECANICA__PIESA_AVERIADA:
				setPiesaAveriada(PIESA_AVERIADA_EDEFAULT);
				return;
			case AutomatizacionrevisionPackage.FALLA_MECANICA__GRAVEDAD:
				setGravedad(GRAVEDAD_EDEFAULT);
				return;
			case AutomatizacionrevisionPackage.FALLA_MECANICA__ORIGEN:
				setOrigen(ORIGEN_EDEFAULT);
				return;
			case AutomatizacionrevisionPackage.FALLA_MECANICA__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case AutomatizacionrevisionPackage.FALLA_MECANICA__THE_AUTOMOVIL:
				setTheAutomovil((Automovil)null);
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
			case AutomatizacionrevisionPackage.FALLA_MECANICA__PIESA_AVERIADA:
				return PIESA_AVERIADA_EDEFAULT == null ? piesaAveriada != null : !PIESA_AVERIADA_EDEFAULT.equals(piesaAveriada);
			case AutomatizacionrevisionPackage.FALLA_MECANICA__GRAVEDAD:
				return GRAVEDAD_EDEFAULT == null ? gravedad != null : !GRAVEDAD_EDEFAULT.equals(gravedad);
			case AutomatizacionrevisionPackage.FALLA_MECANICA__ORIGEN:
				return ORIGEN_EDEFAULT == null ? origen != null : !ORIGEN_EDEFAULT.equals(origen);
			case AutomatizacionrevisionPackage.FALLA_MECANICA__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case AutomatizacionrevisionPackage.FALLA_MECANICA__THE_AUTOMOVIL:
				return getTheAutomovil() != null;
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
		result.append(" (piesaAveriada: ");
		result.append(piesaAveriada);
		result.append(", gravedad: ");
		result.append(gravedad);
		result.append(", origen: ");
		result.append(origen);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //FallaMecanicaImpl
