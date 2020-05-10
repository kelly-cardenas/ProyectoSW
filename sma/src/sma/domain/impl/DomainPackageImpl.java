/**
 */
package sma.domain.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sma.domain.Automovil;
import sma.domain.CentroMant;
import sma.domain.Domain;
import sma.domain.DomainFactory;
import sma.domain.DomainPackage;
import sma.domain.UbicacionCM;
import sma.domain.UbicacionUsu;
import sma.domain.Usuario;

import sma.domain.automatizacionrevision.AutomatizacionrevisionPackage;

import sma.domain.automatizacionrevision.impl.AutomatizacionrevisionPackageImpl;

import sma.domain.reparacionvehiculo.ReparacionvehiculoPackage;

import sma.domain.reparacionvehiculo.impl.ReparacionvehiculoPackageImpl;

import sma.impl.smaPackageImpl;

import sma.smaPackage;

import sma.ui.UiPackage;

import sma.ui.impl.UiPackageImpl;

import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage;

import sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorcrudclienteviewmodelPackageImpl;

import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage;

import sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorcrudcmviewmodelPackageImpl;

import sma.ui.viewmodels.contenedorloginviewmodel.ContenedorloginviewmodelPackage;

import sma.ui.viewmodels.contenedorloginviewmodel.impl.ContenedorloginviewmodelPackageImpl;

import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage;

import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorregistrovehiculoviewmodelPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainPackageImpl extends EPackageImpl implements DomainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass automovilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass centroMantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ubicacionCMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ubicacionUsuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usuarioEClass = null;

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
	 * @see sma.domain.DomainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DomainPackageImpl() {
		super(eNS_URI, DomainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DomainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DomainPackage init() {
		if (isInited) return (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Obtain or create and register package
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DomainPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		smaPackageImpl thesmaPackage = (smaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(smaPackage.eNS_URI) instanceof smaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(smaPackage.eNS_URI) : smaPackage.eINSTANCE);
		ReparacionvehiculoPackageImpl theReparacionvehiculoPackage = (ReparacionvehiculoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReparacionvehiculoPackage.eNS_URI) instanceof ReparacionvehiculoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReparacionvehiculoPackage.eNS_URI) : ReparacionvehiculoPackage.eINSTANCE);
		AutomatizacionrevisionPackageImpl theAutomatizacionrevisionPackage = (AutomatizacionrevisionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AutomatizacionrevisionPackage.eNS_URI) instanceof AutomatizacionrevisionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AutomatizacionrevisionPackage.eNS_URI) : AutomatizacionrevisionPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
		ContenedorcrudclienteviewmodelPackageImpl theContenedorcrudclienteviewmodelPackage = (ContenedorcrudclienteviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclienteviewmodelPackage.eNS_URI) instanceof ContenedorcrudclienteviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclienteviewmodelPackage.eNS_URI) : ContenedorcrudclienteviewmodelPackage.eINSTANCE);
		ContenedorcrudcmviewmodelPackageImpl theContenedorcrudcmviewmodelPackage = (ContenedorcrudcmviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudcmviewmodelPackage.eNS_URI) instanceof ContenedorcrudcmviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudcmviewmodelPackage.eNS_URI) : ContenedorcrudcmviewmodelPackage.eINSTANCE);
		ContenedorregistrovehiculoviewmodelPackageImpl theContenedorregistrovehiculoviewmodelPackage = (ContenedorregistrovehiculoviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrovehiculoviewmodelPackage.eNS_URI) instanceof ContenedorregistrovehiculoviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrovehiculoviewmodelPackage.eNS_URI) : ContenedorregistrovehiculoviewmodelPackage.eINSTANCE);
		ContenedorloginviewmodelPackageImpl theContenedorloginviewmodelPackage = (ContenedorloginviewmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContenedorloginviewmodelPackage.eNS_URI) instanceof ContenedorloginviewmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContenedorloginviewmodelPackage.eNS_URI) : ContenedorloginviewmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theDomainPackage.createPackageContents();
		thesmaPackage.createPackageContents();
		theReparacionvehiculoPackage.createPackageContents();
		theAutomatizacionrevisionPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theContenedorcrudclienteviewmodelPackage.createPackageContents();
		theContenedorcrudcmviewmodelPackage.createPackageContents();
		theContenedorregistrovehiculoviewmodelPackage.createPackageContents();
		theContenedorloginviewmodelPackage.createPackageContents();

		// Initialize created meta-data
		theDomainPackage.initializePackageContents();
		thesmaPackage.initializePackageContents();
		theReparacionvehiculoPackage.initializePackageContents();
		theAutomatizacionrevisionPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theContenedorcrudclienteviewmodelPackage.initializePackageContents();
		theContenedorcrudcmviewmodelPackage.initializePackageContents();
		theContenedorregistrovehiculoviewmodelPackage.initializePackageContents();
		theContenedorloginviewmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDomainPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DomainPackage.eNS_URI, theDomainPackage);
		return theDomainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutomovil() {
		return automovilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomovil_Id() {
		return (EAttribute)automovilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomovil_Placa() {
		return (EAttribute)automovilEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomovil_Marca() {
		return (EAttribute)automovilEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomovil_Modelo() {
		return (EAttribute)automovilEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomovil_Referencia() {
		return (EAttribute)automovilEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomovil_TipoUso() {
		return (EAttribute)automovilEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutomovil_ReparacionesHechas() {
		return (EReference)automovilEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutomovil_Sensor() {
		return (EReference)automovilEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutomovil_Propietario() {
		return (EReference)automovilEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutomovil_ListaDeFallas() {
		return (EReference)automovilEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCentroMant() {
		return centroMantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCentroMant_Id() {
		return (EAttribute)centroMantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCentroMant_Nombre() {
		return (EAttribute)centroMantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCentroMant_NombreRepresentante() {
		return (EAttribute)centroMantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCentroMant_Descripcion() {
		return (EAttribute)centroMantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCentroMant_Usuario() {
		return (EAttribute)centroMantEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCentroMant_Contrasenia() {
		return (EAttribute)centroMantEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCentroMant_UsuariosAtendidos() {
		return (EReference)centroMantEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCentroMant_HistorialReparacion() {
		return (EReference)centroMantEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCentroMant_OwnedByDomain() {
		return (EReference)centroMantEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCentroMant_Ubicacion() {
		return (EReference)centroMantEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_TheModelFactory() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_IncrementalIdCliente() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_IncrementalIdCm() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_IncrementalIdAuto() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_ListaAutomoviles() {
		return (EReference)domainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_ListaDeCentMant() {
		return (EReference)domainEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_ListaUsuarios() {
		return (EReference)domainEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_TheUI() {
		return (EReference)domainEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUbicacionCM() {
		return ubicacionCMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUbicacionCM_Pais() {
		return (EAttribute)ubicacionCMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUbicacionCM_Departamento() {
		return (EAttribute)ubicacionCMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUbicacionCM_Ciudad() {
		return (EAttribute)ubicacionCMEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUbicacionCM_Direccion() {
		return (EAttribute)ubicacionCMEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUbicacionCM_OwnedBy() {
		return (EReference)ubicacionCMEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUbicacionUsu() {
		return ubicacionUsuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUbicacionUsu_Pais() {
		return (EAttribute)ubicacionUsuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUbicacionUsu_Departamento() {
		return (EAttribute)ubicacionUsuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUbicacionUsu_Ciudad() {
		return (EAttribute)ubicacionUsuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUbicacionUsu_OwnerBy() {
		return (EReference)ubicacionUsuEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsuario() {
		return usuarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsuario_CentroMant() {
		return (EReference)usuarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsuario_OwnerByDomain() {
		return (EReference)usuarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Id() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_NumDI() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Nombres() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Apellidos() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Edad() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Email() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Usuario() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Contrasenia() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsuario_Automoviles() {
		return (EReference)usuarioEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsuario_Ubicacion() {
		return (EReference)usuarioEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFactory getDomainFactory() {
		return (DomainFactory)getEFactoryInstance();
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
		automovilEClass = createEClass(AUTOMOVIL);
		createEAttribute(automovilEClass, AUTOMOVIL__ID);
		createEAttribute(automovilEClass, AUTOMOVIL__PLACA);
		createEAttribute(automovilEClass, AUTOMOVIL__MARCA);
		createEAttribute(automovilEClass, AUTOMOVIL__MODELO);
		createEAttribute(automovilEClass, AUTOMOVIL__REFERENCIA);
		createEAttribute(automovilEClass, AUTOMOVIL__TIPO_USO);
		createEReference(automovilEClass, AUTOMOVIL__REPARACIONES_HECHAS);
		createEReference(automovilEClass, AUTOMOVIL__SENSOR);
		createEReference(automovilEClass, AUTOMOVIL__PROPIETARIO);
		createEReference(automovilEClass, AUTOMOVIL__LISTA_DE_FALLAS);

		centroMantEClass = createEClass(CENTRO_MANT);
		createEAttribute(centroMantEClass, CENTRO_MANT__ID);
		createEAttribute(centroMantEClass, CENTRO_MANT__NOMBRE);
		createEAttribute(centroMantEClass, CENTRO_MANT__NOMBRE_REPRESENTANTE);
		createEAttribute(centroMantEClass, CENTRO_MANT__DESCRIPCION);
		createEAttribute(centroMantEClass, CENTRO_MANT__USUARIO);
		createEAttribute(centroMantEClass, CENTRO_MANT__CONTRASENIA);
		createEReference(centroMantEClass, CENTRO_MANT__USUARIOS_ATENDIDOS);
		createEReference(centroMantEClass, CENTRO_MANT__HISTORIAL_REPARACION);
		createEReference(centroMantEClass, CENTRO_MANT__OWNED_BY_DOMAIN);
		createEReference(centroMantEClass, CENTRO_MANT__UBICACION);

		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__THE_MODEL_FACTORY);
		createEAttribute(domainEClass, DOMAIN__INCREMENTAL_ID_CLIENTE);
		createEAttribute(domainEClass, DOMAIN__INCREMENTAL_ID_CM);
		createEAttribute(domainEClass, DOMAIN__INCREMENTAL_ID_AUTO);
		createEReference(domainEClass, DOMAIN__LISTA_AUTOMOVILES);
		createEReference(domainEClass, DOMAIN__LISTA_DE_CENT_MANT);
		createEReference(domainEClass, DOMAIN__LISTA_USUARIOS);
		createEReference(domainEClass, DOMAIN__THE_UI);

		ubicacionCMEClass = createEClass(UBICACION_CM);
		createEAttribute(ubicacionCMEClass, UBICACION_CM__PAIS);
		createEAttribute(ubicacionCMEClass, UBICACION_CM__DEPARTAMENTO);
		createEAttribute(ubicacionCMEClass, UBICACION_CM__CIUDAD);
		createEAttribute(ubicacionCMEClass, UBICACION_CM__DIRECCION);
		createEReference(ubicacionCMEClass, UBICACION_CM__OWNED_BY);

		ubicacionUsuEClass = createEClass(UBICACION_USU);
		createEAttribute(ubicacionUsuEClass, UBICACION_USU__PAIS);
		createEAttribute(ubicacionUsuEClass, UBICACION_USU__DEPARTAMENTO);
		createEAttribute(ubicacionUsuEClass, UBICACION_USU__CIUDAD);
		createEReference(ubicacionUsuEClass, UBICACION_USU__OWNER_BY);

		usuarioEClass = createEClass(USUARIO);
		createEReference(usuarioEClass, USUARIO__CENTRO_MANT);
		createEReference(usuarioEClass, USUARIO__OWNER_BY_DOMAIN);
		createEAttribute(usuarioEClass, USUARIO__ID);
		createEAttribute(usuarioEClass, USUARIO__NUM_DI);
		createEAttribute(usuarioEClass, USUARIO__NOMBRES);
		createEAttribute(usuarioEClass, USUARIO__APELLIDOS);
		createEAttribute(usuarioEClass, USUARIO__EDAD);
		createEAttribute(usuarioEClass, USUARIO__EMAIL);
		createEAttribute(usuarioEClass, USUARIO__USUARIO);
		createEAttribute(usuarioEClass, USUARIO__CONTRASENIA);
		createEReference(usuarioEClass, USUARIO__AUTOMOVILES);
		createEReference(usuarioEClass, USUARIO__UBICACION);
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
		ReparacionvehiculoPackage theReparacionvehiculoPackage = (ReparacionvehiculoPackage)EPackage.Registry.INSTANCE.getEPackage(ReparacionvehiculoPackage.eNS_URI);
		AutomatizacionrevisionPackage theAutomatizacionrevisionPackage = (AutomatizacionrevisionPackage)EPackage.Registry.INSTANCE.getEPackage(AutomatizacionrevisionPackage.eNS_URI);
		smaPackage thesmaPackage = (smaPackage)EPackage.Registry.INSTANCE.getEPackage(smaPackage.eNS_URI);
		UiPackage theUiPackage = (UiPackage)EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI);
		ContenedorcrudclienteviewmodelPackage theContenedorcrudclienteviewmodelPackage = (ContenedorcrudclienteviewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudclienteviewmodelPackage.eNS_URI);
		ContenedorcrudcmviewmodelPackage theContenedorcrudcmviewmodelPackage = (ContenedorcrudcmviewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorcrudcmviewmodelPackage.eNS_URI);
		ContenedorregistrovehiculoviewmodelPackage theContenedorregistrovehiculoviewmodelPackage = (ContenedorregistrovehiculoviewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ContenedorregistrovehiculoviewmodelPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theReparacionvehiculoPackage);
		getESubpackages().add(theAutomatizacionrevisionPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(automovilEClass, Automovil.class, "Automovil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutomovil_Id(), thesmaPackage.getString(), "id", null, 0, 1, Automovil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomovil_Placa(), thesmaPackage.getString(), "placa", null, 0, 1, Automovil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomovil_Marca(), thesmaPackage.getString(), "marca", null, 0, 1, Automovil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomovil_Modelo(), thesmaPackage.getEIntegerObject(), "modelo", null, 0, 1, Automovil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomovil_Referencia(), thesmaPackage.getString(), "referencia", null, 0, 1, Automovil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomovil_TipoUso(), thesmaPackage.getString(), "tipoUso", null, 0, 1, Automovil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutomovil_ReparacionesHechas(), theReparacionvehiculoPackage.getReparacion(), theReparacionvehiculoPackage.getReparacion_TheAutomovil(), "reparacionesHechas", null, 0, -1, Automovil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutomovil_Sensor(), theAutomatizacionrevisionPackage.getsensor(), theAutomatizacionrevisionPackage.getsensor_OwnerBy(), "sensor", null, 0, 1, Automovil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutomovil_Propietario(), this.getUsuario(), this.getUsuario_Automoviles(), "propietario", null, 0, 1, Automovil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutomovil_ListaDeFallas(), theAutomatizacionrevisionPackage.getFallaMecanica(), theAutomatizacionrevisionPackage.getFallaMecanica_TheAutomovil(), "listaDeFallas", null, 0, -1, Automovil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(automovilEClass, null, "asignarFallas", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(centroMantEClass, CentroMant.class, "CentroMant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCentroMant_Id(), thesmaPackage.getString(), "id", null, 0, 1, CentroMant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCentroMant_Nombre(), thesmaPackage.getString(), "nombre", null, 0, 1, CentroMant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCentroMant_NombreRepresentante(), thesmaPackage.getString(), "nombreRepresentante", null, 0, 1, CentroMant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCentroMant_Descripcion(), thesmaPackage.getString(), "descripcion", null, 0, 1, CentroMant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCentroMant_Usuario(), thesmaPackage.getString(), "usuario", null, 0, 1, CentroMant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCentroMant_Contrasenia(), thesmaPackage.getString(), "contrasenia", null, 0, 1, CentroMant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCentroMant_UsuariosAtendidos(), this.getUsuario(), this.getUsuario_CentroMant(), "usuariosAtendidos", null, 0, -1, CentroMant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCentroMant_HistorialReparacion(), theReparacionvehiculoPackage.getReparacion(), theReparacionvehiculoPackage.getReparacion_TheCentroMant(), "historialReparacion", null, 0, -1, CentroMant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCentroMant_OwnedByDomain(), this.getDomain(), this.getDomain_ListaDeCentMant(), "ownedByDomain", null, 0, 1, CentroMant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCentroMant_Ubicacion(), this.getUbicacionCM(), this.getUbicacionCM_OwnedBy(), "ubicacion", null, 0, 1, CentroMant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_TheModelFactory(), thesmaPackage.getModelFactory(), thesmaPackage.getModelFactory_TheDomain(), "theModelFactory", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_IncrementalIdCliente(), thesmaPackage.getEIntegerObject(), "incrementalIdCliente", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_IncrementalIdCm(), thesmaPackage.getEIntegerObject(), "incrementalIdCm", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_IncrementalIdAuto(), thesmaPackage.getEIntegerObject(), "incrementalIdAuto", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_ListaAutomoviles(), this.getAutomovil(), null, "listaAutomoviles", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_ListaDeCentMant(), this.getCentroMant(), this.getCentroMant_OwnedByDomain(), "listaDeCentMant", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_ListaUsuarios(), this.getUsuario(), this.getUsuario_OwnerByDomain(), "listaUsuarios", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_TheUI(), theUiPackage.getUI(), theUiPackage.getUI_TheDomain(), "theUI", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(domainEClass, null, "implementarModelo", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(domainEClass, null, "registrarUsuario", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudclienteviewmodelPackage.getContenedorCrudClienteViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(domainEClass, null, "registrarCm", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorcrudcmviewmodelPackage.getContenedorCRUDCMViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(domainEClass, null, "registrarAutomovil", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContenedorregistrovehiculoviewmodelPackage.getContenedorRegistroVehiculoViewModel(), "formulario", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thesmaPackage.getString(), "idPropietario", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(domainEClass, thesmaPackage.getEIntegerObject(), "incrementarIdCliente", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(domainEClass, thesmaPackage.getEIntegerObject(), "incrementarIdCm", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(domainEClass, thesmaPackage.getEIntegerObject(), "incrementarIdAuto", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ubicacionCMEClass, UbicacionCM.class, "UbicacionCM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUbicacionCM_Pais(), thesmaPackage.getString(), "pais", null, 0, 1, UbicacionCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUbicacionCM_Departamento(), thesmaPackage.getString(), "departamento", null, 0, 1, UbicacionCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUbicacionCM_Ciudad(), thesmaPackage.getString(), "ciudad", null, 0, 1, UbicacionCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUbicacionCM_Direccion(), thesmaPackage.getString(), "direccion", null, 0, 1, UbicacionCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUbicacionCM_OwnedBy(), this.getCentroMant(), this.getCentroMant_Ubicacion(), "ownedBy", null, 0, 1, UbicacionCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ubicacionUsuEClass, UbicacionUsu.class, "UbicacionUsu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUbicacionUsu_Pais(), thesmaPackage.getString(), "pais", null, 0, 1, UbicacionUsu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUbicacionUsu_Departamento(), thesmaPackage.getString(), "departamento", null, 0, 1, UbicacionUsu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUbicacionUsu_Ciudad(), thesmaPackage.getString(), "ciudad", null, 0, 1, UbicacionUsu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUbicacionUsu_OwnerBy(), this.getUsuario(), this.getUsuario_Ubicacion(), "ownerBy", null, 0, 1, UbicacionUsu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usuarioEClass, Usuario.class, "Usuario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsuario_CentroMant(), this.getCentroMant(), this.getCentroMant_UsuariosAtendidos(), "CentroMant", null, 0, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsuario_OwnerByDomain(), this.getDomain(), this.getDomain_ListaUsuarios(), "ownerByDomain", null, 0, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsuario_Id(), thesmaPackage.getString(), "id", null, 0, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsuario_NumDI(), thesmaPackage.getString(), "numDI", null, 0, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsuario_Nombres(), thesmaPackage.getString(), "nombres", null, 0, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsuario_Apellidos(), thesmaPackage.getString(), "apellidos", null, 0, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsuario_Edad(), thesmaPackage.getEIntegerObject(), "edad", null, 0, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsuario_Email(), thesmaPackage.getString(), "email", null, 0, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsuario_Usuario(), thesmaPackage.getString(), "usuario", null, 0, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsuario_Contrasenia(), thesmaPackage.getString(), "contrasenia", null, 0, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsuario_Automoviles(), this.getAutomovil(), this.getAutomovil_Propietario(), "automoviles", null, 0, -1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsuario_Ubicacion(), this.getUbicacionUsu(), this.getUbicacionUsu_OwnerBy(), "ubicacion", null, 0, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //DomainPackageImpl
