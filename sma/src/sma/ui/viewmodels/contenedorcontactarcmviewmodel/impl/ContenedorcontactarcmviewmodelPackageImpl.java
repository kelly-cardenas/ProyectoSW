/**
 */
package sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl;

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

import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorCmrecomendadosViewModel;
import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel;
import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel;
import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelFactory;
import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage;
import sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel;

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
public class ContenedorcontactarcmviewmodelPackageImpl extends EPackageImpl implements ContenedorcontactarcmviewmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorCmrecomendadosViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorContactarCmViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorUbicacionactualViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listaCmViewModelEClass = null;

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
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContenedorcontactarcmviewmodelPackageImpl() {
		super(eNS_URI, ContenedorcontactarcmviewmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContenedorcontactarcmviewmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContenedorcontactarcmviewmodelPackage init() {
		if (isInited) return (ContenedorcontactarcmviewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcontactarcmviewmodelPackage.eNS_URI);

		// Obtain or create and register package
		ContenedorcontactarcmviewmodelPackageImpl theContenedorcontactarcmviewmodelPackage = (ContenedorcontactarcmviewmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContenedorcontactarcmviewmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContenedorcontactarcmviewmodelPackageImpl());

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
		ContenedorsolicitudvisitaviewmodelPackageImpl theContenedorsolicitudvisitaviewmodelPackage = (ContenedorsolicitudvisitaviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorsolicitudvisitaviewmodelPackage.eNS_URI) instanceof ContenedorsolicitudvisitaviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorsolicitudvisitaviewmodelPackage.eNS_URI) : ContenedorsolicitudvisitaviewmodelPackage.eINSTANCE);
		ContenedorescaneoviewmodelPackageImpl theContenedorescaneoviewmodelPackage = (ContenedorescaneoviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorescaneoviewmodelPackage.eNS_URI) instanceof ContenedorescaneoviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorescaneoviewmodelPackage.eNS_URI) : ContenedorescaneoviewmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theContenedorcontactarcmviewmodelPackage.createPackageContents();
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
		theContenedorsolicitudvisitaviewmodelPackage.createPackageContents();
		theContenedorescaneoviewmodelPackage.createPackageContents();

		// Initialize created meta-data
		theContenedorcontactarcmviewmodelPackage.initializePackageContents();
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
		theContenedorsolicitudvisitaviewmodelPackage.initializePackageContents();
		theContenedorescaneoviewmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContenedorcontactarcmviewmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContenedorcontactarcmviewmodelPackage.eNS_URI, theContenedorcontactarcmviewmodelPackage);
		return theContenedorcontactarcmviewmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorCmrecomendadosViewModel() {
		return contenedorCmrecomendadosViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorCmrecomendadosViewModel_ListaListaCmViewModel() {
		return (EReference)contenedorCmrecomendadosViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorCmrecomendadosViewModel_OwnedByContenedorContactarCmViewModel() {
		return (EReference)contenedorCmrecomendadosViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorContactarCmViewModel() {
		return contenedorContactarCmViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorContactarCmViewModel_OwnedByUI() {
		return (EReference)contenedorContactarCmViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorContactarCmViewModel_TheContenedorCmrecomendadosViewModel() {
		return (EReference)contenedorContactarCmViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorContactarCmViewModel_TheContenedorUbicacionactualViewModel() {
		return (EReference)contenedorContactarCmViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorUbicacionactualViewModel() {
		return contenedorUbicacionactualViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorUbicacionactualViewModel_OwnedByContenedorContactarCmViewModel() {
		return (EReference)contenedorUbicacionactualViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorUbicacionactualViewModel_Pais() {
		return (EAttribute)contenedorUbicacionactualViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorUbicacionactualViewModel_Departamento() {
		return (EAttribute)contenedorUbicacionactualViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorUbicacionactualViewModel_Ciudad() {
		return (EAttribute)contenedorUbicacionactualViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListaCmViewModel() {
		return listaCmViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListaCmViewModel_OwnedByContenedorCmrecomendadosViewModel() {
		return (EReference)listaCmViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListaCmViewModel_Nombre() {
		return (EAttribute)listaCmViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListaCmViewModel_Nombrerepresentante() {
		return (EAttribute)listaCmViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListaCmViewModel_Direccion() {
		return (EAttribute)listaCmViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcontactarcmviewmodelFactory getContenedorcontactarcmviewmodelFactory() {
		return (ContenedorcontactarcmviewmodelFactory)getEFactoryInstance();
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
		contenedorCmrecomendadosViewModelEClass = createEClass(CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL);
		createEReference(contenedorCmrecomendadosViewModelEClass, CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__LISTA_LISTA_CM_VIEW_MODEL);
		createEReference(contenedorCmrecomendadosViewModelEClass, CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL);

		contenedorContactarCmViewModelEClass = createEClass(CONTENEDOR_CONTACTAR_CM_VIEW_MODEL);
		createEReference(contenedorContactarCmViewModelEClass, CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__OWNED_BY_UI);
		createEReference(contenedorContactarCmViewModelEClass, CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL);
		createEReference(contenedorContactarCmViewModelEClass, CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL);

		contenedorUbicacionactualViewModelEClass = createEClass(CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL);
		createEReference(contenedorUbicacionactualViewModelEClass, CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL);
		createEAttribute(contenedorUbicacionactualViewModelEClass, CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__PAIS);
		createEAttribute(contenedorUbicacionactualViewModelEClass, CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__DEPARTAMENTO);
		createEAttribute(contenedorUbicacionactualViewModelEClass, CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__CIUDAD);

		listaCmViewModelEClass = createEClass(LISTA_CM_VIEW_MODEL);
		createEReference(listaCmViewModelEClass, LISTA_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL);
		createEAttribute(listaCmViewModelEClass, LISTA_CM_VIEW_MODEL__NOMBRE);
		createEAttribute(listaCmViewModelEClass, LISTA_CM_VIEW_MODEL__NOMBREREPRESENTANTE);
		createEAttribute(listaCmViewModelEClass, LISTA_CM_VIEW_MODEL__DIRECCION);
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
		contenedorCmrecomendadosViewModelEClass.getESuperTypes().add(theViewmodelsPackage.getViewModel());
		contenedorContactarCmViewModelEClass.getESuperTypes().add(theViewmodelsPackage.getViewModel());
		contenedorUbicacionactualViewModelEClass.getESuperTypes().add(theViewmodelsPackage.getViewModel());

		// Initialize classes and features; add operations and parameters
		initEClass(contenedorCmrecomendadosViewModelEClass, ContenedorCmrecomendadosViewModel.class, "ContenedorCmrecomendadosViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorCmrecomendadosViewModel_ListaListaCmViewModel(), this.getListaCmViewModel(), this.getListaCmViewModel_OwnedByContenedorCmrecomendadosViewModel(), "listaListaCmViewModel", null, 0, -1, ContenedorCmrecomendadosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorCmrecomendadosViewModel_OwnedByContenedorContactarCmViewModel(), this.getContenedorContactarCmViewModel(), this.getContenedorContactarCmViewModel_TheContenedorCmrecomendadosViewModel(), "ownedByContenedorContactarCmViewModel", null, 0, 1, ContenedorCmrecomendadosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenedorContactarCmViewModelEClass, ContenedorContactarCmViewModel.class, "ContenedorContactarCmViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorContactarCmViewModel_OwnedByUI(), theUiPackage.getUI(), theUiPackage.getUI_TheContenedorContactarCmViewModel(), "ownedByUI", null, 0, 1, ContenedorContactarCmViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorContactarCmViewModel_TheContenedorCmrecomendadosViewModel(), this.getContenedorCmrecomendadosViewModel(), this.getContenedorCmrecomendadosViewModel_OwnedByContenedorContactarCmViewModel(), "theContenedorCmrecomendadosViewModel", null, 0, 1, ContenedorContactarCmViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorContactarCmViewModel_TheContenedorUbicacionactualViewModel(), this.getContenedorUbicacionactualViewModel(), this.getContenedorUbicacionactualViewModel_OwnedByContenedorContactarCmViewModel(), "theContenedorUbicacionactualViewModel", null, 0, 1, ContenedorContactarCmViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(contenedorContactarCmViewModelEClass, thesmaPackage.getString(), "upadateDialog", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thesmaPackage.getString(), "evento", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contenedorContactarCmViewModelEClass, null, "mostrarCmsCercanos", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contenedorContactarCmViewModelEClass, null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contenedorUbicacionactualViewModelEClass, ContenedorUbicacionactualViewModel.class, "ContenedorUbicacionactualViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorUbicacionactualViewModel_OwnedByContenedorContactarCmViewModel(), this.getContenedorContactarCmViewModel(), this.getContenedorContactarCmViewModel_TheContenedorUbicacionactualViewModel(), "ownedByContenedorContactarCmViewModel", null, 0, 1, ContenedorUbicacionactualViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorUbicacionactualViewModel_Pais(), thesmaPackage.getString(), "pais", " ", 0, 1, ContenedorUbicacionactualViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorUbicacionactualViewModel_Departamento(), thesmaPackage.getString(), "departamento", " ", 0, 1, ContenedorUbicacionactualViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorUbicacionactualViewModel_Ciudad(), thesmaPackage.getString(), "ciudad", " ", 0, 1, ContenedorUbicacionactualViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listaCmViewModelEClass, ListaCmViewModel.class, "ListaCmViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListaCmViewModel_OwnedByContenedorCmrecomendadosViewModel(), this.getContenedorCmrecomendadosViewModel(), this.getContenedorCmrecomendadosViewModel_ListaListaCmViewModel(), "ownedByContenedorCmrecomendadosViewModel", null, 0, 1, ListaCmViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListaCmViewModel_Nombre(), thesmaPackage.getString(), "nombre", " ", 0, 1, ListaCmViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListaCmViewModel_Nombrerepresentante(), thesmaPackage.getString(), "nombrerepresentante", " ", 0, 1, ListaCmViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListaCmViewModel_Direccion(), thesmaPackage.getString(), "direccion", " ", 0, 1, ListaCmViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ContenedorcontactarcmviewmodelPackageImpl
