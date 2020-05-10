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

import sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorMaestroCMViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Centro Mant View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.CentroMantViewModelImpl#getNombrecm <em>Nombrecm</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.CentroMantViewModelImpl#getNombrerepresentante <em>Nombrerepresentante</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.CentroMantViewModelImpl#getCiudad <em>Ciudad</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.CentroMantViewModelImpl#getThe0ContenedorMaestroCMViewModel <em>The0 Contenedor Maestro CM View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CentroMantViewModelImpl extends EObjectImpl implements CentroMantViewModel {
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
	 * The default value of the '{@link #getCiudad() <em>Ciudad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCiudad()
	 * @generated
	 * @ordered
	 */
	protected static final String CIUDAD_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getCiudad() <em>Ciudad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCiudad()
	 * @generated
	 * @ordered
	 */
	protected String ciudad = CIUDAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CentroMantViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcrudcmviewmodelPackage.Literals.CENTRO_MANT_VIEW_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__NOMBRECM, oldNombrecm, nombrecm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__NOMBREREPRESENTANTE, oldNombrerepresentante, nombrerepresentante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCiudad(String newCiudad) {
		String oldCiudad = ciudad;
		ciudad = newCiudad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__CIUDAD, oldCiudad, ciudad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorMaestroCMViewModel getThe0ContenedorMaestroCMViewModel() {
		if (eContainerFeatureID() != ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CM_VIEW_MODEL) return null;
		return (ContenedorMaestroCMViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThe0ContenedorMaestroCMViewModel(ContenedorMaestroCMViewModel newThe0ContenedorMaestroCMViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newThe0ContenedorMaestroCMViewModel, ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CM_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThe0ContenedorMaestroCMViewModel(ContenedorMaestroCMViewModel newThe0ContenedorMaestroCMViewModel) {
		if (newThe0ContenedorMaestroCMViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CM_VIEW_MODEL && newThe0ContenedorMaestroCMViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newThe0ContenedorMaestroCMViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newThe0ContenedorMaestroCMViewModel != null)
				msgs = ((InternalEObject)newThe0ContenedorMaestroCMViewModel).eInverseAdd(this, ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL__LISTA_CENTRO_MANT, ContenedorMaestroCMViewModel.class, msgs);
			msgs = basicSetThe0ContenedorMaestroCMViewModel(newThe0ContenedorMaestroCMViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CM_VIEW_MODEL, newThe0ContenedorMaestroCMViewModel, newThe0ContenedorMaestroCMViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CM_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetThe0ContenedorMaestroCMViewModel((ContenedorMaestroCMViewModel)otherEnd, msgs);
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
			case ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CM_VIEW_MODEL:
				return basicSetThe0ContenedorMaestroCMViewModel(null, msgs);
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
			case ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CM_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorcrudcmviewmodelPackage.CONTENEDOR_MAESTRO_CM_VIEW_MODEL__LISTA_CENTRO_MANT, ContenedorMaestroCMViewModel.class, msgs);
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
			case ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__NOMBRECM:
				return getNombrecm();
			case ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__NOMBREREPRESENTANTE:
				return getNombrerepresentante();
			case ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__CIUDAD:
				return getCiudad();
			case ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CM_VIEW_MODEL:
				return getThe0ContenedorMaestroCMViewModel();
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
			case ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__NOMBRECM:
				setNombrecm((String)newValue);
				return;
			case ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__NOMBREREPRESENTANTE:
				setNombrerepresentante((String)newValue);
				return;
			case ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__CIUDAD:
				setCiudad((String)newValue);
				return;
			case ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CM_VIEW_MODEL:
				setThe0ContenedorMaestroCMViewModel((ContenedorMaestroCMViewModel)newValue);
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
			case ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__NOMBRECM:
				setNombrecm(NOMBRECM_EDEFAULT);
				return;
			case ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__NOMBREREPRESENTANTE:
				setNombrerepresentante(NOMBREREPRESENTANTE_EDEFAULT);
				return;
			case ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__CIUDAD:
				setCiudad(CIUDAD_EDEFAULT);
				return;
			case ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CM_VIEW_MODEL:
				setThe0ContenedorMaestroCMViewModel((ContenedorMaestroCMViewModel)null);
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
			case ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__NOMBRECM:
				return NOMBRECM_EDEFAULT == null ? nombrecm != null : !NOMBRECM_EDEFAULT.equals(nombrecm);
			case ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__NOMBREREPRESENTANTE:
				return NOMBREREPRESENTANTE_EDEFAULT == null ? nombrerepresentante != null : !NOMBREREPRESENTANTE_EDEFAULT.equals(nombrerepresentante);
			case ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__CIUDAD:
				return CIUDAD_EDEFAULT == null ? ciudad != null : !CIUDAD_EDEFAULT.equals(ciudad);
			case ContenedorcrudcmviewmodelPackage.CENTRO_MANT_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CM_VIEW_MODEL:
				return getThe0ContenedorMaestroCMViewModel() != null;
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
		result.append(", ciudad: ");
		result.append(ciudad);
		result.append(')');
		return result.toString();
	}

} //CentroMantViewModelImpl
