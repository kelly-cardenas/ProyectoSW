/**
 */
package sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel;
import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel;
import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage;

import sma.ui.viewmodels.impl.ViewModelImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Ubicacionactual View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorUbicacionactualViewModelImpl#getOwnedByContenedorContactarCmViewModel <em>Owned By Contenedor Contactar Cm View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorUbicacionactualViewModelImpl#getPais <em>Pais</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorUbicacionactualViewModelImpl#getDepartamento <em>Departamento</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorUbicacionactualViewModelImpl#getCiudad <em>Ciudad</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorUbicacionactualViewModelImpl extends ViewModelImpl implements ContenedorUbicacionactualViewModel {
	/**
	 * The default value of the '{@link #getPais() <em>Pais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPais()
	 * @generated
	 * @ordered
	 */
	protected static final String PAIS_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getPais() <em>Pais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPais()
	 * @generated
	 * @ordered
	 */
	protected String pais = PAIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepartamento() <em>Departamento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartamento()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPARTAMENTO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getDepartamento() <em>Departamento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartamento()
	 * @generated
	 * @ordered
	 */
	protected String departamento = DEPARTAMENTO_EDEFAULT;

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
	protected ContenedorUbicacionactualViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcontactarcmviewmodelPackage.Literals.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorContactarCmViewModel getOwnedByContenedorContactarCmViewModel() {
		if (eContainerFeatureID() != ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL) return null;
		return (ContenedorContactarCmViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorContactarCmViewModel(ContenedorContactarCmViewModel newOwnedByContenedorContactarCmViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorContactarCmViewModel, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorContactarCmViewModel(ContenedorContactarCmViewModel newOwnedByContenedorContactarCmViewModel) {
		if (newOwnedByContenedorContactarCmViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL && newOwnedByContenedorContactarCmViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorContactarCmViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorContactarCmViewModel != null)
				msgs = ((InternalEObject)newOwnedByContenedorContactarCmViewModel).eInverseAdd(this, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL, ContenedorContactarCmViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorContactarCmViewModel(newOwnedByContenedorContactarCmViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL, newOwnedByContenedorContactarCmViewModel, newOwnedByContenedorContactarCmViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPais(String newPais) {
		String oldPais = pais;
		pais = newPais;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__PAIS, oldPais, pais));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDepartamento() {
		return departamento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartamento(String newDepartamento) {
		String oldDepartamento = departamento;
		departamento = newDepartamento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__DEPARTAMENTO, oldDepartamento, departamento));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__CIUDAD, oldCiudad, ciudad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByContenedorContactarCmViewModel((ContenedorContactarCmViewModel)otherEnd, msgs);
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
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL:
				return basicSetOwnedByContenedorContactarCmViewModel(null, msgs);
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
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL, ContenedorContactarCmViewModel.class, msgs);
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
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL:
				return getOwnedByContenedorContactarCmViewModel();
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__PAIS:
				return getPais();
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__DEPARTAMENTO:
				return getDepartamento();
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__CIUDAD:
				return getCiudad();
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
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL:
				setOwnedByContenedorContactarCmViewModel((ContenedorContactarCmViewModel)newValue);
				return;
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__PAIS:
				setPais((String)newValue);
				return;
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__DEPARTAMENTO:
				setDepartamento((String)newValue);
				return;
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__CIUDAD:
				setCiudad((String)newValue);
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
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL:
				setOwnedByContenedorContactarCmViewModel((ContenedorContactarCmViewModel)null);
				return;
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__PAIS:
				setPais(PAIS_EDEFAULT);
				return;
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__DEPARTAMENTO:
				setDepartamento(DEPARTAMENTO_EDEFAULT);
				return;
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__CIUDAD:
				setCiudad(CIUDAD_EDEFAULT);
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
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL:
				return getOwnedByContenedorContactarCmViewModel() != null;
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__PAIS:
				return PAIS_EDEFAULT == null ? pais != null : !PAIS_EDEFAULT.equals(pais);
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__DEPARTAMENTO:
				return DEPARTAMENTO_EDEFAULT == null ? departamento != null : !DEPARTAMENTO_EDEFAULT.equals(departamento);
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__CIUDAD:
				return CIUDAD_EDEFAULT == null ? ciudad != null : !CIUDAD_EDEFAULT.equals(ciudad);
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
		result.append(" (pais: ");
		result.append(pais);
		result.append(", departamento: ");
		result.append(departamento);
		result.append(", ciudad: ");
		result.append(ciudad);
		result.append(')');
		return result.toString();
	}

} //ContenedorUbicacionactualViewModelImpl
