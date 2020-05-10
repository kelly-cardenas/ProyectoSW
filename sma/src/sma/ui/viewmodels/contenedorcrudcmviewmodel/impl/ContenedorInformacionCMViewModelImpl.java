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

import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Informacion CM View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorInformacionCMViewModelImpl#getOwnedByContenedorDetalleCMViewModel <em>Owned By Contenedor Detalle CM View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorInformacionCMViewModelImpl#getNombrecm <em>Nombrecm</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorInformacionCMViewModelImpl#getNombrerepresentante <em>Nombrerepresentante</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorInformacionCMViewModelImpl#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorInformacionCMViewModelImpl extends EObjectImpl implements ContenedorInformacionCMViewModel {
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
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorInformacionCMViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudcmviewmodelPackage.Literals.CONTENEDOR_INFORMACION_CM_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDetalleCMViewModel getOwnedByContenedorDetalleCMViewModel() {
		if (eContainerFeatureID() != ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL) return null;
		return (ContenedorDetalleCMViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorDetalleCMViewModel(ContenedorDetalleCMViewModel newOwnedByContenedorDetalleCMViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorDetalleCMViewModel, ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorDetalleCMViewModel(ContenedorDetalleCMViewModel newOwnedByContenedorDetalleCMViewModel) {
		if (newOwnedByContenedorDetalleCMViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL && newOwnedByContenedorDetalleCMViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorDetalleCMViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorDetalleCMViewModel != null)
				msgs = ((InternalEObject)newOwnedByContenedorDetalleCMViewModel).eInverseAdd(this, ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_CM_VIEW_MODEL, ContenedorDetalleCMViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorDetalleCMViewModel(newOwnedByContenedorDetalleCMViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL, newOwnedByContenedorDetalleCMViewModel, newOwnedByContenedorDetalleCMViewModel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__NOMBRECM, oldNombrecm, nombrecm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__NOMBREREPRESENTANTE, oldNombrerepresentante, nombrerepresentante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByContenedorDetalleCMViewModel((ContenedorDetalleCMViewModel)otherEnd, msgs);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL:
				return basicSetOwnedByContenedorDetalleCMViewModel(null, msgs);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorcrudcmviewmodelPackage.CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_CM_VIEW_MODEL, ContenedorDetalleCMViewModel.class, msgs);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL:
				return getOwnedByContenedorDetalleCMViewModel();
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__NOMBRECM:
				return getNombrecm();
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__NOMBREREPRESENTANTE:
				return getNombrerepresentante();
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__DESCRIPCION:
				return getDescripcion();
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL:
				setOwnedByContenedorDetalleCMViewModel((ContenedorDetalleCMViewModel)newValue);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__NOMBRECM:
				setNombrecm((String)newValue);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__NOMBREREPRESENTANTE:
				setNombrerepresentante((String)newValue);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__DESCRIPCION:
				setDescripcion((String)newValue);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL:
				setOwnedByContenedorDetalleCMViewModel((ContenedorDetalleCMViewModel)null);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__NOMBRECM:
				setNombrecm(NOMBRECM_EDEFAULT);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__NOMBREREPRESENTANTE:
				setNombrerepresentante(NOMBREREPRESENTANTE_EDEFAULT);
				return;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
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
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL:
				return getOwnedByContenedorDetalleCMViewModel() != null;
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__NOMBRECM:
				return NOMBRECM_EDEFAULT == null ? nombrecm != null : !NOMBRECM_EDEFAULT.equals(nombrecm);
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__NOMBREREPRESENTANTE:
				return NOMBREREPRESENTANTE_EDEFAULT == null ? nombrerepresentante != null : !NOMBREREPRESENTANTE_EDEFAULT.equals(nombrerepresentante);
			case ContenedorcrudcmviewmodelPackage.CONTENEDOR_INFORMACION_CM_VIEW_MODEL__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
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
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //ContenedorInformacionCMViewModelImpl
