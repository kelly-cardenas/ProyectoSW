/**
 */
package sma.ui.viewmodels.contenedorloginviewmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sma.ui.viewmodels.contenedorloginviewmodel.ContenedorloginviewmodelPackage
 * @generated
 */
public interface ContenedorloginviewmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContenedorloginviewmodelFactory eINSTANCE = sma.ui.viewmodels.contenedorloginviewmodel.impl.ContenedorloginviewmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Contenedor Detalle Login View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor Detalle Login View Model</em>'.
	 * @generated
	 */
	ContenedorDetalleLoginViewModel createContenedorDetalleLoginViewModel();

	/**
	 * Returns a new object of class '<em>Contenedor Login View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor Login View Model</em>'.
	 * @generated
	 */
	ContenedorLoginViewModel createContenedorLoginViewModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContenedorloginviewmodelPackage getContenedorloginviewmodelPackage();

} //ContenedorloginviewmodelFactory
