/**
 */
package sma.ui.viewmodels.contenedorescaneoviewmodel.impl;

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

import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel;
import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel;
import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorSeleccionautoViewModel;
import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelFactory;
import sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage;
import sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel;

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
public class ContenedorescaneoviewmodelPackageImpl extends EPackageImpl implements ContenedorescaneoviewmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorEscaneoViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorFallasViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorSeleccionautoViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listaFallasViewModelEClass = null;

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
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContenedorescaneoviewmodelPackageImpl() {
		super(eNS_URI, ContenedorescaneoviewmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContenedorescaneoviewmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContenedorescaneoviewmodelPackage init() {
		if (isInited) return (ContenedorescaneoviewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorescaneoviewmodelPackage.eNS_URI);

		// Obtain or create and register package
		ContenedorescaneoviewmodelPackageImpl theContenedorescaneoviewmodelPackage = (ContenedorescaneoviewmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContenedorescaneoviewmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContenedorescaneoviewmodelPackageImpl());

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
		ContenedorcontactarcmviewmodelPackageImpl theContenedorcontactarcmviewmodelPackage = (ContenedorcontactarcmviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcontactarcmviewmodelPackage.eNS_URI) instanceof ContenedorcontactarcmviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcontactarcmviewmodelPackage.eNS_URI) : ContenedorcontactarcmviewmodelPackage.eINSTANCE);
		ContenedorsolicitudvisitaviewmodelPackageImpl theContenedorsolicitudvisitaviewmodelPackage = (ContenedorsolicitudvisitaviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorsolicitudvisitaviewmodelPackage.eNS_URI) instanceof ContenedorsolicitudvisitaviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorsolicitudvisitaviewmodelPackage.eNS_URI) : ContenedorsolicitudvisitaviewmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theContenedorescaneoviewmodelPackage.createPackageContents();
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
		theContenedorcontactarcmviewmodelPackage.createPackageContents();
		theContenedorsolicitudvisitaviewmodelPackage.createPackageContents();

		// Initialize created meta-data
		theContenedorescaneoviewmodelPackage.initializePackageContents();
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
		theContenedorcontactarcmviewmodelPackage.initializePackageContents();
		theContenedorsolicitudvisitaviewmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContenedorescaneoviewmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContenedorescaneoviewmodelPackage.eNS_URI, theContenedorescaneoviewmodelPackage);
		return theContenedorescaneoviewmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorEscaneoViewModel() {
		return contenedorEscaneoViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorEscaneoViewModel_OwnedByUI() {
		return (EReference)contenedorEscaneoViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorEscaneoViewModel_TheContenedorSeleccionautoViewModel() {
		return (EReference)contenedorEscaneoViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorEscaneoViewModel_TheContenedorFallasViewModel() {
		return (EReference)contenedorEscaneoViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorFallasViewModel() {
		return contenedorFallasViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorFallasViewModel_OwnedByContenedorEscaneoViewModel() {
		return (EReference)contenedorFallasViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorFallasViewModel_Numeroerrores() {
		return (EAttribute)contenedorFallasViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorFallasViewModel_Estadoveh() {
		return (EAttribute)contenedorFallasViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorFallasViewModel_ListaListaFallasViewModel() {
		return (EReference)contenedorFallasViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorSeleccionautoViewModel() {
		return contenedorSeleccionautoViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorSeleccionautoViewModel_OwnedByContenedorEscaneoViewModel() {
		return (EReference)contenedorSeleccionautoViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorSeleccionautoViewModel_Placavehiculo() {
		return (EAttribute)contenedorSeleccionautoViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListaFallasViewModel() {
		return listaFallasViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListaFallasViewModel_OwnedByContenedorFallasViewModel() {
		return (EReference)listaFallasViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListaFallasViewModel_Gravedad() {
		return (EAttribute)listaFallasViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListaFallasViewModel_Piesaaveriada() {
		return (EAttribute)listaFallasViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListaFallasViewModel_Origen() {
		return (EAttribute)listaFallasViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListaFallasViewModel_Descripcion() {
		return (EAttribute)listaFallasViewModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorescaneoviewmodelFactory getContenedorescaneoviewmodelFactory() {
		return (ContenedorescaneoviewmodelFactory)getEFactoryInstance();
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
		contenedorEscaneoViewModelEClass = createEClass(CONTENEDOR_ESCANEO_VIEW_MODEL);
		createEReference(contenedorEscaneoViewModelEClass, CONTENEDOR_ESCANEO_VIEW_MODEL__OWNED_BY_UI);
		createEReference(contenedorEscaneoViewModelEClass, CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_SELECCIONAUTO_VIEW_MODEL);
		createEReference(contenedorEscaneoViewModelEClass, CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_FALLAS_VIEW_MODEL);

		contenedorFallasViewModelEClass = createEClass(CONTENEDOR_FALLAS_VIEW_MODEL);
		createEReference(contenedorFallasViewModelEClass, CONTENEDOR_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL);
		createEAttribute(contenedorFallasViewModelEClass, CONTENEDOR_FALLAS_VIEW_MODEL__NUMEROERRORES);
		createEAttribute(contenedorFallasViewModelEClass, CONTENEDOR_FALLAS_VIEW_MODEL__ESTADOVEH);
		createEReference(contenedorFallasViewModelEClass, CONTENEDOR_FALLAS_VIEW_MODEL__LISTA_LISTA_FALLAS_VIEW_MODEL);

		contenedorSeleccionautoViewModelEClass = createEClass(CONTENEDOR_SELECCIONAUTO_VIEW_MODEL);
		createEReference(contenedorSeleccionautoViewModelEClass, CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL);
		createEAttribute(contenedorSeleccionautoViewModelEClass, CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__PLACAVEHICULO);

		listaFallasViewModelEClass = createEClass(LISTA_FALLAS_VIEW_MODEL);
		createEReference(listaFallasViewModelEClass, LISTA_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_FALLAS_VIEW_MODEL);
		createEAttribute(listaFallasViewModelEClass, LISTA_FALLAS_VIEW_MODEL__GRAVEDAD);
		createEAttribute(listaFallasViewModelEClass, LISTA_FALLAS_VIEW_MODEL__PIESAAVERIADA);
		createEAttribute(listaFallasViewModelEClass, LISTA_FALLAS_VIEW_MODEL__ORIGEN);
		createEAttribute(listaFallasViewModelEClass, LISTA_FALLAS_VIEW_MODEL__DESCRIPCION);
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
		UiPackage theUiPackage = (UiPackage)EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI);
		smaPackage thesmaPackage = (smaPackage)EPackage.Registry.INSTANCE.getEPackage(smaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		contenedorEscaneoViewModelEClass.getESuperTypes().add(theViewmodelsPackage.getViewModel());
		contenedorFallasViewModelEClass.getESuperTypes().add(theViewmodelsPackage.getViewModel());
		contenedorSeleccionautoViewModelEClass.getESuperTypes().add(theViewmodelsPackage.getViewModel());

		// Initialize classes and features; add operations and parameters
		initEClass(contenedorEscaneoViewModelEClass, ContenedorEscaneoViewModel.class, "ContenedorEscaneoViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorEscaneoViewModel_OwnedByUI(), theUiPackage.getUI(), theUiPackage.getUI_TheContenedorEscaneoViewModel(), "ownedByUI", null, 0, 1, ContenedorEscaneoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorEscaneoViewModel_TheContenedorSeleccionautoViewModel(), this.getContenedorSeleccionautoViewModel(), this.getContenedorSeleccionautoViewModel_OwnedByContenedorEscaneoViewModel(), "theContenedorSeleccionautoViewModel", null, 0, 1, ContenedorEscaneoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorEscaneoViewModel_TheContenedorFallasViewModel(), this.getContenedorFallasViewModel(), this.getContenedorFallasViewModel_OwnedByContenedorEscaneoViewModel(), "theContenedorFallasViewModel", null, 0, 1, ContenedorEscaneoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(contenedorEscaneoViewModelEClass, thesmaPackage.getString(), "upadateDialog", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thesmaPackage.getString(), "evento", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contenedorEscaneoViewModelEClass, thesmaPackage.getEBooleanObject(), "escanearVehiculo", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contenedorEscaneoViewModelEClass, null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contenedorEscaneoViewModelEClass, null, "mostrarEstadoVehiculo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contenedorFallasViewModelEClass, ContenedorFallasViewModel.class, "ContenedorFallasViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorFallasViewModel_OwnedByContenedorEscaneoViewModel(), this.getContenedorEscaneoViewModel(), this.getContenedorEscaneoViewModel_TheContenedorFallasViewModel(), "ownedByContenedorEscaneoViewModel", null, 0, 1, ContenedorFallasViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorFallasViewModel_Numeroerrores(), thesmaPackage.getString(), "numeroerrores", " ", 0, 1, ContenedorFallasViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorFallasViewModel_Estadoveh(), thesmaPackage.getString(), "estadoveh", " ", 0, 1, ContenedorFallasViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorFallasViewModel_ListaListaFallasViewModel(), this.getListaFallasViewModel(), this.getListaFallasViewModel_OwnedByContenedorFallasViewModel(), "listaListaFallasViewModel", null, 0, -1, ContenedorFallasViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenedorSeleccionautoViewModelEClass, ContenedorSeleccionautoViewModel.class, "ContenedorSeleccionautoViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorSeleccionautoViewModel_OwnedByContenedorEscaneoViewModel(), this.getContenedorEscaneoViewModel(), this.getContenedorEscaneoViewModel_TheContenedorSeleccionautoViewModel(), "ownedByContenedorEscaneoViewModel", null, 0, 1, ContenedorSeleccionautoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorSeleccionautoViewModel_Placavehiculo(), thesmaPackage.getString(), "placavehiculo", " ", 0, 1, ContenedorSeleccionautoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listaFallasViewModelEClass, ListaFallasViewModel.class, "ListaFallasViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListaFallasViewModel_OwnedByContenedorFallasViewModel(), this.getContenedorFallasViewModel(), this.getContenedorFallasViewModel_ListaListaFallasViewModel(), "ownedByContenedorFallasViewModel", null, 0, 1, ListaFallasViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListaFallasViewModel_Gravedad(), thesmaPackage.getString(), "gravedad", " ", 0, 1, ListaFallasViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListaFallasViewModel_Piesaaveriada(), thesmaPackage.getString(), "piesaaveriada", " ", 0, 1, ListaFallasViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListaFallasViewModel_Origen(), thesmaPackage.getString(), "origen", " ", 0, 1, ListaFallasViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListaFallasViewModel_Descripcion(), thesmaPackage.getString(), "descripcion", " ", 0, 1, ListaFallasViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ContenedorescaneoviewmodelPackageImpl
