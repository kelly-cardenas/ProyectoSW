/**
 */
package sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosPersonalesViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Datos Personales View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDatosPersonalesViewModelImpl#getCedula <em>Cedula</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDatosPersonalesViewModelImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDatosPersonalesViewModelImpl#getApellido <em>Apellido</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDatosPersonalesViewModelImpl#getEdad <em>Edad</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDatosPersonalesViewModelImpl#getCorreoelectronico <em>Correoelectronico</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDatosPersonalesViewModelImpl#getOwnedByContenedorDetalleClienteViewModel <em>Owned By Contenedor Detalle Cliente View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorDatosPersonalesViewModelImpl extends EObjectImpl implements ContenedorDatosPersonalesViewModel {
	/**
	 * The default value of the '{@link #getCedula() <em>Cedula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCedula()
	 * @generated
	 * @ordered
	 */
	protected static final String CEDULA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCedula() <em>Cedula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCedula()
	 * @generated
	 * @ordered
	 */
	protected String cedula = CEDULA_EDEFAULT;

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
	 * The default value of the '{@link #getApellido() <em>Apellido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApellido()
	 * @generated
	 * @ordered
	 */
	protected static final String APELLIDO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApellido() <em>Apellido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApellido()
	 * @generated
	 * @ordered
	 */
	protected String apellido = APELLIDO_EDEFAULT;

	/**
	 * The default value of the '{@link #getEdad() <em>Edad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdad()
	 * @generated
	 * @ordered
	 */
	protected static final String EDAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEdad() <em>Edad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdad()
	 * @generated
	 * @ordered
	 */
	protected String edad = EDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCorreoelectronico() <em>Correoelectronico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorreoelectronico()
	 * @generated
	 * @ordered
	 */
	protected static final String CORREOELECTRONICO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorreoelectronico() <em>Correoelectronico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorreoelectronico()
	 * @generated
	 * @ordered
	 */
	protected String correoelectronico = CORREOELECTRONICO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorDatosPersonalesViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudclienteviewmodelPackage.Literals.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCedula() {
		return cedula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCedula(String newCedula) {
		String oldCedula = cedula;
		cedula = newCedula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__CEDULA, oldCedula, cedula));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApellido(String newApellido) {
		String oldApellido = apellido;
		apellido = newApellido;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__APELLIDO, oldApellido, apellido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEdad() {
		return edad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdad(String newEdad) {
		String oldEdad = edad;
		edad = newEdad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__EDAD, oldEdad, edad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCorreoelectronico() {
		return correoelectronico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorreoelectronico(String newCorreoelectronico) {
		String oldCorreoelectronico = correoelectronico;
		correoelectronico = newCorreoelectronico;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__CORREOELECTRONICO, oldCorreoelectronico, correoelectronico));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDetalleClienteViewModel getOwnedByContenedorDetalleClienteViewModel() {
		if (eContainerFeatureID() != ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL) return null;
		return (ContenedorDetalleClienteViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorDetalleClienteViewModel(ContenedorDetalleClienteViewModel newOwnedByContenedorDetalleClienteViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorDetalleClienteViewModel, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorDetalleClienteViewModel(ContenedorDetalleClienteViewModel newOwnedByContenedorDetalleClienteViewModel) {
		if (newOwnedByContenedorDetalleClienteViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL && newOwnedByContenedorDetalleClienteViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorDetalleClienteViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorDetalleClienteViewModel != null)
				msgs = ((InternalEObject)newOwnedByContenedorDetalleClienteViewModel).eInverseAdd(this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL, ContenedorDetalleClienteViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorDetalleClienteViewModel(newOwnedByContenedorDetalleClienteViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL, newOwnedByContenedorDetalleClienteViewModel, newOwnedByContenedorDetalleClienteViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByContenedorDetalleClienteViewModel((ContenedorDetalleClienteViewModel)otherEnd, msgs);
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
				return basicSetOwnedByContenedorDetalleClienteViewModel(null, msgs);
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL, ContenedorDetalleClienteViewModel.class, msgs);
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__CEDULA:
				return getCedula();
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__NOMBRE:
				return getNombre();
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__APELLIDO:
				return getApellido();
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__EDAD:
				return getEdad();
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__CORREOELECTRONICO:
				return getCorreoelectronico();
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
				return getOwnedByContenedorDetalleClienteViewModel();
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__CEDULA:
				setCedula((String)newValue);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__NOMBRE:
				setNombre((String)newValue);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__APELLIDO:
				setApellido((String)newValue);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__EDAD:
				setEdad((String)newValue);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__CORREOELECTRONICO:
				setCorreoelectronico((String)newValue);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
				setOwnedByContenedorDetalleClienteViewModel((ContenedorDetalleClienteViewModel)newValue);
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__CEDULA:
				setCedula(CEDULA_EDEFAULT);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__APELLIDO:
				setApellido(APELLIDO_EDEFAULT);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__EDAD:
				setEdad(EDAD_EDEFAULT);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__CORREOELECTRONICO:
				setCorreoelectronico(CORREOELECTRONICO_EDEFAULT);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
				setOwnedByContenedorDetalleClienteViewModel((ContenedorDetalleClienteViewModel)null);
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__CEDULA:
				return CEDULA_EDEFAULT == null ? cedula != null : !CEDULA_EDEFAULT.equals(cedula);
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__APELLIDO:
				return APELLIDO_EDEFAULT == null ? apellido != null : !APELLIDO_EDEFAULT.equals(apellido);
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__EDAD:
				return EDAD_EDEFAULT == null ? edad != null : !EDAD_EDEFAULT.equals(edad);
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__CORREOELECTRONICO:
				return CORREOELECTRONICO_EDEFAULT == null ? correoelectronico != null : !CORREOELECTRONICO_EDEFAULT.equals(correoelectronico);
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
				return getOwnedByContenedorDetalleClienteViewModel() != null;
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
		result.append(" (cedula: ");
		result.append(cedula);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", apellido: ");
		result.append(apellido);
		result.append(", edad: ");
		result.append(edad);
		result.append(", correoelectronico: ");
		result.append(correoelectronico);
		result.append(')');
		return result.toString();
	}

} //ContenedorDatosPersonalesViewModelImpl
