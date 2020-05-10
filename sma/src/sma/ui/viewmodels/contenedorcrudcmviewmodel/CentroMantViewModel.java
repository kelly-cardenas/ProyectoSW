/**
 */
package sma.ui.viewmodels.contenedorcrudcmviewmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Centro Mant View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel#getNombrecm <em>Nombrecm</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel#getNombrerepresentante <em>Nombrerepresentante</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel#getCiudad <em>Ciudad</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel#getThe0ContenedorMaestroCMViewModel <em>The0 Contenedor Maestro CM View Model</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getCentroMantViewModel()
 * @model
 * @generated
 */
public interface CentroMantViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombrecm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombrecm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombrecm</em>' attribute.
	 * @see #setNombrecm(String)
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getCentroMantViewModel_Nombrecm()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getNombrecm();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel#getNombrecm <em>Nombrecm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombrecm</em>' attribute.
	 * @see #getNombrecm()
	 * @generated
	 */
	void setNombrecm(String value);

	/**
	 * Returns the value of the '<em><b>Nombrerepresentante</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombrerepresentante</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombrerepresentante</em>' attribute.
	 * @see #setNombrerepresentante(String)
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getCentroMantViewModel_Nombrerepresentante()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getNombrerepresentante();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel#getNombrerepresentante <em>Nombrerepresentante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombrerepresentante</em>' attribute.
	 * @see #getNombrerepresentante()
	 * @generated
	 */
	void setNombrerepresentante(String value);

	/**
	 * Returns the value of the '<em><b>Ciudad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ciudad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ciudad</em>' attribute.
	 * @see #setCiudad(String)
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getCentroMantViewModel_Ciudad()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getCiudad();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel#getCiudad <em>Ciudad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ciudad</em>' attribute.
	 * @see #getCiudad()
	 * @generated
	 */
	void setCiudad(String value);

	/**
	 * Returns the value of the '<em><b>The0 Contenedor Maestro CM View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorMaestroCMViewModel#getCentroMantViewModel <em>Centro Mant View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The0 Contenedor Maestro CM View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The0 Contenedor Maestro CM View Model</em>' container reference.
	 * @see #setThe0ContenedorMaestroCMViewModel(ContenedorMaestroCMViewModel)
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getCentroMantViewModel_The0ContenedorMaestroCMViewModel()
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorMaestroCMViewModel#getCentroMantViewModel
	 * @model opposite="CentroMantViewModel" transient="false"
	 * @generated
	 */
	ContenedorMaestroCMViewModel getThe0ContenedorMaestroCMViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.CentroMantViewModel#getThe0ContenedorMaestroCMViewModel <em>The0 Contenedor Maestro CM View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The0 Contenedor Maestro CM View Model</em>' container reference.
	 * @see #getThe0ContenedorMaestroCMViewModel()
	 * @generated
	 */
	void setThe0ContenedorMaestroCMViewModel(ContenedorMaestroCMViewModel value);

} // CentroMantViewModel
