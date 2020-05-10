/**
 */
package sma.ui.viewmodels.contenedorloginviewmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sma.ui.viewmodels.contenedorloginviewmodel.ContenedorDetalleLoginViewModel;
import sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel;
import sma.ui.viewmodels.contenedorloginviewmodel.ContenedorloginviewmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Detalle Login View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorloginviewmodel.impl.ContenedorDetalleLoginViewModelImpl#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorloginviewmodel.impl.ContenedorDetalleLoginViewModelImpl#getOwnedByContenedorLoginViewModel <em>Owned By Contenedor Login View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorDetalleLoginViewModelImpl extends EObjectImpl implements ContenedorDetalleLoginViewModel {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorDetalleLoginViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorloginviewmodelPackage.Literals.CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorloginviewmodelPackage.CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__USUARIO, oldUsuario, usuario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorLoginViewModel getOwnedByContenedorLoginViewModel() {
		if (eContainerFeatureID() != ContenedorloginviewmodelPackage.CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__OWNED_BY_CONTENEDOR_LOGIN_VIEW_MODEL) return null;
		return (ContenedorLoginViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorLoginViewModel(ContenedorLoginViewModel newOwnedByContenedorLoginViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorLoginViewModel, ContenedorloginviewmodelPackage.CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__OWNED_BY_CONTENEDOR_LOGIN_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorLoginViewModel(ContenedorLoginViewModel newOwnedByContenedorLoginViewModel) {
		if (newOwnedByContenedorLoginViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorloginviewmodelPackage.CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__OWNED_BY_CONTENEDOR_LOGIN_VIEW_MODEL && newOwnedByContenedorLoginViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorLoginViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorLoginViewModel != null)
				msgs = ((InternalEObject)newOwnedByContenedorLoginViewModel).eInverseAdd(this, ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__THE_CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL, ContenedorLoginViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorLoginViewModel(newOwnedByContenedorLoginViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorloginviewmodelPackage.CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__OWNED_BY_CONTENEDOR_LOGIN_VIEW_MODEL, newOwnedByContenedorLoginViewModel, newOwnedByContenedorLoginViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorloginviewmodelPackage.CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__OWNED_BY_CONTENEDOR_LOGIN_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByContenedorLoginViewModel((ContenedorLoginViewModel)otherEnd, msgs);
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
			case ContenedorloginviewmodelPackage.CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__OWNED_BY_CONTENEDOR_LOGIN_VIEW_MODEL:
				return basicSetOwnedByContenedorLoginViewModel(null, msgs);
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
			case ContenedorloginviewmodelPackage.CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__OWNED_BY_CONTENEDOR_LOGIN_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__THE_CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL, ContenedorLoginViewModel.class, msgs);
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
			case ContenedorloginviewmodelPackage.CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__USUARIO:
				return getUsuario();
			case ContenedorloginviewmodelPackage.CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__OWNED_BY_CONTENEDOR_LOGIN_VIEW_MODEL:
				return getOwnedByContenedorLoginViewModel();
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
			case ContenedorloginviewmodelPackage.CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__USUARIO:
				setUsuario((String)newValue);
				return;
			case ContenedorloginviewmodelPackage.CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__OWNED_BY_CONTENEDOR_LOGIN_VIEW_MODEL:
				setOwnedByContenedorLoginViewModel((ContenedorLoginViewModel)newValue);
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
			case ContenedorloginviewmodelPackage.CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__USUARIO:
				setUsuario(USUARIO_EDEFAULT);
				return;
			case ContenedorloginviewmodelPackage.CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__OWNED_BY_CONTENEDOR_LOGIN_VIEW_MODEL:
				setOwnedByContenedorLoginViewModel((ContenedorLoginViewModel)null);
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
			case ContenedorloginviewmodelPackage.CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__USUARIO:
				return USUARIO_EDEFAULT == null ? usuario != null : !USUARIO_EDEFAULT.equals(usuario);
			case ContenedorloginviewmodelPackage.CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__OWNED_BY_CONTENEDOR_LOGIN_VIEW_MODEL:
				return getOwnedByContenedorLoginViewModel() != null;
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
		result.append(')');
		return result.toString();
	}

} //ContenedorDetalleLoginViewModelImpl
