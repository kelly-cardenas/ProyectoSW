/**
 */
package sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl;

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

import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel;
import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel;
import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorVehiculosRegistradosViewModel;
import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelFactory;
import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage;
import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel;

import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelPackage;

import sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorsolicitudvisitaviewmodelPackageImpl;

import sma.ui.viewmodels.impl.ViewmodelsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContenedorregistrovehiculoviewmodelPackageImpl extends EPackageImpl implements ContenedorregistrovehiculoviewmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorDetalleVehiculoViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorRegistroVehiculoViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorVehiculosRegistradosViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehiculoViewModelEClass = null;

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
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContenedorregistrovehiculoviewmodelPackageImpl() {
		super(eNS_URI, ContenedorregistrovehiculoviewmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContenedorregistrovehiculoviewmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContenedorregistrovehiculoviewmodelPackage init() {
		if (isInited) return (ContenedorregistrovehiculoviewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrovehiculoviewmodelPackage.eNS_URI);

		// Obtain or create and register package
		ContenedorregistrovehiculoviewmodelPackageImpl theContenedorregistrovehiculoviewmodelPackage = (ContenedorregistrovehiculoviewmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContenedorregistrovehiculoviewmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContenedorregistrovehiculoviewmodelPackageImpl());

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
		ContenedorloginviewmodelPackageImpl theContenedorloginviewmodelPackage = (ContenedorloginviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorloginviewmodelPackage.eNS_URI) instanceof ContenedorloginviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorloginviewmodelPackage.eNS_URI) : ContenedorloginviewmodelPackage.eINSTANCE);
		ContenedorescaneoviewmodelPackageImpl theContenedorescaneoviewmodelPackage = (ContenedorescaneoviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorescaneoviewmodelPackage.eNS_URI) instanceof ContenedorescaneoviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorescaneoviewmodelPackage.eNS_URI) : ContenedorescaneoviewmodelPackage.eINSTANCE);
		ContenedorcontactarcmviewmodelPackageImpl theContenedorcontactarcmviewmodelPackage = (ContenedorcontactarcmviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcontactarcmviewmodelPackage.eNS_URI) instanceof ContenedorcontactarcmviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcontactarcmviewmodelPackage.eNS_URI) : ContenedorcontactarcmviewmodelPackage.eINSTANCE);
		ContenedorsolicitudvisitaviewmodelPackageImpl theContenedorsolicitudvisitaviewmodelPackage = (ContenedorsolicitudvisitaviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorsolicitudvisitaviewmodelPackage.eNS_URI) instanceof ContenedorsolicitudvisitaviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorsolicitudvisitaviewmodelPackage.eNS_URI) : ContenedorsolicitudvisitaviewmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theContenedorregistrovehiculoviewmodelPackage.createPackageContents();
		thesmaPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theReparacionvehiculoPackage.createPackageContents();
		theAutomatizacionrevisionPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theViewmodelsPackage.createPackageContents();
		theContenedorcrudclienteviewmodelPackage.createPackageContents();
		theContenedorcrudcmviewmodelPackage.createPackageContents();
		theContenedorloginviewmodelPackage.createPackageContents();
		theContenedorescaneoviewmodelPackage.createPackageContents();
		theContenedorcontactarcmviewmodelPackage.createPackageContents();
		theContenedorsolicitudvisitaviewmodelPackage.createPackageContents();

		// Initialize created meta-data
		theContenedorregistrovehiculoviewmodelPackage.initializePackageContents();
		thesmaPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theReparacionvehiculoPackage.initializePackageContents();
		theAutomatizacionrevisionPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theViewmodelsPackage.initializePackageContents();
		theContenedorcrudclienteviewmodelPackage.initializePackageContents();
		theContenedorcrudcmviewmodelPackage.initializePackageContents();
		theContenedorloginviewmodelPackage.initializePackageContents();
		theContenedorescaneoviewmodelPackage.initializePackageContents();
		theContenedorcontactarcmviewmodelPackage.initializePackageContents();
		theContenedorsolicitudvisitaviewmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContenedorregistrovehiculoviewmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContenedorregistrovehiculoviewmodelPackage.eNS_URI, theContenedorregistrovehiculoviewmodelPackage);
		return theContenedorregistrovehiculoviewmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorDetalleVehiculoViewModel() {
		return contenedorDetalleVehiculoViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDetalleVehiculoViewModel_Propietario() {
		return (EAttribute)contenedorDetalleVehiculoViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDetalleVehiculoViewModel_Marca() {
		return (EAttribute)contenedorDetalleVehiculoViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDetalleVehiculoViewModel_Referencia() {
		return (EAttribute)contenedorDetalleVehiculoViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDetalleVehiculoViewModel_Modelo() {
		return (EAttribute)contenedorDetalleVehiculoViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDetalleVehiculoViewModel_Tipovehiculo() {
		return (EAttribute)contenedorDetalleVehiculoViewModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenedorDetalleVehiculoViewModel_Placa() {
		return (EAttribute)contenedorDetalleVehiculoViewModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorDetalleVehiculoViewModel_OwnedByContenedorRegistroVehiculoViewModel() {
		return (EReference)contenedorDetalleVehiculoViewModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorRegistroVehiculoViewModel() {
		return contenedorRegistroVehiculoViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorRegistroVehiculoViewModel_OwnedByUI() {
		return (EReference)contenedorRegistroVehiculoViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorRegistroVehiculoViewModel_TheContenedorDetalleVehiculoViewModel() {
		return (EReference)contenedorRegistroVehiculoViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorRegistroVehiculoViewModel_TheContenedorVehiculosRegistradosViewModel() {
		return (EReference)contenedorRegistroVehiculoViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedorVehiculosRegistradosViewModel() {
		return contenedorVehiculosRegistradosViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorVehiculosRegistradosViewModel_OwnedByContenedorRegistroVehiculoViewModel() {
		return (EReference)contenedorVehiculosRegistradosViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedorVehiculosRegistradosViewModel_ListaVehiculo() {
		return (EReference)contenedorVehiculosRegistradosViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVehiculoViewModel() {
		return vehiculoViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehiculoViewModel_The0ContenedorVehiculosRegistradosViewModel() {
		return (EReference)vehiculoViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehiculoViewModel_Marca() {
		return (EAttribute)vehiculoViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehiculoViewModel_Referencia() {
		return (EAttribute)vehiculoViewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehiculoViewModel_Placa() {
		return (EAttribute)vehiculoViewModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContenedorregistrovehiculoviewmodelFactory getContenedorregistrovehiculoviewmodelFactory() {
		return (ContenedorregistrovehiculoviewmodelFactory)getEFactoryInstance();
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
		contenedorDetalleVehiculoViewModelEClass = createEClass(CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL);
		createEAttribute(contenedorDetalleVehiculoViewModelEClass, CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__PROPIETARIO);
		createEAttribute(contenedorDetalleVehiculoViewModelEClass, CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__MARCA);
		createEAttribute(contenedorDetalleVehiculoViewModelEClass, CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__REFERENCIA);
		createEAttribute(contenedorDetalleVehiculoViewModelEClass, CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__MODELO);
		createEAttribute(contenedorDetalleVehiculoViewModelEClass, CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__TIPOVEHICULO);
		createEAttribute(contenedorDetalleVehiculoViewModelEClass, CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__PLACA);
		createEReference(contenedorDetalleVehiculoViewModelEClass, CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL);

		contenedorRegistroVehiculoViewModelEClass = createEClass(CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL);
		createEReference(contenedorRegistroVehiculoViewModelEClass, CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__OWNED_BY_UI);
		createEReference(contenedorRegistroVehiculoViewModelEClass, CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL);
		createEReference(contenedorRegistroVehiculoViewModelEClass, CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL);

		contenedorVehiculosRegistradosViewModelEClass = createEClass(CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL);
		createEReference(contenedorVehiculosRegistradosViewModelEClass, CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL);
		createEReference(contenedorVehiculosRegistradosViewModelEClass, CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__LISTA_VEHICULO);

		vehiculoViewModelEClass = createEClass(VEHICULO_VIEW_MODEL);
		createEReference(vehiculoViewModelEClass, VEHICULO_VIEW_MODEL__THE0_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL);
		createEAttribute(vehiculoViewModelEClass, VEHICULO_VIEW_MODEL__MARCA);
		createEAttribute(vehiculoViewModelEClass, VEHICULO_VIEW_MODEL__REFERENCIA);
		createEAttribute(vehiculoViewModelEClass, VEHICULO_VIEW_MODEL__PLACA);
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
		initEClass(contenedorDetalleVehiculoViewModelEClass, ContenedorDetalleVehiculoViewModel.class, "ContenedorDetalleVehiculoViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContenedorDetalleVehiculoViewModel_Propietario(), thesmaPackage.getString(), "propietario", " ", 0, 1, ContenedorDetalleVehiculoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorDetalleVehiculoViewModel_Marca(), thesmaPackage.getString(), "marca", " ", 0, 1, ContenedorDetalleVehiculoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorDetalleVehiculoViewModel_Referencia(), thesmaPackage.getString(), "referencia", " ", 0, 1, ContenedorDetalleVehiculoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorDetalleVehiculoViewModel_Modelo(), thesmaPackage.getString(), "modelo", " ", 0, 1, ContenedorDetalleVehiculoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorDetalleVehiculoViewModel_Tipovehiculo(), thesmaPackage.getString(), "tipovehiculo", " ", 0, 1, ContenedorDetalleVehiculoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenedorDetalleVehiculoViewModel_Placa(), thesmaPackage.getString(), "placa", " ", 0, 1, ContenedorDetalleVehiculoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorDetalleVehiculoViewModel_OwnedByContenedorRegistroVehiculoViewModel(), this.getContenedorRegistroVehiculoViewModel(), this.getContenedorRegistroVehiculoViewModel_TheContenedorDetalleVehiculoViewModel(), "ownedByContenedorRegistroVehiculoViewModel", null, 0, 1, ContenedorDetalleVehiculoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contenedorRegistroVehiculoViewModelEClass, ContenedorRegistroVehiculoViewModel.class, "ContenedorRegistroVehiculoViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorRegistroVehiculoViewModel_OwnedByUI(), theUiPackage.getUI(), theUiPackage.getUI_TheContenedorRegistroVehiculoViewModel(), "ownedByUI", null, 0, 1, ContenedorRegistroVehiculoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorRegistroVehiculoViewModel_TheContenedorDetalleVehiculoViewModel(), this.getContenedorDetalleVehiculoViewModel(), this.getContenedorDetalleVehiculoViewModel_OwnedByContenedorRegistroVehiculoViewModel(), "theContenedorDetalleVehiculoViewModel", null, 0, 1, ContenedorRegistroVehiculoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorRegistroVehiculoViewModel_TheContenedorVehiculosRegistradosViewModel(), this.getContenedorVehiculosRegistradosViewModel(), this.getContenedorVehiculosRegistradosViewModel_OwnedByContenedorRegistroVehiculoViewModel(), "theContenedorVehiculosRegistradosViewModel", null, 0, 1, ContenedorRegistroVehiculoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(contenedorRegistroVehiculoViewModelEClass, thesmaPackage.getString(), "upadateDialog", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thesmaPackage.getString(), "evento", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contenedorRegistroVehiculoViewModelEClass, null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contenedorRegistroVehiculoViewModelEClass, null, "registrarVehiculo", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contenedorRegistroVehiculoViewModelEClass, null, "actualizarVentanaRegistroVehiculo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contenedorVehiculosRegistradosViewModelEClass, ContenedorVehiculosRegistradosViewModel.class, "ContenedorVehiculosRegistradosViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedorVehiculosRegistradosViewModel_OwnedByContenedorRegistroVehiculoViewModel(), this.getContenedorRegistroVehiculoViewModel(), this.getContenedorRegistroVehiculoViewModel_TheContenedorVehiculosRegistradosViewModel(), "ownedByContenedorRegistroVehiculoViewModel", null, 0, 1, ContenedorVehiculosRegistradosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenedorVehiculosRegistradosViewModel_ListaVehiculo(), this.getVehiculoViewModel(), this.getVehiculoViewModel_The0ContenedorVehiculosRegistradosViewModel(), "listaVehiculo", null, 0, -1, ContenedorVehiculosRegistradosViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehiculoViewModelEClass, VehiculoViewModel.class, "VehiculoViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVehiculoViewModel_The0ContenedorVehiculosRegistradosViewModel(), this.getContenedorVehiculosRegistradosViewModel(), this.getContenedorVehiculosRegistradosViewModel_ListaVehiculo(), "the0ContenedorVehiculosRegistradosViewModel", null, 0, 1, VehiculoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehiculoViewModel_Marca(), thesmaPackage.getString(), "marca", " ", 0, 1, VehiculoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehiculoViewModel_Referencia(), thesmaPackage.getString(), "referencia", " ", 0, 1, VehiculoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehiculoViewModel_Placa(), thesmaPackage.getString(), "placa", " ", 0, 1, VehiculoViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ContenedorregistrovehiculoviewmodelPackageImpl
