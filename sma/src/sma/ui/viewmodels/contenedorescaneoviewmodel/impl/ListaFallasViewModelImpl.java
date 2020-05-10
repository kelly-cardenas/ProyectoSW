/**
 */
package sma.ui.viewmodels.contenedorescaneoviewmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel;
import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage;
import sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lista Fallas View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ListaFallasViewModelImpl#getOwnedByContenedorFallasViewModel <em>Owned By Contenedor Fallas View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ListaFallasViewModelImpl#getGravedad <em>Gravedad</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ListaFallasViewModelImpl#getPiesaaveriada <em>Piesaaveriada</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ListaFallasViewModelImpl#getOrigen <em>Origen</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ListaFallasViewModelImpl#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListaFallasViewModelImpl extends EObjectImpl implements ListaFallasViewModel {
	/**
	 * The default value of the '{@link #getGravedad() <em>Gravedad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravedad()
	 * @generated
	 * @ordered
	 */
	protected static final String GRAVEDAD_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getGravedad() <em>Gravedad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravedad()
	 * @generated
	 * @ordered
	 */
	protected String gravedad = GRAVEDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPiesaaveriada() <em>Piesaaveriada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPiesaaveriada()
	 * @generated
	 * @ordered
	 */
	protected static final String PIESAAVERIADA_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getPiesaaveriada() <em>Piesaaveriada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPiesaaveriada()
	 * @generated
	 * @ordered
	 */
	protected String piesaaveriada = PIESAAVERIADA_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrigen() <em>Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGEN_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getOrigen() <em>Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected String origen = ORIGEN_EDEFAULT;

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
	protected ListaFallasViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorescaneoviewmodelPackage.Literals.LISTA_FALLAS_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorFallasViewModel getOwnedByContenedorFallasViewModel() {
		if (eContainerFeatureID() != ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_FALLAS_VIEW_MODEL) return null;
		return (ContenedorFallasViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorFallasViewModel(ContenedorFallasViewModel newOwnedByContenedorFallasViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorFallasViewModel, ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_FALLAS_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorFallasViewModel(ContenedorFallasViewModel newOwnedByContenedorFallasViewModel) {
		if (newOwnedByContenedorFallasViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_FALLAS_VIEW_MODEL && newOwnedByContenedorFallasViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorFallasViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorFallasViewModel != null)
				msgs = ((InternalEObject)newOwnedByContenedorFallasViewModel).eInverseAdd(this, ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__LISTA_LISTA_FALLAS_VIEW_MODEL, ContenedorFallasViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorFallasViewModel(newOwnedByContenedorFallasViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_FALLAS_VIEW_MODEL, newOwnedByContenedorFallasViewModel, newOwnedByContenedorFallasViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGravedad() {
		return gravedad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGravedad(String newGravedad) {
		String oldGravedad = gravedad;
		gravedad = newGravedad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__GRAVEDAD, oldGravedad, gravedad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPiesaaveriada() {
		return piesaaveriada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPiesaaveriada(String newPiesaaveriada) {
		String oldPiesaaveriada = piesaaveriada;
		piesaaveriada = newPiesaaveriada;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__PIESAAVERIADA, oldPiesaaveriada, piesaaveriada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigen(String newOrigen) {
		String oldOrigen = origen;
		origen = newOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__ORIGEN, oldOrigen, origen));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_FALLAS_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByContenedorFallasViewModel((ContenedorFallasViewModel)otherEnd, msgs);
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
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_FALLAS_VIEW_MODEL:
				return basicSetOwnedByContenedorFallasViewModel(null, msgs);
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
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_FALLAS_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorescaneoviewmodelPackage.CONTENEDOR_FALLAS_VIEW_MODEL__LISTA_LISTA_FALLAS_VIEW_MODEL, ContenedorFallasViewModel.class, msgs);
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
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_FALLAS_VIEW_MODEL:
				return getOwnedByContenedorFallasViewModel();
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__GRAVEDAD:
				return getGravedad();
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__PIESAAVERIADA:
				return getPiesaaveriada();
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__ORIGEN:
				return getOrigen();
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__DESCRIPCION:
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
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_FALLAS_VIEW_MODEL:
				setOwnedByContenedorFallasViewModel((ContenedorFallasViewModel)newValue);
				return;
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__GRAVEDAD:
				setGravedad((String)newValue);
				return;
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__PIESAAVERIADA:
				setPiesaaveriada((String)newValue);
				return;
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__ORIGEN:
				setOrigen((String)newValue);
				return;
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__DESCRIPCION:
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
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_FALLAS_VIEW_MODEL:
				setOwnedByContenedorFallasViewModel((ContenedorFallasViewModel)null);
				return;
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__GRAVEDAD:
				setGravedad(GRAVEDAD_EDEFAULT);
				return;
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__PIESAAVERIADA:
				setPiesaaveriada(PIESAAVERIADA_EDEFAULT);
				return;
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__ORIGEN:
				setOrigen(ORIGEN_EDEFAULT);
				return;
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__DESCRIPCION:
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
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_FALLAS_VIEW_MODEL:
				return getOwnedByContenedorFallasViewModel() != null;
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__GRAVEDAD:
				return GRAVEDAD_EDEFAULT == null ? gravedad != null : !GRAVEDAD_EDEFAULT.equals(gravedad);
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__PIESAAVERIADA:
				return PIESAAVERIADA_EDEFAULT == null ? piesaaveriada != null : !PIESAAVERIADA_EDEFAULT.equals(piesaaveriada);
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__ORIGEN:
				return ORIGEN_EDEFAULT == null ? origen != null : !ORIGEN_EDEFAULT.equals(origen);
			case ContenedorescaneoviewmodelPackage.LISTA_FALLAS_VIEW_MODEL__DESCRIPCION:
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
		result.append(" (gravedad: ");
		result.append(gravedad);
		result.append(", piesaaveriada: ");
		result.append(piesaaveriada);
		result.append(", origen: ");
		result.append(origen);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //ListaFallasViewModelImpl
