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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import sma.domain.CentroMant;
import sma.domain.Domain;
import sma.domain.DomainPackage;
import sma.domain.UbicacionCM;
import sma.domain.Usuario;

import sma.domain.reparacionvehiculo.Reparacion;
import sma.domain.reparacionvehiculo.ReparacionvehiculoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Centro Mant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.domain.impl.CentroMantImpl#getId <em>Id</em>}</li>
 *   <li>{@link sma.domain.impl.CentroMantImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link sma.domain.impl.CentroMantImpl#getNombreRepresentante <em>Nombre Representante</em>}</li>
 *   <li>{@link sma.domain.impl.CentroMantImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link sma.domain.impl.CentroMantImpl#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link sma.domain.impl.CentroMantImpl#getContrasenia <em>Contrasenia</em>}</li>
 *   <li>{@link sma.domain.impl.CentroMantImpl#getUsuariosAtendidos <em>Usuarios Atendidos</em>}</li>
 *   <li>{@link sma.domain.impl.CentroMantImpl#getHistorialReparacion <em>Historial Reparacion</em>}</li>
 *   <li>{@link sma.domain.impl.CentroMantImpl#getOwnedByDomain <em>Owned By Domain</em>}</li>
 *   <li>{@link sma.domain.impl.CentroMantImpl#getUbicacion <em>Ubicacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CentroMantImpl extends EObjectImpl implements CentroMant {
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
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreRepresentante() <em>Nombre Representante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreRepresentante()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_REPRESENTANTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreRepresentante() <em>Nombre Representante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreRepresentante()
	 * @generated
	 * @ordered
	 */
	protected String nombreRepresentante = NOMBRE_REPRESENTANTE_EDEFAULT;

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
	 * The default value of the '{@link #getUsuario() <em>Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuario()
	 * @generated
	 * @ordered
	 */
	protected static final String USUARIO_EDEFAULT = null;

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
	protected static final String CONTRASENIA_EDEFAULT = null;

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
	 * The cached value of the '{@link #getUsuariosAtendidos() <em>Usuarios Atendidos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuariosAtendidos()
	 * @generated
	 * @ordered
	 */
	protected EList<Usuario> usuariosAtendidos;

	/**
	 * The cached value of the '{@link #getHistorialReparacion() <em>Historial Reparacion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistorialReparacion()
	 * @generated
	 * @ordered
	 */
	protected EList<Reparacion> historialReparacion;

	/**
	 * The cached value of the '{@link #getUbicacion() <em>Ubicacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUbicacion()
	 * @generated
	 * @ordered
	 */
	protected UbicacionCM ubicacion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CentroMantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.CENTRO_MANT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CENTRO_MANT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CENTRO_MANT__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreRepresentante() {
		return nombreRepresentante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreRepresentante(String newNombreRepresentante) {
		String oldNombreRepresentante = nombreRepresentante;
		nombreRepresentante = newNombreRepresentante;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CENTRO_MANT__NOMBRE_REPRESENTANTE, oldNombreRepresentante, nombreRepresentante));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CENTRO_MANT__DESCRIPCION, oldDescripcion, descripcion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CENTRO_MANT__USUARIO, oldUsuario, usuario));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CENTRO_MANT__CONTRASENIA, oldContrasenia, contrasenia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Usuario> getUsuariosAtendidos() {
		if (usuariosAtendidos == null) {
			usuariosAtendidos = new EObjectWithInverseResolvingEList<Usuario>(Usuario.class, this, DomainPackage.CENTRO_MANT__USUARIOS_ATENDIDOS, DomainPackage.USUARIO__CENTRO_MANT);
		}
		return usuariosAtendidos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reparacion> getHistorialReparacion() {
		if (historialReparacion == null) {
			historialReparacion = new EObjectContainmentWithInverseEList<Reparacion>(Reparacion.class, this, DomainPackage.CENTRO_MANT__HISTORIAL_REPARACION, ReparacionvehiculoPackage.REPARACION__THE_CENTRO_MANT);
		}
		return historialReparacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getOwnedByDomain() {
		if (eContainerFeatureID() != DomainPackage.CENTRO_MANT__OWNED_BY_DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByDomain(Domain newOwnedByDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByDomain, DomainPackage.CENTRO_MANT__OWNED_BY_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByDomain(Domain newOwnedByDomain) {
		if (newOwnedByDomain != eInternalContainer() || (eContainerFeatureID() != DomainPackage.CENTRO_MANT__OWNED_BY_DOMAIN && newOwnedByDomain != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByDomain != null)
				msgs = ((InternalEObject)newOwnedByDomain).eInverseAdd(this, DomainPackage.DOMAIN__LISTA_DE_CENT_MANT, Domain.class, msgs);
			msgs = basicSetOwnedByDomain(newOwnedByDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CENTRO_MANT__OWNED_BY_DOMAIN, newOwnedByDomain, newOwnedByDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbicacionCM getUbicacion() {
		if (ubicacion != null && ubicacion.eIsProxy()) {
			InternalEObject oldUbicacion = (InternalEObject)ubicacion;
			ubicacion = (UbicacionCM)eResolveProxy(oldUbicacion);
			if (ubicacion != oldUbicacion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.CENTRO_MANT__UBICACION, oldUbicacion, ubicacion));
			}
		}
		return ubicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbicacionCM basicGetUbicacion() {
		return ubicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUbicacion(UbicacionCM newUbicacion, NotificationChain msgs) {
		UbicacionCM oldUbicacion = ubicacion;
		ubicacion = newUbicacion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.CENTRO_MANT__UBICACION, oldUbicacion, newUbicacion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUbicacion(UbicacionCM newUbicacion) {
		if (newUbicacion != ubicacion) {
			NotificationChain msgs = null;
			if (ubicacion != null)
				msgs = ((InternalEObject)ubicacion).eInverseRemove(this, DomainPackage.UBICACION_CM__OWNED_BY, UbicacionCM.class, msgs);
			if (newUbicacion != null)
				msgs = ((InternalEObject)newUbicacion).eInverseAdd(this, DomainPackage.UBICACION_CM__OWNED_BY, UbicacionCM.class, msgs);
			msgs = basicSetUbicacion(newUbicacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.CENTRO_MANT__UBICACION, newUbicacion, newUbicacion));
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
			case DomainPackage.CENTRO_MANT__USUARIOS_ATENDIDOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsuariosAtendidos()).basicAdd(otherEnd, msgs);
			case DomainPackage.CENTRO_MANT__HISTORIAL_REPARACION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHistorialReparacion()).basicAdd(otherEnd, msgs);
			case DomainPackage.CENTRO_MANT__OWNED_BY_DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByDomain((Domain)otherEnd, msgs);
			case DomainPackage.CENTRO_MANT__UBICACION:
				if (ubicacion != null)
					msgs = ((InternalEObject)ubicacion).eInverseRemove(this, DomainPackage.UBICACION_CM__OWNED_BY, UbicacionCM.class, msgs);
				return basicSetUbicacion((UbicacionCM)otherEnd, msgs);
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
			case DomainPackage.CENTRO_MANT__USUARIOS_ATENDIDOS:
				return ((InternalEList<?>)getUsuariosAtendidos()).basicRemove(otherEnd, msgs);
			case DomainPackage.CENTRO_MANT__HISTORIAL_REPARACION:
				return ((InternalEList<?>)getHistorialReparacion()).basicRemove(otherEnd, msgs);
			case DomainPackage.CENTRO_MANT__OWNED_BY_DOMAIN:
				return basicSetOwnedByDomain(null, msgs);
			case DomainPackage.CENTRO_MANT__UBICACION:
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
			case DomainPackage.CENTRO_MANT__OWNED_BY_DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__LISTA_DE_CENT_MANT, Domain.class, msgs);
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
			case DomainPackage.CENTRO_MANT__ID:
				return getId();
			case DomainPackage.CENTRO_MANT__NOMBRE:
				return getNombre();
			case DomainPackage.CENTRO_MANT__NOMBRE_REPRESENTANTE:
				return getNombreRepresentante();
			case DomainPackage.CENTRO_MANT__DESCRIPCION:
				return getDescripcion();
			case DomainPackage.CENTRO_MANT__USUARIO:
				return getUsuario();
			case DomainPackage.CENTRO_MANT__CONTRASENIA:
				return getContrasenia();
			case DomainPackage.CENTRO_MANT__USUARIOS_ATENDIDOS:
				return getUsuariosAtendidos();
			case DomainPackage.CENTRO_MANT__HISTORIAL_REPARACION:
				return getHistorialReparacion();
			case DomainPackage.CENTRO_MANT__OWNED_BY_DOMAIN:
				return getOwnedByDomain();
			case DomainPackage.CENTRO_MANT__UBICACION:
				if (resolve) return getUbicacion();
				return basicGetUbicacion();
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
			case DomainPackage.CENTRO_MANT__ID:
				setId((String)newValue);
				return;
			case DomainPackage.CENTRO_MANT__NOMBRE:
				setNombre((String)newValue);
				return;
			case DomainPackage.CENTRO_MANT__NOMBRE_REPRESENTANTE:
				setNombreRepresentante((String)newValue);
				return;
			case DomainPackage.CENTRO_MANT__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case DomainPackage.CENTRO_MANT__USUARIO:
				setUsuario((String)newValue);
				return;
			case DomainPackage.CENTRO_MANT__CONTRASENIA:
				setContrasenia((String)newValue);
				return;
			case DomainPackage.CENTRO_MANT__USUARIOS_ATENDIDOS:
				getUsuariosAtendidos().clear();
				getUsuariosAtendidos().addAll((Collection<? extends Usuario>)newValue);
				return;
			case DomainPackage.CENTRO_MANT__HISTORIAL_REPARACION:
				getHistorialReparacion().clear();
				getHistorialReparacion().addAll((Collection<? extends Reparacion>)newValue);
				return;
			case DomainPackage.CENTRO_MANT__OWNED_BY_DOMAIN:
				setOwnedByDomain((Domain)newValue);
				return;
			case DomainPackage.CENTRO_MANT__UBICACION:
				setUbicacion((UbicacionCM)newValue);
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
			case DomainPackage.CENTRO_MANT__ID:
				setId(ID_EDEFAULT);
				return;
			case DomainPackage.CENTRO_MANT__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case DomainPackage.CENTRO_MANT__NOMBRE_REPRESENTANTE:
				setNombreRepresentante(NOMBRE_REPRESENTANTE_EDEFAULT);
				return;
			case DomainPackage.CENTRO_MANT__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case DomainPackage.CENTRO_MANT__USUARIO:
				setUsuario(USUARIO_EDEFAULT);
				return;
			case DomainPackage.CENTRO_MANT__CONTRASENIA:
				setContrasenia(CONTRASENIA_EDEFAULT);
				return;
			case DomainPackage.CENTRO_MANT__USUARIOS_ATENDIDOS:
				getUsuariosAtendidos().clear();
				return;
			case DomainPackage.CENTRO_MANT__HISTORIAL_REPARACION:
				getHistorialReparacion().clear();
				return;
			case DomainPackage.CENTRO_MANT__OWNED_BY_DOMAIN:
				setOwnedByDomain((Domain)null);
				return;
			case DomainPackage.CENTRO_MANT__UBICACION:
				setUbicacion((UbicacionCM)null);
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
			case DomainPackage.CENTRO_MANT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DomainPackage.CENTRO_MANT__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case DomainPackage.CENTRO_MANT__NOMBRE_REPRESENTANTE:
				return NOMBRE_REPRESENTANTE_EDEFAULT == null ? nombreRepresentante != null : !NOMBRE_REPRESENTANTE_EDEFAULT.equals(nombreRepresentante);
			case DomainPackage.CENTRO_MANT__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case DomainPackage.CENTRO_MANT__USUARIO:
				return USUARIO_EDEFAULT == null ? usuario != null : !USUARIO_EDEFAULT.equals(usuario);
			case DomainPackage.CENTRO_MANT__CONTRASENIA:
				return CONTRASENIA_EDEFAULT == null ? contrasenia != null : !CONTRASENIA_EDEFAULT.equals(contrasenia);
			case DomainPackage.CENTRO_MANT__USUARIOS_ATENDIDOS:
				return usuariosAtendidos != null && !usuariosAtendidos.isEmpty();
			case DomainPackage.CENTRO_MANT__HISTORIAL_REPARACION:
				return historialReparacion != null && !historialReparacion.isEmpty();
			case DomainPackage.CENTRO_MANT__OWNED_BY_DOMAIN:
				return getOwnedByDomain() != null;
			case DomainPackage.CENTRO_MANT__UBICACION:
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
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", nombreRepresentante: ");
		result.append(nombreRepresentante);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(", usuario: ");
		result.append(usuario);
		result.append(", contrasenia: ");
		result.append(contrasenia);
		result.append(')');
		return result.toString();
	}

} //CentroMantImpl
