/**
 */
package sma.ui.viewmodels.contenedorcrudclienteviewmodel;

import org.eclipse.emf.ecore.EObject;

import sma.ui.UI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Crud Cliente View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel#getOwnedByUI <em>Owned By UI</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel#getTheContenedorDetalleClienteViewModel <em>The Contenedor Detalle Cliente View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel#getTheContenedorMaestroClienteViewModel <em>The Contenedor Maestro Cliente View Model</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage#getContenedorCrudClienteViewModel()
 * @model
 * @generated
 */
public interface ContenedorCrudClienteViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By UI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.UI#getTheContenedorCrudClienteViewModel <em>The Contenedor Crud Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By UI</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By UI</em>' container reference.
	 * @see #setOwnedByUI(UI)
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage#getContenedorCrudClienteViewModel_OwnedByUI()
	 * @see sma.ui.UI#getTheContenedorCrudClienteViewModel
	 * @model opposite="theContenedorCrudClienteViewModel" transient="false"
	 * @generated
	 */
	UI getOwnedByUI();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel#getOwnedByUI <em>Owned By UI</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By UI</em>' container reference.
	 * @see #getOwnedByUI()
	 * @generated
	 */
	void setOwnedByUI(UI value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Detalle Cliente View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel#getOwnedByContenedorCrudClienteViewModel <em>Owned By Contenedor Crud Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Detalle Cliente View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Detalle Cliente View Model</em>' containment reference.
	 * @see #setTheContenedorDetalleClienteViewModel(ContenedorDetalleClienteViewModel)
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage#getContenedorCrudClienteViewModel_TheContenedorDetalleClienteViewModel()
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorDetalleClienteViewModel#getOwnedByContenedorCrudClienteViewModel
	 * @model opposite="ownedByContenedorCrudClienteViewModel" containment="true"
	 * @generated
	 */
	ContenedorDetalleClienteViewModel getTheContenedorDetalleClienteViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel#getTheContenedorDetalleClienteViewModel <em>The Contenedor Detalle Cliente View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Detalle Cliente View Model</em>' containment reference.
	 * @see #getTheContenedorDetalleClienteViewModel()
	 * @generated
	 */
	void setTheContenedorDetalleClienteViewModel(ContenedorDetalleClienteViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Maestro Cliente View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorMaestroClienteViewModel#getOwnedByContenedorCrudClienteViewModel <em>Owned By Contenedor Crud Cliente View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Maestro Cliente View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Maestro Cliente View Model</em>' containment reference.
	 * @see #setTheContenedorMaestroClienteViewModel(ContenedorMaestroClienteViewModel)
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelPackage#getContenedorCrudClienteViewModel_TheContenedorMaestroClienteViewModel()
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorMaestroClienteViewModel#getOwnedByContenedorCrudClienteViewModel
	 * @model opposite="ownedByContenedorCrudClienteViewModel" containment="true"
	 * @generated
	 */
	ContenedorMaestroClienteViewModel getTheContenedorMaestroClienteViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel#getTheContenedorMaestroClienteViewModel <em>The Contenedor Maestro Cliente View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Maestro Cliente View Model</em>' containment reference.
	 * @see #getTheContenedorMaestroClienteViewModel()
	 * @generated
	 */
	void setTheContenedorMaestroClienteViewModel(ContenedorMaestroClienteViewModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="sma.String" eventoDataType="sma.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\t\t\r\n\t\t\t\t\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tString action = \"\";\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\treturn action;\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	String upadateDialog(String evento);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\t\t\r\n\t\t// --prueba\r\n\t\tContenedorDetalleClienteViewModel detalleClienteVM = getTheContenedorDetalleClienteViewModel();\r\n\t\tContenedorMaestroClienteViewModel maestroClienteVM = getTheContenedorMaestroClienteViewModel();\r\n\r\n\t\tif (detalleClienteVM == null) {\r\n\t\t\tdetalleClienteVM = sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelFactory.eINSTANCE\r\n\t\t\t\t\t.createContenedorDetalleClienteViewModel();\r\n\t\t}\r\n\r\n\t\tif (maestroClienteVM == null) {\r\n\t\t\tmaestroClienteVM = sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelFactory.eINSTANCE\r\n\t\t\t\t\t.createContenedorMaestroClienteViewModel();\r\n\t\t}\r\n\r\n\t\tsetTheContenedorDetalleClienteViewModel(detalleClienteVM);\r\n\t\tsetTheContenedorMaestroClienteViewModel(maestroClienteVM);\r\n\r\n\t\tdetalleClienteVM.implementarModelo();\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	void implementarModelo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\t\t\r\n\t\t\t\t\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tgetOwnedByUI().registrarCliente(this);\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	void registrarCliente();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\t\t\r\n\t\t\t\t\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\tgetOwnedByUI().actualizarCrudCliente(this);\r\n\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	void actualizarCrudCliente();

} // ContenedorCrudClienteViewModel
