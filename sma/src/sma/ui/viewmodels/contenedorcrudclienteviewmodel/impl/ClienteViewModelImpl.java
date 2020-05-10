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

import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorMaestroClienteViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cliente View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ClienteViewModelImpl#getIdentificacion <em>Identificacion</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ClienteViewModelImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ClienteViewModelImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ClienteViewModelImpl#getEdad <em>Edad</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ClienteViewModelImpl#getThe0ContenedorMaestroClienteViewModel <em>The0 Contenedor Maestro Cliente View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ClienteViewModelImpl#getTheContenedorMaestroClienteViewModel <em>The Contenedor Maestro Cliente View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClienteViewModelImpl extends EObjectImpl implements ClienteViewModel {
	/**
	 * The default value of the '{@link #getIdentificacion() <em>Identificacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificacion()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFICACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentificacion() <em>Identificacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificacion()
	 * @generated
	 * @ordered
	 */
	protected String identificacion = IDENTIFICACION_EDEFAULT;

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
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

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
	 * The cached value of the '{@link #getTheContenedorMaestroClienteViewModel() <em>The Contenedor Maestro Cliente View Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorMaestroClienteViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorMaestroClienteViewModel theContenedorMaestroClienteViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClienteViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudclienteviewmodelPackage.Literals.CLIENTE_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentificacion() {
		return identificacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentificacion(String newIdentificacion) {
		String oldIdentificacion = identificacion;
		identificacion = newIdentificacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__IDENTIFICACION, oldIdentificacion, identificacion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__EMAIL, oldEmail, email));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__EDAD, oldEdad, edad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMaestroClienteViewModel getThe0ContenedorMaestroClienteViewModel() {
		if (eContainerFeatureID() != ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL) return null;
		return (ContenedorMaestroClienteViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThe0ContenedorMaestroClienteViewModel(ContenedorMaestroClienteViewModel newThe0ContenedorMaestroClienteViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newThe0ContenedorMaestroClienteViewModel, ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThe0ContenedorMaestroClienteViewModel(ContenedorMaestroClienteViewModel newThe0ContenedorMaestroClienteViewModel) {
		if (newThe0ContenedorMaestroClienteViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL && newThe0ContenedorMaestroClienteViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newThe0ContenedorMaestroClienteViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newThe0ContenedorMaestroClienteViewModel != null)
				msgs = ((InternalEObject)newThe0ContenedorMaestroClienteViewModel).eInverseAdd(this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CLIENTE_VIEW_MODEL, ContenedorMaestroClienteViewModel.class, msgs);
			msgs = basicSetThe0ContenedorMaestroClienteViewModel(newThe0ContenedorMaestroClienteViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL, newThe0ContenedorMaestroClienteViewModel, newThe0ContenedorMaestroClienteViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMaestroClienteViewModel getTheContenedorMaestroClienteViewModel() {
		if (theContenedorMaestroClienteViewModel != null && theContenedorMaestroClienteViewModel.eIsProxy()) {
			InternalEObject oldTheContenedorMaestroClienteViewModel = (InternalEObject)theContenedorMaestroClienteViewModel;
			theContenedorMaestroClienteViewModel = (ContenedorMaestroClienteViewModel)eResolveProxy(oldTheContenedorMaestroClienteViewModel);
			if (theContenedorMaestroClienteViewModel != oldTheContenedorMaestroClienteViewModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL, oldTheContenedorMaestroClienteViewModel, theContenedorMaestroClienteViewModel));
			}
		}
		return theContenedorMaestroClienteViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMaestroClienteViewModel basicGetTheContenedorMaestroClienteViewModel() {
		return theContenedorMaestroClienteViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorMaestroClienteViewModel(ContenedorMaestroClienteViewModel newTheContenedorMaestroClienteViewModel, NotificationChain msgs) {
		ContenedorMaestroClienteViewModel oldTheContenedorMaestroClienteViewModel = theContenedorMaestroClienteViewModel;
		theContenedorMaestroClienteViewModel = newTheContenedorMaestroClienteViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL, oldTheContenedorMaestroClienteViewModel, newTheContenedorMaestroClienteViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorMaestroClienteViewModel(ContenedorMaestroClienteViewModel newTheContenedorMaestroClienteViewModel) {
		if (newTheContenedorMaestroClienteViewModel != theContenedorMaestroClienteViewModel) {
			NotificationChain msgs = null;
			if (theContenedorMaestroClienteViewModel != null)
				msgs = ((InternalEObject)theContenedorMaestroClienteViewModel).eInverseRemove(this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL, ContenedorMaestroClienteViewModel.class, msgs);
			if (newTheContenedorMaestroClienteViewModel != null)
				msgs = ((InternalEObject)newTheContenedorMaestroClienteViewModel).eInverseAdd(this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL, ContenedorMaestroClienteViewModel.class, msgs);
			msgs = basicSetTheContenedorMaestroClienteViewModel(newTheContenedorMaestroClienteViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL, newTheContenedorMaestroClienteViewModel, newTheContenedorMaestroClienteViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetThe0ContenedorMaestroClienteViewModel((ContenedorMaestroClienteViewModel)otherEnd, msgs);
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				if (theContenedorMaestroClienteViewModel != null)
					msgs = ((InternalEObject)theContenedorMaestroClienteViewModel).eInverseRemove(this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL, ContenedorMaestroClienteViewModel.class, msgs);
				return basicSetTheContenedorMaestroClienteViewModel((ContenedorMaestroClienteViewModel)otherEnd, msgs);
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
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				return basicSetThe0ContenedorMaestroClienteViewModel(null, msgs);
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				return basicSetTheContenedorMaestroClienteViewModel(null, msgs);
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
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CLIENTE_VIEW_MODEL, ContenedorMaestroClienteViewModel.class, msgs);
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
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__IDENTIFICACION:
				return getIdentificacion();
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__NOMBRE:
				return getNombre();
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__EMAIL:
				return getEmail();
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__EDAD:
				return getEdad();
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				return getThe0ContenedorMaestroClienteViewModel();
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				if (resolve) return getTheContenedorMaestroClienteViewModel();
				return basicGetTheContenedorMaestroClienteViewModel();
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
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__IDENTIFICACION:
				setIdentificacion((String)newValue);
				return;
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__NOMBRE:
				setNombre((String)newValue);
				return;
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__EMAIL:
				setEmail((String)newValue);
				return;
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__EDAD:
				setEdad((String)newValue);
				return;
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				setThe0ContenedorMaestroClienteViewModel((ContenedorMaestroClienteViewModel)newValue);
				return;
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				setTheContenedorMaestroClienteViewModel((ContenedorMaestroClienteViewModel)newValue);
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
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__IDENTIFICACION:
				setIdentificacion(IDENTIFICACION_EDEFAULT);
				return;
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__EDAD:
				setEdad(EDAD_EDEFAULT);
				return;
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				setThe0ContenedorMaestroClienteViewModel((ContenedorMaestroClienteViewModel)null);
				return;
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				setTheContenedorMaestroClienteViewModel((ContenedorMaestroClienteViewModel)null);
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
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__IDENTIFICACION:
				return IDENTIFICACION_EDEFAULT == null ? identificacion != null : !IDENTIFICACION_EDEFAULT.equals(identificacion);
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__EDAD:
				return EDAD_EDEFAULT == null ? edad != null : !EDAD_EDEFAULT.equals(edad);
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				return getThe0ContenedorMaestroClienteViewModel() != null;
			case ContenedorcrudclienteviewmodelPackage.CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				return theContenedorMaestroClienteViewModel != null;
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
		result.append(" (identificacion: ");
		result.append(identificacion);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", email: ");
		result.append(email);
		result.append(", edad: ");
		result.append(edad);
		result.append(')');
		return result.toString();
	}

} //ClienteViewModelImpl
