/**
 */
package sma.ui.viewmodels.contenedorescaneoviewmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel;
import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel;
import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage;

import sma.ui.viewmodels.impl.ViewModelImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Informacion Emision Gases View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorInformacionEmisionGasesViewModelImpl#getOwnedByContenedorEscaneoViewModel <em>Owned By Contenedor Escaneo View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorInformacionEmisionGasesViewModelImpl#getGasesofensivos <em>Gasesofensivos</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorInformacionEmisionGasesViewModelImpl#getGasesnocivos <em>Gasesnocivos</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorInformacionEmisionGasesViewModelImpl#getEstadovehiculo <em>Estadovehiculo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorInformacionEmisionGasesViewModelImpl extends ViewModelImpl implements ContenedorInformacionEmisionGasesViewModel {
	/**
	 * The default value of the '{@link #getGasesofensivos() <em>Gasesofensivos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGasesofensivos()
	 * @generated
	 * @ordered
	 */
	protected static final String GASESOFENSIVOS_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getGasesofensivos() <em>Gasesofensivos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGasesofensivos()
	 * @generated
	 * @ordered
	 */
	protected String gasesofensivos = GASESOFENSIVOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGasesnocivos() <em>Gasesnocivos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGasesnocivos()
	 * @generated
	 * @ordered
	 */
	protected static final String GASESNOCIVOS_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getGasesnocivos() <em>Gasesnocivos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGasesnocivos()
	 * @generated
	 * @ordered
	 */
	protected String gasesnocivos = GASESNOCIVOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstadovehiculo() <em>Estadovehiculo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstadovehiculo()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTADOVEHICULO_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getEstadovehiculo() <em>Estadovehiculo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstadovehiculo()
	 * @generated
	 * @ordered
	 */
	protected String estadovehiculo = ESTADOVEHICULO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorInformacionEmisionGasesViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorescaneoviewmodelPackage.Literals.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorEscaneoViewModel getOwnedByContenedorEscaneoViewModel() {
		if (eContainerFeatureID() != ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL) return null;
		return (ContenedorEscaneoViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorEscaneoViewModel(ContenedorEscaneoViewModel newOwnedByContenedorEscaneoViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorEscaneoViewModel, ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorEscaneoViewModel(ContenedorEscaneoViewModel newOwnedByContenedorEscaneoViewModel) {
		if (newOwnedByContenedorEscaneoViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL && newOwnedByContenedorEscaneoViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorEscaneoViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorEscaneoViewModel != null)
				msgs = ((InternalEObject)newOwnedByContenedorEscaneoViewModel).eInverseAdd(this, ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL, ContenedorEscaneoViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorEscaneoViewModel(newOwnedByContenedorEscaneoViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL, newOwnedByContenedorEscaneoViewModel, newOwnedByContenedorEscaneoViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGasesofensivos() {
		return gasesofensivos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGasesofensivos(String newGasesofensivos) {
		String oldGasesofensivos = gasesofensivos;
		gasesofensivos = newGasesofensivos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__GASESOFENSIVOS, oldGasesofensivos, gasesofensivos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGasesnocivos() {
		return gasesnocivos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGasesnocivos(String newGasesnocivos) {
		String oldGasesnocivos = gasesnocivos;
		gasesnocivos = newGasesnocivos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__GASESNOCIVOS, oldGasesnocivos, gasesnocivos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstadovehiculo() {
		return estadovehiculo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstadovehiculo(String newEstadovehiculo) {
		String oldEstadovehiculo = estadovehiculo;
		estadovehiculo = newEstadovehiculo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__ESTADOVEHICULO, oldEstadovehiculo, estadovehiculo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByContenedorEscaneoViewModel((ContenedorEscaneoViewModel)otherEnd, msgs);
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL:
				return basicSetOwnedByContenedorEscaneoViewModel(null, msgs);
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL, ContenedorEscaneoViewModel.class, msgs);
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL:
				return getOwnedByContenedorEscaneoViewModel();
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__GASESOFENSIVOS:
				return getGasesofensivos();
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__GASESNOCIVOS:
				return getGasesnocivos();
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__ESTADOVEHICULO:
				return getEstadovehiculo();
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL:
				setOwnedByContenedorEscaneoViewModel((ContenedorEscaneoViewModel)newValue);
				return;
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__GASESOFENSIVOS:
				setGasesofensivos((String)newValue);
				return;
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__GASESNOCIVOS:
				setGasesnocivos((String)newValue);
				return;
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__ESTADOVEHICULO:
				setEstadovehiculo((String)newValue);
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL:
				setOwnedByContenedorEscaneoViewModel((ContenedorEscaneoViewModel)null);
				return;
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__GASESOFENSIVOS:
				setGasesofensivos(GASESOFENSIVOS_EDEFAULT);
				return;
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__GASESNOCIVOS:
				setGasesnocivos(GASESNOCIVOS_EDEFAULT);
				return;
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__ESTADOVEHICULO:
				setEstadovehiculo(ESTADOVEHICULO_EDEFAULT);
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL:
				return getOwnedByContenedorEscaneoViewModel() != null;
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__GASESOFENSIVOS:
				return GASESOFENSIVOS_EDEFAULT == null ? gasesofensivos != null : !GASESOFENSIVOS_EDEFAULT.equals(gasesofensivos);
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__GASESNOCIVOS:
				return GASESNOCIVOS_EDEFAULT == null ? gasesnocivos != null : !GASESNOCIVOS_EDEFAULT.equals(gasesnocivos);
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__ESTADOVEHICULO:
				return ESTADOVEHICULO_EDEFAULT == null ? estadovehiculo != null : !ESTADOVEHICULO_EDEFAULT.equals(estadovehiculo);
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
		result.append(" (gasesofensivos: ");
		result.append(gasesofensivos);
		result.append(", gasesnocivos: ");
		result.append(gasesnocivos);
		result.append(", estadovehiculo: ");
		result.append(estadovehiculo);
		result.append(')');
		return result.toString();
	}

} //ContenedorInformacionEmisionGasesViewModelImpl
