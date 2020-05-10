/**
 */
package sma.ui.viewmodels.contenedorcontactarcmviewmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import sma.ui.viewmodels.ViewmodelsPackage;

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
 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorcontactarcmviewmodelFactory
 * @model kind="package"
 * @generated
 */
public interface ContenedorcontactarcmviewmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contenedorcontactarcmviewmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///sma/ui/viewmodels/contenedorcontactarcmviewmodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sma.ui.viewmodels.contenedorcontactarcmviewmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContenedorcontactarcmviewmodelPackage eINSTANCE = sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorcontactarcmviewmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorCmrecomendadosViewModelImpl <em>Contenedor Cmrecomendados View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorCmrecomendadosViewModelImpl
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorcontactarcmviewmodelPackageImpl#getContenedorCmrecomendadosViewModel()
	 * @generated
	 */
	int CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__THE_UI = ViewmodelsPackage.VIEW_MODEL__THE_UI;

	/**
	 * The feature id for the '<em><b>Lista Lista Cm View Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__LISTA_LISTA_CM_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor Contactar Cm View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contenedor Cmrecomendados View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL_FEATURE_COUNT = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorContactarCmViewModelImpl <em>Contenedor Contactar Cm View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorContactarCmViewModelImpl
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorcontactarcmviewmodelPackageImpl#getContenedorContactarCmViewModel()
	 * @generated
	 */
	int CONTENEDOR_CONTACTAR_CM_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_UI = ViewmodelsPackage.VIEW_MODEL__THE_UI;

	/**
	 * The feature id for the '<em><b>Owned By UI</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__OWNED_BY_UI = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>The Contenedor Cmrecomendados View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>The Contenedor Ubicacionactual View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Contenedor Contactar Cm View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_CONTACTAR_CM_VIEW_MODEL_FEATURE_COUNT = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorUbicacionactualViewModelImpl <em>Contenedor Ubicacionactual View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorUbicacionactualViewModelImpl
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorcontactarcmviewmodelPackageImpl#getContenedorUbicacionactualViewModel()
	 * @generated
	 */
	int CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL = 2;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__THE_UI = ViewmodelsPackage.VIEW_MODEL__THE_UI;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor Contactar Cm View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__PAIS = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Departamento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__DEPARTAMENTO = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ciudad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__CIUDAD = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Contenedor Ubicacionactual View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL_FEATURE_COUNT = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ListaCmViewModelImpl <em>Lista Cm View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ListaCmViewModelImpl
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorcontactarcmviewmodelPackageImpl#getListaCmViewModel()
	 * @generated
	 */
	int LISTA_CM_VIEW_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor Cmrecomendados View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CM_VIEW_MODEL__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Nombrerepresentante</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CM_VIEW_MODEL__NOMBREREPRESENTANTE = 2;

	/**
	 * The feature id for the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CM_VIEW_MODEL__DIRECCION = 3;

	/**
	 * The number of structural features of the '<em>Lista Cm View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_CM_VIEW_MODEL_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorCmrecomendadosViewModel <em>Contenedor Cmrecomendados View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Cmrecomendados View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorCmrecomendadosViewModel
	 * @generated
	 */
	EClass getContenedorCmrecomendadosViewModel();

	/**
	 * Returns the meta object for the containment reference list '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorCmrecomendadosViewModel#getListaListaCmViewModel <em>Lista Lista Cm View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Lista Cm View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorCmrecomendadosViewModel#getListaListaCmViewModel()
	 * @see #getContenedorCmrecomendadosViewModel()
	 * @generated
	 */
	EReference getContenedorCmrecomendadosViewModel_ListaListaCmViewModel();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorCmrecomendadosViewModel#getOwnedByContenedorContactarCmViewModel <em>Owned By Contenedor Contactar Cm View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor Contactar Cm View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorCmrecomendadosViewModel#getOwnedByContenedorContactarCmViewModel()
	 * @see #getContenedorCmrecomendadosViewModel()
	 * @generated
	 */
	EReference getContenedorCmrecomendadosViewModel_OwnedByContenedorContactarCmViewModel();

	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel <em>Contenedor Contactar Cm View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Contactar Cm View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel
	 * @generated
	 */
	EClass getContenedorContactarCmViewModel();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel#getOwnedByUI <em>Owned By UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By UI</em>'.
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel#getOwnedByUI()
	 * @see #getContenedorContactarCmViewModel()
	 * @generated
	 */
	EReference getContenedorContactarCmViewModel_OwnedByUI();

	/**
	 * Returns the meta object for the containment reference '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel#getTheContenedorCmrecomendadosViewModel <em>The Contenedor Cmrecomendados View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Cmrecomendados View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel#getTheContenedorCmrecomendadosViewModel()
	 * @see #getContenedorContactarCmViewModel()
	 * @generated
	 */
	EReference getContenedorContactarCmViewModel_TheContenedorCmrecomendadosViewModel();

	/**
	 * Returns the meta object for the containment reference '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel#getTheContenedorUbicacionactualViewModel <em>The Contenedor Ubicacionactual View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Ubicacionactual View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorContactarCmViewModel#getTheContenedorUbicacionactualViewModel()
	 * @see #getContenedorContactarCmViewModel()
	 * @generated
	 */
	EReference getContenedorContactarCmViewModel_TheContenedorUbicacionactualViewModel();

	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel <em>Contenedor Ubicacionactual View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Ubicacionactual View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel
	 * @generated
	 */
	EClass getContenedorUbicacionactualViewModel();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel#getOwnedByContenedorContactarCmViewModel <em>Owned By Contenedor Contactar Cm View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor Contactar Cm View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel#getOwnedByContenedorContactarCmViewModel()
	 * @see #getContenedorUbicacionactualViewModel()
	 * @generated
	 */
	EReference getContenedorUbicacionactualViewModel_OwnedByContenedorContactarCmViewModel();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel#getPais <em>Pais</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pais</em>'.
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel#getPais()
	 * @see #getContenedorUbicacionactualViewModel()
	 * @generated
	 */
	EAttribute getContenedorUbicacionactualViewModel_Pais();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel#getDepartamento <em>Departamento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Departamento</em>'.
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel#getDepartamento()
	 * @see #getContenedorUbicacionactualViewModel()
	 * @generated
	 */
	EAttribute getContenedorUbicacionactualViewModel_Departamento();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel#getCiudad <em>Ciudad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ciudad</em>'.
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ContenedorUbicacionactualViewModel#getCiudad()
	 * @see #getContenedorUbicacionactualViewModel()
	 * @generated
	 */
	EAttribute getContenedorUbicacionactualViewModel_Ciudad();

	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel <em>Lista Cm View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lista Cm View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel
	 * @generated
	 */
	EClass getListaCmViewModel();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel#getOwnedByContenedorCmrecomendadosViewModel <em>Owned By Contenedor Cmrecomendados View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor Cmrecomendados View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel#getOwnedByContenedorCmrecomendadosViewModel()
	 * @see #getListaCmViewModel()
	 * @generated
	 */
	EReference getListaCmViewModel_OwnedByContenedorCmrecomendadosViewModel();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel#getNombre()
	 * @see #getListaCmViewModel()
	 * @generated
	 */
	EAttribute getListaCmViewModel_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel#getNombrerepresentante <em>Nombrerepresentante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombrerepresentante</em>'.
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel#getNombrerepresentante()
	 * @see #getListaCmViewModel()
	 * @generated
	 */
	EAttribute getListaCmViewModel_Nombrerepresentante();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel#getDireccion <em>Direccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direccion</em>'.
	 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.ListaCmViewModel#getDireccion()
	 * @see #getListaCmViewModel()
	 * @generated
	 */
	EAttribute getListaCmViewModel_Direccion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContenedorcontactarcmviewmodelFactory getContenedorcontactarcmviewmodelFactory();

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
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorCmrecomendadosViewModelImpl <em>Contenedor Cmrecomendados View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorCmrecomendadosViewModelImpl
		 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorcontactarcmviewmodelPackageImpl#getContenedorCmrecomendadosViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL = eINSTANCE.getContenedorCmrecomendadosViewModel();

		/**
		 * The meta object literal for the '<em><b>Lista Lista Cm View Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__LISTA_LISTA_CM_VIEW_MODEL = eINSTANCE.getContenedorCmrecomendadosViewModel_ListaListaCmViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor Contactar Cm View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL = eINSTANCE.getContenedorCmrecomendadosViewModel_OwnedByContenedorContactarCmViewModel();

		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorContactarCmViewModelImpl <em>Contenedor Contactar Cm View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorContactarCmViewModelImpl
		 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorcontactarcmviewmodelPackageImpl#getContenedorContactarCmViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_CONTACTAR_CM_VIEW_MODEL = eINSTANCE.getContenedorContactarCmViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By UI</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__OWNED_BY_UI = eINSTANCE.getContenedorContactarCmViewModel_OwnedByUI();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Cmrecomendados View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL = eINSTANCE.getContenedorContactarCmViewModel_TheContenedorCmrecomendadosViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Ubicacionactual View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_CONTACTAR_CM_VIEW_MODEL__THE_CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL = eINSTANCE.getContenedorContactarCmViewModel_TheContenedorUbicacionactualViewModel();

		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorUbicacionactualViewModelImpl <em>Contenedor Ubicacionactual View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorUbicacionactualViewModelImpl
		 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorcontactarcmviewmodelPackageImpl#getContenedorUbicacionactualViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL = eINSTANCE.getContenedorUbicacionactualViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor Contactar Cm View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__OWNED_BY_CONTENEDOR_CONTACTAR_CM_VIEW_MODEL = eINSTANCE.getContenedorUbicacionactualViewModel_OwnedByContenedorContactarCmViewModel();

		/**
		 * The meta object literal for the '<em><b>Pais</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__PAIS = eINSTANCE.getContenedorUbicacionactualViewModel_Pais();

		/**
		 * The meta object literal for the '<em><b>Departamento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__DEPARTAMENTO = eINSTANCE.getContenedorUbicacionactualViewModel_Departamento();

		/**
		 * The meta object literal for the '<em><b>Ciudad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_UBICACIONACTUAL_VIEW_MODEL__CIUDAD = eINSTANCE.getContenedorUbicacionactualViewModel_Ciudad();

		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ListaCmViewModelImpl <em>Lista Cm View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ListaCmViewModelImpl
		 * @see sma.ui.viewmodels.contenedorcontactarcmviewmodel.impl.ContenedorcontactarcmviewmodelPackageImpl#getListaCmViewModel()
		 * @generated
		 */
		EClass LISTA_CM_VIEW_MODEL = eINSTANCE.getListaCmViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor Cmrecomendados View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTA_CM_VIEW_MODEL__OWNED_BY_CONTENEDOR_CMRECOMENDADOS_VIEW_MODEL = eINSTANCE.getListaCmViewModel_OwnedByContenedorCmrecomendadosViewModel();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTA_CM_VIEW_MODEL__NOMBRE = eINSTANCE.getListaCmViewModel_Nombre();

		/**
		 * The meta object literal for the '<em><b>Nombrerepresentante</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTA_CM_VIEW_MODEL__NOMBREREPRESENTANTE = eINSTANCE.getListaCmViewModel_Nombrerepresentante();

		/**
		 * The meta object literal for the '<em><b>Direccion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTA_CM_VIEW_MODEL__DIRECCION = eINSTANCE.getListaCmViewModel_Direccion();

	}

} //ContenedorcontactarcmviewmodelPackage
