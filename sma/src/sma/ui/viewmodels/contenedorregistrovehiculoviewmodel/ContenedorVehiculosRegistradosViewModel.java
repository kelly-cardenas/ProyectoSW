/**
 */
package sma.ui.viewmodels.contenedorregistrovehiculoviewmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Vehiculos Registrados View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorVehiculosRegistradosViewModel#getOwnedByContenedorRegistroVehiculoViewModel <em>Owned By Contenedor Registro Vehiculo View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorVehiculosRegistradosViewModel#getListaVehiculo <em>Lista Vehiculo</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage#getContenedorVehiculosRegistradosViewModel()
 * @model
 * @generated
 */
public interface ContenedorVehiculosRegistradosViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By Contenedor Registro Vehiculo View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel#getTheContenedorVehiculosRegistradosViewModel <em>The Contenedor Vehiculos Registrados View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Contenedor Registro Vehiculo View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Contenedor Registro Vehiculo View Model</em>' container reference.
	 * @see #setOwnedByContenedorRegistroVehiculoViewModel(ContenedorRegistroVehiculoViewModel)
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage#getContenedorVehiculosRegistradosViewModel_OwnedByContenedorRegistroVehiculoViewModel()
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel#getTheContenedorVehiculosRegistradosViewModel
	 * @model opposite="theContenedorVehiculosRegistradosViewModel" transient="false"
	 * @generated
	 */
	ContenedorRegistroVehiculoViewModel getOwnedByContenedorRegistroVehiculoViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorVehiculosRegistradosViewModel#getOwnedByContenedorRegistroVehiculoViewModel <em>Owned By Contenedor Registro Vehiculo View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Contenedor Registro Vehiculo View Model</em>' container reference.
	 * @see #getOwnedByContenedorRegistroVehiculoViewModel()
	 * @generated
	 */
	void setOwnedByContenedorRegistroVehiculoViewModel(ContenedorRegistroVehiculoViewModel value);

	/**
	 * Returns the value of the '<em><b>Lista Vehiculo</b></em>' containment reference list.
	 * The list contents are of type {@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel}.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel#getThe0ContenedorVehiculosRegistradosViewModel <em>The0 Contenedor Vehiculos Registrados View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Vehiculo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Vehiculo</em>' containment reference list.
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage#getContenedorVehiculosRegistradosViewModel_ListaVehiculo()
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel#getThe0ContenedorVehiculosRegistradosViewModel
	 * @model opposite="the0ContenedorVehiculosRegistradosViewModel" containment="true"
	 * @generated
	 */
	EList<VehiculoViewModel> getListaVehiculo();

} // ContenedorVehiculosRegistradosViewModel
