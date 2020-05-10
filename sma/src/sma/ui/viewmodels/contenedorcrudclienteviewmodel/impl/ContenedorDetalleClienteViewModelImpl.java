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

import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosPersonalesViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosdelacuentaViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Detalle Cliente View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDetalleClienteViewModelImpl#getOwnedByContenedorCrudClienteViewModel <em>Owned By Contenedor Crud Cliente View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDetalleClienteViewModelImpl#getTheContenedorDatosPersonalesViewModel <em>The Contenedor Datos Personales View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDetalleClienteViewModelImpl#getTheContenedorDatosdelacuentaViewModel <em>The Contenedor Datosdelacuenta View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorDetalleClienteViewModelImpl extends EObjectImpl implements ContenedorDetalleClienteViewModel {
	/**
	 * The cached value of the '{@link #getTheContenedorDatosPersonalesViewModel() <em>The Contenedor Datos Personales View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorDatosPersonalesViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorDatosPersonalesViewModel theContenedorDatosPersonalesViewModel;

	/**
	 * The cached value of the '{@link #getTheContenedorDatosdelacuentaViewModel() <em>The Contenedor Datosdelacuenta View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorDatosdelacuentaViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorDatosdelacuentaViewModel theContenedorDatosdelacuentaViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorDetalleClienteViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudclienteviewmodelPackage.Literals.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCrudClienteViewModel getOwnedByContenedorCrudClienteViewModel() {
		if (eContainerFeatureID() != ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL) return null;
		return (ContenedorCrudClienteViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorCrudClienteViewModel(ContenedorCrudClienteViewModel newOwnedByContenedorCrudClienteViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorCrudClienteViewModel, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorCrudClienteViewModel(ContenedorCrudClienteViewModel newOwnedByContenedorCrudClienteViewModel) {
		if (newOwnedByContenedorCrudClienteViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL && newOwnedByContenedorCrudClienteViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorCrudClienteViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorCrudClienteViewModel != null)
				msgs = ((InternalEObject)newOwnedByContenedorCrudClienteViewModel).eInverseAdd(this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL, ContenedorCrudClienteViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorCrudClienteViewModel(newOwnedByContenedorCrudClienteViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL, newOwnedByContenedorCrudClienteViewModel, newOwnedByContenedorCrudClienteViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDatosPersonalesViewModel getTheContenedorDatosPersonalesViewModel() {
		return theContenedorDatosPersonalesViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorDatosPersonalesViewModel(ContenedorDatosPersonalesViewModel newTheContenedorDatosPersonalesViewModel, NotificationChain msgs) {
		ContenedorDatosPersonalesViewModel oldTheContenedorDatosPersonalesViewModel = theContenedorDatosPersonalesViewModel;
		theContenedorDatosPersonalesViewModel = newTheContenedorDatosPersonalesViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL, oldTheContenedorDatosPersonalesViewModel, newTheContenedorDatosPersonalesViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorDatosPersonalesViewModel(ContenedorDatosPersonalesViewModel newTheContenedorDatosPersonalesViewModel) {
		if (newTheContenedorDatosPersonalesViewModel != theContenedorDatosPersonalesViewModel) {
			NotificationChain msgs = null;
			if (theContenedorDatosPersonalesViewModel != null)
				msgs = ((InternalEObject)theContenedorDatosPersonalesViewModel).eInverseRemove(this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL, ContenedorDatosPersonalesViewModel.class, msgs);
			if (newTheContenedorDatosPersonalesViewModel != null)
				msgs = ((InternalEObject)newTheContenedorDatosPersonalesViewModel).eInverseAdd(this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL, ContenedorDatosPersonalesViewModel.class, msgs);
			msgs = basicSetTheContenedorDatosPersonalesViewModel(newTheContenedorDatosPersonalesViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL, newTheContenedorDatosPersonalesViewModel, newTheContenedorDatosPersonalesViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDatosdelacuentaViewModel getTheContenedorDatosdelacuentaViewModel() {
		return theContenedorDatosdelacuentaViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorDatosdelacuentaViewModel(ContenedorDatosdelacuentaViewModel newTheContenedorDatosdelacuentaViewModel, NotificationChain msgs) {
		ContenedorDatosdelacuentaViewModel oldTheContenedorDatosdelacuentaViewModel = theContenedorDatosdelacuentaViewModel;
		theContenedorDatosdelacuentaViewModel = newTheContenedorDatosdelacuentaViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL, oldTheContenedorDatosdelacuentaViewModel, newTheContenedorDatosdelacuentaViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorDatosdelacuentaViewModel(ContenedorDatosdelacuentaViewModel newTheContenedorDatosdelacuentaViewModel) {
		if (newTheContenedorDatosdelacuentaViewModel != theContenedorDatosdelacuentaViewModel) {
			NotificationChain msgs = null;
			if (theContenedorDatosdelacuentaViewModel != null)
				msgs = ((InternalEObject)theContenedorDatosdelacuentaViewModel).eInverseRemove(this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL, ContenedorDatosdelacuentaViewModel.class, msgs);
			if (newTheContenedorDatosdelacuentaViewModel != null)
				msgs = ((InternalEObject)newTheContenedorDatosdelacuentaViewModel).eInverseAdd(this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL, ContenedorDatosdelacuentaViewModel.class, msgs);
			msgs = basicSetTheContenedorDatosdelacuentaViewModel(newTheContenedorDatosdelacuentaViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL, newTheContenedorDatosdelacuentaViewModel, newTheContenedorDatosdelacuentaViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void implementarModelo() {
		
				
						
						ContenedorDatosPersonalesViewModel datosPersonalesVM = getTheContenedorDatosPersonalesViewModel();
						ContenedorDatosdelacuentaViewModel datosCuentaCM	 = getTheContenedorDatosdelacuentaViewModel();
						
						if ( datosPersonalesVM == null ) {
							datosPersonalesVM = sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelFactory
												.eINSTANCE.createContenedorDatosPersonalesViewModel();
						}
						
						if ( datosCuentaCM == null ) {
							datosCuentaCM 	= sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelFactory
											.eINSTANCE.createContenedorDatosdelacuentaViewModel();
						}
						
						setTheContenedorDatosdelacuentaViewModel(datosCuentaCM);
						setTheContenedorDatosPersonalesViewModel(datosPersonalesVM);
						
						
					
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByContenedorCrudClienteViewModel((ContenedorCrudClienteViewModel)otherEnd, msgs);
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL:
				if (theContenedorDatosPersonalesViewModel != null)
					msgs = ((InternalEObject)theContenedorDatosPersonalesViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorDatosPersonalesViewModel((ContenedorDatosPersonalesViewModel)otherEnd, msgs);
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL:
				if (theContenedorDatosdelacuentaViewModel != null)
					msgs = ((InternalEObject)theContenedorDatosdelacuentaViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorDatosdelacuentaViewModel((ContenedorDatosdelacuentaViewModel)otherEnd, msgs);
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				return basicSetOwnedByContenedorCrudClienteViewModel(null, msgs);
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL:
				return basicSetTheContenedorDatosPersonalesViewModel(null, msgs);
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL:
				return basicSetTheContenedorDatosdelacuentaViewModel(null, msgs);
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL, ContenedorCrudClienteViewModel.class, msgs);
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				return getOwnedByContenedorCrudClienteViewModel();
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL:
				return getTheContenedorDatosPersonalesViewModel();
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL:
				return getTheContenedorDatosdelacuentaViewModel();
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				setOwnedByContenedorCrudClienteViewModel((ContenedorCrudClienteViewModel)newValue);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL:
				setTheContenedorDatosPersonalesViewModel((ContenedorDatosPersonalesViewModel)newValue);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL:
				setTheContenedorDatosdelacuentaViewModel((ContenedorDatosdelacuentaViewModel)newValue);
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				setOwnedByContenedorCrudClienteViewModel((ContenedorCrudClienteViewModel)null);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL:
				setTheContenedorDatosPersonalesViewModel((ContenedorDatosPersonalesViewModel)null);
				return;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL:
				setTheContenedorDatosdelacuentaViewModel((ContenedorDatosdelacuentaViewModel)null);
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
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				return getOwnedByContenedorCrudClienteViewModel() != null;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL:
				return theContenedorDatosPersonalesViewModel != null;
			case ContenedorcrudclienteviewmodelPackage.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL:
				return theContenedorDatosdelacuentaViewModel != null;
		}
		return super.eIsSet(featureID);
	}

} //ContenedorDetalleClienteViewModelImpl
