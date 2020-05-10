/**
 */
package sma.ui.viewmodels.contenedorregistrovehiculoviewmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehiculo View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel#getThe0ContenedorVehiculosRegistradosViewModel <em>The0 Contenedor Vehiculos Registrados View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel#getMarca <em>Marca</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel#getReferencia <em>Referencia</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel#getPlaca <em>Placa</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage#getVehiculoViewModel()
 * @model
 * @generated
 */
public interface VehiculoViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>The0 Contenedor Vehiculos Registrados View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorVehiculosRegistradosViewModel#getListaVehiculo <em>Lista Vehiculo</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The0 Contenedor Vehiculos Registrados View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The0 Contenedor Vehiculos Registrados View Model</em>' container reference.
	 * @see #setThe0ContenedorVehiculosRegistradosViewModel(ContenedorVehiculosRegistradosViewModel)
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage#getVehiculoViewModel_The0ContenedorVehiculosRegistradosViewModel()
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorVehiculosRegistradosViewModel#getListaVehiculo
	 * @model opposite="listaVehiculo" transient="false"
	 * @generated
	 */
	ContenedorVehiculosRegistradosViewModel getThe0ContenedorVehiculosRegistradosViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel#getThe0ContenedorVehiculosRegistradosViewModel <em>The0 Contenedor Vehiculos Registrados View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The0 Contenedor Vehiculos Registrados View Model</em>' container reference.
	 * @see #getThe0ContenedorVehiculosRegistradosViewModel()
	 * @generated
	 */
	void setThe0ContenedorVehiculosRegistradosViewModel(ContenedorVehiculosRegistradosViewModel value);

	/**
	 * Returns the value of the '<em><b>Marca</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marca</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marca</em>' attribute.
	 * @see #setMarca(String)
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage#getVehiculoViewModel_Marca()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getMarca();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel#getMarca <em>Marca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marca</em>' attribute.
	 * @see #getMarca()
	 * @generated
	 */
	void setMarca(String value);

	/**
	 * Returns the value of the '<em><b>Referencia</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referencia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencia</em>' attribute.
	 * @see #setReferencia(String)
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage#getVehiculoViewModel_Referencia()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getReferencia();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel#getReferencia <em>Referencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referencia</em>' attribute.
	 * @see #getReferencia()
	 * @generated
	 */
	void setReferencia(String value);

	/**
	 * Returns the value of the '<em><b>Placa</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placa</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placa</em>' attribute.
	 * @see #setPlaca(String)
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage#getVehiculoViewModel_Placa()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getPlaca();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.VehiculoViewModel#getPlaca <em>Placa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placa</em>' attribute.
	 * @see #getPlaca()
	 * @generated
	 */
	void setPlaca(String value);

} // VehiculoViewModel
