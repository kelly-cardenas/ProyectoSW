/**
 */
package sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl;

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

import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorBusquedaViewModel;
import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel;
import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel;
import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelFactory;
import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelPackage;

import sma.ui.viewmodels.impl.ViewmodelsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorsolicitudvisitaviewmodelPackageImpl extends EPackageImpl implements ContenedorsolicitudvisitaviewmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorBusquedaViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorDatosCmViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorSolicitudVisitaViewModelEClass = null;

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
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContenedorsolicitudvisitaviewmodelPackageImpl() {
		super(eNS_URI, ContenedorsolicitudvisitaviewmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContenedorsolicitudvisitaviewmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContenedorsolicitudvisitaviewmodelPackage init() {
		if (isInited) return (ContenedorsolicitudvisitaviewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorsolicitudvisitaviewmodelPackage.eNS_URI);

		// Obtain or create and register package
		ContenedorsolicitudvisitaviewmodelPackageImpl theContenedorsolicitudvisitaviewmodelPackage = (ContenedorsolicitudvisitaviewmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContenedorsolicitudvisitaviewmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContenedorsolicitudvisitaviewmodelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		smaPackageImpl thesmaPackage = (smaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(smaPackage.eNS_URI) instanceof smaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(smaPackage.eNS_URI) : smaPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		ReparacionvehiculoPackageImpl theReparacionvehiculoPackage = (ReparacionvehiculoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReparacionvehiculoPackage.eNS_URI) instanceof ReparacionvehiculoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReparacionvehiculoPackage.eNS_URI) : ReparacionvehiculoPackage.eINSTANCE);
		AutomatizacionrevisionPackageImpl theAutomatizacionrevisionPackage = (AutomatizacionrevisionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AutomatizacionrevisionPackage.eNS_URI) instanceof AutomatizacionrevisionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AutomatizacionrevisionPackage.eNS_URI) : AutomatizacionrevisionPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
		ViewmodelsPackageImpl theViewmodelsPackage = (ViewmodelsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ViewmodelsPackage.eNS_URI) instanceof ViewmodelsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ViewmodelsPackage.eNS_URI) : ViewmodelsPackage.eINSTANCE);
		ContenedorcrudclienteviewmodelPackageImpl theContenedorcrudclienteviewmodelPackage = (ContenedorcrudclienteviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclienteviewmodelPackage.eNS_URI) instanceof ContenedorcrudclienteviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclienteviewmodelPackage.eNS_URI) : ContenedorcrudclienteviewmodelPackage.eINSTANCE);
		ContenedorcrudcmviewmodelPackageImpl theContenedorcrudcmviewmodelPackage = (ContenedorcrudcmviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudcmviewmodelPackage.eNS_URI) instanceof ContenedorcrudcmviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudcmviewmodelPackage.eNS_URI) : ContenedorcrudcmviewmodelPackage.eINSTANCE);
		ContenedorregistrovehiculoviewmodelPackageImpl theContenedorregistrovehiculoviewmodelPackage = (ContenedorregistrovehiculoviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrovehiculoviewmodelPackage.eNS_URI) instanceof ContenedorregistrovehiculoviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrovehiculoviewmodelPackage.eNS_URI) : ContenedorregistrovehiculoviewmodelPackage.eINSTANCE);
		ContenedorloginviewmodelPackageImpl theContenedorloginviewmodelPackage = (ContenedorloginviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorloginviewmodelPackage.eNS_URI) instanceof ContenedorloginviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorloginviewmodelPackage.eNS_URI) : ContenedorloginviewmodelPackage.eINSTANCE);
		ContenedorescaneoviewmodelPackageImpl theContenedorescaneoviewmodelPackage = (ContenedorescaneoviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorescaneoviewmodelPackage.eNS_URI) instanceof ContenedorescaneoviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorescaneoviewmodelPackage.eNS_URI) : ContenedorescaneoviewmodelPackage.eINSTANCE);
		ContenedorcontactarcmviewmodelPackageImpl theContenedorcontactarcmviewmodelPackage = (ContenedorcontactarcmviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcontactarcmviewmodelPackage.eNS_URI) instanceof ContenedorcontactarcmviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcontactarcmviewmodelPackage.eNS_URI) : ContenedorcontactarcmviewmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theContenedorsolicitudvisitaviewmodelPackage.createPackageContents();
		thesmaPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theReparacionvehiculoPackage.createPackageContents();
		theAutomatizacionrevisionPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theViewmodelsPackage.createPackageContents();
		theContenedorcrudclienteviewmodelPackage.createPackageContents();
		theContenedorcrudcmviewmodelPackage.createPackageContents();
		theContenedorregistrovehiculoviewmodelPackage.createPackageContents();
		theContenedorloginviewmodelPackage.createPackageContents();
		theContenedorescaneoviewmodelPackage.createPackageContents();
		theContenedorcontactarcmviewmodelPackage.createPackageContents();

		// Initialize created meta-data
		theContenedorsolicitudvisitaviewmodelPackage.initializePackageContents();
		thesmaPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theReparacionvehiculoPackage.initializePackageContents();
		theAutomatizacionrevisionPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theViewmodelsPackage.initializePackageContents();
		theContenedorcrudclienteviewmodelPackage.initializePackageContents();
		theContenedorcrudcmviewmodelPackage.initializePackageContents();
		theContenedorregistrovehiculoviewmodelPackage.initializePackageContents();
		theContenedorloginviewmodelPackage.initializePackageContents();
		theContenedorescaneoviewmodelPackage.initializePackageContents();
		theContenedorcontactarcmviewmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContenedorsolicitudvisitaviewmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContenedorsolicitudvisitaviewmodelPackage.eNS_URI, theContenedorsolicitudvisitaviewmodelPackage);
		return theContenedorsolicitudvisitaviewmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorBusquedaViewModel() {
		return contenedorBusquedaViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorBusquedaViewModel_Idcm() {
		return (EAttribute)contenedorBusquedaViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorBusquedaViewModel_Placavehiculo() {
		return (EAttribute)contenedorBusquedaViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorBusquedaViewModel_OwnedByContenedorSolicitudVisitaViewModel() {
		return (EReference)contenedorBusquedaViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorDatosCmViewModel() {
		return contenedorDatosCmViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDatosCmViewModel_Nombrecm() {
		return (EAttribute)contenedorDatosCmViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDatosCmViewModel_Nombrerepresentante() {
		return (EAttribute)contenedorDatosCmViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDatosCmViewModel_Direccion() {
		return (EAttribute)contenedorDatosCmViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorDatosCmViewModel_OwnedByContenedorSolicitudVisitaViewModel() {
		return (EReference)contenedorDatosCmViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorSolicitudVisitaViewModel() {
		return contenedorSolicitudVisitaViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorSolicitudVisitaViewModel_OwnedByUI() {
		return (EReference)contenedorSolicitudVisitaViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorSolicitudVisitaViewModel_TheContenedorBusquedaViewModel() {
		return (EReference)contenedorSolicitudVisitaViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorSolicitudVisitaViewModel_TheContenedorDatosCmViewModel() {
		return (EReference)contenedorSolicitudVisitaViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorsolicitudvisitaviewmodelFactory getContenedorsolicitudvisitaviewmodelFactory() {
		return (ContenedorsolicitudvisitaviewmodelFactory)getEFactoryInstance();
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
		contenedorBusquedaViewModelEClass = createEClass(CONTENEDOR_BUSQUEDA_VIEW_MODEL);
		createEAttribute(contenedorBusquedaViewModelEClass, CONTENEDOR_BUSQUEDA_VIEW_MODEL__IDCM);
		createEAttribute(contenedorBusquedaViewModelEClass, CONTENEDOR_BUSQUEDA_VIEW_MODEL__PLACAVEHICULO);
		createEReference(contenedorBusquedaViewModelEClass, CONTENEDOR_BUSQUEDA_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL);

		contenedorDatosCmViewModelEClass = createEClass(CONTENEDOR_DATOS_CM_VIEW_MODEL);
		createEAttribute(contenedorDatosCmViewModelEClass, CONTENEDOR_DATOS_CM_VIEW_MODEL__NOMBRECM);
		createEAttribute(contenedorDatosCmViewModelEClass, CONTENEDOR_DATOS_CM_VIEW_MODEL__NOMBREREPRESENTANTE);
		createEAttribute(contenedorDatosCmViewModelEClass, CONTENEDOR_DATOS_CM_VIEW_MODEL__DIRECCION);
		createEReference(contenedorDatosCmViewModelEClass, CONTENEDOR_DATOS_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL);

		contenedorSolicitudVisitaViewModelEClass = createEClass(CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL);
		createEReference(contenedorSolicitudVisitaViewModelEClass, CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__OWNED_BY_UI);
		createEReference(contenedorSolicitudVisitaViewModelEClass, CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_BUSQUEDA_VIEW_MODEL);
		createEReference(contenedorSolicitudVisitaViewModelEClass, CONTENEDOR_SOLICITUD_VISITA_VIEW_MODEL__THE_CONTENEDOR_DATOS_CM_VIEW_MODEL);
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
		UiPackage theUiPackage = (UiPackage)EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		contenedorBusquedaViewModelEClass.getESuperTypes().add(theViewmodelsPackage.getViewModel());
		contenedorDatosCmViewModelEClass.getESuperTypes().add(theViewmodelsPackage.getViewModel());
		contenedorSolicitudVisitaViewModelEClass.getESuperTypes().add(theViewmodelsPackage.getViewModel());

		// Initialize classes and features; add operations and parameters
		initEClass(contenedorBusquedaViewModelEClass, ContenedorBusquedaViewModel.class, "ContenedorBusquedaViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContenedorBusquedaViewModel_Idcm(), thesmaPackage.getString(), "idcm", " ", 0, 1, ContenedorBusquedaViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorBusquedaViewModel_Placavehiculo(), thesmaPackage.getString(), "placavehiculo", " ", 0, 1, ContenedorBusquedaViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorBusquedaViewModel_OwnedByContenedorSolicitudVisitaViewModel(), this.getContenedorSolicitudVisitaViewModel(), this.getContenedorSolicitudVisitaViewModel_TheContenedorBusquedaViewModel(), "ownedByContenedorSolicitudVisitaViewModel", null, 0, 1, ContenedorBusquedaViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenedorDatosCmViewModelEClass, ContenedorDatosCmViewModel.class, "ContenedorDatosCmViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContenedorDatosCmViewModel_Nombrecm(), thesmaPackage.getString(), "nombrecm", " ", 0, 1, ContenedorDatosCmViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorDatosCmViewModel_Nombrerepresentante(), thesmaPackage.getString(), "nombrerepresentante", " ", 0, 1, ContenedorDatosCmViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorDatosCmViewModel_Direccion(), thesmaPackage.getString(), "direccion", " ", 0, 1, ContenedorDatosCmViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorDatosCmViewModel_OwnedByContenedorSolicitudVisitaViewModel(), this.getContenedorSolicitudVisitaViewModel(), this.getContenedorSolicitudVisitaViewModel_TheContenedorDatosCmViewModel(), "ownedByContenedorSolicitudVisitaViewModel", null, 0, 1, ContenedorDatosCmViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenedorSolicitudVisitaViewModelEClass, ContenedorSolicitudVisitaViewModel.class, "ContenedorSolicitudVisitaViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorSolicitudVisitaViewModel_OwnedByUI(), theUiPackage.getUI(), theUiPackage.getUI_TheContenedorSolicitudVisitaViewModel(), "ownedByUI", null, 0, 1, ContenedorSolicitudVisitaViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorSolicitudVisitaViewModel_TheContenedorBusquedaViewModel(), this.getContenedorBusquedaViewModel(), this.getContenedorBusquedaViewModel_OwnedByContenedorSolicitudVisitaViewModel(), "theContenedorBusquedaViewModel", null, 0, 1, ContenedorSolicitudVisitaViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorSolicitudVisitaViewModel_TheContenedorDatosCmViewModel(), this.getContenedorDatosCmViewModel(), this.getContenedorDatosCmViewModel_OwnedByContenedorSolicitudVisitaViewModel(), "theContenedorDatosCmViewModel", null, 0, 1, ContenedorSolicitudVisitaViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(contenedorSolicitudVisitaViewModelEClass, thesmaPackage.getString(), "upadateDialog", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thesmaPackage.getString(), "evento", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contenedorSolicitudVisitaViewModelEClass, null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contenedorSolicitudVisitaViewModelEClass, null, "solicitarVisita", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //ContenedorsolicitudvisitaviewmodelPackageImpl
