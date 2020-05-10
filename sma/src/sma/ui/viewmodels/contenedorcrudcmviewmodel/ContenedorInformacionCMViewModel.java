/**
 */
package sma.ui.viewmodels.contenedorcrudcmviewmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Informacion CM View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel#getOwnedByContenedorDetalleCMViewModel <em>Owned By Contenedor Detalle CM View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel#getNombrecm <em>Nombrecm</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel#getNombrerepresentante <em>Nombrerepresentante</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getContenedorInformacionCMViewModel()
 * @model
 * @generated
 */
public interface ContenedorInformacionCMViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By Contenedor Detalle CM View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel#getTheContenedorInformacionCMViewModel <em>The Contenedor Informacion CM View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Contenedor Detalle CM View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Contenedor Detalle CM View Model</em>' container reference.
	 * @see #setOwnedByContenedorDetalleCMViewModel(ContenedorDetalleCMViewModel)
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getContenedorInformacionCMViewModel_OwnedByContenedorDetalleCMViewModel()
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorDetalleCMViewModel#getTheContenedorInformacionCMViewModel
	 * @model opposite="theContenedorInformacionCMViewModel" transient="false"
	 * @generated
	 */
	ContenedorDetalleCMViewModel getOwnedByContenedorDetalleCMViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel#getOwnedByContenedorDetalleCMViewModel <em>Owned By Contenedor Detalle CM View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Contenedor Detalle CM View Model</em>' container reference.
	 * @see #getOwnedByContenedorDetalleCMViewModel()
	 * @generated
	 */
	void setOwnedByContenedorDetalleCMViewModel(ContenedorDetalleCMViewModel value);

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
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getContenedorInformacionCMViewModel_Nombrecm()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getNombrecm();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel#getNombrecm <em>Nombrecm</em>}' attribute.
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
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getContenedorInformacionCMViewModel_Nombrerepresentante()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getNombrerepresentante();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel#getNombrerepresentante <em>Nombrerepresentante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombrerepresentante</em>' attribute.
	 * @see #getNombrerepresentante()
	 * @generated
	 */
	void setNombrerepresentante(String value);

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorcrudcmviewmodelPackage#getContenedorInformacionCMViewModel_Descripcion()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorcrudcmviewmodel.ContenedorInformacionCMViewModel#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

} // ContenedorInformacionCMViewModel
