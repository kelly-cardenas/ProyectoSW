/**
 */
package sma.domain.automatizacionrevision;

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
 * @see sma.domain.automatizacionrevision.AutomatizacionrevisionFactory
 * @model kind="package"
 * @generated
 */
public interface AutomatizacionrevisionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "automatizacionrevision";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///sma/domain/automatizacionrevision.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sma.domain.automatizacionrevision";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AutomatizacionrevisionPackage eINSTANCE = sma.domain.automatizacionrevision.impl.AutomatizacionrevisionPackageImpl.init();

	/**
	 * The meta object id for the '{@link sma.domain.automatizacionrevision.impl.FallaMecanicaImpl <em>Falla Mecanica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.domain.automatizacionrevision.impl.FallaMecanicaImpl
	 * @see sma.domain.automatizacionrevision.impl.AutomatizacionrevisionPackageImpl#getFallaMecanica()
	 * @generated
	 */
	int FALLA_MECANICA = 0;

	/**
	 * The feature id for the '<em><b>Piesa Averiada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLA_MECANICA__PIESA_AVERIADA = 0;

	/**
	 * The feature id for the '<em><b>Gravedad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLA_MECANICA__GRAVEDAD = 1;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLA_MECANICA__ORIGEN = 2;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLA_MECANICA__DESCRIPCION = 3;

	/**
	 * The feature id for the '<em><b>The Automovil</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLA_MECANICA__THE_AUTOMOVIL = 4;

	/**
	 * The number of structural features of the '<em>Falla Mecanica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLA_MECANICA_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link sma.domain.automatizacionrevision.impl.sensorImpl <em>sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.domain.automatizacionrevision.impl.sensorImpl
	 * @see sma.domain.automatizacionrevision.impl.AutomatizacionrevisionPackageImpl#getsensor()
	 * @generated
	 */
	int SENSOR = 1;

	/**
	 * The feature id for the '<em><b>Owner By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__OWNER_BY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ID = 1;

	/**
	 * The feature id for the '<em><b>Info Comp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__INFO_COMP = 2;

	/**
	 * The number of structural features of the '<em>sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link sma.domain.automatizacionrevision.FallaMecanica <em>Falla Mecanica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Falla Mecanica</em>'.
	 * @see sma.domain.automatizacionrevision.FallaMecanica
	 * @generated
	 */
	EClass getFallaMecanica();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.automatizacionrevision.FallaMecanica#getPiesaAveriada <em>Piesa Averiada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Piesa Averiada</em>'.
	 * @see sma.domain.automatizacionrevision.FallaMecanica#getPiesaAveriada()
	 * @see #getFallaMecanica()
	 * @generated
	 */
	EAttribute getFallaMecanica_PiesaAveriada();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.automatizacionrevision.FallaMecanica#getGravedad <em>Gravedad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gravedad</em>'.
	 * @see sma.domain.automatizacionrevision.FallaMecanica#getGravedad()
	 * @see #getFallaMecanica()
	 * @generated
	 */
	EAttribute getFallaMecanica_Gravedad();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.automatizacionrevision.FallaMecanica#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origen</em>'.
	 * @see sma.domain.automatizacionrevision.FallaMecanica#getOrigen()
	 * @see #getFallaMecanica()
	 * @generated
	 */
	EAttribute getFallaMecanica_Origen();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.automatizacionrevision.FallaMecanica#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see sma.domain.automatizacionrevision.FallaMecanica#getDescripcion()
	 * @see #getFallaMecanica()
	 * @generated
	 */
	EAttribute getFallaMecanica_Descripcion();

	/**
	 * Returns the meta object for the container reference '{@link sma.domain.automatizacionrevision.FallaMecanica#getTheAutomovil <em>The Automovil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Automovil</em>'.
	 * @see sma.domain.automatizacionrevision.FallaMecanica#getTheAutomovil()
	 * @see #getFallaMecanica()
	 * @generated
	 */
	EReference getFallaMecanica_TheAutomovil();

	/**
	 * Returns the meta object for class '{@link sma.domain.automatizacionrevision.sensor <em>sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sensor</em>'.
	 * @see sma.domain.automatizacionrevision.sensor
	 * @generated
	 */
	EClass getsensor();

	/**
	 * Returns the meta object for the container reference '{@link sma.domain.automatizacionrevision.sensor#getOwnerBy <em>Owner By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner By</em>'.
	 * @see sma.domain.automatizacionrevision.sensor#getOwnerBy()
	 * @see #getsensor()
	 * @generated
	 */
	EReference getsensor_OwnerBy();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.automatizacionrevision.sensor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sma.domain.automatizacionrevision.sensor#getId()
	 * @see #getsensor()
	 * @generated
	 */
	EAttribute getsensor_Id();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.automatizacionrevision.sensor#getInfoComp <em>Info Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info Comp</em>'.
	 * @see sma.domain.automatizacionrevision.sensor#getInfoComp()
	 * @see #getsensor()
	 * @generated
	 */
	EAttribute getsensor_InfoComp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AutomatizacionrevisionFactory getAutomatizacionrevisionFactory();

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
		 * The meta object literal for the '{@link sma.domain.automatizacionrevision.impl.FallaMecanicaImpl <em>Falla Mecanica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.domain.automatizacionrevision.impl.FallaMecanicaImpl
		 * @see sma.domain.automatizacionrevision.impl.AutomatizacionrevisionPackageImpl#getFallaMecanica()
		 * @generated
		 */
		EClass FALLA_MECANICA = eINSTANCE.getFallaMecanica();

		/**
		 * The meta object literal for the '<em><b>Piesa Averiada</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FALLA_MECANICA__PIESA_AVERIADA = eINSTANCE.getFallaMecanica_PiesaAveriada();

		/**
		 * The meta object literal for the '<em><b>Gravedad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FALLA_MECANICA__GRAVEDAD = eINSTANCE.getFallaMecanica_Gravedad();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FALLA_MECANICA__ORIGEN = eINSTANCE.getFallaMecanica_Origen();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FALLA_MECANICA__DESCRIPCION = eINSTANCE.getFallaMecanica_Descripcion();

		/**
		 * The meta object literal for the '<em><b>The Automovil</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLA_MECANICA__THE_AUTOMOVIL = eINSTANCE.getFallaMecanica_TheAutomovil();

		/**
		 * The meta object literal for the '{@link sma.domain.automatizacionrevision.impl.sensorImpl <em>sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.domain.automatizacionrevision.impl.sensorImpl
		 * @see sma.domain.automatizacionrevision.impl.AutomatizacionrevisionPackageImpl#getsensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getsensor();

		/**
		 * The meta object literal for the '<em><b>Owner By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__OWNER_BY = eINSTANCE.getsensor_OwnerBy();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__ID = eINSTANCE.getsensor_Id();

		/**
		 * The meta object literal for the '<em><b>Info Comp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__INFO_COMP = eINSTANCE.getsensor_InfoComp();

	}

} //AutomatizacionrevisionPackage
