/**
 */
package sma.ui.viewmodels.contenedorregistrovehiculoviewmodel;

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
 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelFactory
 * @model kind="package"
 * @generated
 */
public interface ContenedorregistrovehiculoviewmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contenedorregistrovehiculoviewmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///sma/ui/viewmodels/contenedorregistrovehiculoviewmodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sma.ui.viewmodels.contenedorregistrovehiculoviewmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContenedorregistrovehiculoviewmodelPackage eINSTANCE = sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorregistrovehiculoviewmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorDetalleVehiculoViewModelImpl <em>Contenedor Detalle Vehiculo View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorDetalleVehiculoViewModelImpl
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorregistrovehiculoviewmodelPackageImpl#getContenedorDetalleVehiculoViewModel()
	 * @generated
	 */
	int CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Propietario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__PROPIETARIO = 0;

	/**
	 * The feature id for the '<em><b>Marca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__MARCA = 1;

	/**
	 * The feature id for the '<em><b>Referencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__REFERENCIA = 2;

	/**
	 * The feature id for the '<em><b>Modelo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__MODELO = 3;

	/**
	 * The feature id for the '<em><b>Tipovehiculo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__TIPOVEHICULO = 4;

	/**
	 * The feature id for the '<em><b>Placa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__PLACA = 5;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor Registro Vehiculo View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL = 6;

	/**
	 * The number of structural features of the '<em>Contenedor Detalle Vehiculo View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorRegistroVehiculoViewModelImpl <em>Contenedor Registro Vehiculo View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorRegistroVehiculoViewModelImpl
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorregistrovehiculoviewmodelPackageImpl#getContenedorRegistroVehiculoViewModel()
	 * @generated
	 */
	int CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Owned By UI</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__OWNED_BY_UI = 0;

	/**
	 * The feature id for the '<em><b>The Contenedor Detalle Vehiculo View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>The Contenedor Vehiculos Registrados View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Contenedor Registro Vehiculo View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorVehiculosRegistradosViewModelImpl <em>Contenedor Vehiculos Registrados View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorVehiculosRegistradosViewModelImpl
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorregistrovehiculoviewmodelPackageImpl#getContenedorVehiculosRegistradosViewModel()
	 * @generated
	 */
	int CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor Registro Vehiculo View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Vehiculo View Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__VEHICULO_VIEW_MODEL = 1;

	/**
	 * The number of structural features of the '<em>Contenedor Vehiculos Registrados View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.VehiculoViewModelImpl <em>Vehiculo View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.VehiculoViewModelImpl
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorregistrovehiculoviewmodelPackageImpl#getVehiculoViewModel()
	 * @generated
	 */
	int VEHICULO_VIEW_MODEL = 3;

	/**
	 * The feature id for the '<em><b>The0 Contenedor Vehiculos Registrados View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICULO_VIEW_MODEL__THE0_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Marca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICULO_VIEW_MODEL__MARCA = 1;

	/**
	 * The feature id for the '<em><b>Referencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICULO_VIEW_MODEL__REFERENCIA = 2;

	/**
	 * The feature id for the '<em><b>Placa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICULO_VIEW_MODEL__PLACA = 3;

	/**
	 * The number of structural features of the '<em>Vehiculo View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICULO_VIEW_MODEL_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel <em>Contenedor Detalle Vehiculo View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Detalle Vehiculo View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel
	 * @generated
	 */
	EClass getContenedorDetalleVehiculoViewModel();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel#getPropietario <em>Propietario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Propietario</em>'.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel#getPropietario()
	 * @see #getContenedorDetalleVehiculoViewModel()
	 * @generated
	 */
	EAttribute getContenedorDetalleVehiculoViewModel_Propietario();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel#getMarca <em>Marca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marca</em>'.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel#getMarca()
	 * @see #getContenedorDetalleVehiculoViewModel()
	 * @generated
	 */
	EAttribute getContenedorDetalleVehiculoViewModel_Marca();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel#getReferencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referencia</em>'.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel#getReferencia()
	 * @see #getContenedorDetalleVehiculoViewModel()
	 * @generated
	 */
	EAttribute getContenedorDetalleVehiculoViewModel_Referencia();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel#getModelo <em>Modelo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modelo</em>'.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel#getModelo()
	 * @see #getContenedorDetalleVehiculoViewModel()
	 * @generated
	 */
	EAttribute getContenedorDetalleVehiculoViewModel_Modelo();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel#getTipovehiculo <em>Tipovehiculo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipovehiculo</em>'.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel#getTipovehiculo()
	 * @see #getContenedorDetalleVehiculoViewModel()
	 * @generated
	 */
	EAttribute getContenedorDetalleVehiculoViewModel_Tipovehiculo();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel#getPlaca <em>Placa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placa</em>'.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel#getPlaca()
	 * @see #getContenedorDetalleVehiculoViewModel()
	 * @generated
	 */
	EAttribute getContenedorDetalleVehiculoViewModel_Placa();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel#getOwnedByContenedorRegistroVehiculoViewModel <em>Owned By Contenedor Registro Vehiculo View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor Registro Vehiculo View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel#getOwnedByContenedorRegistroVehiculoViewModel()
	 * @see #getContenedorDetalleVehiculoViewModel()
	 * @generated
	 */
	EReference getContenedorDetalleVehiculoViewModel_OwnedByContenedorRegistroVehiculoViewModel();

	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel <em>Contenedor Registro Vehiculo View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Registro Vehiculo View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel
	 * @generated
	 */
	EClass getContenedorRegistroVehiculoViewModel();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel#getOwnedByUI <em>Owned By UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By UI</em>'.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel#getOwnedByUI()
	 * @see #getContenedorRegistroVehiculoViewModel()
	 * @generated
	 */
	EReference getContenedorRegistroVehiculoViewModel_OwnedByUI();

	/**
	 * Returns the meta object for the containment reference '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel#getTheContenedorDetalleVehiculoViewModel <em>The Contenedor Detalle Vehiculo View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Detalle Vehiculo View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel#getTheContenedorDetalleVehiculoViewModel()
	 * @see #getContenedorRegistroVehiculoViewModel()
	 * @generated
	 */
	EReference getContenedorRegistroVehiculoViewModel_TheContenedorDetalleVehiculoViewModel();

	/**
	 * Returns the meta object for the containment reference '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel#getTheContenedorVehiculosRegistradosViewModel <em>The Contenedor Vehiculos Registrados View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Vehiculos Registrados View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel#getTheContenedorVehiculosRegistradosViewModel()
	 * @see #getContenedorRegistroVehiculoViewModel()
	 * @generated
	 */
	EReference getContenedorRegistroVehiculoViewModel_TheContenedorVehiculosRegistradosViewModel();

	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorVehiculosRegistradosViewModel <em>Contenedor Vehiculos Registrados View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Vehiculos Registrados View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorVehiculosRegistradosViewModel
	 * @generated
	 */
	EClass getContenedorVehiculosRegistradosViewModel();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorVehiculosRegistradosViewModel#getOwnedByContenedorRegistroVehiculoViewModel <em>Owned By Contenedor Registro Vehiculo View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor Registro Vehiculo View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorVehiculosRegistradosViewModel#getOwnedByContenedorRegistroVehiculoViewModel()
	 * @see #getContenedorVehiculosRegistradosViewModel()
	 * @generated
	 */
	EReference getContenedorVehiculosRegistradosViewModel_OwnedByContenedorRegistroVehiculoViewModel();

	/**
	 * Returns the meta object for the containment reference list '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorVehiculosRegistradosViewModel#getVehiculoViewModel <em>Vehiculo View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vehiculo View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorVehiculosRegistradosViewModel#getVehiculoViewModel()
	 * @see #getContenedorVehiculosRegistradosViewModel()
	 * @generated
	 */
	EReference getContenedorVehiculosRegistradosViewModel_VehiculoViewModel();

	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel <em>Vehiculo View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehiculo View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel
	 * @generated
	 */
	EClass getVehiculoViewModel();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel#getThe0ContenedorVehiculosRegistradosViewModel <em>The0 Contenedor Vehiculos Registrados View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The0 Contenedor Vehiculos Registrados View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel#getThe0ContenedorVehiculosRegistradosViewModel()
	 * @see #getVehiculoViewModel()
	 * @generated
	 */
	EReference getVehiculoViewModel_The0ContenedorVehiculosRegistradosViewModel();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel#getMarca <em>Marca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marca</em>'.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel#getMarca()
	 * @see #getVehiculoViewModel()
	 * @generated
	 */
	EAttribute getVehiculoViewModel_Marca();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel#getReferencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referencia</em>'.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel#getReferencia()
	 * @see #getVehiculoViewModel()
	 * @generated
	 */
	EAttribute getVehiculoViewModel_Referencia();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel#getPlaca <em>Placa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placa</em>'.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel#getPlaca()
	 * @see #getVehiculoViewModel()
	 * @generated
	 */
	EAttribute getVehiculoViewModel_Placa();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContenedorregistrovehiculoviewmodelFactory getContenedorregistrovehiculoviewmodelFactory();

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
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorDetalleVehiculoViewModelImpl <em>Contenedor Detalle Vehiculo View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorDetalleVehiculoViewModelImpl
		 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorregistrovehiculoviewmodelPackageImpl#getContenedorDetalleVehiculoViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL = eINSTANCE.getContenedorDetalleVehiculoViewModel();

		/**
		 * The meta object literal for the '<em><b>Propietario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__PROPIETARIO = eINSTANCE.getContenedorDetalleVehiculoViewModel_Propietario();

		/**
		 * The meta object literal for the '<em><b>Marca</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__MARCA = eINSTANCE.getContenedorDetalleVehiculoViewModel_Marca();

		/**
		 * The meta object literal for the '<em><b>Referencia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__REFERENCIA = eINSTANCE.getContenedorDetalleVehiculoViewModel_Referencia();

		/**
		 * The meta object literal for the '<em><b>Modelo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__MODELO = eINSTANCE.getContenedorDetalleVehiculoViewModel_Modelo();

		/**
		 * The meta object literal for the '<em><b>Tipovehiculo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__TIPOVEHICULO = eINSTANCE.getContenedorDetalleVehiculoViewModel_Tipovehiculo();

		/**
		 * The meta object literal for the '<em><b>Placa</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__PLACA = eINSTANCE.getContenedorDetalleVehiculoViewModel_Placa();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor Registro Vehiculo View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL = eINSTANCE.getContenedorDetalleVehiculoViewModel_OwnedByContenedorRegistroVehiculoViewModel();

		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorRegistroVehiculoViewModelImpl <em>Contenedor Registro Vehiculo View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorRegistroVehiculoViewModelImpl
		 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorregistrovehiculoviewmodelPackageImpl#getContenedorRegistroVehiculoViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL = eINSTANCE.getContenedorRegistroVehiculoViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By UI</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__OWNED_BY_UI = eINSTANCE.getContenedorRegistroVehiculoViewModel_OwnedByUI();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Detalle Vehiculo View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_DETALLE_VEHICULO_VIEW_MODEL = eINSTANCE.getContenedorRegistroVehiculoViewModel_TheContenedorDetalleVehiculoViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Vehiculos Registrados View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL__THE_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL = eINSTANCE.getContenedorRegistroVehiculoViewModel_TheContenedorVehiculosRegistradosViewModel();

		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorVehiculosRegistradosViewModelImpl <em>Contenedor Vehiculos Registrados View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorVehiculosRegistradosViewModelImpl
		 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorregistrovehiculoviewmodelPackageImpl#getContenedorVehiculosRegistradosViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL = eINSTANCE.getContenedorVehiculosRegistradosViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor Registro Vehiculo View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL = eINSTANCE.getContenedorVehiculosRegistradosViewModel_OwnedByContenedorRegistroVehiculoViewModel();

		/**
		 * The meta object literal for the '<em><b>Vehiculo View Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL__VEHICULO_VIEW_MODEL = eINSTANCE.getContenedorVehiculosRegistradosViewModel_VehiculoViewModel();

		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.VehiculoViewModelImpl <em>Vehiculo View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.VehiculoViewModelImpl
		 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.impl.ContenedorregistrovehiculoviewmodelPackageImpl#getVehiculoViewModel()
		 * @generated
		 */
		EClass VEHICULO_VIEW_MODEL = eINSTANCE.getVehiculoViewModel();

		/**
		 * The meta object literal for the '<em><b>The0 Contenedor Vehiculos Registrados View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICULO_VIEW_MODEL__THE0_CONTENEDOR_VEHICULOS_REGISTRADOS_VIEW_MODEL = eINSTANCE.getVehiculoViewModel_The0ContenedorVehiculosRegistradosViewModel();

		/**
		 * The meta object literal for the '<em><b>Marca</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICULO_VIEW_MODEL__MARCA = eINSTANCE.getVehiculoViewModel_Marca();

		/**
		 * The meta object literal for the '<em><b>Referencia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICULO_VIEW_MODEL__REFERENCIA = eINSTANCE.getVehiculoViewModel_Referencia();

		/**
		 * The meta object literal for the '<em><b>Placa</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICULO_VIEW_MODEL__PLACA = eINSTANCE.getVehiculoViewModel_Placa();

	}

} //ContenedorregistrovehiculoviewmodelPackage
