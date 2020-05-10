/**
 */
package sma.domain.automatizacionrevision;

import org.eclipse.emf.ecore.EObject;

import sma.domain.Automovil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Falla Mecanica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sma.domain.automatizacionrevision.FallaMecanica#getPiesaAveriada <em>Piesa Averiada</em>}</li>
 *   <li>{@link sma.domain.automatizacionrevision.FallaMecanica#getGravedad <em>Gravedad</em>}</li>
 *   <li>{@link sma.domain.automatizacionrevision.FallaMecanica#getOrigen <em>Origen</em>}</li>
 *   <li>{@link sma.domain.automatizacionrevision.FallaMecanica#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link sma.domain.automatizacionrevision.FallaMecanica#getTheAutomovil <em>The Automovil</em>}</li>
 * </ul>
 *
 * @see sma.domain.automatizacionrevision.AutomatizacionrevisionPackage#getFallaMecanica()
 * @model
 * @generated
 */
public interface FallaMecanica extends EObject {
	/**
	 * Returns the value of the '<em><b>Piesa Averiada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Piesa Averiada</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piesa Averiada</em>' attribute.
	 * @see #setPiesaAveriada(String)
	 * @see sma.domain.automatizacionrevision.AutomatizacionrevisionPackage#getFallaMecanica_PiesaAveriada()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getPiesaAveriada();

	/**
	 * Sets the value of the '{@link sma.domain.automatizacionrevision.FallaMecanica#getPiesaAveriada <em>Piesa Averiada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Piesa Averiada</em>' attribute.
	 * @see #getPiesaAveriada()
	 * @generated
	 */
	void setPiesaAveriada(String value);

	/**
	 * Returns the value of the '<em><b>Gravedad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gravedad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gravedad</em>' attribute.
	 * @see #setGravedad(String)
	 * @see sma.domain.automatizacionrevision.AutomatizacionrevisionPackage#getFallaMecanica_Gravedad()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getGravedad();

	/**
	 * Sets the value of the '{@link sma.domain.automatizacionrevision.FallaMecanica#getGravedad <em>Gravedad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gravedad</em>' attribute.
	 * @see #getGravedad()
	 * @generated
	 */
	void setGravedad(String value);

	/**
	 * Returns the value of the '<em><b>Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' attribute.
	 * @see #setOrigen(String)
	 * @see sma.domain.automatizacionrevision.AutomatizacionrevisionPackage#getFallaMecanica_Origen()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getOrigen();

	/**
	 * Sets the value of the '{@link sma.domain.automatizacionrevision.FallaMecanica#getOrigen <em>Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' attribute.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(String value);

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see sma.domain.automatizacionrevision.AutomatizacionrevisionPackage#getFallaMecanica_Descripcion()
	 * @model dataType="sma.String"
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link sma.domain.automatizacionrevision.FallaMecanica#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>The Automovil</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sma.domain.Automovil#getListaDeFallas <em>Lista De Fallas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Automovil</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Automovil</em>' container reference.
	 * @see #setTheAutomovil(Automovil)
	 * @see sma.domain.automatizacionrevision.AutomatizacionrevisionPackage#getFallaMecanica_TheAutomovil()
	 * @see sma.domain.Automovil#getListaDeFallas
	 * @model opposite="listaDeFallas" transient="false"
	 * @generated
	 */
	Automovil getTheAutomovil();

	/**
	 * Sets the value of the '{@link sma.domain.automatizacionrevision.FallaMecanica#getTheAutomovil <em>The Automovil</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Automovil</em>' container reference.
	 * @see #getTheAutomovil()
	 * @generated
	 */
	void setTheAutomovil(Automovil value);

} // FallaMecanica
