/**
 */
package sma.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import sma.domain.automatizacionrevision.FallaMecanica;
import sma.domain.automatizacionrevision.sensor;

import sma.domain.reparacionvehiculo.Reparacion;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automovil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.domain.Automovil#getId <em>Id</em>}</li>
 *   <li>{@link sma.domain.Automovil#getPlaca <em>Placa</em>}</li>
 *   <li>{@link sma.domain.Automovil#getMarca <em>Marca</em>}</li>
 *   <li>{@link sma.domain.Automovil#getModelo <em>Modelo</em>}</li>
 *   <li>{@link sma.domain.Automovil#getReferencia <em>Referencia</em>}</li>
 *   <li>{@link sma.domain.Automovil#getTipoUso <em>Tipo Uso</em>}</li>
 *   <li>{@link sma.domain.Automovil#getReparacionesHechas <em>Reparaciones Hechas</em>}</li>
 *   <li>{@link sma.domain.Automovil#getSensor <em>Sensor</em>}</li>
 *   <li>{@link sma.domain.Automovil#getPropietario <em>Propietario</em>}</li>
 *   <li>{@link sma.domain.Automovil#getListaDeFallas <em>Lista De Fallas</em>}</li>
 * </ul>
 *
 * @see sma.domain.DomainPackage#getAutomovil()
 * @model
 * @generated
 */
public interface Automovil extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see sma.domain.DomainPackage#getAutomovil_Id()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link sma.domain.Automovil#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Placa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placa</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placa</em>' attribute.
	 * @see #setPlaca(String)
	 * @see sma.domain.DomainPackage#getAutomovil_Placa()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getPlaca();

	/**
	 * Sets the value of the '{@link sma.domain.Automovil#getPlaca <em>Placa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placa</em>' attribute.
	 * @see #getPlaca()
	 * @generated
	 */
	void setPlaca(String value);

	/**
	 * Returns the value of the '<em><b>Marca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marca</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marca</em>' attribute.
	 * @see #setMarca(String)
	 * @see sma.domain.DomainPackage#getAutomovil_Marca()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getMarca();

	/**
	 * Sets the value of the '{@link sma.domain.Automovil#getMarca <em>Marca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marca</em>' attribute.
	 * @see #getMarca()
	 * @generated
	 */
	void setMarca(String value);

	/**
	 * Returns the value of the '<em><b>Modelo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelo</em>' attribute.
	 * @see #setModelo(Integer)
	 * @see sma.domain.DomainPackage#getAutomovil_Modelo()
	 * @model dataType="sma.EIntegerObject"
	 * @generated
	 */
	Integer getModelo();

	/**
	 * Sets the value of the '{@link sma.domain.Automovil#getModelo <em>Modelo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modelo</em>' attribute.
	 * @see #getModelo()
	 * @generated
	 */
	void setModelo(Integer value);

	/**
	 * Returns the value of the '<em><b>Referencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referencia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencia</em>' attribute.
	 * @see #setReferencia(String)
	 * @see sma.domain.DomainPackage#getAutomovil_Referencia()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getReferencia();

	/**
	 * Sets the value of the '{@link sma.domain.Automovil#getReferencia <em>Referencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referencia</em>' attribute.
	 * @see #getReferencia()
	 * @generated
	 */
	void setReferencia(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Uso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Uso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Uso</em>' attribute.
	 * @see #setTipoUso(String)
	 * @see sma.domain.DomainPackage#getAutomovil_TipoUso()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getTipoUso();

	/**
	 * Sets the value of the '{@link sma.domain.Automovil#getTipoUso <em>Tipo Uso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Uso</em>' attribute.
	 * @see #getTipoUso()
	 * @generated
	 */
	void setTipoUso(String value);

	/**
	 * Returns the value of the '<em><b>Reparaciones Hechas</b></em>' reference list.
	 * The list contents are of type {@link sma.domain.reparacionvehiculo.Reparacion}.
	 * It is bidirectional and its opposite is '{@link sma.domain.reparacionvehiculo.Reparacion#getTheAutomovil <em>The Automovil</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reparaciones Hechas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reparaciones Hechas</em>' reference list.
	 * @see sma.domain.DomainPackage#getAutomovil_ReparacionesHechas()
	 * @see sma.domain.reparacionvehiculo.Reparacion#getTheAutomovil
	 * @model opposite="theAutomovil"
	 * @generated
	 */
	EList<Reparacion> getReparacionesHechas();

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sma.domain.automatizacionrevision.sensor#getOwnerBy <em>Owner By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' containment reference.
	 * @see #setSensor(sensor)
	 * @see sma.domain.DomainPackage#getAutomovil_Sensor()
	 * @see sma.domain.automatizacionrevision.sensor#getOwnerBy
	 * @model opposite="ownerBy" containment="true"
	 * @generated
	 */
	sensor getSensor();

	/**
	 * Sets the value of the '{@link sma.domain.Automovil#getSensor <em>Sensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' containment reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(sensor value);

	/**
	 * Returns the value of the '<em><b>Propietario</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sma.domain.Usuario#getAutomoviles <em>Automoviles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propietario</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propietario</em>' reference.
	 * @see #setPropietario(Usuario)
	 * @see sma.domain.DomainPackage#getAutomovil_Propietario()
	 * @see sma.domain.Usuario#getAutomoviles
	 * @model opposite="automoviles"
	 * @generated
	 */
	Usuario getPropietario();

	/**
	 * Sets the value of the '{@link sma.domain.Automovil#getPropietario <em>Propietario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propietario</em>' reference.
	 * @see #getPropietario()
	 * @generated
	 */
	void setPropietario(Usuario value);

	/**
	 * Returns the value of the '<em><b>Lista De Fallas</b></em>' containment reference list.
	 * The list contents are of type {@link sma.domain.automatizacionrevision.FallaMecanica}.
	 * It is bidirectional and its opposite is '{@link sma.domain.automatizacionrevision.FallaMecanica#getTheAutomovil <em>The Automovil</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista De Fallas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista De Fallas</em>' containment reference list.
	 * @see sma.domain.DomainPackage#getAutomovil_ListaDeFallas()
	 * @see sma.domain.automatizacionrevision.FallaMecanica#getTheAutomovil
	 * @model opposite="theAutomovil" containment="true"
	 * @generated
	 */
	EList<FallaMecanica> getListaDeFallas();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='//TODO asignarFallas'"
	 * @generated
	 */
	void asignarFallas();

} // Automovil
