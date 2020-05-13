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
import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel;
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
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorEscaneoViewModelImpl#getTheContenedorInformacionEmisionGasesViewModel <em>The Contenedor Informacion Emision Gases View Model</em>}</li>
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
	 * The cached value of the '{@link #getTheContenedorInformacionEmisionGasesViewModel() <em>The Contenedor Informacion Emision Gases View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorInformacionEmisionGasesViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorInformacionEmisionGasesViewModel theContenedorInformacionEmisionGasesViewModel;

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
	public ContenedorInformacionEmisionGasesViewModel getTheContenedorInformacionEmisionGasesViewModel() {
		return theContenedorInformacionEmisionGasesViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorInformacionEmisionGasesViewModel(ContenedorInformacionEmisionGasesViewModel newTheContenedorInformacionEmisionGasesViewModel, NotificationChain msgs) {
		ContenedorInformacionEmisionGasesViewModel oldTheContenedorInformacionEmisionGasesViewModel = theContenedorInformacionEmisionGasesViewModel;
		theContenedorInformacionEmisionGasesViewModel = newTheContenedorInformacionEmisionGasesViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL, oldTheContenedorInformacionEmisionGasesViewModel, newTheContenedorInformacionEmisionGasesViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorInformacionEmisionGasesViewModel(ContenedorInformacionEmisionGasesViewModel newTheContenedorInformacionEmisionGasesViewModel) {
		if (newTheContenedorInformacionEmisionGasesViewModel != theContenedorInformacionEmisionGasesViewModel) {
			NotificationChain msgs = null;
			if (theContenedorInformacionEmisionGasesViewModel != null)
				msgs = ((InternalEObject)theContenedorInformacionEmisionGasesViewModel).eInverseRemove(this, ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL, ContenedorInformacionEmisionGasesViewModel.class, msgs);
			if (newTheContenedorInformacionEmisionGasesViewModel != null)
				msgs = ((InternalEObject)newTheContenedorInformacionEmisionGasesViewModel).eInverseAdd(this, ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL, ContenedorInformacionEmisionGasesViewModel.class, msgs);
			msgs = basicSetTheContenedorInformacionEmisionGasesViewModel(newTheContenedorInformacionEmisionGasesViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL, newTheContenedorInformacionEmisionGasesViewModel, newTheContenedorInformacionEmisionGasesViewModel));
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
		
				
				ContenedorSeleccionautoViewModel seleccionAutoVM = getTheContenedorSeleccionautoViewModel();
				ContenedorInformacionEmisionGasesViewModel infoEmision = getTheContenedorInformacionEmisionGasesViewModel();
				
				if (seleccionAutoVM == null) {
					seleccionAutoVM = sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelFactory.eINSTANCE
									.createContenedorSeleccionautoViewModel();
				}
				
				if (infoEmision == null) {
					infoEmision = sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelFactory.eINSTANCE
									.createContenedorInformacionEmisionGasesViewModel();
				}
				
				setTheContenedorInformacionEmisionGasesViewModel(infoEmision);
				setTheContenedorSeleccionautoViewModel(seleccionAutoVM);
				
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void realizarEscaneo() {
		
		
				getOwnedByUI().escanearVehiculo(this);
		
			
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL:
				if (theContenedorInformacionEmisionGasesViewModel != null)
					msgs = ((InternalEObject)theContenedorInformacionEmisionGasesViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorInformacionEmisionGasesViewModel((ContenedorInformacionEmisionGasesViewModel)otherEnd, msgs);
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL:
				return basicSetTheContenedorInformacionEmisionGasesViewModel(null, msgs);
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL:
				return getTheContenedorInformacionEmisionGasesViewModel();
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL:
				setTheContenedorInformacionEmisionGasesViewModel((ContenedorInformacionEmisionGasesViewModel)newValue);
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL:
				setTheContenedorInformacionEmisionGasesViewModel((ContenedorInformacionEmisionGasesViewModel)null);
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL:
				return theContenedorInformacionEmisionGasesViewModel != null;
		}
		return super.eIsSet(featureID);
	}

} //ContenedorEscaneoViewModelImpl
