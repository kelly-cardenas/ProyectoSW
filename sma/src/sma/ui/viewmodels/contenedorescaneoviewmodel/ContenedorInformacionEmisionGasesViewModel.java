/**
 */
package sma.ui.viewmodels.contenedorescaneoviewmodel;

import sma.ui.viewmodels.ViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenedor Informacion Emision Gases View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel#getOwnedByContenedorEscaneoViewModel <em>Owned By Contenedor Escaneo View Model</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel#getGasesofensivos <em>Gasesofensivos</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel#getGasesnocivos <em>Gasesnocivos</em>}</li>
 *   <li>{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel#getEstadovehiculo <em>Estadovehiculo</em>}</li>
 * </ul>
 *
 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getContenedorInformacionEmisionGasesViewModel()
 * @model
 * @generated
 */
public interface ContenedorInformacionEmisionGasesViewModel extends ViewModel {
	/**
	 * Returns the value of the '<em><b>Owned By Contenedor Escaneo View Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getTheContenedorInformacionEmisionGasesViewModel <em>The Contenedor Informacion Emision Gases View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Contenedor Escaneo View Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Contenedor Escaneo View Model</em>' container reference.
	 * @see #setOwnedByContenedorEscaneoViewModel(ContenedorEscaneoViewModel)
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getContenedorInformacionEmisionGasesViewModel_OwnedByContenedorEscaneoViewModel()
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorEscaneoViewModel#getTheContenedorInformacionEmisionGasesViewModel
	 * @model opposite="theContenedorInformacionEmisionGasesViewModel" transient="false"
	 * @generated
	 */
	ContenedorEscaneoViewModel getOwnedByContenedorEscaneoViewModel();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel#getOwnedByContenedorEscaneoViewModel <em>Owned By Contenedor Escaneo View Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Contenedor Escaneo View Model</em>' container reference.
	 * @see #getOwnedByContenedorEscaneoViewModel()
	 * @generated
	 */
	void setOwnedByContenedorEscaneoViewModel(ContenedorEscaneoViewModel value);

	/**
	 * Returns the value of the '<em><b>Gasesofensivos</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gasesofensivos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gasesofensivos</em>' attribute.
	 * @see #setGasesofensivos(String)
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getContenedorInformacionEmisionGasesViewModel_Gasesofensivos()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getGasesofensivos();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel#getGasesofensivos <em>Gasesofensivos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gasesofensivos</em>' attribute.
	 * @see #getGasesofensivos()
	 * @generated
	 */
	void setGasesofensivos(String value);

	/**
	 * Returns the value of the '<em><b>Gasesnocivos</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gasesnocivos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gasesnocivos</em>' attribute.
	 * @see #setGasesnocivos(String)
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getContenedorInformacionEmisionGasesViewModel_Gasesnocivos()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getGasesnocivos();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel#getGasesnocivos <em>Gasesnocivos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gasesnocivos</em>' attribute.
	 * @see #getGasesnocivos()
	 * @generated
	 */
	void setGasesnocivos(String value);

	/**
	 * Returns the value of the '<em><b>Estadovehiculo</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estadovehiculo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estadovehiculo</em>' attribute.
	 * @see #setEstadovehiculo(String)
	 * @see sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorescaneoviewmodelPackage#getContenedorInformacionEmisionGasesViewModel_Estadovehiculo()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getEstadovehiculo();

	/**
	 * Sets the value of the '{@link sma.ui.viewmodels.contenedorescaneoviewmodel.ContenedorInformacionEmisionGasesViewModel#getEstadovehiculo <em>Estadovehiculo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estadovehiculo</em>' attribute.
	 * @see #getEstadovehiculo()
	 * @generated
	 */
	void setEstadovehiculo(String value);

} // ContenedorInformacionEmisionGasesViewModel
