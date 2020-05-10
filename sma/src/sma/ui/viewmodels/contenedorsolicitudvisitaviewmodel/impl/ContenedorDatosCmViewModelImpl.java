/**
 */
package sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel;
import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel;
import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelPackage;

import sma.ui.viewmodels.impl.ViewModelImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Datos Cm View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorDatosCmViewModelImpl#getNombrecm <em>Nombrecm</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorDatosCmViewModelImpl#getNombrerepresentante <em>Nombrerepresentante</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorDatosCmViewModelImpl#getDireccion <em>Direccion</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorDatosCmViewModelImpl#getOwnedByContenedorSolicitudVisitaViewModel <em>Owned By Contenedor Solicitud Visita View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorDatosCmViewModelImpl extends ViewModelImpl implements ContenedorDatosCmViewModel {
	/**
	 * The default value of the '{@link #getNombrecm() <em>Nombrecm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrecm()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRECM_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getNombrecm() <em>Nombrecm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrecm()
	 * @generated
	 * @ordered
	 */
	protected String nombrecm = NOMBRECM_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombrerepresentante() <em>Nombrerepresentante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrerepresentante()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBREREPRESENTANTE_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getNombrerepresentante() <em>Nombrerepresentante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrerepresentante()
	 * @generated
	 * @ordered
	 */
	protected String nombrerepresentante = NOMBREREPRESENTANTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDireccion() <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDireccion()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECCION_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getDireccion() <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDireccion()
	 * @generated
	 * @ordered
	 */
	protected String direccion = DIRECCION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorDatosCmViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorsolicitudvisitaviewmodelPackage.Literals.CONTENEDOR_DATOS_CM_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombrecm() {
		return nombrecm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombrecm(String newNombrecm) {
		String oldNombrecm = nombrecm;
		nombrecm = newNombrecm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__NOMBRECM, oldNombrecm, nombrecm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombrerepresentante() {
		return nombrerepresentante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombrerepresentante(String newNombrerepresentante) {
		String oldNombrerepresentante = nombrerepresentante;
		nombrerepresentante = newNombrerepresentante;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__NOMBREREPRESENTANTE, oldNombrerepresentante, nombrerepresentante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDireccion(String newDireccion) {
		String oldDireccion = direccion;
		direccion = newDireccion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__DIRECCION, oldDireccion, direccion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorSolicitudVisitaViewModel getOwnedByContenedorSolicitudVisitaViewModel() {
		if (eContainerFeatureID() != ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL) return null;
		return (ContenedorSolicitudVisitaViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorSolicitudVisitaViewModel(ContenedorSolicitudVisitaViewModel newOwnedByContenedorSolicitudVisitaViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorSolicitudVisitaViewModel, ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorSolicitudVisitaViewModel(ContenedorSolicitudVisitaViewModel newOwnedByContenedorSolicitudVisitaViewModel) {
		if (newOwnedByContenedorSolicitudVisitaViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL && newOwnedByContenedorSolicitudVisitaViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorSolicitudVisitaViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorSolicitudVisitaViewModel != null)
				msgs = ((InternalEObject)newOwnedByContenedorSolicitudVisitaViewModel).eInverseAdd(this, ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_DATOS_CM_VIEW_MODEL, ContenedorSolicitudVisitaViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorSolicitudVisitaViewModel(newOwnedByContenedorSolicitudVisitaViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL, newOwnedByContenedorSolicitudVisitaViewModel, newOwnedByContenedorSolicitudVisitaViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL:
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
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL:
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
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_DATOS_CM_VIEW_MODEL, ContenedorSolicitudVisitaViewModel.class, msgs);
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
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__NOMBRECM:
				return getNombrecm();
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__NOMBREREPRESENTANTE:
				return getNombrerepresentante();
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__DIRECCION:
				return getDireccion();
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL:
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
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__NOMBRECM:
				setNombrecm((String)newValue);
				return;
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__NOMBREREPRESENTANTE:
				setNombrerepresentante((String)newValue);
				return;
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__DIRECCION:
				setDireccion((String)newValue);
				return;
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL:
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
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__NOMBRECM:
				setNombrecm(NOMBRECM_EDEFAULT);
				return;
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__NOMBREREPRESENTANTE:
				setNombrerepresentante(NOMBREREPRESENTANTE_EDEFAULT);
				return;
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__DIRECCION:
				setDireccion(DIRECCION_EDEFAULT);
				return;
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL:
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
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__NOMBRECM:
				return NOMBRECM_EDEFAULT == null ? nombrecm != null : !NOMBRECM_EDEFAULT.equals(nombrecm);
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__NOMBREREPRESENTANTE:
				return NOMBREREPRESENTANTE_EDEFAULT == null ? nombrerepresentante != null : !NOMBREREPRESENTANTE_EDEFAULT.equals(nombrerepresentante);
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__DIRECCION:
				return DIRECCION_EDEFAULT == null ? direccion != null : !DIRECCION_EDEFAULT.equals(direccion);
			case ContenedorsolicitudvisitaviewmodelPackage.CONTENEDOR_DATOS_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL:
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
		result.append(" (nombrecm: ");
		result.append(nombrecm);
		result.append(", nombrerepresentante: ");
		result.append(nombrerepresentante);
		result.append(", direccion: ");
		result.append(direccion);
		result.append(')');
		return result.toString();
	}

} //ContenedorDatosCmViewModelImpl
