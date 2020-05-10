/**
 */
package sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel;

import sma.ui.viewmodels.ViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Busqueda View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorBusquedaViewModel#getIdcm <em>Idcm</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorBusquedaViewModel#getPlacavehiculo <em>Placavehiculo</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorBusquedaViewModel#getOwnedByContenedorSolicitudVisitaViewModel <em>Owned By Contenedor Solicitud Visita View Model</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelPackage#getContenedorBusquedaViewModel()
 * @model
 * @generated
 */
public interface ContenedorBusquedaViewModel extends ViewModel {
	/**
	 * Returns the value of the '<em><b>Idcm</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idcm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idcm</em>' attribute.
	 * @see #setIdcm(String)
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelPackage#getContenedorBusquedaViewModel_Idcm()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getIdcm();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorBusquedaViewModel#getIdcm <em>Idcm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idcm</em>' attribute.
	 * @see #getIdcm()
	 * @generated
	 */
	void setIdcm(String value);

	/**
	 * Returns the value of the '<em><b>Placavehiculo</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placavehiculo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placavehiculo</em>' attribute.
	 * @see #setPlacavehiculo(String)
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelPackage#getContenedorBusquedaViewModel_Placavehiculo()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getPlacavehiculo();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorBusquedaViewModel#getPlacavehiculo <em>Placavehiculo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placavehiculo</em>' attribute.
	 * @see #getPlacavehiculo()
	 * @generated
	 */
	void setPlacavehiculo(String value);

	/**
	 * Returns the value of the '<em><b>Owned By Contenedor Solicitud Visita View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel#getTheContenedorBusquedaViewModel <em>The Contenedor Busqueda View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Contenedor Solicitud Visita View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Contenedor Solicitud Visita View Model</em>' container reference.
	 * @see #setOwnedByContenedorSolicitudVisitaViewModel(ContenedorSolicitudVisitaViewModel)
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorsolicitudvisitaviewmodelPackage#getContenedorBusquedaViewModel_OwnedByContenedorSolicitudVisitaViewModel()
	 * @see sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorSolicitudVisitaViewModel#getTheContenedorBusquedaViewModel
	 * @model opposite="theContenedorBusquedaViewModel" transient="false"
	 * @generated
	 */
	ContenedorSolicitudVisitaViewModel getOwnedByContenedorSolicitudVisitaViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorsolicitudvisitaviewmodel.ContenedorBusquedaViewModel#getOwnedByContenedorSolicitudVisitaViewModel <em>Owned By Contenedor Solicitud Visita View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Contenedor Solicitud Visita View Model</em>' container reference.
	 * @see #getOwnedByContenedorSolicitudVisitaViewModel()
	 * @generated
	 */
	void setOwnedByContenedorSolicitudVisitaViewModel(ContenedorSolicitudVisitaViewModel value);

} // ContenedorBusquedaViewModel
