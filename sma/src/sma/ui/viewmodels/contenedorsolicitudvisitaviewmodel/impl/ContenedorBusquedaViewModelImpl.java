/**
 */
package sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorBusquedaViewModel;
import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel;
import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelPackage;

import sma.ui.viewmodels.impl.ViewModelImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Busqueda View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorBusquedaViewModelImpl#getIdcm <em>Idcm</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorBusquedaViewModelImpl#getPlacavehiculo <em>Placavehiculo</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorBusquedaViewModelImpl#getOwnedByContenedorSolicitudVisitaViewModel <em>Owned By Contenedor Solicitud Visita View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorBusquedaViewModelImpl extends ViewModelImpl implements ContenedorBusquedaViewModel {
	/**
	 * The default value of the '{@link #getIdcm() <em>Idcm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdcm()
	 * @generated
	 * @ordered
	 */
	protected static final String IDCM_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getIdcm() <em>Idcm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdcm()
	 * @generated
	 * @ordered
	 */
	protected String idcm = IDCM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlacavehiculo() <em>Placavehiculo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacavehiculo()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACAVEHICULO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getPlacavehiculo() <em>Placavehiculo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacavehiculo()
	 * @generated
	 * @ordered
	 */
	protected String placavehiculo = PLACAVEHICULO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorBusquedaViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorsolicitudvisitaviewmodelPackage.Literals.CONTENEDOR_BUSQUEDA_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdcm() {
		return idcm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdcm(String newIdcm) {
		String oldIdcm = idcm;
		idcm = newIdcm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__IDCM, oldIdcm, idcm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlacavehiculo() {
		return placavehiculo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacavehiculo(String newPlacavehiculo) {
		String oldPlacavehiculo = placavehiculo;
		placavehiculo = newPlacavehiculo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__PLACAVEHICULO, oldPlacavehiculo, placavehiculo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorSolicitudVisitaViewModel getOwnedByContenedorSolicitudVisitaViewModel() {
		if (eContainerFeatureID() != ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL) return null;
		return (ContenedorSolicitudVisitaViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorSolicitudVisitaViewModel(ContenedorSolicitudVisitaViewModel newOwnedByContenedorSolicitudVisitaViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorSolicitudVisitaViewModel, ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorSolicitudVisitaViewModel(ContenedorSolicitudVisitaViewModel newOwnedByContenedorSolicitudVisitaViewModel) {
		if (newOwnedByContenedorSolicitudVisitaViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL && newOwnedByContenedorSolicitudVisitaViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorSolicitudVisitaViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorSolicitudVisitaViewModel != null)
				msgs = ((InternalEObject)newOwnedByContenedorSolicitudVisitaViewModel).eInverseAdd(this, ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL, ContenedorSolicitudVisitaViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorSolicitudVisitaViewModel(newOwnedByContenedorSolicitudVisitaViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL, newOwnedByContenedorSolicitudVisitaViewModel, newOwnedByContenedorSolicitudVisitaViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByContenedorSolicitudVisitaViewModel((ContenedorSolicitudVisitaViewModel)otherEnd, msgs);
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
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL:
				return basicSetOwnedByContenedorSolicitudVisitaViewModel(null, msgs);
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
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL, ContenedorSolicitudVisitaViewModel.class, msgs);
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
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__IDCM:
				return getIdcm();
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__PLACAVEHICULO:
				return getPlacavehiculo();
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL:
				return getOwnedByContenedorSolicitudVisitaViewModel();
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
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__IDCM:
				setIdcm((String)newValue);
				return;
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__PLACAVEHICULO:
				setPlacavehiculo((String)newValue);
				return;
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL:
				setOwnedByContenedorSolicitudVisitaViewModel((ContenedorSolicitudVisitaViewModel)newValue);
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
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__IDCM:
				setIdcm(IDCM_EDEFAULT);
				return;
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__PLACAVEHICULO:
				setPlacavehiculo(PLACAVEHICULO_EDEFAULT);
				return;
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL:
				setOwnedByContenedorSolicitudVisitaViewModel((ContenedorSolicitudVisitaViewModel)null);
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
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__IDCM:
				return IDCM_EDEFAULT == null ? idcm != null : !IDCM_EDEFAULT.equals(idcm);
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__PLACAVEHICULO:
				return PLACAVEHICULO_EDEFAULT == null ? placavehiculo != null : !PLACAVEHICULO_EDEFAULT.equals(placavehiculo);
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL:
				return getOwnedByContenedorSolicitudVisitaViewModel() != null;
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
		result.append(" (idcm: ");
		result.append(idcm);
		result.append(", placavehiculo: ");
		result.append(placavehiculo);
		result.append(')');
		return result.toString();
	}

} //ContenedorBusquedaViewModelImpl
