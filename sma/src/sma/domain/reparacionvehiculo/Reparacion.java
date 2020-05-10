/**
 */
package sma.domain.reparacionvehiculo;

import org.eclipse.emf.ecore.EObject;

import sma.domain.Automovil;
import sma.domain.CentroMant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reparacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.domain.reparacionvehiculo.Reparacion#getTheAutomovil <em>The Automovil</em>}</li>
 *   <li>{@link sma.domain.reparacionvehiculo.Reparacion#getTheCentroMant <em>The Centro Mant</em>}</li>
 *   <li>{@link sma.domain.reparacionvehiculo.Reparacion#getNombreResponsable <em>Nombre Responsable</em>}</li>
 *   <li>{@link sma.domain.reparacionvehiculo.Reparacion#getEstado <em>Estado</em>}</li>
 *   <li>{@link sma.domain.reparacionvehiculo.Reparacion#getNumeroFallasPredecidas <em>Numero Fallas Predecidas</em>}</li>
 *   <li>{@link sma.domain.reparacionvehiculo.Reparacion#getNumeroFallasAcertadas <em>Numero Fallas Acertadas</em>}</li>
 *   <li>{@link sma.domain.reparacionvehiculo.Reparacion#getFecha <em>Fecha</em>}</li>
 *   <li>{@link sma.domain.reparacionvehiculo.Reparacion#getHora <em>Hora</em>}</li>
 * </ul>
 *
 * @see sma.domain.reparacionvehiculo.ReparacionvehiculoPackage#getReparacion()
 * @model
 * @generated
 */
public interface Reparacion extends EObject {
	/**
	 * Returns the value of the '<em><b>The Automovil</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sma.domain.Automovil#getReparacionesHechas <em>Reparaciones Hechas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Automovil</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Automovil</em>' reference.
	 * @see #setTheAutomovil(Automovil)
	 * @see sma.domain.reparacionvehiculo.ReparacionvehiculoPackage#getReparacion_TheAutomovil()
	 * @see sma.domain.Automovil#getReparacionesHechas
	 * @model opposite="reparacionesHechas"
	 * @generated
	 */
	Automovil getTheAutomovil();

	/**
	 * Sets the value of the '{@link sma.domain.reparacionvehiculo.Reparacion#getTheAutomovil <em>The Automovil</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Automovil</em>' reference.
	 * @see #getTheAutomovil()
	 * @generated
	 */
	void setTheAutomovil(Automovil value);

	/**
	 * Returns the value of the '<em><b>The Centro Mant</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.domain.CentroMant#getHistorialReparacion <em>Historial Reparacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Centro Mant</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Centro Mant</em>' container reference.
	 * @see #setTheCentroMant(CentroMant)
	 * @see sma.domain.reparacionvehiculo.ReparacionvehiculoPackage#getReparacion_TheCentroMant()
	 * @see sma.domain.CentroMant#getHistorialReparacion
	 * @model opposite="historialReparacion" transient="false"
	 * @generated
	 */
	CentroMant getTheCentroMant();

	/**
	 * Sets the value of the '{@link sma.domain.reparacionvehiculo.Reparacion#getTheCentroMant <em>The Centro Mant</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Centro Mant</em>' container reference.
	 * @see #getTheCentroMant()
	 * @generated
	 */
	void setTheCentroMant(CentroMant value);

	/**
	 * Returns the value of the '<em><b>Nombre Responsable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Responsable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Responsable</em>' attribute.
	 * @see #setNombreResponsable(String)
	 * @see sma.domain.reparacionvehiculo.ReparacionvehiculoPackage#getReparacion_NombreResponsable()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getNombreResponsable();

	/**
	 * Sets the value of the '{@link sma.domain.reparacionvehiculo.Reparacion#getNombreResponsable <em>Nombre Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Responsable</em>' attribute.
	 * @see #getNombreResponsable()
	 * @generated
	 */
	void setNombreResponsable(String value);

	/**
	 * Returns the value of the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado</em>' attribute.
	 * @see #setEstado(String)
	 * @see sma.domain.reparacionvehiculo.ReparacionvehiculoPackage#getReparacion_Estado()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link sma.domain.reparacionvehiculo.Reparacion#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

	/**
	 * Returns the value of the '<em><b>Numero Fallas Predecidas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Fallas Predecidas</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Fallas Predecidas</em>' attribute.
	 * @see #setNumeroFallasPredecidas(Integer)
	 * @see sma.domain.reparacionvehiculo.ReparacionvehiculoPackage#getReparacion_NumeroFallasPredecidas()
	 * @model dataType="sma.EIntegerObject"
	 * @generated
	 */
	Integer getNumeroFallasPredecidas();

	/**
	 * Sets the value of the '{@link sma.domain.reparacionvehiculo.Reparacion#getNumeroFallasPredecidas <em>Numero Fallas Predecidas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Fallas Predecidas</em>' attribute.
	 * @see #getNumeroFallasPredecidas()
	 * @generated
	 */
	void setNumeroFallasPredecidas(Integer value);

	/**
	 * Returns the value of the '<em><b>Numero Fallas Acertadas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Fallas Acertadas</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Fallas Acertadas</em>' attribute.
	 * @see #setNumeroFallasAcertadas(Integer)
	 * @see sma.domain.reparacionvehiculo.ReparacionvehiculoPackage#getReparacion_NumeroFallasAcertadas()
	 * @model dataType="sma.EIntegerObject"
	 * @generated
	 */
	Integer getNumeroFallasAcertadas();

	/**
	 * Sets the value of the '{@link sma.domain.reparacionvehiculo.Reparacion#getNumeroFallasAcertadas <em>Numero Fallas Acertadas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Fallas Acertadas</em>' attribute.
	 * @see #getNumeroFallasAcertadas()
	 * @generated
	 */
	void setNumeroFallasAcertadas(Integer value);

	/**
	 * Returns the value of the '<em><b>Fecha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha</em>' attribute.
	 * @see #setFecha(String)
	 * @see sma.domain.reparacionvehiculo.ReparacionvehiculoPackage#getReparacion_Fecha()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getFecha();

	/**
	 * Sets the value of the '{@link sma.domain.reparacionvehiculo.Reparacion#getFecha <em>Fecha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha</em>' attribute.
	 * @see #getFecha()
	 * @generated
	 */
	void setFecha(String value);

	/**
	 * Returns the value of the '<em><b>Hora</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hora</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hora</em>' attribute.
	 * @see #setHora(String)
	 * @see sma.domain.reparacionvehiculo.ReparacionvehiculoPackage#getReparacion_Hora()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getHora();

	/**
	 * Sets the value of the '{@link sma.domain.reparacionvehiculo.Reparacion#getHora <em>Hora</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hora</em>' attribute.
	 * @see #getHora()
	 * @generated
	 */
	void setHora(String value);

} // Reparacion
