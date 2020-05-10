/**
 */
package sma.ui.viewmodels.contenedorcrudclienteviewmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelFactory
 * @model kind="package"
 * @generated
 */
public interface ContenedorcrudclienteviewmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contenedorcrudclienteviewmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///sma/ui/viewmodels/contenedorcrudclienteviewmodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sma.ui.viewmodels.contenedorcrudclienteviewmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContenedorcrudclienteviewmodelPackage eINSTANCE = sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorcrudclienteviewmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ClienteViewModelImpl <em>Cliente View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ClienteViewModelImpl
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorcrudclienteviewmodelPackageImpl#getClienteViewModel()
	 * @generated
	 */
	int CLIENTE_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Identificacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_VIEW_MODEL__IDENTIFICACION = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_VIEW_MODEL__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_VIEW_MODEL__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Edad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_VIEW_MODEL__EDAD = 3;

	/**
	 * The feature id for the '<em><b>The0 Contenedor Maestro Cliente View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL = 4;

	/**
	 * The feature id for the '<em><b>The Contenedor Maestro Cliente View Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL = 5;

	/**
	 * The number of structural features of the '<em>Cliente View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_VIEW_MODEL_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorCrudClienteViewModelImpl <em>Contenedor Crud Cliente View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorCrudClienteViewModelImpl
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorcrudclienteviewmodelPackageImpl#getContenedorCrudClienteViewModel()
	 * @generated
	 */
	int CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Owned By UI</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__OWNED_BY_UI = 0;

	/**
	 * The feature id for the '<em><b>The Contenedor Detalle Cliente View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>The Contenedor Maestro Cliente View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Contenedor Crud Cliente View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDatosPersonalesViewModelImpl <em>Contenedor Datos Personales View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDatosPersonalesViewModelImpl
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorcrudclienteviewmodelPackageImpl#getContenedorDatosPersonalesViewModel()
	 * @generated
	 */
	int CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Cedula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__CEDULA = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Apellido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__APELLIDO = 2;

	/**
	 * The feature id for the '<em><b>Edad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__EDAD = 3;

	/**
	 * The feature id for the '<em><b>Correoelectronico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__CORREOELECTRONICO = 4;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor Detalle Cliente View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL = 5;

	/**
	 * The number of structural features of the '<em>Contenedor Datos Personales View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDatosdelacuentaViewModelImpl <em>Contenedor Datosdelacuenta View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDatosdelacuentaViewModelImpl
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorcrudclienteviewmodelPackageImpl#getContenedorDatosdelacuentaViewModel()
	 * @generated
	 */
	int CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__USUARIO = 0;

	/**
	 * The feature id for the '<em><b>Contraseña</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__CONTRASEÑA = 1;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor Detalle Cliente View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Contenedor Datosdelacuenta View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDetalleClienteViewModelImpl <em>Contenedor Detalle Cliente View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDetalleClienteViewModelImpl
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorcrudclienteviewmodelPackageImpl#getContenedorDetalleClienteViewModel()
	 * @generated
	 */
	int CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor Crud Cliente View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>The Contenedor Datos Personales View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>The Contenedor Datosdelacuenta View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Contenedor Detalle Cliente View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorMaestroClienteViewModelImpl <em>Contenedor Maestro Cliente View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorMaestroClienteViewModelImpl
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorcrudclienteviewmodelPackageImpl#getContenedorMaestroClienteViewModel()
	 * @generated
	 */
	int CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor Crud Cliente View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Cliente View Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CLIENTE_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>The Cliente View Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Contenedor Maestro Cliente View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel <em>Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cliente View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel
	 * @generated
	 */
	EClass getClienteViewModel();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel#getIdentificacion <em>Identificacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identificacion</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel#getIdentificacion()
	 * @see #getClienteViewModel()
	 * @generated
	 */
	EAttribute getClienteViewModel_Identificacion();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel#getNombre()
	 * @see #getClienteViewModel()
	 * @generated
	 */
	EAttribute getClienteViewModel_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel#getEmail()
	 * @see #getClienteViewModel()
	 * @generated
	 */
	EAttribute getClienteViewModel_Email();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel#getEdad <em>Edad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edad</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel#getEdad()
	 * @see #getClienteViewModel()
	 * @generated
	 */
	EAttribute getClienteViewModel_Edad();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel#getThe0ContenedorMaestroClienteViewModel <em>The0 Contenedor Maestro Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The0 Contenedor Maestro Cliente View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel#getThe0ContenedorMaestroClienteViewModel()
	 * @see #getClienteViewModel()
	 * @generated
	 */
	EReference getClienteViewModel_The0ContenedorMaestroClienteViewModel();

	/**
	 * Returns the meta object for the reference '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel#getTheContenedorMaestroClienteViewModel <em>The Contenedor Maestro Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Contenedor Maestro Cliente View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ClienteViewModel#getTheContenedorMaestroClienteViewModel()
	 * @see #getClienteViewModel()
	 * @generated
	 */
	EReference getClienteViewModel_TheContenedorMaestroClienteViewModel();

	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel <em>Contenedor Crud Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Crud Cliente View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel
	 * @generated
	 */
	EClass getContenedorCrudClienteViewModel();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel#getOwnedByUI <em>Owned By UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By UI</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel#getOwnedByUI()
	 * @see #getContenedorCrudClienteViewModel()
	 * @generated
	 */
	EReference getContenedorCrudClienteViewModel_OwnedByUI();

	/**
	 * Returns the meta object for the containment reference '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel#getTheContenedorDetalleClienteViewModel <em>The Contenedor Detalle Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Detalle Cliente View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel#getTheContenedorDetalleClienteViewModel()
	 * @see #getContenedorCrudClienteViewModel()
	 * @generated
	 */
	EReference getContenedorCrudClienteViewModel_TheContenedorDetalleClienteViewModel();

	/**
	 * Returns the meta object for the containment reference '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel#getTheContenedorMaestroClienteViewModel <em>The Contenedor Maestro Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Maestro Cliente View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel#getTheContenedorMaestroClienteViewModel()
	 * @see #getContenedorCrudClienteViewModel()
	 * @generated
	 */
	EReference getContenedorCrudClienteViewModel_TheContenedorMaestroClienteViewModel();

	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosPersonalesViewModel <em>Contenedor Datos Personales View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Datos Personales View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosPersonalesViewModel
	 * @generated
	 */
	EClass getContenedorDatosPersonalesViewModel();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosPersonalesViewModel#getCedula <em>Cedula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cedula</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosPersonalesViewModel#getCedula()
	 * @see #getContenedorDatosPersonalesViewModel()
	 * @generated
	 */
	EAttribute getContenedorDatosPersonalesViewModel_Cedula();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosPersonalesViewModel#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosPersonalesViewModel#getNombre()
	 * @see #getContenedorDatosPersonalesViewModel()
	 * @generated
	 */
	EAttribute getContenedorDatosPersonalesViewModel_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosPersonalesViewModel#getApellido <em>Apellido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apellido</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosPersonalesViewModel#getApellido()
	 * @see #getContenedorDatosPersonalesViewModel()
	 * @generated
	 */
	EAttribute getContenedorDatosPersonalesViewModel_Apellido();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosPersonalesViewModel#getEdad <em>Edad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edad</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosPersonalesViewModel#getEdad()
	 * @see #getContenedorDatosPersonalesViewModel()
	 * @generated
	 */
	EAttribute getContenedorDatosPersonalesViewModel_Edad();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosPersonalesViewModel#getCorreoelectronico <em>Correoelectronico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correoelectronico</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosPersonalesViewModel#getCorreoelectronico()
	 * @see #getContenedorDatosPersonalesViewModel()
	 * @generated
	 */
	EAttribute getContenedorDatosPersonalesViewModel_Correoelectronico();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosPersonalesViewModel#getOwnedByContenedorDetalleClienteViewModel <em>Owned By Contenedor Detalle Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor Detalle Cliente View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosPersonalesViewModel#getOwnedByContenedorDetalleClienteViewModel()
	 * @see #getContenedorDatosPersonalesViewModel()
	 * @generated
	 */
	EReference getContenedorDatosPersonalesViewModel_OwnedByContenedorDetalleClienteViewModel();

	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosdelacuentaViewModel <em>Contenedor Datosdelacuenta View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Datosdelacuenta View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosdelacuentaViewModel
	 * @generated
	 */
	EClass getContenedorDatosdelacuentaViewModel();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosdelacuentaViewModel#getUsuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usuario</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosdelacuentaViewModel#getUsuario()
	 * @see #getContenedorDatosdelacuentaViewModel()
	 * @generated
	 */
	EAttribute getContenedorDatosdelacuentaViewModel_Usuario();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosdelacuentaViewModel#getContraseña <em>Contraseña</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contraseña</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosdelacuentaViewModel#getContraseña()
	 * @see #getContenedorDatosdelacuentaViewModel()
	 * @generated
	 */
	EAttribute getContenedorDatosdelacuentaViewModel_Contraseña();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosdelacuentaViewModel#getOwnedByContenedorDetalleClienteViewModel <em>Owned By Contenedor Detalle Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor Detalle Cliente View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDatosdelacuentaViewModel#getOwnedByContenedorDetalleClienteViewModel()
	 * @see #getContenedorDatosdelacuentaViewModel()
	 * @generated
	 */
	EReference getContenedorDatosdelacuentaViewModel_OwnedByContenedorDetalleClienteViewModel();

	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel <em>Contenedor Detalle Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Detalle Cliente View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel
	 * @generated
	 */
	EClass getContenedorDetalleClienteViewModel();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel#getOwnedByContenedorCrudClienteViewModel <em>Owned By Contenedor Crud Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor Crud Cliente View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel#getOwnedByContenedorCrudClienteViewModel()
	 * @see #getContenedorDetalleClienteViewModel()
	 * @generated
	 */
	EReference getContenedorDetalleClienteViewModel_OwnedByContenedorCrudClienteViewModel();

	/**
	 * Returns the meta object for the containment reference '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel#getTheContenedorDatosPersonalesViewModel <em>The Contenedor Datos Personales View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Datos Personales View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel#getTheContenedorDatosPersonalesViewModel()
	 * @see #getContenedorDetalleClienteViewModel()
	 * @generated
	 */
	EReference getContenedorDetalleClienteViewModel_TheContenedorDatosPersonalesViewModel();

	/**
	 * Returns the meta object for the containment reference '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel#getTheContenedorDatosdelacuentaViewModel <em>The Contenedor Datosdelacuenta View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Datosdelacuenta View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel#getTheContenedorDatosdelacuentaViewModel()
	 * @see #getContenedorDetalleClienteViewModel()
	 * @generated
	 */
	EReference getContenedorDetalleClienteViewModel_TheContenedorDatosdelacuentaViewModel();

	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorMaestroClienteViewModel <em>Contenedor Maestro Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Maestro Cliente View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorMaestroClienteViewModel
	 * @generated
	 */
	EClass getContenedorMaestroClienteViewModel();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorMaestroClienteViewModel#getOwnedByContenedorCrudClienteViewModel <em>Owned By Contenedor Crud Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor Crud Cliente View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorMaestroClienteViewModel#getOwnedByContenedorCrudClienteViewModel()
	 * @see #getContenedorMaestroClienteViewModel()
	 * @generated
	 */
	EReference getContenedorMaestroClienteViewModel_OwnedByContenedorCrudClienteViewModel();

	/**
	 * Returns the meta object for the containment reference list '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorMaestroClienteViewModel#getClienteViewModel <em>Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cliente View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorMaestroClienteViewModel#getClienteViewModel()
	 * @see #getContenedorMaestroClienteViewModel()
	 * @generated
	 */
	EReference getContenedorMaestroClienteViewModel_ClienteViewModel();

	/**
	 * Returns the meta object for the reference list '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorMaestroClienteViewModel#getTheClienteViewModel <em>The Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>The Cliente View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorMaestroClienteViewModel#getTheClienteViewModel()
	 * @see #getContenedorMaestroClienteViewModel()
	 * @generated
	 */
	EReference getContenedorMaestroClienteViewModel_TheClienteViewModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContenedorcrudclienteviewmodelFactory getContenedorcrudclienteviewmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ClienteViewModelImpl <em>Cliente View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ClienteViewModelImpl
		 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorcrudclienteviewmodelPackageImpl#getClienteViewModel()
		 * @generated
		 */
		EClass CLIENTE_VIEW_MODEL = eINSTANCE.getClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>Identificacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE_VIEW_MODEL__IDENTIFICACION = eINSTANCE.getClienteViewModel_Identificacion();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE_VIEW_MODEL__NOMBRE = eINSTANCE.getClienteViewModel_Nombre();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE_VIEW_MODEL__EMAIL = eINSTANCE.getClienteViewModel_Email();

		/**
		 * The meta object literal for the '<em><b>Edad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENTE_VIEW_MODEL__EDAD = eINSTANCE.getClienteViewModel_Edad();

		/**
		 * The meta object literal for the '<em><b>The0 Contenedor Maestro Cliente View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENTE_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL = eINSTANCE.getClienteViewModel_The0ContenedorMaestroClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Maestro Cliente View Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL = eINSTANCE.getClienteViewModel_TheContenedorMaestroClienteViewModel();

		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorCrudClienteViewModelImpl <em>Contenedor Crud Cliente View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorCrudClienteViewModelImpl
		 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorcrudclienteviewmodelPackageImpl#getContenedorCrudClienteViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL = eINSTANCE.getContenedorCrudClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By UI</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__OWNED_BY_UI = eINSTANCE.getContenedorCrudClienteViewModel_OwnedByUI();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Detalle Cliente View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL = eINSTANCE.getContenedorCrudClienteViewModel_TheContenedorDetalleClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Maestro Cliente View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL = eINSTANCE.getContenedorCrudClienteViewModel_TheContenedorMaestroClienteViewModel();

		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDatosPersonalesViewModelImpl <em>Contenedor Datos Personales View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDatosPersonalesViewModelImpl
		 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorcrudclienteviewmodelPackageImpl#getContenedorDatosPersonalesViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL = eINSTANCE.getContenedorDatosPersonalesViewModel();

		/**
		 * The meta object literal for the '<em><b>Cedula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__CEDULA = eINSTANCE.getContenedorDatosPersonalesViewModel_Cedula();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__NOMBRE = eINSTANCE.getContenedorDatosPersonalesViewModel_Nombre();

		/**
		 * The meta object literal for the '<em><b>Apellido</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__APELLIDO = eINSTANCE.getContenedorDatosPersonalesViewModel_Apellido();

		/**
		 * The meta object literal for the '<em><b>Edad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__EDAD = eINSTANCE.getContenedorDatosPersonalesViewModel_Edad();

		/**
		 * The meta object literal for the '<em><b>Correoelectronico</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__CORREOELECTRONICO = eINSTANCE.getContenedorDatosPersonalesViewModel_Correoelectronico();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor Detalle Cliente View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL = eINSTANCE.getContenedorDatosPersonalesViewModel_OwnedByContenedorDetalleClienteViewModel();

		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDatosdelacuentaViewModelImpl <em>Contenedor Datosdelacuenta View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDatosdelacuentaViewModelImpl
		 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorcrudclienteviewmodelPackageImpl#getContenedorDatosdelacuentaViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL = eINSTANCE.getContenedorDatosdelacuentaViewModel();

		/**
		 * The meta object literal for the '<em><b>Usuario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__USUARIO = eINSTANCE.getContenedorDatosdelacuentaViewModel_Usuario();

		/**
		 * The meta object literal for the '<em><b>Contraseña</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__CONTRASEÑA = eINSTANCE.getContenedorDatosdelacuentaViewModel_Contraseña();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor Detalle Cliente View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL = eINSTANCE.getContenedorDatosdelacuentaViewModel_OwnedByContenedorDetalleClienteViewModel();

		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDetalleClienteViewModelImpl <em>Contenedor Detalle Cliente View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorDetalleClienteViewModelImpl
		 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorcrudclienteviewmodelPackageImpl#getContenedorDetalleClienteViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL = eINSTANCE.getContenedorDetalleClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor Crud Cliente View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL = eINSTANCE.getContenedorDetalleClienteViewModel_OwnedByContenedorCrudClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Datos Personales View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOS_PERSONALES_VIEW_MODEL = eINSTANCE.getContenedorDetalleClienteViewModel_TheContenedorDatosPersonalesViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Datosdelacuenta View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__THE_CONTENEDOR_DATOSDELACUENTA_VIEW_MODEL = eINSTANCE.getContenedorDetalleClienteViewModel_TheContenedorDatosdelacuentaViewModel();

		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorMaestroClienteViewModelImpl <em>Contenedor Maestro Cliente View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorMaestroClienteViewModelImpl
		 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.impl.ContenedorcrudclienteviewmodelPackageImpl#getContenedorMaestroClienteViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL = eINSTANCE.getContenedorMaestroClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor Crud Cliente View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL = eINSTANCE.getContenedorMaestroClienteViewModel_OwnedByContenedorCrudClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>Cliente View Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__CLIENTE_VIEW_MODEL = eINSTANCE.getContenedorMaestroClienteViewModel_ClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>The Cliente View Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL = eINSTANCE.getContenedorMaestroClienteViewModel_TheClienteViewModel();

	}

} //ContenedorcrudclienteviewmodelPackage
