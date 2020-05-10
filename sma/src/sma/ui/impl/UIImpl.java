/**
 */
package sma.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import sma.ModelFactory;

import sma.domain.Domain;
import sma.domain.DomainPackage;

import sma.smaPackage;

import sma.ui.UI;
import sma.ui.UiPackage;

import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage;

import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage;

import sma.ui.viewmodels.contenedorloginviewmodel.ContenedorLoginViewModel;
import sma.ui.viewmodels.contenedorloginviewmodel.ContenedorloginviewmodelPackage;

import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel;
import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.impl.UIImpl#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link sma.ui.impl.UIImpl#getIdLogueado <em>Id Logueado</em>}</li>
 *   <li>{@link sma.ui.impl.UIImpl#getTipoLogueado <em>Tipo Logueado</em>}</li>
 *   <li>{@link sma.ui.impl.UIImpl#getTheDomain <em>The Domain</em>}</li>
 *   <li>{@link sma.ui.impl.UIImpl#getTheContenedorCrudClienteViewModel <em>The Contenedor Crud Cliente View Model</em>}</li>
 *   <li>{@link sma.ui.impl.UIImpl#getTheContenedorCRUDCMViewModel <em>The Contenedor CRUDCM View Model</em>}</li>
 *   <li>{@link sma.ui.impl.UIImpl#getTheContenedorRegistroVehiculoViewModel <em>The Contenedor Registro Vehiculo View Model</em>}</li>
 *   <li>{@link sma.ui.impl.UIImpl#getTheContenedorLoginViewModel <em>The Contenedor Login View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIImpl extends EObjectImpl implements UI {
	/**
	 * The default value of the '{@link #getIdLogueado() <em>Id Logueado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdLogueado()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_LOGUEADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdLogueado() <em>Id Logueado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdLogueado()
	 * @generated
	 * @ordered
	 */
	protected String idLogueado = ID_LOGUEADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoLogueado() <em>Tipo Logueado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoLogueado()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_LOGUEADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipoLogueado() <em>Tipo Logueado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoLogueado()
	 * @generated
	 * @ordered
	 */
	protected String tipoLogueado = TIPO_LOGUEADO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTheDomain() <em>The Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheDomain()
	 * @generated
	 * @ordered
	 */
	protected Domain theDomain;

	/**
	 * The cached value of the '{@link #getTheContenedorCrudClienteViewModel() <em>The Contenedor Crud Cliente View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorCrudClienteViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorCrudClienteViewModel theContenedorCrudClienteViewModel;

	/**
	 * The cached value of the '{@link #getTheContenedorCRUDCMViewModel() <em>The Contenedor CRUDCM View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorCRUDCMViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorCRUDCMViewModel theContenedorCRUDCMViewModel;

	/**
	 * The cached value of the '{@link #getTheContenedorRegistroVehiculoViewModel() <em>The Contenedor Registro Vehiculo View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorRegistroVehiculoViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorRegistroVehiculoViewModel theContenedorRegistroVehiculoViewModel;

	/**
	 * The cached value of the '{@link #getTheContenedorLoginViewModel() <em>The Contenedor Login View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContenedorLoginViewModel()
	 * @generated
	 * @ordered
	 */
	protected ContenedorLoginViewModel theContenedorLoginViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getTheModelFactory() {
		if (eContainerFeatureID() != UiPackage.UI__THE_MODEL_FACTORY) return null;
		return (ModelFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheModelFactory(ModelFactory newTheModelFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheModelFactory, UiPackage.UI__THE_MODEL_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheModelFactory(ModelFactory newTheModelFactory) {
		if (newTheModelFactory != eInternalContainer() || (eContainerFeatureID() != UiPackage.UI__THE_MODEL_FACTORY && newTheModelFactory != null)) {
			if (EcoreUtil.isAncestor(this, newTheModelFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheModelFactory != null)
				msgs = ((InternalEObject)newTheModelFactory).eInverseAdd(this, smaPackage.MODEL_FACTORY__THE_UI, ModelFactory.class, msgs);
			msgs = basicSetTheModelFactory(newTheModelFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_MODEL_FACTORY, newTheModelFactory, newTheModelFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdLogueado() {
		return idLogueado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdLogueado(String newIdLogueado) {
		String oldIdLogueado = idLogueado;
		idLogueado = newIdLogueado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__ID_LOGUEADO, oldIdLogueado, idLogueado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipoLogueado() {
		return tipoLogueado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoLogueado(String newTipoLogueado) {
		String oldTipoLogueado = tipoLogueado;
		tipoLogueado = newTipoLogueado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__TIPO_LOGUEADO, oldTipoLogueado, tipoLogueado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getTheDomain() {
		if (theDomain != null && theDomain.eIsProxy()) {
			InternalEObject oldTheDomain = (InternalEObject)theDomain;
			theDomain = (Domain)eResolveProxy(oldTheDomain);
			if (theDomain != oldTheDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiPackage.UI__THE_DOMAIN, oldTheDomain, theDomain));
			}
		}
		return theDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain basicGetTheDomain() {
		return theDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheDomain(Domain newTheDomain, NotificationChain msgs) {
		Domain oldTheDomain = theDomain;
		theDomain = newTheDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_DOMAIN, oldTheDomain, newTheDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheDomain(Domain newTheDomain) {
		if (newTheDomain != theDomain) {
			NotificationChain msgs = null;
			if (theDomain != null)
				msgs = ((InternalEObject)theDomain).eInverseRemove(this, DomainPackage.DOMAIN__THE_UI, Domain.class, msgs);
			if (newTheDomain != null)
				msgs = ((InternalEObject)newTheDomain).eInverseAdd(this, DomainPackage.DOMAIN__THE_UI, Domain.class, msgs);
			msgs = basicSetTheDomain(newTheDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_DOMAIN, newTheDomain, newTheDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCrudClienteViewModel getTheContenedorCrudClienteViewModel() {
		return theContenedorCrudClienteViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorCrudClienteViewModel(ContenedorCrudClienteViewModel newTheContenedorCrudClienteViewModel, NotificationChain msgs) {
		ContenedorCrudClienteViewModel oldTheContenedorCrudClienteViewModel = theContenedorCrudClienteViewModel;
		theContenedorCrudClienteViewModel = newTheContenedorCrudClienteViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL, oldTheContenedorCrudClienteViewModel, newTheContenedorCrudClienteViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorCrudClienteViewModel(ContenedorCrudClienteViewModel newTheContenedorCrudClienteViewModel) {
		if (newTheContenedorCrudClienteViewModel != theContenedorCrudClienteViewModel) {
			NotificationChain msgs = null;
			if (theContenedorCrudClienteViewModel != null)
				msgs = ((InternalEObject)theContenedorCrudClienteViewModel).eInverseRemove(this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__OWNED_BY_UI, ContenedorCrudClienteViewModel.class, msgs);
			if (newTheContenedorCrudClienteViewModel != null)
				msgs = ((InternalEObject)newTheContenedorCrudClienteViewModel).eInverseAdd(this, ContenedorcrudclienteviewmodelPackage.CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__OWNED_BY_UI, ContenedorCrudClienteViewModel.class, msgs);
			msgs = basicSetTheContenedorCrudClienteViewModel(newTheContenedorCrudClienteViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL, newTheContenedorCrudClienteViewModel, newTheContenedorCrudClienteViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorCRUDCMViewModel getTheContenedorCRUDCMViewModel() {
		return theContenedorCRUDCMViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorCRUDCMViewModel(ContenedorCRUDCMViewModel newTheContenedorCRUDCMViewModel, NotificationChain msgs) {
		ContenedorCRUDCMViewModel oldTheContenedorCRUDCMViewModel = theContenedorCRUDCMViewModel;
		theContenedorCRUDCMViewModel = newTheContenedorCRUDCMViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_CONTENEDOR_CRUDCM_VIEW_MODEL, oldTheContenedorCRUDCMViewModel, newTheContenedorCRUDCMViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorCRUDCMViewModel(ContenedorCRUDCMViewModel newTheContenedorCRUDCMViewModel) {
		if (newTheContenedorCRUDCMViewModel != theContenedorCRUDCMViewModel) {
			NotificationChain msgs = null;
			if (theContenedorCRUDCMViewModel != null)
				msgs = ((InternalEObject)theContenedorCRUDCMViewModel).eInverseRemove(this, ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__OWNED_BY_UI, ContenedorCRUDCMViewModel.class, msgs);
			if (newTheContenedorCRUDCMViewModel != null)
				msgs = ((InternalEObject)newTheContenedorCRUDCMViewModel).eInverseAdd(this, ContenedorcrudcmviewmodelPackage.CONTENEDOR_CRUDCM_VIEW_MODEL__OWNED_BY_UI, ContenedorCRUDCMViewModel.class, msgs);
			msgs = basicSetTheContenedorCRUDCMViewModel(newTheContenedorCRUDCMViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_CONTENEDOR_CRUDCM_VIEW_MODEL, newTheContenedorCRUDCMViewModel, newTheContenedorCRUDCMViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorRegistroVehiculoViewModel getTheContenedorRegistroVehiculoViewModel() {
		return theContenedorRegistroVehiculoViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorRegistroVehiculoViewModel(ContenedorRegistroVehiculoViewModel newTheContenedorRegistroVehiculoViewModel, NotificationChain msgs) {
		ContenedorRegistroVehiculoViewModel oldTheContenedorRegistroVehiculoViewModel = theContenedorRegistroVehiculoViewModel;
		theContenedorRegistroVehiculoViewModel = newTheContenedorRegistroVehiculoViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL, oldTheContenedorRegistroVehiculoViewModel, newTheContenedorRegistroVehiculoViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorRegistroVehiculoViewModel(ContenedorRegistroVehiculoViewModel newTheContenedorRegistroVehiculoViewModel) {
		if (newTheContenedorRegistroVehiculoViewModel != theContenedorRegistroVehiculoViewModel) {
			NotificationChain msgs = null;
			if (theContenedorRegistroVehiculoViewModel != null)
				msgs = ((InternalEObject)theContenedorRegistroVehiculoViewModel).eInverseRemove(this, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__OWNED_BY_UI, ContenedorRegistroVehiculoViewModel.class, msgs);
			if (newTheContenedorRegistroVehiculoViewModel != null)
				msgs = ((InternalEObject)newTheContenedorRegistroVehiculoViewModel).eInverseAdd(this, ContenedorregistrovehiculoviewmodelPackage.CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__OWNED_BY_UI, ContenedorRegistroVehiculoViewModel.class, msgs);
			msgs = basicSetTheContenedorRegistroVehiculoViewModel(newTheContenedorRegistroVehiculoViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL, newTheContenedorRegistroVehiculoViewModel, newTheContenedorRegistroVehiculoViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorLoginViewModel getTheContenedorLoginViewModel() {
		return theContenedorLoginViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheContenedorLoginViewModel(ContenedorLoginViewModel newTheContenedorLoginViewModel, NotificationChain msgs) {
		ContenedorLoginViewModel oldTheContenedorLoginViewModel = theContenedorLoginViewModel;
		theContenedorLoginViewModel = newTheContenedorLoginViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_CONTENEDOR_LOGIN_VIEW_MODEL, oldTheContenedorLoginViewModel, newTheContenedorLoginViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContenedorLoginViewModel(ContenedorLoginViewModel newTheContenedorLoginViewModel) {
		if (newTheContenedorLoginViewModel != theContenedorLoginViewModel) {
			NotificationChain msgs = null;
			if (theContenedorLoginViewModel != null)
				msgs = ((InternalEObject)theContenedorLoginViewModel).eInverseRemove(this, ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__OWNED_BY_UI, ContenedorLoginViewModel.class, msgs);
			if (newTheContenedorLoginViewModel != null)
				msgs = ((InternalEObject)newTheContenedorLoginViewModel).eInverseAdd(this, ContenedorloginviewmodelPackage.CONTENEDOR_LOGIN_VIEW_MODEL__OWNED_BY_UI, ContenedorLoginViewModel.class, msgs);
			msgs = basicSetTheContenedorLoginViewModel(newTheContenedorLoginViewModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_CONTENEDOR_LOGIN_VIEW_MODEL, newTheContenedorLoginViewModel, newTheContenedorLoginViewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void implementarModelo() {
		
				
						
								
										
										ContenedorCrudClienteViewModel crudCLienteVM		=getTheContenedorCrudClienteViewModel();
										ContenedorCRUDCMViewModel crudCMVM  				=getTheContenedorCRUDCMViewModel();
										ContenedorRegistroVehiculoViewModel registroVehiVM 	=getTheContenedorRegistroVehiculoViewModel();
										
										if(crudCLienteVM == null) {
											crudCLienteVM 	= sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelFactory
															.eINSTANCE.createContenedorCrudClienteViewModel();
											
										}
										
										if(crudCMVM == null) {
											crudCMVM		= sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelFactory
															.eINSTANCE.createContenedorCRUDCMViewModel();
										}
										
										if( registroVehiVM == null ) {
											registroVehiVM	= sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.
															ContenedorregistrovehiculoviewmodelFactory.eINSTANCE.createContenedorRegistroVehiculoViewModel();
										}
										
										setTheContenedorCrudClienteViewModel(crudCLienteVM);
										setTheContenedorCRUDCMViewModel(crudCMVM);
										setTheContenedorRegistroVehiculoViewModel(registroVehiVM);
										
										
										
											
									
							
					
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registrarCliente(final ContenedorCrudClienteViewModel formulario) {
		
				
						
						getTheDomain().registrarUsuario(formulario);
						
					
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void RegistrarCm(final ContenedorCRUDCMViewModel formulario) {
		
				
						getTheDomain().registrarCm(formulario);
						
					
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registrarVehiculo(final ContenedorRegistroVehiculoViewModel formulario) {
		
				
						getTheDomain().registrarAutomovil(formulario, idLogueado);
						
					
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiPackage.UI__THE_MODEL_FACTORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheModelFactory((ModelFactory)otherEnd, msgs);
			case UiPackage.UI__THE_DOMAIN:
				if (theDomain != null)
					msgs = ((InternalEObject)theDomain).eInverseRemove(this, DomainPackage.DOMAIN__THE_UI, Domain.class, msgs);
				return basicSetTheDomain((Domain)otherEnd, msgs);
			case UiPackage.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				if (theContenedorCrudClienteViewModel != null)
					msgs = ((InternalEObject)theContenedorCrudClienteViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorCrudClienteViewModel((ContenedorCrudClienteViewModel)otherEnd, msgs);
			case UiPackage.UI__THE_CONTENEDOR_CRUDCM_VIEW_MODEL:
				if (theContenedorCRUDCMViewModel != null)
					msgs = ((InternalEObject)theContenedorCRUDCMViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI__THE_CONTENEDOR_CRUDCM_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorCRUDCMViewModel((ContenedorCRUDCMViewModel)otherEnd, msgs);
			case UiPackage.UI__THE_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL:
				if (theContenedorRegistroVehiculoViewModel != null)
					msgs = ((InternalEObject)theContenedorRegistroVehiculoViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI__THE_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorRegistroVehiculoViewModel((ContenedorRegistroVehiculoViewModel)otherEnd, msgs);
			case UiPackage.UI__THE_CONTENEDOR_LOGIN_VIEW_MODEL:
				if (theContenedorLoginViewModel != null)
					msgs = ((InternalEObject)theContenedorLoginViewModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI__THE_CONTENEDOR_LOGIN_VIEW_MODEL, null, msgs);
				return basicSetTheContenedorLoginViewModel((ContenedorLoginViewModel)otherEnd, msgs);
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
			case UiPackage.UI__THE_MODEL_FACTORY:
				return basicSetTheModelFactory(null, msgs);
			case UiPackage.UI__THE_DOMAIN:
				return basicSetTheDomain(null, msgs);
			case UiPackage.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				return basicSetTheContenedorCrudClienteViewModel(null, msgs);
			case UiPackage.UI__THE_CONTENEDOR_CRUDCM_VIEW_MODEL:
				return basicSetTheContenedorCRUDCMViewModel(null, msgs);
			case UiPackage.UI__THE_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL:
				return basicSetTheContenedorRegistroVehiculoViewModel(null, msgs);
			case UiPackage.UI__THE_CONTENEDOR_LOGIN_VIEW_MODEL:
				return basicSetTheContenedorLoginViewModel(null, msgs);
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
			case UiPackage.UI__THE_MODEL_FACTORY:
				return eInternalContainer().eInverseRemove(this, smaPackage.MODEL_FACTORY__THE_UI, ModelFactory.class, msgs);
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
			case UiPackage.UI__THE_MODEL_FACTORY:
				return getTheModelFactory();
			case UiPackage.UI__ID_LOGUEADO:
				return getIdLogueado();
			case UiPackage.UI__TIPO_LOGUEADO:
				return getTipoLogueado();
			case UiPackage.UI__THE_DOMAIN:
				if (resolve) return getTheDomain();
				return basicGetTheDomain();
			case UiPackage.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				return getTheContenedorCrudClienteViewModel();
			case UiPackage.UI__THE_CONTENEDOR_CRUDCM_VIEW_MODEL:
				return getTheContenedorCRUDCMViewModel();
			case UiPackage.UI__THE_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL:
				return getTheContenedorRegistroVehiculoViewModel();
			case UiPackage.UI__THE_CONTENEDOR_LOGIN_VIEW_MODEL:
				return getTheContenedorLoginViewModel();
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
			case UiPackage.UI__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)newValue);
				return;
			case UiPackage.UI__ID_LOGUEADO:
				setIdLogueado((String)newValue);
				return;
			case UiPackage.UI__TIPO_LOGUEADO:
				setTipoLogueado((String)newValue);
				return;
			case UiPackage.UI__THE_DOMAIN:
				setTheDomain((Domain)newValue);
				return;
			case UiPackage.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				setTheContenedorCrudClienteViewModel((ContenedorCrudClienteViewModel)newValue);
				return;
			case UiPackage.UI__THE_CONTENEDOR_CRUDCM_VIEW_MODEL:
				setTheContenedorCRUDCMViewModel((ContenedorCRUDCMViewModel)newValue);
				return;
			case UiPackage.UI__THE_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL:
				setTheContenedorRegistroVehiculoViewModel((ContenedorRegistroVehiculoViewModel)newValue);
				return;
			case UiPackage.UI__THE_CONTENEDOR_LOGIN_VIEW_MODEL:
				setTheContenedorLoginViewModel((ContenedorLoginViewModel)newValue);
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
			case UiPackage.UI__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)null);
				return;
			case UiPackage.UI__ID_LOGUEADO:
				setIdLogueado(ID_LOGUEADO_EDEFAULT);
				return;
			case UiPackage.UI__TIPO_LOGUEADO:
				setTipoLogueado(TIPO_LOGUEADO_EDEFAULT);
				return;
			case UiPackage.UI__THE_DOMAIN:
				setTheDomain((Domain)null);
				return;
			case UiPackage.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				setTheContenedorCrudClienteViewModel((ContenedorCrudClienteViewModel)null);
				return;
			case UiPackage.UI__THE_CONTENEDOR_CRUDCM_VIEW_MODEL:
				setTheContenedorCRUDCMViewModel((ContenedorCRUDCMViewModel)null);
				return;
			case UiPackage.UI__THE_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL:
				setTheContenedorRegistroVehiculoViewModel((ContenedorRegistroVehiculoViewModel)null);
				return;
			case UiPackage.UI__THE_CONTENEDOR_LOGIN_VIEW_MODEL:
				setTheContenedorLoginViewModel((ContenedorLoginViewModel)null);
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
			case UiPackage.UI__THE_MODEL_FACTORY:
				return getTheModelFactory() != null;
			case UiPackage.UI__ID_LOGUEADO:
				return ID_LOGUEADO_EDEFAULT == null ? idLogueado != null : !ID_LOGUEADO_EDEFAULT.equals(idLogueado);
			case UiPackage.UI__TIPO_LOGUEADO:
				return TIPO_LOGUEADO_EDEFAULT == null ? tipoLogueado != null : !TIPO_LOGUEADO_EDEFAULT.equals(tipoLogueado);
			case UiPackage.UI__THE_DOMAIN:
				return theDomain != null;
			case UiPackage.UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL:
				return theContenedorCrudClienteViewModel != null;
			case UiPackage.UI__THE_CONTENEDOR_CRUDCM_VIEW_MODEL:
				return theContenedorCRUDCMViewModel != null;
			case UiPackage.UI__THE_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL:
				return theContenedorRegistroVehiculoViewModel != null;
			case UiPackage.UI__THE_CONTENEDOR_LOGIN_VIEW_MODEL:
				return theContenedorLoginViewModel != null;
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
		result.append(" (idLogueado: ");
		result.append(idLogueado);
		result.append(", tipoLogueado: ");
		result.append(tipoLogueado);
		result.append(')');
		return result.toString();
	}

} //UIImpl
