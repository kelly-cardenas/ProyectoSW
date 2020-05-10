/**
 */
package sma.ui.viewmodels.contenedorescaneoviewmodel;

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
 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelFactory
 * @model kind="package"
 * @generated
 */
public interface ContenedorescaneoviewmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contenedorescaneoviewmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///sma/ui/viewmodels/contenedorescaneoviewmodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sma.ui.viewmodels.contenedorescaneoviewmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContenedorescaneoviewmodelPackage eINSTANCE = sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorescaneoviewmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorEscaneoViewModelImpl <em>Contenedor Escaneo View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorEscaneoViewModelImpl
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorescaneoviewmodelPackageImpl#getContenedorEscaneoViewModel()
	 * @generated
	 */
	int CONTENEDOR_ESCANEO_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_ESCANEO_VIEW_MODEL__THE_UI = ViewmodelsPackage.VIEW_MODEL__THE_UI;

	/**
	 * The feature id for the '<em><b>Owned By UI</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_ESCANEO_VIEW_MODEL__OWNED_BY_UI = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>The Contenedor Seleccionauto View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_SELECCIONAUTO_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>The Contenedor Fallas View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_FALLAS_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Contenedor Escaneo View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_ESCANEO_VIEW_MODEL_FEATURE_COUNT = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorFallasViewModelImpl <em>Contenedor Fallas View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorFallasViewModelImpl
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorescaneoviewmodelPackageImpl#getContenedorFallasViewModel()
	 * @generated
	 */
	int CONTENEDOR_FALLAS_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_FALLAS_VIEW_MODEL__THE_UI = ViewmodelsPackage.VIEW_MODEL__THE_UI;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor Escaneo View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Numeroerrores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_FALLAS_VIEW_MODEL__NUMEROERRORES = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Estadoveh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_FALLAS_VIEW_MODEL__ESTADOVEH = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lista Lista Fallas View Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_FALLAS_VIEW_MODEL__LISTA_LISTA_FALLAS_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Contenedor Fallas View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_FALLAS_VIEW_MODEL_FEATURE_COUNT = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorSeleccionautoViewModelImpl <em>Contenedor Seleccionauto View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorSeleccionautoViewModelImpl
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorescaneoviewmodelPackageImpl#getContenedorSeleccionautoViewModel()
	 * @generated
	 */
	int CONTENEDOR_SELECCIONAUTO_VIEW_MODEL = 2;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__THE_UI = ViewmodelsPackage.VIEW_MODEL__THE_UI;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor Escaneo View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Placavehiculo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__PLACAVEHICULO = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contenedor Seleccionauto View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_SELECCIONAUTO_VIEW_MODEL_FEATURE_COUNT = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ListaFallasViewModelImpl <em>Lista Fallas View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ListaFallasViewModelImpl
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorescaneoviewmodelPackageImpl#getListaFallasViewModel()
	 * @generated
	 */
	int LISTA_FALLAS_VIEW_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor Fallas View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_FALLAS_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Gravedad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_FALLAS_VIEW_MODEL__GRAVEDAD = 1;

	/**
	 * The feature id for the '<em><b>Piesaaveriada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_FALLAS_VIEW_MODEL__PIESAAVERIADA = 2;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_FALLAS_VIEW_MODEL__ORIGEN = 3;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_FALLAS_VIEW_MODEL__DESCRIPCION = 4;

	/**
	 * The number of structural features of the '<em>Lista Fallas View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_FALLAS_VIEW_MODEL_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel <em>Contenedor Escaneo View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Escaneo View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel
	 * @generated
	 */
	EClass getContenedorEscaneoViewModel();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getOwnedByUI <em>Owned By UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By UI</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getOwnedByUI()
	 * @see #getContenedorEscaneoViewModel()
	 * @generated
	 */
	EReference getContenedorEscaneoViewModel_OwnedByUI();

	/**
	 * Returns the meta object for the containment reference '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getTheContenedorSeleccionautoViewModel <em>The Contenedor Seleccionauto View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Seleccionauto View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getTheContenedorSeleccionautoViewModel()
	 * @see #getContenedorEscaneoViewModel()
	 * @generated
	 */
	EReference getContenedorEscaneoViewModel_TheContenedorSeleccionautoViewModel();

	/**
	 * Returns the meta object for the containment reference '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getTheContenedorFallasViewModel <em>The Contenedor Fallas View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Fallas View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getTheContenedorFallasViewModel()
	 * @see #getContenedorEscaneoViewModel()
	 * @generated
	 */
	EReference getContenedorEscaneoViewModel_TheContenedorFallasViewModel();

	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel <em>Contenedor Fallas View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Fallas View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel
	 * @generated
	 */
	EClass getContenedorFallasViewModel();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel#getOwnedByContenedorEscaneoViewModel <em>Owned By Contenedor Escaneo View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor Escaneo View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel#getOwnedByContenedorEscaneoViewModel()
	 * @see #getContenedorFallasViewModel()
	 * @generated
	 */
	EReference getContenedorFallasViewModel_OwnedByContenedorEscaneoViewModel();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel#getNumeroerrores <em>Numeroerrores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numeroerrores</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel#getNumeroerrores()
	 * @see #getContenedorFallasViewModel()
	 * @generated
	 */
	EAttribute getContenedorFallasViewModel_Numeroerrores();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel#getEstadoveh <em>Estadoveh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estadoveh</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel#getEstadoveh()
	 * @see #getContenedorFallasViewModel()
	 * @generated
	 */
	EAttribute getContenedorFallasViewModel_Estadoveh();

	/**
	 * Returns the meta object for the containment reference list '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel#getListaListaFallasViewModel <em>Lista Lista Fallas View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Lista Fallas View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorFallasViewModel#getListaListaFallasViewModel()
	 * @see #getContenedorFallasViewModel()
	 * @generated
	 */
	EReference getContenedorFallasViewModel_ListaListaFallasViewModel();

	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorSeleccionautoViewModel <em>Contenedor Seleccionauto View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Seleccionauto View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorSeleccionautoViewModel
	 * @generated
	 */
	EClass getContenedorSeleccionautoViewModel();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorSeleccionautoViewModel#getOwnedByContenedorEscaneoViewModel <em>Owned By Contenedor Escaneo View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor Escaneo View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorSeleccionautoViewModel#getOwnedByContenedorEscaneoViewModel()
	 * @see #getContenedorSeleccionautoViewModel()
	 * @generated
	 */
	EReference getContenedorSeleccionautoViewModel_OwnedByContenedorEscaneoViewModel();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorSeleccionautoViewModel#getPlacavehiculo <em>Placavehiculo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placavehiculo</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorSeleccionautoViewModel#getPlacavehiculo()
	 * @see #getContenedorSeleccionautoViewModel()
	 * @generated
	 */
	EAttribute getContenedorSeleccionautoViewModel_Placavehiculo();

	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel <em>Lista Fallas View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lista Fallas View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel
	 * @generated
	 */
	EClass getListaFallasViewModel();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel#getOwnedByContenedorFallasViewModel <em>Owned By Contenedor Fallas View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor Fallas View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel#getOwnedByContenedorFallasViewModel()
	 * @see #getListaFallasViewModel()
	 * @generated
	 */
	EReference getListaFallasViewModel_OwnedByContenedorFallasViewModel();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel#getGravedad <em>Gravedad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gravedad</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel#getGravedad()
	 * @see #getListaFallasViewModel()
	 * @generated
	 */
	EAttribute getListaFallasViewModel_Gravedad();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel#getPiesaaveriada <em>Piesaaveriada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Piesaaveriada</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel#getPiesaaveriada()
	 * @see #getListaFallasViewModel()
	 * @generated
	 */
	EAttribute getListaFallasViewModel_Piesaaveriada();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origen</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel#getOrigen()
	 * @see #getListaFallasViewModel()
	 * @generated
	 */
	EAttribute getListaFallasViewModel_Origen();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ListaFallasViewModel#getDescripcion()
	 * @see #getListaFallasViewModel()
	 * @generated
	 */
	EAttribute getListaFallasViewModel_Descripcion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContenedorescaneoviewmodelFactory getContenedorescaneoviewmodelFactory();

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
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorEscaneoViewModelImpl <em>Contenedor Escaneo View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorEscaneoViewModelImpl
		 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorescaneoviewmodelPackageImpl#getContenedorEscaneoViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_ESCANEO_VIEW_MODEL = eINSTANCE.getContenedorEscaneoViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By UI</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_ESCANEO_VIEW_MODEL__OWNED_BY_UI = eINSTANCE.getContenedorEscaneoViewModel_OwnedByUI();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Seleccionauto View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_SELECCIONAUTO_VIEW_MODEL = eINSTANCE.getContenedorEscaneoViewModel_TheContenedorSeleccionautoViewModel();

		/**
		 * The meta object literal for the '<em><b>The Contenedor Fallas View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_FALLAS_VIEW_MODEL = eINSTANCE.getContenedorEscaneoViewModel_TheContenedorFallasViewModel();

		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorFallasViewModelImpl <em>Contenedor Fallas View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorFallasViewModelImpl
		 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorescaneoviewmodelPackageImpl#getContenedorFallasViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_FALLAS_VIEW_MODEL = eINSTANCE.getContenedorFallasViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor Escaneo View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL = eINSTANCE.getContenedorFallasViewModel_OwnedByContenedorEscaneoViewModel();

		/**
		 * The meta object literal for the '<em><b>Numeroerrores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_FALLAS_VIEW_MODEL__NUMEROERRORES = eINSTANCE.getContenedorFallasViewModel_Numeroerrores();

		/**
		 * The meta object literal for the '<em><b>Estadoveh</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_FALLAS_VIEW_MODEL__ESTADOVEH = eINSTANCE.getContenedorFallasViewModel_Estadoveh();

		/**
		 * The meta object literal for the '<em><b>Lista Lista Fallas View Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_FALLAS_VIEW_MODEL__LISTA_LISTA_FALLAS_VIEW_MODEL = eINSTANCE.getContenedorFallasViewModel_ListaListaFallasViewModel();

		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorSeleccionautoViewModelImpl <em>Contenedor Seleccionauto View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorSeleccionautoViewModelImpl
		 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorescaneoviewmodelPackageImpl#getContenedorSeleccionautoViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_SELECCIONAUTO_VIEW_MODEL = eINSTANCE.getContenedorSeleccionautoViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor Escaneo View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL = eINSTANCE.getContenedorSeleccionautoViewModel_OwnedByContenedorEscaneoViewModel();

		/**
		 * The meta object literal for the '<em><b>Placavehiculo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_SELECCIONAUTO_VIEW_MODEL__PLACAVEHICULO = eINSTANCE.getContenedorSeleccionautoViewModel_Placavehiculo();

		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ListaFallasViewModelImpl <em>Lista Fallas View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ListaFallasViewModelImpl
		 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorescaneoviewmodelPackageImpl#getListaFallasViewModel()
		 * @generated
		 */
		EClass LISTA_FALLAS_VIEW_MODEL = eINSTANCE.getListaFallasViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor Fallas View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTA_FALLAS_VIEW_MODEL__OWNED_BY_CONTENEDOR_FALLAS_VIEW_MODEL = eINSTANCE.getListaFallasViewModel_OwnedByContenedorFallasViewModel();

		/**
		 * The meta object literal for the '<em><b>Gravedad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTA_FALLAS_VIEW_MODEL__GRAVEDAD = eINSTANCE.getListaFallasViewModel_Gravedad();

		/**
		 * The meta object literal for the '<em><b>Piesaaveriada</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTA_FALLAS_VIEW_MODEL__PIESAAVERIADA = eINSTANCE.getListaFallasViewModel_Piesaaveriada();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTA_FALLAS_VIEW_MODEL__ORIGEN = eINSTANCE.getListaFallasViewModel_Origen();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTA_FALLAS_VIEW_MODEL__DESCRIPCION = eINSTANCE.getListaFallasViewModel_Descripcion();

	}

} //ContenedorescaneoviewmodelPackage
