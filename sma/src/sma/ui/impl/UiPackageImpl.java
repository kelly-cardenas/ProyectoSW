/**
 */
package sma.ui.impl;

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

import sma.ui.UiFactory;
import sma.ui.UiPackage;

import sma.ui.viewmodels.ViewmodelsPackage;

import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage;

import sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorcontactarcmviewmodelPackageImpl;

import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage;

import sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorcrudclienteviewmodelPackageImpl;

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
public class UiPackageImpl extends EPackageImpl implements UiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiEClass = null;

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
	 * @see sma.ui.UiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UiPackageImpl() {
		super(eNS_URI, UiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UiPackage init() {
		if (isInited) return (UiPackage)EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI);

		// Obtain or create and register package
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UiPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		smaPackageImpl thesmaPackage = (smaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(smaPackage.eNS_URI) instanceof smaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(smaPackage.eNS_URI) : smaPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		ReparacionvehiculoPackageImpl theReparacionvehiculoPackage = (ReparacionvehiculoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReparacionvehiculoPackage.eNS_URI) instanceof ReparacionvehiculoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReparacionvehiculoPackage.eNS_URI) : ReparacionvehiculoPackage.eINSTANCE);
		AutomatizacionrevisionPackageImpl theAutomatizacionrevisionPackage = (AutomatizacionrevisionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AutomatizacionrevisionPackage.eNS_URI) instanceof AutomatizacionrevisionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AutomatizacionrevisionPackage.eNS_URI) : AutomatizacionrevisionPackage.eINSTANCE);
		ViewmodelsPackageImpl theViewmodelsPackage = (ViewmodelsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ViewmodelsPackage.eNS_URI) instanceof ViewmodelsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ViewmodelsPackage.eNS_URI) : ViewmodelsPackage.eINSTANCE);
		ContenedorcrudclienteviewmodelPackageImpl theContenedorcrudclienteviewmodelPackage = (ContenedorcrudclienteviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclienteviewmodelPackage.eNS_URI) instanceof ContenedorcrudclienteviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclienteviewmodelPackage.eNS_URI) : ContenedorcrudclienteviewmodelPackage.eINSTANCE);
		ContenedorcrudcmviewmodelPackageImpl theContenedorcrudcmviewmodelPackage = (ContenedorcrudcmviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudcmviewmodelPackage.eNS_URI) instanceof ContenedorcrudcmviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudcmviewmodelPackage.eNS_URI) : ContenedorcrudcmviewmodelPackage.eINSTANCE);
		ContenedorregistrovehiculoviewmodelPackageImpl theContenedorregistrovehiculoviewmodelPackage = (ContenedorregistrovehiculoviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrovehiculoviewmodelPackage.eNS_URI) instanceof ContenedorregistrovehiculoviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrovehiculoviewmodelPackage.eNS_URI) : ContenedorregistrovehiculoviewmodelPackage.eINSTANCE);
		ContenedorloginviewmodelPackageImpl theContenedorloginviewmodelPackage = (ContenedorloginviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorloginviewmodelPackage.eNS_URI) instanceof ContenedorloginviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorloginviewmodelPackage.eNS_URI) : ContenedorloginviewmodelPackage.eINSTANCE);
		ContenedorescaneoviewmodelPackageImpl theContenedorescaneoviewmodelPackage = (ContenedorescaneoviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorescaneoviewmodelPackage.eNS_URI) instanceof ContenedorescaneoviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorescaneoviewmodelPackage.eNS_URI) : ContenedorescaneoviewmodelPackage.eINSTANCE);
		ContenedorcontactarcmviewmodelPackageImpl theContenedorcontactarcmviewmodelPackage = (ContenedorcontactarcmviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcontactarcmviewmodelPackage.eNS_URI) instanceof ContenedorcontactarcmviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcontactarcmviewmodelPackage.eNS_URI) : ContenedorcontactarcmviewmodelPackage.eINSTANCE);
		ContenedorsolicitudvisitaviewmodelPackageImpl theContenedorsolicitudvisitaviewmodelPackage = (ContenedorsolicitudvisitaviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorsolicitudvisitaviewmodelPackage.eNS_URI) instanceof ContenedorsolicitudvisitaviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorsolicitudvisitaviewmodelPackage.eNS_URI) : ContenedorsolicitudvisitaviewmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theUiPackage.createPackageContents();
		thesmaPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theReparacionvehiculoPackage.createPackageContents();
		theAutomatizacionrevisionPackage.createPackageContents();
		theViewmodelsPackage.createPackageContents();
		theContenedorcrudclienteviewmodelPackage.createPackageContents();
		theContenedorcrudcmviewmodelPackage.createPackageContents();
		theContenedorregistrovehiculoviewmodelPackage.createPackageContents();
		theContenedorloginviewmodelPackage.createPackageContents();
		theContenedorescaneoviewmodelPackage.createPackageContents();
		theContenedorcontactarcmviewmodelPackage.createPackageContents();
		theContenedorsolicitudvisitaviewmodelPackage.createPackageContents();

		// Initialize created meta-data
		theUiPackage.initializePackageContents();
		thesmaPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theReparacionvehiculoPackage.initializePackageContents();
		theAutomatizacionrevisionPackage.initializePackageContents();
		theViewmodelsPackage.initializePackageContents();
		theContenedorcrudclienteviewmodelPackage.initializePackageContents();
		theContenedorcrudcmviewmodelPackage.initializePackageContents();
		theContenedorregistrovehiculoviewmodelPackage.initializePackageContents();
		theContenedorloginviewmodelPackage.initializePackageContents();
		theContenedorescaneoviewmodelPackage.initializePackageContents();
		theContenedorcontactarcmviewmodelPackage.initializePackageContents();
		theContenedorsolicitudvisitaviewmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UiPackage.eNS_URI, theUiPackage);
		return theUiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUI() {
		return uiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_TheModelFactory() {
		return (EReference)uiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUI_IdLogueado() {
		return (EAttribute)uiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUI_TipoLogueado() {
		return (EAttribute)uiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_TheDomain() {
		return (EReference)uiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_TheContenedorCrudClienteViewModel() {
		return (EReference)uiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_TheContenedorCRUDCMViewModel() {
		return (EReference)uiEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_TheContenedorRegistroVehiculoViewModel() {
		return (EReference)uiEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_TheContenedorLoginViewModel() {
		return (EReference)uiEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_LstViewModels() {
		return (EReference)uiEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_TheContenedorEscaneoViewModel() {
		return (EReference)uiEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_TheContenedorContactarCmViewModel() {
		return (EReference)uiEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_TheContenedorSolicitudVisitaViewModel() {
		return (EReference)uiEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiFactory getUiFactory() {
		return (UiFactory)getEFactoryInstance();
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
		uiEClass = createEClass(UI);
		createEReference(uiEClass, UI__THE_MODEL_FACTORY);
		createEAttribute(uiEClass, UI__ID_LOGUEADO);
		createEAttribute(uiEClass, UI__TIPO_LOGUEADO);
		createEReference(uiEClass, UI__THE_DOMAIN);
		createEReference(uiEClass, UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL);
		createEReference(uiEClass, UI__THE_CONTENEDOR_CRUDCM_VIEW_MODEL);
		createEReference(uiEClass, UI__THE_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL);
		createEReference(uiEClass, UI__THE_CONTENEDOR_LOGIN_VIEW_MODEL);
		createEReference(uiEClass, UI__LST_VIEW_MODELS);
		createEReference(uiEClass, UI__THE_CONTENEDOR_ESCANEO_VIEW_MODEL);
		createEReference(uiEClass, UI__THE_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL);
		createEReference(uiEClass, UI__THE_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL);
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
		ViewmodelsPackage theViewmodelsPackage = (ViewmodelsPackage)EPackage.Registry.INSTANCE.getEPackage(ViewmodelsPackage.eNS_URI);
		smaPackage thesmaPackage = (smaPackage)EPackage.Registry.INSTANCE.getEPackage(smaPackage.eNS_URI);
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		ContenedorcrudclienteviewmodelPackage theContenedorcrudclienteviewmodelPackage = (ContenedorcrudclienteviewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclienteviewmodelPackage.eNS_URI);
		ContenedorcrudcmviewmodelPackage theContenedorcrudcmviewmodelPackage = (ContenedorcrudcmviewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudcmviewmodelPackage.eNS_URI);
		ContenedorregistrovehiculoviewmodelPackage theContenedorregistrovehiculoviewmodelPackage = (ContenedorregistrovehiculoviewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrovehiculoviewmodelPackage.eNS_URI);
		ContenedorloginviewmodelPackage theContenedorloginviewmodelPackage = (ContenedorloginviewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorloginviewmodelPackage.eNS_URI);
		ContenedorescaneoviewmodelPackage theContenedorescaneoviewmodelPackage = (ContenedorescaneoviewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorescaneoviewmodelPackage.eNS_URI);
		ContenedorcontactarcmviewmodelPackage theContenedorcontactarcmviewmodelPackage = (ContenedorcontactarcmviewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcontactarcmviewmodelPackage.eNS_URI);
		ContenedorsolicitudvisitaviewmodelPackage theContenedorsolicitudvisitaviewmodelPackage = (ContenedorsolicitudvisitaviewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorsolicitudvisitaviewmodelPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theViewmodelsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(uiEClass, sma.ui.UI.class, "UI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUI_TheModelFactory(), thesmaPackage.getModelFactory(), thesmaPackage.getModelFactory_TheUI(), "theModelFactory", null, 0, 1, sma.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUI_IdLogueado(), thesmaPackage.getString(), "idLogueado", null, 0, 1, sma.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUI_TipoLogueado(), thesmaPackage.getString(), "tipoLogueado", null, 0, 1, sma.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_TheDomain(), theDomainPackage.getDomain(), theDomainPackage.getDomain_TheUI(), "theDomain", null, 0, 1, sma.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_TheContenedorCrudClienteViewModel(), theContenedorcrudclienteviewmodelPackage.getContenedorCrudClienteViewModel(), theContenedorcrudclienteviewmodelPackage.getContenedorCrudClienteViewModel_OwnedByUI(), "theContenedorCrudClienteViewModel", null, 0, 1, sma.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_TheContenedorCRUDCMViewModel(), theContenedorcrudcmviewmodelPackage.getContenedorCRUDCMViewModel(), theContenedorcrudcmviewmodelPackage.getContenedorCRUDCMViewModel_OwnedByUI(), "theContenedorCRUDCMViewModel", null, 0, 1, sma.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_TheContenedorRegistroVehiculoViewModel(), theContenedorregistrovehiculoviewmodelPackage.getContenedorRegistroVehiculoViewModel(), theContenedorregistrovehiculoviewmodelPackage.getContenedorRegistroVehiculoViewModel_OwnedByUI(), "theContenedorRegistroVehiculoViewModel", null, 0, 1, sma.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_TheContenedorLoginViewModel(), theContenedorloginviewmodelPackage.getContenedorLoginViewModel(), theContenedorloginviewmodelPackage.getContenedorLoginViewModel_OwnedByUI(), "theContenedorLoginViewModel", null, 0, 1, sma.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_LstViewModels(), theViewmodelsPackage.getViewModel(), theViewmodelsPackage.getViewModel_TheUI(), "lstViewModels", null, 0, -1, sma.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_TheContenedorEscaneoViewModel(), theContenedorescaneoviewmodelPackage.getContenedorEscaneoViewModel(), theContenedorescaneoviewmodelPackage.getContenedorEscaneoViewModel_OwnedByUI(), "theContenedorEscaneoViewModel", null, 0, 1, sma.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_TheContenedorContactarCmViewModel(), theContenedorcontactarcmviewmodelPackage.getContenedorContactarCmViewModel(), theContenedorcontactarcmviewmodelPackage.getContenedorContactarCmViewModel_OwnedByUI(), "theContenedorContactarCmViewModel", null, 0, 1, sma.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUI_TheContenedorSolicitudVisitaViewModel(), theContenedorsolicitudvisitaviewmodelPackage.getContenedorSolicitudVisitaViewModel(), theContenedorsolicitudvisitaviewmodelPackage.getContenedorSolicitudVisitaViewModel_OwnedByUI(), "theContenedorSolicitudVisitaViewModel", null, 0, 1, sma.ui.UI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(uiEClass, null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(uiEClass, null, "registrarCliente", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudclienteviewmodelPackage.getContenedorCrudClienteViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(uiEClass, null, "RegistrarCm", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudcmviewmodelPackage.getContenedorCRUDCMViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(uiEClass, null, "registrarVehiculo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorregistrovehiculoviewmodelPackage.getContenedorRegistroVehiculoViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(uiEClass, null, "actualizarCrudCliente", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudclienteviewmodelPackage.getContenedorCrudClienteViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(uiEClass, null, "actualizarCrudCm", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudcmviewmodelPackage.getContenedorCRUDCMViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(uiEClass, null, "actualizarVentanaRegistroVehiculo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorregistrovehiculoviewmodelPackage.getContenedorRegistroVehiculoViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(uiEClass, thesmaPackage.getEBooleanObject(), "hacerLogin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorloginviewmodelPackage.getContenedorLoginViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(uiEClass, null, "escanearVehiculo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thesmaPackage.getString(), "placaVeh", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(uiEClass, null, "mostrarEstadoVehCliente", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorescaneoviewmodelPackage.getContenedorEscaneoViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(uiEClass, null, "mostrarCmsCercanos", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcontactarcmviewmodelPackage.getContenedorContactarCmViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(uiEClass, null, "solicitarVisita", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorsolicitudvisitaviewmodelPackage.getContenedorSolicitudVisitaViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(uiEClass, null, "mostrarInfoCmSolicitudVisita", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thesmaPackage.getString(), "idCm", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //UiPackageImpl
