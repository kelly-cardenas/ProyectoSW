/**
 */
package sma.domain;

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
 * @see sma.domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///sma/domain.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sma.domain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainPackage eINSTANCE = sma.domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link sma.domain.impl.AutomovilImpl <em>Automovil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.domain.impl.AutomovilImpl
	 * @see sma.domain.impl.DomainPackageImpl#getAutomovil()
	 * @generated
	 */
	int AUTOMOVIL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOVIL__ID = 0;

	/**
	 * The feature id for the '<em><b>Placa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOVIL__PLACA = 1;

	/**
	 * The feature id for the '<em><b>Marca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOVIL__MARCA = 2;

	/**
	 * The feature id for the '<em><b>Modelo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOVIL__MODELO = 3;

	/**
	 * The feature id for the '<em><b>Referencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOVIL__REFERENCIA = 4;

	/**
	 * The feature id for the '<em><b>Tipo Uso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOVIL__TIPO_USO = 5;

	/**
	 * The feature id for the '<em><b>Reparaciones Hechas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOVIL__REPARACIONES_HECHAS = 6;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOVIL__SENSOR = 7;

	/**
	 * The feature id for the '<em><b>Propietario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOVIL__PROPIETARIO = 8;

	/**
	 * The feature id for the '<em><b>Lista De Fallas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOVIL__LISTA_DE_FALLAS = 9;

	/**
	 * The number of structural features of the '<em>Automovil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOVIL_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link sma.domain.impl.CentroMantImpl <em>Centro Mant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.domain.impl.CentroMantImpl
	 * @see sma.domain.impl.DomainPackageImpl#getCentroMant()
	 * @generated
	 */
	int CENTRO_MANT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRO_MANT__ID = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRO_MANT__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Nombre Representante</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRO_MANT__NOMBRE_REPRESENTANTE = 2;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRO_MANT__DESCRIPCION = 3;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRO_MANT__USUARIO = 4;

	/**
	 * The feature id for the '<em><b>Contrasenia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRO_MANT__CONTRASENIA = 5;

	/**
	 * The feature id for the '<em><b>Incremental Reparacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRO_MANT__INCREMENTAL_REPARACION = 6;

	/**
	 * The feature id for the '<em><b>Usuarios Atendidos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRO_MANT__USUARIOS_ATENDIDOS = 7;

	/**
	 * The feature id for the '<em><b>Historial Reparacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRO_MANT__HISTORIAL_REPARACION = 8;

	/**
	 * The feature id for the '<em><b>Owned By Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRO_MANT__OWNED_BY_DOMAIN = 9;

	/**
	 * The feature id for the '<em><b>Ubicacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRO_MANT__UBICACION = 10;

	/**
	 * The number of structural features of the '<em>Centro Mant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRO_MANT_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link sma.domain.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.domain.impl.DomainImpl
	 * @see sma.domain.impl.DomainPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 2;

	/**
	 * The feature id for the '<em><b>The Model Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Incremental Id Cliente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__INCREMENTAL_ID_CLIENTE = 1;

	/**
	 * The feature id for the '<em><b>Incremental Id Cm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__INCREMENTAL_ID_CM = 2;

	/**
	 * The feature id for the '<em><b>Incremental Id Auto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__INCREMENTAL_ID_AUTO = 3;

	/**
	 * The feature id for the '<em><b>Lista Automoviles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LISTA_AUTOMOVILES = 4;

	/**
	 * The feature id for the '<em><b>Lista De Cent Mant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LISTA_DE_CENT_MANT = 5;

	/**
	 * The feature id for the '<em><b>Lista Usuarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LISTA_USUARIOS = 6;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_UI = 7;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link sma.domain.impl.UbicacionCMImpl <em>Ubicacion CM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.domain.impl.UbicacionCMImpl
	 * @see sma.domain.impl.DomainPackageImpl#getUbicacionCM()
	 * @generated
	 */
	int UBICACION_CM = 3;

	/**
	 * The feature id for the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBICACION_CM__PAIS = 0;

	/**
	 * The feature id for the '<em><b>Departamento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBICACION_CM__DEPARTAMENTO = 1;

	/**
	 * The feature id for the '<em><b>Ciudad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBICACION_CM__CIUDAD = 2;

	/**
	 * The feature id for the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBICACION_CM__DIRECCION = 3;

	/**
	 * The feature id for the '<em><b>Owned By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBICACION_CM__OWNED_BY = 4;

	/**
	 * The number of structural features of the '<em>Ubicacion CM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBICACION_CM_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link sma.domain.impl.UbicacionUsuImpl <em>Ubicacion Usu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.domain.impl.UbicacionUsuImpl
	 * @see sma.domain.impl.DomainPackageImpl#getUbicacionUsu()
	 * @generated
	 */
	int UBICACION_USU = 4;

	/**
	 * The feature id for the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBICACION_USU__PAIS = 0;

	/**
	 * The feature id for the '<em><b>Departamento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBICACION_USU__DEPARTAMENTO = 1;

	/**
	 * The feature id for the '<em><b>Ciudad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBICACION_USU__CIUDAD = 2;

	/**
	 * The feature id for the '<em><b>Owner By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBICACION_USU__OWNER_BY = 3;

	/**
	 * The number of structural features of the '<em>Ubicacion Usu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBICACION_USU_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link sma.domain.impl.UsuarioImpl <em>Usuario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.domain.impl.UsuarioImpl
	 * @see sma.domain.impl.DomainPackageImpl#getUsuario()
	 * @generated
	 */
	int USUARIO = 5;

	/**
	 * The feature id for the '<em><b>Centro Mant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CENTRO_MANT = 0;

	/**
	 * The feature id for the '<em><b>Owner By Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__OWNER_BY_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ID = 2;

	/**
	 * The feature id for the '<em><b>Num DI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__NUM_DI = 3;

	/**
	 * The feature id for the '<em><b>Nombres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__NOMBRES = 4;

	/**
	 * The feature id for the '<em><b>Apellidos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__APELLIDOS = 5;

	/**
	 * The feature id for the '<em><b>Edad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__EDAD = 6;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__EMAIL = 7;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__USUARIO = 8;

	/**
	 * The feature id for the '<em><b>Contrasenia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CONTRASENIA = 9;

	/**
	 * The feature id for the '<em><b>Automoviles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__AUTOMOVILES = 10;

	/**
	 * The feature id for the '<em><b>Ubicacion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__UBICACION = 11;

	/**
	 * The number of structural features of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_FEATURE_COUNT = 12;


	/**
	 * Returns the meta object for class '{@link sma.domain.Automovil <em>Automovil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automovil</em>'.
	 * @see sma.domain.Automovil
	 * @generated
	 */
	EClass getAutomovil();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.Automovil#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sma.domain.Automovil#getId()
	 * @see #getAutomovil()
	 * @generated
	 */
	EAttribute getAutomovil_Id();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.Automovil#getPlaca <em>Placa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placa</em>'.
	 * @see sma.domain.Automovil#getPlaca()
	 * @see #getAutomovil()
	 * @generated
	 */
	EAttribute getAutomovil_Placa();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.Automovil#getMarca <em>Marca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marca</em>'.
	 * @see sma.domain.Automovil#getMarca()
	 * @see #getAutomovil()
	 * @generated
	 */
	EAttribute getAutomovil_Marca();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.Automovil#getModelo <em>Modelo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modelo</em>'.
	 * @see sma.domain.Automovil#getModelo()
	 * @see #getAutomovil()
	 * @generated
	 */
	EAttribute getAutomovil_Modelo();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.Automovil#getReferencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referencia</em>'.
	 * @see sma.domain.Automovil#getReferencia()
	 * @see #getAutomovil()
	 * @generated
	 */
	EAttribute getAutomovil_Referencia();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.Automovil#getTipoUso <em>Tipo Uso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Uso</em>'.
	 * @see sma.domain.Automovil#getTipoUso()
	 * @see #getAutomovil()
	 * @generated
	 */
	EAttribute getAutomovil_TipoUso();

	/**
	 * Returns the meta object for the reference list '{@link sma.domain.Automovil#getReparacionesHechas <em>Reparaciones Hechas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reparaciones Hechas</em>'.
	 * @see sma.domain.Automovil#getReparacionesHechas()
	 * @see #getAutomovil()
	 * @generated
	 */
	EReference getAutomovil_ReparacionesHechas();

	/**
	 * Returns the meta object for the containment reference '{@link sma.domain.Automovil#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sensor</em>'.
	 * @see sma.domain.Automovil#getSensor()
	 * @see #getAutomovil()
	 * @generated
	 */
	EReference getAutomovil_Sensor();

	/**
	 * Returns the meta object for the reference '{@link sma.domain.Automovil#getPropietario <em>Propietario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Propietario</em>'.
	 * @see sma.domain.Automovil#getPropietario()
	 * @see #getAutomovil()
	 * @generated
	 */
	EReference getAutomovil_Propietario();

	/**
	 * Returns the meta object for the containment reference list '{@link sma.domain.Automovil#getListaDeFallas <em>Lista De Fallas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista De Fallas</em>'.
	 * @see sma.domain.Automovil#getListaDeFallas()
	 * @see #getAutomovil()
	 * @generated
	 */
	EReference getAutomovil_ListaDeFallas();

	/**
	 * Returns the meta object for class '{@link sma.domain.CentroMant <em>Centro Mant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Centro Mant</em>'.
	 * @see sma.domain.CentroMant
	 * @generated
	 */
	EClass getCentroMant();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.CentroMant#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sma.domain.CentroMant#getId()
	 * @see #getCentroMant()
	 * @generated
	 */
	EAttribute getCentroMant_Id();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.CentroMant#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see sma.domain.CentroMant#getNombre()
	 * @see #getCentroMant()
	 * @generated
	 */
	EAttribute getCentroMant_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.CentroMant#getNombreRepresentante <em>Nombre Representante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Representante</em>'.
	 * @see sma.domain.CentroMant#getNombreRepresentante()
	 * @see #getCentroMant()
	 * @generated
	 */
	EAttribute getCentroMant_NombreRepresentante();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.CentroMant#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see sma.domain.CentroMant#getDescripcion()
	 * @see #getCentroMant()
	 * @generated
	 */
	EAttribute getCentroMant_Descripcion();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.CentroMant#getUsuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usuario</em>'.
	 * @see sma.domain.CentroMant#getUsuario()
	 * @see #getCentroMant()
	 * @generated
	 */
	EAttribute getCentroMant_Usuario();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.CentroMant#getContrasenia <em>Contrasenia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contrasenia</em>'.
	 * @see sma.domain.CentroMant#getContrasenia()
	 * @see #getCentroMant()
	 * @generated
	 */
	EAttribute getCentroMant_Contrasenia();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.CentroMant#getIncrementalReparacion <em>Incremental Reparacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incremental Reparacion</em>'.
	 * @see sma.domain.CentroMant#getIncrementalReparacion()
	 * @see #getCentroMant()
	 * @generated
	 */
	EAttribute getCentroMant_IncrementalReparacion();

	/**
	 * Returns the meta object for the reference list '{@link sma.domain.CentroMant#getUsuariosAtendidos <em>Usuarios Atendidos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usuarios Atendidos</em>'.
	 * @see sma.domain.CentroMant#getUsuariosAtendidos()
	 * @see #getCentroMant()
	 * @generated
	 */
	EReference getCentroMant_UsuariosAtendidos();

	/**
	 * Returns the meta object for the containment reference list '{@link sma.domain.CentroMant#getHistorialReparacion <em>Historial Reparacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Historial Reparacion</em>'.
	 * @see sma.domain.CentroMant#getHistorialReparacion()
	 * @see #getCentroMant()
	 * @generated
	 */
	EReference getCentroMant_HistorialReparacion();

	/**
	 * Returns the meta object for the container reference '{@link sma.domain.CentroMant#getOwnedByDomain <em>Owned By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Domain</em>'.
	 * @see sma.domain.CentroMant#getOwnedByDomain()
	 * @see #getCentroMant()
	 * @generated
	 */
	EReference getCentroMant_OwnedByDomain();

	/**
	 * Returns the meta object for the containment reference '{@link sma.domain.CentroMant#getUbicacion <em>Ubicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ubicacion</em>'.
	 * @see sma.domain.CentroMant#getUbicacion()
	 * @see #getCentroMant()
	 * @generated
	 */
	EReference getCentroMant_Ubicacion();

	/**
	 * Returns the meta object for class '{@link sma.domain.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see sma.domain.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the container reference '{@link sma.domain.Domain#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Model Factory</em>'.
	 * @see sma.domain.Domain#getTheModelFactory()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheModelFactory();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.Domain#getIncrementalIdCliente <em>Incremental Id Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incremental Id Cliente</em>'.
	 * @see sma.domain.Domain#getIncrementalIdCliente()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_IncrementalIdCliente();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.Domain#getIncrementalIdCm <em>Incremental Id Cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incremental Id Cm</em>'.
	 * @see sma.domain.Domain#getIncrementalIdCm()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_IncrementalIdCm();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.Domain#getIncrementalIdAuto <em>Incremental Id Auto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incremental Id Auto</em>'.
	 * @see sma.domain.Domain#getIncrementalIdAuto()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_IncrementalIdAuto();

	/**
	 * Returns the meta object for the containment reference list '{@link sma.domain.Domain#getListaAutomoviles <em>Lista Automoviles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Automoviles</em>'.
	 * @see sma.domain.Domain#getListaAutomoviles()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_ListaAutomoviles();

	/**
	 * Returns the meta object for the containment reference list '{@link sma.domain.Domain#getListaDeCentMant <em>Lista De Cent Mant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista De Cent Mant</em>'.
	 * @see sma.domain.Domain#getListaDeCentMant()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_ListaDeCentMant();

	/**
	 * Returns the meta object for the containment reference list '{@link sma.domain.Domain#getListaUsuarios <em>Lista Usuarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Usuarios</em>'.
	 * @see sma.domain.Domain#getListaUsuarios()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_ListaUsuarios();

	/**
	 * Returns the meta object for the reference '{@link sma.domain.Domain#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The UI</em>'.
	 * @see sma.domain.Domain#getTheUI()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheUI();

	/**
	 * Returns the meta object for class '{@link sma.domain.UbicacionCM <em>Ubicacion CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubicacion CM</em>'.
	 * @see sma.domain.UbicacionCM
	 * @generated
	 */
	EClass getUbicacionCM();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.UbicacionCM#getPais <em>Pais</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pais</em>'.
	 * @see sma.domain.UbicacionCM#getPais()
	 * @see #getUbicacionCM()
	 * @generated
	 */
	EAttribute getUbicacionCM_Pais();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.UbicacionCM#getDepartamento <em>Departamento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Departamento</em>'.
	 * @see sma.domain.UbicacionCM#getDepartamento()
	 * @see #getUbicacionCM()
	 * @generated
	 */
	EAttribute getUbicacionCM_Departamento();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.UbicacionCM#getCiudad <em>Ciudad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ciudad</em>'.
	 * @see sma.domain.UbicacionCM#getCiudad()
	 * @see #getUbicacionCM()
	 * @generated
	 */
	EAttribute getUbicacionCM_Ciudad();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.UbicacionCM#getDireccion <em>Direccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direccion</em>'.
	 * @see sma.domain.UbicacionCM#getDireccion()
	 * @see #getUbicacionCM()
	 * @generated
	 */
	EAttribute getUbicacionCM_Direccion();

	/**
	 * Returns the meta object for the container reference '{@link sma.domain.UbicacionCM#getOwnedBy <em>Owned By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By</em>'.
	 * @see sma.domain.UbicacionCM#getOwnedBy()
	 * @see #getUbicacionCM()
	 * @generated
	 */
	EReference getUbicacionCM_OwnedBy();

	/**
	 * Returns the meta object for class '{@link sma.domain.UbicacionUsu <em>Ubicacion Usu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubicacion Usu</em>'.
	 * @see sma.domain.UbicacionUsu
	 * @generated
	 */
	EClass getUbicacionUsu();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.UbicacionUsu#getPais <em>Pais</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pais</em>'.
	 * @see sma.domain.UbicacionUsu#getPais()
	 * @see #getUbicacionUsu()
	 * @generated
	 */
	EAttribute getUbicacionUsu_Pais();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.UbicacionUsu#getDepartamento <em>Departamento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Departamento</em>'.
	 * @see sma.domain.UbicacionUsu#getDepartamento()
	 * @see #getUbicacionUsu()
	 * @generated
	 */
	EAttribute getUbicacionUsu_Departamento();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.UbicacionUsu#getCiudad <em>Ciudad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ciudad</em>'.
	 * @see sma.domain.UbicacionUsu#getCiudad()
	 * @see #getUbicacionUsu()
	 * @generated
	 */
	EAttribute getUbicacionUsu_Ciudad();

	/**
	 * Returns the meta object for the container reference '{@link sma.domain.UbicacionUsu#getOwnerBy <em>Owner By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner By</em>'.
	 * @see sma.domain.UbicacionUsu#getOwnerBy()
	 * @see #getUbicacionUsu()
	 * @generated
	 */
	EReference getUbicacionUsu_OwnerBy();

	/**
	 * Returns the meta object for class '{@link sma.domain.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usuario</em>'.
	 * @see sma.domain.Usuario
	 * @generated
	 */
	EClass getUsuario();

	/**
	 * Returns the meta object for the reference '{@link sma.domain.Usuario#getCentroMant <em>Centro Mant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Centro Mant</em>'.
	 * @see sma.domain.Usuario#getCentroMant()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_CentroMant();

	/**
	 * Returns the meta object for the container reference '{@link sma.domain.Usuario#getOwnerByDomain <em>Owner By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner By Domain</em>'.
	 * @see sma.domain.Usuario#getOwnerByDomain()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_OwnerByDomain();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.Usuario#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sma.domain.Usuario#getId()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Id();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.Usuario#getNumDI <em>Num DI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num DI</em>'.
	 * @see sma.domain.Usuario#getNumDI()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_NumDI();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.Usuario#getNombres <em>Nombres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombres</em>'.
	 * @see sma.domain.Usuario#getNombres()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Nombres();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.Usuario#getApellidos <em>Apellidos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apellidos</em>'.
	 * @see sma.domain.Usuario#getApellidos()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Apellidos();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.Usuario#getEdad <em>Edad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edad</em>'.
	 * @see sma.domain.Usuario#getEdad()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Edad();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.Usuario#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see sma.domain.Usuario#getEmail()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Email();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.Usuario#getUsuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usuario</em>'.
	 * @see sma.domain.Usuario#getUsuario()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Usuario();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.Usuario#getContrasenia <em>Contrasenia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contrasenia</em>'.
	 * @see sma.domain.Usuario#getContrasenia()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Contrasenia();

	/**
	 * Returns the meta object for the reference list '{@link sma.domain.Usuario#getAutomoviles <em>Automoviles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Automoviles</em>'.
	 * @see sma.domain.Usuario#getAutomoviles()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_Automoviles();

	/**
	 * Returns the meta object for the containment reference '{@link sma.domain.Usuario#getUbicacion <em>Ubicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ubicacion</em>'.
	 * @see sma.domain.Usuario#getUbicacion()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_Ubicacion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainFactory getDomainFactory();

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
		 * The meta object literal for the '{@link sma.domain.impl.AutomovilImpl <em>Automovil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.domain.impl.AutomovilImpl
		 * @see sma.domain.impl.DomainPackageImpl#getAutomovil()
		 * @generated
		 */
		EClass AUTOMOVIL = eINSTANCE.getAutomovil();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMOVIL__ID = eINSTANCE.getAutomovil_Id();

		/**
		 * The meta object literal for the '<em><b>Placa</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMOVIL__PLACA = eINSTANCE.getAutomovil_Placa();

		/**
		 * The meta object literal for the '<em><b>Marca</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMOVIL__MARCA = eINSTANCE.getAutomovil_Marca();

		/**
		 * The meta object literal for the '<em><b>Modelo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMOVIL__MODELO = eINSTANCE.getAutomovil_Modelo();

		/**
		 * The meta object literal for the '<em><b>Referencia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMOVIL__REFERENCIA = eINSTANCE.getAutomovil_Referencia();

		/**
		 * The meta object literal for the '<em><b>Tipo Uso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMOVIL__TIPO_USO = eINSTANCE.getAutomovil_TipoUso();

		/**
		 * The meta object literal for the '<em><b>Reparaciones Hechas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMOVIL__REPARACIONES_HECHAS = eINSTANCE.getAutomovil_ReparacionesHechas();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMOVIL__SENSOR = eINSTANCE.getAutomovil_Sensor();

		/**
		 * The meta object literal for the '<em><b>Propietario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMOVIL__PROPIETARIO = eINSTANCE.getAutomovil_Propietario();

		/**
		 * The meta object literal for the '<em><b>Lista De Fallas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMOVIL__LISTA_DE_FALLAS = eINSTANCE.getAutomovil_ListaDeFallas();

		/**
		 * The meta object literal for the '{@link sma.domain.impl.CentroMantImpl <em>Centro Mant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.domain.impl.CentroMantImpl
		 * @see sma.domain.impl.DomainPackageImpl#getCentroMant()
		 * @generated
		 */
		EClass CENTRO_MANT = eINSTANCE.getCentroMant();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CENTRO_MANT__ID = eINSTANCE.getCentroMant_Id();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CENTRO_MANT__NOMBRE = eINSTANCE.getCentroMant_Nombre();

		/**
		 * The meta object literal for the '<em><b>Nombre Representante</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CENTRO_MANT__NOMBRE_REPRESENTANTE = eINSTANCE.getCentroMant_NombreRepresentante();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CENTRO_MANT__DESCRIPCION = eINSTANCE.getCentroMant_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Usuario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CENTRO_MANT__USUARIO = eINSTANCE.getCentroMant_Usuario();

		/**
		 * The meta object literal for the '<em><b>Contrasenia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CENTRO_MANT__CONTRASENIA = eINSTANCE.getCentroMant_Contrasenia();

		/**
		 * The meta object literal for the '<em><b>Incremental Reparacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CENTRO_MANT__INCREMENTAL_REPARACION = eINSTANCE.getCentroMant_IncrementalReparacion();

		/**
		 * The meta object literal for the '<em><b>Usuarios Atendidos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CENTRO_MANT__USUARIOS_ATENDIDOS = eINSTANCE.getCentroMant_UsuariosAtendidos();

		/**
		 * The meta object literal for the '<em><b>Historial Reparacion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CENTRO_MANT__HISTORIAL_REPARACION = eINSTANCE.getCentroMant_HistorialReparacion();

		/**
		 * The meta object literal for the '<em><b>Owned By Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CENTRO_MANT__OWNED_BY_DOMAIN = eINSTANCE.getCentroMant_OwnedByDomain();

		/**
		 * The meta object literal for the '<em><b>Ubicacion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CENTRO_MANT__UBICACION = eINSTANCE.getCentroMant_Ubicacion();

		/**
		 * The meta object literal for the '{@link sma.domain.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.domain.impl.DomainImpl
		 * @see sma.domain.impl.DomainPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>The Model Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_MODEL_FACTORY = eINSTANCE.getDomain_TheModelFactory();

		/**
		 * The meta object literal for the '<em><b>Incremental Id Cliente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__INCREMENTAL_ID_CLIENTE = eINSTANCE.getDomain_IncrementalIdCliente();

		/**
		 * The meta object literal for the '<em><b>Incremental Id Cm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__INCREMENTAL_ID_CM = eINSTANCE.getDomain_IncrementalIdCm();

		/**
		 * The meta object literal for the '<em><b>Incremental Id Auto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__INCREMENTAL_ID_AUTO = eINSTANCE.getDomain_IncrementalIdAuto();

		/**
		 * The meta object literal for the '<em><b>Lista Automoviles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LISTA_AUTOMOVILES = eINSTANCE.getDomain_ListaAutomoviles();

		/**
		 * The meta object literal for the '<em><b>Lista De Cent Mant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LISTA_DE_CENT_MANT = eINSTANCE.getDomain_ListaDeCentMant();

		/**
		 * The meta object literal for the '<em><b>Lista Usuarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LISTA_USUARIOS = eINSTANCE.getDomain_ListaUsuarios();

		/**
		 * The meta object literal for the '<em><b>The UI</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_UI = eINSTANCE.getDomain_TheUI();

		/**
		 * The meta object literal for the '{@link sma.domain.impl.UbicacionCMImpl <em>Ubicacion CM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.domain.impl.UbicacionCMImpl
		 * @see sma.domain.impl.DomainPackageImpl#getUbicacionCM()
		 * @generated
		 */
		EClass UBICACION_CM = eINSTANCE.getUbicacionCM();

		/**
		 * The meta object literal for the '<em><b>Pais</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBICACION_CM__PAIS = eINSTANCE.getUbicacionCM_Pais();

		/**
		 * The meta object literal for the '<em><b>Departamento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBICACION_CM__DEPARTAMENTO = eINSTANCE.getUbicacionCM_Departamento();

		/**
		 * The meta object literal for the '<em><b>Ciudad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBICACION_CM__CIUDAD = eINSTANCE.getUbicacionCM_Ciudad();

		/**
		 * The meta object literal for the '<em><b>Direccion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBICACION_CM__DIRECCION = eINSTANCE.getUbicacionCM_Direccion();

		/**
		 * The meta object literal for the '<em><b>Owned By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBICACION_CM__OWNED_BY = eINSTANCE.getUbicacionCM_OwnedBy();

		/**
		 * The meta object literal for the '{@link sma.domain.impl.UbicacionUsuImpl <em>Ubicacion Usu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.domain.impl.UbicacionUsuImpl
		 * @see sma.domain.impl.DomainPackageImpl#getUbicacionUsu()
		 * @generated
		 */
		EClass UBICACION_USU = eINSTANCE.getUbicacionUsu();

		/**
		 * The meta object literal for the '<em><b>Pais</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBICACION_USU__PAIS = eINSTANCE.getUbicacionUsu_Pais();

		/**
		 * The meta object literal for the '<em><b>Departamento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBICACION_USU__DEPARTAMENTO = eINSTANCE.getUbicacionUsu_Departamento();

		/**
		 * The meta object literal for the '<em><b>Ciudad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UBICACION_USU__CIUDAD = eINSTANCE.getUbicacionUsu_Ciudad();

		/**
		 * The meta object literal for the '<em><b>Owner By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBICACION_USU__OWNER_BY = eINSTANCE.getUbicacionUsu_OwnerBy();

		/**
		 * The meta object literal for the '{@link sma.domain.impl.UsuarioImpl <em>Usuario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.domain.impl.UsuarioImpl
		 * @see sma.domain.impl.DomainPackageImpl#getUsuario()
		 * @generated
		 */
		EClass USUARIO = eINSTANCE.getUsuario();

		/**
		 * The meta object literal for the '<em><b>Centro Mant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__CENTRO_MANT = eINSTANCE.getUsuario_CentroMant();

		/**
		 * The meta object literal for the '<em><b>Owner By Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__OWNER_BY_DOMAIN = eINSTANCE.getUsuario_OwnerByDomain();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__ID = eINSTANCE.getUsuario_Id();

		/**
		 * The meta object literal for the '<em><b>Num DI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__NUM_DI = eINSTANCE.getUsuario_NumDI();

		/**
		 * The meta object literal for the '<em><b>Nombres</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__NOMBRES = eINSTANCE.getUsuario_Nombres();

		/**
		 * The meta object literal for the '<em><b>Apellidos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__APELLIDOS = eINSTANCE.getUsuario_Apellidos();

		/**
		 * The meta object literal for the '<em><b>Edad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__EDAD = eINSTANCE.getUsuario_Edad();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__EMAIL = eINSTANCE.getUsuario_Email();

		/**
		 * The meta object literal for the '<em><b>Usuario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__USUARIO = eINSTANCE.getUsuario_Usuario();

		/**
		 * The meta object literal for the '<em><b>Contrasenia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__CONTRASENIA = eINSTANCE.getUsuario_Contrasenia();

		/**
		 * The meta object literal for the '<em><b>Automoviles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__AUTOMOVILES = eINSTANCE.getUsuario_Automoviles();

		/**
		 * The meta object literal for the '<em><b>Ubicacion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__UBICACION = eINSTANCE.getUsuario_Ubicacion();

	}

} //DomainPackage
