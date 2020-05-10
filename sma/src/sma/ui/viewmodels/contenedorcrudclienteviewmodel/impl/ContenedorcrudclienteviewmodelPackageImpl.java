/**
 */
package sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sma.domain.DomainPackage;

import sma.domain.automatizacionrevision.AutomatizacionrevisionPackage;

import sma.domain.automatizacionrevision.impl.AutomatizacionrevisionPackageImpl;

import sma.domain.impl.DomainPackageImpl;

import sma.domain.reparacionvehiculo.ReparacionvehiculoPackage;

import sma.domain.reparacionvehiculo.impl.ReparacionvehiculoPackageImpl;

import sma.impl.smaPackageImpl;

import sma.smaPackage;

import sma.ui.UiPackage;

import sma.ui.impl.UiPackageImpl;

import sma.ui.viewmodels.ViewmodelsPackage;

import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage;

import sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorcontactarcmviewmodelPackageImpl;

import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosPersonalesViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosdelacuentaViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorMaestroClienteViewModel;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelFactory;
import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage;

import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage;

import sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorcrudcmviewmodelPackageImpl;

import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage;

import sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorescaneoviewmodelPackageImpl;

import sma.ui.viewmodels.contenedorloginviewmodel.ContenedorloginviewmodelPackage;

import sma.ui.viewmodels.contenedorloginviewmodel.impl.ContenedorloginviewmodelPackageImpl;

import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage;

import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorregistrovehiculoviewmodelPackageImpl;

import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelPackage;

import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorsolicitudvisitaviewmodelPackageImpl;

import sma.ui.viewmodels.impl.ViewmodelsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorcrudclienteviewmodelPackageImpl extends EPackageImpl implements ContenedorcrudclienteviewmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clienteViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorCrudClienteViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorDatosPersonalesViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorDatosdelacuentaViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorDetalleClienteViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorMaestroClienteViewModelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContenedorcrudclienteviewmodelPackageImpl() {
		super(eNS_URI, ContenedorcrudclienteviewmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ContenedorcrudclienteviewmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContenedorcrudclienteviewmodelPackage init() {
		if (isInited) return (ContenedorcrudclienteviewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclienteviewmodelPackage.eNS_URI);

		// Obtain or create and register package
		ContenedorcrudclienteviewmodelPackageImpl theContenedorcrudclienteviewmodelPackage = (ContenedorcrudclienteviewmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContenedorcrudclienteviewmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContenedorcrudclienteviewmodelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		smaPackageImpl thesmaPackage = (smaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(smaPackage.eNS_URI) instanceof smaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(smaPackage.eNS_URI) : smaPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		ReparacionvehiculoPackageImpl theReparacionvehiculoPackage = (ReparacionvehiculoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReparacionvehiculoPackage.eNS_URI) instanceof ReparacionvehiculoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReparacionvehiculoPackage.eNS_URI) : ReparacionvehiculoPackage.eINSTANCE);
		AutomatizacionrevisionPackageImpl theAutomatizacionrevisionPackage = (AutomatizacionrevisionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AutomatizacionrevisionPackage.eNS_URI) instanceof AutomatizacionrevisionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AutomatizacionrevisionPackage.eNS_URI) : AutomatizacionrevisionPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
		ViewmodelsPackageImpl theViewmodelsPackage = (ViewmodelsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ViewmodelsPackage.eNS_URI) instanceof ViewmodelsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ViewmodelsPackage.eNS_URI) : ViewmodelsPackage.eINSTANCE);
		ContenedorcrudcmviewmodelPackageImpl theContenedorcrudcmviewmodelPackage = (ContenedorcrudcmviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudcmviewmodelPackage.eNS_URI) instanceof ContenedorcrudcmviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudcmviewmodelPackage.eNS_URI) : ContenedorcrudcmviewmodelPackage.eINSTANCE);
		ContenedorregistrovehiculoviewmodelPackageImpl theContenedorregistrovehiculoviewmodelPackage = (ContenedorregistrovehiculoviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrovehiculoviewmodelPackage.eNS_URI) instanceof ContenedorregistrovehiculoviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrovehiculoviewmodelPackage.eNS_URI) : ContenedorregistrovehiculoviewmodelPackage.eINSTANCE);
		ContenedorloginviewmodelPackageImpl theContenedorloginviewmodelPackage = (ContenedorloginviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorloginviewmodelPackage.eNS_URI) instanceof ContenedorloginviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorloginviewmodelPackage.eNS_URI) : ContenedorloginviewmodelPackage.eINSTANCE);
		ContenedorescaneoviewmodelPackageImpl theContenedorescaneoviewmodelPackage = (ContenedorescaneoviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorescaneoviewmodelPackage.eNS_URI) instanceof ContenedorescaneoviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorescaneoviewmodelPackage.eNS_URI) : ContenedorescaneoviewmodelPackage.eINSTANCE);
		ContenedorcontactarcmviewmodelPackageImpl theContenedorcontactarcmviewmodelPackage = (ContenedorcontactarcmviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcontactarcmviewmodelPackage.eNS_URI) instanceof ContenedorcontactarcmviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcontactarcmviewmodelPackage.eNS_URI) : ContenedorcontactarcmviewmodelPackage.eINSTANCE);
		ContenedorsolicitudvisitaviewmodelPackageImpl theContenedorsolicitudvisitaviewmodelPackage = (ContenedorsolicitudvisitaviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorsolicitudvisitaviewmodelPackage.eNS_URI) instanceof ContenedorsolicitudvisitaviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorsolicitudvisitaviewmodelPackage.eNS_URI) : ContenedorsolicitudvisitaviewmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theContenedorcrudclienteviewmodelPackage.createPackageContents();
		thesmaPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theReparacionvehiculoPackage.createPackageContents();
		theAutomatizacionrevisionPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theViewmodelsPackage.createPackageContents();
		theContenedorcrudcmviewmodelPackage.createPackageContents();
		theContenedorregistrovehiculoviewmodelPackage.createPackageContents();
		theContenedorloginviewmodelPackage.createPackageContents();
		theContenedorescaneoviewmodelPackage.createPackageContents();
		theContenedorcontactarcmviewmodelPackage.createPackageContents();
		theContenedorsolicitudvisitaviewmodelPackage.createPackageContents();

		// Initialize created meta-data
		theContenedorcrudclienteviewmodelPackage.initializePackageContents();
		thesmaPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theReparacionvehiculoPackage.initializePackageContents();
		theAutomatizacionrevisionPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theViewmodelsPackage.initializePackageContents();
		theContenedorcrudcmviewmodelPackage.initializePackageContents();
		theContenedorregistrovehiculoviewmodelPackage.initializePackageContents();
		theContenedorloginviewmodelPackage.initializePackageContents();
		theContenedorescaneoviewmodelPackage.initializePackageContents();
		theContenedorcontactarcmviewmodelPackage.initializePackageContents();
		theContenedorsolicitudvisitaviewmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContenedorcrudclienteviewmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContenedorcrudclienteviewmodelPackage.eNS_URI, theContenedorcrudclienteviewmodelPackage);
		return theContenedorcrudclienteviewmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClienteViewModel() {
		return clienteViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClienteViewModel_Identificacion() {
		return (EAttribute)clienteViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClienteViewModel_Nombre() {
		return (EAttribute)clienteViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClienteViewModel_Email() {
		return (EAttribute)clienteViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClienteViewModel_Edad() {
		return (EAttribute)clienteViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClienteViewModel_The0ContenedorMaestroClienteViewModel() {
		return (EReference)clienteViewModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorCrudClienteViewModel() {
		return contenedorCrudClienteViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorCrudClienteViewModel_OwnedByUI() {
		return (EReference)contenedorCrudClienteViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorCrudClienteViewModel_TheContenedorDetalleClienteViewModel() {
		return (EReference)contenedorCrudClienteViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorCrudClienteViewModel_TheContenedorMaestroClienteViewModel() {
		return (EReference)contenedorCrudClienteViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorDatosPersonalesViewModel() {
		return contenedorDatosPersonalesViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDatosPersonalesViewModel_Cedula() {
		return (EAttribute)contenedorDatosPersonalesViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDatosPersonalesViewModel_Nombre() {
		return (EAttribute)contenedorDatosPersonalesViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDatosPersonalesViewModel_Apellido() {
		return (EAttribute)contenedorDatosPersonalesViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDatosPersonalesViewModel_Edad() {
		return (EAttribute)contenedorDatosPersonalesViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDatosPersonalesViewModel_Correoelectronico() {
		return (EAttribute)contenedorDatosPersonalesViewModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorDatosPersonalesViewModel_OwnedByContenedorDetalleClienteViewModel() {
		return (EReference)contenedorDatosPersonalesViewModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorDatosdelacuentaViewModel() {
		return contenedorDatosdelacuentaViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDatosdelacuentaViewModel_Usuario() {
		return (EAttribute)contenedorDatosdelacuentaViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDatosdelacuentaViewModel_Contrasenia() {
		return (EAttribute)contenedorDatosdelacuentaViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorDatosdelacuentaViewModel_OwnedByContenedorDetalleClienteViewModel() {
		return (EReference)contenedorDatosdelacuentaViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorDetalleClienteViewModel() {
		return contenedorDetalleClienteViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorDetalleClienteViewModel_OwnedByContenedorCrudClienteViewModel() {
		return (EReference)contenedorDetalleClienteViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorDetalleClienteViewModel_TheContenedorDatosPersonalesViewModel() {
		return (EReference)contenedorDetalleClienteViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorDetalleClienteViewModel_TheContenedorDatosdelacuentaViewModel() {
		return (EReference)contenedorDetalleClienteViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorMaestroClienteViewModel() {
		return contenedorMaestroClienteViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorMaestroClienteViewModel_OwnedByContenedorCrudClienteViewModel() {
		return (EReference)contenedorMaestroClienteViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorMaestroClienteViewModel_ListaCliente() {
		return (EReference)contenedorMaestroClienteViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudclienteviewmodelFactory getContenedorcrudclienteviewmodelFactory() {
		return (ContenedorcrudclienteviewmodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		clienteViewModelEClass = createEClass(CLIENTE_VIEW_MODEL);
		createEAttribute(clienteViewModelEClass, CLIENTE_VIEW_MODEL__IDENTIFICACION);
		createEAttribute(clienteViewModelEClass, CLIENTE_VIEW_MODEL__NOMBRE);
		createEAttribute(clienteViewModelEClass, CLIENTE_VIEW_MODEL__EMAIL);
		createEAttribute(clienteViewModelEClass, CLIENTE_VIEW_MODEL__EDAD);
		createEReference(clienteViewModelEClass, CLIENTE_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL);

		contenedorCrudClienteViewModelEClass = createEClass(CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL);
		createEReference(contenedorCrudClienteViewModelEClass, CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__OWNED_BY_UI);
		createEReference(contenedorCrudClienteViewModelEClass, CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL);
		createEReference(contenedorCrudClienteViewModelEClass, CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL);

		contenedorDatosPersonalesViewModelEClass = createEClass(CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL);
		createEAttribute(contenedorDatosPersonalesViewModelEClass, CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__CEDULA);
		createEAttribute(contenedorDatosPersonalesViewModelEClass, CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__NOMBRE);
		createEAttribute(contenedorDatosPersonalesViewModelEClass, CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__APELLIDO);
		createEAttribute(contenedorDatosPersonalesViewModelEClass, CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__EDAD);
		createEAttribute(contenedorDatosPersonalesViewModelEClass, CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__CORREOELECTRONICO);
		createEReference(contenedorDatosPersonalesViewModelEClass, CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL);

		contenedorDatosdelacuentaViewModelEClass = createEClass(CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL);
		createEAttribute(contenedorDatosdelacuentaViewModelEClass, CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__USUARIO);
		createEAttribute(contenedorDatosdelacuentaViewModelEClass, CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__CONTRASENIA);
		createEReference(contenedorDatosdelacuentaViewModelEClass, CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL);

		contenedorDetalleClienteViewModelEClass = createEClass(CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL);
		createEReference(contenedorDetalleClienteViewModelEClass, CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL);
		createEReference(contenedorDetalleClienteViewModelEClass, CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL);
		createEReference(contenedorDetalleClienteViewModelEClass, CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL);

		contenedorMaestroClienteViewModelEClass = createEClass(CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL);
		createEReference(contenedorMaestroClienteViewModelEClass, CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL);
		createEReference(contenedorMaestroClienteViewModelEClass, CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__LISTA_CLIENTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		smaPackage thesmaPackage = (smaPackage)EPackage.Registry.INSTANCE.getEPackage(smaPackage.eNS_URI);
		UiPackage theUiPackage = (UiPackage)EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(clienteViewModelEClass, ClienteViewModel.class, "ClienteViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClienteViewModel_Identificacion(), thesmaPackage.getString(), "identificacion", " ", 0, 1, ClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClienteViewModel_Nombre(), thesmaPackage.getString(), "nombre", " ", 0, 1, ClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClienteViewModel_Email(), thesmaPackage.getString(), "email", " ", 0, 1, ClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClienteViewModel_Edad(), thesmaPackage.getString(), "edad", " ", 0, 1, ClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClienteViewModel_The0ContenedorMaestroClienteViewModel(), this.getContenedorMaestroClienteViewModel(), this.getContenedorMaestroClienteViewModel_ListaCliente(), "the0ContenedorMaestroClienteViewModel", null, 0, 1, ClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenedorCrudClienteViewModelEClass, ContenedorCrudClienteViewModel.class, "ContenedorCrudClienteViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorCrudClienteViewModel_OwnedByUI(), theUiPackage.getUI(), theUiPackage.getUI_TheContenedorCrudClienteViewModel(), "ownedByUI", null, 0, 1, ContenedorCrudClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorCrudClienteViewModel_TheContenedorDetalleClienteViewModel(), this.getContenedorDetalleClienteViewModel(), this.getContenedorDetalleClienteViewModel_OwnedByContenedorCrudClienteViewModel(), "theContenedorDetalleClienteViewModel", null, 0, 1, ContenedorCrudClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorCrudClienteViewModel_TheContenedorMaestroClienteViewModel(), this.getContenedorMaestroClienteViewModel(), this.getContenedorMaestroClienteViewModel_OwnedByContenedorCrudClienteViewModel(), "theContenedorMaestroClienteViewModel", null, 0, 1, ContenedorCrudClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(contenedorCrudClienteViewModelEClass, thesmaPackage.getString(), "upadateDialog", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thesmaPackage.getString(), "evento", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contenedorCrudClienteViewModelEClass, null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contenedorCrudClienteViewModelEClass, null, "registrarCliente", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contenedorCrudClienteViewModelEClass, null, "actualizarCrudCliente", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contenedorDatosPersonalesViewModelEClass, ContenedorDatosPersonalesViewModel.class, "ContenedorDatosPersonalesViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContenedorDatosPersonalesViewModel_Cedula(), thesmaPackage.getString(), "cedula", " ", 0, 1, ContenedorDatosPersonalesViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorDatosPersonalesViewModel_Nombre(), thesmaPackage.getString(), "nombre", " ", 0, 1, ContenedorDatosPersonalesViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorDatosPersonalesViewModel_Apellido(), thesmaPackage.getString(), "apellido", " ", 0, 1, ContenedorDatosPersonalesViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorDatosPersonalesViewModel_Edad(), thesmaPackage.getString(), "edad", " ", 0, 1, ContenedorDatosPersonalesViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorDatosPersonalesViewModel_Correoelectronico(), thesmaPackage.getString(), "correoelectronico", " ", 0, 1, ContenedorDatosPersonalesViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorDatosPersonalesViewModel_OwnedByContenedorDetalleClienteViewModel(), this.getContenedorDetalleClienteViewModel(), this.getContenedorDetalleClienteViewModel_TheContenedorDatosPersonalesViewModel(), "ownedByContenedorDetalleClienteViewModel", null, 0, 1, ContenedorDatosPersonalesViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenedorDatosdelacuentaViewModelEClass, ContenedorDatosdelacuentaViewModel.class, "ContenedorDatosdelacuentaViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContenedorDatosdelacuentaViewModel_Usuario(), thesmaPackage.getString(), "usuario", " ", 0, 1, ContenedorDatosdelacuentaViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorDatosdelacuentaViewModel_Contrasenia(), thesmaPackage.getString(), "contrasenia", null, 0, 1, ContenedorDatosdelacuentaViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorDatosdelacuentaViewModel_OwnedByContenedorDetalleClienteViewModel(), this.getContenedorDetalleClienteViewModel(), this.getContenedorDetalleClienteViewModel_TheContenedorDatosdelacuentaViewModel(), "ownedByContenedorDetalleClienteViewModel", null, 0, 1, ContenedorDatosdelacuentaViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenedorDetalleClienteViewModelEClass, ContenedorDetalleClienteViewModel.class, "ContenedorDetalleClienteViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorDetalleClienteViewModel_OwnedByContenedorCrudClienteViewModel(), this.getContenedorCrudClienteViewModel(), this.getContenedorCrudClienteViewModel_TheContenedorDetalleClienteViewModel(), "ownedByContenedorCrudClienteViewModel", null, 0, 1, ContenedorDetalleClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorDetalleClienteViewModel_TheContenedorDatosPersonalesViewModel(), this.getContenedorDatosPersonalesViewModel(), this.getContenedorDatosPersonalesViewModel_OwnedByContenedorDetalleClienteViewModel(), "theContenedorDatosPersonalesViewModel", null, 0, 1, ContenedorDetalleClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorDetalleClienteViewModel_TheContenedorDatosdelacuentaViewModel(), this.getContenedorDatosdelacuentaViewModel(), this.getContenedorDatosdelacuentaViewModel_OwnedByContenedorDetalleClienteViewModel(), "theContenedorDatosdelacuentaViewModel", null, 0, 1, ContenedorDetalleClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(contenedorDetalleClienteViewModelEClass, null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contenedorMaestroClienteViewModelEClass, ContenedorMaestroClienteViewModel.class, "ContenedorMaestroClienteViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorMaestroClienteViewModel_OwnedByContenedorCrudClienteViewModel(), this.getContenedorCrudClienteViewModel(), this.getContenedorCrudClienteViewModel_TheContenedorMaestroClienteViewModel(), "ownedByContenedorCrudClienteViewModel", null, 0, 1, ContenedorMaestroClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorMaestroClienteViewModel_ListaCliente(), this.getClienteViewModel(), this.getClienteViewModel_The0ContenedorMaestroClienteViewModel(), "listaCliente", null, 0, -1, ContenedorMaestroClienteViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ContenedorcrudclienteviewmodelPackageImpl
