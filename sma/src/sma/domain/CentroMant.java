/**
 */
package sma.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import sma.domain.reparacionvehiculo.Reparacion;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Centro Mant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.domain.CentroMant#getId <em>Id</em>}</li>
 *   <li>{@link sma.domain.CentroMant#getNombre <em>Nombre</em>}</li>
 *   <li>{@link sma.domain.CentroMant#getNombreRepresentante <em>Nombre Representante</em>}</li>
 *   <li>{@link sma.domain.CentroMant#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link sma.domain.CentroMant#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link sma.domain.CentroMant#getContrasenia <em>Contrasenia</em>}</li>
 *   <li>{@link sma.domain.CentroMant#getUsuariosAtendidos <em>Usuarios Atendidos</em>}</li>
 *   <li>{@link sma.domain.CentroMant#getHistorialReparacion <em>Historial Reparacion</em>}</li>
 *   <li>{@link sma.domain.CentroMant#getOwnedByDomain <em>Owned By Domain</em>}</li>
 *   <li>{@link sma.domain.CentroMant#getUbicacion <em>Ubicacion</em>}</li>
 * </ul>
 *
 * @see sma.domain.DomainPackage#getCentroMant()
 * @model
 * @generated
 */
public interface CentroMant extends EObject {
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
	 * @see sma.domain.DomainPackage#getCentroMant_Id()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link sma.domain.CentroMant#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see sma.domain.DomainPackage#getCentroMant_Nombre()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link sma.domain.CentroMant#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Nombre Representante</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Representante</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Representante</em>' attribute.
	 * @see #setNombreRepresentante(String)
	 * @see sma.domain.DomainPackage#getCentroMant_NombreRepresentante()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getNombreRepresentante();

	/**
	 * Sets the value of the '{@link sma.domain.CentroMant#getNombreRepresentante <em>Nombre Representante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Representante</em>' attribute.
	 * @see #getNombreRepresentante()
	 * @generated
	 */
	void setNombreRepresentante(String value);

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
	 * @see sma.domain.DomainPackage#getCentroMant_Descripcion()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link sma.domain.CentroMant#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

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
	 * @see sma.domain.DomainPackage#getCentroMant_Usuario()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getUsuario();

	/**
	 * Sets the value of the '{@link sma.domain.CentroMant#getUsuario <em>Usuario</em>}' attribute.
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
	 * @see sma.domain.DomainPackage#getCentroMant_Contrasenia()
	 * @model default=" " dataType="sma.String"
	 * @generated
	 */
	String getContrasenia();

	/**
	 * Sets the value of the '{@link sma.domain.CentroMant#getContrasenia <em>Contrasenia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrasenia</em>' attribute.
	 * @see #getContrasenia()
	 * @generated
	 */
	void setContrasenia(String value);

	/**
	 * Returns the value of the '<em><b>Usuarios Atendidos</b></em>' reference list.
	 * The list contents are of type {@link sma.domain.Usuario}.
	 * It is bidirectional and its opposite is '{@link sma.domain.Usuario#getCentroMant <em>Centro Mant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usuarios Atendidos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuarios Atendidos</em>' reference list.
	 * @see sma.domain.DomainPackage#getCentroMant_UsuariosAtendidos()
	 * @see sma.domain.Usuario#getCentroMant
	 * @model opposite="CentroMant"
	 * @generated
	 */
	EList<Usuario> getUsuariosAtendidos();

	/**
	 * Returns the value of the '<em><b>Historial Reparacion</b></em>' containment reference list.
	 * The list contents are of type {@link sma.domain.reparacionvehiculo.Reparacion}.
	 * It is bidirectional and its opposite is '{@link sma.domain.reparacionvehiculo.Reparacion#getTheCentroMant <em>The Centro Mant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Historial Reparacion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Historial Reparacion</em>' containment reference list.
	 * @see sma.domain.DomainPackage#getCentroMant_HistorialReparacion()
	 * @see sma.domain.reparacionvehiculo.Reparacion#getTheCentroMant
	 * @model opposite="theCentroMant" containment="true"
	 * @generated
	 */
	EList<Reparacion> getHistorialReparacion();

	/**
	 * Returns the value of the '<em><b>Owned By Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.domain.Domain#getListaDeCentMant <em>Lista De Cent Mant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Domain</em>' container reference.
	 * @see #setOwnedByDomain(Domain)
	 * @see sma.domain.DomainPackage#getCentroMant_OwnedByDomain()
	 * @see sma.domain.Domain#getListaDeCentMant
	 * @model opposite="listaDeCentMant" transient="false"
	 * @generated
	 */
	Domain getOwnedByDomain();

	/**
	 * Sets the value of the '{@link sma.domain.CentroMant#getOwnedByDomain <em>Owned By Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Domain</em>' container reference.
	 * @see #getOwnedByDomain()
	 * @generated
	 */
	void setOwnedByDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Ubicacion</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.domain.UbicacionCM#getOwnedBy <em>Owned By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ubicacion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ubicacion</em>' containment reference.
	 * @see #setUbicacion(UbicacionCM)
	 * @see sma.domain.DomainPackage#getCentroMant_Ubicacion()
	 * @see sma.domain.UbicacionCM#getOwnedBy
	 * @model opposite="ownedBy" containment="true"
	 * @generated
	 */
	UbicacionCM getUbicacion();

	/**
	 * Sets the value of the '{@link sma.domain.CentroMant#getUbicacion <em>Ubicacion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ubicacion</em>' containment reference.
	 * @see #getUbicacion()
	 * @generated
	 */
	void setUbicacion(UbicacionCM value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='//TODO procesarSolicitudVisita\n'"
	 * @generated
	 */
	void procesarSolicitudVisita(Automovil automovilReparacion);

} // CentroMant
