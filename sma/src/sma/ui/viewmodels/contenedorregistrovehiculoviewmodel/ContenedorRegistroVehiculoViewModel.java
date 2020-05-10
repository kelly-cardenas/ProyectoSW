/**
 */
package sma.ui.viewmodels.contenedorregistrovehiculoviewmodel;

import org.eclipse.emf.ecore.EObject;

import sma.ui.UI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Registro Vehiculo View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel#getOwnedByUI <em>Owned By UI</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel#getTheContenedorDetalleVehiculoViewModel <em>The Contenedor Detalle Vehiculo View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel#getTheContenedorVehiculosRegistradosViewModel <em>The Contenedor Vehiculos Registrados View Model</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage#getContenedorRegistroVehiculoViewModel()
 * @model
 * @generated
 */
public interface ContenedorRegistroVehiculoViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By UI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.UI#getTheContenedorRegistroVehiculoViewModel <em>The Contenedor Registro Vehiculo View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By UI</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By UI</em>' container reference.
	 * @see #setOwnedByUI(UI)
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage#getContenedorRegistroVehiculoViewModel_OwnedByUI()
	 * @see sma.ui.UI#getTheContenedorRegistroVehiculoViewModel
	 * @model opposite="theContenedorRegistroVehiculoViewModel" transient="false"
	 * @generated
	 */
	UI getOwnedByUI();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel#getOwnedByUI <em>Owned By UI</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By UI</em>' container reference.
	 * @see #getOwnedByUI()
	 * @generated
	 */
	void setOwnedByUI(UI value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Detalle Vehiculo View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel#getOwnedByContenedorRegistroVehiculoViewModel <em>Owned By Contenedor Registro Vehiculo View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Detalle Vehiculo View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Detalle Vehiculo View Model</em>' containment reference.
	 * @see #setTheContenedorDetalleVehiculoViewModel(ContenedorDetalleVehiculoViewModel)
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage#getContenedorRegistroVehiculoViewModel_TheContenedorDetalleVehiculoViewModel()
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorDetalleVehiculoViewModel#getOwnedByContenedorRegistroVehiculoViewModel
	 * @model opposite="ownedByContenedorRegistroVehiculoViewModel" containment="true"
	 * @generated
	 */
	ContenedorDetalleVehiculoViewModel getTheContenedorDetalleVehiculoViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel#getTheContenedorDetalleVehiculoViewModel <em>The Contenedor Detalle Vehiculo View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Detalle Vehiculo View Model</em>' containment reference.
	 * @see #getTheContenedorDetalleVehiculoViewModel()
	 * @generated
	 */
	void setTheContenedorDetalleVehiculoViewModel(ContenedorDetalleVehiculoViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Vehiculos Registrados View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorVehiculosRegistradosViewModel#getOwnedByContenedorRegistroVehiculoViewModel <em>Owned By Contenedor Registro Vehiculo View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Vehiculos Registrados View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Vehiculos Registrados View Model</em>' containment reference.
	 * @see #setTheContenedorVehiculosRegistradosViewModel(ContenedorVehiculosRegistradosViewModel)
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelPackage#getContenedorRegistroVehiculoViewModel_TheContenedorVehiculosRegistradosViewModel()
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorVehiculosRegistradosViewModel#getOwnedByContenedorRegistroVehiculoViewModel
	 * @model opposite="ownedByContenedorRegistroVehiculoViewModel" containment="true"
	 * @generated
	 */
	ContenedorVehiculosRegistradosViewModel getTheContenedorVehiculosRegistradosViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel#getTheContenedorVehiculosRegistradosViewModel <em>The Contenedor Vehiculos Registrados View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Vehiculos Registrados View Model</em>' containment reference.
	 * @see #getTheContenedorVehiculosRegistradosViewModel()
	 * @generated
	 */
	void setTheContenedorVehiculosRegistradosViewModel(ContenedorVehiculosRegistradosViewModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="sma.String" eventoDataType="sma.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\n\t\tString action = \"\";\n\t\treturn action;\n'"
	 * @generated
	 */
	String upadateDialog(String evento);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tContenedorDetalleVehiculoViewModel detalleVehiculoVM \t\t\t\t= getTheContenedorDetalleVehiculoViewModel();\r\n\t\tContenedorVehiculosRegistradosViewModel vehiculosRegistradosVM \t= getTheContenedorVehiculosRegistradosViewModel();\r\n\t\t\r\n\t\t\r\n\t\tif ( detalleVehiculoVM == null ) {\r\n\t\t\tdetalleVehiculoVM\t= sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelFactory\r\n\t\t\t\t\t\t\t\t\t.eINSTANCE.createContenedorDetalleVehiculoViewModel();\r\n\t\t}\r\n\t\t\r\n\t\tif ( vehiculosRegistradosVM == null ) {\r\n\t\t\tvehiculosRegistradosVM = sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorregistrovehiculoviewmodelFactory\r\n\t\t\t\t\t\t\t\t\t.eINSTANCE.createContenedorVehiculosRegistradosViewModel();\r\n\t\t}\r\n\t\t\r\n\t\tsetTheContenedorDetalleVehiculoViewModel(detalleVehiculoVM);\r\n\t\tsetTheContenedorVehiculosRegistradosViewModel(vehiculosRegistradosVM);\r\n'"
	 * @generated
	 */
	void implementarModelo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\tgetOwnedByUI().registrarVehiculo(this);'"
	 * @generated
	 */
	void registrarVehiculo();

} // ContenedorRegistroVehiculoViewModel
