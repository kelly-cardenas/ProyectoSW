/**
 */
package sma.ui.viewmodels.contenedorcrudcmviewmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage
 * @generated
 */
public interface ContenedorcrudcmviewmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContenedorcrudcmviewmodelFactory eINSTANCE = sma.ui.viewmodels.contenedorcrudcmviewmodel.impl.ContenedorcrudcmviewmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Centro Mant View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Centro Mant View Model</em>'.
	 * @generated
	 */
	CentroMantViewModel createCentroMantViewModel();

	/**
	 * Returns a new object of class '<em>Contenedor CRUDCM View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor CRUDCM View Model</em>'.
	 * @generated
	 */
	ContenedorCRUDCMViewModel createContenedorCRUDCMViewModel();

	/**
	 * Returns a new object of class '<em>Contenedor Detalle CM View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor Detalle CM View Model</em>'.
	 * @generated
	 */
	ContenedorDetalleCMViewModel createContenedorDetalleCMViewModel();

	/**
	 * Returns a new object of class '<em>Contenedor Informacion CM View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor Informacion CM View Model</em>'.
	 * @generated
	 */
	ContenedorInformacionCMViewModel createContenedorInformacionCMViewModel();

	/**
	 * Returns a new object of class '<em>Contenedor Maestro CM View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor Maestro CM View Model</em>'.
	 * @generated
	 */
	ContenedorMaestroCMViewModel createContenedorMaestroCMViewModel();

	/**
	 * Returns a new object of class '<em>Contenedor Ubicacion View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor Ubicacion View Model</em>'.
	 * @generated
	 */
	ContenedorUbicacionViewModel createContenedorUbicacionViewModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContenedorcrudcmviewmodelPackage getContenedorcrudcmviewmodelPackage();

} //ContenedorcrudcmviewmodelFactory
