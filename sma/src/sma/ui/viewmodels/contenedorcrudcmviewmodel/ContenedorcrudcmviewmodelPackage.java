/**
 */
package sma.ui.viewmodels.contenedorcrudcmviewmodel;

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
 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelFactory
 * @model kind="package"
 * @generated
 */
public interface ContenedorcrudcmviewmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contenedorcrudcmviewmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///sma/ui/viewmodels/contenedorcrudcmviewmodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sma.ui.viewmodels.contenedorcrudcmviewmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContenedorcrudcmviewmodelPackage eINSTANCE = sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorcrudcmviewmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.CentroMantViewModelImpl <em>Centro Mant View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.CentroMantViewModelImpl
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorcrudcmviewmodelPackageImpl#getCentroMantViewModel()
	 * @generated
	 */
	int CENTRO_MANT_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Nombrecm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRO_MANT_VIEW_MODEL__NOMBRECM = 0;

	/**
	 * The feature id for the '<em><b>Nombrerepresentante</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRO_MANT_VIEW_MODEL__NOMBREREPRESENTANTE = 1;

	/**
	 * The feature id for the '<em><b>Ciudad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRO_MANT_VIEW_MODEL__CIUDAD = 2;

	/**
	 * The feature id for the '<em><b>The0 Contenedor Maestro CM View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRO_MANT_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CM_VIEW_MODEL = 3;

	/**
	 * The number of structural features of the '<em>Centro Mant View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRO_MANT_VIEW_MODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorCRUDCMViewModelImpl <em>Contenedor CRUDCM View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorCRUDCMViewModelImpl
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorcrudcmviewmodelPackageImpl#getContenedorCRUDCMViewModel()
	 * @generated
	 */
	int CONTENEDOR_CRUDCM_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Owned By UI</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUDCM_VIEW_MODEL__OWNED_BY_UI = 0;

	/**
	 * The feature id for the '<em><b>The Contenedor Detalle CM View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CM_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>The Contenedor Maestro CM View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CM_VIEW_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Contenedor CRUDCM View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CRUDCM_VIEW_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorDetalleCMViewModelImpl <em>Contenedor Detalle CM View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorDetalleCMViewModelImpl
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorcrudcmviewmodelPackageImpl#getContenedorDetalleCMViewModel()
	 * @generated
	 */
	int CONTENEDOR_DETALLE_CM_VIEW_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor CRUDCM View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>The Contenedor Informacion CM View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_CM_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>The Contenedor Ubicacion View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACION_VIEW_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Contenedor Detalle CM View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_CM_VIEW_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorInformacionCMViewModelImpl <em>Contenedor Informacion CM View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorInformacionCMViewModelImpl
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorcrudcmviewmodelPackageImpl#getContenedorInformacionCMViewModel()
	 * @generated
	 */
	int CONTENEDOR_INFORMACION_CM_VIEW_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor Detalle CM View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACION_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Nombrecm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACION_CM_VIEW_MODEL__NOMBRECM = 1;

	/**
	 * The feature id for the '<em><b>Nombrerepresentante</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACION_CM_VIEW_MODEL__NOMBREREPRESENTANTE = 2;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACION_CM_VIEW_MODEL__DESCRIPCION = 3;

	/**
	 * The number of structural features of the '<em>Contenedor Informacion CM View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACION_CM_VIEW_MODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorMaestroCMViewModelImpl <em>Contenedor Maestro CM View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorMaestroCMViewModelImpl
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorcrudcmviewmodelPackageImpl#getContenedorMaestroCMViewModel()
	 * @generated
	 */
	int CONTENEDOR_MAESTRO_CM_VIEW_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor CRUDCM View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Centro Mant View Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_CM_VIEW_MODEL__CENTRO_MANT_VIEW_MODEL = 1;

	/**
	 * The number of structural features of the '<em>Contenedor Maestro CM View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_MAESTRO_CM_VIEW_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorUbicacionViewModelImpl <em>Contenedor Ubicacion View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorUbicacionViewModelImpl
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorcrudcmviewmodelPackageImpl#getContenedorUbicacionViewModel()
	 * @generated
	 */
	int CONTENEDOR_UBICACION_VIEW_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor Detalle CM View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_UBICACION_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_UBICACION_VIEW_MODEL__PAIS = 1;

	/**
	 * The feature id for the '<em><b>Departamento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_UBICACION_VIEW_MODEL__DEPARTAMENTO = 2;

	/**
	 * The feature id for the '<em><b>Ciudad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_UBICACION_VIEW_MODEL__CIUDAD = 3;

	/**
	 * The feature id for the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_UBICACION_VIEW_MODEL__DIRECCION = 4;

	/**
	 * The number of structural features of the '<em>Contenedor Ubicacion View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_UBICACION_VIEW_MODEL_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel <em>Centro Mant View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Centro Mant View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel
	 * @generated
	 */
	EClass getCentroMantViewModel();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel#getNombrecm <em>Nombrecm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombrecm</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel#getNombrecm()
	 * @see #getCentroMantViewModel()
	 * @generated
	 */
	EAttribute getCentroMantViewModel_Nombrecm();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel#getNombrerepresentante <em>Nombrerepresentante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombrerepresentante</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel#getNombrerepresentante()
	 * @see #getCentroMantViewModel()
	 * @generated
	 */
	EAttribute getCentroMantViewModel_Nombrerepresentante();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel#getCiudad <em>Ciudad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ciudad</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel#getCiudad()
	 * @see #getCentroMantViewModel()
	 * @generated
	 */
	EAttribute getCentroMantViewModel_Ciudad();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel#getThe0ContenedorMaestroCMViewModel <em>The0 Contenedor Maestro CM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The0 Contenedor Maestro CM View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel#getThe0ContenedorMaestroCMViewModel()
	 * @see #getCentroMantViewModel()
	 * @generated
	 */
	EReference getCentroMantViewModel_The0ContenedorMaestroCMViewModel();

	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel <em>Contenedor CRUDCM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor CRUDCM View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel
	 * @generated
	 */
	EClass getContenedorCRUDCMViewModel();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel#getOwnedByUI <em>Owned By UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By UI</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel#getOwnedByUI()
	 * @see #getContenedorCRUDCMViewModel()
	 * @generated
	 */
	EReference getContenedorCRUDCMViewModel_OwnedByUI();

	/**
	 * Returns the meta object for the containment reference '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel#getTheContenedorDetalleCMViewModel <em>The Contenedor Detalle CM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Detalle CM View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel#getTheContenedorDetalleCMViewModel()
	 * @see #getContenedorCRUDCMViewModel()
	 * @generated
	 */
	EReference getContenedorCRUDCMViewModel_TheContenedorDetalleCMViewModel();

	/**
	 * Returns the meta object for the containment reference '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel#getTheContenedorMaestroCMViewModel <em>The Contenedor Maestro CM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Maestro CM View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel#getTheContenedorMaestroCMViewModel()
	 * @see #getContenedorCRUDCMViewModel()
	 * @generated
	 */
	EReference getContenedorCRUDCMViewModel_TheContenedorMaestroCMViewModel();

	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel <em>Contenedor Detalle CM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Detalle CM View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel
	 * @generated
	 */
	EClass getContenedorDetalleCMViewModel();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel#getOwnedByContenedorCRUDCMViewModel <em>Owned By Contenedor CRUDCM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor CRUDCM View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel#getOwnedByContenedorCRUDCMViewModel()
	 * @see #getContenedorDetalleCMViewModel()
	 * @generated
	 */
	EReference getContenedorDetalleCMViewModel_OwnedByContenedorCRUDCMViewModel();

	/**
	 * Returns the meta object for the containment reference '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel#getTheContenedorInformacionCMViewModel <em>The Contenedor Informacion CM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Informacion CM View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel#getTheContenedorInformacionCMViewModel()
	 * @see #getContenedorDetalleCMViewModel()
	 * @generated
	 */
	EReference getContenedorDetalleCMViewModel_TheContenedorInformacionCMViewModel();

	/**
	 * Returns the meta object for the containment reference '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel#getTheContenedorUbicacionViewModel <em>The Contenedor Ubicacion View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Ubicacion View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel#getTheContenedorUbicacionViewModel()
	 * @see #getContenedorDetalleCMViewModel()
	 * @generated
	 */
	EReference getContenedorDetalleCMViewModel_TheContenedorUbicacionViewModel();

	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel <em>Contenedor Informacion CM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Informacion CM View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel
	 * @generated
	 */
	EClass getContenedorInformacionCMViewModel();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel#getOwnedByContenedorDetalleCMViewModel <em>Owned By Contenedor Detalle CM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor Detalle CM View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel#getOwnedByContenedorDetalleCMViewModel()
	 * @see #getContenedorInformacionCMViewModel()
	 * @generated
	 */
	EReference getContenedorInformacionCMViewModel_OwnedByContenedorDetalleCMViewModel();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel#getNombrecm <em>Nombrecm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombrecm</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel#getNombrecm()
	 * @see #getContenedorInformacionCMViewModel()
	 * @generated
	 */
	EAttribute getContenedorInformacionCMViewModel_Nombrecm();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel#getNombrerepresentante <em>Nombrerepresentante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombrerepresentante</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel#getNombrerepresentante()
	 * @see #getContenedorInformacionCMViewModel()
	 * @generated
	 */
	EAttribute getContenedorInformacionCMViewModel_Nombrerepresentante();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel#getDescripcion()
	 * @see #getContenedorInformacionCMViewModel()
	 * @generated
	 */
	EAttribute getContenedorInformacionCMViewModel_Descripcion();

	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorMaestroCMViewModel <em>Contenedor Maestro CM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Maestro CM View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorMaestroCMViewModel
	 * @generated
	 */
	EClass getContenedorMaestroCMViewModel();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorMaestroCMViewModel#getOwnedByContenedorCRUDCMViewModel <em>Owned By Contenedor CRUDCM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor CRUDCM View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorMaestroCMViewModel#getOwnedByContenedorCRUDCMViewModel()
	 * @see #getContenedorMaestroCMViewModel()
	 * @generated
	 */
	EReference getContenedorMaestroCMViewModel_OwnedByContenedorCRUDCMViewModel();

	/**
	 * Returns the meta object for the containment reference list '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorMaestroCMViewModel#getCentroMantViewModel <em>Centro Mant View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Centro Mant View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorMaestroCMViewModel#getCentroMantViewModel()
	 * @see #getContenedorMaestroCMViewModel()
	 * @generated
	 */
	EReference getContenedorMaestroCMViewModel_CentroMantViewModel();

	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel <em>Contenedor Ubicacion View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Ubicacion View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel
	 * @generated
	 */
	EClass getContenedorUbicacionViewModel();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel#getOwnedByContenedorDetalleCMViewModel <em>Owned By Contenedor Detalle CM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor Detalle CM View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel#getOwnedByContenedorDetalleCMViewModel()
	 * @see #getContenedorUbicacionViewModel()
	 * @generated
	 */
	EReference getContenedorUbicacionViewModel_OwnedByContenedorDetalleCMViewModel();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel#getPais <em>Pais</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pais</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel#getPais()
	 * @see #getContenedorUbicacionViewModel()
	 * @generated
	 */
	EAttribute getContenedorUbicacionViewModel_Pais();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel#getDepartamento <em>Departamento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Departamento</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel#getDepartamento()
	 * @see #getContenedorUbicacionViewModel()
	 * @generated
	 */
	EAttribute getContenedorUbicacionViewModel_Departamento();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel#getCiudad <em>Ciudad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ciudad</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel#getCiudad()
	 * @see #getContenedorUbicacionViewModel()
	 * @generated
	 */
	EAttribute getContenedorUbicacionViewModel_Ciudad();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel#getDireccion <em>Direccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direccion</em>'.
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorUbicacionViewModel#getDireccion()
	 * @see #getContenedorUbicacionViewModel()
	 * @generated
	 */
	EAttribute getContenedorUbicacionViewModel_Direccion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContenedorcrudcmviewmodelFactory getContenedorcrudcmviewmodelFactory();

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
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.CentroMantViewModelImpl <em>Centro Mant View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.CentroMantViewModelImpl
		 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorcrudcmviewmodelPackageImpl#getCentroMantViewModel()
		 * @generated
		 */
		EClass CENTRO_MANT_VIEW_MODEL = eINSTANCE.getCentroMantViewModel();

		/**
		 * The meta object literal for the '<em><b>Nombrecm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CENTRO_MANT_VIEW_MODEL__NOMBRECM = eINSTANCE.getCentroMantViewModel_Nombrecm();

		/**
		 * The meta object literal for the '<em><b>Nombrerepresentante</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CENTRO_MANT_VIEW_MODEL__NOMBREREPRESENTANTE = eINSTANCE.getCentroMantViewModel_Nombrerepresentante();

		/**
		 * The meta object literal for the '<em><b>Ciudad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CENTRO_MANT_VIEW_MODEL__CIUDAD = eINSTANCE.getCentroMantViewModel_Ciudad();

		/**
		 * The meta object literal for the '<em><b>The0 Contenedor Maestro CM View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CENTRO_MANT_VIEW_MODEL__THE0_CONTENEDOR_MAESTRO_CM_VIEW_MODEL = eINSTANCE.getCentroMantViewModel_The0ContenedorMaestroCMViewModel();

		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorCRUDCMViewModelImpl <em>Contenedor CRUDCM View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorCRUDCMViewModelImpl
		 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorcrudcmviewmodelPackageImpl#getContenedorCRUDCMViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_CRUDCM_VIEW_MODEL = eINSTANCE.getContenedorCRUDCMViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By UI</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_CRUDCM_VIEW_MODEL__OWNED_BY_UI = eINSTANCE.getContenedorCRUDCMViewModel_OwnedByUI();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Detalle CM View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_DETALLE_CM_VIEW_MODEL = eINSTANCE.getContenedorCRUDCMViewModel_TheContenedorDetalleCMViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Maestro CM View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_CRUDCM_VIEW_MODEL__THE_CONTENEDOR_MAESTRO_CM_VIEW_MODEL = eINSTANCE.getContenedorCRUDCMViewModel_TheContenedorMaestroCMViewModel();

		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorDetalleCMViewModelImpl <em>Contenedor Detalle CM View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorDetalleCMViewModelImpl
		 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorcrudcmviewmodelPackageImpl#getContenedorDetalleCMViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_DETALLE_CM_VIEW_MODEL = eINSTANCE.getContenedorDetalleCMViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor CRUDCM View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DETALLE_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL = eINSTANCE.getContenedorDetalleCMViewModel_OwnedByContenedorCRUDCMViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Informacion CM View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_CM_VIEW_MODEL = eINSTANCE.getContenedorDetalleCMViewModel_TheContenedorInformacionCMViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Ubicacion View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DETALLE_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACION_VIEW_MODEL = eINSTANCE.getContenedorDetalleCMViewModel_TheContenedorUbicacionViewModel();

		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorInformacionCMViewModelImpl <em>Contenedor Informacion CM View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorInformacionCMViewModelImpl
		 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorcrudcmviewmodelPackageImpl#getContenedorInformacionCMViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_INFORMACION_CM_VIEW_MODEL = eINSTANCE.getContenedorInformacionCMViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor Detalle CM View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_INFORMACION_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL = eINSTANCE.getContenedorInformacionCMViewModel_OwnedByContenedorDetalleCMViewModel();

		/**
		 * The meta object literal for the '<em><b>Nombrecm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_INFORMACION_CM_VIEW_MODEL__NOMBRECM = eINSTANCE.getContenedorInformacionCMViewModel_Nombrecm();

		/**
		 * The meta object literal for the '<em><b>Nombrerepresentante</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_INFORMACION_CM_VIEW_MODEL__NOMBREREPRESENTANTE = eINSTANCE.getContenedorInformacionCMViewModel_Nombrerepresentante();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_INFORMACION_CM_VIEW_MODEL__DESCRIPCION = eINSTANCE.getContenedorInformacionCMViewModel_Descripcion();

		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorMaestroCMViewModelImpl <em>Contenedor Maestro CM View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorMaestroCMViewModelImpl
		 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorcrudcmviewmodelPackageImpl#getContenedorMaestroCMViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_MAESTRO_CM_VIEW_MODEL = eINSTANCE.getContenedorMaestroCMViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor CRUDCM View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_MAESTRO_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CRUDCM_VIEW_MODEL = eINSTANCE.getContenedorMaestroCMViewModel_OwnedByContenedorCRUDCMViewModel();

		/**
		 * The meta object literal for the '<em><b>Centro Mant View Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_MAESTRO_CM_VIEW_MODEL__CENTRO_MANT_VIEW_MODEL = eINSTANCE.getContenedorMaestroCMViewModel_CentroMantViewModel();

		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorUbicacionViewModelImpl <em>Contenedor Ubicacion View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorUbicacionViewModelImpl
		 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorcrudcmviewmodelPackageImpl#getContenedorUbicacionViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_UBICACION_VIEW_MODEL = eINSTANCE.getContenedorUbicacionViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor Detalle CM View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_UBICACION_VIEW_MODEL__OWNED_BY_CONTENEDOR_DETALLE_CM_VIEW_MODEL = eINSTANCE.getContenedorUbicacionViewModel_OwnedByContenedorDetalleCMViewModel();

		/**
		 * The meta object literal for the '<em><b>Pais</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_UBICACION_VIEW_MODEL__PAIS = eINSTANCE.getContenedorUbicacionViewModel_Pais();

		/**
		 * The meta object literal for the '<em><b>Departamento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_UBICACION_VIEW_MODEL__DEPARTAMENTO = eINSTANCE.getContenedorUbicacionViewModel_Departamento();

		/**
		 * The meta object literal for the '<em><b>Ciudad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_UBICACION_VIEW_MODEL__CIUDAD = eINSTANCE.getContenedorUbicacionViewModel_Ciudad();

		/**
		 * The meta object literal for the '<em><b>Direccion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_UBICACION_VIEW_MODEL__DIRECCION = eINSTANCE.getContenedorUbicacionViewModel_Direccion();

	}

} //ContenedorcrudcmviewmodelPackage
