/**
 */
package sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sma.ui.UI;
import sma.ui.UiPackage;

import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorCmrecomendadosViewModel;
import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel;
import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel;
import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage;

import sma.ui.viewmodels.impl.ViewModelImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Contactar Cm View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorContactarCmViewModelImpl#getOwnedByUI <em>Owned By UI</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorContactarCmViewModelImpl#getTheContenedorCmrecomendadosViewModel <em>The Contenedor Cmrecomendados View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorContactarCmViewModelImpl#getTheContenedorUbicacionactualViewModel <em>The Contenedor Ubicacionactual View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorContactarCmViewModelImpl extends ViewModelImpl implements ContenedorContactarCmViewModel {
	/**
	 * The cached value of the '{@link #getTheContenedorCmrecomendadosViewModel() <em>The Contenedor Cmrecomendados View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorCmrecomendadosViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorCmrecomendadosViewModel theContenedorCmrecomendadosViewModel;

	/**
	 * The cached value of the '{@link #getTheContenedorUbicacionactualViewModel() <em>The Contenedor Ubicacionactual View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorUbicacionactualViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorUbicacionactualViewModel theContenedorUbicacionactualViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorContactarCmViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcontactarcmviewmodelPackage.Literals.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getOwnedByUI() {
		if (eContainerFeatureID() != ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__OWNED_BY_UI) return null;
		return (UI)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByUI(UI newOwnedByUI, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByUI, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__OWNED_BY_UI, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByUI(UI newOwnedByUI) {
		if (newOwnedByUI != eInternalContainer() || (eContainerFeatureID() != ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__OWNED_BY_UI && newOwnedByUI != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByUI))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByUI != null)
				msgs = ((InternalEObject)newOwnedByUI).eInverseAdd(this, UiPackage.UI__THE_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL, UI.class, msgs);
			msgs = basicSetOwnedByUI(newOwnedByUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__OWNED_BY_UI, newOwnedByUI, newOwnedByUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCmrecomendadosViewModel getTheContenedorCmrecomendadosViewModel() {
		return theContenedorCmrecomendadosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorCmrecomendadosViewModel(ContenedorCmrecomendadosViewModel newTheContenedorCmrecomendadosViewModel, NotificationChain msgs) {
		ContenedorCmrecomendadosViewModel oldTheContenedorCmrecomendadosViewModel = theContenedorCmrecomendadosViewModel;
		theContenedorCmrecomendadosViewModel = newTheContenedorCmrecomendadosViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL, oldTheContenedorCmrecomendadosViewModel, newTheContenedorCmrecomendadosViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorCmrecomendadosViewModel(ContenedorCmrecomendadosViewModel newTheContenedorCmrecomendadosViewModel) {
		if (newTheContenedorCmrecomendadosViewModel != theContenedorCmrecomendadosViewModel) {
			NotificationChain msgs = null;
			if (theContenedorCmrecomendadosViewModel != null)
				msgs = ((InternalEObject)theContenedorCmrecomendadosViewModel).eInverseRemove(this, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL, ContenedorCmrecomendadosViewModel.class, msgs);
			if (newTheContenedorCmrecomendadosViewModel != null)
				msgs = ((InternalEObject)newTheContenedorCmrecomendadosViewModel).eInverseAdd(this, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL, ContenedorCmrecomendadosViewModel.class, msgs);
			msgs = basicSetTheContenedorCmrecomendadosViewModel(newTheContenedorCmrecomendadosViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL, newTheContenedorCmrecomendadosViewModel, newTheContenedorCmrecomendadosViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorUbicacionactualViewModel getTheContenedorUbicacionactualViewModel() {
		return theContenedorUbicacionactualViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorUbicacionactualViewModel(ContenedorUbicacionactualViewModel newTheContenedorUbicacionactualViewModel, NotificationChain msgs) {
		ContenedorUbicacionactualViewModel oldTheContenedorUbicacionactualViewModel = theContenedorUbicacionactualViewModel;
		theContenedorUbicacionactualViewModel = newTheContenedorUbicacionactualViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL, oldTheContenedorUbicacionactualViewModel, newTheContenedorUbicacionactualViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorUbicacionactualViewModel(ContenedorUbicacionactualViewModel newTheContenedorUbicacionactualViewModel) {
		if (newTheContenedorUbicacionactualViewModel != theContenedorUbicacionactualViewModel) {
			NotificationChain msgs = null;
			if (theContenedorUbicacionactualViewModel != null)
				msgs = ((InternalEObject)theContenedorUbicacionactualViewModel).eInverseRemove(this, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL, ContenedorUbicacionactualViewModel.class, msgs);
			if (newTheContenedorUbicacionactualViewModel != null)
				msgs = ((InternalEObject)newTheContenedorUbicacionactualViewModel).eInverseAdd(this, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL, ContenedorUbicacionactualViewModel.class, msgs);
			msgs = basicSetTheContenedorUbicacionactualViewModel(newTheContenedorUbicacionactualViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL, newTheContenedorUbicacionactualViewModel, newTheContenedorUbicacionactualViewModel));
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
	public void mostrarCmsCercanos() {
		
				
								getOwnedByUI().mostrarCmsCercanos(this);
							
					
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void implementarModelo() {
		
				
						
						ContenedorUbicacionactualViewModel ubicacionActualVM 	= getTheContenedorUbicacionactualViewModel();
						ContenedorCmrecomendadosViewModel cmRecomendadosVM		= getTheContenedorCmrecomendadosViewModel();
						
						if ( ubicacionActualVM == null ) {
							ubicacionActualVM = sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelFactory
									.eINSTANCE.createContenedorUbicacionactualViewModel();
						}
						
						if ( cmRecomendadosVM == null ) {
							cmRecomendadosVM = sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelFactory
									.eINSTANCE.createContenedorCmrecomendadosViewModel();
						}
						
						setTheContenedorCmrecomendadosViewModel(cmRecomendadosVM);
						setTheContenedorUbicacionactualViewModel(ubicacionActualVM);
						
					
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__OWNED_BY_UI:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByUI((UI)otherEnd, msgs);
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL:
				if (theContenedorCmrecomendadosViewModel != null)
					msgs = ((InternalEObject)theContenedorCmrecomendadosViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorCmrecomendadosViewModel((ContenedorCmrecomendadosViewModel)otherEnd, msgs);
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL:
				if (theContenedorUbicacionactualViewModel != null)
					msgs = ((InternalEObject)theContenedorUbicacionactualViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorUbicacionactualViewModel((ContenedorUbicacionactualViewModel)otherEnd, msgs);
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
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__OWNED_BY_UI:
				return basicSetOwnedByUI(null, msgs);
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL:
				return basicSetTheContenedorCmrecomendadosViewModel(null, msgs);
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL:
				return basicSetTheContenedorUbicacionactualViewModel(null, msgs);
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
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__OWNED_BY_UI:
				return eInternalContainer().eInverseRemove(this, UiPackage.UI__THE_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL, UI.class, msgs);
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
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__OWNED_BY_UI:
				return getOwnedByUI();
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL:
				return getTheContenedorCmrecomendadosViewModel();
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL:
				return getTheContenedorUbicacionactualViewModel();
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
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__OWNED_BY_UI:
				setOwnedByUI((UI)newValue);
				return;
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL:
				setTheContenedorCmrecomendadosViewModel((ContenedorCmrecomendadosViewModel)newValue);
				return;
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL:
				setTheContenedorUbicacionactualViewModel((ContenedorUbicacionactualViewModel)newValue);
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
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__OWNED_BY_UI:
				setOwnedByUI((UI)null);
				return;
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL:
				setTheContenedorCmrecomendadosViewModel((ContenedorCmrecomendadosViewModel)null);
				return;
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL:
				setTheContenedorUbicacionactualViewModel((ContenedorUbicacionactualViewModel)null);
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
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__OWNED_BY_UI:
				return getOwnedByUI() != null;
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL:
				return theContenedorCmrecomendadosViewModel != null;
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL:
				return theContenedorUbicacionactualViewModel != null;
		}
		return super.eIsSet(featureID);
	}

} //ContenedorContactarCmViewModelImpl
