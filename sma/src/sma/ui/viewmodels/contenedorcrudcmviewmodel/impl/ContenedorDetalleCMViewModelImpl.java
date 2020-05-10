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

import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Detalle CM View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorDetalleCMViewModelImpl#getOwnedByContenedorCRUDCMViewModel <em>Owned By Contenedor CRUDCM View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorDetalleCMViewModelImpl#getTheContenedorInformacionCMViewModel <em>The Contenedor Informacion CM View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorDetalleCMViewModelImpl#getTheContenedorUbicacionViewModel <em>The Contenedor Ubicacion View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorDetalleCMViewModelImpl extends EObjectImpl implements ContenedorDetalleCMViewModel {
	/**
	 * The cached value of the '{@link #getTheContenedorInformacionCMViewModel() <em>The Contenedor Informacion CM View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorInformacionCMViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorInformacionCMViewModel theContenedorInformacionCMViewModel;

	/**
	 * The cached value of the '{@link #getTheContenedorUbicacionViewModel() <em>The Contenedor Ubicacion View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorUbicacionViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorUbicacionViewModel theContenedorUbicacionViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorDetalleCMViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudcmviewmodelPackage.Literals.CONTENEDOR_DETALLE_CM_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCRUDCMViewModel getOwnedByContenedorCRUDCMViewModel() {
		if (eContainerFeatureID() != ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL) return null;
		return (ContenedorCRUDCMViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorCRUDCMViewModel(ContenedorCRUDCMViewModel newOwnedByContenedorCRUDCMViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorCRUDCMViewModel, ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorCRUDCMViewModel(ContenedorCRUDCMViewModel newOwnedByContenedorCRUDCMViewModel) {
		if (newOwnedByContenedorCRUDCMViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL && newOwnedByContenedorCRUDCMViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorCRUDCMViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorCRUDCMViewModel != null)
				msgs = ((InternalEObject)newOwnedByContenedorCRUDCMViewModel).eInverseAdd(this, ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CM_VIEW_MODEL, ContenedorCRUDCMViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorCRUDCMViewModel(newOwnedByContenedorCRUDCMViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL, newOwnedByContenedorCRUDCMViewModel, newOwnedByContenedorCRUDCMViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorInformacionCMViewModel getTheContenedorInformacionCMViewModel() {
		return theContenedorInformacionCMViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorInformacionCMViewModel(ContenedorInformacionCMViewModel newTheContenedorInformacionCMViewModel, NotificationChain msgs) {
		ContenedorInformacionCMViewModel oldTheContenedorInformacionCMViewModel = theContenedorInformacionCMViewModel;
		theContenedorInformacionCMViewModel = newTheContenedorInformacionCMViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_CM_VIEW_MODEL, oldTheContenedorInformacionCMViewModel, newTheContenedorInformacionCMViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorInformacionCMViewModel(ContenedorInformacionCMViewModel newTheContenedorInformacionCMViewModel) {
		if (newTheContenedorInformacionCMViewModel != theContenedorInformacionCMViewModel) {
			NotificationChain msgs = null;
			if (theContenedorInformacionCMViewModel != null)
				msgs = ((InternalEObject)theContenedorInformacionCMViewModel).eInverseRemove(this, ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL, ContenedorInformacionCMViewModel.class, msgs);
			if (newTheContenedorInformacionCMViewModel != null)
				msgs = ((InternalEObject)newTheContenedorInformacionCMViewModel).eInverseAdd(this, ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL, ContenedorInformacionCMViewModel.class, msgs);
			msgs = basicSetTheContenedorInformacionCMViewModel(newTheContenedorInformacionCMViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_CM_VIEW_MODEL, newTheContenedorInformacionCMViewModel, newTheContenedorInformacionCMViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorUbicacionViewModel getTheContenedorUbicacionViewModel() {
		return theContenedorUbicacionViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorUbicacionViewModel(ContenedorUbicacionViewModel newTheContenedorUbicacionViewModel, NotificationChain msgs) {
		ContenedorUbicacionViewModel oldTheContenedorUbicacionViewModel = theContenedorUbicacionViewModel;
		theContenedorUbicacionViewModel = newTheContenedorUbicacionViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACION_VIEW_MODEL, oldTheContenedorUbicacionViewModel, newTheContenedorUbicacionViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorUbicacionViewModel(ContenedorUbicacionViewModel newTheContenedorUbicacionViewModel) {
		if (newTheContenedorUbicacionViewModel != theContenedorUbicacionViewModel) {
			NotificationChain msgs = null;
			if (theContenedorUbicacionViewModel != null)
				msgs = ((InternalEObject)theContenedorUbicacionViewModel).eInverseRemove(this, ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL, ContenedorUbicacionViewModel.class, msgs);
			if (newTheContenedorUbicacionViewModel != null)
				msgs = ((InternalEObject)newTheContenedorUbicacionViewModel).eInverseAdd(this, ContenedorcrudcmviewmodelPackage.CONTENEDOR_UBICACION_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL, ContenedorUbicacionViewModel.class, msgs);
			msgs = basicSetTheContenedorUbicacionViewModel(newTheContenedorUbicacionViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACION_VIEW_MODEL, newTheContenedorUbicacionViewModel, newTheContenedorUbicacionViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void implementarModelo() {
				
				ContenedorInformacionCMViewModel informacionCMVM = getTheContenedorInformacionCMViewModel();
				ContenedorUbicacionViewModel 	ubicacionCMVM	 = getTheContenedorUbicacionViewModel();
				
				if ( informacionCMVM == null ) {
					informacionCMVM = sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelFactory
							.eINSTANCE.createContenedorInformacionCMViewModel();
				}
				
				if ( ubicacionCMVM == null ) {
					ubicacionCMVM = sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelFactory
							.eINSTANCE.createContenedorUbicacionViewModel();
				}
				
				setTheContenedorInformacionCMViewModel(informacionCMVM);
				setTheContenedorUbicacionViewModel(ubicacionCMVM);
				
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByContenedorCRUDCMViewModel((ContenedorCRUDCMViewModel)otherEnd, msgs);
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_CM_VIEW_MODEL:
				if (theContenedorInformacionCMViewModel != null)
					msgs = ((InternalEObject)theContenedorInformacionCMViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_CM_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorInformacionCMViewModel((ContenedorInformacionCMViewModel)otherEnd, msgs);
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACION_VIEW_MODEL:
				if (theContenedorUbicacionViewModel != null)
					msgs = ((InternalEObject)theContenedorUbicacionViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACION_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorUbicacionViewModel((ContenedorUbicacionViewModel)otherEnd, msgs);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL:
				return basicSetOwnedByContenedorCRUDCMViewModel(null, msgs);
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_CM_VIEW_MODEL:
				return basicSetTheContenedorInformacionCMViewModel(null, msgs);
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACION_VIEW_MODEL:
				return basicSetTheContenedorUbicacionViewModel(null, msgs);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CM_VIEW_MODEL, ContenedorCRUDCMViewModel.class, msgs);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL:
				return getOwnedByContenedorCRUDCMViewModel();
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_CM_VIEW_MODEL:
				return getTheContenedorInformacionCMViewModel();
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACION_VIEW_MODEL:
				return getTheContenedorUbicacionViewModel();
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL:
				setOwnedByContenedorCRUDCMViewModel((ContenedorCRUDCMViewModel)newValue);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_CM_VIEW_MODEL:
				setTheContenedorInformacionCMViewModel((ContenedorInformacionCMViewModel)newValue);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACION_VIEW_MODEL:
				setTheContenedorUbicacionViewModel((ContenedorUbicacionViewModel)newValue);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL:
				setOwnedByContenedorCRUDCMViewModel((ContenedorCRUDCMViewModel)null);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_CM_VIEW_MODEL:
				setTheContenedorInformacionCMViewModel((ContenedorInformacionCMViewModel)null);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACION_VIEW_MODEL:
				setTheContenedorUbicacionViewModel((ContenedorUbicacionViewModel)null);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL:
				return getOwnedByContenedorCRUDCMViewModel() != null;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_CM_VIEW_MODEL:
				return theContenedorInformacionCMViewModel != null;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACION_VIEW_MODEL:
				return theContenedorUbicacionViewModel != null;
		}
		return super.eIsSet(featureID);
	}

} //ContenedorDetalleCMViewModelImpl
