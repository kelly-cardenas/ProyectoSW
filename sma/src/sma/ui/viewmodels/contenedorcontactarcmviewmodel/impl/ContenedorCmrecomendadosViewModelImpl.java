/**
 */
package sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl;

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

import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorCmrecomendadosViewModel;
import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel;
import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage;
import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel;

import sma.ui.viewmodels.impl.ViewModelImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Cmrecomendados View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorCmrecomendadosViewModelImpl#getListaListaCmViewModel <em>Lista Lista Cm View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorCmrecomendadosViewModelImpl#getOwnedByContenedorContactarCmViewModel <em>Owned By Contenedor Contactar Cm View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorCmrecomendadosViewModelImpl extends ViewModelImpl implements ContenedorCmrecomendadosViewModel {
	/**
	 * The cached value of the '{@link #getListaListaCmViewModel() <em>Lista Lista Cm View Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaListaCmViewModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ListaCmViewModel> listaListaCmViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorCmrecomendadosViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcontactarcmviewmodelPackage.Literals.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListaCmViewModel> getListaListaCmViewModel() {
		if (listaListaCmViewModel == null) {
			listaListaCmViewModel = new EObjectContainmentWithInverseEList<ListaCmViewModel>(ListaCmViewModel.class, this, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__LISTA_LISTA_CM_VIEW_MODEL, ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL);
		}
		return listaListaCmViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorContactarCmViewModel getOwnedByContenedorContactarCmViewModel() {
		if (eContainerFeatureID() != ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL) return null;
		return (ContenedorContactarCmViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorContactarCmViewModel(ContenedorContactarCmViewModel newOwnedByContenedorContactarCmViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorContactarCmViewModel, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorContactarCmViewModel(ContenedorContactarCmViewModel newOwnedByContenedorContactarCmViewModel) {
		if (newOwnedByContenedorContactarCmViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL && newOwnedByContenedorContactarCmViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorContactarCmViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorContactarCmViewModel != null)
				msgs = ((InternalEObject)newOwnedByContenedorContactarCmViewModel).eInverseAdd(this, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL, ContenedorContactarCmViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorContactarCmViewModel(newOwnedByContenedorContactarCmViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL, newOwnedByContenedorContactarCmViewModel, newOwnedByContenedorContactarCmViewModel));
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
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__LISTA_LISTA_CM_VIEW_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaListaCmViewModel()).basicAdd(otherEnd, msgs);
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL:
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
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__LISTA_LISTA_CM_VIEW_MODEL:
				return ((InternalEList<?>)getListaListaCmViewModel()).basicRemove(otherEnd, msgs);
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL:
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
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL, ContenedorContactarCmViewModel.class, msgs);
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
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__LISTA_LISTA_CM_VIEW_MODEL:
				return getListaListaCmViewModel();
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL:
				return getOwnedByContenedorContactarCmViewModel();
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
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__LISTA_LISTA_CM_VIEW_MODEL:
				getListaListaCmViewModel().clear();
				getListaListaCmViewModel().addAll((Collection<? extends ListaCmViewModel>)newValue);
				return;
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL:
				setOwnedByContenedorContactarCmViewModel((ContenedorContactarCmViewModel)newValue);
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
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__LISTA_LISTA_CM_VIEW_MODEL:
				getListaListaCmViewModel().clear();
				return;
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL:
				setOwnedByContenedorContactarCmViewModel((ContenedorContactarCmViewModel)null);
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
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__LISTA_LISTA_CM_VIEW_MODEL:
				return listaListaCmViewModel != null && !listaListaCmViewModel.isEmpty();
			case ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL:
				return getOwnedByContenedorContactarCmViewModel() != null;
		}
		return super.eIsSet(featureID);
	}

} //ContenedorCmrecomendadosViewModelImpl
