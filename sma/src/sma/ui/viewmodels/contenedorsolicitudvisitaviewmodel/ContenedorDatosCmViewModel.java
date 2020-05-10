/**
 */
package sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel;

import sma.ui.viewmodels.ViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Datos Cm View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel#getNombrecm <em>Nombrecm</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel#getNombrerepresentante <em>Nombrerepresentante</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel#getDireccion <em>Direccion</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel#getOwnedByContenedorSolicitudVisitaViewModel <em>Owned By Contenedor Solicitud Visita View Model</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelPackage#getContenedorDatosCmViewModel()
 * @model
 * @generated
 */
public interface ContenedorDatosCmViewModel extends ViewModel {
	/**
	 * Returns the value of the '<em><b>Nombrecm</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombrecm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombrecm</em>' attribute.
	 * @see #setNombrecm(String)
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelPackage#getContenedorDatosCmViewModel_Nombrecm()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getNombrecm();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel#getNombrecm <em>Nombrecm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombrecm</em>' attribute.
	 * @see #getNombrecm()
	 * @generated
	 */
	void setNombrecm(String value);

	/**
	 * Returns the value of the '<em><b>Nombrerepresentante</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombrerepresentante</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombrerepresentante</em>' attribute.
	 * @see #setNombrerepresentante(String)
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelPackage#getContenedorDatosCmViewModel_Nombrerepresentante()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getNombrerepresentante();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel#getNombrerepresentante <em>Nombrerepresentante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombrerepresentante</em>' attribute.
	 * @see #getNombrerepresentante()
	 * @generated
	 */
	void setNombrerepresentante(String value);

	/**
	 * Returns the value of the '<em><b>Direccion</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direccion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direccion</em>' attribute.
	 * @see #setDireccion(String)
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelPackage#getContenedorDatosCmViewModel_Direccion()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getDireccion();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel#getDireccion <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direccion</em>' attribute.
	 * @see #getDireccion()
	 * @generated
	 */
	void setDireccion(String value);

	/**
	 * Returns the value of the '<em><b>Owned By Contenedor Solicitud Visita View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel#getTheContenedorDatosCmViewModel <em>The Contenedor Datos Cm View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Contenedor Solicitud Visita View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Contenedor Solicitud Visita View Model</em>' container reference.
	 * @see #setOwnedByContenedorSolicitudVisitaViewModel(ContenedorSolicitudVisitaViewModel)
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelPackage#getContenedorDatosCmViewModel_OwnedByContenedorSolicitudVisitaViewModel()
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel#getTheContenedorDatosCmViewModel
	 * @model opposite="theContenedorDatosCmViewModel" transient="false"
	 * @generated
	 */
	ContenedorSolicitudVisitaViewModel getOwnedByContenedorSolicitudVisitaViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorDatosCmViewModel#getOwnedByContenedorSolicitudVisitaViewModel <em>Owned By Contenedor Solicitud Visita View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Contenedor Solicitud Visita View Model</em>' container reference.
	 * @see #getOwnedByContenedorSolicitudVisitaViewModel()
	 * @generated
	 */
	void setOwnedByContenedorSolicitudVisitaViewModel(ContenedorSolicitudVisitaViewModel value);

} // ContenedorDatosCmViewModel
