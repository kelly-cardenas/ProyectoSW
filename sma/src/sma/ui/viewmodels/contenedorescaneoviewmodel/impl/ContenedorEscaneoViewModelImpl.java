/**
 */
package sma.ui.viewmodels.contenedorescaneoviewmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sma.ui.UI;
import sma.ui.UiPackage;

import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel;
import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel;
import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorSeleccionautoViewModel;
import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage;

import sma.ui.viewmodels.impl.ViewModelImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Escaneo View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorEscaneoViewModelImpl#getOwnedByUI <em>Owned By UI</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorEscaneoViewModelImpl#getTheContenedorSeleccionautoViewModel <em>The Contenedor Seleccionauto View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorEscaneoViewModelImpl#getTheContenedorFallasViewModel <em>The Contenedor Fallas View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorEscaneoViewModelImpl extends ViewModelImpl implements ContenedorEscaneoViewModel {
	/**
	 * The cached value of the '{@link #getTheContenedorSeleccionautoViewModel() <em>The Contenedor Seleccionauto View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorSeleccionautoViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorSeleccionautoViewModel theContenedorSeleccionautoViewModel;

	/**
	 * The cached value of the '{@link #getTheContenedorFallasViewModel() <em>The Contenedor Fallas View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorFallasViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorFallasViewModel theContenedorFallasViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorEscaneoViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorescaneoviewmodelPackage.Literals.CONTENEDOR_ESCANEO_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getOwnedByUI() {
		if (eContainerFeatureID() != ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__OWNED_BY_UI) return null;
		return (UI)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByUI(UI newOwnedByUI, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByUI, ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__OWNED_BY_UI, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByUI(UI newOwnedByUI) {
		if (newOwnedByUI != eInternalContainer() || (eContainerFeatureID() != ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__OWNED_BY_UI && newOwnedByUI != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByUI))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByUI != null)
				msgs = ((InternalEObject)newOwnedByUI).eInverseAdd(this, UiPackage.UI__THE_CONTENEDOR_ESCANEO_VIEW_MODEL, UI.class, msgs);
			msgs = basicSetOwnedByUI(newOwnedByUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__OWNED_BY_UI, newOwnedByUI, newOwnedByUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorSeleccionautoViewModel getTheContenedorSeleccionautoViewModel() {
		return theContenedorSeleccionautoViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorSeleccionautoViewModel(ContenedorSeleccionautoViewModel newTheContenedorSeleccionautoViewModel, NotificationChain msgs) {
		ContenedorSeleccionautoViewModel oldTheContenedorSeleccionautoViewModel = theContenedorSeleccionautoViewModel;
		theContenedorSeleccionautoViewModel = newTheContenedorSeleccionautoViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_SELECCIONAUTO_VIEW_MODEL, oldTheContenedorSeleccionautoViewModel, newTheContenedorSeleccionautoViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorSeleccionautoViewModel(ContenedorSeleccionautoViewModel newTheContenedorSeleccionautoViewModel) {
		if (newTheContenedorSeleccionautoViewModel != theContenedorSeleccionautoViewModel) {
			NotificationChain msgs = null;
			if (theContenedorSeleccionautoViewModel != null)
				msgs = ((InternalEObject)theContenedorSeleccionautoViewModel).eInverseRemove(this, ContenedorescaneoviewmodelPackage.CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL, ContenedorSeleccionautoViewModel.class, msgs);
			if (newTheContenedorSeleccionautoViewModel != null)
				msgs = ((InternalEObject)newTheContenedorSeleccionautoViewModel).eInverseAdd(this, ContenedorescaneoviewmodelPackage.CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL, ContenedorSeleccionautoViewModel.class, msgs);
			msgs = basicSetTheContenedorSeleccionautoViewModel(newTheContenedorSeleccionautoViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_SELECCIONAUTO_VIEW_MODEL, newTheContenedorSeleccionautoViewModel, newTheContenedorSeleccionautoViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorFallasViewModel getTheContenedorFallasViewModel() {
		return theContenedorFallasViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorFallasViewModel(ContenedorFallasViewModel newTheContenedorFallasViewModel, NotificationChain msgs) {
		ContenedorFallasViewModel oldTheContenedorFallasViewModel = theContenedorFallasViewModel;
		theContenedorFallasViewModel = newTheContenedorFallasViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_FALLAS_VIEW_MODEL, oldTheContenedorFallasViewModel, newTheContenedorFallasViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorFallasViewModel(ContenedorFallasViewModel newTheContenedorFallasViewModel) {
		if (newTheContenedorFallasViewModel != theContenedorFallasViewModel) {
			NotificationChain msgs = null;
			if (theContenedorFallasViewModel != null)
				msgs = ((InternalEObject)theContenedorFallasViewModel).eInverseRemove(this, ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL, ContenedorFallasViewModel.class, msgs);
			if (newTheContenedorFallasViewModel != null)
				msgs = ((InternalEObject)newTheContenedorFallasViewModel).eInverseAdd(this, ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL, ContenedorFallasViewModel.class, msgs);
			msgs = basicSetTheContenedorFallasViewModel(newTheContenedorFallasViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_FALLAS_VIEW_MODEL, newTheContenedorFallasViewModel, newTheContenedorFallasViewModel));
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
	public Boolean escanearVehiculo() {
		
				
				getTheUI().escanearVehiculo(getTheContenedorSeleccionautoViewModel().getPlacavehiculo());
				return true;
				
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void implementarModelo() {
		
				
				ContenedorSeleccionautoViewModel seleccionAutoVM 	= getTheContenedorSeleccionautoViewModel();
				ContenedorFallasViewModel fallasVM					= getTheContenedorFallasViewModel();
				
				if (seleccionAutoVM == null) {
					seleccionAutoVM		= sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelFactory
											.eINSTANCE.createContenedorSeleccionautoViewModel();
				}
				
				if (fallasVM == null) {
					fallasVM			= sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelFactory
										.eINSTANCE.createContenedorFallasViewModel();
				}
				
				setTheContenedorFallasViewModel(fallasVM);
				setTheContenedorSeleccionautoViewModel(seleccionAutoVM);
				
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void mostrarEstadoVehiculo() {
		
				
				getTheUI().mostrarEstadoVehCliente(this);
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__OWNED_BY_UI:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByUI((UI)otherEnd, msgs);
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_SELECCIONAUTO_VIEW_MODEL:
				if (theContenedorSeleccionautoViewModel != null)
					msgs = ((InternalEObject)theContenedorSeleccionautoViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_SELECCIONAUTO_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorSeleccionautoViewModel((ContenedorSeleccionautoViewModel)otherEnd, msgs);
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_FALLAS_VIEW_MODEL:
				if (theContenedorFallasViewModel != null)
					msgs = ((InternalEObject)theContenedorFallasViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_FALLAS_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorFallasViewModel((ContenedorFallasViewModel)otherEnd, msgs);
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__OWNED_BY_UI:
				return basicSetOwnedByUI(null, msgs);
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_SELECCIONAUTO_VIEW_MODEL:
				return basicSetTheContenedorSeleccionautoViewModel(null, msgs);
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_FALLAS_VIEW_MODEL:
				return basicSetTheContenedorFallasViewModel(null, msgs);
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__OWNED_BY_UI:
				return eInternalContainer().eInverseRemove(this, UiPackage.UI__THE_CONTENEDOR_ESCANEO_VIEW_MODEL, UI.class, msgs);
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__OWNED_BY_UI:
				return getOwnedByUI();
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_SELECCIONAUTO_VIEW_MODEL:
				return getTheContenedorSeleccionautoViewModel();
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_FALLAS_VIEW_MODEL:
				return getTheContenedorFallasViewModel();
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__OWNED_BY_UI:
				setOwnedByUI((UI)newValue);
				return;
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_SELECCIONAUTO_VIEW_MODEL:
				setTheContenedorSeleccionautoViewModel((ContenedorSeleccionautoViewModel)newValue);
				return;
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_FALLAS_VIEW_MODEL:
				setTheContenedorFallasViewModel((ContenedorFallasViewModel)newValue);
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__OWNED_BY_UI:
				setOwnedByUI((UI)null);
				return;
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_SELECCIONAUTO_VIEW_MODEL:
				setTheContenedorSeleccionautoViewModel((ContenedorSeleccionautoViewModel)null);
				return;
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_FALLAS_VIEW_MODEL:
				setTheContenedorFallasViewModel((ContenedorFallasViewModel)null);
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__OWNED_BY_UI:
				return getOwnedByUI() != null;
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_SELECCIONAUTO_VIEW_MODEL:
				return theContenedorSeleccionautoViewModel != null;
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_FALLAS_VIEW_MODEL:
				return theContenedorFallasViewModel != null;
		}
		return super.eIsSet(featureID);
	}

} //ContenedorEscaneoViewModelImpl
