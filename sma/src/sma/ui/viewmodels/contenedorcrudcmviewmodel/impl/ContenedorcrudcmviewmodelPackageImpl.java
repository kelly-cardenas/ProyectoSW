/**
 */
package sma.ui.viewmodels.contenedorcrudcmviewmodel.impl;

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

import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage;

import sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorcrudclienteviewmodelPackageImpl;

import sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorMaestroCMViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelFactory;
import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage;

import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage;

import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorregistrovehiculoviewmodelPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorcrudcmviewmodelPackageImpl extends EPackageImpl implements ContenedorcrudcmviewmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass centroMantViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorCRUDCMViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorDetalleCMViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorInformacionCMViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorMaestroCMViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorUbicacionViewModelEClass = null;

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
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContenedorcrudcmviewmodelPackageImpl() {
		super(eNS_URI, ContenedorcrudcmviewmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContenedorcrudcmviewmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContenedorcrudcmviewmodelPackage init() {
		if (isInited) return (ContenedorcrudcmviewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudcmviewmodelPackage.eNS_URI);

		// Obtain or create and register package
		ContenedorcrudcmviewmodelPackageImpl theContenedorcrudcmviewmodelPackage = (ContenedorcrudcmviewmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContenedorcrudcmviewmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContenedorcrudcmviewmodelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		smaPackageImpl thesmaPackage = (smaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(smaPackage.eNS_URI) instanceof smaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(smaPackage.eNS_URI) : smaPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		ReparacionvehiculoPackageImpl theReparacionvehiculoPackage = (ReparacionvehiculoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReparacionvehiculoPackage.eNS_URI) instanceof ReparacionvehiculoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReparacionvehiculoPackage.eNS_URI) : ReparacionvehiculoPackage.eINSTANCE);
		AutomatizacionrevisionPackageImpl theAutomatizacionrevisionPackage = (AutomatizacionrevisionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AutomatizacionrevisionPackage.eNS_URI) instanceof AutomatizacionrevisionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AutomatizacionrevisionPackage.eNS_URI) : AutomatizacionrevisionPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
		ContenedorcrudclienteviewmodelPackageImpl theContenedorcrudclienteviewmodelPackage = (ContenedorcrudclienteviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclienteviewmodelPackage.eNS_URI) instanceof ContenedorcrudclienteviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclienteviewmodelPackage.eNS_URI) : ContenedorcrudclienteviewmodelPackage.eINSTANCE);
		ContenedorregistrovehiculoviewmodelPackageImpl theContenedorregistrovehiculoviewmodelPackage = (ContenedorregistrovehiculoviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrovehiculoviewmodelPackage.eNS_URI) instanceof ContenedorregistrovehiculoviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrovehiculoviewmodelPackage.eNS_URI) : ContenedorregistrovehiculoviewmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theContenedorcrudcmviewmodelPackage.createPackageContents();
		thesmaPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theReparacionvehiculoPackage.createPackageContents();
		theAutomatizacionrevisionPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theContenedorcrudclienteviewmodelPackage.createPackageContents();
		theContenedorregistrovehiculoviewmodelPackage.createPackageContents();

		// Initialize created meta-data
		theContenedorcrudcmviewmodelPackage.initializePackageContents();
		thesmaPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theReparacionvehiculoPackage.initializePackageContents();
		theAutomatizacionrevisionPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theContenedorcrudclienteviewmodelPackage.initializePackageContents();
		theContenedorregistrovehiculoviewmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContenedorcrudcmviewmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContenedorcrudcmviewmodelPackage.eNS_URI, theContenedorcrudcmviewmodelPackage);
		return theContenedorcrudcmviewmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCentroMantViewModel() {
		return centroMantViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCentroMantViewModel_Nombrecm() {
		return (EAttribute)centroMantViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCentroMantViewModel_Nombrerepresentante() {
		return (EAttribute)centroMantViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCentroMantViewModel_Ciudad() {
		return (EAttribute)centroMantViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCentroMantViewModel_The0ContenedorMaestroCMViewModel() {
		return (EReference)centroMantViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorCRUDCMViewModel() {
		return contenedorCRUDCMViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorCRUDCMViewModel_OwnedByUI() {
		return (EReference)contenedorCRUDCMViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorCRUDCMViewModel_TheContenedorDetalleCMViewModel() {
		return (EReference)contenedorCRUDCMViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorCRUDCMViewModel_TheContenedorMaestroCMViewModel() {
		return (EReference)contenedorCRUDCMViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorDetalleCMViewModel() {
		return contenedorDetalleCMViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorDetalleCMViewModel_OwnedByContenedorCRUDCMViewModel() {
		return (EReference)contenedorDetalleCMViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorDetalleCMViewModel_TheContenedorInformacionCMViewModel() {
		return (EReference)contenedorDetalleCMViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorDetalleCMViewModel_TheContenedorUbicacionViewModel() {
		return (EReference)contenedorDetalleCMViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorInformacionCMViewModel() {
		return contenedorInformacionCMViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorInformacionCMViewModel_OwnedByContenedorDetalleCMViewModel() {
		return (EReference)contenedorInformacionCMViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorInformacionCMViewModel_Nombrecm() {
		return (EAttribute)contenedorInformacionCMViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorInformacionCMViewModel_Nombrerepresentante() {
		return (EAttribute)contenedorInformacionCMViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorInformacionCMViewModel_Descripcion() {
		return (EAttribute)contenedorInformacionCMViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorMaestroCMViewModel() {
		return contenedorMaestroCMViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorMaestroCMViewModel_OwnedByContenedorCRUDCMViewModel() {
		return (EReference)contenedorMaestroCMViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorMaestroCMViewModel_CentroMantViewModel() {
		return (EReference)contenedorMaestroCMViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorUbicacionViewModel() {
		return contenedorUbicacionViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorUbicacionViewModel_OwnedByContenedorDetalleCMViewModel() {
		return (EReference)contenedorUbicacionViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorUbicacionViewModel_Pais() {
		return (EAttribute)contenedorUbicacionViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorUbicacionViewModel_Departamento() {
		return (EAttribute)contenedorUbicacionViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorUbicacionViewModel_Ciudad() {
		return (EAttribute)contenedorUbicacionViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorUbicacionViewModel_Direccion() {
		return (EAttribute)contenedorUbicacionViewModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorcrudcmviewmodelFactory getContenedorcrudcmviewmodelFactory() {
		return (ContenedorcrudcmviewmodelFactory)getEFactoryInstance();
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
		centroMantViewModelEClass = createEClass(CENTRO_MANT_VIEW_MODEL);
		createEAttribute(centroMantViewModelEClass, CENTRO_MANT_VIEW_MODEL__NOMBRECM);
		createEAttribute(centroMantViewModelEClass, CENTRO_MANT_VIEW_MODEL__NOMBREREPRESENTANTE);
		createEAttribute(centroMantViewModelEClass, CENTRO_MANT_VIEW_MODEL__CIUDAD);
		createEReference(centroMantViewModelEClass, CENTRO_MANT_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CM_VIEW_MODEL);

		contenedorCRUDCMViewModelEClass = createEClass(CONTENEDOR_CRUDCM_VIEW_MODEL);
		createEReference(contenedorCRUDCMViewModelEClass, CONTENEDOR_CRUDCM_VIEW_MODEL__OWNED_BY_UI);
		createEReference(contenedorCRUDCMViewModelEClass, CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CM_VIEW_MODEL);
		createEReference(contenedorCRUDCMViewModelEClass, CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CM_VIEW_MODEL);

		contenedorDetalleCMViewModelEClass = createEClass(CONTENEDOR_DETALLE_CM_VIEW_MODEL);
		createEReference(contenedorDetalleCMViewModelEClass, CONTENEDOR_DETALLE_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL);
		createEReference(contenedorDetalleCMViewModelEClass, CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_CM_VIEW_MODEL);
		createEReference(contenedorDetalleCMViewModelEClass, CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACION_VIEW_MODEL);

		contenedorInformacionCMViewModelEClass = createEClass(CONTENEDOR_INFORMACION_CM_VIEW_MODEL);
		createEReference(contenedorInformacionCMViewModelEClass, CONTENEDOR_INFORMACION_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL);
		createEAttribute(contenedorInformacionCMViewModelEClass, CONTENEDOR_INFORMACION_CM_VIEW_MODEL__NOMBRECM);
		createEAttribute(contenedorInformacionCMViewModelEClass, CONTENEDOR_INFORMACION_CM_VIEW_MODEL__NOMBREREPRESENTANTE);
		createEAttribute(contenedorInformacionCMViewModelEClass, CONTENEDOR_INFORMACION_CM_VIEW_MODEL__DESCRIPCION);

		contenedorMaestroCMViewModelEClass = createEClass(CONTENEDOR_MAESTRO_CM_VIEW_MODEL);
		createEReference(contenedorMaestroCMViewModelEClass, CONTENEDOR_MAESTRO_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL);
		createEReference(contenedorMaestroCMViewModelEClass, CONTENEDOR_MAESTRO_CM_VIEW_MODEL__CENTRO_MANT_VIEW_MODEL);

		contenedorUbicacionViewModelEClass = createEClass(CONTENEDOR_UBICACION_VIEW_MODEL);
		createEReference(contenedorUbicacionViewModelEClass, CONTENEDOR_UBICACION_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL);
		createEAttribute(contenedorUbicacionViewModelEClass, CONTENEDOR_UBICACION_VIEW_MODEL__PAIS);
		createEAttribute(contenedorUbicacionViewModelEClass, CONTENEDOR_UBICACION_VIEW_MODEL__DEPARTAMENTO);
		createEAttribute(contenedorUbicacionViewModelEClass, CONTENEDOR_UBICACION_VIEW_MODEL__CIUDAD);
		createEAttribute(contenedorUbicacionViewModelEClass, CONTENEDOR_UBICACION_VIEW_MODEL__DIRECCION);
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
		initEClass(centroMantViewModelEClass, CentroMantViewModel.class, "CentroMantViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCentroMantViewModel_Nombrecm(), thesmaPackage.getString(), "nombrecm", null, 0, 1, CentroMantViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCentroMantViewModel_Nombrerepresentante(), thesmaPackage.getString(), "nombrerepresentante", null, 0, 1, CentroMantViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCentroMantViewModel_Ciudad(), thesmaPackage.getString(), "ciudad", null, 0, 1, CentroMantViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCentroMantViewModel_The0ContenedorMaestroCMViewModel(), this.getContenedorMaestroCMViewModel(), this.getContenedorMaestroCMViewModel_CentroMantViewModel(), "the0ContenedorMaestroCMViewModel", null, 0, 1, CentroMantViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenedorCRUDCMViewModelEClass, ContenedorCRUDCMViewModel.class, "ContenedorCRUDCMViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorCRUDCMViewModel_OwnedByUI(), theUiPackage.getUI(), theUiPackage.getUI_TheContenedorCRUDCMViewModel(), "ownedByUI", null, 0, 1, ContenedorCRUDCMViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorCRUDCMViewModel_TheContenedorDetalleCMViewModel(), this.getContenedorDetalleCMViewModel(), this.getContenedorDetalleCMViewModel_OwnedByContenedorCRUDCMViewModel(), "theContenedorDetalleCMViewModel", null, 0, 1, ContenedorCRUDCMViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorCRUDCMViewModel_TheContenedorMaestroCMViewModel(), this.getContenedorMaestroCMViewModel(), this.getContenedorMaestroCMViewModel_OwnedByContenedorCRUDCMViewModel(), "theContenedorMaestroCMViewModel", null, 0, 1, ContenedorCRUDCMViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(contenedorCRUDCMViewModelEClass, thesmaPackage.getString(), "upadateDialog", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thesmaPackage.getString(), "evento", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contenedorCRUDCMViewModelEClass, null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contenedorCRUDCMViewModelEClass, null, "registrarCm", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contenedorDetalleCMViewModelEClass, ContenedorDetalleCMViewModel.class, "ContenedorDetalleCMViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorDetalleCMViewModel_OwnedByContenedorCRUDCMViewModel(), this.getContenedorCRUDCMViewModel(), this.getContenedorCRUDCMViewModel_TheContenedorDetalleCMViewModel(), "ownedByContenedorCRUDCMViewModel", null, 0, 1, ContenedorDetalleCMViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorDetalleCMViewModel_TheContenedorInformacionCMViewModel(), this.getContenedorInformacionCMViewModel(), this.getContenedorInformacionCMViewModel_OwnedByContenedorDetalleCMViewModel(), "theContenedorInformacionCMViewModel", null, 0, 1, ContenedorDetalleCMViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorDetalleCMViewModel_TheContenedorUbicacionViewModel(), this.getContenedorUbicacionViewModel(), this.getContenedorUbicacionViewModel_OwnedByContenedorDetalleCMViewModel(), "theContenedorUbicacionViewModel", null, 0, 1, ContenedorDetalleCMViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(contenedorDetalleCMViewModelEClass, null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contenedorInformacionCMViewModelEClass, ContenedorInformacionCMViewModel.class, "ContenedorInformacionCMViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorInformacionCMViewModel_OwnedByContenedorDetalleCMViewModel(), this.getContenedorDetalleCMViewModel(), this.getContenedorDetalleCMViewModel_TheContenedorInformacionCMViewModel(), "ownedByContenedorDetalleCMViewModel", null, 0, 1, ContenedorInformacionCMViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorInformacionCMViewModel_Nombrecm(), thesmaPackage.getString(), "nombrecm", null, 0, 1, ContenedorInformacionCMViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorInformacionCMViewModel_Nombrerepresentante(), thesmaPackage.getString(), "nombrerepresentante", null, 0, 1, ContenedorInformacionCMViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorInformacionCMViewModel_Descripcion(), thesmaPackage.getString(), "descripcion", null, 0, 1, ContenedorInformacionCMViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenedorMaestroCMViewModelEClass, ContenedorMaestroCMViewModel.class, "ContenedorMaestroCMViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorMaestroCMViewModel_OwnedByContenedorCRUDCMViewModel(), this.getContenedorCRUDCMViewModel(), this.getContenedorCRUDCMViewModel_TheContenedorMaestroCMViewModel(), "ownedByContenedorCRUDCMViewModel", null, 0, 1, ContenedorMaestroCMViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorMaestroCMViewModel_CentroMantViewModel(), this.getCentroMantViewModel(), this.getCentroMantViewModel_The0ContenedorMaestroCMViewModel(), "CentroMantViewModel", null, 0, -1, ContenedorMaestroCMViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenedorUbicacionViewModelEClass, ContenedorUbicacionViewModel.class, "ContenedorUbicacionViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorUbicacionViewModel_OwnedByContenedorDetalleCMViewModel(), this.getContenedorDetalleCMViewModel(), this.getContenedorDetalleCMViewModel_TheContenedorUbicacionViewModel(), "ownedByContenedorDetalleCMViewModel", null, 0, 1, ContenedorUbicacionViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorUbicacionViewModel_Pais(), thesmaPackage.getString(), "pais", null, 0, 1, ContenedorUbicacionViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorUbicacionViewModel_Departamento(), thesmaPackage.getString(), "departamento", null, 0, 1, ContenedorUbicacionViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorUbicacionViewModel_Ciudad(), thesmaPackage.getString(), "ciudad", null, 0, 1, ContenedorUbicacionViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorUbicacionViewModel_Direccion(), thesmaPackage.getString(), "direccion", null, 0, 1, ContenedorUbicacionViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ContenedorcrudcmviewmodelPackageImpl
