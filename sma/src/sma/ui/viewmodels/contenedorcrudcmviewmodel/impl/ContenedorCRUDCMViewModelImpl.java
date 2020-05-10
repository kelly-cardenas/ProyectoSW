/**
 */
package sma.ui.viewmodels.contenedorcrudcmviewmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sma.ui.UI;
import sma.ui.UiPackage;

import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorMaestroCMViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor CRUDCM View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorCRUDCMViewModelImpl#getOwnedByUI <em>Owned By UI</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorCRUDCMViewModelImpl#getTheContenedorDetalleCMViewModel <em>The Contenedor Detalle CM View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorCRUDCMViewModelImpl#getTheContenedorMaestroCMViewModel <em>The Contenedor Maestro CM View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorCRUDCMViewModelImpl extends EObjectImpl implements ContenedorCRUDCMViewModel {
	/**
	 * The cached value of the '{@link #getTheContenedorDetalleCMViewModel() <em>The Contenedor Detalle CM View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorDetalleCMViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorDetalleCMViewModel theContenedorDetalleCMViewModel;

	/**
	 * The cached value of the '{@link #getTheContenedorMaestroCMViewModel() <em>The Contenedor Maestro CM View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorMaestroCMViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorMaestroCMViewModel theContenedorMaestroCMViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorCRUDCMViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudcmviewmodelPackage.Literals.CONTENEDOR_CRUDCM_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getOwnedByUI() {
		if (eContainerFeatureID() != ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__OWNED_BY_UI) return null;
		return (UI)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByUI(UI newOwnedByUI, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByUI, ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__OWNED_BY_UI, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByUI(UI newOwnedByUI) {
		if (newOwnedByUI != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__OWNED_BY_UI && newOwnedByUI != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByUI))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByUI != null)
				msgs = ((InternalEObject)newOwnedByUI).eInverseAdd(this, UiPackage.UI__THE_CONTENEDOR_CRUDCM_VIEW_MODEL, UI.class, msgs);
			msgs = basicSetOwnedByUI(newOwnedByUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__OWNED_BY_UI, newOwnedByUI, newOwnedByUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDetalleCMViewModel getTheContenedorDetalleCMViewModel() {
		return theContenedorDetalleCMViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorDetalleCMViewModel(ContenedorDetalleCMViewModel newTheContenedorDetalleCMViewModel, NotificationChain msgs) {
		ContenedorDetalleCMViewModel oldTheContenedorDetalleCMViewModel = theContenedorDetalleCMViewModel;
		theContenedorDetalleCMViewModel = newTheContenedorDetalleCMViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CM_VIEW_MODEL, oldTheContenedorDetalleCMViewModel, newTheContenedorDetalleCMViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorDetalleCMViewModel(ContenedorDetalleCMViewModel newTheContenedorDetalleCMViewModel) {
		if (newTheContenedorDetalleCMViewModel != theContenedorDetalleCMViewModel) {
			NotificationChain msgs = null;
			if (theContenedorDetalleCMViewModel != null)
				msgs = ((InternalEObject)theContenedorDetalleCMViewModel).eInverseRemove(this, ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL, ContenedorDetalleCMViewModel.class, msgs);
			if (newTheContenedorDetalleCMViewModel != null)
				msgs = ((InternalEObject)newTheContenedorDetalleCMViewModel).eInverseAdd(this, ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL, ContenedorDetalleCMViewModel.class, msgs);
			msgs = basicSetTheContenedorDetalleCMViewModel(newTheContenedorDetalleCMViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CM_VIEW_MODEL, newTheContenedorDetalleCMViewModel, newTheContenedorDetalleCMViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMaestroCMViewModel getTheContenedorMaestroCMViewModel() {
		return theContenedorMaestroCMViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorMaestroCMViewModel(ContenedorMaestroCMViewModel newTheContenedorMaestroCMViewModel, NotificationChain msgs) {
		ContenedorMaestroCMViewModel oldTheContenedorMaestroCMViewModel = theContenedorMaestroCMViewModel;
		theContenedorMaestroCMViewModel = newTheContenedorMaestroCMViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CM_VIEW_MODEL, oldTheContenedorMaestroCMViewModel, newTheContenedorMaestroCMViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorMaestroCMViewModel(ContenedorMaestroCMViewModel newTheContenedorMaestroCMViewModel) {
		if (newTheContenedorMaestroCMViewModel != theContenedorMaestroCMViewModel) {
			NotificationChain msgs = null;
			if (theContenedorMaestroCMViewModel != null)
				msgs = ((InternalEObject)theContenedorMaestroCMViewModel).eInverseRemove(this, ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL, ContenedorMaestroCMViewModel.class, msgs);
			if (newTheContenedorMaestroCMViewModel != null)
				msgs = ((InternalEObject)newTheContenedorMaestroCMViewModel).eInverseAdd(this, ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL, ContenedorMaestroCMViewModel.class, msgs);
			msgs = basicSetTheContenedorMaestroCMViewModel(newTheContenedorMaestroCMViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CM_VIEW_MODEL, newTheContenedorMaestroCMViewModel, newTheContenedorMaestroCMViewModel));
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
	public void implementarModelo() {
			ContenedorDetalleCMViewModel detalleCMVM = getTheContenedorDetalleCMViewModel();
				ContenedorMaestroCMViewModel maestroCMVM = getTheContenedorMaestroCMViewModel();
				
				if ( detalleCMVM == null ) {
					detalleCMVM = sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelFactory
								.eINSTANCE.createContenedorDetalleCMViewModel();
				}
				
				if ( maestroCMVM == null ) {
					
					maestroCMVM = sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelFactory
								.eINSTANCE.createContenedorMaestroCMViewModel();
					
				}
				
				setTheContenedorDetalleCMViewModel(detalleCMVM);
				setTheContenedorMaestroCMViewModel(maestroCMVM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registrarCm() {
		getOwnedByUI().RegistrarCm(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__OWNED_BY_UI:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByUI((UI)otherEnd, msgs);
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CM_VIEW_MODEL:
				if (theContenedorDetalleCMViewModel != null)
					msgs = ((InternalEObject)theContenedorDetalleCMViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CM_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorDetalleCMViewModel((ContenedorDetalleCMViewModel)otherEnd, msgs);
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CM_VIEW_MODEL:
				if (theContenedorMaestroCMViewModel != null)
					msgs = ((InternalEObject)theContenedorMaestroCMViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CM_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorMaestroCMViewModel((ContenedorMaestroCMViewModel)otherEnd, msgs);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__OWNED_BY_UI:
				return basicSetOwnedByUI(null, msgs);
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CM_VIEW_MODEL:
				return basicSetTheContenedorDetalleCMViewModel(null, msgs);
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CM_VIEW_MODEL:
				return basicSetTheContenedorMaestroCMViewModel(null, msgs);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__OWNED_BY_UI:
				return eInternalContainer().eInverseRemove(this, UiPackage.UI__THE_CONTENEDOR_CRUDCM_VIEW_MODEL, UI.class, msgs);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__OWNED_BY_UI:
				return getOwnedByUI();
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CM_VIEW_MODEL:
				return getTheContenedorDetalleCMViewModel();
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CM_VIEW_MODEL:
				return getTheContenedorMaestroCMViewModel();
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__OWNED_BY_UI:
				setOwnedByUI((UI)newValue);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CM_VIEW_MODEL:
				setTheContenedorDetalleCMViewModel((ContenedorDetalleCMViewModel)newValue);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CM_VIEW_MODEL:
				setTheContenedorMaestroCMViewModel((ContenedorMaestroCMViewModel)newValue);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__OWNED_BY_UI:
				setOwnedByUI((UI)null);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CM_VIEW_MODEL:
				setTheContenedorDetalleCMViewModel((ContenedorDetalleCMViewModel)null);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CM_VIEW_MODEL:
				setTheContenedorMaestroCMViewModel((ContenedorMaestroCMViewModel)null);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__OWNED_BY_UI:
				return getOwnedByUI() != null;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CM_VIEW_MODEL:
				return theContenedorDetalleCMViewModel != null;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CM_VIEW_MODEL:
				return theContenedorMaestroCMViewModel != null;
		}
		return super.eIsSet(featureID);
	}

} //ContenedorCRUDCMViewModelImpl
