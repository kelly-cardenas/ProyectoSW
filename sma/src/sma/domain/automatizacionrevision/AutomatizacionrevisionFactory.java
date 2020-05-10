/**
 */
package sma.domain.automatizacionrevision;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sma.domain.automatizacionrevision.AutomatizacionrevisionPackage
 * @generated
 */
public interface AutomatizacionrevisionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AutomatizacionrevisionFactory eINSTANCE = sma.domain.automatizacionrevision.impl.AutomatizacionrevisionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Falla Mecanica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Falla Mecanica</em>'.
	 * @generated
	 */
	FallaMecanica createFallaMecanica();

	/**
	 * Returns a new object of class '<em>sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>sensor</em>'.
	 * @generated
	 */
	sensor createsensor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AutomatizacionrevisionPackage getAutomatizacionrevisionPackage();

} //AutomatizacionrevisionFactory
