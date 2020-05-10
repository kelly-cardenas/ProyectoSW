/**
 */
package sma.ui;

import org.eclipse.emf.ecore.EObject;

import sma.ModelFactory;

import sma.domain.Domain;

import sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel;

import sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel;

import sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.UI#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link sma.ui.UI#getIdLogueado <em>Id Logueado</em>}</li>
 *   <li>{@link sma.ui.UI#getTipoLogueado <em>Tipo Logueado</em>}</li>
 *   <li>{@link sma.ui.UI#getTheDomain <em>The Domain</em>}</li>
 *   <li>{@link sma.ui.UI#getTheContenedorCrudClienteViewModel <em>The Contenedor Crud Cliente View Model</em>}</li>
 *   <li>{@link sma.ui.UI#getTheContenedorCRUDCMViewModel <em>The Contenedor CRUDCM View Model</em>}</li>
 *   <li>{@link sma.ui.UI#getTheContenedorRegistroVehiculoViewModel <em>The Contenedor Registro Vehiculo View Model</em>}</li>
 * </ul>
 *
 * @see sma.ui.UiPackage#getUI()
 * @model
 * @generated
 */
public interface UI extends EObject {
	/**
	 * Returns the value of the '<em><b>The Model Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ModelFactory#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Model Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Model Factory</em>' container reference.
	 * @see #setTheModelFactory(ModelFactory)
	 * @see sma.ui.UiPackage#getUI_TheModelFactory()
	 * @see sma.ModelFactory#getTheUI
	 * @model opposite="theUI" transient="false"
	 * @generated
	 */
	ModelFactory getTheModelFactory();

	/**
	 * Sets the value of the '{@link sma.ui.UI#getTheModelFactory <em>The Model Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Model Factory</em>' container reference.
	 * @see #getTheModelFactory()
	 * @generated
	 */
	void setTheModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>Id Logueado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Logueado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Logueado</em>' attribute.
	 * @see #setIdLogueado(String)
	 * @see sma.ui.UiPackage#getUI_IdLogueado()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getIdLogueado();

	/**
	 * Sets the value of the '{@link sma.ui.UI#getIdLogueado <em>Id Logueado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Logueado</em>' attribute.
	 * @see #getIdLogueado()
	 * @generated
	 */
	void setIdLogueado(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Logueado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Logueado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Logueado</em>' attribute.
	 * @see #setTipoLogueado(String)
	 * @see sma.ui.UiPackage#getUI_TipoLogueado()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getTipoLogueado();

	/**
	 * Sets the value of the '{@link sma.ui.UI#getTipoLogueado <em>Tipo Logueado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Logueado</em>' attribute.
	 * @see #getTipoLogueado()
	 * @generated
	 */
	void setTipoLogueado(String value);

	/**
	 * Returns the value of the '<em><b>The Domain</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sma.domain.Domain#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain</em>' reference.
	 * @see #setTheDomain(Domain)
	 * @see sma.ui.UiPackage#getUI_TheDomain()
	 * @see sma.domain.Domain#getTheUI
	 * @model opposite="theUI"
	 * @generated
	 */
	Domain getTheDomain();

	/**
	 * Sets the value of the '{@link sma.ui.UI#getTheDomain <em>The Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Domain</em>' reference.
	 * @see #getTheDomain()
	 * @generated
	 */
	void setTheDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Crud Cliente View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel#getOwnedByUI <em>Owned By UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Crud Cliente View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Crud Cliente View Model</em>' containment reference.
	 * @see #setTheContenedorCrudClienteViewModel(ContenedorCrudClienteViewModel)
	 * @see sma.ui.UiPackage#getUI_TheContenedorCrudClienteViewModel()
	 * @see sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorCrudClienteViewModel#getOwnedByUI
	 * @model opposite="ownedByUI" containment="true"
	 * @generated
	 */
	ContenedorCrudClienteViewModel getTheContenedorCrudClienteViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.UI#getTheContenedorCrudClienteViewModel <em>The Contenedor Crud Cliente View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Crud Cliente View Model</em>' containment reference.
	 * @see #getTheContenedorCrudClienteViewModel()
	 * @generated
	 */
	void setTheContenedorCrudClienteViewModel(ContenedorCrudClienteViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor CRUDCM View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel#getOwnedByUI <em>Owned By UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor CRUDCM View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor CRUDCM View Model</em>' containment reference.
	 * @see #setTheContenedorCRUDCMViewModel(ContenedorCRUDCMViewModel)
	 * @see sma.ui.UiPackage#getUI_TheContenedorCRUDCMViewModel()
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorCRUDCMViewModel#getOwnedByUI
	 * @model opposite="ownedByUI" containment="true"
	 * @generated
	 */
	ContenedorCRUDCMViewModel getTheContenedorCRUDCMViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.UI#getTheContenedorCRUDCMViewModel <em>The Contenedor CRUDCM View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor CRUDCM View Model</em>' containment reference.
	 * @see #getTheContenedorCRUDCMViewModel()
	 * @generated
	 */
	void setTheContenedorCRUDCMViewModel(ContenedorCRUDCMViewModel value);

	/**
	 * Returns the value of the '<em><b>The Contenedor Registro Vehiculo View Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel#getOwnedByUI <em>Owned By UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Contenedor Registro Vehiculo View Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Contenedor Registro Vehiculo View Model</em>' containment reference.
	 * @see #setTheContenedorRegistroVehiculoViewModel(ContenedorRegistroVehiculoViewModel)
	 * @see sma.ui.UiPackage#getUI_TheContenedorRegistroVehiculoViewModel()
	 * @see sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.ContenedorRegistroVehiculoViewModel#getOwnedByUI
	 * @model opposite="ownedByUI" containment="true"
	 * @generated
	 */
	ContenedorRegistroVehiculoViewModel getTheContenedorRegistroVehiculoViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.UI#getTheContenedorRegistroVehiculoViewModel <em>The Contenedor Registro Vehiculo View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Contenedor Registro Vehiculo View Model</em>' containment reference.
	 * @see #getTheContenedorRegistroVehiculoViewModel()
	 * @generated
	 */
	void setTheContenedorRegistroVehiculoViewModel(ContenedorRegistroVehiculoViewModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\t\t\r\n\t\t\t\t\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\tContenedorCrudClienteViewModel crudCLienteVM\t\t=getTheContenedorCrudClienteViewModel();\r\n\t\t\t\t\t\t\t\tContenedorCRUDCMViewModel crudCMVM  \t\t\t\t=getTheContenedorCRUDCMViewModel();\r\n\t\t\t\t\t\t\t\tContenedorRegistroVehiculoViewModel registroVehiVM \t=getTheContenedorRegistroVehiculoViewModel();\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\tif(crudCLienteVM == null) {\r\n\t\t\t\t\t\t\t\t\tcrudCLienteVM \t= sma.ui.viewmodels.contenedorcrudclienteviewmodel.ContenedorcrudclienteviewmodelFactory\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t.eINSTANCE.createContenedorCrudClienteViewModel();\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\tif(crudCMVM == null) {\r\n\t\t\t\t\t\t\t\t\tcrudCMVM\t\t= sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelFactory\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t.eINSTANCE.createContenedorCRUDCMViewModel();\r\n\t\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\tif( registroVehiVM == null ) {\r\n\t\t\t\t\t\t\t\t\tregistroVehiVM\t= sma.ui.viewmodels.contenedorregistrovehiculoviewmodel.\r\n\t\t\t\t\t\t\t\t\t\t\t\t\tContenedorregistrovehiculoviewmodelFactory.eINSTANCE.createContenedorRegistroVehiculoViewModel();\r\n\t\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\tsetTheContenedorCrudClienteViewModel(crudCLienteVM);\r\n\t\t\t\t\t\t\t\tsetTheContenedorCRUDCMViewModel(crudCMVM);\r\n\t\t\t\t\t\t\t\tsetTheContenedorRegistroVehiculoViewModel(registroVehiVM);\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	void implementarModelo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\t\t\r\n\t\t\t\t\r\n\t\t\t\tgetTheDomain().registrarUsuario(formulario);\r\n\t\t\t\t\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	void registrarCliente(ContenedorCrudClienteViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\t\t\r\n\t\t\t\tgetTheDomain().registrarCm(formulario);\r\n\t\t\t\t\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	void RegistrarCm(ContenedorCRUDCMViewModel formulario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\t\t\r\n\t\t\t\tgetTheDomain().registrarAutomovil(formulario, idLogueado);\r\n\t\t\t\t\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	void registrarVehiculo(ContenedorRegistroVehiculoViewModel formulario);

} // UI
