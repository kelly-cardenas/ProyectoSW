/**
 */
package sma.domain.reparacionvehiculo.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sma.domain.Automovil;
import sma.domain.CentroMant;
import sma.domain.DomainPackage;

import sma.domain.reparacionvehiculo.Reparacion;
import sma.domain.reparacionvehiculo.ReparacionvehiculoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reparacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.domain.reparacionvehiculo.impl.ReparacionImpl#getTheAutomovil <em>The Automovil</em>}</li>
 *   <li>{@link sma.domain.reparacionvehiculo.impl.ReparacionImpl#getTheCentroMant <em>The Centro Mant</em>}</li>
 *   <li>{@link sma.domain.reparacionvehiculo.impl.ReparacionImpl#getNombreResponsable <em>Nombre Responsable</em>}</li>
 *   <li>{@link sma.domain.reparacionvehiculo.impl.ReparacionImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link sma.domain.reparacionvehiculo.impl.ReparacionImpl#getNumeroFallasPredecidas <em>Numero Fallas Predecidas</em>}</li>
 *   <li>{@link sma.domain.reparacionvehiculo.impl.ReparacionImpl#getNumeroFallasAcertadas <em>Numero Fallas Acertadas</em>}</li>
 *   <li>{@link sma.domain.reparacionvehiculo.impl.ReparacionImpl#getFecha <em>Fecha</em>}</li>
 *   <li>{@link sma.domain.reparacionvehiculo.impl.ReparacionImpl#getHora <em>Hora</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReparacionImpl extends EObjectImpl implements Reparacion {
	/**
	 * The cached value of the '{@link #getTheAutomovil() <em>The Automovil</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheAutomovil()
	 * @generated
	 * @ordered
	 */
	protected Automovil theAutomovil;

	/**
	 * The default value of the '{@link #getNombreResponsable() <em>Nombre Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreResponsable()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_RESPONSABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreResponsable() <em>Nombre Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreResponsable()
	 * @generated
	 * @ordered
	 */
	protected String nombreResponsable = NOMBRE_RESPONSABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected String estado = ESTADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeroFallasPredecidas() <em>Numero Fallas Predecidas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroFallasPredecidas()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMERO_FALLAS_PREDECIDAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroFallasPredecidas() <em>Numero Fallas Predecidas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroFallasPredecidas()
	 * @generated
	 * @ordered
	 */
	protected Integer numeroFallasPredecidas = NUMERO_FALLAS_PREDECIDAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeroFallasAcertadas() <em>Numero Fallas Acertadas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroFallasAcertadas()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMERO_FALLAS_ACERTADAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroFallasAcertadas() <em>Numero Fallas Acertadas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroFallasAcertadas()
	 * @generated
	 * @ordered
	 */
	protected Integer numeroFallasAcertadas = NUMERO_FALLAS_ACERTADAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFecha() <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFecha()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFecha() <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFecha()
	 * @generated
	 * @ordered
	 */
	protected String fecha = FECHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getHora() <em>Hora</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHora()
	 * @generated
	 * @ordered
	 */
	protected static final String HORA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHora() <em>Hora</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHora()
	 * @generated
	 * @ordered
	 */
	protected String hora = HORA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReparacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReparacionvehiculoPackage.Literals.REPARACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Automovil getTheAutomovil() {
		if (theAutomovil != null && theAutomovil.eIsProxy()) {
			InternalEObject oldTheAutomovil = (InternalEObject)theAutomovil;
			theAutomovil = (Automovil)eResolveProxy(oldTheAutomovil);
			if (theAutomovil != oldTheAutomovil) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReparacionvehiculoPackage.REPARACION__THE_AUTOMOVIL, oldTheAutomovil, theAutomovil));
			}
		}
		return theAutomovil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Automovil basicGetTheAutomovil() {
		return theAutomovil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheAutomovil(Automovil newTheAutomovil, NotificationChain msgs) {
		Automovil oldTheAutomovil = theAutomovil;
		theAutomovil = newTheAutomovil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReparacionvehiculoPackage.REPARACION__THE_AUTOMOVIL, oldTheAutomovil, newTheAutomovil);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheAutomovil(Automovil newTheAutomovil) {
		if (newTheAutomovil != theAutomovil) {
			NotificationChain msgs = null;
			if (theAutomovil != null)
				msgs = ((InternalEObject)theAutomovil).eInverseRemove(this, DomainPackage.AUTOMOVIL__REPARACIONES_HECHAS, Automovil.class, msgs);
			if (newTheAutomovil != null)
				msgs = ((InternalEObject)newTheAutomovil).eInverseAdd(this, DomainPackage.AUTOMOVIL__REPARACIONES_HECHAS, Automovil.class, msgs);
			msgs = basicSetTheAutomovil(newTheAutomovil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReparacionvehiculoPackage.REPARACION__THE_AUTOMOVIL, newTheAutomovil, newTheAutomovil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentroMant getTheCentroMant() {
		if (eContainerFeatureID() != ReparacionvehiculoPackage.REPARACION__THE_CENTRO_MANT) return null;
		return (CentroMant)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheCentroMant(CentroMant newTheCentroMant, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheCentroMant, ReparacionvehiculoPackage.REPARACION__THE_CENTRO_MANT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheCentroMant(CentroMant newTheCentroMant) {
		if (newTheCentroMant != eInternalContainer() || (eContainerFeatureID() != ReparacionvehiculoPackage.REPARACION__THE_CENTRO_MANT && newTheCentroMant != null)) {
			if (EcoreUtil.isAncestor(this, newTheCentroMant))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheCentroMant != null)
				msgs = ((InternalEObject)newTheCentroMant).eInverseAdd(this, DomainPackage.CENTRO_MANT__HISTORIAL_REPARACION, CentroMant.class, msgs);
			msgs = basicSetTheCentroMant(newTheCentroMant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReparacionvehiculoPackage.REPARACION__THE_CENTRO_MANT, newTheCentroMant, newTheCentroMant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreResponsable() {
		return nombreResponsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreResponsable(String newNombreResponsable) {
		String oldNombreResponsable = nombreResponsable;
		nombreResponsable = newNombreResponsable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReparacionvehiculoPackage.REPARACION__NOMBRE_RESPONSABLE, oldNombreResponsable, nombreResponsable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstado(String newEstado) {
		String oldEstado = estado;
		estado = newEstado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReparacionvehiculoPackage.REPARACION__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumeroFallasPredecidas() {
		return numeroFallasPredecidas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroFallasPredecidas(Integer newNumeroFallasPredecidas) {
		Integer oldNumeroFallasPredecidas = numeroFallasPredecidas;
		numeroFallasPredecidas = newNumeroFallasPredecidas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReparacionvehiculoPackage.REPARACION__NUMERO_FALLAS_PREDECIDAS, oldNumeroFallasPredecidas, numeroFallasPredecidas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumeroFallasAcertadas() {
		return numeroFallasAcertadas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroFallasAcertadas(Integer newNumeroFallasAcertadas) {
		Integer oldNumeroFallasAcertadas = numeroFallasAcertadas;
		numeroFallasAcertadas = newNumeroFallasAcertadas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReparacionvehiculoPackage.REPARACION__NUMERO_FALLAS_ACERTADAS, oldNumeroFallasAcertadas, numeroFallasAcertadas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFecha(String newFecha) {
		String oldFecha = fecha;
		fecha = newFecha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReparacionvehiculoPackage.REPARACION__FECHA, oldFecha, fecha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHora() {
		return hora;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHora(String newHora) {
		String oldHora = hora;
		hora = newHora;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReparacionvehiculoPackage.REPARACION__HORA, oldHora, hora));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReparacionvehiculoPackage.REPARACION__THE_AUTOMOVIL:
				if (theAutomovil != null)
					msgs = ((InternalEObject)theAutomovil).eInverseRemove(this, DomainPackage.AUTOMOVIL__REPARACIONES_HECHAS, Automovil.class, msgs);
				return basicSetTheAutomovil((Automovil)otherEnd, msgs);
			case ReparacionvehiculoPackage.REPARACION__THE_CENTRO_MANT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheCentroMant((CentroMant)otherEnd, msgs);
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
			case ReparacionvehiculoPackage.REPARACION__THE_AUTOMOVIL:
				return basicSetTheAutomovil(null, msgs);
			case ReparacionvehiculoPackage.REPARACION__THE_CENTRO_MANT:
				return basicSetTheCentroMant(null, msgs);
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
			case ReparacionvehiculoPackage.REPARACION__THE_CENTRO_MANT:
				return eInternalContainer().eInverseRemove(this, DomainPackage.CENTRO_MANT__HISTORIAL_REPARACION, CentroMant.class, msgs);
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
			case ReparacionvehiculoPackage.REPARACION__THE_AUTOMOVIL:
				if (resolve) return getTheAutomovil();
				return basicGetTheAutomovil();
			case ReparacionvehiculoPackage.REPARACION__THE_CENTRO_MANT:
				return getTheCentroMant();
			case ReparacionvehiculoPackage.REPARACION__NOMBRE_RESPONSABLE:
				return getNombreResponsable();
			case ReparacionvehiculoPackage.REPARACION__ESTADO:
				return getEstado();
			case ReparacionvehiculoPackage.REPARACION__NUMERO_FALLAS_PREDECIDAS:
				return getNumeroFallasPredecidas();
			case ReparacionvehiculoPackage.REPARACION__NUMERO_FALLAS_ACERTADAS:
				return getNumeroFallasAcertadas();
			case ReparacionvehiculoPackage.REPARACION__FECHA:
				return getFecha();
			case ReparacionvehiculoPackage.REPARACION__HORA:
				return getHora();
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
			case ReparacionvehiculoPackage.REPARACION__THE_AUTOMOVIL:
				setTheAutomovil((Automovil)newValue);
				return;
			case ReparacionvehiculoPackage.REPARACION__THE_CENTRO_MANT:
				setTheCentroMant((CentroMant)newValue);
				return;
			case ReparacionvehiculoPackage.REPARACION__NOMBRE_RESPONSABLE:
				setNombreResponsable((String)newValue);
				return;
			case ReparacionvehiculoPackage.REPARACION__ESTADO:
				setEstado((String)newValue);
				return;
			case ReparacionvehiculoPackage.REPARACION__NUMERO_FALLAS_PREDECIDAS:
				setNumeroFallasPredecidas((Integer)newValue);
				return;
			case ReparacionvehiculoPackage.REPARACION__NUMERO_FALLAS_ACERTADAS:
				setNumeroFallasAcertadas((Integer)newValue);
				return;
			case ReparacionvehiculoPackage.REPARACION__FECHA:
				setFecha((String)newValue);
				return;
			case ReparacionvehiculoPackage.REPARACION__HORA:
				setHora((String)newValue);
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
			case ReparacionvehiculoPackage.REPARACION__THE_AUTOMOVIL:
				setTheAutomovil((Automovil)null);
				return;
			case ReparacionvehiculoPackage.REPARACION__THE_CENTRO_MANT:
				setTheCentroMant((CentroMant)null);
				return;
			case ReparacionvehiculoPackage.REPARACION__NOMBRE_RESPONSABLE:
				setNombreResponsable(NOMBRE_RESPONSABLE_EDEFAULT);
				return;
			case ReparacionvehiculoPackage.REPARACION__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case ReparacionvehiculoPackage.REPARACION__NUMERO_FALLAS_PREDECIDAS:
				setNumeroFallasPredecidas(NUMERO_FALLAS_PREDECIDAS_EDEFAULT);
				return;
			case ReparacionvehiculoPackage.REPARACION__NUMERO_FALLAS_ACERTADAS:
				setNumeroFallasAcertadas(NUMERO_FALLAS_ACERTADAS_EDEFAULT);
				return;
			case ReparacionvehiculoPackage.REPARACION__FECHA:
				setFecha(FECHA_EDEFAULT);
				return;
			case ReparacionvehiculoPackage.REPARACION__HORA:
				setHora(HORA_EDEFAULT);
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
			case ReparacionvehiculoPackage.REPARACION__THE_AUTOMOVIL:
				return theAutomovil != null;
			case ReparacionvehiculoPackage.REPARACION__THE_CENTRO_MANT:
				return getTheCentroMant() != null;
			case ReparacionvehiculoPackage.REPARACION__NOMBRE_RESPONSABLE:
				return NOMBRE_RESPONSABLE_EDEFAULT == null ? nombreResponsable != null : !NOMBRE_RESPONSABLE_EDEFAULT.equals(nombreResponsable);
			case ReparacionvehiculoPackage.REPARACION__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case ReparacionvehiculoPackage.REPARACION__NUMERO_FALLAS_PREDECIDAS:
				return NUMERO_FALLAS_PREDECIDAS_EDEFAULT == null ? numeroFallasPredecidas != null : !NUMERO_FALLAS_PREDECIDAS_EDEFAULT.equals(numeroFallasPredecidas);
			case ReparacionvehiculoPackage.REPARACION__NUMERO_FALLAS_ACERTADAS:
				return NUMERO_FALLAS_ACERTADAS_EDEFAULT == null ? numeroFallasAcertadas != null : !NUMERO_FALLAS_ACERTADAS_EDEFAULT.equals(numeroFallasAcertadas);
			case ReparacionvehiculoPackage.REPARACION__FECHA:
				return FECHA_EDEFAULT == null ? fecha != null : !FECHA_EDEFAULT.equals(fecha);
			case ReparacionvehiculoPackage.REPARACION__HORA:
				return HORA_EDEFAULT == null ? hora != null : !HORA_EDEFAULT.equals(hora);
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
		result.append(" (nombreResponsable: ");
		result.append(nombreResponsable);
		result.append(", estado: ");
		result.append(estado);
		result.append(", numeroFallasPredecidas: ");
		result.append(numeroFallasPredecidas);
		result.append(", numeroFallasAcertadas: ");
		result.append(numeroFallasAcertadas);
		result.append(", fecha: ");
		result.append(fecha);
		result.append(", hora: ");
		result.append(hora);
		result.append(')');
		return result.toString();
	}

} //ReparacionImpl
