/**
 */
package sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sma.ui.UI;
import sma.ui.UiPackage;

import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorBusquedaViewModel;
import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel;
import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel;
import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelPackage;

import sma.ui.viewmodels.impl.ViewModelImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Solicitud Visita View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorSolicitudVisitaViewModelImpl#getOwnedByUI <em>Owned By UI</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorSolicitudVisitaViewModelImpl#getTheContenedorBusquedaViewModel <em>The Contenedor Busqueda View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorSolicitudVisitaViewModelImpl#getTheContenedorDatosCmViewModel <em>The Contenedor Datos Cm View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorSolicitudVisitaViewModelImpl extends ViewModelImpl implements ContenedorSolicitudVisitaViewModel {
	/**
	 * The cached value of the '{@link #getTheContenedorBusquedaViewModel() <em>The Contenedor Busqueda View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorBusquedaViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorBusquedaViewModel theContenedorBusquedaViewModel;

	/**
	 * The cached value of the '{@link #getTheContenedorDatosCmViewModel() <em>The Contenedor Datos Cm View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorDatosCmViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorDatosCmViewModel theContenedorDatosCmViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorSolicitudVisitaViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorsolicitudvisitaviewmodelPackage.Literals.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getOwnedByUI() {
		if (eContainerFeatureID() != ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__OWNED_BY_UI) return null;
		return (UI)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByUI(UI newOwnedByUI, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByUI, ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__OWNED_BY_UI, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByUI(UI newOwnedByUI) {
		if (newOwnedByUI != eInternalContainer() || (eContainerFeatureID() != ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__OWNED_BY_UI && newOwnedByUI != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByUI))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByUI != null)
				msgs = ((InternalEObject)newOwnedByUI).eInverseAdd(this, UiPackage.UI__THE_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL, UI.class, msgs);
			msgs = basicSetOwnedByUI(newOwnedByUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__OWNED_BY_UI, newOwnedByUI, newOwnedByUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorBusquedaViewModel getTheContenedorBusquedaViewModel() {
		return theContenedorBusquedaViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorBusquedaViewModel(ContenedorBusquedaViewModel newTheContenedorBusquedaViewModel, NotificationChain msgs) {
		ContenedorBusquedaViewModel oldTheContenedorBusquedaViewModel = theContenedorBusquedaViewModel;
		theContenedorBusquedaViewModel = newTheContenedorBusquedaViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL, oldTheContenedorBusquedaViewModel, newTheContenedorBusquedaViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorBusquedaViewModel(ContenedorBusquedaViewModel newTheContenedorBusquedaViewModel) {
		if (newTheContenedorBusquedaViewModel != theContenedorBusquedaViewModel) {
			NotificationChain msgs = null;
			if (theContenedorBusquedaViewModel != null)
				msgs = ((InternalEObject)theContenedorBusquedaViewModel).eInverseRemove(this, ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL, ContenedorBusquedaViewModel.class, msgs);
			if (newTheContenedorBusquedaViewModel != null)
				msgs = ((InternalEObject)newTheContenedorBusquedaViewModel).eInverseAdd(this, ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL, ContenedorBusquedaViewModel.class, msgs);
			msgs = basicSetTheContenedorBusquedaViewModel(newTheContenedorBusquedaViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL, newTheContenedorBusquedaViewModel, newTheContenedorBusquedaViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDatosCmViewModel getTheContenedorDatosCmViewModel() {
		return theContenedorDatosCmViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorDatosCmViewModel(ContenedorDatosCmViewModel newTheContenedorDatosCmViewModel, NotificationChain msgs) {
		ContenedorDatosCmViewModel oldTheContenedorDatosCmViewModel = theContenedorDatosCmViewModel;
		theContenedorDatosCmViewModel = newTheContenedorDatosCmViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_DATOS_CM_VIEW_MODEL, oldTheContenedorDatosCmViewModel, newTheContenedorDatosCmViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorDatosCmViewModel(ContenedorDatosCmViewModel newTheContenedorDatosCmViewModel) {
		if (newTheContenedorDatosCmViewModel != theContenedorDatosCmViewModel) {
			NotificationChain msgs = null;
			if (theContenedorDatosCmViewModel != null)
				msgs = ((InternalEObject)theContenedorDatosCmViewModel).eInverseRemove(this, ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL, ContenedorDatosCmViewModel.class, msgs);
			if (newTheContenedorDatosCmViewModel != null)
				msgs = ((InternalEObject)newTheContenedorDatosCmViewModel).eInverseAdd(this, ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL, ContenedorDatosCmViewModel.class, msgs);
			msgs = basicSetTheContenedorDatosCmViewModel(newTheContenedorDatosCmViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_DATOS_CM_VIEW_MODEL, newTheContenedorDatosCmViewModel, newTheContenedorDatosCmViewModel));
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
		//TODO implementarModelo
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void solicitarVisita() {
		//TODO solicitarVisita
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__OWNED_BY_UI:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByUI((UI)otherEnd, msgs);
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL:
				if (theContenedorBusquedaViewModel != null)
					msgs = ((InternalEObject)theContenedorBusquedaViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorBusquedaViewModel((ContenedorBusquedaViewModel)otherEnd, msgs);
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_DATOS_CM_VIEW_MODEL:
				if (theContenedorDatosCmViewModel != null)
					msgs = ((InternalEObject)theContenedorDatosCmViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_DATOS_CM_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorDatosCmViewModel((ContenedorDatosCmViewModel)otherEnd, msgs);
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
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__OWNED_BY_UI:
				return basicSetOwnedByUI(null, msgs);
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL:
				return basicSetTheContenedorBusquedaViewModel(null, msgs);
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_DATOS_CM_VIEW_MODEL:
				return basicSetTheContenedorDatosCmViewModel(null, msgs);
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
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__OWNED_BY_UI:
				return eInternalContainer().eInverseRemove(this, UiPackage.UI__THE_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL, UI.class, msgs);
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
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__OWNED_BY_UI:
				return getOwnedByUI();
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL:
				return getTheContenedorBusquedaViewModel();
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_DATOS_CM_VIEW_MODEL:
				return getTheContenedorDatosCmViewModel();
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
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__OWNED_BY_UI:
				setOwnedByUI((UI)newValue);
				return;
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL:
				setTheContenedorBusquedaViewModel((ContenedorBusquedaViewModel)newValue);
				return;
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_DATOS_CM_VIEW_MODEL:
				setTheContenedorDatosCmViewModel((ContenedorDatosCmViewModel)newValue);
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
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__OWNED_BY_UI:
				setOwnedByUI((UI)null);
				return;
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL:
				setTheContenedorBusquedaViewModel((ContenedorBusquedaViewModel)null);
				return;
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_DATOS_CM_VIEW_MODEL:
				setTheContenedorDatosCmViewModel((ContenedorDatosCmViewModel)null);
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
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__OWNED_BY_UI:
				return getOwnedByUI() != null;
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL:
				return theContenedorBusquedaViewModel != null;
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_DATOS_CM_VIEW_MODEL:
				return theContenedorDatosCmViewModel != null;
		}
		return super.eIsSet(featureID);
	}

} //ContenedorSolicitudVisitaViewModelImpl
