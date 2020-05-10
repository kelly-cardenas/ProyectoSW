/**
 */
package sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sma.ui.UI;
import sma.ui.UiPackage;

import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel;
import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel;
import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorVehiculosRegistradosViewModel;
import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenedor Registro Vehiculo View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorRegistroVehiculoViewModelImpl#getOwnedByUI <em>Owned By UI</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorRegistroVehiculoViewModelImpl#getTheContenedorDetalleVehiculoViewModel <em>The Contenedor Detalle Vehiculo View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorRegistroVehiculoViewModelImpl#getTheContenedorVehiculosRegistradosViewModel <em>The Contenedor Vehiculos Registrados View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContenedorRegistroVehiculoViewModelImpl extends EObjectImpl implements ContenedorRegistroVehiculoViewModel {
	/**
	 * The cached value of the '{@link #getTheContenedorDetalleVehiculoViewModel() <em>The Contenedor Detalle Vehiculo View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorDetalleVehiculoViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorDetalleVehiculoViewModel theContenedorDetalleVehiculoViewModel;

	/**
	 * The cached value of the '{@link #getTheContenedorVehiculosRegistradosViewModel() <em>The Contenedor Vehiculos Registrados View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorVehiculosRegistradosViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorVehiculosRegistradosViewModel theContenedorVehiculosRegistradosViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContenedorRegistroVehiculoViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContenedorregistrovehiculoviewmodelPackage.Literals.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getOwnedByUI() {
		if (eContainerFeatureID() != ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__OWNED_BY_UI) return null;
		return (UI)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByUI(UI newOwnedByUI, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByUI, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__OWNED_BY_UI, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByUI(UI newOwnedByUI) {
		if (newOwnedByUI != eInternalContainer() || (eContainerFeatureID() != ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__OWNED_BY_UI && newOwnedByUI != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByUI))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByUI != null)
				msgs = ((InternalEObject)newOwnedByUI).eInverseAdd(this, UiPackage.UI__THE_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL, UI.class, msgs);
			msgs = basicSetOwnedByUI(newOwnedByUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__OWNED_BY_UI, newOwnedByUI, newOwnedByUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorDetalleVehiculoViewModel getTheContenedorDetalleVehiculoViewModel() {
		return theContenedorDetalleVehiculoViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorDetalleVehiculoViewModel(ContenedorDetalleVehiculoViewModel newTheContenedorDetalleVehiculoViewModel, NotificationChain msgs) {
		ContenedorDetalleVehiculoViewModel oldTheContenedorDetalleVehiculoViewModel = theContenedorDetalleVehiculoViewModel;
		theContenedorDetalleVehiculoViewModel = newTheContenedorDetalleVehiculoViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL, oldTheContenedorDetalleVehiculoViewModel, newTheContenedorDetalleVehiculoViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorDetalleVehiculoViewModel(ContenedorDetalleVehiculoViewModel newTheContenedorDetalleVehiculoViewModel) {
		if (newTheContenedorDetalleVehiculoViewModel != theContenedorDetalleVehiculoViewModel) {
			NotificationChain msgs = null;
			if (theContenedorDetalleVehiculoViewModel != null)
				msgs = ((InternalEObject)theContenedorDetalleVehiculoViewModel).eInverseRemove(this, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL, ContenedorDetalleVehiculoViewModel.class, msgs);
			if (newTheContenedorDetalleVehiculoViewModel != null)
				msgs = ((InternalEObject)newTheContenedorDetalleVehiculoViewModel).eInverseAdd(this, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL, ContenedorDetalleVehiculoViewModel.class, msgs);
			msgs = basicSetTheContenedorDetalleVehiculoViewModel(newTheContenedorDetalleVehiculoViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL, newTheContenedorDetalleVehiculoViewModel, newTheContenedorDetalleVehiculoViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorVehiculosRegistradosViewModel getTheContenedorVehiculosRegistradosViewModel() {
		return theContenedorVehiculosRegistradosViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorVehiculosRegistradosViewModel(ContenedorVehiculosRegistradosViewModel newTheContenedorVehiculosRegistradosViewModel, NotificationChain msgs) {
		ContenedorVehiculosRegistradosViewModel oldTheContenedorVehiculosRegistradosViewModel = theContenedorVehiculosRegistradosViewModel;
		theContenedorVehiculosRegistradosViewModel = newTheContenedorVehiculosRegistradosViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL, oldTheContenedorVehiculosRegistradosViewModel, newTheContenedorVehiculosRegistradosViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorVehiculosRegistradosViewModel(ContenedorVehiculosRegistradosViewModel newTheContenedorVehiculosRegistradosViewModel) {
		if (newTheContenedorVehiculosRegistradosViewModel != theContenedorVehiculosRegistradosViewModel) {
			NotificationChain msgs = null;
			if (theContenedorVehiculosRegistradosViewModel != null)
				msgs = ((InternalEObject)theContenedorVehiculosRegistradosViewModel).eInverseRemove(this, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL, ContenedorVehiculosRegistradosViewModel.class, msgs);
			if (newTheContenedorVehiculosRegistradosViewModel != null)
				msgs = ((InternalEObject)newTheContenedorVehiculosRegistradosViewModel).eInverseAdd(this, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL, ContenedorVehiculosRegistradosViewModel.class, msgs);
			msgs = basicSetTheContenedorVehiculosRegistradosViewModel(newTheContenedorVehiculosRegistradosViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL, newTheContenedorVehiculosRegistradosViewModel, newTheContenedorVehiculosRegistradosViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String upadateDialog(final String evento) {
		
				String action = "";
				return action;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void implementarModelo() {
				ContenedorDetalleVehiculoViewModel detalleVehiculoVM 				= getTheContenedorDetalleVehiculoViewModel();
				ContenedorVehiculosRegistradosViewModel vehiculosRegistradosVM 	= getTheContenedorVehiculosRegistradosViewModel();
				
				
				if ( detalleVehiculoVM == null ) {
					detalleVehiculoVM	= sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelFactory
											.eINSTANCE.createContenedorDetalleVehiculoViewModel();
				}
				
				if ( vehiculosRegistradosVM == null ) {
					vehiculosRegistradosVM = sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelFactory
											.eINSTANCE.createContenedorVehiculosRegistradosViewModel();
				}
				
				setTheContenedorDetalleVehiculoViewModel(detalleVehiculoVM);
				setTheContenedorVehiculosRegistradosViewModel(vehiculosRegistradosVM);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registrarVehiculo() {
			getOwnedByUI().registrarVehiculo(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void actualizarVentanaRegistroVehiculo() {
		getOwnedByUI().actualizarVentanaRegistroVehiculo(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__OWNED_BY_UI:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByUI((UI)otherEnd, msgs);
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL:
				if (theContenedorDetalleVehiculoViewModel != null)
					msgs = ((InternalEObject)theContenedorDetalleVehiculoViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorDetalleVehiculoViewModel((ContenedorDetalleVehiculoViewModel)otherEnd, msgs);
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL:
				if (theContenedorVehiculosRegistradosViewModel != null)
					msgs = ((InternalEObject)theContenedorVehiculosRegistradosViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorVehiculosRegistradosViewModel((ContenedorVehiculosRegistradosViewModel)otherEnd, msgs);
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
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__OWNED_BY_UI:
				return basicSetOwnedByUI(null, msgs);
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL:
				return basicSetTheContenedorDetalleVehiculoViewModel(null, msgs);
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL:
				return basicSetTheContenedorVehiculosRegistradosViewModel(null, msgs);
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
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__OWNED_BY_UI:
				return eInternalContainer().eInverseRemove(this, UiPackage.UI__THE_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL, UI.class, msgs);
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
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__OWNED_BY_UI:
				return getOwnedByUI();
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL:
				return getTheContenedorDetalleVehiculoViewModel();
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL:
				return getTheContenedorVehiculosRegistradosViewModel();
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
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__OWNED_BY_UI:
				setOwnedByUI((UI)newValue);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL:
				setTheContenedorDetalleVehiculoViewModel((ContenedorDetalleVehiculoViewModel)newValue);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL:
				setTheContenedorVehiculosRegistradosViewModel((ContenedorVehiculosRegistradosViewModel)newValue);
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
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__OWNED_BY_UI:
				setOwnedByUI((UI)null);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL:
				setTheContenedorDetalleVehiculoViewModel((ContenedorDetalleVehiculoViewModel)null);
				return;
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL:
				setTheContenedorVehiculosRegistradosViewModel((ContenedorVehiculosRegistradosViewModel)null);
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
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__OWNED_BY_UI:
				return getOwnedByUI() != null;
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL:
				return theContenedorDetalleVehiculoViewModel != null;
			case ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL:
				return theContenedorVehiculosRegistradosViewModel != null;
		}
		return super.eIsSet(featureID);
	}

} //ContenedorRegistroVehiculoViewModelImpl
