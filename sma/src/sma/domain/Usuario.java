/**
 */
package sma.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.domain.Usuario#getCentroMant <em>Centro Mant</em>}</li>
 *   <li>{@link sma.domain.Usuario#getOwnerByDomain <em>Owner By Domain</em>}</li>
 *   <li>{@link sma.domain.Usuario#getId <em>Id</em>}</li>
 *   <li>{@link sma.domain.Usuario#getNumDI <em>Num DI</em>}</li>
 *   <li>{@link sma.domain.Usuario#getNombres <em>Nombres</em>}</li>
 *   <li>{@link sma.domain.Usuario#getApellidos <em>Apellidos</em>}</li>
 *   <li>{@link sma.domain.Usuario#getEdad <em>Edad</em>}</li>
 *   <li>{@link sma.domain.Usuario#getEmail <em>Email</em>}</li>
 *   <li>{@link sma.domain.Usuario#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link sma.domain.Usuario#getContrasenia <em>Contrasenia</em>}</li>
 *   <li>{@link sma.domain.Usuario#getAutomoviles <em>Automoviles</em>}</li>
 *   <li>{@link sma.domain.Usuario#getUbicacion <em>Ubicacion</em>}</li>
 * </ul>
 *
 * @see sma.domain.DomainPackage#getUsuario()
 * @model
 * @generated
 */
public interface Usuario extends EObject {
	/**
	 * Returns the value of the '<em><b>Centro Mant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sma.domain.CentroMant#getUsuariosAtendidos <em>Usuarios Atendidos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centro Mant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centro Mant</em>' reference.
	 * @see #setCentroMant(CentroMant)
	 * @see sma.domain.DomainPackage#getUsuario_CentroMant()
	 * @see sma.domain.CentroMant#getUsuariosAtendidos
	 * @model opposite="usuariosAtendidos"
	 * @generated
	 */
	CentroMant getCentroMant();

	/**
	 * Sets the value of the '{@link sma.domain.Usuario#getCentroMant <em>Centro Mant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centro Mant</em>' reference.
	 * @see #getCentroMant()
	 * @generated
	 */
	void setCentroMant(CentroMant value);

	/**
	 * Returns the value of the '<em><b>Owner By Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.domain.Domain#getListaUsuarios <em>Lista Usuarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner By Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner By Domain</em>' container reference.
	 * @see #setOwnerByDomain(Domain)
	 * @see sma.domain.DomainPackage#getUsuario_OwnerByDomain()
	 * @see sma.domain.Domain#getListaUsuarios
	 * @model opposite="listaUsuarios" transient="false"
	 * @generated
	 */
	Domain getOwnerByDomain();

	/**
	 * Sets the value of the '{@link sma.domain.Usuario#getOwnerByDomain <em>Owner By Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner By Domain</em>' container reference.
	 * @see #getOwnerByDomain()
	 * @generated
	 */
	void setOwnerByDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see sma.domain.DomainPackage#getUsuario_Id()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link sma.domain.Usuario#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Num DI</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num DI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num DI</em>' attribute.
	 * @see #setNumDI(String)
	 * @see sma.domain.DomainPackage#getUsuario_NumDI()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getNumDI();

	/**
	 * Sets the value of the '{@link sma.domain.Usuario#getNumDI <em>Num DI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num DI</em>' attribute.
	 * @see #getNumDI()
	 * @generated
	 */
	void setNumDI(String value);

	/**
	 * Returns the value of the '<em><b>Nombres</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombres</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombres</em>' attribute.
	 * @see #setNombres(String)
	 * @see sma.domain.DomainPackage#getUsuario_Nombres()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getNombres();

	/**
	 * Sets the value of the '{@link sma.domain.Usuario#getNombres <em>Nombres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombres</em>' attribute.
	 * @see #getNombres()
	 * @generated
	 */
	void setNombres(String value);

	/**
	 * Returns the value of the '<em><b>Apellidos</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apellidos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apellidos</em>' attribute.
	 * @see #setApellidos(String)
	 * @see sma.domain.DomainPackage#getUsuario_Apellidos()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getApellidos();

	/**
	 * Sets the value of the '{@link sma.domain.Usuario#getApellidos <em>Apellidos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apellidos</em>' attribute.
	 * @see #getApellidos()
	 * @generated
	 */
	void setApellidos(String value);

	/**
	 * Returns the value of the '<em><b>Edad</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edad</em>' attribute.
	 * @see #setEdad(Integer)
	 * @see sma.domain.DomainPackage#getUsuario_Edad()
	 * @model default="0" dataType="sma.EIntegerObject"
	 * @generated
	 */
	Integer getEdad();

	/**
	 * Sets the value of the '{@link sma.domain.Usuario#getEdad <em>Edad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edad</em>' attribute.
	 * @see #getEdad()
	 * @generated
	 */
	void setEdad(Integer value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see sma.domain.DomainPackage#getUsuario_Email()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link sma.domain.Usuario#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Usuario</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usuario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuario</em>' attribute.
	 * @see #setUsuario(String)
	 * @see sma.domain.DomainPackage#getUsuario_Usuario()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getUsuario();

	/**
	 * Sets the value of the '{@link sma.domain.Usuario#getUsuario <em>Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usuario</em>' attribute.
	 * @see #getUsuario()
	 * @generated
	 */
	void setUsuario(String value);

	/**
	 * Returns the value of the '<em><b>Contrasenia</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contrasenia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrasenia</em>' attribute.
	 * @see #setContrasenia(String)
	 * @see sma.domain.DomainPackage#getUsuario_Contrasenia()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getContrasenia();

	/**
	 * Sets the value of the '{@link sma.domain.Usuario#getContrasenia <em>Contrasenia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrasenia</em>' attribute.
	 * @see #getContrasenia()
	 * @generated
	 */
	void setContrasenia(String value);

	/**
	 * Returns the value of the '<em><b>Automoviles</b></em>' reference list.
	 * The list contents are of type {@link sma.domain.Automovil}.
	 * It is bidirectional and its opposite is '{@link sma.domain.Automovil#getPropietario <em>Propietario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automoviles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automoviles</em>' reference list.
	 * @see sma.domain.DomainPackage#getUsuario_Automoviles()
	 * @see sma.domain.Automovil#getPropietario
	 * @model opposite="propietario"
	 * @generated
	 */
	EList<Automovil> getAutomoviles();

	/**
	 * Returns the value of the '<em><b>Ubicacion</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.domain.UbicacionUsu#getOwnerBy <em>Owner By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ubicacion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ubicacion</em>' containment reference.
	 * @see #setUbicacion(UbicacionUsu)
	 * @see sma.domain.DomainPackage#getUsuario_Ubicacion()
	 * @see sma.domain.UbicacionUsu#getOwnerBy
	 * @model opposite="ownerBy" containment="true"
	 * @generated
	 */
	UbicacionUsu getUbicacion();

	/**
	 * Sets the value of the '{@link sma.domain.Usuario#getUbicacion <em>Ubicacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ubicacion</em>' containment reference.
	 * @see #getUbicacion()
	 * @generated
	 */
	void setUbicacion(UbicacionUsu value);

} // Usuario
