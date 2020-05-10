/**
 */
package sma.domain.reparacionvehiculo;

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
 * @see sma.domain.reparacionvehiculo.ReparacionvehiculoFactory
 * @model kind="package"
 * @generated
 */
public interface ReparacionvehiculoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "reparacionvehiculo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///sma/domain/reparacionvehiculo.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sma.domain.reparacionvehiculo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReparacionvehiculoPackage eINSTANCE = sma.domain.reparacionvehiculo.impl.ReparacionvehiculoPackageImpl.init();

	/**
	 * The meta object id for the '{@link sma.domain.reparacionvehiculo.impl.ReparacionImpl <em>Reparacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sma.domain.reparacionvehiculo.impl.ReparacionImpl
	 * @see sma.domain.reparacionvehiculo.impl.ReparacionvehiculoPackageImpl#getReparacion()
	 * @generated
	 */
	int REPARACION = 0;

	/**
	 * The feature id for the '<em><b>The Automovil</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPARACION__THE_AUTOMOVIL = 0;

	/**
	 * The feature id for the '<em><b>The Centro Mant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPARACION__THE_CENTRO_MANT = 1;

	/**
	 * The feature id for the '<em><b>Nombre Responsable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPARACION__NOMBRE_RESPONSABLE = 2;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPARACION__ESTADO = 3;

	/**
	 * The feature id for the '<em><b>Numero Fallas Predecidas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPARACION__NUMERO_FALLAS_PREDECIDAS = 4;

	/**
	 * The feature id for the '<em><b>Numero Fallas Acertadas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPARACION__NUMERO_FALLAS_ACERTADAS = 5;

	/**
	 * The feature id for the '<em><b>Fecha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPARACION__FECHA = 6;

	/**
	 * The feature id for the '<em><b>Hora</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPARACION__HORA = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPARACION__ID = 8;

	/**
	 * The number of structural features of the '<em>Reparacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPARACION_FEATURE_COUNT = 9;


	/**
	 * Returns the meta object for class '{@link sma.domain.reparacionvehiculo.Reparacion <em>Reparacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reparacion</em>'.
	 * @see sma.domain.reparacionvehiculo.Reparacion
	 * @generated
	 */
	EClass getReparacion();

	/**
	 * Returns the meta object for the reference '{@link sma.domain.reparacionvehiculo.Reparacion#getTheAutomovil <em>The Automovil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>The Automovil</em>'.
	 * @see sma.domain.reparacionvehiculo.Reparacion#getTheAutomovil()
	 * @see #getReparacion()
	 * @generated
	 */
	EReference getReparacion_TheAutomovil();

	/**
	 * Returns the meta object for the container reference '{@link sma.domain.reparacionvehiculo.Reparacion#getTheCentroMant <em>The Centro Mant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Centro Mant</em>'.
	 * @see sma.domain.reparacionvehiculo.Reparacion#getTheCentroMant()
	 * @see #getReparacion()
	 * @generated
	 */
	EReference getReparacion_TheCentroMant();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.reparacionvehiculo.Reparacion#getNombreResponsable <em>Nombre Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Responsable</em>'.
	 * @see sma.domain.reparacionvehiculo.Reparacion#getNombreResponsable()
	 * @see #getReparacion()
	 * @generated
	 */
	EAttribute getReparacion_NombreResponsable();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.reparacionvehiculo.Reparacion#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see sma.domain.reparacionvehiculo.Reparacion#getEstado()
	 * @see #getReparacion()
	 * @generated
	 */
	EAttribute getReparacion_Estado();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.reparacionvehiculo.Reparacion#getNumeroFallasPredecidas <em>Numero Fallas Predecidas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Fallas Predecidas</em>'.
	 * @see sma.domain.reparacionvehiculo.Reparacion#getNumeroFallasPredecidas()
	 * @see #getReparacion()
	 * @generated
	 */
	EAttribute getReparacion_NumeroFallasPredecidas();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.reparacionvehiculo.Reparacion#getNumeroFallasAcertadas <em>Numero Fallas Acertadas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Fallas Acertadas</em>'.
	 * @see sma.domain.reparacionvehiculo.Reparacion#getNumeroFallasAcertadas()
	 * @see #getReparacion()
	 * @generated
	 */
	EAttribute getReparacion_NumeroFallasAcertadas();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.reparacionvehiculo.Reparacion#getFecha <em>Fecha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha</em>'.
	 * @see sma.domain.reparacionvehiculo.Reparacion#getFecha()
	 * @see #getReparacion()
	 * @generated
	 */
	EAttribute getReparacion_Fecha();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.reparacionvehiculo.Reparacion#getHora <em>Hora</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hora</em>'.
	 * @see sma.domain.reparacionvehiculo.Reparacion#getHora()
	 * @see #getReparacion()
	 * @generated
	 */
	EAttribute getReparacion_Hora();

	/**
	 * Returns the meta object for the attribute '{@link sma.domain.reparacionvehiculo.Reparacion#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sma.domain.reparacionvehiculo.Reparacion#getId()
	 * @see #getReparacion()
	 * @generated
	 */
	EAttribute getReparacion_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReparacionvehiculoFactory getReparacionvehiculoFactory();

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
		 * The meta object literal for the '{@link sma.domain.reparacionvehiculo.impl.ReparacionImpl <em>Reparacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sma.domain.reparacionvehiculo.impl.ReparacionImpl
		 * @see sma.domain.reparacionvehiculo.impl.ReparacionvehiculoPackageImpl#getReparacion()
		 * @generated
		 */
		EClass REPARACION = eINSTANCE.getReparacion();

		/**
		 * The meta object literal for the '<em><b>The Automovil</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPARACION__THE_AUTOMOVIL = eINSTANCE.getReparacion_TheAutomovil();

		/**
		 * The meta object literal for the '<em><b>The Centro Mant</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPARACION__THE_CENTRO_MANT = eINSTANCE.getReparacion_TheCentroMant();

		/**
		 * The meta object literal for the '<em><b>Nombre Responsable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPARACION__NOMBRE_RESPONSABLE = eINSTANCE.getReparacion_NombreResponsable();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPARACION__ESTADO = eINSTANCE.getReparacion_Estado();

		/**
		 * The meta object literal for the '<em><b>Numero Fallas Predecidas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPARACION__NUMERO_FALLAS_PREDECIDAS = eINSTANCE.getReparacion_NumeroFallasPredecidas();

		/**
		 * The meta object literal for the '<em><b>Numero Fallas Acertadas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPARACION__NUMERO_FALLAS_ACERTADAS = eINSTANCE.getReparacion_NumeroFallasAcertadas();

		/**
		 * The meta object literal for the '<em><b>Fecha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPARACION__FECHA = eINSTANCE.getReparacion_Fecha();

		/**
		 * The meta object literal for the '<em><b>Hora</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPARACION__HORA = eINSTANCE.getReparacion_Hora();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPARACION__ID = eINSTANCE.getReparacion_Id();

	}

} //ReparacionvehiculoPackage
