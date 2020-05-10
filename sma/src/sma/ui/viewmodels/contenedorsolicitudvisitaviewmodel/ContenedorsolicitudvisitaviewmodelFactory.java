/**
 */
package sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelPackage
 * @generated
 */
public interface ContenedorsolicitudvisitaviewmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContenedorsolicitudvisitaviewmodelFactory eINSTANCE = sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.impl.ContenedorsolicitudvisitaviewmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Contenedor Busqueda View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor Busqueda View Model</em>'.
	 * @generated
	 */
	ContenedorBusquedaViewModel createContenedorBusquedaViewModel();

	/**
	 * Returns a new object of class '<em>Contenedor Datos Cm View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor Datos Cm View Model</em>'.
	 * @generated
	 */
	ContenedorDatosCmViewModel createContenedorDatosCmViewModel();

	/**
	 * Returns a new object of class '<em>Contenedor Solicitud Visita View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor Solicitud Visita View Model</em>'.
	 * @generated
	 */
	ContenedorSolicitudVisitaViewModel createContenedorSolicitudVisitaViewModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContenedorsolicitudvisitaviewmodelPackage getContenedorsolicitudvisitaviewmodelPackage();

} //ContenedorsolicitudvisitaviewmodelFactory
