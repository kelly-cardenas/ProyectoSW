/**
 */
package sma.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ubicacion CM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.domain.UbicacionCM#getPais <em>Pais</em>}</li>
 *   <li>{@link sma.domain.UbicacionCM#getDepartamento <em>Departamento</em>}</li>
 *   <li>{@link sma.domain.UbicacionCM#getCiudad <em>Ciudad</em>}</li>
 *   <li>{@link sma.domain.UbicacionCM#getDireccion <em>Direccion</em>}</li>
 *   <li>{@link sma.domain.UbicacionCM#getOwnedBy <em>Owned By</em>}</li>
 * </ul>
 *
 * @see sma.domain.DomainPackage#getUbicacionCM()
 * @model
 * @generated
 */
public interface UbicacionCM extends EObject {
	/**
	 * Returns the value of the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pais</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pais</em>' attribute.
	 * @see #setPais(String)
	 * @see sma.domain.DomainPackage#getUbicacionCM_Pais()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getPais();

	/**
	 * Sets the value of the '{@link sma.domain.UbicacionCM#getPais <em>Pais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pais</em>' attribute.
	 * @see #getPais()
	 * @generated
	 */
	void setPais(String value);

	/**
	 * Returns the value of the '<em><b>Departamento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Departamento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departamento</em>' attribute.
	 * @see #setDepartamento(String)
	 * @see sma.domain.DomainPackage#getUbicacionCM_Departamento()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getDepartamento();

	/**
	 * Sets the value of the '{@link sma.domain.UbicacionCM#getDepartamento <em>Departamento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departamento</em>' attribute.
	 * @see #getDepartamento()
	 * @generated
	 */
	void setDepartamento(String value);

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
	 * @see sma.domain.DomainPackage#getUbicacionCM_Ciudad()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getCiudad();

	/**
	 * Sets the value of the '{@link sma.domain.UbicacionCM#getCiudad <em>Ciudad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ciudad</em>' attribute.
	 * @see #getCiudad()
	 * @generated
	 */
	void setCiudad(String value);

	/**
	 * Returns the value of the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direccion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direccion</em>' attribute.
	 * @see #setDireccion(String)
	 * @see sma.domain.DomainPackage#getUbicacionCM_Direccion()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getDireccion();

	/**
	 * Sets the value of the '{@link sma.domain.UbicacionCM#getDireccion <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direccion</em>' attribute.
	 * @see #getDireccion()
	 * @generated
	 */
	void setDireccion(String value);

	/**
	 * Returns the value of the '<em><b>Owned By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sma.domain.CentroMant#getUbicacion <em>Ubicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By</em>' reference.
	 * @see #setOwnedBy(CentroMant)
	 * @see sma.domain.DomainPackage#getUbicacionCM_OwnedBy()
	 * @see sma.domain.CentroMant#getUbicacion
	 * @model opposite="ubicacion"
	 * @generated
	 */
	CentroMant getOwnedBy();

	/**
	 * Sets the value of the '{@link sma.domain.UbicacionCM#getOwnedBy <em>Owned By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By</em>' reference.
	 * @see #getOwnedBy()
	 * @generated
	 */
	void setOwnedBy(CentroMant value);

} // UbicacionCM
