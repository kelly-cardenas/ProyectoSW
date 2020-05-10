/**
 */
package sma.domain.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import sma.ModelFactory;

import sma.domain.Automovil;
import sma.domain.CentroMant;
import sma.domain.Domain;
import sma.domain.DomainPackage;
import sma.domain.Usuario;

import sma.smaPackage;

import sma.ui.UI;
import sma.ui.UiPackage;

import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel;

import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel;

import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sma.domain.impl.DomainImpl#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link sma.domain.impl.DomainImpl#getIncrementalIdCliente <em>Incremental Id Cliente</em>}</li>
 *   <li>{@link sma.domain.impl.DomainImpl#getIncrementalIdCm <em>Incremental Id Cm</em>}</li>
 *   <li>{@link sma.domain.impl.DomainImpl#getIncrementalIdAuto <em>Incremental Id Auto</em>}</li>
 *   <li>{@link sma.domain.impl.DomainImpl#getListaAutomoviles <em>Lista Automoviles</em>}</li>
 *   <li>{@link sma.domain.impl.DomainImpl#getListaDeCentMant <em>Lista De Cent Mant</em>}</li>
 *   <li>{@link sma.domain.impl.DomainImpl#getListaUsuarios <em>Lista Usuarios</em>}</li>
 *   <li>{@link sma.domain.impl.DomainImpl#getTheUI <em>The UI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends EObjectImpl implements Domain {
	/**
	 * The default value of the '{@link #getIncrementalIdCliente() <em>Incremental Id Cliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementalIdCliente()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INCREMENTAL_ID_CLIENTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncrementalIdCliente() <em>Incremental Id Cliente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementalIdCliente()
	 * @generated
	 * @ordered
	 */
	protected Integer incrementalIdCliente = INCREMENTAL_ID_CLIENTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncrementalIdCm() <em>Incremental Id Cm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementalIdCm()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INCREMENTAL_ID_CM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncrementalIdCm() <em>Incremental Id Cm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementalIdCm()
	 * @generated
	 * @ordered
	 */
	protected Integer incrementalIdCm = INCREMENTAL_ID_CM_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncrementalIdAuto() <em>Incremental Id Auto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementalIdAuto()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INCREMENTAL_ID_AUTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncrementalIdAuto() <em>Incremental Id Auto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementalIdAuto()
	 * @generated
	 * @ordered
	 */
	protected Integer incrementalIdAuto = INCREMENTAL_ID_AUTO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListaAutomoviles() <em>Lista Automoviles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaAutomoviles()
	 * @generated
	 * @ordered
	 */
	protected EList<Automovil> listaAutomoviles;

	/**
	 * The cached value of the '{@link #getListaDeCentMant() <em>Lista De Cent Mant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaDeCentMant()
	 * @generated
	 * @ordered
	 */
	protected EList<CentroMant> listaDeCentMant;

	/**
	 * The cached value of the '{@link #getListaUsuarios() <em>Lista Usuarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaUsuarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Usuario> listaUsuarios;

	/**
	 * The cached value of the '{@link #getTheUI() <em>The UI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheUI()
	 * @generated
	 * @ordered
	 */
	protected UI theUI;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getTheModelFactory() {
		if (eContainerFeatureID() != DomainPackage.DOMAIN__THE_MODEL_FACTORY) return null;
		return (ModelFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheModelFactory(ModelFactory newTheModelFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheModelFactory, DomainPackage.DOMAIN__THE_MODEL_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheModelFactory(ModelFactory newTheModelFactory) {
		if (newTheModelFactory != eInternalContainer() || (eContainerFeatureID() != DomainPackage.DOMAIN__THE_MODEL_FACTORY && newTheModelFactory != null)) {
			if (EcoreUtil.isAncestor(this, newTheModelFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheModelFactory != null)
				msgs = ((InternalEObject)newTheModelFactory).eInverseAdd(this, smaPackage.MODEL_FACTORY__THE_DOMAIN, ModelFactory.class, msgs);
			msgs = basicSetTheModelFactory(newTheModelFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_MODEL_FACTORY, newTheModelFactory, newTheModelFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIncrementalIdCliente() {
		return incrementalIdCliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementalIdCliente(Integer newIncrementalIdCliente) {
		Integer oldIncrementalIdCliente = incrementalIdCliente;
		incrementalIdCliente = newIncrementalIdCliente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__INCREMENTAL_ID_CLIENTE, oldIncrementalIdCliente, incrementalIdCliente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIncrementalIdCm() {
		return incrementalIdCm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementalIdCm(Integer newIncrementalIdCm) {
		Integer oldIncrementalIdCm = incrementalIdCm;
		incrementalIdCm = newIncrementalIdCm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__INCREMENTAL_ID_CM, oldIncrementalIdCm, incrementalIdCm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIncrementalIdAuto() {
		return incrementalIdAuto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementalIdAuto(Integer newIncrementalIdAuto) {
		Integer oldIncrementalIdAuto = incrementalIdAuto;
		incrementalIdAuto = newIncrementalIdAuto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__INCREMENTAL_ID_AUTO, oldIncrementalIdAuto, incrementalIdAuto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Automovil> getListaAutomoviles() {
		if (listaAutomoviles == null) {
			listaAutomoviles = new EObjectContainmentEList<Automovil>(Automovil.class, this, DomainPackage.DOMAIN__LISTA_AUTOMOVILES);
		}
		return listaAutomoviles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CentroMant> getListaDeCentMant() {
		if (listaDeCentMant == null) {
			listaDeCentMant = new EObjectContainmentWithInverseEList<CentroMant>(CentroMant.class, this, DomainPackage.DOMAIN__LISTA_DE_CENT_MANT, DomainPackage.CENTRO_MANT__OWNED_BY_DOMAIN);
		}
		return listaDeCentMant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Usuario> getListaUsuarios() {
		if (listaUsuarios == null) {
			listaUsuarios = new EObjectContainmentWithInverseEList<Usuario>(Usuario.class, this, DomainPackage.DOMAIN__LISTA_USUARIOS, DomainPackage.USUARIO__OWNER_BY_DOMAIN);
		}
		return listaUsuarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getTheUI() {
		if (theUI != null && theUI.eIsProxy()) {
			InternalEObject oldTheUI = (InternalEObject)theUI;
			theUI = (UI)eResolveProxy(oldTheUI);
			if (theUI != oldTheUI) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.DOMAIN__THE_UI, oldTheUI, theUI));
			}
		}
		return theUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI basicGetTheUI() {
		return theUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheUI(UI newTheUI, NotificationChain msgs) {
		UI oldTheUI = theUI;
		theUI = newTheUI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_UI, oldTheUI, newTheUI);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheUI(UI newTheUI) {
		if (newTheUI != theUI) {
			NotificationChain msgs = null;
			if (theUI != null)
				msgs = ((InternalEObject)theUI).eInverseRemove(this, UiPackage.UI__THE_DOMAIN, UI.class, msgs);
			if (newTheUI != null)
				msgs = ((InternalEObject)newTheUI).eInverseAdd(this, UiPackage.UI__THE_DOMAIN, UI.class, msgs);
			msgs = basicSetTheUI(newTheUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_UI, newTheUI, newTheUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void implementarModelo() {
		//implementar modelo
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registrarUsuario(final ContenedorCrudClienteViewModel formulario) {
		Usuario usuario = 			sma.domain.DomainFactory.eINSTANCE.createUsuario();
								sma.domain.UbicacionUsu ubicacionUsu = sma.domain.DomainFactory.eINSTANCE.createUbicacionUsu();
								
								
								//-------------------------------------------Asignacion el ID autoincremental al usuario-------------------------------------------------------
								usuario.setId(String.valueOf(incrementarIdCliente()));
								
								//-------------------------------------------Asignacion de atributos personales al usuario-------------------------------------------------------
								
								usuario.setNombres(formulario.getTheContenedorDetalleClienteViewModel().getTheContenedorDatosPersonalesViewModel().getNombre());
								usuario.setApellidos(formulario.getTheContenedorDetalleClienteViewModel().getTheContenedorDatosPersonalesViewModel().getApellido());
								usuario.setNumDI(formulario.getTheContenedorDetalleClienteViewModel().getTheContenedorDatosPersonalesViewModel().getCedula());
								usuario.setEdad(Integer.parseInt(formulario.getTheContenedorDetalleClienteViewModel().getTheContenedorDatosPersonalesViewModel().getEdad()));
								usuario.setEmail(formulario.getTheContenedorDetalleClienteViewModel().getTheContenedorDatosPersonalesViewModel().getCorreoelectronico());
								
								//-------------------------------------------Asignacion de atributos de la cuenta del usuario-------------------------------------------------------
								usuario.setUsuario(formulario.getTheContenedorDetalleClienteViewModel().getTheContenedorDatosdelacuentaViewModel().getContraseña());
								usuario.setContrasenia(formulario.getTheContenedorDetalleClienteViewModel().getTheContenedorDatosdelacuentaViewModel().getContraseña());
					
								//-------------------------------------------Asignacion de la ubicacion-------------------------------------------------------
								usuario.setUbicacion(ubicacionUsu);
								ubicacionUsu.setOwnerBy(usuario);
								
								listaUsuarios.add(usuario);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registrarCm(final ContenedorCRUDCMViewModel formulario) {
		CentroMant centroMantenimiento 	= sma.domain.DomainFactory.eINSTANCE.createCentroMant();
				sma.domain.UbicacionCM ubicacionCM			= sma.domain.DomainFactory.eINSTANCE.createUbicacionCM();
							
							//-------------------------------------------Asignacion informacion de CM-------------------------------------------------------
							centroMantenimiento.setId(String.valueOf(incrementalIdCm));
				
							//-------------------------------------------Asignacion informacion de CM-------------------------------------------------------
							centroMantenimiento.setNombre(formulario.getTheContenedorDetalleCMViewModel().getTheContenedorInformacionCMViewModel().getNombrecm());
							centroMantenimiento.setNombreRepresentante(formulario.getTheContenedorDetalleCMViewModel().getTheContenedorInformacionCMViewModel().getNombrerepresentante());
							centroMantenimiento.setDescripcion(formulario.getTheContenedorDetalleCMViewModel().getTheContenedorInformacionCMViewModel().getDescripcion());
							
							//-------------------------------------------Asignacion de ubicacion de CM-------------------------------------------------------
							ubicacionCM.setPais(formulario.getTheContenedorDetalleCMViewModel().getTheContenedorUbicacionViewModel().getPais());
							ubicacionCM.setDepartamento(formulario.getTheContenedorDetalleCMViewModel().getTheContenedorUbicacionViewModel().getDepartamento());
							ubicacionCM.setCiudad(formulario.getTheContenedorDetalleCMViewModel().getTheContenedorUbicacionViewModel().getCiudad());
							ubicacionCM.setDireccion(formulario.getTheContenedorDetalleCMViewModel().getTheContenedorUbicacionViewModel().getDireccion());
							
							centroMantenimiento.setUbicacion(ubicacionCM);
							ubicacionCM.setOwnedBy(centroMantenimiento);
							
							listaDeCentMant.add(centroMantenimiento);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registrarAutomovil(final ContenedorRegistroVehiculoViewModel formulario, final String idPropietario) {
		Automovil automovil = sma.domain.DomainFactory.eINSTANCE.createAutomovil();
						//Usuario usuario = sma.domain.DomainFactory.eINSTANCE.createUsuario();
						
						//-------------------------------Asignar id incremental al automovil-------------------------------------------------------
						automovil.setId(String.valueOf(incrementalIdAuto));
						
						//-------------------------------Asignar Propiedades al automovil--------------------------------------------------------------
						automovil.setMarca(formulario.getTheContenedorDetalleVehiculoViewModel().getMarca());
						automovil.setModelo(Integer.parseInt(formulario.getTheContenedorDetalleVehiculoViewModel().getModelo()));
						automovil.setPlaca(formulario.getTheContenedorDetalleVehiculoViewModel().getPlaca());
						automovil.setReferencia(formulario.getTheContenedorDetalleVehiculoViewModel().getReferencia());
						automovil.setTipoUso(formulario.getTheContenedorDetalleVehiculoViewModel().getTipovehiculo());
						
						//--------------------------------------------Agregar a la lista de Autos registrados del usuario-------------------------------------
						for (Usuario usu : listaUsuarios) {
							if ( usu.getId().equals( idPropietario ) ) {
								
								automovil.setPropietario(usu);
								usu.getAutomoviles().add(automovil);
							
							}
						}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer incrementarIdCliente() {
		int retorno = incrementalIdCliente;
				incrementalIdCliente = incrementalIdCliente +1;
				
				return retorno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer incrementarIdCm() {
		int retorno = incrementalIdCm;
				incrementalIdCm = incrementalIdCm +1;
				
				return retorno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer incrementarIdAuto() {
		int retorno = incrementalIdAuto;
				incrementalIdAuto = incrementalIdAuto +1;
				
				return retorno;
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheModelFactory((ModelFactory)otherEnd, msgs);
			case DomainPackage.DOMAIN__LISTA_DE_CENT_MANT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaDeCentMant()).basicAdd(otherEnd, msgs);
			case DomainPackage.DOMAIN__LISTA_USUARIOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListaUsuarios()).basicAdd(otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_UI:
				if (theUI != null)
					msgs = ((InternalEObject)theUI).eInverseRemove(this, UiPackage.UI__THE_DOMAIN, UI.class, msgs);
				return basicSetTheUI((UI)otherEnd, msgs);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return basicSetTheModelFactory(null, msgs);
			case DomainPackage.DOMAIN__LISTA_AUTOMOVILES:
				return ((InternalEList<?>)getListaAutomoviles()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN__LISTA_DE_CENT_MANT:
				return ((InternalEList<?>)getListaDeCentMant()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN__LISTA_USUARIOS:
				return ((InternalEList<?>)getListaUsuarios()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_UI:
				return basicSetTheUI(null, msgs);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return eInternalContainer().eInverseRemove(this, smaPackage.MODEL_FACTORY__THE_DOMAIN, ModelFactory.class, msgs);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return getTheModelFactory();
			case DomainPackage.DOMAIN__INCREMENTAL_ID_CLIENTE:
				return getIncrementalIdCliente();
			case DomainPackage.DOMAIN__INCREMENTAL_ID_CM:
				return getIncrementalIdCm();
			case DomainPackage.DOMAIN__INCREMENTAL_ID_AUTO:
				return getIncrementalIdAuto();
			case DomainPackage.DOMAIN__LISTA_AUTOMOVILES:
				return getListaAutomoviles();
			case DomainPackage.DOMAIN__LISTA_DE_CENT_MANT:
				return getListaDeCentMant();
			case DomainPackage.DOMAIN__LISTA_USUARIOS:
				return getListaUsuarios();
			case DomainPackage.DOMAIN__THE_UI:
				if (resolve) return getTheUI();
				return basicGetTheUI();
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)newValue);
				return;
			case DomainPackage.DOMAIN__INCREMENTAL_ID_CLIENTE:
				setIncrementalIdCliente((Integer)newValue);
				return;
			case DomainPackage.DOMAIN__INCREMENTAL_ID_CM:
				setIncrementalIdCm((Integer)newValue);
				return;
			case DomainPackage.DOMAIN__INCREMENTAL_ID_AUTO:
				setIncrementalIdAuto((Integer)newValue);
				return;
			case DomainPackage.DOMAIN__LISTA_AUTOMOVILES:
				getListaAutomoviles().clear();
				getListaAutomoviles().addAll((Collection<? extends Automovil>)newValue);
				return;
			case DomainPackage.DOMAIN__LISTA_DE_CENT_MANT:
				getListaDeCentMant().clear();
				getListaDeCentMant().addAll((Collection<? extends CentroMant>)newValue);
				return;
			case DomainPackage.DOMAIN__LISTA_USUARIOS:
				getListaUsuarios().clear();
				getListaUsuarios().addAll((Collection<? extends Usuario>)newValue);
				return;
			case DomainPackage.DOMAIN__THE_UI:
				setTheUI((UI)newValue);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)null);
				return;
			case DomainPackage.DOMAIN__INCREMENTAL_ID_CLIENTE:
				setIncrementalIdCliente(INCREMENTAL_ID_CLIENTE_EDEFAULT);
				return;
			case DomainPackage.DOMAIN__INCREMENTAL_ID_CM:
				setIncrementalIdCm(INCREMENTAL_ID_CM_EDEFAULT);
				return;
			case DomainPackage.DOMAIN__INCREMENTAL_ID_AUTO:
				setIncrementalIdAuto(INCREMENTAL_ID_AUTO_EDEFAULT);
				return;
			case DomainPackage.DOMAIN__LISTA_AUTOMOVILES:
				getListaAutomoviles().clear();
				return;
			case DomainPackage.DOMAIN__LISTA_DE_CENT_MANT:
				getListaDeCentMant().clear();
				return;
			case DomainPackage.DOMAIN__LISTA_USUARIOS:
				getListaUsuarios().clear();
				return;
			case DomainPackage.DOMAIN__THE_UI:
				setTheUI((UI)null);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return getTheModelFactory() != null;
			case DomainPackage.DOMAIN__INCREMENTAL_ID_CLIENTE:
				return INCREMENTAL_ID_CLIENTE_EDEFAULT == null ? incrementalIdCliente != null : !INCREMENTAL_ID_CLIENTE_EDEFAULT.equals(incrementalIdCliente);
			case DomainPackage.DOMAIN__INCREMENTAL_ID_CM:
				return INCREMENTAL_ID_CM_EDEFAULT == null ? incrementalIdCm != null : !INCREMENTAL_ID_CM_EDEFAULT.equals(incrementalIdCm);
			case DomainPackage.DOMAIN__INCREMENTAL_ID_AUTO:
				return INCREMENTAL_ID_AUTO_EDEFAULT == null ? incrementalIdAuto != null : !INCREMENTAL_ID_AUTO_EDEFAULT.equals(incrementalIdAuto);
			case DomainPackage.DOMAIN__LISTA_AUTOMOVILES:
				return listaAutomoviles != null && !listaAutomoviles.isEmpty();
			case DomainPackage.DOMAIN__LISTA_DE_CENT_MANT:
				return listaDeCentMant != null && !listaDeCentMant.isEmpty();
			case DomainPackage.DOMAIN__LISTA_USUARIOS:
				return listaUsuarios != null && !listaUsuarios.isEmpty();
			case DomainPackage.DOMAIN__THE_UI:
				return theUI != null;
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
		result.append(" (incrementalIdCliente: ");
		result.append(incrementalIdCliente);
		result.append(", incrementalIdCm: ");
		result.append(incrementalIdCm);
		result.append(", incrementalIdAuto: ");
		result.append(incrementalIdAuto);
		result.append(')');
		return result.toString();
	}

} //DomainImpl
