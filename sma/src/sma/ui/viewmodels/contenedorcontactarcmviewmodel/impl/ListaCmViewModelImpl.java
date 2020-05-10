/**
 */
package sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorCmrecomendadosViewModel;
import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage;
import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lista Cm View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ListaCmViewModelImpl#getOwnedByContenedorCmrecomendadosViewModel <em>Owned By Contenedor Cmrecomendados View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ListaCmViewModelImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ListaCmViewModelImpl#getNombrerepresentante <em>Nombrerepresentante</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ListaCmViewModelImpl#getDireccion <em>Direccion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListaCmViewModelImpl extends EObjectImpl implements ListaCmViewModel {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = " ";

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

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
	protected ListaCmViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorcontactarcmviewmodelPackage.Literals.LISTA_CM_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCmrecomendadosViewModel getOwnedByContenedorCmrecomendadosViewModel() {
		if (eContainerFeatureID() != ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL) return null;
		return (ContenedorCmrecomendadosViewModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByContenedorCmrecomendadosViewModel(ContenedorCmrecomendadosViewModel newOwnedByContenedorCmrecomendadosViewModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByContenedorCmrecomendadosViewModel, ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByContenedorCmrecomendadosViewModel(ContenedorCmrecomendadosViewModel newOwnedByContenedorCmrecomendadosViewModel) {
		if (newOwnedByContenedorCmrecomendadosViewModel != eInternalContainer() || (eContainerFeatureID() != ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL && newOwnedByContenedorCmrecomendadosViewModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByContenedorCmrecomendadosViewModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByContenedorCmrecomendadosViewModel != null)
				msgs = ((InternalEObject)newOwnedByContenedorCmrecomendadosViewModel).eInverseAdd(this, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__LISTA_LISTA_CM_VIEW_MODEL, ContenedorCmrecomendadosViewModel.class, msgs);
			msgs = basicSetOwnedByContenedorCmrecomendadosViewModel(newOwnedByContenedorCmrecomendadosViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL, newOwnedByContenedorCmrecomendadosViewModel, newOwnedByContenedorCmrecomendadosViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__NOMBREREPRESENTANTE, oldNombrerepresentante, nombrerepresentante));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__DIRECCION, oldDireccion, direccion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByContenedorCmrecomendadosViewModel((ContenedorCmrecomendadosViewModel)otherEnd, msgs);
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
			case ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL:
				return basicSetOwnedByContenedorCmrecomendadosViewModel(null, msgs);
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
			case ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL:
				return eInternalContainer().eInverseRemove(this, ContenedorcontactarcmviewmodelPackage.CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__LISTA_LISTA_CM_VIEW_MODEL, ContenedorCmrecomendadosViewModel.class, msgs);
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
			case ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL:
				return getOwnedByContenedorCmrecomendadosViewModel();
			case ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__NOMBRE:
				return getNombre();
			case ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__NOMBREREPRESENTANTE:
				return getNombrerepresentante();
			case ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__DIRECCION:
				return getDireccion();
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
			case ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL:
				setOwnedByContenedorCmrecomendadosViewModel((ContenedorCmrecomendadosViewModel)newValue);
				return;
			case ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__NOMBRE:
				setNombre((String)newValue);
				return;
			case ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__NOMBREREPRESENTANTE:
				setNombrerepresentante((String)newValue);
				return;
			case ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__DIRECCION:
				setDireccion((String)newValue);
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
			case ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL:
				setOwnedByContenedorCmrecomendadosViewModel((ContenedorCmrecomendadosViewModel)null);
				return;
			case ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__NOMBREREPRESENTANTE:
				setNombrerepresentante(NOMBREREPRESENTANTE_EDEFAULT);
				return;
			case ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__DIRECCION:
				setDireccion(DIRECCION_EDEFAULT);
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
			case ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL:
				return getOwnedByContenedorCmrecomendadosViewModel() != null;
			case ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__NOMBREREPRESENTANTE:
				return NOMBREREPRESENTANTE_EDEFAULT == null ? nombrerepresentante != null : !NOMBREREPRESENTANTE_EDEFAULT.equals(nombrerepresentante);
			case ContenedorcontactarcmviewmodelPackage.LISTA_CM_VIEW_MODEL__DIRECCION:
				return DIRECCION_EDEFAULT == null ? direccion != null : !DIRECCION_EDEFAULT.equals(direccion);
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", nombrerepresentante: ");
		result.append(nombrerepresentante);
		result.append(", direccion: ");
		result.append(direccion);
		result.append(')');
		return result.toString();
	}

} //ListaCmViewModelImpl
