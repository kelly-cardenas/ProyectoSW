/**
 */
package sma.ui.viewmodels.contenedorescaneoviewmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel;
import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel;
import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage;
import sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel;

import sma.ui.viewmodels.impl.ViewModelImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Fallas View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorFallasViewModelImpl#getOwnedByContenedorEscaneoViewModel <em>Owned By Contenedor Escaneo View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorFallasViewModelImpl#getNumeroerrores <em>Numeroerrores</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorFallasViewModelImpl#getEstadoveh <em>Estadoveh</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorFallasViewModelImpl#getListaListaFallasViewModel <em>Lista Lista Fallas View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorFallasViewModelImpl extends ViewModelImpl implements ContenedorFallasViewModel {
	/**
	 * The default value of the '{@link #getNumeroerrores() <em>Numeroerrores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroerrores()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMEROERRORES_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getNumeroerrores() <em>Numeroerrores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroerrores()
	 * @generated
	 * @ordered
	 */
	protected String numeroerrores = NUMEROERRORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstadoveh() <em>Estadoveh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstadoveh()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTADOVEH_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getEstadoveh() <em>Estadoveh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstadoveh()
	 * @generated
	 * @ordered
	 */
	protected String estadoveh = ESTADOVEH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListaListaFallasViewModel() <em>Lista Lista Fallas View Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaListaFallasViewModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ListaFallasViewModel> listaListaFallasViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorFallasViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorescaneoviewmodelPackage.Literals.CONTENEDOR_FALLAS_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorEscaneoViewModel getOwnedByContenedorEscaneoViewModel() {
		if (eContainerFeatureID() != ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL) return null;
		return (ContenedorEscaneoViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorEscaneoViewModel(ContenedorEscaneoViewModel newOwnedByContenedorEscaneoViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorEscaneoViewModel, ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorEscaneoViewModel(ContenedorEscaneoViewModel newOwnedByContenedorEscaneoViewModel) {
		if (newOwnedByContenedorEscaneoViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL && newOwnedByContenedorEscaneoViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorEscaneoViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorEscaneoViewModel != null)
				msgs = ((InternalEObject)newOwnedByContenedorEscaneoViewModel).eInverseAdd(this, ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_FALLAS_VIEW_MODEL, ContenedorEscaneoViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorEscaneoViewModel(newOwnedByContenedorEscaneoViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL, newOwnedByContenedorEscaneoViewModel, newOwnedByContenedorEscaneoViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroerrores() {
		return numeroerrores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroerrores(String newNumeroerrores) {
		String oldNumeroerrores = numeroerrores;
		numeroerrores = newNumeroerrores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__NUMEROERRORES, oldNumeroerrores, numeroerrores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstadoveh() {
		return estadoveh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstadoveh(String newEstadoveh) {
		String oldEstadoveh = estadoveh;
		estadoveh = newEstadoveh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__ESTADOVEH, oldEstadoveh, estadoveh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListaFallasViewModel> getListaListaFallasViewModel() {
		if (listaListaFallasViewModel == null) {
			listaListaFallasViewModel = new EObjectContainmentWithInverseEList<ListaFallasViewModel>(ListaFallasViewModel.class, this, ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__LISTA_LISTA_FALLAS_VIEW_MODEL, ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_FALLAS_VIEW_MODEL);
		}
		return listaListaFallasViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByContenedorEscaneoViewModel((ContenedorEscaneoViewModel)otherEnd, msgs);
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__LISTA_LISTA_FALLAS_VIEW_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaListaFallasViewModel()).basicAdd(otherEnd, msgs);
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL:
				return basicSetOwnedByContenedorEscaneoViewModel(null, msgs);
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__LISTA_LISTA_FALLAS_VIEW_MODEL:
				return ((InternalEList<?>)getListaListaFallasViewModel()).basicRemove(otherEnd, msgs);
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorescaneoviewmodelPackage.CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_FALLAS_VIEW_MODEL, ContenedorEscaneoViewModel.class, msgs);
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL:
				return getOwnedByContenedorEscaneoViewModel();
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__NUMEROERRORES:
				return getNumeroerrores();
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__ESTADOVEH:
				return getEstadoveh();
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__LISTA_LISTA_FALLAS_VIEW_MODEL:
				return getListaListaFallasViewModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL:
				setOwnedByContenedorEscaneoViewModel((ContenedorEscaneoViewModel)newValue);
				return;
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__NUMEROERRORES:
				setNumeroerrores((String)newValue);
				return;
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__ESTADOVEH:
				setEstadoveh((String)newValue);
				return;
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__LISTA_LISTA_FALLAS_VIEW_MODEL:
				getListaListaFallasViewModel().clear();
				getListaListaFallasViewModel().addAll((Collection<? extends ListaFallasViewModel>)newValue);
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL:
				setOwnedByContenedorEscaneoViewModel((ContenedorEscaneoViewModel)null);
				return;
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__NUMEROERRORES:
				setNumeroerrores(NUMEROERRORES_EDEFAULT);
				return;
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__ESTADOVEH:
				setEstadoveh(ESTADOVEH_EDEFAULT);
				return;
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__LISTA_LISTA_FALLAS_VIEW_MODEL:
				getListaListaFallasViewModel().clear();
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
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL:
				return getOwnedByContenedorEscaneoViewModel() != null;
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__NUMEROERRORES:
				return NUMEROERRORES_EDEFAULT == null ? numeroerrores != null : !NUMEROERRORES_EDEFAULT.equals(numeroerrores);
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__ESTADOVEH:
				return ESTADOVEH_EDEFAULT == null ? estadoveh != null : !ESTADOVEH_EDEFAULT.equals(estadoveh);
			case ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__LISTA_LISTA_FALLAS_VIEW_MODEL:
				return listaListaFallasViewModel != null && !listaListaFallasViewModel.isEmpty();
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
		result.append(" (numeroerrores: ");
		result.append(numeroerrores);
		result.append(", estadoveh: ");
		result.append(estadoveh);
		result.append(')');
		return result.toString();
	}

} //ContenedorFallasViewModelImpl
