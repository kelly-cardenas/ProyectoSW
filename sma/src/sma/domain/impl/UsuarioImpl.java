/**
 */
package sma.domain.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import sma.domain.Automovil;
import sma.domain.CentroMant;
import sma.domain.Domain;
import sma.domain.DomainPackage;
import sma.domain.UbicacionUsu;
import sma.domain.Usuario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.domain.impl.UsuarioImpl#getCentroMant <em>Centro Mant</em>}</li>
 *   <li>{@link sma.domain.impl.UsuarioImpl#getOwnerByDomain <em>Owner By Domain</em>}</li>
 *   <li>{@link sma.domain.impl.UsuarioImpl#getId <em>Id</em>}</li>
 *   <li>{@link sma.domain.impl.UsuarioImpl#getNumDI <em>Num DI</em>}</li>
 *   <li>{@link sma.domain.impl.UsuarioImpl#getNombres <em>Nombres</em>}</li>
 *   <li>{@link sma.domain.impl.UsuarioImpl#getApellidos <em>Apellidos</em>}</li>
 *   <li>{@link sma.domain.impl.UsuarioImpl#getEdad <em>Edad</em>}</li>
 *   <li>{@link sma.domain.impl.UsuarioImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link sma.domain.impl.UsuarioImpl#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link sma.domain.impl.UsuarioImpl#getContrasenia <em>Contrasenia</em>}</li>
 *   <li>{@link sma.domain.impl.UsuarioImpl#getAutomoviles <em>Automoviles</em>}</li>
 *   <li>{@link sma.domain.impl.UsuarioImpl#getUbicacion <em>Ubicacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsuarioImpl extends EObjectImpl implements Usuario {
	/**
	 * The cached value of the '{@link #getCentroMant() <em>Centro Mant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentroMant()
	 * @generated
	 * @ordered
	 */
	protected CentroMant centroMant;

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
	 * The default value of the '{@link #getNumDI() <em>Num DI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumDI()
	 * @generated
	 * @ordered
	 */
	protected static final String NUM_DI_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getNumDI() <em>Num DI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumDI()
	 * @generated
	 * @ordered
	 */
	protected String numDI = NUM_DI_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombres() <em>Nombres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombres()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRES_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getNombres() <em>Nombres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombres()
	 * @generated
	 * @ordered
	 */
	protected String nombres = NOMBRES_EDEFAULT;

	/**
	 * The default value of the '{@link #getApellidos() <em>Apellidos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApellidos()
	 * @generated
	 * @ordered
	 */
	protected static final String APELLIDOS_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getApellidos() <em>Apellidos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApellidos()
	 * @generated
	 * @ordered
	 */
	protected String apellidos = APELLIDOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEdad() <em>Edad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdad()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EDAD_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getEdad() <em>Edad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdad()
	 * @generated
	 * @ordered
	 */
	protected Integer edad = EDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsuario() <em>Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuario()
	 * @generated
	 * @ordered
	 */
	protected static final String USUARIO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getUsuario() <em>Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuario()
	 * @generated
	 * @ordered
	 */
	protected String usuario = USUARIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getContrasenia() <em>Contrasenia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrasenia()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRASENIA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getContrasenia() <em>Contrasenia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrasenia()
	 * @generated
	 * @ordered
	 */
	protected String contrasenia = CONTRASENIA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAutomoviles() <em>Automoviles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomoviles()
	 * @generated
	 * @ordered
	 */
	protected EList<Automovil> automoviles;

	/**
	 * The cached value of the '{@link #getUbicacion() <em>Ubicacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUbicacion()
	 * @generated
	 * @ordered
	 */
	protected UbicacionUsu ubicacion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsuarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.USUARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentroMant getCentroMant() {
		if (centroMant != null && centroMant.eIsProxy()) {
			InternalEObject oldCentroMant = (InternalEObject)centroMant;
			centroMant = (CentroMant)eResolveProxy(oldCentroMant);
			if (centroMant != oldCentroMant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.USUARIO__CENTRO_MANT, oldCentroMant, centroMant));
			}
		}
		return centroMant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CentroMant basicGetCentroMant() {
		return centroMant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCentroMant(CentroMant newCentroMant, NotificationChain msgs) {
		CentroMant oldCentroMant = centroMant;
		centroMant = newCentroMant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.USUARIO__CENTRO_MANT, oldCentroMant, newCentroMant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentroMant(CentroMant newCentroMant) {
		if (newCentroMant != centroMant) {
			NotificationChain msgs = null;
			if (centroMant != null)
				msgs = ((InternalEObject)centroMant).eInverseRemove(this, DomainPackage.CENTRO_MANT__USUARIOS_ATENDIDOS, CentroMant.class, msgs);
			if (newCentroMant != null)
				msgs = ((InternalEObject)newCentroMant).eInverseAdd(this, DomainPackage.CENTRO_MANT__USUARIOS_ATENDIDOS, CentroMant.class, msgs);
			msgs = basicSetCentroMant(newCentroMant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.USUARIO__CENTRO_MANT, newCentroMant, newCentroMant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getOwnerByDomain() {
		if (eContainerFeatureID() != DomainPackage.USUARIO__OWNER_BY_DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerByDomain(Domain newOwnerByDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerByDomain, DomainPackage.USUARIO__OWNER_BY_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerByDomain(Domain newOwnerByDomain) {
		if (newOwnerByDomain != eInternalContainer() || (eContainerFeatureID() != DomainPackage.USUARIO__OWNER_BY_DOMAIN && newOwnerByDomain != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerByDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerByDomain != null)
				msgs = ((InternalEObject)newOwnerByDomain).eInverseAdd(this, DomainPackage.DOMAIN__LISTA_USUARIOS, Domain.class, msgs);
			msgs = basicSetOwnerByDomain(newOwnerByDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.USUARIO__OWNER_BY_DOMAIN, newOwnerByDomain, newOwnerByDomain));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.USUARIO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumDI() {
		return numDI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumDI(String newNumDI) {
		String oldNumDI = numDI;
		numDI = newNumDI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.USUARIO__NUM_DI, oldNumDI, numDI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombres(String newNombres) {
		String oldNombres = nombres;
		nombres = newNombres;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.USUARIO__NOMBRES, oldNombres, nombres));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApellidos(String newApellidos) {
		String oldApellidos = apellidos;
		apellidos = newApellidos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.USUARIO__APELLIDOS, oldApellidos, apellidos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getEdad() {
		return edad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdad(Integer newEdad) {
		Integer oldEdad = edad;
		edad = newEdad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.USUARIO__EDAD, oldEdad, edad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.USUARIO__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsuario(String newUsuario) {
		String oldUsuario = usuario;
		usuario = newUsuario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.USUARIO__USUARIO, oldUsuario, usuario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContrasenia() {
		return contrasenia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContrasenia(String newContrasenia) {
		String oldContrasenia = contrasenia;
		contrasenia = newContrasenia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.USUARIO__CONTRASENIA, oldContrasenia, contrasenia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Automovil> getAutomoviles() {
		if (automoviles == null) {
			automoviles = new EObjectWithInverseResolvingEList<Automovil>(Automovil.class, this, DomainPackage.USUARIO__AUTOMOVILES, DomainPackage.AUTOMOVIL__PROPIETARIO);
		}
		return automoviles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbicacionUsu getUbicacion() {
		return ubicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUbicacion(UbicacionUsu newUbicacion, NotificationChain msgs) {
		UbicacionUsu oldUbicacion = ubicacion;
		ubicacion = newUbicacion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.USUARIO__UBICACION, oldUbicacion, newUbicacion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUbicacion(UbicacionUsu newUbicacion) {
		if (newUbicacion != ubicacion) {
			NotificationChain msgs = null;
			if (ubicacion != null)
				msgs = ((InternalEObject)ubicacion).eInverseRemove(this, DomainPackage.UBICACION_USU__OWNER_BY, UbicacionUsu.class, msgs);
			if (newUbicacion != null)
				msgs = ((InternalEObject)newUbicacion).eInverseAdd(this, DomainPackage.UBICACION_USU__OWNER_BY, UbicacionUsu.class, msgs);
			msgs = basicSetUbicacion(newUbicacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.USUARIO__UBICACION, newUbicacion, newUbicacion));
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
			case DomainPackage.USUARIO__CENTRO_MANT:
				if (centroMant != null)
					msgs = ((InternalEObject)centroMant).eInverseRemove(this, DomainPackage.CENTRO_MANT__USUARIOS_ATENDIDOS, CentroMant.class, msgs);
				return basicSetCentroMant((CentroMant)otherEnd, msgs);
			case DomainPackage.USUARIO__OWNER_BY_DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerByDomain((Domain)otherEnd, msgs);
			case DomainPackage.USUARIO__AUTOMOVILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAutomoviles()).basicAdd(otherEnd, msgs);
			case DomainPackage.USUARIO__UBICACION:
				if (ubicacion != null)
					msgs = ((InternalEObject)ubicacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.USUARIO__UBICACION, null, msgs);
				return basicSetUbicacion((UbicacionUsu)otherEnd, msgs);
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
			case DomainPackage.USUARIO__CENTRO_MANT:
				return basicSetCentroMant(null, msgs);
			case DomainPackage.USUARIO__OWNER_BY_DOMAIN:
				return basicSetOwnerByDomain(null, msgs);
			case DomainPackage.USUARIO__AUTOMOVILES:
				return ((InternalEList<?>)getAutomoviles()).basicRemove(otherEnd, msgs);
			case DomainPackage.USUARIO__UBICACION:
				return basicSetUbicacion(null, msgs);
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
			case DomainPackage.USUARIO__OWNER_BY_DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__LISTA_USUARIOS, Domain.class, msgs);
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
			case DomainPackage.USUARIO__CENTRO_MANT:
				if (resolve) return getCentroMant();
				return basicGetCentroMant();
			case DomainPackage.USUARIO__OWNER_BY_DOMAIN:
				return getOwnerByDomain();
			case DomainPackage.USUARIO__ID:
				return getId();
			case DomainPackage.USUARIO__NUM_DI:
				return getNumDI();
			case DomainPackage.USUARIO__NOMBRES:
				return getNombres();
			case DomainPackage.USUARIO__APELLIDOS:
				return getApellidos();
			case DomainPackage.USUARIO__EDAD:
				return getEdad();
			case DomainPackage.USUARIO__EMAIL:
				return getEmail();
			case DomainPackage.USUARIO__USUARIO:
				return getUsuario();
			case DomainPackage.USUARIO__CONTRASENIA:
				return getContrasenia();
			case DomainPackage.USUARIO__AUTOMOVILES:
				return getAutomoviles();
			case DomainPackage.USUARIO__UBICACION:
				return getUbicacion();
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
			case DomainPackage.USUARIO__CENTRO_MANT:
				setCentroMant((CentroMant)newValue);
				return;
			case DomainPackage.USUARIO__OWNER_BY_DOMAIN:
				setOwnerByDomain((Domain)newValue);
				return;
			case DomainPackage.USUARIO__ID:
				setId((String)newValue);
				return;
			case DomainPackage.USUARIO__NUM_DI:
				setNumDI((String)newValue);
				return;
			case DomainPackage.USUARIO__NOMBRES:
				setNombres((String)newValue);
				return;
			case DomainPackage.USUARIO__APELLIDOS:
				setApellidos((String)newValue);
				return;
			case DomainPackage.USUARIO__EDAD:
				setEdad((Integer)newValue);
				return;
			case DomainPackage.USUARIO__EMAIL:
				setEmail((String)newValue);
				return;
			case DomainPackage.USUARIO__USUARIO:
				setUsuario((String)newValue);
				return;
			case DomainPackage.USUARIO__CONTRASENIA:
				setContrasenia((String)newValue);
				return;
			case DomainPackage.USUARIO__AUTOMOVILES:
				getAutomoviles().clear();
				getAutomoviles().addAll((Collection<? extends Automovil>)newValue);
				return;
			case DomainPackage.USUARIO__UBICACION:
				setUbicacion((UbicacionUsu)newValue);
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
			case DomainPackage.USUARIO__CENTRO_MANT:
				setCentroMant((CentroMant)null);
				return;
			case DomainPackage.USUARIO__OWNER_BY_DOMAIN:
				setOwnerByDomain((Domain)null);
				return;
			case DomainPackage.USUARIO__ID:
				setId(ID_EDEFAULT);
				return;
			case DomainPackage.USUARIO__NUM_DI:
				setNumDI(NUM_DI_EDEFAULT);
				return;
			case DomainPackage.USUARIO__NOMBRES:
				setNombres(NOMBRES_EDEFAULT);
				return;
			case DomainPackage.USUARIO__APELLIDOS:
				setApellidos(APELLIDOS_EDEFAULT);
				return;
			case DomainPackage.USUARIO__EDAD:
				setEdad(EDAD_EDEFAULT);
				return;
			case DomainPackage.USUARIO__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case DomainPackage.USUARIO__USUARIO:
				setUsuario(USUARIO_EDEFAULT);
				return;
			case DomainPackage.USUARIO__CONTRASENIA:
				setContrasenia(CONTRASENIA_EDEFAULT);
				return;
			case DomainPackage.USUARIO__AUTOMOVILES:
				getAutomoviles().clear();
				return;
			case DomainPackage.USUARIO__UBICACION:
				setUbicacion((UbicacionUsu)null);
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
			case DomainPackage.USUARIO__CENTRO_MANT:
				return centroMant != null;
			case DomainPackage.USUARIO__OWNER_BY_DOMAIN:
				return getOwnerByDomain() != null;
			case DomainPackage.USUARIO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DomainPackage.USUARIO__NUM_DI:
				return NUM_DI_EDEFAULT == null ? numDI != null : !NUM_DI_EDEFAULT.equals(numDI);
			case DomainPackage.USUARIO__NOMBRES:
				return NOMBRES_EDEFAULT == null ? nombres != null : !NOMBRES_EDEFAULT.equals(nombres);
			case DomainPackage.USUARIO__APELLIDOS:
				return APELLIDOS_EDEFAULT == null ? apellidos != null : !APELLIDOS_EDEFAULT.equals(apellidos);
			case DomainPackage.USUARIO__EDAD:
				return EDAD_EDEFAULT == null ? edad != null : !EDAD_EDEFAULT.equals(edad);
			case DomainPackage.USUARIO__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case DomainPackage.USUARIO__USUARIO:
				return USUARIO_EDEFAULT == null ? usuario != null : !USUARIO_EDEFAULT.equals(usuario);
			case DomainPackage.USUARIO__CONTRASENIA:
				return CONTRASENIA_EDEFAULT == null ? contrasenia != null : !CONTRASENIA_EDEFAULT.equals(contrasenia);
			case DomainPackage.USUARIO__AUTOMOVILES:
				return automoviles != null && !automoviles.isEmpty();
			case DomainPackage.USUARIO__UBICACION:
				return ubicacion != null;
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
		result.append(", numDI: ");
		result.append(numDI);
		result.append(", nombres: ");
		result.append(nombres);
		result.append(", apellidos: ");
		result.append(apellidos);
		result.append(", edad: ");
		result.append(edad);
		result.append(", email: ");
		result.append(email);
		result.append(", usuario: ");
		result.append(usuario);
		result.append(", contrasenia: ");
		result.append(contrasenia);
		result.append(')');
		return result.toString();
	}

} //UsuarioImpl
