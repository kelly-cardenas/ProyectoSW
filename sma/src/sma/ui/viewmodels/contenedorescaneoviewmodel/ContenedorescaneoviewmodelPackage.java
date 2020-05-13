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
	 * The feature id for the '<em><b>The Contenedor Informacion Emision Gases View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Contenedor Escaneo View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_ESCANEO_VIEW_MODEL_FEATURE_COUNT = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorInformacionEmisionGasesViewModelImpl <em>Contenedor Informacion Emision Gases View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorInformacionEmisionGasesViewModelImpl
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorescaneoviewmodelPackageImpl#getContenedorInformacionEmisionGasesViewModel()
	 * @generated
	 */
	int CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL = 1;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__THE_UI = ViewmodelsPackage.VIEW_MODEL__THE_UI;

	/**
	 * The feature id for the '<em><b>Owned By Contenedor Escaneo View Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gasesofensivos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__GASESOFENSIVOS = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gasesnocivos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__GASESNOCIVOS = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Estadovehiculo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__ESTADOVEHICULO = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Contenedor Informacion Emision Gases View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL_FEATURE_COUNT = ViewmodelsPackage.VIEW_MODEL_FEATURE_COUNT + 4;

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
	 * Returns the meta object for the containment reference '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getTheContenedorInformacionEmisionGasesViewModel <em>The Contenedor Informacion Emision Gases View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Contenedor Informacion Emision Gases View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getTheContenedorInformacionEmisionGasesViewModel()
	 * @see #getContenedorEscaneoViewModel()
	 * @generated
	 */
	EReference getContenedorEscaneoViewModel_TheContenedorInformacionEmisionGasesViewModel();

	/**
	 * Returns the meta object for class '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel <em>Contenedor Informacion Emision Gases View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor Informacion Emision Gases View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel
	 * @generated
	 */
	EClass getContenedorInformacionEmisionGasesViewModel();

	/**
	 * Returns the meta object for the container reference '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel#getOwnedByContenedorEscaneoViewModel <em>Owned By Contenedor Escaneo View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Contenedor Escaneo View Model</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel#getOwnedByContenedorEscaneoViewModel()
	 * @see #getContenedorInformacionEmisionGasesViewModel()
	 * @generated
	 */
	EReference getContenedorInformacionEmisionGasesViewModel_OwnedByContenedorEscaneoViewModel();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel#getGasesofensivos <em>Gasesofensivos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gasesofensivos</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel#getGasesofensivos()
	 * @see #getContenedorInformacionEmisionGasesViewModel()
	 * @generated
	 */
	EAttribute getContenedorInformacionEmisionGasesViewModel_Gasesofensivos();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel#getGasesnocivos <em>Gasesnocivos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gasesnocivos</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel#getGasesnocivos()
	 * @see #getContenedorInformacionEmisionGasesViewModel()
	 * @generated
	 */
	EAttribute getContenedorInformacionEmisionGasesViewModel_Gasesnocivos();

	/**
	 * Returns the meta object for the attribute '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel#getEstadovehiculo <em>Estadovehiculo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estadovehiculo</em>'.
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel#getEstadovehiculo()
	 * @see #getContenedorInformacionEmisionGasesViewModel()
	 * @generated
	 */
	EAttribute getContenedorInformacionEmisionGasesViewModel_Estadovehiculo();

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
		 * The meta object literal for the '<em><b>The Contenedor Informacion Emision Gases View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_ESCANEO_VIEW_MODEL__THE_CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL = eINSTANCE.getContenedorEscaneoViewModel_TheContenedorInformacionEmisionGasesViewModel();

		/**
		 * The meta object literal for the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorInformacionEmisionGasesViewModelImpl <em>Contenedor Informacion Emision Gases View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorInformacionEmisionGasesViewModelImpl
		 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorescaneoviewmodelPackageImpl#getContenedorInformacionEmisionGasesViewModel()
		 * @generated
		 */
		EClass CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL = eINSTANCE.getContenedorInformacionEmisionGasesViewModel();

		/**
		 * The meta object literal for the '<em><b>Owned By Contenedor Escaneo View Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__OWNED_BY_CONTENEDOR_ESCANEO_VIEW_MODEL = eINSTANCE.getContenedorInformacionEmisionGasesViewModel_OwnedByContenedorEscaneoViewModel();

		/**
		 * The meta object literal for the '<em><b>Gasesofensivos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__GASESOFENSIVOS = eINSTANCE.getContenedorInformacionEmisionGasesViewModel_Gasesofensivos();

		/**
		 * The meta object literal for the '<em><b>Gasesnocivos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__GASESNOCIVOS = eINSTANCE.getContenedorInformacionEmisionGasesViewModel_Gasesnocivos();

		/**
		 * The meta object literal for the '<em><b>Estadovehiculo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENEDOR_INFORMACION_EMISION_GASES_VIEW_MODEL__ESTADOVEHICULO = eINSTANCE.getContenedorInformacionEmisionGasesViewModel_Estadovehiculo();

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

	}

} //ContenedorescaneoviewmodelPackage
