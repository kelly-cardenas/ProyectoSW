/**
 */
package sma.ui;

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
 * @see sma.ui.UiFactory
 * @model kind="package"
 * @generated
 */
public interface UiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///sma/ui.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sma.ui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiPackage eINSTANCE = sma.ui.impl.UiPackageImpl.init();

	/**
	 * The meta object id for the '{@link sma.ui.impl.UIImpl <em>UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.impl.UIImpl
	 * @see sma.ui.impl.UiPackageImpl#getUI()
	 * @generated
	 */
	int UI = 0;

	/**
	 * The feature id for the '<em><b>The Model Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__THE_MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Id Logueado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__ID_LOGUEADO = 1;

	/**
	 * The feature id for the '<em><b>Tipo Logueado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__TIPO_LOGUEADO = 2;

	/**
	 * The feature id for the '<em><b>The Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__THE_DOMAIN = 3;

	/**
	 * The feature id for the '<em><b>The Contenedor Crud Cliente View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL = 4;

	/**
	 * The feature id for the '<em><b>The Contenedor CRUDCM View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__THE_CONTENEDOR_CRUDCM_VIEW_MODEL = 5;

	/**
	 * The feature id for the '<em><b>The Contenedor Registro Vehiculo View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__THE_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL = 6;

	/**
	 * The feature id for the '<em><b>The Contenedor Login View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__THE_CONTENEDOR_LOGIN_VIEW_MODEL = 7;

	/**
	 * The number of structural features of the '<em>UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FEATURE_COUNT = 8;


	/**
	 * Returns the meta object for class '{@link sma.ui.UI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI</em>'.
	 * @see sma.ui.UI
	 * @generated
	 */
	EClass getUI();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.UI#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Model Factory</em>'.
	 * @see sma.ui.UI#getTheModelFactory()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_TheModelFactory();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.UI#getIdLogueado <em>Id Logueado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Logueado</em>'.
	 * @see sma.ui.UI#getIdLogueado()
	 * @see #getUI()
	 * @generated
	 */
	EAttribute getUI_IdLogueado();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.UI#getTipoLogueado <em>Tipo Logueado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Logueado</em>'.
	 * @see sma.ui.UI#getTipoLogueado()
	 * @see #getUI()
	 * @generated
	 */
	EAttribute getUI_TipoLogueado();

	/**
	 * Returns the meta object for the reference '{@link sma.ui.UI#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Domain</em>'.
	 * @see sma.ui.UI#getTheDomain()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_TheDomain();

	/**
	 * Returns the meta object for the containment reference '{@link sma.ui.UI#getTheContenedorCrudClienteViewModel <em>The Contenedor Crud Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Crud Cliente View Model</em>'.
	 * @see sma.ui.UI#getTheContenedorCrudClienteViewModel()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_TheContenedorCrudClienteViewModel();

	/**
	 * Returns the meta object for the containment reference '{@link sma.ui.UI#getTheContenedorCRUDCMViewModel <em>The Contenedor CRUDCM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor CRUDCM View Model</em>'.
	 * @see sma.ui.UI#getTheContenedorCRUDCMViewModel()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_TheContenedorCRUDCMViewModel();

	/**
	 * Returns the meta object for the containment reference '{@link sma.ui.UI#getTheContenedorRegistroVehiculoViewModel <em>The Contenedor Registro Vehiculo View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Registro Vehiculo View Model</em>'.
	 * @see sma.ui.UI#getTheContenedorRegistroVehiculoViewModel()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_TheContenedorRegistroVehiculoViewModel();

	/**
	 * Returns the meta object for the containment reference '{@link sma.ui.UI#getTheContenedorLoginViewModel <em>The Contenedor Login View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Login View Model</em>'.
	 * @see sma.ui.UI#getTheContenedorLoginViewModel()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_TheContenedorLoginViewModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UiFactory getUiFactory();

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
		 * The meta object literal for the '{@link sma.ui.impl.UIImpl <em>UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.impl.UIImpl
		 * @see sma.ui.impl.UiPackageImpl#getUI()
		 * @generated
		 */
		EClass UI = eINSTANCE.getUI();

		/**
		 * The meta object literal for the '<em><b>The Model Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__THE_MODEL_FACTORY = eINSTANCE.getUI_TheModelFactory();

		/**
		 * The meta object literal for the '<em><b>Id Logueado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI__ID_LOGUEADO = eINSTANCE.getUI_IdLogueado();

		/**
		 * The meta object literal for the '<em><b>Tipo Logueado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI__TIPO_LOGUEADO = eINSTANCE.getUI_TipoLogueado();

		/**
		 * The meta object literal for the '<em><b>The Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__THE_DOMAIN = eINSTANCE.getUI_TheDomain();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Crud Cliente View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__THE_CONTENEDOR_CRUD_CLIENTE_VIEW_MODEL = eINSTANCE.getUI_TheContenedorCrudClienteViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor CRUDCM View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__THE_CONTENEDOR_CRUDCM_VIEW_MODEL = eINSTANCE.getUI_TheContenedorCRUDCMViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Registro Vehiculo View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__THE_CONTENEDOR_REGISTRO_VEHICULO_VIEW_MODEL = eINSTANCE.getUI_TheContenedorRegistroVehiculoViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Login View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__THE_CONTENEDOR_LOGIN_VIEW_MODEL = eINSTANCE.getUI_TheContenedorLoginViewModel();

	}

} //UiPackage
