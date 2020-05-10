/**
 */
package sma.ui.viewmodels.contenedorescaneoviewmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage
 * @generated
 */
public interface ContenedorescaneoviewmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContenedorescaneoviewmodelFactory eINSTANCE = sma.ui.viewmodels.contenedorescaneoviewmodel.impl.ContenedorescaneoviewmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Contenedor Escaneo View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor Escaneo View Model</em>'.
	 * @generated
	 */
	ContenedorEscaneoViewModel createContenedorEscaneoViewModel();

	/**
	 * Returns a new object of class '<em>Contenedor Fallas View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor Fallas View Model</em>'.
	 * @generated
	 */
	ContenedorFallasViewModel createContenedorFallasViewModel();

	/**
	 * Returns a new object of class '<em>Contenedor Seleccionauto View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenedor Seleccionauto View Model</em>'.
	 * @generated
	 */
	ContenedorSeleccionautoViewModel createContenedorSeleccionautoViewModel();

	/**
	 * Returns a new object of class '<em>Lista Fallas View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lista Fallas View Model</em>'.
	 * @generated
	 */
	ListaFallasViewModel createListaFallasViewModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContenedorescaneoviewmodelPackage getContenedorescaneoviewmodelPackage();

} //ContenedorescaneoviewmodelFactory
