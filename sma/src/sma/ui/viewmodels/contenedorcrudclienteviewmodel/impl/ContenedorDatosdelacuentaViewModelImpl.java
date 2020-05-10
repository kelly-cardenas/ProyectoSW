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

import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosdelacuentaViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Datosdelacuenta View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDatosdelacuentaViewModelImpl#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDatosdelacuentaViewModelImpl#getContraseña <em>Contraseña</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDatosdelacuentaViewModelImpl#getOwnedByContenedorDetalleClienteViewModel <em>Owned By Contenedor Detalle Cliente View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorDatosdelacuentaViewModelImpl extends EObjectImpl implements ContenedorDatosdelacuentaViewModel {
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
	 * The default value of the '{@link #getContraseña() <em>Contraseña</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraseña()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRASEÑA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContraseña() <em>Contraseña</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraseña()
	 * @generated
	 * @ordered
	 */
	protected String contraseña = CONTRASEÑA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorDatosdelacuentaViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudclienteviewmodelPackage.Literals.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__USUARIO, oldUsuario, usuario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContraseña() {
		return contraseña;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContraseña(String newContraseña) {
		String oldContraseña = contraseña;
		contraseña = newContraseña;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__CONTRASEÑA, oldContraseña, contraseña));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDetalleClienteViewModel getOwnedByContenedorDetalleClienteViewModel() {
		if (eContainerFeatureID() != ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL) return null;
		return (ContenedorDetalleClienteViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorDetalleClienteViewModel(ContenedorDetalleClienteViewModel newOwnedByContenedorDetalleClienteViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorDetalleClienteViewModel, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorDetalleClienteViewModel(ContenedorDetalleClienteViewModel newOwnedByContenedorDetalleClienteViewModel) {
		if (newOwnedByContenedorDetalleClienteViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL && newOwnedByContenedorDetalleClienteViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorDetalleClienteViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorDetalleClienteViewModel != null)
				msgs = ((InternalEObject)newOwnedByContenedorDetalleClienteViewModel).eInverseAdd(this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL, ContenedorDetalleClienteViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorDetalleClienteViewModel(newOwnedByContenedorDetalleClienteViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL, newOwnedByContenedorDetalleClienteViewModel, newOwnedByContenedorDetalleClienteViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL, ContenedorDetalleClienteViewModel.class, msgs);
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__USUARIO:
				return getUsuario();
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__CONTRASEÑA:
				return getContraseña();
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__USUARIO:
				setUsuario((String)newValue);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__CONTRASEÑA:
				setContraseña((String)newValue);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__USUARIO:
				setUsuario(USUARIO_EDEFAULT);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__CONTRASEÑA:
				setContraseña(CONTRASEÑA_EDEFAULT);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__USUARIO:
				return USUARIO_EDEFAULT == null ? usuario != null : !USUARIO_EDEFAULT.equals(usuario);
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__CONTRASEÑA:
				return CONTRASEÑA_EDEFAULT == null ? contraseña != null : !CONTRASEÑA_EDEFAULT.equals(contraseña);
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
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
		result.append(" (usuario: ");
		result.append(usuario);
		result.append(", contraseña: ");
		result.append(contraseña);
		result.append(')');
		return result.toString();
	}

} //ContenedorDatosdelacuentaViewModelImpl
