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

import sma.ui.UI;
import sma.ui.UiPackage;

import sma.ui.viewmodels.contenedorloginviewmodel.ContenedorDetalleLoginViewModel;
import sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel;
import sma.ui.viewmodels.contenedorloginviewmodel.ContenedorloginviewmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Login View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorloginviewmodel.impl.ContenedorLoginViewModelImpl#getOwnedByUI <em>Owned By UI</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorloginviewmodel.impl.ContenedorLoginViewModelImpl#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorloginviewmodel.impl.ContenedorLoginViewModelImpl#getTheContenedorDetalleLoginViewModel <em>The Contenedor Detalle Login View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorLoginViewModelImpl extends EObjectImpl implements ContenedorLoginViewModel {
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
	 * The cached value of the '{@link #getTheContenedorDetalleLoginViewModel() <em>The Contenedor Detalle Login View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorDetalleLoginViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorDetalleLoginViewModel theContenedorDetalleLoginViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorLoginViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorloginviewmodelPackage.Literals.CONTENEDOR_LOGIN_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getOwnedByUI() {
		if (eContainerFeatureID() != ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__OWNED_BY_UI) return null;
		return (UI)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByUI(UI newOwnedByUI, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByUI, ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__OWNED_BY_UI, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByUI(UI newOwnedByUI) {
		if (newOwnedByUI != eInternalContainer() || (eContainerFeatureID() != ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__OWNED_BY_UI && newOwnedByUI != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByUI))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByUI != null)
				msgs = ((InternalEObject)newOwnedByUI).eInverseAdd(this, UiPackage.UI__THE_CONTENEDOR_LOGIN_VIEW_MODEL, UI.class, msgs);
			msgs = basicSetOwnedByUI(newOwnedByUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__OWNED_BY_UI, newOwnedByUI, newOwnedByUI));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__USUARIO, oldUsuario, usuario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDetalleLoginViewModel getTheContenedorDetalleLoginViewModel() {
		return theContenedorDetalleLoginViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorDetalleLoginViewModel(ContenedorDetalleLoginViewModel newTheContenedorDetalleLoginViewModel, NotificationChain msgs) {
		ContenedorDetalleLoginViewModel oldTheContenedorDetalleLoginViewModel = theContenedorDetalleLoginViewModel;
		theContenedorDetalleLoginViewModel = newTheContenedorDetalleLoginViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__THE_CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL, oldTheContenedorDetalleLoginViewModel, newTheContenedorDetalleLoginViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorDetalleLoginViewModel(ContenedorDetalleLoginViewModel newTheContenedorDetalleLoginViewModel) {
		if (newTheContenedorDetalleLoginViewModel != theContenedorDetalleLoginViewModel) {
			NotificationChain msgs = null;
			if (theContenedorDetalleLoginViewModel != null)
				msgs = ((InternalEObject)theContenedorDetalleLoginViewModel).eInverseRemove(this, ContenedorloginviewmodelPackage.CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__OWNED_BY_CONTENEDOR_LOGIN_VIEW_MODEL, ContenedorDetalleLoginViewModel.class, msgs);
			if (newTheContenedorDetalleLoginViewModel != null)
				msgs = ((InternalEObject)newTheContenedorDetalleLoginViewModel).eInverseAdd(this, ContenedorloginviewmodelPackage.CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL__OWNED_BY_CONTENEDOR_LOGIN_VIEW_MODEL, ContenedorDetalleLoginViewModel.class, msgs);
			msgs = basicSetTheContenedorDetalleLoginViewModel(newTheContenedorDetalleLoginViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__THE_CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL, newTheContenedorDetalleLoginViewModel, newTheContenedorDetalleLoginViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String upadateDialog(final String evento) {
		
				String action = "";
				return action;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void prueba() {
		//TODO prueba
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void implementarModelo() {
		
		// codigo para implementar modelo
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__OWNED_BY_UI:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByUI((UI)otherEnd, msgs);
			case ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__THE_CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL:
				if (theContenedorDetalleLoginViewModel != null)
					msgs = ((InternalEObject)theContenedorDetalleLoginViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__THE_CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorDetalleLoginViewModel((ContenedorDetalleLoginViewModel)otherEnd, msgs);
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
			case ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__OWNED_BY_UI:
				return basicSetOwnedByUI(null, msgs);
			case ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__THE_CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL:
				return basicSetTheContenedorDetalleLoginViewModel(null, msgs);
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
			case ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__OWNED_BY_UI:
				return eInternalContainer().eInverseRemove(this, UiPackage.UI__THE_CONTENEDOR_LOGIN_VIEW_MODEL, UI.class, msgs);
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
			case ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__OWNED_BY_UI:
				return getOwnedByUI();
			case ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__USUARIO:
				return getUsuario();
			case ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__THE_CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL:
				return getTheContenedorDetalleLoginViewModel();
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
			case ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__OWNED_BY_UI:
				setOwnedByUI((UI)newValue);
				return;
			case ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__USUARIO:
				setUsuario((String)newValue);
				return;
			case ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__THE_CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL:
				setTheContenedorDetalleLoginViewModel((ContenedorDetalleLoginViewModel)newValue);
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
			case ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__OWNED_BY_UI:
				setOwnedByUI((UI)null);
				return;
			case ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__USUARIO:
				setUsuario(USUARIO_EDEFAULT);
				return;
			case ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__THE_CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL:
				setTheContenedorDetalleLoginViewModel((ContenedorDetalleLoginViewModel)null);
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
			case ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__OWNED_BY_UI:
				return getOwnedByUI() != null;
			case ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__USUARIO:
				return USUARIO_EDEFAULT == null ? usuario != null : !USUARIO_EDEFAULT.equals(usuario);
			case ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__THE_CONTENEDOR_DETALLE_LOGIN_VIEW_MODEL:
				return theContenedorDetalleLoginViewModel != null;
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

} //ContenedorLoginViewModelImpl
