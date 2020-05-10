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

import sma.ui.UI;
import sma.ui.UiPackage;

import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorMaestroClienteViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Crud Cliente View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorCrudClienteViewModelImpl#getOwnedByUI <em>Owned By UI</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorCrudClienteViewModelImpl#getTheContenedorDetalleClienteViewModel <em>The Contenedor Detalle Cliente View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorCrudClienteViewModelImpl#getTheContenedorMaestroClienteViewModel <em>The Contenedor Maestro Cliente View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorCrudClienteViewModelImpl extends EObjectImpl implements ContenedorCrudClienteViewModel {
	/**
	 * The cached value of the '{@link #getTheContenedorDetalleClienteViewModel() <em>The Contenedor Detalle Cliente View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorDetalleClienteViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorDetalleClienteViewModel theContenedorDetalleClienteViewModel;

	/**
	 * The cached value of the '{@link #getTheContenedorMaestroClienteViewModel() <em>The Contenedor Maestro Cliente View Model</em>}' containment reference.
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
	protected ContenedorCrudClienteViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudclienteviewmodelPackage.Literals.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getOwnedByUI() {
		if (eContainerFeatureID() != ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__OWNED_BY_UI) return null;
		return (UI)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByUI(UI newOwnedByUI, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByUI, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__OWNED_BY_UI, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByUI(UI newOwnedByUI) {
		if (newOwnedByUI != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__OWNED_BY_UI && newOwnedByUI != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByUI))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByUI != null)
				msgs = ((InternalEObject)newOwnedByUI).eInverseAdd(this, UiPackage.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL, UI.class, msgs);
			msgs = basicSetOwnedByUI(newOwnedByUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__OWNED_BY_UI, newOwnedByUI, newOwnedByUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDetalleClienteViewModel getTheContenedorDetalleClienteViewModel() {
		return theContenedorDetalleClienteViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorDetalleClienteViewModel(ContenedorDetalleClienteViewModel newTheContenedorDetalleClienteViewModel, NotificationChain msgs) {
		ContenedorDetalleClienteViewModel oldTheContenedorDetalleClienteViewModel = theContenedorDetalleClienteViewModel;
		theContenedorDetalleClienteViewModel = newTheContenedorDetalleClienteViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL, oldTheContenedorDetalleClienteViewModel, newTheContenedorDetalleClienteViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorDetalleClienteViewModel(ContenedorDetalleClienteViewModel newTheContenedorDetalleClienteViewModel) {
		if (newTheContenedorDetalleClienteViewModel != theContenedorDetalleClienteViewModel) {
			NotificationChain msgs = null;
			if (theContenedorDetalleClienteViewModel != null)
				msgs = ((InternalEObject)theContenedorDetalleClienteViewModel).eInverseRemove(this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL, ContenedorDetalleClienteViewModel.class, msgs);
			if (newTheContenedorDetalleClienteViewModel != null)
				msgs = ((InternalEObject)newTheContenedorDetalleClienteViewModel).eInverseAdd(this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL, ContenedorDetalleClienteViewModel.class, msgs);
			msgs = basicSetTheContenedorDetalleClienteViewModel(newTheContenedorDetalleClienteViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL, newTheContenedorDetalleClienteViewModel, newTheContenedorDetalleClienteViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMaestroClienteViewModel getTheContenedorMaestroClienteViewModel() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL, oldTheContenedorMaestroClienteViewModel, newTheContenedorMaestroClienteViewModel);
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
				msgs = ((InternalEObject)theContenedorMaestroClienteViewModel).eInverseRemove(this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL, ContenedorMaestroClienteViewModel.class, msgs);
			if (newTheContenedorMaestroClienteViewModel != null)
				msgs = ((InternalEObject)newTheContenedorMaestroClienteViewModel).eInverseAdd(this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL, ContenedorMaestroClienteViewModel.class, msgs);
			msgs = basicSetTheContenedorMaestroClienteViewModel(newTheContenedorMaestroClienteViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL, newTheContenedorMaestroClienteViewModel, newTheContenedorMaestroClienteViewModel));
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
		
				
						
								
							//--prueba	
										ContenedorDetalleClienteViewModel detalleClienteVM = getTheContenedorDetalleClienteViewModel();
										ContenedorMaestroClienteViewModel maestroClienteVM = getTheContenedorMaestroClienteViewModel();
											
											if ( detalleClienteVM == null ) {
												detalleClienteVM = sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelFactory.
														eINSTANCE.createContenedorDetalleClienteViewModel();
											}
									
											if ( maestroClienteVM == null ) {
												maestroClienteVM= sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelFactory.
												eINSTANCE.createContenedorMaestroClienteViewModel();
											}
											
											setTheContenedorDetalleClienteViewModel(detalleClienteVM);
											setTheContenedorMaestroClienteViewModel(maestroClienteVM);
									
							
					
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registrarCliente() {
		
				
				getOwnedByUI().registrarCliente(this);
				
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__OWNED_BY_UI:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByUI((UI)otherEnd, msgs);
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
				if (theContenedorDetalleClienteViewModel != null)
					msgs = ((InternalEObject)theContenedorDetalleClienteViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorDetalleClienteViewModel((ContenedorDetalleClienteViewModel)otherEnd, msgs);
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				if (theContenedorMaestroClienteViewModel != null)
					msgs = ((InternalEObject)theContenedorMaestroClienteViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL, null, msgs);
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__OWNED_BY_UI:
				return basicSetOwnedByUI(null, msgs);
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
				return basicSetTheContenedorDetalleClienteViewModel(null, msgs);
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__OWNED_BY_UI:
				return eInternalContainer().eInverseRemove(this, UiPackage.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL, UI.class, msgs);
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__OWNED_BY_UI:
				return getOwnedByUI();
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
				return getTheContenedorDetalleClienteViewModel();
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				return getTheContenedorMaestroClienteViewModel();
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__OWNED_BY_UI:
				setOwnedByUI((UI)newValue);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
				setTheContenedorDetalleClienteViewModel((ContenedorDetalleClienteViewModel)newValue);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__OWNED_BY_UI:
				setOwnedByUI((UI)null);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
				setTheContenedorDetalleClienteViewModel((ContenedorDetalleClienteViewModel)null);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__OWNED_BY_UI:
				return getOwnedByUI() != null;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL:
				return theContenedorDetalleClienteViewModel != null;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL:
				return theContenedorMaestroClienteViewModel != null;
		}
		return super.eIsSet(featureID);
	}

} //ContenedorCrudClienteViewModelImpl
