/**
 */
package sma.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ubicacion Usu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.domain.UbicacionUsu#getPais <em>Pais</em>}</li>
 *   <li>{@link sma.domain.UbicacionUsu#getDepartamento <em>Departamento</em>}</li>
 *   <li>{@link sma.domain.UbicacionUsu#getCiudad <em>Ciudad</em>}</li>
 *   <li>{@link sma.domain.UbicacionUsu#getOwnerBy <em>Owner By</em>}</li>
 * </ul>
 *
 * @see sma.domain.DomainPackage#getUbicacionUsu()
 * @model
 * @generated
 */
public interface UbicacionUsu extends EObject {
	/**
	 * Returns the value of the '<em><b>Pais</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pais</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pais</em>' attribute.
	 * @see #setPais(String)
	 * @see sma.domain.DomainPackage#getUbicacionUsu_Pais()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getPais();

	/**
	 * Sets the value of the '{@link sma.domain.UbicacionUsu#getPais <em>Pais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pais</em>' attribute.
	 * @see #getPais()
	 * @generated
	 */
	void setPais(String value);

	/**
	 * Returns the value of the '<em><b>Departamento</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Departamento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departamento</em>' attribute.
	 * @see #setDepartamento(String)
	 * @see sma.domain.DomainPackage#getUbicacionUsu_Departamento()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getDepartamento();

	/**
	 * Sets the value of the '{@link sma.domain.UbicacionUsu#getDepartamento <em>Departamento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departamento</em>' attribute.
	 * @see #getDepartamento()
	 * @generated
	 */
	void setDepartamento(String value);

	/**
	 * Returns the value of the '<em><b>Ciudad</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ciudad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ciudad</em>' attribute.
	 * @see #setCiudad(String)
	 * @see sma.domain.DomainPackage#getUbicacionUsu_Ciudad()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getCiudad();

	/**
	 * Sets the value of the '{@link sma.domain.UbicacionUsu#getCiudad <em>Ciudad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ciudad</em>' attribute.
	 * @see #getCiudad()
	 * @generated
	 */
	void setCiudad(String value);

	/**
	 * Returns the value of the '<em><b>Owner By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.domain.Usuario#getUbicacion <em>Ubicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner By</em>' container reference.
	 * @see #setOwnerBy(Usuario)
	 * @see sma.domain.DomainPackage#getUbicacionUsu_OwnerBy()
	 * @see sma.domain.Usuario#getUbicacion
	 * @model opposite="ubicacion" transient="false"
	 * @generated
	 */
	Usuario getOwnerBy();

	/**
	 * Sets the value of the '{@link sma.domain.UbicacionUsu#getOwnerBy <em>Owner By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner By</em>' container reference.
	 * @see #getOwnerBy()
	 * @generated
	 */
	void setOwnerBy(Usuario value);

} // UbicacionUsu
